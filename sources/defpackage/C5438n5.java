package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: n5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5438n5 extends RecyclerView.C {

    @NotNull
    public final InterfaceC3699f3 u;

    @NotNull
    public final InterfaceC4119h3 v;

    @NotNull
    public final C4123h4 w;

    @Nullable
    public C5648o5 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5438n5(@NotNull InterfaceC3699f3 binding, @NotNull InterfaceC4119h3 accountItemResourceProvider, @NotNull C4123h4 onItemClick) {
        super(binding.b());
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(accountItemResourceProvider, "accountItemResourceProvider");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.u = binding;
        this.v = accountItemResourceProvider;
        this.w = onItemClick;
        binding.b().setOnClickListener(new ViewOnClickListenerC5228m5(this, 0));
    }

    public static String q(C5648o5 c5648o5, String str) {
        String strE;
        NumberFormat currencyInstance;
        Double dValueOf = Double.valueOf(c5648o5.a.getAmount());
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
}
