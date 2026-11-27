package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: d11, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3274d11 extends AbstractC7346w92<InterfaceC6145qT> {

    @NotNull
    public final EnumC6172qb1 e;

    /* JADX WARN: Illegal instructions before constructor call */
    public C3274d11() {
        EnumC6172qb1 padding = EnumC6172qb1.e;
        Intrinsics.checkNotNullParameter(padding, "padding");
        C6926u92<InterfaceC6145qT> c6926u92 = C6354rT.b;
        EnumC6172qb1 enumC6172qb1 = EnumC6172qb1.d;
        super(c6926u92, 2, null);
        this.e = padding;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof C3274d11) {
            return this.e == ((C3274d11) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
