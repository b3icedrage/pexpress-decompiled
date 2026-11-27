package defpackage;

import com.appsflyer.share.attribution.RequestError;
import com.pexpress.tool.R;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AP implements InterfaceC8023zP {

    @NotNull
    public final C4617jA1 a;

    @NotNull
    public final C4923kf b;

    @NotNull
    public final InterfaceC4878kR1 c;

    @NotNull
    public final NQ d;

    @NotNull
    public final AbstractC7004uZ1 e;

    @NotNull
    public final J22 f;

    @NotNull
    public final EQ g;

    @NotNull
    public final MR1 h;

    @NotNull
    public final AbstractC1787Pr i;

    @NotNull
    public final AbstractC6505s91 j;

    @NotNull
    public final AbstractC4892kW0 k;

    @NotNull
    public final C3735fC1 l;

    @InterfaceC3368dU(c = "com.base.feature.robot.robot.confirm_bottomsheet.usecases.CreateBetConfirmationParamsUseCaseBase$betConfirmParamsFlow$1", f = "CreateBetConfirmationParamsUseCaseBase.kt", l = {45, 46, 47, 48, 49, RequestError.RESPONSE_CODE_FAILURE, 51, 52, 53, 55, 43}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<InterfaceC6606sf0<? super C1631Nr>, JM<? super Unit>, Object> {
        public Integer d;
        public String e;
        public Integer g;
        public String h;
        public String i;
        public String j;
        public C3496e42 k;
        public C1491Lx0 l;
        public EnumC5275mJ m;
        public long n;
        public int o;
        public /* synthetic */ Object p;

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            a aVar = AP.this.new a(jm);
            aVar.p = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC6606sf0<? super C1631Nr> interfaceC6606sf0, JM<? super Unit> jm) {
            return ((a) create(interfaceC6606sf0, jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0134  */
        /* JADX WARN: Code duplicated, block: B:28:0x014c  */
        /* JADX WARN: Code duplicated, block: B:32:0x0167  */
        /* JADX WARN: Code duplicated, block: B:36:0x0183  */
        /* JADX WARN: Code duplicated, block: B:40:0x01a4  */
        /* JADX WARN: Code duplicated, block: B:44:0x01c8  */
        /* JADX WARN: Code duplicated, block: B:48:0x01ef  */
        /* JADX WARN: Code duplicated, block: B:52:0x0214  */
        /* JADX WARN: Code duplicated, block: B:56:0x024b  */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0299, code lost:
        
            if (r14.a(r16, r32) == r1) goto L59;
         */
        @Override // defpackage.AbstractC7487wq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r33) {
            /*
                Method dump skipped, instruction units count: 700
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: AP.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public AP(@NotNull C4617jA1 robotTrading, @NotNull C4923kf appData, @NotNull InterfaceC4878kR1 strategiesProvider, @NotNull NQ currentIndicatorProvider, @NotNull AbstractC7004uZ1 timeSelectionsProvider, @NotNull J22 currentAssetProvider, @NotNull EQ currencySignProvider, @NotNull MR1 strategySelectionUseCaseApi, @NotNull AbstractC1787Pr betDurationUseCase, @NotNull AbstractC6505s91 oneClickDealsUseCase, @NotNull AbstractC4892kW0 manualAssetSelectionEnabledUseCase) {
        Intrinsics.checkNotNullParameter(robotTrading, "robotTrading");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(strategiesProvider, "strategiesProvider");
        Intrinsics.checkNotNullParameter(currentIndicatorProvider, "currentIndicatorProvider");
        Intrinsics.checkNotNullParameter(timeSelectionsProvider, "timeSelectionsProvider");
        Intrinsics.checkNotNullParameter(currentAssetProvider, "currentAssetProvider");
        Intrinsics.checkNotNullParameter(currencySignProvider, "currencySignProvider");
        Intrinsics.checkNotNullParameter(strategySelectionUseCaseApi, "strategySelectionUseCaseApi");
        Intrinsics.checkNotNullParameter(betDurationUseCase, "betDurationUseCase");
        Intrinsics.checkNotNullParameter(oneClickDealsUseCase, "oneClickDealsUseCase");
        Intrinsics.checkNotNullParameter(manualAssetSelectionEnabledUseCase, "manualAssetSelectionEnabledUseCase");
        this.a = robotTrading;
        this.b = appData;
        this.c = strategiesProvider;
        this.d = currentIndicatorProvider;
        this.e = timeSelectionsProvider;
        this.f = currentAssetProvider;
        this.g = currencySignProvider;
        this.h = strategySelectionUseCaseApi;
        this.i = betDurationUseCase;
        this.j = oneClickDealsUseCase;
        this.k = manualAssetSelectionEnabledUseCase;
        this.l = new C3735fC1(new a(null));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008f A[Catch: IllegalArgumentException -> 0x00c0, TryCatch #0 {IllegalArgumentException -> 0x00c0, blocks: (B:24:0x0087, B:26:0x008f, B:27:0x00a8), top: B:32:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00a8 A[Catch: IllegalArgumentException -> 0x00c0, TRY_LEAVE, TryCatch #0 {IllegalArgumentException -> 0x00c0, blocks: (B:24:0x0087, B:26:0x008f, B:27:0x00a8), top: B:32:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(AP ap, LM lm) {
        BP bp;
        long j;
        Long l;
        String upperCase;
        String strE;
        NumberFormat currencyInstance;
        ap.getClass();
        if (lm instanceof BP) {
            bp = (BP) lm;
            int i = bp.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                bp.i = i - Integer.MIN_VALUE;
            } else {
                bp = new BP(ap, lm);
            }
        } else {
            bp = new BP(ap, lm);
        }
        Object objC = bp.g;
        MN mn = MN.d;
        int i2 = bp.i;
        if (i2 == 0) {
            C1795Pt1.b(objC);
            bp.d = ap;
            bp.i = 1;
            VQ vq = ap.a.k;
            objC = vq.c((EnumC4164hF1) vq.b.l().d.getValue(), bp);
            if (objC != mn) {
            }
            return mn;
        }
        if (i2 == 1) {
            ap = bp.d;
            C1795Pt1.b(objC);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = bp.e;
            C1795Pt1.b(objC);
        }
        l = new Long(j);
        upperCase = ((String) objC).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        try {
            if (Intrinsics.a(upperCase, "DEMO")) {
                currencyInstance = NumberFormat.getCurrencyInstance();
                DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
                decimalFormatSymbols.setCurrencySymbol("Đ");
                Intrinsics.c(currencyInstance, "null cannot be cast to non-null type java.text.DecimalFormat");
                ((DecimalFormat) currencyInstance).setDecimalFormatSymbols(decimalFormatSymbols);
            } else {
                currencyInstance = NumberFormat.getCurrencyInstance();
                currencyInstance.setCurrency(Currency.getInstance(upperCase));
            }
            currencyInstance.setMaximumFractionDigits(0);
            strE = currencyInstance.format(l);
            Intrinsics.checkNotNullExpressionValue(strE, "format(...)");
        } catch (IllegalArgumentException unused) {
            String str = new DecimalFormat("###,###,##0").format(l);
            String upperCase2 = C5491nL.c(" ", upperCase).toUpperCase(Locale.ROOT);
            strE = C6133qP.e(upperCase2, "toUpperCase(...)", str, upperCase2);
        }
        return C5491nL.c("\u202a", QO.o(strE));
        long jLongValue = ((Number) objC).longValue();
        EQ eq = ap.g;
        bp.d = null;
        bp.e = jLongValue;
        bp.i = 2;
        objC = eq.a(false, bp);
        if (objC != mn) {
            j = jLongValue;
            l = new Long(j);
            upperCase = ((String) objC).toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            if (Intrinsics.a(upperCase, "DEMO")) {
                currencyInstance = NumberFormat.getCurrencyInstance();
                DecimalFormatSymbols decimalFormatSymbols2 = DecimalFormatSymbols.getInstance();
                decimalFormatSymbols2.setCurrencySymbol("Đ");
                Intrinsics.c(currencyInstance, "null cannot be cast to non-null type java.text.DecimalFormat");
                ((DecimalFormat) currencyInstance).setDecimalFormatSymbols(decimalFormatSymbols2);
            } else {
                currencyInstance = NumberFormat.getCurrencyInstance();
                currencyInstance.setCurrency(Currency.getInstance(upperCase));
            }
            currencyInstance.setMaximumFractionDigits(0);
            strE = currencyInstance.format(l);
            Intrinsics.checkNotNullExpressionValue(strE, "format(...)");
            return C5491nL.c("\u202a", QO.o(strE));
        }
        return mn;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0056  */
    /* JADX WARN: Code duplicated, block: B:19:0x0075 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0076  */
    /* JADX WARN: Code duplicated, block: B:22:0x007c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x007d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0076 -> B:21:0x007a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(defpackage.AP r7, defpackage.LM r8) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof defpackage.EP
            if (r0 == 0) goto L16
            r0 = r8
            EP r0 = (defpackage.EP) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.k = r1
            goto L1b
        L16:
            EP r0 = new EP
            r0.<init>(r7, r8)
        L1b:
            java.lang.Object r8 = r0.i
            MN r1 = defpackage.MN.d
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            a42 r7 = r0.h
            java.lang.Object r2 = r0.g
            java.util.Iterator r4 = r0.e
            AP r5 = r0.d
            defpackage.C1795Pt1.b(r8)
            goto L7a
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            defpackage.C1795Pt1.b(r8)
            kR1 r8 = r7.c
            On1 r8 = r8.a()
            g21 r8 = r8.d
            java.lang.Object r8 = r8.getValue()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
            r4 = r8
        L50:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L7f
            java.lang.Object r2 = r4.next()
            r8 = r2
            e42 r8 = (defpackage.C3496e42) r8
            a42 r8 = r8.a
            MR1 r5 = r7.h
            rf0 r5 = r5.k()
            r0.d = r7
            r0.e = r4
            r0.g = r2
            r0.h = r8
            r0.k = r3
            java.lang.Object r5 = defpackage.C4466ii.o(r5, r0)
            if (r5 != r1) goto L76
            return r1
        L76:
            r6 = r5
            r5 = r7
            r7 = r8
            r8 = r6
        L7a:
            if (r7 != r8) goto L7d
            return r2
        L7d:
            r7 = r5
            goto L50
        L7f:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AP.c(AP, LM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object d(AP ap, LM lm) {
        FP fp;
        ap.getClass();
        if (lm instanceof FP) {
            fp = (FP) lm;
            int i = fp.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                fp.g = i - Integer.MIN_VALUE;
            } else {
                fp = new FP(ap, lm);
            }
        } else {
            fp = new FP(ap, lm);
        }
        Object objO = fp.d;
        MN mn = MN.d;
        int i2 = fp.g;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            InterfaceC6396rf0<Boolean> interfaceC6396rf0L = ap.k.l();
            fp.g = 1;
            objO = C4466ii.o(interfaceC6396rf0L, fp);
            if (objO == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objO);
        }
        if (((Boolean) objO).booleanValue()) {
            return null;
        }
        return new Integer(R.drawable.ic_auto_selection_bet_confirmed);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object e(AP ap, LM lm) {
        GP gp;
        ap.getClass();
        if (lm instanceof GP) {
            gp = (GP) lm;
            int i = gp.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                gp.g = i - Integer.MIN_VALUE;
            } else {
                gp = new GP(ap, lm);
            }
        } else {
            gp = new GP(ap, lm);
        }
        Object objO = gp.d;
        MN mn = MN.d;
        int i2 = gp.g;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            C1699On1 c1699On1 = ap.f.f;
            gp.g = 1;
            objO = C4466ii.o(c1699On1, gp);
            if (objO == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objO);
        }
        C3279d22 c3279d22 = (C3279d22) objO;
        if (c3279d22 != null) {
            return c3279d22.h;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object f(AP ap, LM lm) {
        HP hp;
        ap.getClass();
        if (lm instanceof HP) {
            hp = (HP) lm;
            int i = hp.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                hp.g = i - Integer.MIN_VALUE;
            } else {
                hp = new HP(ap, lm);
            }
        } else {
            hp = new HP(ap, lm);
        }
        Object objO = hp.d;
        MN mn = MN.d;
        int i2 = hp.g;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            InterfaceC6396rf0<Boolean> interfaceC6396rf0L = ap.k.l();
            hp.g = 1;
            objO = C4466ii.o(interfaceC6396rf0L, hp);
            if (objO == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objO);
        }
        if (((Boolean) objO).booleanValue()) {
            return null;
        }
        return new Integer(R.string.auto_selection_asset_text);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:32:0x007a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object g(AP ap, LM lm) {
        IP ip;
        C3279d22 c3279d22;
        String strC;
        ap.getClass();
        if (lm instanceof IP) {
            ip = (IP) lm;
            int i = ip.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                ip.h = i - Integer.MIN_VALUE;
            } else {
                ip = new IP(ap, lm);
            }
        } else {
            ip = new IP(ap, lm);
        }
        Object objO = ip.e;
        MN mn = MN.d;
        int i2 = ip.h;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            C1699On1 c1699On1 = ap.f.f;
            ip.d = ap;
            ip.h = 1;
            objO = C4466ii.o(c1699On1, ip);
            if (objO != mn) {
            }
            return mn;
        }
        if (i2 == 1) {
            ap = (AP) ip.d;
            C1795Pt1.b(objO);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3279d22 = (C3279d22) ip.d;
            C1795Pt1.b(objO);
        }
        if (((C1709Or) objO).c) {
            strC = c3279d22.b();
        } else {
            strC = c3279d22.c();
        }
        if (strC == null) {
            return "";
        }
        return strC;
        C3279d22 c3279d23 = (C3279d22) objO;
        if (c3279d23 == null) {
            return null;
        }
        AbstractC7004uZ1 abstractC7004uZ1 = ap.e;
        ip.d = c3279d23;
        ip.h = 2;
        Object objA = abstractC7004uZ1.a(ip);
        if (objA != mn) {
            objO = objA;
            c3279d22 = c3279d23;
            if (((C1709Or) objO).c) {
                strC = c3279d22.b();
            } else {
                strC = c3279d22.c();
            }
            if (strC == null) {
                return "";
            }
            return strC;
        }
        return mn;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object h(AP ap, LM lm) {
        JP jp;
        ap.getClass();
        if (lm instanceof JP) {
            jp = (JP) lm;
            int i = jp.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                jp.g = i - Integer.MIN_VALUE;
            } else {
                jp = new JP(ap, lm);
            }
        } else {
            jp = new JP(ap, lm);
        }
        Object objO = jp.d;
        MN mn = MN.d;
        int i2 = jp.g;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            C1699On1 c1699On1 = ap.f.f;
            jp.g = 1;
            objO = C4466ii.o(c1699On1, jp);
            if (objO == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objO);
        }
        C3279d22 c3279d22 = (C3279d22) objO;
        if (c3279d22 != null) {
            return c3279d22.c;
        }
        return null;
    }

    @Override // defpackage.InterfaceC8023zP
    @NotNull
    public final C3735fC1 a() {
        return this.l;
    }
}
