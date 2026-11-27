package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.repositories.SupportRepositoryBase", f = "SupportRepositoryBase.kt", l = {16}, m = "getKnowledgeBaseValues")
public final class ZV1 extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ C2957bW1 e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZV1(C2957bW1 c2957bW1, LM lm) {
        super(lm);
        this.e = c2957bW1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return this.e.a(null, this);
    }
}
