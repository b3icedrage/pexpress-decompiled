package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: nV0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.app.activities.main.MainActivity$initBottomNavigation$1$2", f = "MainActivity.kt", l = {472}, m = "invokeSuspend")
public final class C5522nV0 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ ActivityC6781tV0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5522nV0(ActivityC6781tV0 activityC6781tV0, JM<? super C5522nV0> jm) {
        super(2, jm);
        this.e = activityC6781tV0;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C5522nV0(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C5522nV0) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            C1949Rt c1949Rt = this.e.G;
            if (c1949Rt == null) {
                Intrinsics.l("bottomNavigationListener");
                throw null;
            }
            this.d = 1;
            if (c1949Rt.d(this) == mn) {
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
