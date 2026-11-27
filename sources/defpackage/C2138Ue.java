package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Ue, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.telemetry.probe.AppDataReadinessProbe$runFieldWatchdog$phase2$1", f = "AppDataReadinessProbe.kt", l = {360}, m = "invokeSuspend")
public final class C2138Ue extends AW1 implements Function2<KN, JM<? super Object>, Object> {
    public int d;
    public final /* synthetic */ Function1<JM<Object>, Object> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2138Ue(Function1<? super JM<Object>, ? extends Object> function1, JM<? super C2138Ue> jm) {
        super(2, jm);
        this.e = function1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C2138Ue(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Object> jm) {
        return ((C2138Ue) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            return obj;
        }
        C1795Pt1.b(obj);
        this.d = 1;
        Object objInvoke = this.e.invoke(this);
        return objInvoke == mn ? mn : objInvoke;
    }
}
