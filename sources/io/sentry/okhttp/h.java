package io.sentry.okhttp;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.onesignal.core.activities.PermissionsActivity;
import defpackage.AbstractC1091Gt1;
import defpackage.AbstractC5395ms1;
import defpackage.C0702Bu;
import defpackage.C0841Do0;
import defpackage.C0857Dt1;
import defpackage.C0928Er0;
import defpackage.C1332Jw;
import defpackage.C1481Lu;
import defpackage.C2249Vp;
import defpackage.C2688aH1;
import defpackage.C2813ao0;
import defpackage.C3027bp1;
import defpackage.C3233co1;
import defpackage.C3561eO1;
import defpackage.C4543is1;
import defpackage.C5182ls1;
import defpackage.C5503nP;
import defpackage.C5593no1;
import defpackage.C6398rf2;
import defpackage.C6629sl;
import defpackage.C6806tc2;
import defpackage.C7160vH1;
import defpackage.CY0;
import defpackage.EnumC4869kO1;
import defpackage.InterfaceC1171Hu0;
import defpackage.InterfaceC2347Wu0;
import defpackage.LG1;
import defpackage.ML0;
import defpackage.NG1;
import defpackage.SD1;
import defpackage.UB0;
import defpackage.VE;
import io.sentry.ILogger;
import io.sentry.util.A;
import io.sentry.util.C;
import io.sentry.util.j;
import io.sentry.util.r;
import io.sentry.util.s;
import io.sentry.util.w;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements UB0 {

    @NotNull
    public final InterfaceC1171Hu0 a;

    @Nullable
    public final C1332Jw b;
    public final boolean c;

    @NotNull
    public final List<C0928Er0> d;

    @NotNull
    public final List<String> e;

    public static final class a extends ML0 implements Function1<Long, Unit> {
        public final /* synthetic */ C0702Bu d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0702Bu c0702Bu) {
            super(1);
            this.d = c0702Bu;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l) {
            this.d.f(Long.valueOf(l.longValue()), "http.request_content_length");
            return Unit.a;
        }
    }

    public static final class b extends ML0 implements Function1<Long, Unit> {
        public final /* synthetic */ C0702Bu d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C0702Bu c0702Bu) {
            super(1);
            this.d = c0702Bu;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l) {
            this.d.f(Long.valueOf(l.longValue()), "http.response_content_length");
            return Unit.a;
        }
    }

    static {
        LG1.d().b("maven:io.sentry:sentry-okhttp", "8.35.0");
    }

    public h(C1332Jw c1332Jw, List failedRequestStatusCodes, List failedRequestTargets, int i) {
        SD1 scopes = SD1.a;
        if ((i & 1) != 0) {
            Intrinsics.checkNotNullExpressionValue(scopes, "getInstance(...)");
        }
        failedRequestStatusCodes = (i & 8) != 0 ? VE.c(new C0928Er0(PermissionsActivity.DELAY_TIME_CALLBACK_CALL, 599)) : failedRequestStatusCodes;
        failedRequestTargets = (i & 16) != 0 ? VE.c(C2688aH1.DEFAULT_PROPAGATION_TARGETS) : failedRequestTargets;
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        Intrinsics.checkNotNullParameter(failedRequestStatusCodes, "failedRequestStatusCodes");
        Intrinsics.checkNotNullParameter(failedRequestTargets, "failedRequestTargets");
        this.a = scopes;
        this.b = c1332Jw;
        this.c = true;
        this.d = failedRequestStatusCodes;
        this.e = failedRequestTargets;
        j.a("OkHttp");
    }

    public static io.sentry.util.network.a b(h hVar, C0857Dt1 resp) {
        Charset charsetA;
        Intrinsics.checkNotNullParameter(resp, "resp");
        ILogger logger = hVar.a.p().getLogger();
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(...)");
        AbstractC1091Gt1 abstractC1091Gt1 = resp.k;
        if (abstractC1091Gt1 != null) {
            try {
                CY0 cy0G = abstractC1091Gt1.g();
                String str = cy0G != null ? cy0G.a : null;
                byte[] bArrC = resp.l(((long) 153600) + 1).c();
                String strName = (cy0G == null || (charsetA = cy0G.a(Charsets.UTF_8)) == null) ? null : charsetA.name();
                if (strName == null) {
                    strName = "UTF-8";
                } else {
                    Intrinsics.checkNotNull(strName);
                }
                return io.sentry.util.network.b.a(bArrC, str, strName, logger);
            } catch (Exception e) {
                logger.a(NG1.ERROR, "Failed to read http response body for Network Details: " + e.getMessage(), new Object[0]);
            }
        }
        return null;
    }

    @NotNull
    public static LinkedHashMap f(@NotNull C2813ao0 c2813ao0) {
        Intrinsics.checkNotNullParameter(c2813ao0, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = c2813ao0.size();
        for (int i = 0; i < size; i++) {
            String strC = c2813ao0.c(i);
            String strF = c2813ao0.f(i);
            String str = (String) linkedHashMap.get(strC);
            if (str != null) {
                linkedHashMap.put(strC, str + "; " + strF);
            } else {
                linkedHashMap.put(strC, strF);
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0294 A[Catch: all -> 0x01e2, TRY_ENTER, TryCatch #1 {all -> 0x01e2, blocks: (B:84:0x01dc, B:97:0x0200, B:98:0x0208, B:123:0x0294, B:124:0x029c), top: B:140:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6, types: [Dt1] */
    /* JADX WARN: Type inference failed for: r19v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r25v0, types: [io.sentry.okhttp.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r26v0, types: [java.lang.Object, no1] */
    /* JADX WARN: Type inference failed for: r2v17, types: [T, is1] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3, types: [Dt1] */
    /* JADX WARN: Type inference failed for: r4v4, types: [Dt1] */
    /* JADX WARN: Type inference failed for: r4v5, types: [Dt1] */
    /* JADX WARN: Type inference failed for: r4v6, types: [Dt1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [Dt1] */
    /* JADX WARN: Type inference failed for: r6v0, types: [T, is1] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v9, types: [Wu0] */
    @Override // defpackage.UB0
    @NotNull
    public final C0857Dt1 a(@NotNull C5593no1 chain) throws Throwable {
        InterfaceC2347Wu0 interfaceC2347Wu0Y;
        io.sentry.okhttp.a aVar;
        ?? r8;
        Iterator<String> it;
        String next;
        io.sentry.util.network.d dVar;
        ?? r19;
        ?? ValueOf = "getName(...)";
        ?? response = "baggage";
        Intrinsics.checkNotNullParameter(chain, "chain");
        final C3027bp1 c3027bp1 = new C3027bp1();
        ?? r6 = chain.e;
        c3027bp1.d = r6;
        C.a aVarB = C.b(r6.a.i);
        Intrinsics.checkNotNullExpressionValue(aVarB, "parse(...)");
        String str = aVarB.a;
        if (str == null) {
            str = "unknown";
        }
        Intrinsics.checkNotNullExpressionValue(str, "getUrlOrFallback(...)");
        String str2 = ((C4543is1) c3027bp1.d).b;
        ConcurrentHashMap concurrentHashMap = d.e;
        C3233co1 c3233co1 = chain.a;
        boolean zContainsKey = concurrentHashMap.containsKey(c3233co1);
        InterfaceC1171Hu0 interfaceC1171Hu0 = this.a;
        if (zContainsKey) {
            aVar = (io.sentry.okhttp.a) concurrentHashMap.get(c3233co1);
            r8 = aVar != null ? aVar.e : 0;
        } else {
            InterfaceC2347Wu0 interfaceC2347Wu0R = r.a ? interfaceC1171Hu0.r() : interfaceC1171Hu0.e();
            if (interfaceC2347Wu0R != null) {
                interfaceC2347Wu0Y = interfaceC2347Wu0R.y("http.client", str2 + ' ' + str);
            } else {
                interfaceC2347Wu0Y = null;
            }
            aVar = null;
            r8 = interfaceC2347Wu0Y;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C3561eO1 c3561eO1W = r8 != 0 ? r8.w() : null;
        if (c3561eO1W != null) {
            c3561eO1W.m = "auto.http.okhttp";
        }
        if (r8 != 0) {
            String str3 = aVarB.b;
            if (str3 != null) {
                r8.m(str3, "http.query");
            }
            String str4 = aVarB.c;
            if (str4 != null) {
                r8.m(str4, "http.fragment");
            }
        }
        boolean z = aVar != null;
        C4543is1 c4543is1 = (C4543is1) c3027bp1.d;
        String str5 = c4543is1.a.i;
        String str6 = c4543is1.b;
        List<String> list = interfaceC1171Hu0.p().getSessionReplay().o;
        List<String> list2 = interfaceC1171Hu0.p().getSessionReplay().p;
        if (list2 == null) {
            if (list == null) {
                it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        dVar = null;
                        break;
                    }
                    next = it.next();
                    if (next == null) {
                    }
                }
            } else {
                dVar = null;
                break;
            }
        } else {
            Iterator<String> it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    String next2 = it2.next();
                    if (next2 == null || !str5.matches(next2)) {
                    }
                } else if (list == null) {
                    it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = it.next();
                            if (next == null && str5.matches(next)) {
                                dVar = new io.sentry.util.network.d(str6);
                                break;
                            }
                        }
                    }
                }
                dVar = null;
                break;
            }
        }
        try {
            try {
                final C4543is1.a aVarB2 = ((C4543is1) c3027bp1.d).b();
                if (!w.a("auto.http.okhttp", interfaceC1171Hu0.p().getIgnoredSpanOrigins())) {
                    Object obj = c3027bp1.d;
                    String str7 = ((C4543is1) obj).a.i;
                    C4543is1 c4543is2 = (C4543is1) obj;
                    c4543is2.getClass();
                    Intrinsics.checkNotNullParameter("baggage", AppMeasurementSdk.ConditionalUserProperty.NAME);
                    A.b bVarB = A.b(interfaceC1171Hu0, str7, c4543is2.c.h("baggage"), r8);
                    if (bVarB != null) {
                        C7160vH1 c7160vH1 = bVarB.a;
                        c7160vH1.getClass();
                        Intrinsics.checkNotNullExpressionValue("sentry-trace", "getName(...)");
                        String strA = c7160vH1.a();
                        Intrinsics.checkNotNullExpressionValue(strA, "getValue(...)");
                        aVarB2.a("sentry-trace", strA);
                        C2249Vp c2249Vp = bVarB.b;
                        if (c2249Vp != null) {
                            aVarB2.f("baggage");
                            Intrinsics.checkNotNullExpressionValue("baggage", "getName(...)");
                            String str8 = c2249Vp.a;
                            Intrinsics.checkNotNullExpressionValue(str8, "getValue(...)");
                            aVarB2.a("baggage", str8);
                        }
                        C6398rf2 c6398rf2 = bVarB.c;
                        if (c6398rf2 != null) {
                            Intrinsics.checkNotNullExpressionValue("traceparent", "getName(...)");
                            String strA2 = c6398rf2.a();
                            Intrinsics.checkNotNullExpressionValue(strA2, "getValue(...)");
                            aVarB2.a("traceparent", strA2);
                        }
                    }
                }
                AbstractC5395ms1 abstractC5395ms1 = ((C4543is1) c3027bp1.d).d;
                Long lValueOf = abstractC5395ms1 != null ? Long.valueOf(abstractC5395ms1.a()) : null;
                if (dVar != null) {
                    io.sentry.util.network.e eVarA = io.sentry.util.network.c.a(c3027bp1.d, lValueOf, interfaceC1171Hu0.p().getSessionReplay().q, new io.sentry.util.network.c.a() { // from class: io.sentry.okhttp.f
                        @Override // io.sentry.util.network.c.a
                        public final io.sentry.util.network.a a(Object obj2) throws EOFException {
                            String str9;
                            Charset charsetA;
                            C4543is1 req = (C4543is1) obj2;
                            Intrinsics.checkNotNullParameter(req, "req");
                            AbstractC5395ms1 abstractC5395ms2 = req.d;
                            if (abstractC5395ms2 != null) {
                                C1481Lu c1481Lu = new C1481Lu();
                                abstractC5395ms2.c(c1481Lu);
                                byte[] bArrW = c1481Lu.W(c1481Lu.e);
                                CY0 cy0B = abstractC5395ms2.b();
                                int length = bArrW.length;
                                Intrinsics.checkNotNullParameter(bArrW, "<this>");
                                C6806tc2.c(bArrW.length, 0, length);
                                aVarB2.e(((C4543is1) c3027bp1.d).b, new C5182ls1(cy0B, length, bArrW));
                                CY0 cy0B2 = abstractC5395ms2.b();
                                ILogger logger = this.a.p().getLogger();
                                Intrinsics.checkNotNullExpressionValue(logger, "getLogger(...)");
                                if (cy0B2 != null) {
                                    try {
                                        str9 = cy0B2.a;
                                    } catch (Exception e) {
                                        logger.a(NG1.ERROR, "Failed to parse buffered request body: " + e.getMessage(), new Object[0]);
                                    }
                                } else {
                                    str9 = null;
                                }
                                String strName = (cy0B2 == null || (charsetA = cy0B2.a(Charsets.UTF_8)) == null) ? null : charsetA.name();
                                if (strName == null) {
                                    strName = "UTF-8";
                                }
                                return io.sentry.util.network.b.a(bArrW, str9, strName, logger);
                            }
                            return null;
                        }
                    }, interfaceC1171Hu0.p().getSessionReplay().r, new C6629sl(this));
                    dVar.e = eVarA;
                    dVar.c = eVarA.a;
                }
                ?? B = aVarB2.b();
                c3027bp1.d = B;
                response = chain.b(B);
                int i = response.h;
                try {
                    ValueOf = Integer.valueOf(i);
                    if (r8 != 0) {
                        try {
                            r8.m(ValueOf, "http.response.status_code");
                        } catch (IOException e) {
                            e = e;
                            if (r8 != 0) {
                                r8.i(e);
                                r8.o(EnumC4869kO1.INTERNAL_ERROR);
                            }
                            throw e;
                        }
                    }
                    if (r8 != 0) {
                        try {
                            r8.o(EnumC4869kO1.fromHttpStatusCode(i));
                        } catch (IOException e2) {
                            e = e2;
                            if (r8 != 0) {
                                r8.i(e);
                                r8.o(EnumC4869kO1.INTERNAL_ERROR);
                            }
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            if (aVar != null) {
                                aVar.e((C4543is1) c3027bp1.d);
                            }
                            if (response != 0 && dVar != null) {
                                AbstractC1091Gt1 abstractC1091Gt1 = response.k;
                                ?? r110 = response;
                                io.sentry.util.network.e eVarA2 = io.sentry.util.network.c.a(r110, abstractC1091Gt1 != null ? Long.valueOf(abstractC1091Gt1.f()) : null, interfaceC1171Hu0.p().getSessionReplay().q, new io.sentry.util.network.c.a() { // from class: io.sentry.okhttp.g
                                    @Override // io.sentry.util.network.c.a
                                    public final io.sentry.util.network.a a(Object obj2) {
                                        return h.b(this.a, (C0857Dt1) obj2);
                                    }
                                }, interfaceC1171Hu0.p().getSessionReplay().s, new C5503nP(this));
                                response = r110;
                                dVar.b = Integer.valueOf(response.h);
                                dVar.f = eVarA2;
                                dVar.d = eVarA2.a;
                            }
                            if (aVar != null) {
                                aVar.h = dVar;
                            }
                            c(r8, (C4543is1) c3027bp1.d, z, aVar);
                            if (!z) {
                                d((C4543is1) c3027bp1.d, ValueOf, response, jCurrentTimeMillis, dVar);
                            }
                            throw th;
                        }
                    }
                    if (e((C4543is1) c3027bp1.d, response)) {
                        if (!z || aVar == null) {
                            i.a(interfaceC1171Hu0, (C4543is1) c3027bp1.d, response);
                        } else {
                            Intrinsics.checkNotNullParameter(response, "response");
                            aVar.g = response;
                        }
                    }
                    if (aVar != null) {
                        aVar.e((C4543is1) c3027bp1.d);
                    }
                    if (dVar != null) {
                        AbstractC1091Gt1 abstractC1091Gt2 = response.k;
                        ?? r111 = response;
                        io.sentry.util.network.e eVarA3 = io.sentry.util.network.c.a(r111, abstractC1091Gt2 != null ? Long.valueOf(abstractC1091Gt2.f()) : null, interfaceC1171Hu0.p().getSessionReplay().q, new io.sentry.util.network.c.a() { // from class: io.sentry.okhttp.g
                            @Override // io.sentry.util.network.c.a
                            public final io.sentry.util.network.a a(Object obj2) {
                                return h.b(this.a, (C0857Dt1) obj2);
                            }
                        }, interfaceC1171Hu0.p().getSessionReplay().s, new C5503nP(this));
                        dVar.b = Integer.valueOf(i);
                        dVar.f = eVarA3;
                        dVar.d = eVarA3.a;
                        r19 = r111;
                    } else {
                        r19 = response;
                    }
                    if (aVar != null) {
                        aVar.h = dVar;
                    }
                    c(r8, (C4543is1) c3027bp1.d, z, aVar);
                    if (!z) {
                        d((C4543is1) c3027bp1.d, ValueOf, r19, jCurrentTimeMillis, dVar);
                    }
                    return r19;
                } catch (IOException e3) {
                    e = e3;
                } catch (Throwable th2) {
                    th = th2;
                    ValueOf = 0;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e4) {
            e = e4;
        } catch (Throwable th4) {
            th = th4;
            ValueOf = 0;
            response = 0;
        }
    }

    public final void c(InterfaceC2347Wu0 span, C4543is1 request, boolean z, io.sentry.okhttp.a aVar) {
        if (span == null) {
            if (aVar != null) {
                aVar.a(null);
                return;
            }
            return;
        }
        if (this.b != null) {
            Intrinsics.checkNotNullParameter(span, "span");
            Intrinsics.checkNotNullParameter(request, "request");
            String strA = request.a("X-Request-Id");
            if (strA != null) {
                span.m(strA, "http.request_id");
            }
        }
        if (!z) {
            span.l();
        }
        if (aVar != null) {
            aVar.a(null);
        }
    }

    public final void d(C4543is1 c4543is1, Integer num, C0857Dt1 c0857Dt1, long j, io.sentry.util.network.d dVar) {
        AbstractC1091Gt1 abstractC1091Gt1;
        NG1 ng1;
        String str = c4543is1.a.i;
        C0702Bu c0702Bu = new C0702Bu();
        C.a aVarB = C.b(str);
        c0702Bu.i = "http";
        c0702Bu.k = "http";
        String str2 = aVarB.a;
        if (str2 != null) {
            c0702Bu.f(str2, ImagesContract.URL);
        }
        c0702Bu.f(c4543is1.b.toUpperCase(Locale.ROOT), "method");
        String str3 = aVarB.b;
        if (str3 != null) {
            c0702Bu.f(str3, "http.query");
        }
        String str4 = aVarB.c;
        if (str4 != null) {
            c0702Bu.f(str4, "http.fragment");
        }
        Long lValueOf = null;
        if (num != null) {
            c0702Bu.f(num, "status_code");
            int iIntValue = num.intValue();
            C0928Er0 c0928Er0 = io.sentry.util.h.c;
            if (iIntValue < c0928Er0.a || iIntValue > c0928Er0.b) {
                int iIntValue2 = num.intValue();
                C0928Er0 c0928Er1 = io.sentry.util.h.d;
                ng1 = (iIntValue2 < c0928Er1.a || iIntValue2 > c0928Er1.b) ? null : NG1.ERROR;
            } else {
                ng1 = NG1.WARNING;
            }
            c0702Bu.m = ng1;
        }
        Intrinsics.checkNotNullExpressionValue(c0702Bu, "http(...)");
        AbstractC5395ms1 abstractC5395ms1 = c4543is1.d;
        Long lValueOf2 = abstractC5395ms1 != null ? Long.valueOf(abstractC5395ms1.a()) : null;
        a aVar = new a(c0702Bu);
        if (lValueOf2 != null && lValueOf2.longValue() != -1) {
            aVar.invoke(lValueOf2);
        }
        if (c0857Dt1 != null && (abstractC1091Gt1 = c0857Dt1.k) != null) {
            lValueOf = Long.valueOf(abstractC1091Gt1.f());
        }
        b bVar = new b(c0702Bu);
        if (lValueOf != null && lValueOf.longValue() != -1) {
            bVar.invoke(lValueOf);
        }
        C0841Do0 c0841Do0 = new C0841Do0();
        c0841Do0.d(c4543is1, "okHttp:request");
        if (c0857Dt1 != null) {
            c0841Do0.d(c0857Dt1, "okHttp:response");
        }
        if (dVar != null) {
            c0841Do0.d(dVar, "sentry:replayNetworkDetails");
        }
        c0702Bu.f(Long.valueOf(j), "http.start_timestamp");
        c0702Bu.f(Long.valueOf(System.currentTimeMillis()), "http.end_timestamp");
        this.a.l(c0702Bu, c0841Do0);
    }

    public final boolean e(C4543is1 c4543is1, C0857Dt1 c0857Dt1) {
        if (!this.c) {
            return false;
        }
        for (C0928Er0 c0928Er0 : this.d) {
            int i = c0928Er0.a;
            int i2 = c0857Dt1.h;
            if (i2 >= i && i2 <= c0928Er0.b) {
                return s.a(c4543is1.a.i, this.e);
            }
        }
        return false;
    }
}
