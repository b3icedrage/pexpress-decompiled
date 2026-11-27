package defpackage;

import com.google.android.gms.common.api.CommonStatusCodes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.SocketReadinessKt", f = "SocketReadiness.kt", l = {CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE, 22}, m = "reconnectUntilReady")
public final class NN1 extends LM {
    public FP1 d;
    public /* synthetic */ Object e;
    public int g;

    public NN1() {
        throw null;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return PN1.a(null, null, this);
    }
}
