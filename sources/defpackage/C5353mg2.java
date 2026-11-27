package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: mg2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.repositories.WebSocketConnectionRepositoryImpl", f = "WebSocketConnectionRepositoryImpl.kt", l = {29}, m = "ping")
public final class C5353mg2 extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ C5563ng2 e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5353mg2(C5563ng2 c5563ng2, LM lm) {
        super(lm);
        this.e = c5563ng2;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return this.e.d(this);
    }
}
