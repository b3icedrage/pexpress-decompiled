package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: zN0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.LaunchAppThirdStepUseCaseBase$prepareSession$3", f = "LaunchAppThirdStepUseCaseBase.kt", l = {}, m = "invokeSuspend")
public final class C8018zN0 extends AW1 implements Function2<Boolean, JM<? super Boolean>, Object> {
    public /* synthetic */ boolean d;

    public C8018zN0() {
        throw null;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        C8018zN0 c8018zN0 = new C8018zN0(2, jm);
        c8018zN0.d = ((Boolean) obj).booleanValue();
        return c8018zN0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, JM<? super Boolean> jm) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((C8018zN0) create(bool2, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        return Boolean.valueOf(this.d);
    }
}
