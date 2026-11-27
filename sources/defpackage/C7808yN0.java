package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: yN0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.LaunchAppThirdStepUseCaseBase$prepareSession$2", f = "LaunchAppThirdStepUseCaseBase.kt", l = {}, m = "invokeSuspend")
public final class C7808yN0 extends AW1 implements Function2<Boolean, JM<? super Boolean>, Object> {
    public /* synthetic */ boolean d;

    public C7808yN0() {
        throw null;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        C7808yN0 c7808yN0 = new C7808yN0(2, jm);
        c7808yN0.d = ((Boolean) obj).booleanValue();
        return c7808yN0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, JM<? super Boolean> jm) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((C7808yN0) create(bool2, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        return Boolean.valueOf(this.d);
    }
}
