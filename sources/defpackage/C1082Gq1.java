package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Gq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.library.registration.usecases.RegisterUseCaseBase", f = "RegisterUseCaseBase.kt", l = {153, 162, 166, 171, 172}, m = "requestRegister")
public final class C1082Gq1 extends LM {
    public Object d;
    public Object e;
    public boolean g;
    public /* synthetic */ Object h;
    public final /* synthetic */ AbstractC7909yq1 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1082Gq1(AbstractC7909yq1 abstractC7909yq1, JM<? super C1082Gq1> jm) {
        super(jm);
        this.i = abstractC7909yq1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return AbstractC7909yq1.g(this.i, this);
    }
}
