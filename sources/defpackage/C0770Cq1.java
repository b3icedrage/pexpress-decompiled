package defpackage;

import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Cq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.library.registration.usecases.RegisterUseCaseBase", f = "RegisterUseCaseBase.kt", l = {218}, m = "loginTo")
public final class C0770Cq1 extends LM {
    public AbstractC7909yq1 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ AbstractC7909yq1 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0770Cq1(AbstractC7909yq1 abstractC7909yq1, LM lm) {
        super(lm);
        this.g = abstractC7909yq1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        Set<EnumC7489wq1> set = AbstractC7909yq1.t;
        return this.g.j(null, this);
    }
}
