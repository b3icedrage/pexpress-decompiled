package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Ff, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.AppDataUpdatersStarter$restart$job$1", f = "AppDataUpdatersStarter.kt", l = {70}, m = "invokeSuspend")
public final class C0969Ff extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ InterfaceC0735Cf e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0969Ff(InterfaceC0735Cf interfaceC0735Cf, JM<? super C0969Ff> jm) {
        super(2, jm);
        this.e = interfaceC0735Cf;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C0969Ff(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C0969Ff) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            InterfaceC0735Cf interfaceC0735Cf = this.e;
            interfaceC0735Cf.stop();
            this.d = 1;
            if (interfaceC0735Cf.b(this) == mn) {
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
