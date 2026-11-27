package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import defpackage.C5059lI;
import defpackage.C5272mI;
import defpackage.C7232ve0;
import defpackage.C7653xe0;
import defpackage.C7863ye0;
import defpackage.InterfaceC1612Nk1;
import defpackage.InterfaceC2400Xd0;
import defpackage.InterfaceC5746oa;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final long j = TimeUnit.HOURS.toSeconds(12);
    public static final int[] k = {2, 4, 8, 16, 32, 64, UserVerificationMethods.USER_VERIFY_PATTERN, UserVerificationMethods.USER_VERIFY_HANDPRINT};
    public final InterfaceC2400Xd0 a;
    public final InterfaceC1612Nk1<InterfaceC5746oa> b;
    public final Executor c;
    public final Clock d;
    public final Random e;
    public final C5059lI f;
    public final ConfigFetchHttpClient g;
    public final b h;
    public final HashMap i;

    /* JADX INFO: renamed from: com.google.firebase.remoteconfig.internal.a$a, reason: collision with other inner class name */
    public static class C0317a {
        public final int a;
        public final C5272mI b;
        public final String c;

        public C0317a(int i, C5272mI c5272mI, String str) {
            this.a = i;
            this.b = c5272mI;
            this.c = str;
        }
    }

    public a(InterfaceC2400Xd0 interfaceC2400Xd0, InterfaceC1612Nk1 interfaceC1612Nk1, Executor executor, Clock clock, Random random, C5059lI c5059lI, ConfigFetchHttpClient configFetchHttpClient, b bVar, HashMap map) {
        this.a = interfaceC2400Xd0;
        this.b = interfaceC1612Nk1;
        this.c = executor;
        this.d = clock;
        this.e = random;
        this.f = c5059lI;
        this.g = configFetchHttpClient;
        this.h = bVar;
        this.i = map;
    }

    public final C0317a a(String str, String str2, Date date) throws C7232ve0, C7653xe0, C7863ye0 {
        Date date2;
        String str3;
        try {
            HttpURLConnection httpURLConnectionB = this.g.b();
            ConfigFetchHttpClient configFetchHttpClient = this.g;
            HashMap mapB = b();
            String string = this.h.a.getString("last_fetch_etag", null);
            HashMap map = this.i;
            InterfaceC5746oa interfaceC5746oa = this.b.get();
            date2 = date;
            try {
                C0317a c0317aFetch = configFetchHttpClient.fetch(httpURLConnectionB, str, str2, mapB, string, map, interfaceC5746oa != null ? (Long) interfaceC5746oa.a(true).get("_fot") : null, date2);
                String str4 = c0317aFetch.c;
                if (str4 != null) {
                    b bVar = this.h;
                    synchronized (bVar.b) {
                        bVar.a.edit().putString("last_fetch_etag", str4).apply();
                    }
                }
                this.h.b(0, b.e);
                return c0317aFetch;
            } catch (C7863ye0 e) {
                e = e;
                C7863ye0 c7863ye0 = e;
                int i = c7863ye0.d;
                b bVar2 = this.h;
                if (i == 429 || i == 502 || i == 503 || i == 504) {
                    int i2 = bVar2.a().a + 1;
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    int[] iArr = k;
                    long millis = timeUnit.toMillis(iArr[Math.min(i2, iArr.length) - 1]);
                    bVar2.b(i2, new Date(date2.getTime() + (millis / 2) + ((long) this.e.nextInt((int) millis))));
                }
                b.a aVarA = bVar2.a();
                int i3 = c7863ye0.d;
                if (aVarA.a > 1 || i3 == 429) {
                    aVarA.b.getTime();
                    throw new C7653xe0("Fetch was throttled.");
                }
                if (i3 == 401) {
                    str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
                } else if (i3 == 403) {
                    str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
                } else {
                    if (i3 == 429) {
                        throw new C7232ve0("The throttled response from the server was not handled correctly by the FRC SDK.");
                    }
                    if (i3 != 500) {
                        switch (i3) {
                            case 502:
                            case 503:
                            case 504:
                                str3 = "The server is unavailable. Please try again later.";
                                break;
                            default:
                                str3 = "The server returned an unexpected error.";
                                break;
                        }
                    } else {
                        str3 = "There was an internal server error.";
                    }
                }
                throw new C7863ye0(c7863ye0.d, "Fetch failed: ".concat(str3), c7863ye0);
            }
        } catch (C7863ye0 e2) {
            e = e2;
            date2 = date;
        }
    }

    public final HashMap b() {
        HashMap map = new HashMap();
        InterfaceC5746oa interfaceC5746oa = this.b.get();
        if (interfaceC5746oa != null) {
            for (Map.Entry<String, Object> entry : interfaceC5746oa.a(false).entrySet()) {
                map.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return map;
    }
}
