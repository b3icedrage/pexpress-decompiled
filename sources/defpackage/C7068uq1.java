package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: uq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.impl.library.registration.usecases.RegisterRequestUseCaseImpl", f = "RegisterRequestUseCaseImpl.kt", l = {43, 43, 46, 48}, m = "requestRegister")
public final class C7068uq1 extends LM {
    public Object d;
    public Object e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C7278vq1 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7068uq1(C7278vq1 c7278vq1, LM lm) {
        super(lm);
        this.h = c7278vq1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b(this);
    }
}
