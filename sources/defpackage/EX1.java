package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.app.di.modules.TelemetryAppDataUpdater$start$watchdog$1$1", f = "TelemetryAppDataUpdater.kt", l = {28}, m = "invokeSuspend")
public final class EX1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Function0<Boolean> g;
    public final /* synthetic */ FX1 h;
    public final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EX1(Function0<Boolean> function0, FX1 fx1, long j, JM<? super EX1> jm) {
        super(2, jm);
        this.g = function0;
        this.h = fx1;
        this.i = j;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        EX1 ex1 = new EX1(this.g, this.h, this.i, jm);
        ex1.e = obj;
        return ex1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((EX1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            this.e = (KN) this.e;
            this.d = 1;
            if (IW.b(15000L, this) == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        if (!this.g.invoke().booleanValue()) {
            FX1 fx1 = this.h;
            long j = this.i;
            try {
                C1717Ot1.a aVar = C1717Ot1.e;
                fx1.d.t(fx1.b, System.currentTimeMillis() - j);
                Unit unit = Unit.a;
            } catch (Throwable th) {
                C1717Ot1.a aVar2 = C1717Ot1.e;
                C1795Pt1.a(th);
            }
        }
        return Unit.a;
    }
}
