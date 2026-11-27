package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: mf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.AppDataRepository$clearData$1", f = "AppDataRepository.kt", l = {155}, m = "invokeSuspend")
public final class C5346mf extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C4923kf e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5346mf(C4923kf c4923kf, JM<? super C5346mf> jm) {
        super(2, jm);
        this.e = c4923kf;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C5346mf(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C5346mf) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            C6120qK1 c6120qK1 = this.e.D;
            Boolean bool = Boolean.FALSE;
            this.d = 1;
            if (c6120qK1.a(bool, this) == mn) {
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
