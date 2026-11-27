package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Xe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.telemetry.probe.AppDataReadinessProbe$runProbeCycle$11", f = "AppDataReadinessProbe.kt", l = {261}, m = "invokeSuspend")
public final class C2402Xe extends AW1 implements Function1<JM<? super Object>, Object> {
    public int d;
    public final /* synthetic */ C4245hf e;

    /* JADX INFO: renamed from: Xe$a */
    @InterfaceC3368dU(c = "com.base.feature.telemetry.probe.AppDataReadinessProbe$runProbeCycle$11$1", f = "AppDataReadinessProbe.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<EnumC3495e41, JM<? super Boolean>, Object> {
        public /* synthetic */ Object d;

        public a() {
            throw null;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            a aVar = new a(2, jm);
            aVar.d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EnumC3495e41 enumC3495e41, JM<? super Boolean> jm) {
            return ((a) create(enumC3495e41, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            EnumC3495e41 enumC3495e41 = (EnumC3495e41) this.d;
            return Boolean.valueOf((enumC3495e41 == null || C7652xe.g(enumC3495e41)) ? false : true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2402Xe(C4245hf c4245hf, JM<? super C2402Xe> jm) {
        super(1, jm);
        this.e = c4245hf;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C2402Xe(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Object> jm) {
        return ((C2402Xe) create(jm)).invokeSuspend(Unit.a);
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
        GP1 gp1 = this.e.a.r;
        a aVar = new a(2, null);
        this.d = 1;
        Object objP = C4466ii.p(gp1, aVar, this);
        return objP == mn ? mn : objP;
    }
}
