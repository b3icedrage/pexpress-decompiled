package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class ST extends AbstractC7107v21<InterfaceC6145qT> {

    @NotNull
    public final UT d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ST(@NotNull UT names) {
        super(C6354rT.d, names.a, "dayOfWeekName");
        Intrinsics.checkNotNullParameter(names, "names");
        this.d = names;
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof ST) && Intrinsics.a(this.d.a, ((ST) obj).d.a);
    }

    public final int hashCode() {
        return this.d.a.hashCode();
    }
}
