package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class D20 implements InterfaceC4778jy {

    @NotNull
    public final A20 d;

    public D20(@NotNull A20 a20) {
        this.d = a20;
    }

    @Override // defpackage.InterfaceC4778jy
    public final void a(@Nullable Throwable th) {
        this.d.b();
    }

    @NotNull
    public final String toString() {
        return "DisposeOnCancel[" + this.d + ']';
    }
}
