package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: s10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6472s10 extends P80 {

    @InterfaceC2691aI1("type")
    @NotNull
    public final String a;

    public C6472s10(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.a = type;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6472s10) && Intrinsics.a(this.a, ((C6472s10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C5807oq.b(new StringBuilder("DialogsProperty(type="), this.a, ")");
    }
}
