package defpackage;

import com.google.android.gms.common.api.CommonStatusCodes;
import com.impl.core.backend.responseModels.Deposit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: tB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.usecases.CheckDepositMadeUseCaseImpl", f = "CheckDepositMadeUseCaseImpl.kt", l = {13, 16, CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE}, m = "invoke")
public final class C6720tB extends LM {
    public Object d;
    public Deposit e;
    public Deposit g;
    public /* synthetic */ Object h;
    public final /* synthetic */ C6930uB i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6720tB(C6930uB c6930uB, LM lm) {
        super(lm);
        this.i = c6930uB;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.a(this);
    }
}
