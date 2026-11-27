package defpackage;

import com.api.core.backend.domain.models.responseModels.CommonMakeDeposit;
import com.api.feature.analytics.reporters.ReporterApi;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: cW0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3165cW0 implements InterfaceC0735Cf {

    @NotNull
    public final C4923kf a;

    @NotNull
    public final InterfaceC4399iO b;

    @NotNull
    public final ReporterApi c;

    @NotNull
    public final InterfaceC3579eU1 d;

    @NotNull
    public final GX e;

    @NotNull
    public final OM f;

    public C3165cW0(@NotNull C4923kf appDataRepository, @NotNull InterfaceC4399iO couponProvider, @NotNull ReporterApi reporter, @NotNull InterfaceC3579eU1 subscribeForDepositUseCase, @NotNull GX depositCounterUseCase, @NotNull OM convertCurrencyUseCase) {
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(couponProvider, "couponProvider");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(subscribeForDepositUseCase, "subscribeForDepositUseCase");
        Intrinsics.checkNotNullParameter(depositCounterUseCase, "depositCounterUseCase");
        Intrinsics.checkNotNullParameter(convertCurrencyUseCase, "convertCurrencyUseCase");
        this.a = appDataRepository;
        this.b = couponProvider;
        this.c = reporter;
        this.d = subscribeForDepositUseCase;
        this.e = depositCounterUseCase;
        this.f = convertCurrencyUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0089  */
    /* JADX WARN: Code duplicated, block: B:35:0x008e A[PHI: r8
      0x008e: PHI (r8v3 cW0) = (r8v2 cW0), (r8v10 cW0) binds: [B:33:0x008b, B:17:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009c, code lost:
    
        if (r8.a(r9, r0) == r1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.C3165cW0 r8, com.api.core.backend.domain.models.responseModels.CommonMakeDeposit r9, defpackage.LM r10) {
        /*
            r8.getClass()
            boolean r0 = r10 instanceof defpackage.ZV0
            if (r0 == 0) goto L16
            r0 = r10
            ZV0 r0 = (defpackage.ZV0) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.h = r1
            goto L1b
        L16:
            ZV0 r0 = new ZV0
            r0.<init>(r8, r10)
        L1b:
            java.lang.Object r10 = r0.e
            MN r1 = defpackage.MN.d
            int r2 = r0.h
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L4f
            if (r2 == r7) goto L49
            if (r2 == r6) goto L43
            if (r2 == r5) goto L3d
            if (r2 != r4) goto L35
            defpackage.C1795Pt1.b(r10)
            goto L9f
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3d:
            cW0 r8 = r0.d
            defpackage.C1795Pt1.b(r10)
            goto L8e
        L43:
            cW0 r8 = r0.d
            defpackage.C1795Pt1.b(r10)
            goto L74
        L49:
            cW0 r8 = r0.d
            defpackage.C1795Pt1.b(r10)
            goto L5d
        L4f:
            defpackage.C1795Pt1.b(r10)
            r0.d = r8
            r0.h = r7
            java.lang.Object r9 = r8.g(r9, r0)
            if (r9 != r1) goto L5d
            goto L9e
        L5d:
            r0.d = r8
            r0.h = r6
            r8.getClass()
            H91 r9 = defpackage.H91.MAKE_DEPOSIT
            com.api.feature.analytics.reporters.ReporterApi r10 = r8.c
            kotlin.Unit r9 = r10.a(r9, r0)
            if (r9 != r1) goto L6f
            goto L71
        L6f:
            kotlin.Unit r9 = kotlin.Unit.a
        L71:
            if (r9 != r1) goto L74
            goto L9e
        L74:
            GX r9 = r8.e
            r0.d = r8
            r0.h = r5
            r9.getClass()
            FX r10 = new FX
            r10.<init>(r9, r3)
            java.lang.Object r9 = r9.m(r10, r0)
            if (r9 != r1) goto L89
            goto L8b
        L89:
            kotlin.Unit r9 = kotlin.Unit.a
        L8b:
            if (r9 != r1) goto L8e
            goto L9e
        L8e:
            kf r8 = r8.a
            qK1 r8 = r8.n
            kotlin.Unit r9 = kotlin.Unit.a
            r0.d = r3
            r0.h = r4
            java.lang.Object r8 = r8.a(r9, r0)
            if (r8 != r1) goto L9f
        L9e:
            return r1
        L9f:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3165cW0.d(cW0, com.api.core.backend.domain.models.responseModels.CommonMakeDeposit, LM):java.lang.Object");
    }

    @Override // defpackage.InterfaceC0735Cf
    public final boolean a(@NotNull InterfaceC0735Cf interfaceC0735Cf) {
        return InterfaceC0735Cf.a.a(this, interfaceC0735Cf);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        if (r6.c(r4, r0) == r1) goto L22;
     */
    @Override // defpackage.InterfaceC0735Cf
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull defpackage.LM r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.C2732aW0
            if (r0 == 0) goto L13
            r0 = r6
            aW0 r0 = (defpackage.C2732aW0) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            aW0 r0 = new aW0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.e
            MN r1 = defpackage.MN.d
            int r2 = r0.h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.C1795Pt1.b(r6)
            goto L62
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            cW0 r2 = r0.d
            defpackage.C1795Pt1.b(r6)
            goto L49
        L38:
            defpackage.C1795Pt1.b(r6)
            r0.d = r5
            r0.h = r4
            eU1 r6 = r5.d
            jk r6 = r6.c()
            if (r6 != r1) goto L48
            goto L61
        L48:
            r2 = r5
        L49:
            rf0 r6 = (defpackage.InterfaceC6396rf0) r6
            java.lang.String r4 = "deposit.made"
            com.api.core.backend.domain.models.resultModels.CommonResultKt$okFilter$$inlined$filterIsInstance$1 r6 = com.api.core.backend.domain.models.resultModels.CommonResultKt.c(r6, r4)
            bW0 r4 = new bW0
            r4.<init>(r2)
            r2 = 0
            r0.d = r2
            r0.h = r3
            java.lang.Object r6 = r6.c(r4, r0)
            if (r6 != r1) goto L62
        L61:
            return r1
        L62:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3165cW0.b(LM):java.lang.Object");
    }

    @Override // defpackage.InterfaceC0735Cf
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object e(@NotNull CommonMakeDeposit commonMakeDeposit, @NotNull LM lm) {
        WV0 wv0;
        C3165cW0 c3165cW0;
        Object next;
        String str;
        if (lm instanceof WV0) {
            wv0 = (WV0) lm;
            int i = wv0.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                wv0.i = i - Integer.MIN_VALUE;
            } else {
                wv0 = new WV0(this, lm);
            }
        } else {
            wv0 = new WV0(this, lm);
        }
        Object objA = wv0.g;
        MN mn = MN.d;
        int i2 = wv0.i;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            GP1 gp1 = this.a.i;
            wv0.d = this;
            wv0.e = commonMakeDeposit;
            wv0.i = 1;
            objA = C7236vf0.a(gp1, wv0);
            if (objA == mn) {
                return mn;
            }
            c3165cW0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            commonMakeDeposit = wv0.e;
            c3165cW0 = wv0.d;
            C1795Pt1.b(objA);
        }
        Iterator it = ((KF) objA).a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int i3 = ((LF) next).a;
            Integer currencyId = commonMakeDeposit.getCurrencyId();
            if (currencyId != null && i3 == currencyId.intValue()) {
                break;
            }
        }
        LF lf = (LF) next;
        if (lf != null && (str = lf.b) != null) {
            return str;
        }
        String currency = commonMakeDeposit.getCurrency();
        if (currency != null) {
            return currency;
        }
        C6945uG c6945uG = (C6945uG) c3165cW0.a.k.getValue();
        String str2 = c6945uG != null ? c6945uG.g : null;
        return str2 == null ? "" : str2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    public final Object f(@NotNull CommonMakeDeposit commonMakeDeposit, @NotNull String str, @NotNull LM lm) {
        XV0 xv0;
        if (lm instanceof XV0) {
            xv0 = (XV0) lm;
            int i = xv0.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                xv0.g = i - Integer.MIN_VALUE;
            } else {
                xv0 = new XV0(this, lm);
            }
        } else {
            xv0 = new XV0(this, lm);
        }
        XV0 xv1 = xv0;
        Object objC = xv1.d;
        MN mn = MN.d;
        int i2 = xv1.g;
        if (i2 == 0) {
            C1795Pt1.b(objC);
            String amountUSD = commonMakeDeposit.getAmountUSD();
            if (amountUSD != null) {
                return amountUSD;
            }
            Double d = IS1.d(commonMakeDeposit.getAmount());
            double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
            xv1.g = 1;
            objC = this.f.c(str, dDoubleValue, "usd", xv1);
            if (objC == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objC);
        }
        return C0564Aa.z((Double) objC);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x009c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(CommonMakeDeposit commonMakeDeposit, LM lm) {
        YV0 yv0;
        C3165cW0 c3165cW0;
        CommonMakeDeposit commonMakeDeposit2;
        String str;
        C3165cW0 c3165cW1;
        ReporterApi reporterApi;
        if (lm instanceof YV0) {
            yv0 = (YV0) lm;
            int i = yv0.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                yv0.j = i - Integer.MIN_VALUE;
            } else {
                yv0 = new YV0(this, lm);
            }
        } else {
            yv0 = new YV0(this, lm);
        }
        Object objE = yv0.h;
        MN mn = MN.d;
        int i2 = yv0.j;
        if (i2 == 0) {
            C1795Pt1.b(objE);
            yv0.d = this;
            yv0.e = commonMakeDeposit;
            yv0.j = 1;
            objE = e(commonMakeDeposit, yv0);
            if (objE != mn) {
                c3165cW0 = this;
            }
            return mn;
        }
        if (i2 == 1) {
            commonMakeDeposit = yv0.e;
            c3165cW0 = yv0.d;
            C1795Pt1.b(objE);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str2 = yv0.g;
            commonMakeDeposit2 = yv0.e;
            c3165cW1 = yv0.d;
            C1795Pt1.b(objE);
            str = str2;
        }
        XX xx = new XX(commonMakeDeposit2.getAmount(), str, (String) objE, (String) c3165cW1.b.a().getValue(), null, 16);
        EnumC5028l80 enumC5028l80 = EnumC5028l80.Y;
        reporterApi = c3165cW1.c;
        ReporterApi.a.b(reporterApi, enumC5028l80, xx, null, 12);
        c3165cW1.b.b();
        if (c3165cW1.a.c.getValue() != null) {
            ReporterApi.a.a(reporterApi, EnumC5113la.COUNTER_MAKE_DEPOSIT, new Integer(1));
        }
        return Unit.a;
        String str3 = (String) objE;
        yv0.d = c3165cW0;
        yv0.e = commonMakeDeposit;
        yv0.g = str3;
        yv0.j = 2;
        Object objF = c3165cW0.f(commonMakeDeposit, str3, yv0);
        if (objF != mn) {
            commonMakeDeposit2 = commonMakeDeposit;
            str = str3;
            objE = objF;
            c3165cW1 = c3165cW0;
            XX xx2 = new XX(commonMakeDeposit2.getAmount(), str, (String) objE, (String) c3165cW1.b.a().getValue(), null, 16);
            EnumC5028l80 enumC5028l81 = EnumC5028l80.Y;
            reporterApi = c3165cW1.c;
            ReporterApi.a.b(reporterApi, enumC5028l81, xx2, null, 12);
            c3165cW1.b.b();
            if (c3165cW1.a.c.getValue() != null) {
                ReporterApi.a.a(reporterApi, EnumC5113la.COUNTER_MAKE_DEPOSIT, new Integer(1));
            }
            return Unit.a;
        }
        return mn;
    }

    @Override // defpackage.InterfaceC0735Cf
    public final void stop() {
    }
}
