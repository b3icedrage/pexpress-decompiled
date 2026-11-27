package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: f4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3703f4 implements InterfaceC3493e4 {

    @NotNull
    public final GP1 a;

    @NotNull
    public final C1699On1 b;

    public C3703f4() {
        GP1 gp1I = C1589Ne.i(Boolean.TRUE);
        this.a = gp1I;
        this.b = C4466ii.f(gp1I);
    }

    @Override // defpackage.InterfaceC3493e4
    public final void a(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        GP1 gp1 = this.a;
        gp1.getClass();
        gp1.m(null, boolValueOf);
    }

    @Override // defpackage.InterfaceC3493e4
    @NotNull
    public final C1699On1 b() {
        return this.b;
    }
}
