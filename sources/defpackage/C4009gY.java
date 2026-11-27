package defpackage;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: gY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4009gY implements V11 {

    @NotNull
    public final C4923kf a;

    @NotNull
    public final EQ b;

    @NotNull
    public final GP1 c;

    @NotNull
    public final GP1 d;

    @NotNull
    public final C1699On1 e;

    public C4009gY(@NotNull C4923kf appData, @NotNull EQ currencySignProvider) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(currencySignProvider, "currencySignProvider");
        this.a = appData;
        this.b = currencySignProvider;
        GP1 gp1I = C1589Ne.i(PW0.c());
        this.c = gp1I;
        C4466ii.f(gp1I);
        GP1 gp1I2 = C1589Ne.i(PW0.c());
        this.d = gp1I2;
        this.e = C4466ii.f(gp1I2);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC3170cY
    @Nullable
    public final Object a(@Nullable String str, @NotNull LM lm) {
        C3799fY c3799fY;
        C4009gY c4009gY;
        C4009gY c4009gY2;
        Object objValueOf;
        if (lm instanceof C3799fY) {
            c3799fY = (C3799fY) lm;
            int i = c3799fY.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3799fY.h = i - Integer.MIN_VALUE;
            } else {
                c3799fY = new C3799fY(this, lm);
            }
        } else {
            c3799fY = new C3799fY(this, lm);
        }
        Object objA = c3799fY.e;
        MN mn = MN.d;
        int i2 = c3799fY.h;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            if (str == null) {
                c3799fY.d = this;
                c3799fY.h = 1;
                objA = this.b.a(true, c3799fY);
                if (objA == mn) {
                    return mn;
                }
                c4009gY2 = this;
            } else {
                c4009gY = this;
            }
            Map map = (Map) c4009gY.e.d.getValue();
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            objValueOf = map.get(lowerCase);
            if (objValueOf == null) {
                objValueOf = Integer.valueOf(c4009gY.b.b(str).d);
            }
            return new Integer(((Number) objValueOf).intValue());
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c4009gY2 = c3799fY.d;
        C1795Pt1.b(objA);
        String str2 = (String) objA;
        c4009gY = c4009gY2;
        str = str2;
        Map map2 = (Map) c4009gY.e.d.getValue();
        String lowerCase2 = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        objValueOf = map2.get(lowerCase2);
        if (objValueOf == null) {
            objValueOf = Integer.valueOf(c4009gY.b.b(str).d);
        }
        return new Integer(((Number) objValueOf).intValue());
    }

    @Override // defpackage.V11
    @Nullable
    public final Unit b(@NotNull Map map) {
        this.c.setValue(map);
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC3170cY
    @Nullable
    public final Object c(@NotNull LM lm) {
        C3589eY c3589eY;
        C4009gY c4009gY;
        String str;
        C4009gY c4009gY2;
        Integer num;
        int iIntValue;
        if (lm instanceof C3589eY) {
            c3589eY = (C3589eY) lm;
            int i = c3589eY.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3589eY.i = i - Integer.MIN_VALUE;
            } else {
                c3589eY = new C3589eY(this, lm);
            }
        } else {
            c3589eY = new C3589eY(this, lm);
        }
        Object objA = c3589eY.g;
        MN mn = MN.d;
        int i2 = c3589eY.i;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            c3589eY.d = this;
            c3589eY.i = 1;
            objA = this.b.a(true, c3589eY);
            if (objA != mn) {
                c4009gY = this;
            }
            return mn;
        }
        if (i2 == 1) {
            c4009gY = c3589eY.d;
            C1795Pt1.b(objA);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c3589eY.e;
            c4009gY2 = c3589eY.d;
            C1795Pt1.b(objA);
        }
        num = ((FF) objA).x.get(new C6141qR1("OPTIMAL", str));
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 100;
        }
        return c4009gY2.d(iIntValue);
        String str2 = (String) objA;
        GP1 gp1 = c4009gY.a.b;
        c3589eY.d = c4009gY;
        c3589eY.e = str2;
        c3589eY.i = 2;
        Object objA2 = C7236vf0.a(gp1, c3589eY);
        if (objA2 != mn) {
            str = str2;
            objA = objA2;
            c4009gY2 = c4009gY;
            num = ((FF) objA).x.get(new C6141qR1("OPTIMAL", str));
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 100;
            }
            return c4009gY2.d(iIntValue);
        }
        return mn;
    }

    @Override // defpackage.InterfaceC3170cY
    @NotNull
    public final String d(int i) {
        String strE;
        NumberFormat currencyInstance;
        Integer numValueOf = Integer.valueOf(i);
        String upperCase = ((String) this.a.F.d.getValue()).toUpperCase(Locale.ROOT);
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
            strE = currencyInstance.format(numValueOf);
            Intrinsics.checkNotNullExpressionValue(strE, "format(...)");
        } catch (IllegalArgumentException unused) {
            String str = new DecimalFormat("###,###,##0").format(numValueOf);
            String upperCase2 = C5491nL.c(" ", upperCase).toUpperCase(Locale.ROOT);
            strE = C6133qP.e(upperCase2, "toUpperCase(...)", str, upperCase2);
        }
        return C5491nL.c("\u202a", QO.o(strE));
    }

    @Override // defpackage.V11
    @Nullable
    public final Unit e(@NotNull Map map) {
        this.d.setValue(map);
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC3170cY
    @Nullable
    public final Object f(@NotNull LM lm) {
        C3380dY c3380dY;
        C4009gY c4009gY;
        String str;
        C4009gY c4009gY2;
        Integer num;
        int iIntValue;
        if (lm instanceof C3380dY) {
            c3380dY = (C3380dY) lm;
            int i = c3380dY.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3380dY.i = i - Integer.MIN_VALUE;
            } else {
                c3380dY = new C3380dY(this, lm);
            }
        } else {
            c3380dY = new C3380dY(this, lm);
        }
        Object objA = c3380dY.g;
        MN mn = MN.d;
        int i2 = c3380dY.i;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            c3380dY.d = this;
            c3380dY.i = 1;
            objA = this.b.a(true, c3380dY);
            if (objA != mn) {
                c4009gY = this;
            }
            return mn;
        }
        if (i2 == 1) {
            c4009gY = c3380dY.d;
            C1795Pt1.b(objA);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c3380dY.e;
            c4009gY2 = c3380dY.d;
            C1795Pt1.b(objA);
        }
        num = ((FF) objA).x.get(new C6141qR1("AGGRESSIVE", str));
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 10;
        }
        return c4009gY2.d(iIntValue);
        String str2 = (String) objA;
        GP1 gp1 = c4009gY.a.b;
        c3380dY.d = c4009gY;
        c3380dY.e = str2;
        c3380dY.i = 2;
        Object objA2 = C7236vf0.a(gp1, c3380dY);
        if (objA2 != mn) {
            str = str2;
            objA = objA2;
            c4009gY2 = c4009gY;
            num = ((FF) objA).x.get(new C6141qR1("AGGRESSIVE", str));
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 10;
            }
            return c4009gY2.d(iIntValue);
        }
        return mn;
    }
}
