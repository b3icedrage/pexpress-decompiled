package defpackage;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: k32, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.usecases.TradingNotificationController$createSuccessNotification$1", f = "TradingNotificationController.kt", l = {146, 147}, m = "invokeSuspend")
public final class C4800k32 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public Object d;
    public Object e;
    public D32 g;
    public int h;
    public final /* synthetic */ D32 i;
    public final /* synthetic */ long j;
    public final /* synthetic */ double k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4800k32(D32 d32, long j, double d, JM<? super C4800k32> jm) {
        super(2, jm);
        this.i = d32;
        this.j = j;
        this.k = d;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C4800k32(this.i, this.j, this.k, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C4800k32) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        InterfaceC0859Du0 interfaceC0859Du0;
        Number number;
        String upperCase;
        String strE;
        String str;
        NumberFormat currencyInstance;
        MN mn = MN.d;
        int i = this.h;
        D32 d32 = this.i;
        try {
            if (i == 0) {
                C1795Pt1.b(obj);
                InterfaceC0859Du0 interfaceC0859Du1 = d32.d;
                Long l = new Long(this.j);
                this.d = l;
                this.e = interfaceC0859Du1;
                this.h = 1;
                Object objD = d32.f.d(this);
                if (objD != mn) {
                    interfaceC0859Du0 = interfaceC0859Du1;
                    obj = objD;
                    number = l;
                }
                return mn;
            }
            if (i == 1) {
                interfaceC0859Du0 = (InterfaceC0859Du0) this.e;
                number = (Number) this.d;
                C1795Pt1.b(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d32 = this.g;
                str = (String) this.e;
                interfaceC0859Du0 = (InterfaceC0859Du0) this.d;
                C1795Pt1.b(obj);
            }
            d32.getClass();
            interfaceC0859Du0.i(str, D32.h(this.k, (String) obj));
            return Unit.a;
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
            if ((number instanceof Long) || (number instanceof Integer)) {
                currencyInstance.setMaximumFractionDigits(0);
            }
            strE = currencyInstance.format(number);
            Intrinsics.checkNotNullExpressionValue(strE, "format(...)");
        } catch (IllegalArgumentException unused) {
            String str2 = (((number instanceof Long) || (number instanceof Integer)) ? new DecimalFormat("###,###,##0") : new DecimalFormat("###,###,##0.00")).format(number);
            String upperCase2 = C5491nL.c(" ", upperCase).toUpperCase(Locale.ROOT);
            strE = C6133qP.e(upperCase2, "toUpperCase(...)", str2, upperCase2);
        }
        upperCase = ((String) obj).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        String strC = C5491nL.c("\u202a", QO.o(strE));
        EQ eq = d32.f;
        this.d = interfaceC0859Du0;
        this.e = strC;
        this.g = d32;
        this.h = 2;
        Object objA = eq.a(false, this);
        if (objA != mn) {
            str = strC;
            obj = objA;
            d32.getClass();
            interfaceC0859Du0.i(str, D32.h(this.k, (String) obj));
            return Unit.a;
        }
        return mn;
    }
}
