package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.time.b;

/* JADX INFO: renamed from: Qr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.trading.usecases.BetDurationUseCaseBase$writeValue$2", f = "BetDurationUseCaseBase.kt", l = {17}, m = "invokeSuspend")
public final class C1865Qr extends AW1 implements Function1<JM<? super Integer>, Object> {
    public int d;
    public final /* synthetic */ AW1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1865Qr(Function1<? super JM<? super b>, ? extends Object> function1, JM<? super C1865Qr> jm) {
        super(1, jm);
        this.e = (AW1) function1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [AW1, kotlin.jvm.functions.Function1] */
    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C1865Qr(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Integer> jm) {
        return ((C1865Qr) create(jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [AW1, kotlin.jvm.functions.Function1] */
    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            this.d = 1;
            obj = this.e.invoke(this);
            if (obj == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        return new Integer((int) b.r(((b) obj).d, R40.SECONDS));
    }
}
