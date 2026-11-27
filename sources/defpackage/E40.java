package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.library.registration.usecases.DuoAuthRequestUseCaseBase", f = "DuoAuthRequestUseCaseBase.kt", l = {94, 94}, m = "waitForCode")
public final class E40 extends LM {
    public InterfaceC5790ol d;
    public /* synthetic */ Object e;
    public final /* synthetic */ D40 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E40(D40 d40, LM lm) {
        super(lm);
        this.g = d40;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.c(null, this);
    }
}
