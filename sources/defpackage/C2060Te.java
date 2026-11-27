package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Te, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.telemetry.probe.AppDataReadinessProbe$runFieldWatchdog$phase1$1", f = "AppDataReadinessProbe.kt", l = {341}, m = "invokeSuspend")
public final class C2060Te extends AW1 implements Function2<KN, JM<? super Object>, Object> {
    public int d;
    public final /* synthetic */ AW1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2060Te(Function1<? super JM<Object>, ? extends Object> function1, JM<? super C2060Te> jm) {
        super(2, jm);
        this.e = (AW1) function1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [AW1, kotlin.jvm.functions.Function1] */
    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C2060Te(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Object> jm) {
        return ((C2060Te) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [AW1, kotlin.jvm.functions.Function1] */
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
