package defpackage;

import com.pexpress.tool.R;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: mu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5399mu implements InterfaceC4976ku, InterfaceC7295vw0 {

    @NotNull
    public final C2726aU0 a;

    @NotNull
    public final InterfaceC3170cY b;

    @NotNull
    public final C3281d30 c;

    @NotNull
    public final MT0 d;

    @NotNull
    public final KW1 e;

    @NotNull
    public final List<C5819ou> f;

    @NotNull
    public final KW1 g;

    @NotNull
    public final KW1 h;

    @NotNull
    public final KW1 i;

    @NotNull
    public final KW1 j;

    /* JADX INFO: renamed from: mu$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robotdialogs.providers.BottomSheetDialogsDataProviderBase$images$1$5$1$1", f = "BottomSheetDialogsDataProviderBase.kt", l = {147}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public CQ0 d;
        public int e;
        public final /* synthetic */ CQ0 g;
        public final /* synthetic */ C5399mu h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CQ0 cq0, C5399mu c5399mu, JM jm) {
            super(2, jm);
            this.g = cq0;
            this.h = c5399mu;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new a(this.g, this.h, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            CQ0 cq0;
            MN mn = MN.d;
            int i = this.e;
            if (i == 0) {
                C1795Pt1.b(obj);
                CQ0 cq1 = this.g;
                this.d = cq1;
                this.e = 1;
                Object objD = this.h.d(this);
                if (objD == mn) {
                    return mn;
                }
                cq0 = cq1;
                obj = objD;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cq0 = this.d;
                C1795Pt1.b(obj);
            }
            List<C5819ou> list = ((C3668eu) obj).a;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                String str = ((C5819ou) it.next()).d;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            cq0.addAll(arrayList);
            return Unit.a;
        }
    }

    public C5399mu(@NotNull C4923kf appData, @NotNull C2726aU0 lossProfitLimitPopupLocalExperiment, @NotNull InterfaceC3170cY depositValuesProvider, @NotNull C3281d30 doubleStrategiesLocalExperiment, @NotNull MT0 lossLimitRemovedLocalExperiment) {
        String strE;
        NumberFormat currencyInstance;
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(lossProfitLimitPopupLocalExperiment, "lossProfitLimitPopupLocalExperiment");
        Intrinsics.checkNotNullParameter(depositValuesProvider, "depositValuesProvider");
        Intrinsics.checkNotNullParameter(doubleStrategiesLocalExperiment, "doubleStrategiesLocalExperiment");
        Intrinsics.checkNotNullParameter(lossLimitRemovedLocalExperiment, "lossLimitRemovedLocalExperiment");
        this.a = lossProfitLimitPopupLocalExperiment;
        this.b = depositValuesProvider;
        this.c = doubleStrategiesLocalExperiment;
        this.d = lossLimitRemovedLocalExperiment;
        this.e = XO0.b(new O4(this, 3));
        Integer numValueOf = Integer.valueOf(R.string.initial_amount_title);
        Integer numValueOf2 = Integer.valueOf(R.string.trading_options_amount_description_text);
        FF ff = (FF) appData.b.getValue();
        Integer numValueOf3 = Integer.valueOf(ff != null ? ff.k : 0);
        Locale locale = Locale.ROOT;
        String upperCase = "usd".toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        String upperCase2 = upperCase.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
        try {
            if (Intrinsics.a(upperCase2, "DEMO")) {
                currencyInstance = NumberFormat.getCurrencyInstance();
                DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
                decimalFormatSymbols.setCurrencySymbol("Đ");
                Intrinsics.c(currencyInstance, "null cannot be cast to non-null type java.text.DecimalFormat");
                ((DecimalFormat) currencyInstance).setDecimalFormatSymbols(decimalFormatSymbols);
            } else {
                currencyInstance = NumberFormat.getCurrencyInstance();
                currencyInstance.setCurrency(Currency.getInstance(upperCase2));
            }
            currencyInstance.setMaximumFractionDigits(0);
            strE = currencyInstance.format(numValueOf3);
            Intrinsics.checkNotNullExpressionValue(strE, "format(...)");
        } catch (IllegalArgumentException unused) {
            String str = new DecimalFormat("###,###,##0").format(numValueOf3);
            String upperCase3 = C5491nL.c(" ", upperCase2).toUpperCase(Locale.ROOT);
            strE = C6133qP.e(upperCase3, "toUpperCase(...)", str, upperCase3);
        }
        this.f = WE.f(new C5819ou(numValueOf, numValueOf2, VE.c("\u202a" + QO.o(strE)), null, 941), new C5819ou(Integer.valueOf(R.string.duration_title), Integer.valueOf(R.string.trading_options_time_description_text), null, null, 1005), new C5819ou(Integer.valueOf(R.string.bot_settings_trading_assets), Integer.valueOf(R.string.manual_selection_modal_text), null, null, 1005));
        this.g = XO0.b(new P4(this, 3));
        this.h = XO0.b(new R4(this, 3));
        this.i = XO0.b(new C4039gg(this, 1));
        this.j = XO0.b(new C0738Cg(this, 1));
    }

    @Override // defpackage.InterfaceC4976ku
    @NotNull
    public final C3668eu a() {
        return (C3668eu) this.h.getValue();
    }

    @Override // defpackage.InterfaceC4976ku
    @NotNull
    public final C3668eu b() {
        return (C3668eu) this.e.getValue();
    }

    @Override // defpackage.InterfaceC4976ku
    @NotNull
    public final C3668eu c() {
        return (C3668eu) this.i.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x013e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [ou[]] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.io.Serializable, ou[]] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object[], ou[]] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // defpackage.InterfaceC4976ku
    @Nullable
    public final Object d(@NotNull LM lm) {
        C5186lu c5186lu;
        Integer num;
        String[] strArr;
        ?? r13;
        Integer num2;
        int i;
        int i2;
        C5399mu c5399mu;
        ?? r15;
        ?? r11;
        int i3;
        int i4;
        Integer num3;
        ?? r12;
        C5399mu c5399mu2;
        ?? r6;
        String[] strArr2;
        ?? r9;
        Integer num4;
        Integer num5;
        Object objF;
        Integer num6;
        ?? r4;
        int i5;
        Integer num7;
        C5399mu c5399mu3;
        ?? r3;
        if (lm instanceof C5186lu) {
            c5186lu = (C5186lu) lm;
            int i6 = c5186lu.p;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c5186lu.p = i6 - Integer.MIN_VALUE;
            } else {
                c5186lu = new C5186lu(this, lm);
            }
        } else {
            c5186lu = new C5186lu(this, lm);
        }
        Object objF2 = c5186lu.n;
        MN mn = MN.d;
        int i7 = c5186lu.p;
        if (i7 == 0) {
            C1795Pt1.b(objF2);
            ?? r16 = new C5819ou[2];
            Integer num8 = new Integer(R.string.optimal_strategy_text);
            Integer num9 = new Integer(R.string.optimal_strategy_description);
            String[] strArr3 = new String[2];
            c5186lu.d = this;
            c5186lu.e = r16;
            c5186lu.g = strArr3;
            c5186lu.h = r16;
            c5186lu.i = num8;
            c5186lu.j = num9;
            c5186lu.k = strArr3;
            c5186lu.l = 0;
            c5186lu.m = 0;
            c5186lu.p = 1;
            Object objC = this.b.c(c5186lu);
            if (objC != mn) {
                num = num8;
                objF2 = objC;
                String[] strArr4 = strArr3;
                strArr = strArr4;
                r13 = r16;
                num2 = num9;
                i = 0;
                i2 = 0;
                c5399mu = this;
                r11 = strArr4;
                r15 = r16;
            }
            return mn;
        }
        if (i7 == 1) {
            i = c5186lu.m;
            i2 = c5186lu.l;
            String[] strArr5 = c5186lu.k;
            Integer num10 = c5186lu.j;
            num = c5186lu.i;
            C5819ou[] c5819ouArr = (C5819ou[]) c5186lu.h;
            String[] strArr6 = (String[]) c5186lu.g;
            C5819ou[] c5819ouArr2 = c5186lu.e;
            c5399mu = c5186lu.d;
            C1795Pt1.b(objF2);
            r11 = strArr5;
            num2 = num10;
            r15 = c5819ouArr;
            r13 = c5819ouArr2;
            strArr = strArr6;
        } else {
            if (i7 == 2) {
                i3 = c5186lu.m;
                i4 = c5186lu.l;
                String[] strArr7 = c5186lu.k;
                num2 = c5186lu.j;
                Integer num11 = c5186lu.i;
                C5819ou[] c5819ouArr3 = (C5819ou[]) c5186lu.h;
                String[] strArr8 = (String[]) c5186lu.g;
                C5819ou[] c5819ouArr4 = c5186lu.e;
                c5399mu2 = c5186lu.d;
                C1795Pt1.b(objF2);
                num3 = num11;
                r6 = c5819ouArr4;
                r9 = strArr7;
                r12 = c5819ouArr3;
                strArr2 = strArr8;
                Integer num12 = num2;
                r9[i3] = objF2;
                List listF = WE.f(strArr2);
                c5399mu2.getClass();
                r12[i4] = new C5819ou(num3, num12, listF, "https://assets.pbotservices.com/images/trading-options/optimal.png", 813);
                num4 = new Integer(R.string.aggressive_strategy_text);
                num5 = new Integer(R.string.aggressive_strategy_description);
                c5186lu.d = c5399mu2;
                c5186lu.e = r6;
                c5186lu.g = r6;
                c5186lu.h = num4;
                c5186lu.i = num5;
                c5186lu.j = null;
                c5186lu.k = null;
                c5186lu.l = 1;
                c5186lu.p = 3;
                objF = c5399mu2.b.f(c5186lu);
                if (objF != mn) {
                    num6 = num4;
                    ?? r5 = r6;
                    r4 = r5;
                    i5 = 1;
                    num7 = num5;
                    objF2 = objF;
                    c5399mu3 = c5399mu2;
                    r3 = r5;
                }
                return mn;
            }
            if (i7 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i8 = c5186lu.l;
            Integer num13 = c5186lu.i;
            Integer num14 = (Integer) c5186lu.h;
            C5819ou[] c5819ouArr5 = (C5819ou[]) c5186lu.g;
            C5819ou[] c5819ouArr6 = c5186lu.e;
            c5399mu3 = c5186lu.d;
            C1795Pt1.b(objF2);
            num6 = num14;
            r4 = c5819ouArr6;
            i5 = i8;
            num7 = num13;
            r3 = c5819ouArr5;
        }
        List listC = VE.c(objF2);
        c5399mu3.getClass();
        r3[i5] = new C5819ou(num6, num7, listC, "https://assets.pbotservices.com/images/trading-options/aggressive.png", 813);
        return new C3668eu(WE.f(r4), null, null);
        r11[i] = objF2;
        InterfaceC3170cY interfaceC3170cY = c5399mu.b;
        c5186lu.d = c5399mu;
        c5186lu.e = r13;
        c5186lu.g = strArr;
        c5186lu.h = r15;
        c5186lu.i = num;
        c5186lu.j = num2;
        c5186lu.k = strArr;
        c5186lu.l = i2;
        c5186lu.m = 1;
        c5186lu.p = 2;
        objF2 = interfaceC3170cY.f(c5186lu);
        if (objF2 != mn) {
            i3 = 1;
            i4 = i2;
            num3 = num;
            String[] strArr9 = strArr;
            r12 = r15;
            c5399mu2 = c5399mu;
            r6 = r13;
            strArr2 = strArr9;
            r9 = strArr9;
            Integer num15 = num2;
            r9[i3] = objF2;
            List listF2 = WE.f(strArr2);
            c5399mu2.getClass();
            r12[i4] = new C5819ou(num3, num15, listF2, "https://assets.pbotservices.com/images/trading-options/optimal.png", 813);
            num4 = new Integer(R.string.aggressive_strategy_text);
            num5 = new Integer(R.string.aggressive_strategy_description);
            c5186lu.d = c5399mu2;
            c5186lu.e = r6;
            c5186lu.g = r6;
            c5186lu.h = num4;
            c5186lu.i = num5;
            c5186lu.j = null;
            c5186lu.k = null;
            c5186lu.l = 1;
            c5186lu.p = 3;
            objF = c5399mu2.b.f(c5186lu);
            if (objF != mn) {
                num6 = num4;
                ?? r7 = r6;
                r4 = r7;
                i5 = 1;
                num7 = num5;
                objF2 = objF;
                c5399mu3 = c5399mu2;
                r3 = r7;
                List listC2 = VE.c(objF2);
                c5399mu3.getClass();
                r3[i5] = new C5819ou(num6, num7, listC2, "https://assets.pbotservices.com/images/trading-options/aggressive.png", 813);
                return new C3668eu(WE.f(r4), null, null);
            }
        }
        return mn;
    }

    @Override // defpackage.InterfaceC4976ku
    @NotNull
    public final C3668eu e() {
        return (C3668eu) this.j.getValue();
    }

    @Override // defpackage.InterfaceC7295vw0
    @NotNull
    public final C1021Fw0 f() throws Throwable {
        CQ0 cq0B = VE.b();
        List<C5819ou> list = b().a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String str = ((C5819ou) it.next()).d;
            if (str != null) {
                arrayList.add(str);
            }
        }
        cq0B.addAll(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = this.f.iterator();
        while (it2.hasNext()) {
            String str2 = ((C5819ou) it2.next()).d;
            if (str2 != null) {
                arrayList2.add(str2);
            }
        }
        cq0B.addAll(arrayList2);
        if (this.a.o()) {
            List<C5819ou> list2 = e().a;
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                String str3 = ((C5819ou) it3.next()).d;
                if (str3 != null) {
                    arrayList3.add(str3);
                }
            }
            cq0B.addAll(arrayList3);
            List<C5819ou> list3 = c().a;
            ArrayList arrayList4 = new ArrayList();
            Iterator<T> it4 = list3.iterator();
            while (it4.hasNext()) {
                String str4 = ((C5819ou) it4.next()).d;
                if (str4 != null) {
                    arrayList4.add(str4);
                }
            }
            cq0B.addAll(arrayList4);
        }
        if (this.c.o()) {
            C5189lv.o(new a(cq0B, this, null));
        }
        return new C1021Fw0(VE.a(cq0B), null, 2);
    }

    @Override // defpackage.InterfaceC7295vw0
    @NotNull
    public final EnumC7035uh1 getPriority() {
        return EnumC7035uh1.h;
    }
}
