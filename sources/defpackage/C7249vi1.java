package defpackage;

import com.google.android.gms.common.ConnectionResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: vi1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.updaters.ProfileUpdater", f = "ProfileUpdater.kt", l = {ConnectionResult.API_DISABLED, ConnectionResult.API_DISABLED_FOR_CONNECTION}, m = "start")
public final class C7249vi1 extends LM {
    public C7039ui1 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C7039ui1 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7249vi1(C7039ui1 c7039ui1, LM lm) {
        super(lm);
        this.g = c7039ui1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b(this);
    }
}
