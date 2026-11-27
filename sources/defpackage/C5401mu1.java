package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: mu1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robotdialogs.review_app_dialog.providers.ReviewDialogOpeningStateProviderBase$moveToNextState$2", f = "ReviewDialogOpeningStateProviderBase.kt", l = {}, m = "invokeSuspend")
public final class C5401mu1 extends AW1 implements Function1<JM<? super EnumC5843p10>, Object> {
    public final /* synthetic */ EnumC5843p10 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5401mu1(EnumC5843p10 enumC5843p10, JM<? super C5401mu1> jm) {
        super(1, jm);
        this.d = enumC5843p10;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C5401mu1(this.d, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super EnumC5843p10> jm) {
        return ((C5401mu1) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        return this.d;
    }
}
