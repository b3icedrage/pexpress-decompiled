package defpackage;

import android.content.Context;
import com.pexpress.tool.R;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class D32 {

    @NotNull
    public final C4923kf a;

    @NotNull
    public final AbstractC7004uZ1 b;

    @NotNull
    public final S02<?> c;

    @NotNull
    public final InterfaceC0859Du0 d;

    @NotNull
    public final ZL0 e;

    @NotNull
    public final EQ f;

    @Nullable
    public C2936bP1 g;

    @NotNull
    public String h;

    @NotNull
    public final String i;

    public D32(@NotNull Context context, @NotNull C4923kf appData, @NotNull AbstractC7004uZ1 timeSelectionsProvider, @NotNull S02<?> trader, @NotNull InterfaceC0859Du0 notificationManager, @NotNull ZL0 languageUseCase, @NotNull EQ currencySignProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(timeSelectionsProvider, "timeSelectionsProvider");
        Intrinsics.checkNotNullParameter(trader, "trader");
        Intrinsics.checkNotNullParameter(notificationManager, "notificationManager");
        Intrinsics.checkNotNullParameter(languageUseCase, "languageUseCase");
        Intrinsics.checkNotNullParameter(currencySignProvider, "currencySignProvider");
        this.a = appData;
        this.b = timeSelectionsProvider;
        this.c = trader;
        this.d = notificationManager;
        this.e = languageUseCase;
        this.f = currencySignProvider;
        this.h = "";
        String string = context.getString(R.string.profit_text);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.i = string;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final void a(D32 d32, LM lm) {
        C6272r32 c6272r32;
        d32.getClass();
        if (lm instanceof C6272r32) {
            c6272r32 = (C6272r32) lm;
            int i = c6272r32.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6272r32.g = i - Integer.MIN_VALUE;
            } else {
                c6272r32 = new C6272r32(d32, lm);
            }
        } else {
            c6272r32 = new C6272r32(d32, lm);
        }
        Object obj = c6272r32.d;
        MN mn = MN.d;
        int i2 = c6272r32.g;
        if (i2 != 0) {
            if (i2 == 1) {
                throw EK.c(obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C1795Pt1.b(obj);
        GP1 gp1 = d32.a.r;
        C6482s32 c6482s32 = new C6482s32(d32);
        c6272r32.g = 1;
        gp1.c(c6482s32, c6272r32);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final void b(D32 d32, KN kn, LM lm) {
        C6692t32 c6692t32;
        d32.getClass();
        if (lm instanceof C6692t32) {
            c6692t32 = (C6692t32) lm;
            int i = c6692t32.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6692t32.g = i - Integer.MIN_VALUE;
            } else {
                c6692t32 = new C6692t32(d32, lm);
            }
        } else {
            c6692t32 = new C6692t32(d32, lm);
        }
        Object obj = c6692t32.d;
        MN mn = MN.d;
        int i2 = c6692t32.g;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            C1621Nn1 c1621Nn1 = d32.c.M;
            C6902u32 c6902u32 = new C6902u32(d32, kn);
            c6692t32.g = 1;
            if (c1621Nn1.d.c(c6902u32, c6692t32) == mn) {
                return;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        throw new C3342dL0();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object c(D32 d32, KN kn, JM jm) {
        C7112v32 c7112v32;
        KN kn2;
        D32 d33;
        C2255Vr c2255Vr;
        InterfaceC6396rf0 interfaceC6396rf0;
        Object objO;
        InterfaceC6396rf0 interfaceC6396rf1;
        D32 d34;
        d32.getClass();
        if (jm instanceof C7112v32) {
            c7112v32 = (C7112v32) jm;
            int i = c7112v32.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7112v32.l = i - Integer.MIN_VALUE;
            } else {
                c7112v32 = new C7112v32(d32, jm);
            }
        } else {
            c7112v32 = new C7112v32(d32, jm);
        }
        Object objE = c7112v32.j;
        MN mn = MN.d;
        int i2 = c7112v32.l;
        if (i2 == 0) {
            C1795Pt1.b(objE);
            c7112v32.d = d32;
            c7112v32.e = kn;
            c7112v32.l = 1;
            objE = d32.e(c7112v32);
            if (objE != mn) {
            }
            return mn;
        }
        if (i2 == 1) {
            kn = c7112v32.e;
            d32 = c7112v32.d;
            C1795Pt1.b(objE);
        } else {
            if (i2 == 2) {
                c2255Vr = (C2255Vr) c7112v32.g;
                KN kn3 = c7112v32.e;
                D32 d35 = c7112v32.d;
                C1795Pt1.b(objE);
                kn2 = kn3;
                d33 = d35;
                interfaceC6396rf0 = (InterfaceC6396rf0) objE;
                c7112v32.d = d33;
                c7112v32.e = kn2;
                c7112v32.g = interfaceC6396rf0;
                c7112v32.h = d33;
                c7112v32.i = c2255Vr;
                c7112v32.l = 3;
                objO = C4466ii.o(interfaceC6396rf0, c7112v32);
                if (objO != mn) {
                    interfaceC6396rf1 = interfaceC6396rf0;
                    objE = objO;
                    d34 = d33;
                }
                return mn;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2255Vr = c7112v32.i;
            d33 = c7112v32.h;
            interfaceC6396rf1 = (InterfaceC6396rf0) c7112v32.g;
            kn2 = c7112v32.e;
            d34 = c7112v32.d;
            C1795Pt1.b(objE);
        }
        d33.getClass();
        String str = c2255Vr.a;
        String str2 = c2255Vr.b;
        String str3 = c2255Vr.c;
        d33.d.c(str, str2, str3, (Integer) objE);
        C5189lv.k(kn2, null, new C7322w32(d34, interfaceC6396rf1, null), 3);
        return Unit.a;
        C2255Vr c2255Vr2 = (C2255Vr) objE;
        d32.h = c2255Vr2.c;
        c7112v32.d = d32;
        c7112v32.e = kn;
        c7112v32.g = c2255Vr2;
        c7112v32.l = 2;
        C5643o32 c5643o32 = new C5643o32(new C3735fC1(new C5853p32(d32.c.K, null, d32)));
        if (c5643o32 != mn) {
            kn2 = kn;
            d33 = d32;
            c2255Vr = c2255Vr2;
            objE = c5643o32;
            interfaceC6396rf0 = (InterfaceC6396rf0) objE;
            c7112v32.d = d33;
            c7112v32.e = kn2;
            c7112v32.g = interfaceC6396rf0;
            c7112v32.h = d33;
            c7112v32.i = c2255Vr;
            c7112v32.l = 3;
            objO = C4466ii.o(interfaceC6396rf0, c7112v32);
            if (objO != mn) {
                interfaceC6396rf1 = interfaceC6396rf0;
                objE = objO;
                d34 = d33;
                d33.getClass();
                String str4 = c2255Vr.a;
                String str5 = c2255Vr.b;
                String str6 = c2255Vr.c;
                d33.d.c(str4, str5, str6, (Integer) objE);
                C5189lv.k(kn2, null, new C7322w32(d34, interfaceC6396rf1, null), 3);
                return Unit.a;
            }
        }
        return mn;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
    
        if (r2.c(r7, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.D32 r6, defpackage.InterfaceC6396rf0 r7, defpackage.LM r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof defpackage.C7743y32
            if (r0 == 0) goto L16
            r0 = r8
            y32 r0 = (defpackage.C7743y32) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.i = r1
            goto L1b
        L16:
            y32 r0 = new y32
            r0.<init>(r6, r8)
        L1b:
            java.lang.Object r8 = r0.g
            MN r1 = defpackage.MN.d
            int r2 = r0.i
            r3 = 1
            r4 = 0
            r5 = 2
            if (r2 == 0) goto L40
            if (r2 == r3) goto L38
            if (r2 != r5) goto L30
            D32 r6 = r0.d
            defpackage.C1795Pt1.b(r8)
            goto L75
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            rf0 r7 = r0.e
            D32 r6 = r0.d
            defpackage.C1795Pt1.b(r8)
            goto L59
        L40:
            defpackage.C1795Pt1.b(r8)
            S02<?> r8 = r6.c
            On1 r8 = r8.K
            z32 r2 = new z32
            r2.<init>(r5, r4)
            r0.d = r6
            r0.e = r7
            r0.i = r3
            java.lang.Object r8 = defpackage.C4466ii.p(r8, r2, r0)
            if (r8 != r1) goto L59
            goto L74
        L59:
            A32 r8 = new A32
            r8.<init>(r5, r4)
            Pf0 r2 = new Pf0
            r2.<init>(r7, r8)
            C32 r7 = new C32
            r7.<init>(r6)
            r0.d = r6
            r0.e = r4
            r0.i = r5
            java.lang.Object r7 = r2.c(r7, r0)
            if (r7 != r1) goto L75
        L74:
            return r1
        L75:
            Du0 r7 = r6.d
            java.lang.String r6 = r6.h
            r7.d(r6)
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.D32.d(D32, rf0, LM):java.lang.Object");
    }

    public static String h(double d, String str) {
        String strE;
        NumberFormat currencyInstance;
        if (d < 0.0d) {
            d = 0.0d;
        }
        Double dValueOf = Double.valueOf(d);
        String upperCase = str.toUpperCase(Locale.ROOT);
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
            strE = currencyInstance.format(dValueOf);
            Intrinsics.checkNotNullExpressionValue(strE, "format(...)");
        } catch (IllegalArgumentException unused) {
            String str2 = new DecimalFormat("###,###,##0.00").format(dValueOf);
            String upperCase2 = C5491nL.c(" ", upperCase).toUpperCase(Locale.ROOT);
            strE = C6133qP.e(upperCase2, "toUpperCase(...)", str2, upperCase2);
        }
        return C5491nL.c("\u202a", QO.o(strE));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:43:0x013c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object e(LM lm) {
        C5010l32 c5010l32;
        D32 d32;
        D32 d33;
        String str;
        D32 d34;
        D32 d35;
        D32 d36;
        String str2;
        Object objA;
        D32 d37;
        String str3;
        D32 d38;
        String str4;
        Object objO;
        String str5;
        if (lm instanceof C5010l32) {
            c5010l32 = (C5010l32) lm;
            int i = c5010l32.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5010l32.j = i - Integer.MIN_VALUE;
            } else {
                c5010l32 = new C5010l32(this, lm);
            }
        } else {
            c5010l32 = new C5010l32(this, lm);
        }
        C5010l32 c5010l33 = c5010l32;
        Object objA2 = c5010l33.h;
        MN mn = MN.d;
        int i2 = c5010l33.j;
        if (i2 == 0) {
            C1795Pt1.b(objA2);
            c5010l33.d = this;
            c5010l33.e = this;
            c5010l33.j = 1;
            objA2 = this.f.a(false, c5010l33);
            if (objA2 != mn) {
                d32 = this;
                d33 = d32;
            }
            return mn;
        }
        if (i2 == 1) {
            d32 = (D32) c5010l33.e;
            d33 = (D32) c5010l33.d;
            C1795Pt1.b(objA2);
        } else {
            if (i2 == 2) {
                str = (String) c5010l33.g;
                d34 = (D32) c5010l33.e;
                d33 = (D32) c5010l33.d;
                C1795Pt1.b(objA2);
                d35 = d33;
                H32.a aVar = (H32.a) d35.c.E.d.getValue();
                int iIntValue = ((Number) d35.c.A.d.getValue()).intValue();
                c5010l33.d = d35;
                c5010l33.e = null;
                c5010l33.g = null;
                c5010l33.j = 3;
                objA2 = d34.f(str, (C3279d22) objA2, aVar, iIntValue, c5010l33);
                if (objA2 != mn) {
                    d36 = d35;
                    str2 = (String) objA2;
                    EQ eq = d36.f;
                    c5010l33.d = d36;
                    c5010l33.e = str2;
                    c5010l33.g = d36;
                    c5010l33.j = 4;
                    objA = eq.a(false, c5010l33);
                    if (objA != mn) {
                        d37 = d36;
                        str3 = str2;
                        objA2 = objA;
                        d38 = d37;
                        double dDoubleValue = ((Number) d37.c.G.d.getValue()).doubleValue();
                        d38.getClass();
                        str4 = d38.i + ": " + h(dDoubleValue, (String) objA2);
                        C1621Nn1 c1621Nn1 = d37.c.I;
                        c5010l33.d = str3;
                        c5010l33.e = str4;
                        c5010l33.g = null;
                        c5010l33.j = 5;
                        objO = C4466ii.o(c1621Nn1, c5010l33);
                        if (objO != mn) {
                            str5 = str4;
                            objA2 = objO;
                        }
                    }
                }
                return mn;
            }
            if (i2 == 3) {
                d36 = (D32) c5010l33.d;
                C1795Pt1.b(objA2);
                str2 = (String) objA2;
                EQ eq2 = d36.f;
                c5010l33.d = d36;
                c5010l33.e = str2;
                c5010l33.g = d36;
                c5010l33.j = 4;
                objA = eq2.a(false, c5010l33);
                if (objA != mn) {
                    d37 = d36;
                    str3 = str2;
                    objA2 = objA;
                    d38 = d37;
                    double dDoubleValue2 = ((Number) d37.c.G.d.getValue()).doubleValue();
                    d38.getClass();
                    str4 = d38.i + ": " + h(dDoubleValue2, (String) objA2);
                    C1621Nn1 c1621Nn2 = d37.c.I;
                    c5010l33.d = str3;
                    c5010l33.e = str4;
                    c5010l33.g = null;
                    c5010l33.j = 5;
                    objO = C4466ii.o(c1621Nn2, c5010l33);
                    if (objO != mn) {
                        str5 = str4;
                        objA2 = objO;
                    }
                }
                return mn;
            }
            if (i2 == 4) {
                D32 d39 = (D32) c5010l33.g;
                String str6 = (String) c5010l33.e;
                d37 = (D32) c5010l33.d;
                C1795Pt1.b(objA2);
                d38 = d39;
                str3 = str6;
                double dDoubleValue3 = ((Number) d37.c.G.d.getValue()).doubleValue();
                d38.getClass();
                str4 = d38.i + ": " + h(dDoubleValue3, (String) objA2);
                C1621Nn1 c1621Nn3 = d37.c.I;
                c5010l33.d = str3;
                c5010l33.e = str4;
                c5010l33.g = null;
                c5010l33.j = 5;
                objO = C4466ii.o(c1621Nn3, c5010l33);
                if (objO != mn) {
                    str5 = str4;
                    objA2 = objO;
                }
                return mn;
            }
            if (i2 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str5 = (String) c5010l33.e;
            str3 = (String) c5010l33.d;
            C1795Pt1.b(objA2);
        }
        return new C2255Vr(str3, str5, ((C3279d22) objA2).h);
        String str7 = (String) objA2;
        C1621Nn1 c1621Nn4 = d33.c.I;
        c5010l33.d = d33;
        c5010l33.e = d32;
        c5010l33.g = str7;
        c5010l33.j = 2;
        Object objO2 = C4466ii.o(c1621Nn4, c5010l33);
        if (objO2 != mn) {
            D32 d310 = d32;
            str = str7;
            objA2 = objO2;
            d34 = d310;
            d35 = d33;
            H32.a aVar2 = (H32.a) d35.c.E.d.getValue();
            int iIntValue2 = ((Number) d35.c.A.d.getValue()).intValue();
            c5010l33.d = d35;
            c5010l33.e = null;
            c5010l33.g = null;
            c5010l33.j = 3;
            objA2 = d34.f(str, (C3279d22) objA2, aVar2, iIntValue2, c5010l33);
            if (objA2 != mn) {
                d36 = d35;
                str2 = (String) objA2;
                EQ eq3 = d36.f;
                c5010l33.d = d36;
                c5010l33.e = str2;
                c5010l33.g = d36;
                c5010l33.j = 4;
                objA = eq3.a(false, c5010l33);
                if (objA != mn) {
                    d37 = d36;
                    str3 = str2;
                    objA2 = objA;
                    d38 = d37;
                    double dDoubleValue4 = ((Number) d37.c.G.d.getValue()).doubleValue();
                    d38.getClass();
                    str4 = d38.i + ": " + h(dDoubleValue4, (String) objA2);
                    C1621Nn1 c1621Nn5 = d37.c.I;
                    c5010l33.d = str3;
                    c5010l33.e = str4;
                    c5010l33.g = null;
                    c5010l33.j = 5;
                    objO = C4466ii.o(c1621Nn5, c5010l33);
                    if (objO != mn) {
                        str5 = str4;
                        objA2 = objO;
                        return new C2255Vr(str3, str5, ((C3279d22) objA2).h);
                    }
                }
            }
        }
        return mn;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object f(String str, C3279d22 c3279d22, H32.a aVar, int i, LM lm) {
        C5223m32 c5223m32;
        String str2;
        String str3;
        String str4;
        String strE;
        NumberFormat currencyInstance;
        if (lm instanceof C5223m32) {
            c5223m32 = (C5223m32) lm;
            int i2 = c5223m32.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c5223m32.k = i2 - Integer.MIN_VALUE;
            } else {
                c5223m32 = new C5223m32(this, lm);
            }
        } else {
            c5223m32 = new C5223m32(this, lm);
        }
        Object obj = c5223m32.i;
        Object obj2 = MN.d;
        int i3 = c5223m32.k;
        if (i3 == 0) {
            C1795Pt1.b(obj);
            String str5 = aVar == H32.a.PUT_DOWN ? "↓" : "↑";
            String str6 = c3279d22.c;
            c5223m32.d = str;
            c5223m32.e = str5;
            c5223m32.g = str6;
            c5223m32.h = i;
            c5223m32.k = 1;
            Object objG = g(c3279d22, c5223m32);
            if (objG == obj2) {
                return obj2;
            }
            String str7 = str5;
            str2 = str;
            str3 = str6;
            obj = objG;
            str4 = str7;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c5223m32.h;
            str3 = c5223m32.g;
            str4 = c5223m32.e;
            str2 = c5223m32.d;
            C1795Pt1.b(obj);
        }
        Integer num = new Integer(i);
        String upperCase = str2.toUpperCase(Locale.ROOT);
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
            strE = currencyInstance.format(num);
            Intrinsics.checkNotNullExpressionValue(strE, "format(...)");
        } catch (IllegalArgumentException unused) {
            String str8 = new DecimalFormat("###,###,##0").format(num);
            String upperCase2 = C5491nL.c(" ", upperCase).toUpperCase(Locale.ROOT);
            strE = C6133qP.e(upperCase2, "toUpperCase(...)", str8, upperCase2);
        }
        String strC = C5491nL.c("\u202a", QO.o(strE));
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        sb.append(" ");
        sb.append(obj);
        sb.append(" | ");
        sb.append(str4);
        return C5807oq.b(sb, " ", strC);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(C3279d22 c3279d22, LM lm) {
        C5433n32 c5433n32;
        String strC;
        if (lm instanceof C5433n32) {
            c5433n32 = (C5433n32) lm;
            int i = c5433n32.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5433n32.h = i - Integer.MIN_VALUE;
            } else {
                c5433n32 = new C5433n32(this, lm);
            }
        } else {
            c5433n32 = new C5433n32(this, lm);
        }
        Object objA = c5433n32.e;
        MN mn = MN.d;
        int i2 = c5433n32.h;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            c5433n32.d = c3279d22;
            c5433n32.h = 1;
            objA = this.b.a(c5433n32);
            if (objA == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3279d22 = c5433n32.d;
            C1795Pt1.b(objA);
        }
        if (((C1709Or) objA).c) {
            strC = c3279d22.b();
            if (strC == null) {
                strC = c3279d22.c();
            }
        } else {
            strC = c3279d22.c();
            if (strC == null) {
                strC = c3279d22.b();
            }
        }
        Intrinsics.checkNotNull(strC);
        return strC;
    }

    public final void i() {
        C2936bP1 c2936bP1 = this.g;
        if (c2936bP1 != null) {
            c2936bP1.l(null);
        }
        this.d.g(false);
    }
}
