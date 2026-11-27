package defpackage;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: bu1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3042bu1 implements Comparator<Comparable<? super Object>> {

    @NotNull
    public static final C3042bu1 a = new C3042bu1();

    @Override // java.util.Comparator
    public final int compare(Comparable<? super Object> comparable, Comparable<? super Object> comparable2) {
        Comparable<? super Object> a2 = comparable;
        Comparable<? super Object> b = comparable2;
        Intrinsics.checkNotNullParameter(a2, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return b.compareTo(a2);
    }

    @Override // java.util.Comparator
    @NotNull
    public final Comparator<Comparable<? super Object>> reversed() {
        return C7948z21.a;
    }
}
