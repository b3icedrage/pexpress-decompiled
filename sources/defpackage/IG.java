package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.library.registration.usecases.CompletePendingRegistrationUseCaseBase", f = "CompletePendingRegistrationUseCaseBase.kt", l = {35, 36, 39}, m = "addUserIfPending-vLdBGDU")
public final class IG extends LM {
    public KG d;
    public long e;
    public long g;
    public /* synthetic */ Object h;
    public final /* synthetic */ KG i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IG(KG kg, LM lm) {
        super(lm);
        this.i = kg;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.c(null, 0L, 0L, this);
    }
}
