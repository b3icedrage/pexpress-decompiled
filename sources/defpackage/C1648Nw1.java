package defpackage;

import android.content.Context;
import com.pexpress.tool.R;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Nw1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1648Nw1 {

    @NotNull
    public final GP1 a;

    @NotNull
    public final GP1 b;

    @NotNull
    public final GP1 c;

    @NotNull
    public final GP1 d;

    @NotNull
    public final GP1 e;

    @NotNull
    public final GP1 f;

    @NotNull
    public final GP1 g;

    @NotNull
    public final GP1 h;

    @NotNull
    public final GP1 i;

    @NotNull
    public final GP1 j;

    @NotNull
    public final GP1 k;

    @NotNull
    public final C5653o60 l;

    @NotNull
    public final GP1 m;
    public float n;

    @NotNull
    public final GP1 o;

    public C1648Nw1(@NotNull Context context, @NotNull Nm2 indicatorsLocalDataProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(indicatorsLocalDataProvider, "indicatorsLocalDataProvider");
        Locale locale = Locale.ROOT;
        String upperCase = "usd".toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        this.a = C1589Ne.i(new C3489e3(R.string.main_robot_demo_account_text, new C7606xQ(upperCase, 9980.0d, 28)));
        C1589Ne.i(new K32());
        PQ pq = PQ.SEARCHING_FOR_SIGNALS;
        pq.d = true;
        this.b = C1589Ne.i(pq);
        this.c = C1589Ne.i(new C2153Uj(2, null, "EUR/GBP", "82%"));
        this.d = C1589Ne.i(Integer.valueOf(R.drawable.ic_arrow_up));
        indicatorsLocalDataProvider.getClass();
        this.e = C1589Ne.i(Nm2.b(context));
        String upperCase2 = "usd".toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
        this.f = C1589Ne.i(new C7396wQ(20.0d, upperCase2));
        String upperCase3 = "usd".toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
        this.g = C1589Ne.i(new C7606xQ(upperCase3, 0.0d, 28));
        String upperCase4 = "usd".toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase4, "toUpperCase(...)");
        this.h = C1589Ne.i(new J32(false, R.string.off_text, new C7396wQ(40.0d, upperCase4), R.drawable.ic_profit_limit_on));
        this.i = C1589Ne.i(Integer.valueOf(R.string.optimal_strategy_name_text));
        String upperCase5 = "usd".toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase5, "toUpperCase(...)");
        this.j = C1589Ne.i(new J32(true, R.string.on_text, new C7396wQ(40.0d, upperCase5), R.drawable.ic_profit_limit_on));
        this.k = C1589Ne.i(AbstractC7721xy.a.a);
        this.l = C5653o60.d;
        C1589Ne.i(60000L);
        C1589Ne.i(60000L);
        this.m = C1589Ne.i(new Pair(Long.valueOf(System.currentTimeMillis()), Float.valueOf(Float.NaN)));
        this.n = Float.NaN;
        this.o = C1589Ne.i(null);
    }
}
