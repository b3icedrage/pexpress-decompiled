package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public class B42 {
    public final C4454ie2 c;
    public final Matrix a = new Matrix();
    public final Matrix b = new Matrix();
    public float[] d = new float[1];
    public final Matrix e = new Matrix();
    public final float[] f = new float[2];
    public final Matrix g = new Matrix();

    public B42(C4454ie2 c4454ie2) {
        new Matrix();
        this.c = c4454ie2;
    }

    public final C3581eV0 a(float f, float f2) {
        float[] fArr = this.f;
        fArr[0] = f;
        fArr[1] = f2;
        f(fArr);
        return C3581eV0.b(fArr[0], fArr[1]);
    }

    public final C3581eV0 b(float f, float f2) {
        C3581eV0 c3581eV0B = C3581eV0.b(0.0d, 0.0d);
        c(f, f2, c3581eV0B);
        return c3581eV0B;
    }

    public final void c(float f, float f2, C3581eV0 c3581eV0) {
        float[] fArr = this.f;
        fArr[0] = f;
        fArr[1] = f2;
        e(fArr);
        c3581eV0.e = fArr[0];
        c3581eV0.g = fArr[1];
    }

    public final void d(Path path) {
        path.transform(this.a);
        path.transform(this.c.a);
        path.transform(this.b);
    }

    public final void e(float[] fArr) {
        Matrix matrix = this.e;
        matrix.reset();
        this.b.invert(matrix);
        matrix.mapPoints(fArr);
        this.c.a.invert(matrix);
        matrix.mapPoints(fArr);
        this.a.invert(matrix);
        matrix.mapPoints(fArr);
    }

    public final void f(float[] fArr) {
        this.a.mapPoints(fArr);
        this.c.a.mapPoints(fArr);
        this.b.mapPoints(fArr);
    }

    public void g() {
        Matrix matrix = this.b;
        matrix.reset();
        C4454ie2 c4454ie2 = this.c;
        matrix.postTranslate(c4454ie2.b.left, c4454ie2.d - c4454ie2.k());
    }

    public final void h(float f, float f2, float f3, float f4) {
        C4454ie2 c4454ie2 = this.c;
        float fWidth = c4454ie2.b.width() / f2;
        float fHeight = c4454ie2.b.height() / f3;
        if (Float.isInfinite(fWidth)) {
            fWidth = 0.0f;
        }
        if (Float.isInfinite(fHeight)) {
            fHeight = 0.0f;
        }
        Matrix matrix = this.a;
        matrix.reset();
        matrix.postTranslate(-f, -f4);
        matrix.postScale(fWidth, -fHeight);
    }
}
