package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: rf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.AppDataRepository$loadDataStore$3", f = "AppDataRepository.kt", l = {122}, m = "invokeSuspend")
public final class C6395rf extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C4923kf e;

    /* JADX INFO: renamed from: rf$a */
    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ C4923kf d;

        public a(C4923kf c4923kf) {
            this.d = c4923kf;
        }

        @Override // defpackage.InterfaceC6606sf0
        public final Object a(Object obj, JM jm) {
            C6106qG c6106qG = (C6106qG) obj;
            GP1 gp1 = this.d.e;
            boolean z = false;
            if (c6106qG != null && c6106qG.d) {
                z = true;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            gp1.getClass();
            gp1.m(null, boolValueOf);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6395rf(C4923kf c4923kf, JM<? super C6395rf> jm) {
        super(2, jm);
        this.e = c4923kf;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C6395rf(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) throws Throwable {
        ((C6395rf) create(kn, jm)).invokeSuspend(Unit.a);
        return MN.d;
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) throws Throwable {
        MN mn = MN.d;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw EK.c(obj);
        }
        C1795Pt1.b(obj);
        C4923kf c4923kf = this.e;
        GP1 gp1 = c4923kf.c;
        a aVar = new a(c4923kf);
        this.d = 1;
        gp1.c(aVar, this);
        return mn;
    }
}
