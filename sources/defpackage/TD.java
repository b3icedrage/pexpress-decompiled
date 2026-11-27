package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class TD extends AbstractC1075Go0 {

    @NotNull
    public final C0997Fo0 a;

    @NotNull
    public final AbstractC3926g70 b;

    public TD(@NotNull C0997Fo0 message, @NotNull AbstractC3926g70 position) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(position, "position");
        this.a = message;
        this.b = position;
    }

    @Override // defpackage.AbstractC7844yZ0
    @NotNull
    public final AbstractC3926g70 c() {
        return this.b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TD)) {
            return false;
        }
        TD td = (TD) obj;
        return Intrinsics.a(this.a, td.a) && Intrinsics.a(this.b, td.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "ClientMessageEntry(message=" + this.a + ", position=" + this.b + ')';
    }
}
