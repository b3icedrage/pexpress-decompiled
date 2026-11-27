package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: es1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.analytics.reporters.ReporterBase$launchUserTracking$1", f = "ReporterBase.kt", l = {}, m = "invokeSuspend")
public final class C3664es1 extends AW1 implements InterfaceC1060Gj0<Boolean, Boolean, JM<? super Boolean>, Object> {
    public /* synthetic */ Boolean d;
    public /* synthetic */ boolean e;

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        return Boolean.valueOf(Intrinsics.a(this.d, Boolean.TRUE) || this.e);
    }

    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(Boolean bool, Boolean bool2, JM<? super Boolean> jm) {
        boolean zBooleanValue = bool2.booleanValue();
        C3664es1 c3664es1 = new C3664es1(3, jm);
        c3664es1.d = bool;
        c3664es1.e = zBooleanValue;
        return c3664es1.invokeSuspend(Unit.a);
    }
}
