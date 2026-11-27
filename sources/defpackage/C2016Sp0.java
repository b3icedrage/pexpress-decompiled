package defpackage;

import j$.util.DesugarTimeZone;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Sp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2016Sp0 implements Closeable {

    @NotNull
    public final HttpURLConnection d;

    @Nullable
    public final OutputStream e;
    public String g;
    public String h;
    public String i;

    @Nullable
    public Integer j;

    @Nullable
    public R00 k;
    public InterfaceC1013Ft1 l;
    public final /* synthetic */ HttpURLConnection m;
    public final /* synthetic */ C2094Tp0 n;

    public C2016Sp0(HttpURLConnection connection, OutputStream outputStream, C2094Tp0 c2094Tp0) {
        this.m = connection;
        this.n = c2094Tp0;
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.d = connection;
        this.e = outputStream;
    }

    public final void c() {
        this.d.disconnect();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStreamA;
        OutputStream outputStream = this.e;
        C2094Tp0 c2094Tp0 = this.n;
        try {
            c2094Tp0.a.getClass();
            Intrinsics.checkNotNullParameter("f85374691559c6d41e766cab7118bc7c", "apiKey");
            this.g = "f85374691559c6d41e766cab7118bc7c";
            long jCurrentTimeMillis = System.currentTimeMillis();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            String clientUploadTime = simpleDateFormat.format(new Date(jCurrentTimeMillis));
            Intrinsics.checkNotNullExpressionValue(clientUploadTime, "sdf.format(Date(currentTimeMillis))");
            Intrinsics.checkNotNullParameter(clientUploadTime, "clientUploadTime");
            this.h = clientUploadTime;
            c2094Tp0.a.getClass();
            XL xl = 0;
            this.j = null;
            f();
            if (outputStream != null) {
                outputStream.close();
            }
            try {
                int responseCode = this.m.getResponseCode();
                try {
                    inputStreamA = C2094Tp0.a(this.d);
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamA, Charsets.UTF_8), 8192);
                        try {
                            String strN = C0648Bc.n(bufferedReader);
                            bufferedReader.close();
                            InterfaceC1013Ft1 interfaceC1013Ft1D = C8056za.d(responseCode, strN);
                            Intrinsics.checkNotNullParameter(interfaceC1013Ft1D, "<set-?>");
                            this.l = interfaceC1013Ft1D;
                            if (inputStreamA != null) {
                                inputStreamA.close();
                            }
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                C6621sj.b(bufferedReader, th);
                                throw th2;
                            }
                        }
                    } catch (IOException unused) {
                        InterfaceC1013Ft1 interfaceC1013Ft1D2 = C8056za.d(408, null);
                        Intrinsics.checkNotNullParameter(interfaceC1013Ft1D2, "<set-?>");
                        this.l = interfaceC1013Ft1D2;
                        if (inputStreamA != null) {
                        }
                        c();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                    }
                } catch (IOException unused2) {
                    inputStreamA = null;
                } catch (Throwable th3) {
                    th = th3;
                    if (xl != 0) {
                        xl.close();
                    }
                    throw th;
                }
                c();
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (Throwable th4) {
                th = th4;
                xl = "clientUploadTime";
            }
        } catch (Throwable th5) {
            c();
            if (outputStream != null) {
                outputStream.close();
            }
            throw th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0067  */
    /* JADX WARN: Code duplicated, block: B:21:0x006f  */
    /* JADX WARN: Code duplicated, block: B:23:0x007f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0088  */
    /* JADX WARN: Code duplicated, block: B:27:0x0090  */
    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d0  */
    public final void f() throws IOException {
        R00 r00;
        List<String> list;
        String strValueOf;
        LinkedHashMap linkedHashMap;
        List<String> list2;
        Set<String> set;
        List<String> list3;
        OutputStream outputStream = this.e;
        if (outputStream != null) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder("{\"api_key\":\"");
            String str = this.g;
            if (str == null) {
                Intrinsics.l("apiKey");
                throw null;
            }
            sb2.append(str);
            sb2.append("\",\"client_upload_time\":\"");
            String str2 = this.h;
            if (str2 == null) {
                Intrinsics.l("clientUploadTime");
                throw null;
            }
            sb2.append(str2);
            sb2.append("\",\"events\":");
            String str3 = this.i;
            if (str3 == null) {
                Intrinsics.l("events");
                throw null;
            }
            sb2.append(str3);
            sb.append(sb2.toString());
            if (this.j != null) {
                sb.append(",\"options\":{\"min_id_length\":" + this.j + '}');
            }
            R00 r01 = this.k;
            if (r01 != null) {
                Intrinsics.checkNotNull(r01);
                List<String> list4 = r01.a;
                if (list4 != null) {
                    Intrinsics.checkNotNull(list4);
                    if (!list4.isEmpty()) {
                        StringBuilder sb3 = new StringBuilder(",\"request_metadata\":{\"sdk\":");
                        r00 = this.k;
                        Intrinsics.checkNotNull(r00);
                        list = r00.a;
                        if (list != null) {
                            Intrinsics.checkNotNull(list);
                            if (!list.isEmpty()) {
                                linkedHashMap = new LinkedHashMap();
                                list2 = r00.a;
                                if (list2 != null) {
                                    Intrinsics.checkNotNull(list2);
                                    if (!list2.isEmpty()) {
                                        List<String> list5 = r00.a;
                                        Intrinsics.checkNotNull(list5);
                                        linkedHashMap.put("malformed_events", list5);
                                    }
                                }
                                set = r00.b;
                                if (!set.isEmpty()) {
                                    linkedHashMap.put("error_logs", CollectionsKt.e0(set));
                                }
                                strValueOf = String.valueOf(ID0.c(linkedHashMap));
                                list3 = r00.a;
                                if (list3 != null) {
                                    list3.clear();
                                }
                                set.clear();
                            } else if (r00.b.isEmpty()) {
                                strValueOf = "";
                            } else {
                                linkedHashMap = new LinkedHashMap();
                                list2 = r00.a;
                                if (list2 != null) {
                                    Intrinsics.checkNotNull(list2);
                                    if (!list2.isEmpty()) {
                                        List<String> list6 = r00.a;
                                        Intrinsics.checkNotNull(list6);
                                        linkedHashMap.put("malformed_events", list6);
                                    }
                                }
                                set = r00.b;
                                if (!set.isEmpty()) {
                                    linkedHashMap.put("error_logs", CollectionsKt.e0(set));
                                }
                                strValueOf = String.valueOf(ID0.c(linkedHashMap));
                                list3 = r00.a;
                                if (list3 != null) {
                                    list3.clear();
                                }
                                set.clear();
                            }
                        } else if (r00.b.isEmpty()) {
                            linkedHashMap = new LinkedHashMap();
                            list2 = r00.a;
                            if (list2 != null) {
                                Intrinsics.checkNotNull(list2);
                                if (!list2.isEmpty()) {
                                    List<String> list7 = r00.a;
                                    Intrinsics.checkNotNull(list7);
                                    linkedHashMap.put("malformed_events", list7);
                                }
                            }
                            set = r00.b;
                            if (!set.isEmpty()) {
                                linkedHashMap.put("error_logs", CollectionsKt.e0(set));
                            }
                            strValueOf = String.valueOf(ID0.c(linkedHashMap));
                            list3 = r00.a;
                            if (list3 != null) {
                                list3.clear();
                            }
                            set.clear();
                        } else {
                            strValueOf = "";
                        }
                        sb3.append(strValueOf);
                        sb3.append('}');
                        sb.append(sb3.toString());
                    } else if (!r01.b.isEmpty()) {
                        StringBuilder sb4 = new StringBuilder(",\"request_metadata\":{\"sdk\":");
                        r00 = this.k;
                        Intrinsics.checkNotNull(r00);
                        list = r00.a;
                        if (list != null) {
                            Intrinsics.checkNotNull(list);
                            if (!list.isEmpty()) {
                                linkedHashMap = new LinkedHashMap();
                                list2 = r00.a;
                                if (list2 != null) {
                                    Intrinsics.checkNotNull(list2);
                                    if (!list2.isEmpty()) {
                                        List<String> list8 = r00.a;
                                        Intrinsics.checkNotNull(list8);
                                        linkedHashMap.put("malformed_events", list8);
                                    }
                                }
                                set = r00.b;
                                if (!set.isEmpty()) {
                                    linkedHashMap.put("error_logs", CollectionsKt.e0(set));
                                }
                                strValueOf = String.valueOf(ID0.c(linkedHashMap));
                                list3 = r00.a;
                                if (list3 != null) {
                                    list3.clear();
                                }
                                set.clear();
                            } else if (r00.b.isEmpty()) {
                                linkedHashMap = new LinkedHashMap();
                                list2 = r00.a;
                                if (list2 != null) {
                                    Intrinsics.checkNotNull(list2);
                                    if (!list2.isEmpty()) {
                                        List<String> list9 = r00.a;
                                        Intrinsics.checkNotNull(list9);
                                        linkedHashMap.put("malformed_events", list9);
                                    }
                                }
                                set = r00.b;
                                if (!set.isEmpty()) {
                                    linkedHashMap.put("error_logs", CollectionsKt.e0(set));
                                }
                                strValueOf = String.valueOf(ID0.c(linkedHashMap));
                                list3 = r00.a;
                                if (list3 != null) {
                                    list3.clear();
                                }
                                set.clear();
                            } else {
                                strValueOf = "";
                            }
                        } else if (r00.b.isEmpty()) {
                            linkedHashMap = new LinkedHashMap();
                            list2 = r00.a;
                            if (list2 != null) {
                                Intrinsics.checkNotNull(list2);
                                if (!list2.isEmpty()) {
                                    List<String> list10 = r00.a;
                                    Intrinsics.checkNotNull(list10);
                                    linkedHashMap.put("malformed_events", list10);
                                }
                            }
                            set = r00.b;
                            if (!set.isEmpty()) {
                                linkedHashMap.put("error_logs", CollectionsKt.e0(set));
                            }
                            strValueOf = String.valueOf(ID0.c(linkedHashMap));
                            list3 = r00.a;
                            if (list3 != null) {
                                list3.clear();
                            }
                            set.clear();
                        } else {
                            strValueOf = "";
                        }
                        sb4.append(strValueOf);
                        sb4.append('}');
                        sb.append(sb4.toString());
                    }
                } else if (!r01.b.isEmpty()) {
                    StringBuilder sb5 = new StringBuilder(",\"request_metadata\":{\"sdk\":");
                    r00 = this.k;
                    Intrinsics.checkNotNull(r00);
                    list = r00.a;
                    if (list != null) {
                        Intrinsics.checkNotNull(list);
                        if (!list.isEmpty()) {
                            linkedHashMap = new LinkedHashMap();
                            list2 = r00.a;
                            if (list2 != null) {
                                Intrinsics.checkNotNull(list2);
                                if (!list2.isEmpty()) {
                                    List<String> list11 = r00.a;
                                    Intrinsics.checkNotNull(list11);
                                    linkedHashMap.put("malformed_events", list11);
                                }
                            }
                            set = r00.b;
                            if (!set.isEmpty()) {
                                linkedHashMap.put("error_logs", CollectionsKt.e0(set));
                            }
                            strValueOf = String.valueOf(ID0.c(linkedHashMap));
                            list3 = r00.a;
                            if (list3 != null) {
                                list3.clear();
                            }
                            set.clear();
                        } else if (r00.b.isEmpty()) {
                            linkedHashMap = new LinkedHashMap();
                            list2 = r00.a;
                            if (list2 != null) {
                                Intrinsics.checkNotNull(list2);
                                if (!list2.isEmpty()) {
                                    List<String> list12 = r00.a;
                                    Intrinsics.checkNotNull(list12);
                                    linkedHashMap.put("malformed_events", list12);
                                }
                            }
                            set = r00.b;
                            if (!set.isEmpty()) {
                                linkedHashMap.put("error_logs", CollectionsKt.e0(set));
                            }
                            strValueOf = String.valueOf(ID0.c(linkedHashMap));
                            list3 = r00.a;
                            if (list3 != null) {
                                list3.clear();
                            }
                            set.clear();
                        } else {
                            strValueOf = "";
                        }
                    } else if (r00.b.isEmpty()) {
                        linkedHashMap = new LinkedHashMap();
                        list2 = r00.a;
                        if (list2 != null) {
                            Intrinsics.checkNotNull(list2);
                            if (!list2.isEmpty()) {
                                List<String> list13 = r00.a;
                                Intrinsics.checkNotNull(list13);
                                linkedHashMap.put("malformed_events", list13);
                            }
                        }
                        set = r00.b;
                        if (!set.isEmpty()) {
                            linkedHashMap.put("error_logs", CollectionsKt.e0(set));
                        }
                        strValueOf = String.valueOf(ID0.c(linkedHashMap));
                        list3 = r00.a;
                        if (list3 != null) {
                            list3.clear();
                        }
                        set.clear();
                    } else {
                        strValueOf = "";
                    }
                    sb5.append(strValueOf);
                    sb5.append('}');
                    sb.append(sb5.toString());
                }
            }
            sb.append("}");
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
            byte[] bytes = string.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes, 0, bytes.length);
        }
    }
}
