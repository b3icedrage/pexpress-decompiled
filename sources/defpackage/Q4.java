package defpackage;

import com.base.feature.platform.screens.verification.AccountVerificationFragmentBase;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.platform.screens.verification.AccountVerificationFragmentBase$incrementVerificationOpensCounter$1", f = "AccountVerificationFragmentBase.kt", l = {82}, m = "invokeSuspend")
public final class Q4 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ AccountVerificationFragmentBase<AbstractC3288d5> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q4(AccountVerificationFragmentBase<AbstractC3288d5> accountVerificationFragmentBase, JM<? super Q4> jm) {
        super(2, jm);
        this.e = accountVerificationFragmentBase;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new Q4(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((Q4) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            AccountVerificationFragmentBase<AbstractC3288d5> accountVerificationFragmentBase = this.e;
            this.d = 1;
            AbstractC5341md2 abstractC5341md2 = accountVerificationFragmentBase.t;
            abstractC5341md2.getClass();
            if (abstractC5341md2.m(new C5128ld2(abstractC5341md2, null), this) == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        return Unit.a;
    }
}
