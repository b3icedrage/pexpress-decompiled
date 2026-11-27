package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class GQ1 extends AbstractInterpolatorC5634o11 {
    public final HQ1 a;
    public HO1 b;
    public FQ1 c;

    public GQ1() {
        HQ1 hq1 = new HQ1();
        hq1.k = false;
        this.a = hq1;
        this.c = hq1;
    }

    @Override // defpackage.AbstractInterpolatorC5634o11
    public final float a() {
        return this.c.b();
    }

    public final void b(float f, float f2, float f3, float f4, float f5, float f6) {
        HQ1 hq1 = this.a;
        this.c = hq1;
        hq1.l = f;
        boolean z = f > f2;
        hq1.k = z;
        if (z) {
            hq1.d(-f3, f - f2, f5, f6, f4);
        } else {
            hq1.d(f3, f2 - f, f5, f6, f4);
        }
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.c.getInterpolation(f);
    }
}
