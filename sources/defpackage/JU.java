package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.core.deeplinks.DeeplinkManager$hasPendingDeeplinkExecutions$2", f = "DeeplinkManager.kt", l = {}, m = "invokeSuspend")
public final class JU extends AW1 implements Function2<KN, JM<? super Boolean>, Object> {
    public final /* synthetic */ LU d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JU(LU lu, JM<? super JU> jm) {
        super(2, jm);
        this.d = lu;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new JU(this.d, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Boolean> jm) {
        return ((JU) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        return Boolean.valueOf(this.d.d != null);
    }
}
