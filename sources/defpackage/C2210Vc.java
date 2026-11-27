package defpackage;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Vc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2210Vc {

    @NotNull
    public static final C5638o21 a;

    @NotNull
    public static final C5638o21 b;

    @NotNull
    public static final C5638o21 c;

    @NotNull
    public static final C5638o21 d;

    @NotNull
    public static final C5638o21 e;

    static {
        C5638o21 c5638o21K = C5638o21.k("message");
        Intrinsics.checkNotNullExpressionValue(c5638o21K, "identifier(...)");
        a = c5638o21K;
        C5638o21 c5638o21K2 = C5638o21.k("replaceWith");
        Intrinsics.checkNotNullExpressionValue(c5638o21K2, "identifier(...)");
        b = c5638o21K2;
        C5638o21 c5638o21K3 = C5638o21.k("level");
        Intrinsics.checkNotNullExpressionValue(c5638o21K3, "identifier(...)");
        c = c5638o21K3;
        C5638o21 c5638o21K4 = C5638o21.k("expression");
        Intrinsics.checkNotNullExpressionValue(c5638o21K4, "identifier(...)");
        d = c5638o21K4;
        C5638o21 c5638o21K5 = C5638o21.k("imports");
        Intrinsics.checkNotNullExpressionValue(c5638o21K5, "identifier(...)");
        e = c5638o21K5;
    }

    @NotNull
    public static final C5822ov a(@NotNull RK0 rk0, @NotNull String message, @NotNull String replaceWith, @NotNull String level) {
        Intrinsics.checkNotNullParameter(rk0, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(replaceWith, "replaceWith");
        Intrinsics.checkNotNullParameter(level, "level");
        C5822ov value = new C5822ov(rk0, C4194hP1.a.o, PW0.e(new Pair(d, new C7193vS1(replaceWith)), new Pair(e, new C1059Gj(C5653o60.d, new C3477e0(rk0, 1)))));
        C1758Ph0 c1758Ph0 = C4194hP1.a.m;
        Pair pair = new Pair(a, new C7193vS1(message));
        Intrinsics.checkNotNullParameter(value, "value");
        Pair pair2 = new Pair(b, new C2292Wc(value));
        C1758Ph0 topLevelFqName = C4194hP1.a.n;
        Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
        C1758Ph0 c1758Ph0E = topLevelFqName.e();
        QC qc = new QC(c1758Ph0E, SI0.a(c1758Ph0E, "parent(...)", topLevelFqName, "shortName(...)"));
        C5638o21 c5638o21K = C5638o21.k(level);
        Intrinsics.checkNotNullExpressionValue(c5638o21K, "identifier(...)");
        return new C5822ov(rk0, c1758Ph0, PW0.e(pair, pair2, new Pair(c, new C6286r70(qc, c5638o21K))));
    }
}
