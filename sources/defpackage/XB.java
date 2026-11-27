package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class XB extends ZF0 implements WB {

    @NotNull
    public final C3956gG0 i;

    public XB(@NotNull C3956gG0 c3956gG0) {
        this.i = c3956gG0;
    }

    @Override // defpackage.InterfaceC2672aC0
    public final void a(@Nullable Throwable th) {
        this.i.B(l());
    }

    @Override // defpackage.WB
    public final boolean e(@NotNull Throwable th) {
        return l().I(th);
    }
}
