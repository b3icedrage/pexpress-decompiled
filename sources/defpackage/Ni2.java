package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robotdialogs.review_app_dialog.providers.WinCounterForAppReviewProviderBase$resetIfNeeded$2", f = "WinCounterForAppReviewProviderBase.kt", l = {}, m = "invokeSuspend")
public final class Ni2 extends AW1 implements Function1<JM<? super String>, Object> {
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ni2(String str, JM<? super Ni2> jm) {
        super(1, jm);
        this.d = str;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new Ni2(this.d, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super String> jm) {
        return ((Ni2) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        return this.d;
    }
}
