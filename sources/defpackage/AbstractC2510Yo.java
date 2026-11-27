package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: Yo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2510Yo extends AbstractC3748fH {
    public Vc2 f;
    public int l;
    public int m;
    public final ArrayList r;
    public int g = -7829368;
    public final float h = 1.0f;
    public int i = -7829368;
    public final float j = 1.0f;
    public float[] k = new float[0];
    public int n = 6;
    public final boolean o = true;
    public final boolean p = true;
    public final boolean q = true;
    public final boolean s = true;
    public final float t = 0.0f;
    public final float u = 0.0f;
    public boolean v = false;
    public boolean w = false;
    public float x = 0.0f;
    public float y = 0.0f;
    public float z = 0.0f;

    public AbstractC2510Yo() {
        this.d = AbstractC8067zc2.c(10.0f);
        this.b = AbstractC8067zc2.c(5.0f);
        this.c = AbstractC8067zc2.c(5.0f);
        this.r = new ArrayList();
    }

    public void a(float f, float f2) {
        float f3 = this.v ? this.y : f - this.t;
        float f4 = this.w ? this.x : f2 + this.u;
        if (Math.abs(f4 - f3) == 0.0f) {
            f4 += 1.0f;
            f3 -= 1.0f;
        }
        this.y = f3;
        this.x = f4;
        this.z = Math.abs(f4 - f3);
    }

    public final String b(int i) {
        return (i < 0 || i >= this.k.length) ? "" : d().a(this.k[i]);
    }

    public final String c() {
        String str = "";
        for (int i = 0; i < this.k.length; i++) {
            String strB = b(i);
            if (strB != null && str.length() < strB.length()) {
                str = strB;
            }
        }
        return str;
    }

    public final Vc2 d() {
        Vc2 vc2 = this.f;
        if (vc2 == null || ((vc2 instanceof QU) && ((QU) vc2).b != this.m)) {
            this.f = new QU(this.m);
        }
        return this.f;
    }
}
