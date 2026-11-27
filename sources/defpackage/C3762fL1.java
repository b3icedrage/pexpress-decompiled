package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fL1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.library.registration.usecases.ShowErrorUseCase", f = "ShowErrorUseCase.kt", l = {43, 43}, m = "showVpnOrError")
public final class C3762fL1 extends LM {
    public AbstractC3972gL1 d;
    public boolean e;
    public /* synthetic */ Object g;
    public final /* synthetic */ AbstractC3972gL1 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3762fL1(AbstractC3972gL1 abstractC3972gL1, LM lm) {
        super(lm);
        this.h = abstractC3972gL1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.c(false, this);
    }
}
