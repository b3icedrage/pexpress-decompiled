package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class F11 extends AbstractRunnableC4712je2 {
    public static final N71<F11> k;

    static {
        N71<F11> n71A = N71.a(2, new F11(null, 0.0f, null, null));
        k = n71A;
        n71A.f = 0.5f;
    }

    public F11(C4454ie2 c4454ie2, float f, B42 b42, AbstractC4754jq abstractC4754jq) {
        this.e = new float[2];
        this.g = c4454ie2;
        this.h = f;
        this.i = b42;
        this.j = abstractC4754jq;
    }

    @Override // N71.a
    public final N71.a a() {
        return new F11(this.g, this.h, this.i, this.j);
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f = this.h;
        float[] fArr = this.e;
        fArr[0] = f;
        fArr[1] = 0.0f;
        this.i.f(fArr);
        this.g.a(fArr, this.j);
        k.c(this);
    }
}
