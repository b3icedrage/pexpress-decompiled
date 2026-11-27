package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: e11, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3483e11 extends AbstractC7107v21<InterfaceC6145qT> {

    @NotNull
    public final C3693f11 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3483e11(@NotNull C3693f11 names) {
        super(C6354rT.b, names.a, "monthName");
        Intrinsics.checkNotNullParameter(names, "names");
        this.d = names;
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof C3483e11) && Intrinsics.a(this.d.a, ((C3483e11) obj).d.a);
    }

    public final int hashCode() {
        return this.d.a.hashCode();
    }
}
