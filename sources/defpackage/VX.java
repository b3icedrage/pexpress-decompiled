package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.app.navigation.DepositNavigationManager$switchToRealAccountIfNeeded$2", f = "DepositNavigationManager.kt", l = {}, m = "invokeSuspend")
public final class VX extends AW1 implements Function1<JM<? super EnumC4164hF1>, Object> {
    public final /* synthetic */ UX d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VX(UX ux, JM<? super VX> jm) {
        super(1, jm);
        this.d = ux;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new VX(this.d, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super EnumC4164hF1> jm) {
        return ((VX) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        return this.d.f.b().d.getValue() == EnumC4105gz1.d ? EnumC4164hF1.g : EnumC4164hF1.h;
    }
}
