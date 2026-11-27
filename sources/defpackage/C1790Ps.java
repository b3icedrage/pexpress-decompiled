package defpackage;

import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Ps, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1790Ps {

    @NotNull
    public static final Set<Pair<LJ1, String>> b;

    @NotNull
    public static final Set<String> c;

    @NotNull
    public final C6295r91 a = new C6295r91();

    static {
        Pair pair = new Pair(LJ1.Start, "activation_required");
        LJ1 lj1 = LJ1.Indicator;
        Pair pair2 = new Pair(lj1, "pair_unavailable");
        Pair pair3 = new Pair(lj1, "locked");
        LJ1 lj2 = LJ1.Asset;
        Pair[] elements = {pair, pair2, pair3, new Pair(lj2, "not_best_in_auto_mode"), new Pair(lj2, "indicator_unsupported")};
        Intrinsics.checkNotNullParameter(elements, "elements");
        b = C1526Mj.H(elements);
        String[] elements2 = {"already_trading", "already_started"};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        c = C1526Mj.H(elements2);
    }
}
