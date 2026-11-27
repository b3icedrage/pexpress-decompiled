package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.launchapp.screens.launchapp.LaunchAppViewModelBase$checkPostNotificationsPermission$1", f = "LaunchAppViewModelBase.kt", l = {81}, m = "invokeSuspend")
public final class NN0 extends AW1 implements Function1<JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ ON0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NN0(ON0 on0, JM<? super NN0> jm) {
        super(1, jm);
        this.e = on0;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new NN0(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Unit> jm) {
        return ((NN0) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            ON0 on0 = this.e;
            C2879b71 c2879b71 = on0.h;
            C1523Mi c1523Mi = new C1523Mi(on0, 4);
            C7121v6 c7121v6 = new C7121v6(on0, 3);
            C4927kg c4927kg = new C4927kg(on0, 2);
            this.d = 1;
            c2879b71.getClass();
            if (AbstractC1870Qs1.e(c2879b71, c1523Mi, c7121v6, c4927kg, this) == mn) {
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
