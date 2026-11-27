package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: jE1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.utils.ScrollViewSaveStateUtil$unlockScrollByUserAfterDelay$1", f = "ScrollViewSaveStateUtil.kt", l = {45}, m = "invokeSuspend")
public final class C4629jE1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C4839kE1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4629jE1(C4839kE1 c4839kE1, JM<? super C4629jE1> jm) {
        super(2, jm);
        this.e = c4839kE1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C4629jE1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C4629jE1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            this.d = 1;
            if (IW.b(50L, this) == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        this.e.a = false;
        return Unit.a;
    }
}
