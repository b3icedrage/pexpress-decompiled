package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: Fm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.registration.screens.authorization.AuthorizationViewModelBase$isRegisterButtonDisabled$1", f = "AuthorizationViewModelBase.kt", l = {}, m = "invokeSuspend")
public final class C0990Fm extends AW1 implements InterfaceC1060Gj0<Boolean, Boolean, JM<? super Boolean>, Object> {
    public /* synthetic */ boolean d;
    public /* synthetic */ boolean e;

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        return Boolean.valueOf(this.d || !this.e);
    }

    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(Boolean bool, Boolean bool2, JM<? super Boolean> jm) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        C0990Fm c0990Fm = new C0990Fm(3, jm);
        c0990Fm.d = zBooleanValue;
        c0990Fm.e = zBooleanValue2;
        return c0990Fm.invokeSuspend(Unit.a);
    }
}
