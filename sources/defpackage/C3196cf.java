package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: cf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.telemetry.probe.AppDataReadinessProbe$runProbeCycle$6", f = "AppDataReadinessProbe.kt", l = {549}, m = "invokeSuspend")
public final class C3196cf extends AW1 implements Function1<JM<? super Object>, Object> {
    public int d;
    public final /* synthetic */ C4245hf e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3196cf(C4245hf c4245hf, JM<? super C3196cf> jm) {
        super(1, jm);
        this.e = c4245hf;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C3196cf(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Object> jm) {
        return ((C3196cf) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            GP1 gp1 = this.e.a.d;
            C1826Qe c1826Qe = new C1826Qe(2, null);
            this.d = 1;
            obj = C4466ii.p(gp1, c1826Qe, this);
            if (obj == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        Intrinsics.checkNotNull(obj);
        return obj;
    }
}
