package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: pu1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robotdialogs.review_app_dialog.providers.ReviewDialogOpeningStateProviderBase$writeValue$2", f = "ReviewDialogOpeningStateProviderBase.kt", l = {77}, m = "invokeSuspend")
public final class C6031pu1 extends AW1 implements Function1<JM<? super Integer>, Object> {
    public int d;
    public final /* synthetic */ C5401mu1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6031pu1(C5401mu1 c5401mu1, JM jm) {
        super(1, jm);
        this.e = c5401mu1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C6031pu1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Integer> jm) {
        return ((C6031pu1) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            this.d = 1;
            obj = this.e.invoke(this);
            if (obj == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        return new Integer(((EnumC5843p10) obj).d);
    }
}
