package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.AppDataRepository$Companion$subscribe$1", f = "AppDataRepository.kt", l = {191}, m = "invokeSuspend")
public final class C5133lf extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ GP1 e;
    public final /* synthetic */ Gg2.a g;

    /* JADX INFO: renamed from: lf$a */
    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ Gg2.a d;
        public final /* synthetic */ GP1 e;

        public a(Gg2.a aVar, GP1 gp1) {
            this.d = aVar;
            this.e = gp1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.InterfaceC6606sf0
        public final Object a(Object obj, JM<? super Unit> jm) {
            Object objInvoke = this.d.invoke(this.e.getValue(), jm);
            return objInvoke == MN.d ? objInvoke : Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5133lf(GP1 gp1, Gg2.a aVar, JM jm) {
        super(2, jm);
        this.e = gp1;
        this.g = aVar;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C5133lf(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) throws Throwable {
        ((C5133lf) create(kn, jm)).invokeSuspend(Unit.a);
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
        Gg2.a aVar = this.g;
        GP1 gp1 = this.e;
        a aVar2 = new a(aVar, gp1);
        this.d = 1;
        gp1.c(aVar2, this);
        return mn;
    }
}
