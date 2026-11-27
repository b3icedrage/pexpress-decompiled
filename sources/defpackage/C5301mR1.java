package defpackage;

import com.pexpress.tool.R;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: mR1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5301mR1 implements InterfaceC7295vw0, InterfaceC4878kR1 {

    @NotNull
    public final EQ a;

    @NotNull
    public final InterfaceC0565Aa0 b;

    @NotNull
    public final List<C3496e42> c;

    @NotNull
    public final GP1 d;

    @NotNull
    public final C5981pg0 e;

    @NotNull
    public final C1699On1 f;

    @NotNull
    public final EnumC7035uh1 g;

    /* JADX INFO: renamed from: mR1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.strategyselection.providers.StrategiesProviderBase$strategiesAsync$1", f = "StrategiesProviderBase.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements InterfaceC1216Ij0<List<? extends C3496e42>, Boolean, C6945uG, FF, JM<? super List<? extends C3496e42>>, Object> {
        public /* synthetic */ List d;
        public /* synthetic */ boolean e;
        public /* synthetic */ C6945uG g;
        public /* synthetic */ FF h;

        public a(JM<? super a> jm) {
            super(5, jm);
        }

        @Override // defpackage.InterfaceC1216Ij0
        public final Object c(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            a aVar = C5301mR1.this.new a((JM) serializable);
            aVar.d = (List) obj;
            aVar.e = zBooleanValue;
            aVar.g = (C6945uG) obj3;
            aVar.h = (FF) obj4;
            return aVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:44:0x0166  */
        /* JADX WARN: Code duplicated, block: B:45:0x0168  */
        /* JADX WARN: Code duplicated, block: B:47:0x017c  */
        /* JADX WARN: Code duplicated, block: B:50:0x0184  */
        /* JADX WARN: Code duplicated, block: B:52:0x018a  */
        /* JADX WARN: Code duplicated, block: B:53:0x018d  */
        /* JADX WARN: Code duplicated, block: B:55:0x01a3 A[LOOP:1: B:46:0x017a->B:55:0x01a3, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:70:0x01a6 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:73:0x0182 A[EDGE_INSN: B:73:0x0182->B:49:0x0182 BREAK  A[LOOP:1: B:46:0x017a->B:55:0x01a3], SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            boolean z;
            String strC;
            String str;
            int i;
            String str2;
            EnumC2868b42 modelAvailability;
            EnumC5511nR1[] enumC5511nR1ArrValues;
            int length;
            int i2;
            EnumC5511nR1 enumC5511nR1;
            boolean z2;
            String strE;
            NumberFormat currencyInstance;
            String strE2;
            NumberFormat currencyInstance2;
            MN mn = MN.d;
            C1795Pt1.b(obj);
            List list = this.d;
            boolean z3 = this.e;
            C6945uG c6945uG = this.g;
            FF ff = this.h;
            String lowerCase = c6945uG.g.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            C5301mR1.this.a.b(lowerCase);
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C3496e42 c3496e42 = (C3496e42) it.next();
                Integer num = ff.w.get(new C6141qR1(c3496e42.a.name(), "usd"));
                Iterator it2 = it;
                if (num != null) {
                    Locale locale = Locale.ROOT;
                    String upperCase = "usd".toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    String upperCase2 = upperCase.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                    try {
                        if (Intrinsics.a(upperCase2, "DEMO")) {
                            NumberFormat currencyInstance3 = NumberFormat.getCurrencyInstance();
                            z = z3;
                            try {
                                DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
                                decimalFormatSymbols.setCurrencySymbol("Đ");
                                Intrinsics.c(currencyInstance3, "null cannot be cast to non-null type java.text.DecimalFormat");
                                ((DecimalFormat) currencyInstance3).setDecimalFormatSymbols(decimalFormatSymbols);
                                currencyInstance2 = currencyInstance3;
                            } catch (IllegalArgumentException unused) {
                                String str3 = new DecimalFormat("###,###,##0").format(num);
                                String upperCase3 = C5491nL.c(" ", upperCase2).toUpperCase(Locale.ROOT);
                                strE2 = C6133qP.e(upperCase3, "toUpperCase(...)", str3, upperCase3);
                            }
                        } else {
                            z = z3;
                            currencyInstance2 = NumberFormat.getCurrencyInstance();
                            currencyInstance2.setCurrency(Currency.getInstance(upperCase2));
                        }
                        currencyInstance2.setMaximumFractionDigits(0);
                        strE2 = currencyInstance2.format(num);
                        Intrinsics.checkNotNullExpressionValue(strE2, "format(...)");
                    } catch (IllegalArgumentException unused2) {
                        z = z3;
                    }
                    strC = C5491nL.c("\u202a", QO.o(strE2));
                } else {
                    z = z3;
                    strC = null;
                }
                if (strC == null) {
                    strC = "";
                }
                EnumC2644a42 enumC2644a42 = c3496e42.a;
                Integer num2 = ff.w.get(new C6141qR1(enumC2644a42.name(), lowerCase));
                if (num2 != null) {
                    Integer numValueOf = Integer.valueOf(num2.intValue());
                    String upperCase4 = lowerCase.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase4, "toUpperCase(...)");
                    try {
                        if (Intrinsics.a(upperCase4, "DEMO")) {
                            currencyInstance = NumberFormat.getCurrencyInstance();
                            str = strC;
                            try {
                                DecimalFormatSymbols decimalFormatSymbols2 = DecimalFormatSymbols.getInstance();
                                decimalFormatSymbols2.setCurrencySymbol("Đ");
                                Intrinsics.c(currencyInstance, "null cannot be cast to non-null type java.text.DecimalFormat");
                                ((DecimalFormat) currencyInstance).setDecimalFormatSymbols(decimalFormatSymbols2);
                            } catch (IllegalArgumentException unused3) {
                                i = 0;
                                String str4 = new DecimalFormat("###,###,##0").format(numValueOf);
                                String upperCase5 = C5491nL.c(" ", upperCase4).toUpperCase(Locale.ROOT);
                                strE = C6133qP.e(upperCase5, "toUpperCase(...)", str4, upperCase5);
                            }
                        } else {
                            str = strC;
                            currencyInstance = NumberFormat.getCurrencyInstance();
                            currencyInstance.setCurrency(Currency.getInstance(upperCase4));
                        }
                        i = 0;
                        currencyInstance.setMaximumFractionDigits(0);
                        strE = currencyInstance.format(numValueOf);
                        Intrinsics.checkNotNullExpressionValue(strE, "format(...)");
                    } catch (IllegalArgumentException unused4) {
                        str = strC;
                    }
                    String strC2 = C5491nL.c("\u202a", QO.o(strE));
                    if (strC2 != null) {
                        str2 = strC2;
                    }
                    if (z) {
                        enumC5511nR1 = null;
                    } else {
                        EnumC5511nR1.a aVar = EnumC5511nR1.e;
                        modelAvailability = enumC2644a42.e;
                        aVar.getClass();
                        Intrinsics.checkNotNullParameter(modelAvailability, "modelAvailability");
                        enumC5511nR1ArrValues = EnumC5511nR1.values();
                        length = enumC5511nR1ArrValues.length;
                        i2 = i;
                        while (true) {
                            if (i2 < length) {
                                throw new NoSuchElementException("Array contains no element matching the predicate.");
                            }
                            enumC5511nR1 = enumC5511nR1ArrValues[i2];
                            if (enumC5511nR1.d == modelAvailability) {
                                break;
                            }
                            i2++;
                        }
                    }
                    if (z) {
                        z2 = i;
                    } else {
                        if (c3496e42.c == EnumC5511nR1.PRO) {
                            z2 = 1;
                        } else {
                            z2 = i;
                        }
                    }
                    arrayList.add(C3496e42.a(c3496e42, enumC5511nR1, c3496e42.e, str2, z2, false, 62955));
                    it = it2;
                    z3 = z;
                } else {
                    str = strC;
                    i = 0;
                }
                str2 = str;
                if (z) {
                    enumC5511nR1 = null;
                } else {
                    EnumC5511nR1.a aVar2 = EnumC5511nR1.e;
                    modelAvailability = enumC2644a42.e;
                    aVar2.getClass();
                    Intrinsics.checkNotNullParameter(modelAvailability, "modelAvailability");
                    enumC5511nR1ArrValues = EnumC5511nR1.values();
                    length = enumC5511nR1ArrValues.length;
                    i2 = i;
                    while (true) {
                        if (i2 < length) {
                            throw new NoSuchElementException("Array contains no element matching the predicate.");
                        }
                        enumC5511nR1 = enumC5511nR1ArrValues[i2];
                        if (enumC5511nR1.d == modelAvailability) {
                            break;
                            break;
                        }
                        i2++;
                    }
                }
                if (z) {
                    if (c3496e42.c == EnumC5511nR1.PRO) {
                        z2 = 1;
                    } else {
                        z2 = i;
                    }
                } else {
                    z2 = i;
                }
                arrayList.add(C3496e42.a(c3496e42, enumC5511nR1, c3496e42.e, str2, z2, false, 62955));
                it = it2;
                z3 = z;
            }
            return arrayList;
        }
    }

    public C5301mR1(@NotNull C4923kf appData, @NotNull EQ currencySignProvider, @NotNull MR1 strategySelectionUseCase, @NotNull InterfaceC0565Aa0 experimentsProviderApi) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(currencySignProvider, "currencySignProvider");
        Intrinsics.checkNotNullParameter(strategySelectionUseCase, "strategySelectionUseCase");
        Intrinsics.checkNotNullParameter(experimentsProviderApi, "experimentsProviderApi");
        this.a = currencySignProvider;
        this.b = experimentsProviderApi;
        EnumC2644a42 enumC2644a42 = EnumC2644a42.g;
        EnumC5511nR1 enumC5511nR1 = EnumC5511nR1.FREE;
        EnumC7290vu1 enumC7290vu1 = EnumC7290vu1.LOW;
        List<C3496e42> listF = WE.f(new C3496e42(enumC2644a42, R.string.strategy_fixed_amount_title, enumC5511nR1, R.string.strategy_fixed_amount_text, enumC7290vu1, R.drawable.conservative_strategy_illustration_bg, d("fixed"), c("fixed"), 7112), new C3496e42(EnumC2644a42.h, R.string.strategy_conservative_title, enumC5511nR1, R.string.strategy_conservative_text, enumC7290vu1, R.drawable.cautious_strategy_illustration_bg, d("conservative"), c("conservative"), 39880), new C3496e42(EnumC2644a42.i, R.string.strategy_optimal_title, enumC5511nR1, R.string.strategy_optimal_text, EnumC7290vu1.MEDIUM, R.drawable.moderate_strategy_illustration_bg, d("optimal"), c("optimal"), 39880), new C3496e42(EnumC2644a42.j, R.string.strategy_agressive_title, EnumC5511nR1.PRO, R.string.strategy_agressive_text, EnumC7290vu1.HIGH, R.drawable.aggressive_strategy_illustration_bg, d("agressive"), c("agressive"), 39880));
        this.c = listF;
        GP1 gp1I = C1589Ne.i(listF);
        this.d = gp1I;
        C5981pg0 c5981pg0L = C4466ii.l(gp1I, appData.e, new C4250hg0(appData.k, 0), new C4250hg0(appData.b, 0), new a(null));
        this.e = c5981pg0L;
        this.f = C4466ii.E(c5981pg0L, C3784fT.a, IK1.a.a, C5653o60.d);
        C4466ii.v(LN.a(C6266r20.a), new C6610sg0(appData.e, strategySelectionUseCase.k(), new C5088lR1(this, null)));
        this.g = EnumC7035uh1.d;
    }

    public static String c(String str) {
        return C1039Gc0.d("https://assets.pbotservices.com/images/strategy-charts/", str, ".png");
    }

    public static String d(String str) {
        return C1039Gc0.d("https://assets.pbotservices.com/images/strategies/mini/", str, ".png");
    }

    @Override // defpackage.InterfaceC4878kR1
    @NotNull
    public final C1699On1 a() {
        return this.f;
    }

    @Override // defpackage.InterfaceC4878kR1
    @NotNull
    public final InterfaceC6396rf0<List<C3496e42>> b() {
        return this.e;
    }

    @Override // defpackage.InterfaceC7295vw0
    @NotNull
    public final C1021Fw0 f() {
        CQ0 cq0B = VE.b();
        GP1 gp1 = this.d;
        Iterable iterable = (Iterable) gp1.getValue();
        ArrayList arrayList = new ArrayList(XE.m(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((C3496e42) it.next()).o);
        }
        cq0B.addAll(arrayList);
        Iterable iterable2 = (Iterable) gp1.getValue();
        ArrayList arrayList2 = new ArrayList(XE.m(iterable2, 10));
        Iterator it2 = iterable2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C3496e42) it2.next()).n);
        }
        cq0B.addAll(arrayList2);
        return new C1021Fw0(VE.a(cq0B), null, 2);
    }

    @Override // defpackage.InterfaceC7295vw0
    @NotNull
    public final EnumC7035uh1 getPriority() {
        return this.g;
    }
}
