package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: mb2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.support.chat.data.UserLookupSessionValue$amplitudeUserIdAllowed$1", f = "UserLookupSessionValue.kt", l = {}, m = "invokeSuspend")
public final class C5333mb2 extends AW1 implements InterfaceC1060Gj0<Boolean, Boolean, JM<? super Boolean>, Object> {
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
        C5333mb2 c5333mb2 = new C5333mb2(3, jm);
        c5333mb2.d = bool;
        c5333mb2.e = zBooleanValue;
        return c5333mb2.invokeSuspend(Unit.a);
    }
}
