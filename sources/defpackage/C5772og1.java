package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: og1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.preferences.domain.base_impl.PreferenceCustomUseCaseApi$insert$2", f = "PreferenceCustomUseCaseApi.kt", l = {16}, m = "invokeSuspend")
public final class C5772og1 extends AW1 implements Function1<JM<Object>, Object> {
    public int d;
    public final /* synthetic */ AW1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5772og1(Function1<? super JM<Object>, ? extends Object> function1, JM<? super C5772og1> jm) {
        super(1, jm);
        this.e = (AW1) function1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [AW1, kotlin.jvm.functions.Function1] */
    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C5772og1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<Object> jm) {
        return ((C5772og1) create(jm)).invokeSuspend(Unit.a);
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
