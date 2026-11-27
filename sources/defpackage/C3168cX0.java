package defpackage;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: cX0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.core.MarketingEventsManager$trySendMarketingRegisterEventIfNeeded$3", f = "MarketingEventsManager.kt", l = {}, m = "invokeSuspend")
public final class C3168cX0 extends AW1 implements Function1<JM<? super Set<? extends String>>, Object> {
    public final /* synthetic */ C6945uG d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3168cX0(C6945uG c6945uG, JM<? super C3168cX0> jm) {
        super(1, jm);
        this.d = c6945uG;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C3168cX0(this.d, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Set<? extends String>> jm) {
        return ((C3168cX0) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        return C5487nJ1.b(String.valueOf(this.d.a));
    }
}
