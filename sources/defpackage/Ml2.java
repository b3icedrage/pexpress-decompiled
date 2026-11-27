package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class Ml2 extends VL1<InterfaceC6145qT> {

    @NotNull
    public final EnumC6172qb1 d;

    /* JADX WARN: Illegal instructions before constructor call */
    public Ml2() {
        EnumC6172qb1 padding = EnumC6172qb1.e;
        Intrinsics.checkNotNullParameter(padding, "padding");
        C1063Gk0<InterfaceC6145qT, Integer> c1063Gk0 = C6354rT.a;
        EnumC6172qb1 enumC6172qb1 = EnumC6172qb1.d;
        super(c1063Gk0, 4, null);
        this.d = padding;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof Ml2) {
            return this.d == ((Ml2) obj).d;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.d.hashCode() * 31);
    }
}
