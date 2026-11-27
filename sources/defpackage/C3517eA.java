package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: eA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3517eA implements KN, InterfaceC5583nl2 {

    @NotNull
    public final C2836aw d;
    public final /* synthetic */ KN e;

    public C3517eA(@NotNull KN delegate, @NotNull C2836aw channel) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.d = channel;
        this.e = delegate;
    }

    @Override // defpackage.KN
    @NotNull
    /* JADX INFO: renamed from: f */
    public final CoroutineContext getE() {
        return this.e.getE();
    }

    @Override // defpackage.InterfaceC5583nl2
    public final InterfaceC6245qw i0() {
        return this.d;
    }
}
