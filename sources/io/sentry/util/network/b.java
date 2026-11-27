package io.sentry.util.network;

import defpackage.NG1;
import defpackage.SK;
import io.sentry.ILogger;
import java.io.Serializable;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[io.sentry.vendor.gson.stream.b.values().length];
            a = iArr;
            try {
                iArr[io.sentry.vendor.gson.stream.b.BEGIN_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[io.sentry.vendor.gson.stream.b.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[io.sentry.vendor.gson.stream.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[io.sentry.vendor.gson.stream.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[io.sentry.vendor.gson.stream.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[io.sentry.vendor.gson.stream.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: io.sentry.util.network.b$b, reason: collision with other inner class name */
    public static class C0406b {
        public final a a = new a();

        /* JADX INFO: renamed from: io.sentry.util.network.b$b$a */
        public static class a {

            @Nullable
            public Serializable a;
            public boolean b;
            public boolean c;
        }

        @Nullable
        public final Serializable a(@NotNull io.sentry.vendor.gson.stream.a aVar, int i) {
            a aVar2 = this.a;
            if (!aVar2.c) {
                if (i >= 100) {
                    aVar2.b = true;
                    return null;
                }
                try {
                    switch (a.a[aVar.peek().ordinal()]) {
                        case 1:
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            try {
                                aVar.X0();
                                while (aVar.hasNext() && !aVar2.c) {
                                    linkedHashMap.put(aVar.x0(), a(aVar, i + 1));
                                }
                                aVar.B0();
                                return linkedHashMap;
                            } catch (Exception unused) {
                                aVar2.c = true;
                                return linkedHashMap;
                            }
                        case 2:
                            ArrayList arrayList = new ArrayList();
                            try {
                                aVar.l1();
                                while (aVar.hasNext() && !aVar2.c) {
                                    arrayList.add(a(aVar, i + 1));
                                }
                                aVar.h1();
                                return arrayList;
                            } catch (Exception unused2) {
                                aVar2.c = true;
                                return arrayList;
                            }
                        case 3:
                            return aVar.B();
                        case 4:
                            return Double.valueOf(aVar.d0());
                        case 5:
                            return Boolean.valueOf(aVar.p());
                        case 6:
                            aVar.t();
                            return null;
                        default:
                            aVar2.c = true;
                            return null;
                    }
                } catch (Exception unused3) {
                    aVar2.c = true;
                }
                aVar2.c = true;
            }
            return null;
        }
    }

    @Nullable
    public static io.sentry.util.network.a a(@Nullable byte[] bArr, @Nullable String str, @Nullable String str2, @NotNull ILogger iLogger) {
        if (bArr.length == 0) {
            return null;
        }
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            if (lowerCase.contains("image/") || lowerCase.contains("video/") || lowerCase.contains("audio/") || lowerCase.contains("application/octet-stream") || lowerCase.contains("application/pdf") || lowerCase.contains("application/zip") || lowerCase.contains("application/gzip")) {
                return new io.sentry.util.network.a("[Binary data, " + bArr.length + " bytes, type: " + str + "]", null);
            }
        }
        try {
            return b(new String(bArr, 0, Math.min(bArr.length, 153600), str2), str, bArr.length > 153600, iLogger);
        } catch (UnsupportedEncodingException e) {
            iLogger.a(NG1.WARNING, "Failed to decode bytes: " + e.getMessage(), new Object[0]);
            return new io.sentry.util.network.a(SK.b(new StringBuilder("[Failed to decode bytes, "), bArr.length, " bytes]"), Collections.singletonList(io.sentry.util.network.a.EnumC0405a.BODY_PARSE_ERROR));
        }
    }

    @Nullable
    public static io.sentry.util.network.a b(@Nullable String str, @Nullable String str2, boolean z, @Nullable ILogger iLogger) {
        if (str.isEmpty()) {
            return null;
        }
        if (str2 != null) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (lowerCase.contains("application/x-www-form-urlencoded")) {
                try {
                    HashMap map = new HashMap();
                    for (String str3 : str.split("&", -1)) {
                        int iIndexOf = str3.indexOf("=");
                        if (iIndexOf > 0) {
                            String strDecode = URLDecoder.decode(str3.substring(0, iIndexOf), "UTF-8");
                            String strDecode2 = iIndexOf < str3.length() + (-1) ? URLDecoder.decode(str3.substring(iIndexOf + 1), "UTF-8") : "";
                            if (map.containsKey(strDecode)) {
                                Object obj = map.get(strDecode);
                                if (obj instanceof List) {
                                    ((List) obj).add(strDecode2);
                                } else {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add((String) obj);
                                    arrayList.add(strDecode2);
                                    map.put(strDecode, arrayList);
                                }
                            } else {
                                map.put(strDecode, strDecode2);
                            }
                        }
                    }
                    return new io.sentry.util.network.a(map, z ? Collections.singletonList(io.sentry.util.network.a.EnumC0405a.TEXT_TRUNCATED) : null);
                } catch (UnsupportedEncodingException e) {
                    if (iLogger != null) {
                        iLogger.a(NG1.WARNING, "Failed to parse form data: " + e.getMessage(), new Object[0]);
                    }
                    return new io.sentry.util.network.a(null, Collections.singletonList(io.sentry.util.network.a.EnumC0405a.BODY_PARSE_ERROR));
                }
            }
            if (lowerCase.contains("application/json")) {
                try {
                    io.sentry.vendor.gson.stream.a aVar = new io.sentry.vendor.gson.stream.a(new StringReader(str));
                    try {
                        C0406b c0406b = new C0406b();
                        Serializable serializableA = c0406b.a(aVar, 0);
                        C0406b.a aVar2 = c0406b.a;
                        aVar2.a = serializableA;
                        if (serializableA == null && !z && !aVar2.c && !aVar2.b) {
                            io.sentry.util.network.a aVar3 = new io.sentry.util.network.a(null, null);
                            aVar.close();
                            return aVar3;
                        }
                        io.sentry.util.network.a aVar4 = new io.sentry.util.network.a(serializableA, (z || aVar2.b) ? Collections.singletonList(io.sentry.util.network.a.EnumC0405a.JSON_TRUNCATED) : aVar2.c ? Collections.singletonList(io.sentry.util.network.a.EnumC0405a.INVALID_JSON) : null);
                        aVar.close();
                        return aVar4;
                    } catch (Throwable th) {
                        try {
                            aVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    if (iLogger != null) {
                        iLogger.a(NG1.WARNING, "Failed to parse JSON: " + e2.getMessage(), new Object[0]);
                    }
                    return new io.sentry.util.network.a(null, Collections.singletonList(io.sentry.util.network.a.EnumC0405a.INVALID_JSON));
                }
            }
        }
        return new io.sentry.util.network.a(str, z ? Collections.singletonList(io.sentry.util.network.a.EnumC0405a.TEXT_TRUNCATED) : null);
    }
}
