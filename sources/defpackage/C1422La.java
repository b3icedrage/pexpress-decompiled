package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: La, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.library.registration.usecases.AnalyticsUseCaseBase$waitForRealCurrency$2", f = "AnalyticsUseCaseBase.kt", l = {}, m = "invokeSuspend")
public final class C1422La extends AW1 implements Function2<C6945uG, JM<? super Boolean>, Object> {
    public /* synthetic */ Object d;

    public C1422La() {
        throw null;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        C1422La c1422La = new C1422La(2, jm);
        c1422La.d = obj;
        return c1422La;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C6945uG c6945uG, JM<? super Boolean> jm) {
        return ((C1422La) create(c6945uG, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        C6945uG c6945uG = (C6945uG) this.d;
        return Boolean.valueOf(StringsKt.toIntOrNull(c6945uG.g) == null && c6945uG.g.length() > 0);
    }
}
