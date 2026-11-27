package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: uV0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.app.activities.main.MainActivity$reportOffMain$1", f = "MainActivity.kt", l = {}, m = "invokeSuspend")
public final class C6991uV0 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public final /* synthetic */ Function1<InterfaceC3706f42, Unit> d;
    public final /* synthetic */ ActivityC6781tV0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C6991uV0(Function1<? super InterfaceC3706f42, Unit> function1, ActivityC6781tV0 activityC6781tV0, JM<? super C6991uV0> jm) {
        super(2, jm);
        this.d = function1;
        this.e = activityC6781tV0;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C6991uV0(this.d, this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C6991uV0) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        InterfaceC3706f42 interfaceC3706f42 = this.e.r;
        if (interfaceC3706f42 != null) {
            this.d.invoke(interfaceC3706f42);
            return Unit.a;
        }
        Intrinsics.l("telemetryReporter");
        throw null;
    }
}
