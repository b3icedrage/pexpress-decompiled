package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Sc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.library.registration.usecases.PendingAddUserUseCaseBase", f = "PendingAddUserUseCaseBase.kt", l = {26}, m = "isPendingFor")
public final class C1978Sc1 extends LM {
    public String d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C2134Uc1 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1978Sc1(C2134Uc1 c2134Uc1, LM lm) {
        super(lm);
        this.g = c2134Uc1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.e(null, this);
    }
}
