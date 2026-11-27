package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ns1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.core.usecases.impl.RequestPermissionUseCaseBase", f = "RequestPermissionUseCaseBase.kt", l = {48}, m = "isSystemDialogBlocked")
public final class C1636Ns1 extends LM {
    public AbstractC1870Qs1 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ AbstractC1870Qs1 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1636Ns1(AbstractC1870Qs1 abstractC1870Qs1, LM lm) {
        super(lm);
        this.g = abstractC1870Qs1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.d(this);
    }
}
