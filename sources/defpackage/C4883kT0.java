package defpackage;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kT0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.library.registration.usecases.LoginUseCaseBase", f = "LoginUseCaseBase.kt", l = {79, 79}, m = "runSteps")
public final class C4883kT0 extends LM {
    public XS0 d;
    public InterfaceC3220cl e;
    public Iterator g;
    public XS0.a h;
    public InterfaceC5790ol i;
    public /* synthetic */ Object j;
    public final /* synthetic */ XS0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4883kT0(XS0 xs0, LM lm) {
        super(lm);
        this.k = xs0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.e(null, this);
    }
}
