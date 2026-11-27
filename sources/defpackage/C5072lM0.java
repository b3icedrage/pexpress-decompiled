package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: lM0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5072lM0 implements InterfaceC4862kM0 {

    @NotNull
    public final GP1 a;

    @NotNull
    public final C1699On1 b;

    public C5072lM0() {
        GP1 gp1I = C1589Ne.i(-1L);
        this.a = gp1I;
        this.b = C4466ii.f(gp1I);
    }

    @Override // defpackage.InterfaceC4862kM0
    public final void a(long j) {
        Long lValueOf = Long.valueOf(j);
        GP1 gp1 = this.a;
        gp1.getClass();
        gp1.m(null, lValueOf);
    }

    @Override // defpackage.InterfaceC4862kM0
    @NotNull
    public final C1699On1 b() {
        return this.b;
    }
}
