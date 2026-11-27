package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Zl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.data_sources.AuthorizationDataSourceImpl", f = "AuthorizationDataSourceImpl.kt", l = {44}, m = "registerUser")
public final class C2579Zl extends LM {
    public C7698xq0 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C3224cm g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2579Zl(C3224cm c3224cm, LM lm) {
        super(lm);
        this.g = c3224cm;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.g(null, this);
    }
}
