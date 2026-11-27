package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Th0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2070Th0 extends AbstractC4207hU<InterfaceC2966bZ1> {

    @NotNull
    public static final List<Integer> e = WE.f(0, 0, 0, 0, 0, 0, 0, 0, 0);

    @NotNull
    public static final List<Integer> f = WE.f(2, 1, 0, 2, 1, 0, 2, 1, 0);
    public final int c;
    public final int d;

    public C2070Th0() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2070Th0(int i) {
        List<Integer> zerosToAdd = e;
        Intrinsics.checkNotNullParameter(zerosToAdd, "zerosToAdd");
        super(C3175cZ1.d, zerosToAdd);
        this.c = 1;
        this.d = 9;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C2070Th0)) {
            return false;
        }
        C2070Th0 c2070Th0 = (C2070Th0) obj;
        return this.c == c2070Th0.c && this.d == c2070Th0.d;
    }

    public final int hashCode() {
        return (this.c * 31) + this.d;
    }
}
