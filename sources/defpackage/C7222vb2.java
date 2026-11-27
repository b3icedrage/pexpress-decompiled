package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: vb2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.repositories.UserRepositoryBase", f = "UserRepositoryBase.kt", l = {82}, m = "addUser$suspendImpl")
public final class C7222vb2 extends LM {
    public C7698xq0 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Ib2 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7222vb2(Ib2 ib2, LM lm) {
        super(lm);
        this.g = ib2;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return Ib2.A(this.g, null, this);
    }
}
