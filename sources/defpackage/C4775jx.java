package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: jx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4775jx implements UB0 {

    @Nullable
    public final C3677ex a;

    /* JADX INFO: renamed from: jx$a */
    public static final class a {
        public static final C0857Dt1 a(C0857Dt1 c0857Dt1) {
            if ((c0857Dt1 != null ? c0857Dt1.k : null) == null) {
                return c0857Dt1;
            }
            C0857Dt1.a aVarK = c0857Dt1.k();
            aVarK.g = null;
            return aVarK.a();
        }

        public static boolean b(String str) {
            return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
        }
    }

    public C4775jx(@Nullable C3677ex c3677ex) {
        this.a = c3677ex;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0296  */
    /* JADX WARN: Code duplicated, block: B:107:0x029e  */
    /* JADX WARN: Code duplicated, block: B:108:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:111:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:112:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:118:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:121:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:123:0x02db  */
    /* JADX WARN: Code duplicated, block: B:125:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:128:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:134:0x032a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:135:0x032c  */
    /* JADX WARN: Code duplicated, block: B:136:0x0330 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:137:0x0332  */
    /* JADX WARN: Code duplicated, block: B:138:0x0336 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:139:0x0338  */
    /* JADX WARN: Code duplicated, block: B:141:0x0364  */
    /* JADX WARN: Code duplicated, block: B:151:0x038e  */
    /* JADX WARN: Code duplicated, block: B:262:0x05af  */
    /* JADX WARN: Code duplicated, block: B:281:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:283:0x062c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.UB0
    @NotNull
    public final C0857Dt1 a(@NotNull C5593no1 chain) throws Throwable {
        boolean z;
        C0857Dt1 cachedResponse;
        int iZ;
        long j;
        long j2;
        Date dateA;
        Date dateA2;
        Date dateA3;
        String str;
        String str2;
        String str3;
        C5408mx cacheStrategy;
        long j3;
        long time;
        String string;
        int i;
        int i2;
        long millis;
        long millis2;
        String str4;
        String str5;
        C5408mx c5408mx;
        long j4;
        C0857Dt1.a aVarK;
        int i3;
        C3233co1 c3233co1;
        AbstractC7971z80 abstractC7971z80;
        AbstractC1091Gt1 abstractC1091Gt1;
        boolean z2;
        C3677ex.b bVar;
        C3277d20.a aVarG;
        C3277d20.a aVarG2;
        AbstractC1091Gt1 abstractC1091Gt2;
        Intrinsics.checkNotNullParameter(chain, "chain");
        C3233co1 c3233co2 = chain.a;
        C3677ex c3677ex = this.a;
        if (c3677ex != null) {
            C4543is1 newRequest = chain.e;
            Intrinsics.checkNotNullParameter(newRequest, "request");
            try {
                C3277d20.c snapshot = c3677ex.d.k(C3677ex.c.a(newRequest.a));
                if (snapshot == null) {
                    cachedResponse = null;
                    z = true;
                } else {
                    try {
                        C3677ex.d dVar = new C3677ex.d((UN1) snapshot.g.get(0));
                        C2813ao0 cachedRequest = dVar.b;
                        String str6 = dVar.c;
                        C1318Jr0 url = dVar.a;
                        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
                        C2813ao0 c2813ao0 = dVar.g;
                        String strB = c2813ao0.b("Content-Type");
                        String strB2 = c2813ao0.b("Content-Length");
                        z = true;
                        C4543is1.a aVar = new C4543is1.a();
                        Intrinsics.checkNotNullParameter(url, "url");
                        aVar.a = url;
                        aVar.e(str6, null);
                        Intrinsics.checkNotNullParameter(cachedRequest, "headers");
                        aVar.c = cachedRequest.d();
                        C4543is1 request = aVar.b();
                        C0857Dt1.a aVar2 = new C0857Dt1.a();
                        Intrinsics.checkNotNullParameter(request, "request");
                        aVar2.a = request;
                        EnumC1298Jk1 protocol = dVar.d;
                        Intrinsics.checkNotNullParameter(protocol, "protocol");
                        aVar2.b = protocol;
                        aVar2.c = dVar.e;
                        String message = dVar.f;
                        Intrinsics.checkNotNullParameter(message, "message");
                        aVar2.d = message;
                        aVar2.c(c2813ao0);
                        aVar2.g = new C3677ex.a(snapshot, strB, strB2);
                        aVar2.e = dVar.h;
                        aVar2.k = dVar.i;
                        aVar2.l = dVar.j;
                        cachedResponse = aVar2.a();
                        Intrinsics.checkNotNullParameter(newRequest, "request");
                        Intrinsics.checkNotNullParameter(cachedResponse, "response");
                        if (url.equals(newRequest.a) && str6.equals(newRequest.b)) {
                            Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
                            Intrinsics.checkNotNullParameter(cachedRequest, "cachedRequest");
                            Intrinsics.checkNotNullParameter(newRequest, "newRequest");
                            Set setC = C3677ex.c.c(cachedResponse.j);
                            if (setC == null || !setC.isEmpty()) {
                                Iterator it = setC.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        String name = (String) it.next();
                                        List<String> listH = cachedRequest.h(name);
                                        Intrinsics.checkNotNullParameter(name, "name");
                                        if (!Intrinsics.a(listH, newRequest.c.h(name))) {
                                        }
                                    }
                                }
                            }
                        }
                        AbstractC1091Gt1 abstractC1091Gt3 = cachedResponse.k;
                        if (abstractC1091Gt3 != null) {
                            C6806tc2.d(abstractC1091Gt3);
                        }
                    } catch (IOException unused) {
                        z = true;
                        C6806tc2.d(snapshot);
                    }
                    cachedResponse = null;
                }
            } catch (IOException unused2) {
                z = true;
            }
        } else {
            z = true;
            cachedResponse = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C4543is1 request2 = chain.e;
        Intrinsics.checkNotNullParameter(request2, "request");
        if (cachedResponse != null) {
            j = cachedResponse.o;
            j2 = cachedResponse.p;
            C2813ao0 c2813ao1 = cachedResponse.j;
            int size = c2813ao1.size();
            int i4 = 0;
            iZ = -1;
            dateA = null;
            dateA2 = null;
            dateA3 = null;
            str = null;
            str2 = null;
            str3 = null;
            while (i4 < size) {
                String strC = c2813ao1.c(i4);
                long j5 = jCurrentTimeMillis;
                String strF = c2813ao1.f(i4);
                if (d.i(strC, "Date")) {
                    str3 = strF;
                    dateA = QT.a(strF);
                } else if (d.i(strC, "Expires")) {
                    dateA3 = QT.a(strF);
                } else if (d.i(strC, "Last-Modified")) {
                    str2 = strF;
                    dateA2 = QT.a(strF);
                } else if (d.i(strC, "ETag")) {
                    str = strF;
                } else if (d.i(strC, "Age")) {
                    iZ = C6806tc2.z(-1, strF);
                }
                i4++;
                jCurrentTimeMillis = j5;
            }
        } else {
            iZ = -1;
            j = 0;
            j2 = 0;
            dateA = null;
            dateA2 = null;
            dateA3 = null;
            str = null;
            str2 = null;
            str3 = null;
        }
        long j6 = jCurrentTimeMillis;
        if (cachedResponse == null) {
            cacheStrategy = new C5408mx(request2, null);
        } else if (!(request2.a.j && cachedResponse.i == null) && C5408mx.a.a(request2, cachedResponse)) {
            C4307hx c4307hxA = request2.f;
            if (c4307hxA == null) {
                C4307hx c4307hx = C4307hx.n;
                c4307hxA = C4307hx.b.a(request2.c);
                request2.f = c4307hxA;
            }
            if (!c4307hxA.a && request2.a("If-Modified-Since") == null && request2.a("If-None-Match") == null) {
                C4307hx c4307hxC = cachedResponse.c();
                long jMax = dateA != null ? Math.max(0L, j2 - dateA.getTime()) : 0L;
                if (iZ != -1) {
                    jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(iZ));
                }
                long j7 = jMax + (j2 - j) + (j6 - j2);
                Intrinsics.checkNotNull(cachedResponse);
                int i5 = cachedResponse.c().c;
                if (i5 != -1) {
                    time = TimeUnit.SECONDS.toMillis(i5);
                } else {
                    if (dateA3 != null) {
                        time = dateA3.getTime() - (dateA != null ? dateA.getTime() : j2);
                        if (time <= 0) {
                            time = 0;
                        }
                    } else if (dateA2 == null) {
                        j3 = 0;
                        time = j3;
                    } else {
                        ArrayList arrayList = cachedResponse.d.a.g;
                        if (arrayList == null) {
                            string = null;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            C1318Jr0.b.e(arrayList, sb);
                            string = sb.toString();
                        }
                        if (string == null) {
                            long time2 = dateA != null ? dateA.getTime() : j;
                            Intrinsics.checkNotNull(dateA2);
                            long time3 = time2 - dateA2.getTime();
                            j3 = 0;
                            if (time3 > 0) {
                                time = time3 / ((long) 10);
                            }
                        } else {
                            j3 = 0;
                        }
                        time = j3;
                    }
                    i = c4307hxA.c;
                    if (i != -1) {
                        time = Math.min(time, TimeUnit.SECONDS.toMillis(i));
                    }
                    i2 = c4307hxA.i;
                    if (i2 != -1) {
                        millis = TimeUnit.SECONDS.toMillis(i2);
                    } else {
                        millis = j3;
                    }
                    if (!c4307hxC.g || (i3 = c4307hxA.h) == -1) {
                        millis2 = j3;
                    } else {
                        millis2 = TimeUnit.SECONDS.toMillis(i3);
                    }
                    if (c4307hxC.a) {
                        if (str != null) {
                            str4 = "If-None-Match";
                            str5 = str;
                        } else if (dateA2 != null) {
                            str4 = "If-Modified-Since";
                            str5 = str2;
                        } else if (dateA != null) {
                            str4 = r5;
                            str5 = str3;
                        } else {
                            cacheStrategy = new C5408mx(request2, null);
                        }
                        C2813ao0.a aVarD = request2.c.d();
                        Intrinsics.checkNotNull(str5);
                        aVarD.c(str4, str5);
                        C4543is1.a aVarB = request2.b();
                        C2813ao0 headers = aVarD.d();
                        Intrinsics.checkNotNullParameter(headers, "headers");
                        aVarB.c = headers.d();
                        c5408mx = new C5408mx(aVarB.b(), cachedResponse);
                        cacheStrategy = c5408mx;
                    } else {
                        j4 = j7 + millis;
                        if (j4 < millis2 + time) {
                            aVarK = cachedResponse.k();
                            if (j4 >= time) {
                                Intrinsics.checkNotNullParameter("Warning", AppMeasurementSdk.ConditionalUserProperty.NAME);
                                Intrinsics.checkNotNullParameter("110 HttpURLConnection \"Response is stale\"", AppMeasurementSdk.ConditionalUserProperty.VALUE);
                                aVarK.f.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                            }
                            if (j7 > 86400000) {
                                Intrinsics.checkNotNull(cachedResponse);
                                if (cachedResponse.c().c == -1 && dateA3 == null) {
                                    Intrinsics.checkNotNullParameter("Warning", AppMeasurementSdk.ConditionalUserProperty.NAME);
                                    Intrinsics.checkNotNullParameter("113 HttpURLConnection \"Heuristic expiration\"", AppMeasurementSdk.ConditionalUserProperty.VALUE);
                                    aVarK.f.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                }
                            }
                            c5408mx = new C5408mx(null, aVarK.a());
                        } else {
                            if (str != null) {
                                str4 = "If-None-Match";
                                str5 = str;
                            } else if (dateA2 != null) {
                                str4 = "If-Modified-Since";
                                str5 = str2;
                            } else if (dateA != null) {
                                str4 = r5;
                                str5 = str3;
                            } else {
                                cacheStrategy = new C5408mx(request2, null);
                            }
                            C2813ao0.a aVarD2 = request2.c.d();
                            Intrinsics.checkNotNull(str5);
                            aVarD2.c(str4, str5);
                            C4543is1.a aVarB2 = request2.b();
                            C2813ao0 headers2 = aVarD2.d();
                            Intrinsics.checkNotNullParameter(headers2, "headers");
                            aVarB2.c = headers2.d();
                            c5408mx = new C5408mx(aVarB2.b(), cachedResponse);
                        }
                        cacheStrategy = c5408mx;
                    }
                }
                j3 = 0;
                i = c4307hxA.c;
                if (i != -1) {
                    time = Math.min(time, TimeUnit.SECONDS.toMillis(i));
                }
                i2 = c4307hxA.i;
                if (i2 != -1) {
                    millis = TimeUnit.SECONDS.toMillis(i2);
                } else {
                    millis = j3;
                }
                if (c4307hxC.g) {
                    millis2 = j3;
                } else {
                    millis2 = j3;
                }
                if (c4307hxC.a) {
                    j4 = j7 + millis;
                    if (j4 < millis2 + time) {
                        aVarK = cachedResponse.k();
                        if (j4 >= time) {
                            Intrinsics.checkNotNullParameter("Warning", AppMeasurementSdk.ConditionalUserProperty.NAME);
                            Intrinsics.checkNotNullParameter("110 HttpURLConnection \"Response is stale\"", AppMeasurementSdk.ConditionalUserProperty.VALUE);
                            aVarK.f.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (j7 > 86400000) {
                            Intrinsics.checkNotNull(cachedResponse);
                            if (cachedResponse.c().c == -1) {
                                Intrinsics.checkNotNullParameter("Warning", AppMeasurementSdk.ConditionalUserProperty.NAME);
                                Intrinsics.checkNotNullParameter("113 HttpURLConnection \"Heuristic expiration\"", AppMeasurementSdk.ConditionalUserProperty.VALUE);
                                aVarK.f.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                            }
                        }
                        c5408mx = new C5408mx(null, aVarK.a());
                    } else {
                        if (str != null) {
                            str4 = "If-None-Match";
                            str5 = str;
                        } else if (dateA2 != null) {
                            str4 = "If-Modified-Since";
                            str5 = str2;
                        } else if (dateA != null) {
                            str4 = r5;
                            str5 = str3;
                        } else {
                            cacheStrategy = new C5408mx(request2, null);
                        }
                        C2813ao0.a aVarD3 = request2.c.d();
                        Intrinsics.checkNotNull(str5);
                        aVarD3.c(str4, str5);
                        C4543is1.a aVarB3 = request2.b();
                        C2813ao0 headers3 = aVarD3.d();
                        Intrinsics.checkNotNullParameter(headers3, "headers");
                        aVarB3.c = headers3.d();
                        c5408mx = new C5408mx(aVarB3.b(), cachedResponse);
                    }
                    cacheStrategy = c5408mx;
                } else {
                    if (str != null) {
                        str4 = "If-None-Match";
                        str5 = str;
                    } else if (dateA2 != null) {
                        str4 = "If-Modified-Since";
                        str5 = str2;
                    } else if (dateA != null) {
                        str4 = r5;
                        str5 = str3;
                    } else {
                        cacheStrategy = new C5408mx(request2, null);
                    }
                    C2813ao0.a aVarD4 = request2.c.d();
                    Intrinsics.checkNotNull(str5);
                    aVarD4.c(str4, str5);
                    C4543is1.a aVarB4 = request2.b();
                    C2813ao0 headers4 = aVarD4.d();
                    Intrinsics.checkNotNullParameter(headers4, "headers");
                    aVarB4.c = headers4.d();
                    c5408mx = new C5408mx(aVarB4.b(), cachedResponse);
                    cacheStrategy = c5408mx;
                }
            } else {
                cacheStrategy = new C5408mx(request2, null);
            }
        } else {
            cacheStrategy = new C5408mx(request2, null);
        }
        if (cacheStrategy.a == null) {
            c3233co1 = null;
        } else {
            C4307hx c4307hxA2 = request2.f;
            if (c4307hxA2 == null) {
                C4307hx c4307hx2 = C4307hx.n;
                c4307hxA2 = C4307hx.b.a(request2.c);
                request2.f = c4307hxA2;
            }
            if (c4307hxA2.j) {
                c3233co1 = null;
                cacheStrategy = new C5408mx(null, null);
            } else {
                c3233co1 = null;
            }
        }
        C4543is1 c4543is1 = cacheStrategy.a;
        C0857Dt1 cached = cacheStrategy.b;
        C3677ex c3677ex2 = this.a;
        if (c3677ex2 != null) {
            synchronized (c3677ex2) {
                Intrinsics.checkNotNullParameter(cacheStrategy, "cacheStrategy");
            }
        }
        C3233co1 c3233co3 = c3233co2 != null ? c3233co2 : c3233co1;
        if (c3233co3 == null || (abstractC7971z80 = c3233co3.i) == null) {
            abstractC7971z80 = AbstractC7971z80.a;
        }
        if (cachedResponse != null && cached == null && (abstractC1091Gt2 = cachedResponse.k) != null) {
            C6806tc2.d(abstractC1091Gt2);
        }
        if (c4543is1 == null && cached == null) {
            C0857Dt1.a aVar3 = new C0857Dt1.a();
            C4543is1 request3 = chain.e;
            Intrinsics.checkNotNullParameter(request3, "request");
            aVar3.a = request3;
            EnumC1298Jk1 protocol2 = EnumC1298Jk1.HTTP_1_1;
            Intrinsics.checkNotNullParameter(protocol2, "protocol");
            aVar3.b = protocol2;
            aVar3.c = 504;
            Intrinsics.checkNotNullParameter("Unsatisfiable Request (only-if-cached)", "message");
            aVar3.d = "Unsatisfiable Request (only-if-cached)";
            aVar3.g = C6806tc2.c;
            aVar3.k = -1L;
            aVar3.l = System.currentTimeMillis();
            C0857Dt1 c0857Dt1A = aVar3.a();
            abstractC7971z80.A(c3233co2, c0857Dt1A);
            return c0857Dt1A;
        }
        if (c4543is1 == null) {
            Intrinsics.checkNotNull(cached);
            C0857Dt1.a aVarK2 = cached.k();
            C0857Dt1 c0857Dt1A2 = a.a(cached);
            C0857Dt1.a.b(c0857Dt1A2, "cacheResponse");
            aVarK2.i = c0857Dt1A2;
            C0857Dt1 c0857Dt1A3 = aVarK2.a();
            abstractC7971z80.b(c3233co2, c0857Dt1A3);
            return c0857Dt1A3;
        }
        if (cached != null) {
            abstractC7971z80.a(c3233co2, cached);
        } else if (this.a != null) {
            abstractC7971z80.c(c3233co2);
        }
        try {
            C0857Dt1 c0857Dt1B = chain.b(c4543is1);
            if (cached == null) {
                z2 = false;
            } else {
                if (c0857Dt1B.h == 304) {
                    C0857Dt1.a aVarK3 = cached.k();
                    C2813ao0 c2813ao2 = cached.j;
                    C2813ao0 c2813ao3 = c0857Dt1B.j;
                    C2813ao0.a aVar4 = new C2813ao0.a();
                    int size2 = c2813ao2.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        String strC2 = c2813ao2.c(i6);
                        String strF2 = c2813ao2.f(i6);
                        if (!"Warning".equalsIgnoreCase(strC2) || !d.o(strF2, "1", false)) {
                            if ("Content-Length".equalsIgnoreCase(strC2) || "Content-Encoding".equalsIgnoreCase(strC2) || "Content-Type".equalsIgnoreCase(strC2) || !a.b(strC2) || c2813ao3.b(strC2) == null) {
                                aVar4.c(strC2, strF2);
                            }
                        }
                    }
                    int size3 = c2813ao3.size();
                    for (int i7 = 0; i7 < size3; i7++) {
                        String strC3 = c2813ao3.c(i7);
                        if (!"Content-Length".equalsIgnoreCase(strC3) && !"Content-Encoding".equalsIgnoreCase(strC3) && !"Content-Type".equalsIgnoreCase(strC3) && a.b(strC3)) {
                            aVar4.c(strC3, c2813ao3.f(i7));
                        }
                    }
                    aVarK3.c(aVar4.d());
                    aVarK3.k = c0857Dt1B.o;
                    aVarK3.l = c0857Dt1B.p;
                    C0857Dt1 c0857Dt1A4 = a.a(cached);
                    C0857Dt1.a.b(c0857Dt1A4, "cacheResponse");
                    aVarK3.i = c0857Dt1A4;
                    C0857Dt1 c0857Dt1A5 = a.a(c0857Dt1B);
                    C0857Dt1.a.b(c0857Dt1A5, "networkResponse");
                    aVarK3.h = c0857Dt1A5;
                    C0857Dt1 network = aVarK3.a();
                    AbstractC1091Gt1 abstractC1091Gt4 = c0857Dt1B.k;
                    Intrinsics.checkNotNull(abstractC1091Gt4);
                    abstractC1091Gt4.close();
                    C3677ex c3677ex3 = this.a;
                    Intrinsics.checkNotNull(c3677ex3);
                    synchronized (c3677ex3) {
                    }
                    this.a.getClass();
                    Intrinsics.checkNotNullParameter(cached, "cached");
                    Intrinsics.checkNotNullParameter(network, "network");
                    C3677ex.d dVar2 = new C3677ex.d(network);
                    AbstractC1091Gt1 abstractC1091Gt5 = cached.k;
                    Intrinsics.c(abstractC1091Gt5, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
                    C3277d20.c cVar = ((C3677ex.a) abstractC1091Gt5).e;
                    try {
                        aVarG2 = cVar.h.g(cVar.d, cVar.e);
                        if (aVarG2 != 0) {
                            try {
                                dVar2.c(aVarG2);
                                aVarG2.b();
                            } catch (IOException unused3) {
                                if (aVarG2 != 0) {
                                    try {
                                        aVarG2.a();
                                    } catch (IOException unused4) {
                                    }
                                }
                            }
                        }
                    } catch (IOException unused5) {
                        aVarG2 = c3233co1;
                    }
                    abstractC7971z80.b(c3233co2, network);
                    return network;
                }
                z2 = false;
                AbstractC1091Gt1 abstractC1091Gt6 = cached.k;
                if (abstractC1091Gt6 != null) {
                    C6806tc2.d(abstractC1091Gt6);
                }
            }
            Intrinsics.checkNotNull(c0857Dt1B);
            C0857Dt1.a aVarK4 = c0857Dt1B.k();
            C0857Dt1 c0857Dt1A6 = a.a(cached);
            C0857Dt1.a.b(c0857Dt1A6, "cacheResponse");
            aVarK4.i = c0857Dt1A6;
            C0857Dt1 c0857Dt1A7 = a.a(c0857Dt1B);
            C0857Dt1.a.b(c0857Dt1A7, "networkResponse");
            aVarK4.h = c0857Dt1A7;
            C0857Dt1 response = aVarK4.a();
            if (this.a != null) {
                if (C1081Gq0.a(response) && C5408mx.a.a(c4543is1, response)) {
                    C3677ex c3677ex4 = this.a;
                    c3677ex4.getClass();
                    Intrinsics.checkNotNullParameter(response, "response");
                    String method = response.d.b;
                    Intrinsics.checkNotNullParameter(method, "method");
                    if (Intrinsics.a(method, "POST") || Intrinsics.a(method, "PATCH") || Intrinsics.a(method, "PUT") || Intrinsics.a(method, "DELETE") || Intrinsics.a(method, "MOVE")) {
                        z2 = z;
                    }
                    C4543is1 c4543is2 = response.d;
                    try {
                        if (!z2) {
                            if (Intrinsics.a(method, "GET")) {
                                Intrinsics.checkNotNullParameter(response, "<this>");
                                if (C3677ex.c.c(response.j).contains("*")) {
                                    bVar = c3233co1;
                                } else {
                                    C3677ex.d dVar3 = new C3677ex.d(response);
                                    try {
                                        C3277d20 c3277d20 = c3677ex4.d;
                                        String strA = C3677ex.c.a(c4543is2.a);
                                        Regex regex = C3277d20.w;
                                        aVarG = c3277d20.g(strA, -1L);
                                        if (aVarG == 0) {
                                            bVar = c3233co1;
                                        } else {
                                            try {
                                                dVar3.c(aVarG);
                                                bVar = new C3677ex.b(c3677ex4, aVarG);
                                            } catch (IOException unused6) {
                                                if (aVarG != 0) {
                                                    aVarG.a();
                                                }
                                                bVar = c3233co1;
                                            }
                                        }
                                    } catch (IOException unused7) {
                                        aVarG = c3233co1;
                                    }
                                }
                            } else {
                                bVar = c3233co1;
                            }
                            if (bVar != 0) {
                                C3677ex.b.a aVar5 = bVar.c;
                                AbstractC1091Gt1 abstractC1091Gt7 = response.k;
                                Intrinsics.checkNotNull(abstractC1091Gt7);
                                C4985kx c4985kx = new C4985kx(abstractC1091Gt7.k(), bVar, Cm2.c(aVar5));
                                String strF3 = C0857Dt1.f(response, "Content-Type");
                                long jF = response.k.f();
                                C0857Dt1.a aVarK5 = response.k();
                                aVarK5.g = new C6223qo1(strF3, jF, Cm2.e(c4985kx));
                                response = aVarK5.a();
                            }
                            if (cached != null) {
                                abstractC7971z80.c(c3233co2);
                            }
                            return response;
                        }
                        c3677ex4.c(c4543is2);
                    } catch (IOException unused8) {
                    }
                    bVar = c3233co1;
                    if (bVar != 0) {
                        C3677ex.b.a aVar6 = bVar.c;
                        AbstractC1091Gt1 abstractC1091Gt8 = response.k;
                        Intrinsics.checkNotNull(abstractC1091Gt8);
                        C4985kx c4985kx2 = new C4985kx(abstractC1091Gt8.k(), bVar, Cm2.c(aVar6));
                        String strF4 = C0857Dt1.f(response, "Content-Type");
                        long jF2 = response.k.f();
                        C0857Dt1.a aVarK6 = response.k();
                        aVarK6.g = new C6223qo1(strF4, jF2, Cm2.e(c4985kx2));
                        response = aVarK6.a();
                    }
                    if (cached != null) {
                        abstractC7971z80.c(c3233co2);
                    }
                    return response;
                }
                String method2 = c4543is1.b;
                Intrinsics.checkNotNullParameter(method2, "method");
                if (Intrinsics.a(method2, "POST") || Intrinsics.a(method2, "PATCH") || Intrinsics.a(method2, "PUT") || Intrinsics.a(method2, "DELETE") || Intrinsics.a(method2, "MOVE")) {
                    try {
                        this.a.c(c4543is1);
                    } catch (IOException unused9) {
                    }
                }
            }
            return response;
        } catch (Throwable th) {
            if (cachedResponse != null && (abstractC1091Gt1 = cachedResponse.k) != null) {
                C6806tc2.d(abstractC1091Gt1);
            }
            throw th;
        }
    }
}
