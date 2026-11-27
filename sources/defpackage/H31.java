package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.app.services.NetworkManager$showLockView$2", f = "NetworkManager.kt", l = {}, m = "invokeSuspend")
public final class H31 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public final /* synthetic */ C6062q31 d;
    public final /* synthetic */ InterfaceC8042zV0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H31(C6062q31 c6062q31, InterfaceC8042zV0 interfaceC8042zV0, JM<? super H31> jm) {
        super(2, jm);
        this.d = c6062q31;
        this.e = interfaceC8042zV0;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new H31(this.d, this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((H31) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        InterfaceC8042zV0 interfaceC8042zV0 = this.e;
        this.d.getClass();
        C4412iS0 lockViewWithProgress = interfaceC8042zV0.c().g;
        Intrinsics.checkNotNullExpressionValue(lockViewWithProgress, "lockViewWithProgress");
        ConstraintLayout constraintLayout = lockViewWithProgress.d;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        constraintLayout.setVisibility(0);
        return Unit.a;
    }
}
