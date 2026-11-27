package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: b41, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.NetworkRetry", f = "NetworkRetry.kt", l = {89}, m = "isReady")
public final class C2867b41 extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ C2643a41 e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2867b41(C2643a41 c2643a41, LM lm) {
        super(lm);
        this.e = c2643a41;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return C2643a41.a(this.e, null, this);
    }
}
