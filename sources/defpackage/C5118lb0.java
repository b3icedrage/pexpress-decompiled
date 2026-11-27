package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.ResultError;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import com.api.feature.analytics.reporters.ReporterApi;
import io.sentry.android.core.b0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: lb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5118lb0 implements InterfaceC0735Cf {

    @NotNull
    public final C4923kf a;

    @NotNull
    public final ReporterApi b;

    @NotNull
    public final InterfaceC7012ub2 c;

    @NotNull
    public final GX d;

    @NotNull
    public final OM e;

    @NotNull
    public final InterfaceC4399iO f;

    @Nullable
    public Double g;

    public C5118lb0(@NotNull C4923kf appData, @NotNull ReporterApi reporter, @NotNull InterfaceC7012ub2 userRepository, @NotNull GX depositCounterUseCase, @NotNull OM convertCurrencyUseCase, @NotNull InterfaceC4399iO couponProvider) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(depositCounterUseCase, "depositCounterUseCase");
        Intrinsics.checkNotNullParameter(convertCurrencyUseCase, "convertCurrencyUseCase");
        Intrinsics.checkNotNullParameter(couponProvider, "couponProvider");
        this.a = appData;
        this.b = reporter;
        this.c = userRepository;
        this.d = depositCounterUseCase;
        this.e = convertCurrencyUseCase;
        this.f = couponProvider;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008a  */
    /* JADX WARN: Code duplicated, block: B:37:0x009c A[PHI: r9
      0x009c: PHI (r9v5 lb0) = (r9v3 lb0), (r9v11 lb0) binds: [B:35:0x0099, B:19:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a7 A[PHI: r9
      0x00a7: PHI (r9v6 lb0) = (r9v5 lb0), (r9v12 lb0) binds: [B:38:0x00a4, B:18:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00af, code lost:
    
        if (r9.f(r0) == r1) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.C5118lb0 r9, defpackage.JM r10) {
        /*
            r9.getClass()
            boolean r0 = r10 instanceof defpackage.C3600eb0
            if (r0 == 0) goto L16
            r0 = r10
            eb0 r0 = (defpackage.C3600eb0) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.h = r1
            goto L1b
        L16:
            eb0 r0 = new eb0
            r0.<init>(r9, r10)
        L1b:
            java.lang.Object r10 = r0.e
            MN r1 = defpackage.MN.d
            int r2 = r0.h
            r3 = 0
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r2 == 0) goto L58
            if (r2 == r8) goto L52
            if (r2 == r7) goto L4c
            if (r2 == r6) goto L46
            if (r2 == r5) goto L40
            if (r2 != r4) goto L38
            defpackage.C1795Pt1.b(r10)
            goto Lb2
        L38:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L40:
            lb0 r9 = r0.d
            defpackage.C1795Pt1.b(r10)
            goto La7
        L46:
            lb0 r9 = r0.d
            defpackage.C1795Pt1.b(r10)
            goto L9c
        L4c:
            lb0 r9 = r0.d
            defpackage.C1795Pt1.b(r10)
            goto L82
        L52:
            lb0 r9 = r0.d
            defpackage.C1795Pt1.b(r10)
            goto L6c
        L58:
            defpackage.C1795Pt1.b(r10)
            GX r10 = r9.d
            rf0 r10 = r10.l()
            r0.d = r9
            r0.h = r8
            java.lang.Object r10 = defpackage.C4466ii.o(r10, r0)
            if (r10 != r1) goto L6c
            goto Lb1
        L6c:
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            if (r10 <= 0) goto L77
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        L77:
            r0.d = r9
            r0.h = r7
            java.lang.Object r10 = r9.g(r0)
            if (r10 != r1) goto L82
            goto Lb1
        L82:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Lb5
            GX r10 = r9.d
            fb0 r2 = new fb0
            r2.<init>(r8, r3)
            r0.d = r9
            r0.h = r6
            java.lang.Object r10 = r10.m(r2, r0)
            if (r10 != r1) goto L9c
            goto Lb1
        L9c:
            r0.d = r9
            r0.h = r5
            java.lang.Object r10 = r9.e(r0)
            if (r10 != r1) goto La7
            goto Lb1
        La7:
            r0.d = r3
            r0.h = r4
            java.lang.Object r9 = r9.f(r0)
            if (r9 != r1) goto Lb2
        Lb1:
            return r1
        Lb2:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        Lb5:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5118lb0.d(lb0, JM):java.lang.Object");
    }

    @Override // defpackage.InterfaceC0735Cf
    public final boolean a(@NotNull InterfaceC0735Cf interfaceC0735Cf) {
        return InterfaceC0735Cf.a.a(this, interfaceC0735Cf);
    }

    @Override // defpackage.InterfaceC0735Cf
    @Nullable
    public final Object b(@NotNull LM lm) throws Throwable {
        this.g = null;
        C4923kf c4923kf = this.a;
        Object objC = new C3735fC1(new C7030ug0(new InterfaceC6396rf0[]{c4923kf.k, c4923kf.c}, null, new C4698jb0(this, null))).c(new C4908kb0(this), lm);
        return objC == MN.d ? objC : Unit.a;
    }

    @Override // defpackage.InterfaceC0735Cf
    public final boolean c() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object e(LM lm) {
        C4020gb0 c4020gb0;
        Double d;
        String str;
        C5118lb0 c5118lb0;
        if (lm instanceof C4020gb0) {
            c4020gb0 = (C4020gb0) lm;
            int i = c4020gb0.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4020gb0.j = i - Integer.MIN_VALUE;
            } else {
                c4020gb0 = new C4020gb0(this, lm);
            }
        } else {
            c4020gb0 = new C4020gb0(this, lm);
        }
        C4020gb0 c4020gb1 = c4020gb0;
        Object obj = c4020gb1.h;
        MN mn = MN.d;
        int i2 = c4020gb1.j;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            C4923kf c4923kf = this.a;
            C6945uG c6945uG = (C6945uG) c4923kf.k.getValue();
            String str2 = c6945uG != null ? c6945uG.g : null;
            String str3 = str2 == null ? "" : str2;
            C6945uG c6945uG2 = (C6945uG) c4923kf.k.getValue();
            Double d2 = c6945uG2 != null ? new Double(c6945uG2.j) : null;
            double dDoubleValue = d2 != null ? d2.doubleValue() : 0.0d;
            c4020gb1.d = this;
            c4020gb1.e = str3;
            c4020gb1.g = d2;
            c4020gb1.j = 1;
            Object objC = this.e.c(str3, dDoubleValue, "usd", c4020gb1);
            if (objC == mn) {
                return mn;
            }
            d = d2;
            obj = objC;
            str = str3;
            c5118lb0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d = c4020gb1.g;
            String str4 = c4020gb1.e;
            c5118lb0 = c4020gb1.d;
            C1795Pt1.b(obj);
            str = str4;
        }
        Double d3 = (Double) obj;
        String string = d != null ? d.toString() : null;
        String str5 = string == null ? "" : string;
        String strZ = C0564Aa.z(d3);
        Double d4 = c5118lb0.g;
        XX xx = new XX(str5, str, strZ, null, Boolean.valueOf(d4 != null && d4.doubleValue() == 0.0d), 8);
        EnumC5028l80 enumC5028l80 = EnumC5028l80.W;
        ReporterApi reporterApi = c5118lb0.b;
        ReporterApi.a.b(reporterApi, enumC5028l80, xx, null, 12);
        ReporterApi.a.a(reporterApi, EnumC5113la.FTD, Boolean.TRUE);
        EnumC5028l80 enumC5028l81 = EnumC5028l80.Y;
        InterfaceC4399iO interfaceC4399iO = c5118lb0.f;
        String str6 = (String) interfaceC4399iO.a().getValue();
        String value = xx.a;
        Intrinsics.checkNotNullParameter(value, "value");
        String currency = xx.b;
        Intrinsics.checkNotNullParameter(currency, "currency");
        ReporterApi.a.b(reporterApi, enumC5028l81, new XX(value, currency, xx.c, str6, null), null, 12);
        if (c5118lb0.a.c.getValue() != null) {
            ReporterApi.a.a(reporterApi, EnumC5113la.COUNTER_MAKE_DEPOSIT, 1);
        }
        interfaceC4399iO.b();
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        if (r7.c(r2, r5, false) == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.LM r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.C4230hb0
            if (r0 == 0) goto L13
            r0 = r7
            hb0 r0 = (defpackage.C4230hb0) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            hb0 r0 = new hb0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.e
            MN r1 = defpackage.MN.d
            int r2 = r0.h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.C1795Pt1.b(r7)
            goto L61
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            lb0 r2 = r0.d
            defpackage.C1795Pt1.b(r7)
            goto L4b
        L38:
            defpackage.C1795Pt1.b(r7)
            H91 r7 = defpackage.H91.ACTIVATION
            r0.d = r6
            r0.h = r4
            com.api.feature.analytics.reporters.ReporterApi r2 = r6.b
            kotlin.Unit r7 = r2.i(r7, r0)
            if (r7 != r1) goto L4a
            goto L60
        L4a:
            r2 = r6
        L4b:
            com.api.feature.analytics.reporters.ReporterApi r7 = r2.b
            H91 r2 = defpackage.H91.MAKE_DEPOSIT
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            r4 = 0
            r0.d = r4
            r0.h = r3
            r0 = 0
            kotlin.Unit r7 = r7.c(r2, r5, r0)
            if (r7 != r1) goto L61
        L60:
            return r1
        L61:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5118lb0.f(LM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0093  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(LM lm) {
        C4440ib0 c4440ib0;
        C5118lb0 c5118lb0;
        C6120qK1 c6120qK1;
        Unit unit;
        C5118lb0 c5118lb1;
        GP1 gp1;
        Object value;
        C6106qG c6106qG;
        C6106qG c6106qGA;
        if (lm instanceof C4440ib0) {
            c4440ib0 = (C4440ib0) lm;
            int i = c4440ib0.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4440ib0.h = i - Integer.MIN_VALUE;
            } else {
                c4440ib0 = new C4440ib0(this, lm);
            }
        } else {
            c4440ib0 = new C4440ib0(this, lm);
        }
        Object objJ = c4440ib0.e;
        MN mn = MN.d;
        int i2 = c4440ib0.h;
        boolean z = true;
        if (i2 == 0) {
            C1795Pt1.b(objJ);
            Object value2 = this.a.k.getValue();
            Intrinsics.checkNotNull(value2);
            long j = ((C6945uG) value2).a;
            C5893pF c5893pF = new C5893pF();
            c5893pF.a = j;
            c4440ib0.d = this;
            c4440ib0.h = 1;
            objJ = this.c.j(c5893pF, c4440ib0);
            if (objJ != mn) {
                c5118lb0 = this;
            }
            return mn;
        }
        if (i2 == 1) {
            c5118lb0 = c4440ib0.d;
            C1795Pt1.b(objJ);
        } else {
            if (i2 == 2) {
                c5118lb0 = c4440ib0.d;
                C1795Pt1.b(objJ);
                c6120qK1 = c5118lb0.a.n;
                unit = Unit.a;
                c4440ib0.d = c5118lb0;
                c4440ib0.h = 3;
                if (c6120qK1.a(unit, c4440ib0) != mn) {
                    c5118lb1 = c5118lb0;
                }
                return mn;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c5118lb1 = c4440ib0.d;
            C1795Pt1.b(objJ);
        }
        gp1 = c5118lb1.a.c;
        do {
            value = gp1.getValue();
            c6106qG = (C6106qG) value;
            if (c6106qG != null) {
                c6106qGA = C6106qG.a(c6106qG, null, 23);
            } else {
                c6106qGA = null;
            }
        } while (!gp1.d(value, c6106qGA));
        return Boolean.valueOf(z);
        CommonResult commonResult = (CommonResult) objJ;
        if (commonResult instanceof ResultOk) {
            C6120qK1 c6120qK2 = c5118lb0.a.o;
            Unit unit2 = Unit.a;
            c4440ib0.d = c5118lb0;
            c4440ib0.h = 2;
            if (c6120qK2.a(unit2, c4440ib0) != mn) {
                c6120qK1 = c5118lb0.a.n;
                unit = Unit.a;
                c4440ib0.d = c5118lb0;
                c4440ib0.h = 3;
                if (c6120qK1.a(unit, c4440ib0) != mn) {
                    c5118lb1 = c5118lb0;
                    gp1 = c5118lb1.a.c;
                    do {
                        value = gp1.getValue();
                        c6106qG = (C6106qG) value;
                        if (c6106qG != null) {
                            c6106qGA = C6106qG.a(c6106qG, null, 23);
                        } else {
                            c6106qGA = null;
                        }
                    } while (!gp1.d(value, c6106qGA));
                }
            }
            return mn;
        }
        if (!(commonResult instanceof ResultError)) {
            throw new C6489s51();
        }
        ResultError resultError = (ResultError) commonResult;
        b0.c("FTDUpdater", "user activation error: " + resultError.getError());
        CommonError error = resultError.getError();
        c5118lb0.getClass();
        ReporterApi.a.b(c5118lb0.b, EnumC5028l80.x0, E70.a.a(error, null, null, null, 30), null, 12);
        z = false;
        return Boolean.valueOf(z);
    }

    @Override // defpackage.InterfaceC0735Cf
    public final void stop() {
    }
}
