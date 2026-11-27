package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: kW1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.experiments.remote.knowledge_base.SupportTestIsAvailableUseCaseBase$updateAndGetValue$2$1", f = "SupportTestIsAvailableUseCaseBase.kt", l = {}, m = "invokeSuspend")
public final class C4893kW1 extends AW1 implements Function1<JM<? super Boolean>, Object> {
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4893kW1(boolean z, JM<? super C4893kW1> jm) {
        super(1, jm);
        this.d = z;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C4893kW1(this.d, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Boolean> jm) {
        return ((C4893kW1) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        return Boolean.valueOf(this.d);
    }
}
