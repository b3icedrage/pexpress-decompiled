package defpackage;

import com.impl.feature.launchapp.screens.launchapp.LaunchAppFragmentImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.launchapp.screens.launchapp.LaunchAppFragmentBase$initObservers$1$3$1", f = "LaunchAppFragmentBase.kt", l = {}, m = "invokeSuspend")
public final class LM0 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public final /* synthetic */ LaunchAppFragmentImpl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LM0(LaunchAppFragmentImpl launchAppFragmentImpl, JM jm) {
        super(2, jm);
        this.d = launchAppFragmentImpl;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new LM0(this.d, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((LM0) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        LaunchAppFragmentImpl launchAppFragmentImpl = this.d;
        AbstractC6076q7<String> abstractC6076q7 = launchAppFragmentImpl.m;
        if (abstractC6076q7 != null) {
            abstractC6076q7.a(launchAppFragmentImpl.l.g);
        }
        return Unit.a;
    }
}
