package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: xh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.registration.screens.forgetpassword.ForgetPasswordViewModelBase$handlePasswordResetSuccess$1", f = "ForgetPasswordViewModelBase.kt", l = {171}, m = "invokeSuspend")
public final class C7665xh0 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C7455wh0 e;

    /* JADX INFO: renamed from: xh0$a */
    @InterfaceC3368dU(c = "com.base.feature.registration.screens.forgetpassword.ForgetPasswordViewModelBase$handlePasswordResetSuccess$1$1$1", f = "ForgetPasswordViewModelBase.kt", l = {174}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ C7455wh0 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C7455wh0 c7455wh0, JM<? super a> jm) {
            super(2, jm);
            this.e = c7455wh0;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new a(this.e, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C6120qK1 c6120qK1 = this.e.t;
                Unit unit = Unit.a;
                this.d = 1;
                if (c6120qK1.a(unit, this) == mn) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7665xh0(C7455wh0 c7455wh0, JM<? super C7665xh0> jm) {
        super(2, jm);
        this.e = c7455wh0;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C7665xh0(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C7665xh0) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            C7455wh0 c7455wh0 = this.e;
            VK1 vk1 = c7455wh0.q;
            O4 action = new O4(c7455wh0, 5);
            Intrinsics.checkNotNullParameter(action, "action");
            AbstractC1592Nf.x xVar = new AbstractC1592Nf.x(N9.a(new F4(action, 1)));
            this.d = 1;
            if (vk1.a(xVar, null, null) == mn) {
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
