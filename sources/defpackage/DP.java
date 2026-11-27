package defpackage;

import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.confirm_bottomsheet.usecases.CreateBetConfirmationParamsUseCaseBase$setupOnSwitchCheckedChangeListener$1", f = "CreateBetConfirmationParamsUseCaseBase.kt", l = {RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH}, m = "invokeSuspend")
public final class DP extends AW1 implements Function2<Boolean, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ boolean e;
    public final /* synthetic */ AP g;

    @InterfaceC3368dU(c = "com.base.feature.robot.robot.confirm_bottomsheet.usecases.CreateBetConfirmationParamsUseCaseBase$setupOnSwitchCheckedChangeListener$1$1", f = "CreateBetConfirmationParamsUseCaseBase.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function1<JM<? super Boolean>, Object> {
        public final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, JM<? super a> jm) {
            super(1, jm);
            this.d = z;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return new a(this.d, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super Boolean> jm) {
            return ((a) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            return Boolean.valueOf(this.d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DP(AP ap, JM<? super DP> jm) {
        super(2, jm);
        this.g = ap;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        DP dp = new DP(this.g, jm);
        dp.e = ((Boolean) obj).booleanValue();
        return dp;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, JM<? super Unit> jm) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((DP) create(bool2, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            boolean z = this.e;
            AbstractC6505s91 abstractC6505s91 = this.g.j;
            a aVar = new a(z, null);
            this.d = 1;
            if (abstractC6505s91.m(aVar, this) == mn) {
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
