package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: r31, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.app.services.NetworkManager", f = "NetworkManager.kt", l = {213}, m = "createNetworkErrorDialog")
public final class C6271r31 extends LM {
    public C6062q31 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C6062q31 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6271r31(C6062q31 c6062q31, LM lm) {
        super(lm);
        this.g = c6062q31;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.d(null, this);
    }
}
