package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.repositories.UserRepositoryBase$updateDemoBalance$2", f = "UserRepositoryBase.kt", l = {146}, m = "invokeSuspend")
public final class Eb2 extends AW1 implements Function1<JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ Ib2 e;
    public final /* synthetic */ C6735tG g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Eb2(Ib2 ib2, C6735tG c6735tG, JM<? super Eb2> jm) {
        super(1, jm);
        this.e = ib2;
        this.g = c6735tG;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new Eb2(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Unit> jm) {
        return ((Eb2) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            Ya2 ya2 = this.e.a;
            this.d = 1;
            if (ya2.b(this.g, this) == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        return Unit.a;
    }
}
