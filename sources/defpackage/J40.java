package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.registration.screens.duoauth.DuoAuthViewModelBase$sendEmptyDouAuthCode$1", f = "DuoAuthViewModelBase.kt", l = {66}, m = "invokeSuspend")
public final class J40 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ K40 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J40(K40 k40, JM<? super J40> jm) {
        super(2, jm);
        this.e = k40;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new J40(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((J40) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            InterfaceC1767Pk0 interfaceC1767Pk0 = this.e.d;
            this.d = 1;
            if (interfaceC1767Pk0.d("", this) == mn) {
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
