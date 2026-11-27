package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: uq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7066uq extends C7576xG {

    @NotNull
    public final InterfaceC2630a10 d;

    public AbstractC7066uq(@NotNull InterfaceC2630a10 callbacks) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.d = callbacks;
    }

    public final void l() {
        this.d.b();
    }

    public void m() {
        this.d.onDismiss();
    }
}
