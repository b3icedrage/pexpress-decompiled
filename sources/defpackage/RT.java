package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class RT extends AbstractC7346w92<InterfaceC6145qT> {

    @NotNull
    public final EnumC6172qb1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RT(@NotNull EnumC6172qb1 padding) {
        super(C6354rT.c, padding == EnumC6172qb1.e ? 2 : 1, padding == EnumC6172qb1.g ? 2 : null);
        Intrinsics.checkNotNullParameter(padding, "padding");
        this.e = padding;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof RT) {
            return this.e == ((RT) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
