package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class TN1 implements Comparable<TN1> {
    public boolean d;
    public float i;
    public a m;
    public int e = -1;
    public int g = -1;
    public int h = 0;
    public boolean j = false;
    public final float[] k = new float[9];
    public final float[] l = new float[9];
    public C0747Cj[] n = new C0747Cj[16];
    public int o = 0;
    public int p = 0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a d;
        public static final a e;
        public static final a g;
        public static final a h;
        public static final /* synthetic */ a[] i;

        static {
            a aVar = new a("UNRESTRICTED", 0);
            d = aVar;
            a aVar2 = new a("CONSTANT", 1);
            a aVar3 = new a("SLACK", 2);
            e = aVar3;
            a aVar4 = new a("ERROR", 3);
            g = aVar4;
            a aVar5 = new a("UNKNOWN", 4);
            h = aVar5;
            i = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) i.clone();
        }
    }

    public TN1(a aVar) {
        this.m = aVar;
    }

    public final void b(C0747Cj c0747Cj) {
        int i = 0;
        while (true) {
            int i2 = this.o;
            if (i >= i2) {
                C0747Cj[] c0747CjArr = this.n;
                if (i2 >= c0747CjArr.length) {
                    this.n = (C0747Cj[]) Arrays.copyOf(c0747CjArr, c0747CjArr.length * 2);
                }
                C0747Cj[] c0747CjArr2 = this.n;
                int i3 = this.o;
                c0747CjArr2[i3] = c0747Cj;
                this.o = i3 + 1;
                return;
            }
            if (this.n[i] == c0747Cj) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(TN1 tn1) {
        return this.e - tn1.e;
    }

    public final void e(C0747Cj c0747Cj) {
        int i = this.o;
        int i2 = 0;
        while (i2 < i) {
            if (this.n[i2] == c0747Cj) {
                while (i2 < i - 1) {
                    C0747Cj[] c0747CjArr = this.n;
                    int i3 = i2 + 1;
                    c0747CjArr[i2] = c0747CjArr[i3];
                    i2 = i3;
                }
                this.o--;
                return;
            }
            i2++;
        }
    }

    public final void f() {
        this.m = a.h;
        this.h = 0;
        this.e = -1;
        this.g = -1;
        this.i = 0.0f;
        this.j = false;
        int i = this.o;
        for (int i2 = 0; i2 < i; i2++) {
            this.n[i2] = null;
        }
        this.o = 0;
        this.p = 0;
        this.d = false;
        Arrays.fill(this.l, 0.0f);
    }

    public final void i(C4874kQ0 c4874kQ0, float f) {
        this.i = f;
        this.j = true;
        int i = this.o;
        this.g = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.n[i2].h(c4874kQ0, this, false);
        }
        this.o = 0;
    }

    public final void k(C4874kQ0 c4874kQ0, C0747Cj c0747Cj) {
        int i = this.o;
        for (int i2 = 0; i2 < i; i2++) {
            this.n[i2].i(c4874kQ0, c0747Cj, false);
        }
        this.o = 0;
    }

    public final String toString() {
        return "" + this.e;
    }
}
