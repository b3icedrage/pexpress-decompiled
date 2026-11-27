package defpackage;

import android.graphics.Typeface;

/* JADX INFO: renamed from: ny, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5621ny extends G1 {
    public final Typeface e;
    public final C4257hi f;
    public boolean g;

    public C5621ny(C4257hi c4257hi, Typeface typeface) {
        this.e = typeface;
        this.f = c4257hi;
    }

    @Override // defpackage.G1
    public final void o(int i) {
        if (this.g) {
            return;
        }
        NE ne = (NE) this.f.d;
        if (ne.j(this.e)) {
            ne.h(false);
        }
    }

    @Override // defpackage.G1
    public final void p(Typeface typeface, boolean z) {
        if (this.g) {
            return;
        }
        NE ne = (NE) this.f.d;
        if (ne.j(typeface)) {
            ne.h(false);
        }
    }
}
