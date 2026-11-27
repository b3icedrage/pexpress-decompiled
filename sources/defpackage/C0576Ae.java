package defpackage;

import android.annotation.SuppressLint;

/* JADX INFO: renamed from: Ae, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0576Ae extends AbstractViewOnTouchListenerC1366Kh0 {
    public final /* synthetic */ C0654Be.g n;
    public final /* synthetic */ C0654Be o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0576Ae(C0654Be c0654Be, C0654Be c0654Be2, C0654Be.g gVar) {
        super(c0654Be2);
        this.o = c0654Be;
        this.n = gVar;
    }

    @Override // defpackage.AbstractViewOnTouchListenerC1366Kh0
    public final InterfaceC8013zL1 b() {
        return this.n;
    }

    @Override // defpackage.AbstractViewOnTouchListenerC1366Kh0
    @SuppressLint({"SyntheticAccessor"})
    public final boolean c() {
        C0654Be c0654Be = this.o;
        if (c0654Be.getInternalPopup().a()) {
            return true;
        }
        c0654Be.j.m(C0654Be.c.b(c0654Be), C0654Be.c.a(c0654Be));
        return true;
    }
}
