package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Dm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.registration.screens.authorization.AuthorizationViewModelBase$handleSuccessfulLogin$2", f = "AuthorizationViewModelBase.kt", l = {366}, m = "invokeSuspend")
public final class C0834Dm extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C1146Hm e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0834Dm(C1146Hm c1146Hm, JM<? super C0834Dm> jm) {
        super(2, jm);
        this.e = c1146Hm;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C0834Dm(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C0834Dm) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            C1146Hm c1146Hm = this.e;
            c1146Hm.J.a();
            this.d = 1;
            if (c1146Hm.L.i(this) == mn) {
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
