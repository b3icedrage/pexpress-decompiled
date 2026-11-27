package defpackage;

import com.impl.core.backend.responseModels.Deposit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: sM0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.usecases.LastDepositUseCaseImpl$saveLastDeposit$2", f = "LastDepositUseCaseImpl.kt", l = {}, m = "invokeSuspend")
public final class C6544sM0 extends AW1 implements Function1<JM<? super String>, Object> {
    public final /* synthetic */ C6754tM0 d;
    public final /* synthetic */ Deposit e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6544sM0(C6754tM0 c6754tM0, Deposit deposit, JM<? super C6544sM0> jm) {
        super(1, jm);
        this.d = c6754tM0;
        this.e = deposit;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C6544sM0(this.d, this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super String> jm) {
        return ((C6544sM0) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        String strI = this.d.f.i(this.e);
        Intrinsics.checkNotNullExpressionValue(strI, "toJson(...)");
        return strI;
    }
}
