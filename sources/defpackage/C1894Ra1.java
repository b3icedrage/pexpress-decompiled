package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Ra1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.pexpress.events.impl.PExpEventsImpl$1", f = "ExpEventsImpl.kt", l = {26}, m = "invokeSuspend")
public final class C1894Ra1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C2128Ua1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1894Ra1(C2128Ua1 c2128Ua1, JM<? super C1894Ra1> jm) {
        super(2, jm);
        this.e = c2128Ua1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C1894Ra1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C1894Ra1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            A90 a90 = this.e.e;
            C2658a80.Companion.getClass();
            C2658a80 c2658a80 = C2658a80.e;
            this.d = 1;
            if (a90.d(c2658a80, this) == mn) {
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
