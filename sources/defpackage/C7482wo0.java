package defpackage;

/* JADX INFO: renamed from: wo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7482wo0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final int e = -1;
    public final int f;
    public final Kl2.a g;
    public float h;
    public float i;

    public C7482wo0(float f, float f2, int i) {
        this.a = f;
        this.b = f2;
        this.f = i;
    }

    public final boolean a(C7482wo0 c7482wo0) {
        return c7482wo0 != null && this.f == c7482wo0.f && this.a == c7482wo0.a && this.e == c7482wo0.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Highlight, x: ");
        sb.append(this.a);
        sb.append(", y: ");
        sb.append(this.b);
        sb.append(", dataSetIndex: ");
        return SK.b(sb, this.f, ", stackIndex (only stacked barentry): -1");
    }

    public C7482wo0(float f, float f2, float f3, float f4, int i, Kl2.a aVar) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.f = i;
        this.g = aVar;
    }
}
