package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Ug1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.preferences.domain.repository.PreferencesRepositoryBaseKt$safeInsert$2", f = "PreferencesRepositoryBase.kt", l = {76}, m = "invokeSuspend")
public final class C2146Ug1 extends AW1 implements Function2<Y11, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ AW1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2146Ug1(Function2<? super Y11, ? super JM<Object>, ? extends Object> function2, JM<? super C2146Ug1> jm) {
        super(2, jm);
        this.g = (AW1) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [AW1, kotlin.jvm.functions.Function2] */
    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        C2146Ug1 c2146Ug1 = new C2146Ug1(this.g, jm);
        c2146Ug1.e = obj;
        return c2146Ug1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Y11 y11, JM<? super Unit> jm) {
        return ((C2146Ug1) create(y11, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [AW1, kotlin.jvm.functions.Function2] */
    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            Y11 y11 = (Y11) this.e;
            this.d = 1;
            if (this.g.invoke(y11, this) == mn) {
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
