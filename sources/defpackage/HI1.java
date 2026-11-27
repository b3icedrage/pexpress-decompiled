package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.data_sources.SessionIdDataSourceImpl", f = "SessionIdDataSourceImpl.kt", l = {34, 35}, m = "getSessionId")
public final class HI1 extends LM {
    public II1 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ II1 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HI1(II1 ii1, LM lm) {
        super(lm);
        this.g = ii1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(this);
    }
}
