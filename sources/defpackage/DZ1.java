package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class DZ1 implements CZ1 {

    @NotNull
    public final GP1 a;

    @NotNull
    public final C4250hg0 b;

    public DZ1() {
        GP1 gp1I = C1589Ne.i(null);
        this.a = gp1I;
        this.b = new C4250hg0(gp1I, 0);
    }

    @Override // defpackage.CZ1
    public final void a(int i) {
        Integer numValueOf = Integer.valueOf(i);
        GP1 gp1 = this.a;
        gp1.getClass();
        gp1.m(null, numValueOf);
    }

    @Override // defpackage.CZ1
    @NotNull
    public final C4250hg0 getValue() {
        return this.b;
    }
}
