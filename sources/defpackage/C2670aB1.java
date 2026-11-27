package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: aB1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2670aB1 implements ZA1 {

    @NotNull
    public final GP1 a;

    @NotNull
    public final C1699On1 b;

    public C2670aB1() {
        GP1 gp1I = C1589Ne.i(Boolean.FALSE);
        this.a = gp1I;
        this.b = C4466ii.f(gp1I);
    }

    @Override // defpackage.ZA1
    @NotNull
    public final C1699On1 a() {
        return this.b;
    }

    @Override // defpackage.ZA1
    public final void b(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        GP1 gp1 = this.a;
        gp1.getClass();
        gp1.m(null, boolValueOf);
    }
}
