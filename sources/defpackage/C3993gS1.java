package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: gS1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3993gS1 {

    @NotNull
    public static final Set<MH1> a;

    static {
        Intrinsics.checkNotNullParameter(M72.e, "<this>");
        Intrinsics.checkNotNullParameter(S72.e, "<this>");
        Intrinsics.checkNotNullParameter(G72.e, "<this>");
        Intrinsics.checkNotNullParameter(C4352i82.e, "<this>");
        MH1[] elements = {Q72.b, W72.b, K72.b, C5243m82.b};
        Intrinsics.checkNotNullParameter(elements, "elements");
        a = C1526Mj.H(elements);
    }

    public static final boolean a(@NotNull MH1 mh1) {
        Intrinsics.checkNotNullParameter(mh1, "<this>");
        return mh1.m() && a.contains(mh1);
    }
}
