package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: sf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.AppDataRepository$loadDataStore$4", f = "AppDataRepository.kt", l = {127}, m = "invokeSuspend")
public final class C6605sf extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C4923kf e;

    /* JADX INFO: renamed from: sf$a */
    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ C4923kf d;

        public a(C4923kf c4923kf) {
            this.d = c4923kf;
        }

        @Override // defpackage.InterfaceC6606sf0
        public final Object a(Object obj, JM jm) {
            C6945uG c6945uG = (C6945uG) obj;
            this.d.l.setValue(c6945uG != null ? c6945uG.p : null);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6605sf(C4923kf c4923kf, JM<? super C6605sf> jm) {
        super(2, jm);
        this.e = c4923kf;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C6605sf(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C6605sf) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) throws Throwable {
        MN mn = MN.d;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            return Unit.a;
        }
        C1795Pt1.b(obj);
        C4923kf c4923kf = this.e;
        GP1 gp1 = c4923kf.k;
        a aVar = new a(c4923kf);
        this.d = 1;
        gp1.c(new C6815tf(aVar), this);
        return mn;
    }
}
