package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class DI1 {

    @NotNull
    public final Pf2 a;

    @NotNull
    public final C5983pg2 b;

    public DI1(@NotNull Pf2 webSocket, @NotNull C5983pg2 webSocketDisposable) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(webSocketDisposable, "webSocketDisposable");
        this.a = webSocket;
        this.b = webSocketDisposable;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DI1)) {
            return false;
        }
        DI1 di1 = (DI1) obj;
        return this.a.equals(di1.a) && this.b.equals(di1.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "Session(webSocket=" + this.a + ", webSocketDisposable=" + this.b + ")";
    }
}
