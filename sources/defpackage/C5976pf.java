package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: pf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.AppDataRepository$loadDataStore$2", f = "AppDataRepository.kt", l = {116}, m = "invokeSuspend")
public final class C5976pf extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C4923kf e;

    /* JADX INFO: renamed from: pf$a */
    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ C4923kf d;

        public a(C4923kf c4923kf) {
            this.d = c4923kf;
        }

        @Override // defpackage.InterfaceC6606sf0
        public final Object a(Object obj, JM jm) {
            GP1 gp1 = this.d.h;
            Boolean bool = Boolean.TRUE;
            gp1.getClass();
            gp1.m(null, bool);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5976pf(C4923kf c4923kf, JM<? super C5976pf> jm) {
        super(2, jm);
        this.e = c4923kf;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C5976pf(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C5976pf) create(kn, jm)).invokeSuspend(Unit.a);
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
        GP1 gp1 = c4923kf.f;
        a aVar = new a(c4923kf);
        this.d = 1;
        gp1.c(new C6186qf(aVar), this);
        return mn;
    }
}
