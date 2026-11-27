package defpackage;

import com.google.android.gms.common.ConnectionResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: mA0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.usecases.InitializeExecutorUseCaseImpl", f = "InitializeExecutorUseCaseImpl.kt", l = {ConnectionResult.API_DISABLED_FOR_CONNECTION, ConnectionResult.API_DISABLED_FOR_CONNECTION}, m = "reconnect")
public final class C5249mA0 extends LM {
    public C5036lA0 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C5036lA0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5249mA0(C5036lA0 c5036lA0, LM lm) {
        super(lm);
        this.g = c5036lA0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.c(this);
    }
}
