package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.experiments.remote.knowledge_base.KnowledgeBaseTestGroupKt", f = "KnowledgeBaseTestGroup.kt", l = {14}, m = "awaitKnowledgeBaseTestGroup")
public final class IK0 extends LM {
    public /* synthetic */ Object d;
    public int e;

    public IK0() {
        throw null;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return JK0.a(null, this);
    }
}
