package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: vB1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "androidx.datastore.core.RunOnce", f = "DataStoreImpl.kt", l = {544, 497}, m = "runIfNeeded")
public final class C7142vB1 extends LM {
    public AbstractC7352wB1 d;
    public InterfaceC4117h21 e;
    public /* synthetic */ Object g;
    public final /* synthetic */ AbstractC7352wB1 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7142vB1(AbstractC7352wB1 abstractC7352wB1, LM lm) {
        super(lm);
        this.h = abstractC7352wB1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b(this);
    }
}
