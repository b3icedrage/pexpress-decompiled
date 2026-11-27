package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: bf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.telemetry.probe.AppDataReadinessProbe$runProbeCycle$5", f = "AppDataReadinessProbe.kt", l = {222}, m = "invokeSuspend")
public final class C2987bf extends AW1 implements Function1<JM<? super Object>, Object> {
    public int d;
    public final /* synthetic */ C4245hf e;

    /* JADX INFO: renamed from: bf$a */
    @InterfaceC3368dU(c = "com.base.feature.telemetry.probe.AppDataReadinessProbe$runProbeCycle$5$1", f = "AppDataReadinessProbe.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<C6945uG, JM<? super Boolean>, Object> {
        public /* synthetic */ Object d;
        public final /* synthetic */ C4245hf e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C4245hf c4245hf, JM<? super a> jm) {
            super(2, jm);
            this.e = c4245hf;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            a aVar = new a(this.e, jm);
            aVar.d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(C6945uG c6945uG, JM<? super Boolean> jm) {
            return ((a) create(c6945uG, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            C6945uG c6945uG = (C6945uG) this.d;
            return Boolean.valueOf((c6945uG == null || (((Boolean) this.e.a.e.getValue()).booleanValue() && c6945uG.l == 0) || c6945uG.m == 0) ? false : true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2987bf(C4245hf c4245hf, JM<? super C2987bf> jm) {
        super(1, jm);
        this.e = c4245hf;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C2987bf(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Object> jm) {
        return ((C2987bf) create(jm)).invokeSuspend(Unit.a);
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
        C4245hf c4245hf = this.e;
        GP1 gp1 = c4245hf.a.k;
        a aVar = new a(c4245hf, null);
        this.d = 1;
        Object objP = C4466ii.p(gp1, aVar, this);
        return objP == mn ? mn : objP;
    }
}
