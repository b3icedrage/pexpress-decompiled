package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Yc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.updaters.PendingDepositUpdater", f = "PendingDepositUpdater.kt", l = {30, 31}, m = "start")
public final class C2476Yc1 extends LM {
    public C2554Zc1 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C2554Zc1 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2476Yc1(C2554Zc1 c2554Zc1, LM lm) {
        super(lm);
        this.g = c2554Zc1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b(this);
    }
}
