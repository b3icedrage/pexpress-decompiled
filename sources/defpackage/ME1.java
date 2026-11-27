package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.app.navigation.callbacks.registration.SelectHaveAccountCallbackImpl$navigateToAuthorization$1", f = "SelectHaveAccountCallbackImpl.kt", l = {}, m = "invokeSuspend")
public final class ME1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public final /* synthetic */ NE1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ME1(NE1 ne1, JM<? super ME1> jm) {
        super(2, jm);
        this.d = ne1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new ME1(this.d, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((ME1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        NE1 ne1 = this.d;
        ne1.b.e(ne1.c.g());
        return Unit.a;
    }
}
