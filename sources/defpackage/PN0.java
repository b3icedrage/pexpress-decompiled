package defpackage;

import android.os.Build;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.launchapp.screens.launchapp.LaunchAppViewModelBase$requestPostNotificationsPermission$1", f = "LaunchAppViewModelBase.kt", l = {74}, m = "invokeSuspend")
public final class PN0 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ ON0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PN0(ON0 on0, JM<? super PN0> jm) {
        super(2, jm);
        this.e = on0;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new PN0(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((PN0) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            if (Build.VERSION.SDK_INT >= 33) {
                C6120qK1 c6120qK1 = this.e.m;
                Unit unit = Unit.a;
                this.d = 1;
                if (c6120qK1.a(unit, this) == mn) {
                    return mn;
                }
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
