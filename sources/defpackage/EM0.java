package defpackage;

import androidx.lifecycle.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.LaunchAppFirstStepUseCaseBase$checkInternet$2", f = "LaunchAppFirstStepUseCaseBase.kt", l = {}, m = "invokeSuspend")
public final class EM0 extends AW1 implements Function2<g.b, JM<? super Boolean>, Object> {
    public /* synthetic */ Object d;

    public EM0() {
        throw null;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        EM0 em0 = new EM0(2, jm);
        em0.d = obj;
        return em0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(g.b bVar, JM<? super Boolean> jm) {
        return ((EM0) create(bVar, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        g.b bVar = (g.b) this.d;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return Boolean.valueOf(bVar.b(g.b.i));
    }
}
