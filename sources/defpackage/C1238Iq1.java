package defpackage;

import java.util.Iterator;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Iq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.library.registration.usecases.RegisterUseCaseBase", f = "RegisterUseCaseBase.kt", l = {124, 124}, m = "runSteps")
public final class C1238Iq1 extends LM {
    public AbstractC7909yq1 d;
    public InterfaceC3220cl e;
    public Iterator g;
    public AbstractC7909yq1.a h;
    public InterfaceC5790ol i;
    public /* synthetic */ Object j;
    public final /* synthetic */ AbstractC7909yq1 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1238Iq1(AbstractC7909yq1 abstractC7909yq1, LM lm) {
        super(lm);
        this.k = abstractC7909yq1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        Set<EnumC7489wq1> set = AbstractC7909yq1.t;
        return this.k.m(null, null, this);
    }
}
