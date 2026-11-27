package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: jc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.support.usecases.FetchKnowledgeBaseValuesUseCaseBase", f = "FetchKnowledgeBaseValuesUseCaseBase.kt", l = {36}, m = "updateValues")
public final class C4702jc0 extends LM {
    public C4444ic0 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C4444ic0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4702jc0(C4444ic0 c4444ic0, LM lm) {
        super(lm);
        this.g = c4444ic0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.d(false, this);
    }
}
