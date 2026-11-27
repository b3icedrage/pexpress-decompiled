package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: oB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.support.chat.ChatViewModel$sendTransitionEvent$1", f = "ChatViewModel.kt", l = {}, m = "invokeSuspend")
public final class C5671oB extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public final /* synthetic */ C5881pB d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5671oB(C5881pB c5881pB, JM<? super C5671oB> jm) {
        super(2, jm);
        this.d = c5881pB;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C5671oB(this.d, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C5671oB) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        C5881pB c5881pB = this.d;
        ReporterApi.a.b(c5881pB.d, EnumC5028l80.l0, new C1510Md1((String) c5881pB.e.b.d.getValue()), null, 12);
        return Unit.a;
    }
}
