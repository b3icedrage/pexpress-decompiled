package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.core.backend.domain.usecases.DepositCounterUseCaseApi$increment$2", f = "DepositCounterUseCaseApi.kt", l = {V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER}, m = "invokeSuspend")
public final class FX extends AW1 implements Function1<JM<? super Integer>, Object> {
    public int d;
    public final /* synthetic */ GX e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FX(GX gx, JM<? super FX> jm) {
        super(1, jm);
        this.e = gx;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new FX(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Integer> jm) {
        return ((FX) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            InterfaceC6396rf0<Integer> interfaceC6396rf0L = this.e.l();
            this.d = 1;
            obj = C4466ii.o(interfaceC6396rf0L, this);
            if (obj == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        return new Integer(((Number) obj).intValue() + 1);
    }
}
