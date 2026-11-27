package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: nu1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robotdialogs.review_app_dialog.providers.ReviewDialogOpeningStateProviderBase$saveCurrentTime$2", f = "ReviewDialogOpeningStateProviderBase.kt", l = {}, m = "invokeSuspend")
public final class C5611nu1 extends AW1 implements Function1<JM<? super Long>, Object> {
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5611nu1(long j, JM<? super C5611nu1> jm) {
        super(1, jm);
        this.d = j;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C5611nu1(this.d, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Long> jm) {
        return ((C5611nu1) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        return new Long(this.d);
    }
}
