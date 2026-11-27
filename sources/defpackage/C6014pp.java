package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: pp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.pexpress.events.impl.BackendApiImplAndroidKt$executeRequest$2", f = "BackendApiImplAndroid.kt", l = {10}, m = "invokeSuspend")
public final class C6014pp extends AW1 implements Function2<KN, JM<Object>, Object> {
    public int d;
    public final /* synthetic */ C5594np e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6014pp(C5594np c5594np, JM jm) {
        super(2, jm);
        this.e = c5594np;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C6014pp(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<Object> jm) {
        return ((C6014pp) create(kn, jm)).invokeSuspend(Unit.a);
    }

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
