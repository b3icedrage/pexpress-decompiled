package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: wq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.core.backend.helpers.HttpExchangeRecorder$bounded$2", f = "HttpExchangeRecorder.kt", l = {51}, m = "invokeSuspend")
public final class C7488wq0 extends AW1 implements Function2<KN, JM<Object>, Object> {
    public int d;
    public final /* synthetic */ AW1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C7488wq0(Function1<? super JM<Object>, ? extends Object> function1, JM<? super C7488wq0> jm) {
        super(2, jm);
        this.e = (AW1) function1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [AW1, kotlin.jvm.functions.Function1] */
    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C7488wq0(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<Object> jm) {
        return ((C7488wq0) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [AW1, kotlin.jvm.functions.Function1] */
    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            return obj;
        }
        C1795Pt1.b(obj);
        this.d = 1;
        Object objInvoke = this.e.invoke(this);
        return objInvoke == mn ? mn : objInvoke;
    }
}
