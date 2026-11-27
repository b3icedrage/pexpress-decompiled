package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Aq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.library.registration.usecases.RegisterUseCaseBase", f = "RegisterUseCaseBase.kt", l = {105, 111}, m = "executeSteps$suspendImpl")
public final class C0614Aq1 extends LM {
    public AbstractC7909yq1 d;
    public Object e;
    public InterfaceC3220cl g;
    public InterfaceC3220cl h;
    public /* synthetic */ Object i;
    public final /* synthetic */ AbstractC7909yq1 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0614Aq1(AbstractC7909yq1 abstractC7909yq1, LM lm) {
        super(lm);
        this.j = abstractC7909yq1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return AbstractC7909yq1.i(this.j, this);
    }
}
