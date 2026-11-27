package defpackage;

import N71.a;

/* JADX INFO: loaded from: classes.dex */
public final class N71<T extends a> {
    public static int g;
    public int a;
    public int b;
    public Object[] c;
    public int d;
    public T e;
    public float f;

    public static abstract class a {
        public int d = -1;

        public abstract a a();
    }

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (wrap java.lang.Class:0x0000: CONST_CLASS  A[WRAPPED] (LINE:1) N71.class) */
    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized N71 a(int i, a aVar) {
        N71 n71;
        synchronized (N71.class) {
            n71 = new N71();
            if (i <= 0) {
                throw new IllegalArgumentException("Object Pool must be instantiated with a capacity greater than 0!");
            }
            n71.b = i;
            n71.c = new Object[i];
            n71.d = 0;
            n71.e = aVar;
            n71.f = 1.0f;
            n71.d();
            int i2 = g;
            n71.a = i2;
            g = i2 + 1;
        }
        return n71;
    }

    public final synchronized T b() {
        T t;
        try {
            if (this.d == -1 && this.f > 0.0f) {
                d();
            }
            Object[] objArr = this.c;
            int i = this.d;
            t = (T) objArr[i];
            t.d = -1;
            this.d = i - 1;
        } catch (Throwable th) {
            throw th;
        }
        return t;
    }

    public final synchronized void c(T t) {
        try {
            int i = t.d;
            if (i != -1) {
                if (i == this.a) {
                    throw new IllegalArgumentException("The object passed is already stored in this pool!");
                }
                throw new IllegalArgumentException("The object to recycle already belongs to poolId " + t.d + ".  Object cannot belong to two different pool instances simultaneously!");
            }
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 >= this.c.length) {
                int i3 = this.b;
                int i4 = i3 * 2;
                this.b = i4;
                Object[] objArr = new Object[i4];
                for (int i5 = 0; i5 < i3; i5++) {
                    objArr[i5] = this.c[i5];
                }
                this.c = objArr;
            }
            t.d = this.a;
            this.c[this.d] = t;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void d() {
        float f = this.f;
        int i = this.b;
        int i2 = (int) (i * f);
        if (i2 < 1) {
            i = 1;
        } else if (i2 <= i) {
            i = i2;
        }
        for (int i3 = 0; i3 < i; i3++) {
            this.c[i3] = this.e.a();
        }
        this.d = i - 1;
    }
}
