package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: wm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.app.analytics.GoogleAnalyticManager$sendEvent$2", f = "GoogleAnalyticManager.kt", l = {}, m = "invokeSuspend")
public final class C7475wm0 extends AW1 implements Function1<JM<? super String>, Object> {
    public final /* synthetic */ C7054um0.a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7475wm0(C7054um0.a aVar, JM<? super C7475wm0> jm) {
        super(1, jm);
        this.d = aVar;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C7475wm0(this.d, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super String> jm) {
        return ((C7475wm0) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        return this.d.a;
    }
}
