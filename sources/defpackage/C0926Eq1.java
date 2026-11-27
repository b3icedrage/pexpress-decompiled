package defpackage;

import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Eq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.library.registration.usecases.RegisterUseCaseBase", f = "RegisterUseCaseBase.kt", l = {182, 184, 184}, m = "loginToSessionlessAccount")
public final class C0926Eq1 extends LM {
    public Object d;
    public Object e;
    public /* synthetic */ Object g;
    public final /* synthetic */ AbstractC7909yq1 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0926Eq1(AbstractC7909yq1 abstractC7909yq1, LM lm) {
        super(lm);
        this.h = abstractC7909yq1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        Set<EnumC7489wq1> set = AbstractC7909yq1.t;
        return this.h.l(this);
    }
}
