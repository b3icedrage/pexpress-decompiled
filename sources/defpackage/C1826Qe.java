package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Qe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.telemetry.probe.AppDataReadinessProbe$awaitNotNull$2", f = "AppDataReadinessProbe.kt", l = {}, m = "invokeSuspend")
public final class C1826Qe extends AW1 implements Function2<Object, JM<? super Boolean>, Object> {
    public /* synthetic */ Object d;

    public C1826Qe() {
        throw null;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        C1826Qe c1826Qe = new C1826Qe(2, jm);
        c1826Qe.d = obj;
        return c1826Qe;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, JM<? super Boolean> jm) {
        return ((C1826Qe) create(obj, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        return Boolean.valueOf(this.d != null);
    }
}
