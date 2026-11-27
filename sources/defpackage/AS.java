package defpackage;

import defpackage.C3506e70;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class AS<T extends C3506e70> extends AbstractC7697xq<T> {
    public ArrayList o;
    public float p;
    public float q;
    public float r;
    public float s;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a d;
        public static final a e;
        public static final a g;
        public static final /* synthetic */ a[] h;

        static {
            a aVar = new a("UP", 0);
            d = aVar;
            a aVar2 = new a("DOWN", 1);
            e = aVar2;
            a aVar3 = new a("CLOSEST", 2);
            g = aVar3;
            h = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) h.clone();
        }
    }

    @Override // defpackage.InterfaceC6653ss0
    public final T G(float f, float f2, a aVar) {
        int iH0 = h0(f, f2, aVar);
        if (iH0 > -1) {
            return (T) this.o.get(iH0);
        }
        return null;
    }

    @Override // defpackage.InterfaceC6653ss0
    public final void J(float f, float f2) {
        ArrayList arrayList = this.o;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        this.p = -3.4028235E38f;
        this.q = Float.MAX_VALUE;
        int iH0 = h0(f2, Float.NaN, a.d);
        for (int iH1 = h0(f, Float.NaN, a.e); iH1 <= iH0; iH1++) {
            g0((C3506e70) this.o.get(iH1));
        }
    }

    @Override // defpackage.InterfaceC6653ss0
    public final ArrayList K(float f) {
        ArrayList arrayList = new ArrayList();
        int size = this.o.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (size + i) / 2;
            C3506e70 c3506e70 = (C3506e70) this.o.get(i2);
            if (f == c3506e70.b()) {
                while (i2 > 0 && ((C3506e70) this.o.get(i2 - 1)).b() == f) {
                    i2--;
                }
                int size2 = this.o.size();
                while (i2 < size2) {
                    C3506e70 c3506e71 = (C3506e70) this.o.get(i2);
                    if (c3506e71.b() != f) {
                        break;
                    }
                    arrayList.add(c3506e71);
                    i2++;
                }
                break;
            }
            if (f > c3506e70.b()) {
                i = i2 + 1;
            } else {
                size = i2 - 1;
            }
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC6653ss0
    public final float L() {
        return this.r;
    }

    @Override // defpackage.InterfaceC6653ss0
    public final int T() {
        return this.o.size();
    }

    @Override // defpackage.InterfaceC6653ss0
    public final void clear() {
        this.o.clear();
        e0();
    }

    @Override // defpackage.InterfaceC6653ss0
    public final float e() {
        return this.s;
    }

    public final void e0() {
        ArrayList arrayList = this.o;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        this.p = -3.4028235E38f;
        this.q = Float.MAX_VALUE;
        this.r = -3.4028235E38f;
        this.s = Float.MAX_VALUE;
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            f0((C3506e70) it.next());
        }
    }

    public final void f0(T t) {
        if (t == null) {
            return;
        }
        if (t.b() < this.s) {
            this.s = t.b();
        }
        if (t.b() > this.r) {
            this.r = t.b();
        }
        g0(t);
    }

    @Override // defpackage.InterfaceC6653ss0
    public final float g() {
        return this.p;
    }

    public final void g0(T t) {
        if (t.a() < this.q) {
            this.q = t.a();
        }
        if (t.a() > this.p) {
            this.p = t.a();
        }
    }

    public final int h0(float f, float f2, a aVar) {
        int i;
        C3506e70 c3506e70;
        ArrayList arrayList = this.o;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        int size = this.o.size() - 1;
        int i2 = 0;
        while (i2 < size) {
            int i3 = (i2 + size) / 2;
            float fB = ((C3506e70) this.o.get(i3)).b() - f;
            int i4 = i3 + 1;
            float fB2 = ((C3506e70) this.o.get(i4)).b() - f;
            float fAbs = Math.abs(fB);
            float fAbs2 = Math.abs(fB2);
            if (fAbs2 >= fAbs) {
                if (fAbs >= fAbs2) {
                    double d = fB;
                    if (d < 0.0d) {
                        if (d < 0.0d) {
                        }
                    }
                }
                size = i3;
            }
            i2 = i4;
        }
        if (size != -1) {
            float fB3 = ((C3506e70) this.o.get(size)).b();
            if (aVar == a.d) {
                if (fB3 < f && size < this.o.size() - 1) {
                    size++;
                }
            } else if (aVar == a.e && fB3 > f && size > 0) {
                size--;
            }
            if (!Float.isNaN(f2)) {
                while (size > 0 && ((C3506e70) this.o.get(size - 1)).b() == fB3) {
                    size--;
                }
                float fA = ((C3506e70) this.o.get(size)).a();
                loop2: while (true) {
                    i = size;
                    do {
                        size++;
                        if (size >= this.o.size()) {
                            break loop2;
                        }
                        c3506e70 = (C3506e70) this.o.get(size);
                        if (c3506e70.b() != fB3) {
                            break loop2;
                        }
                    } while (Math.abs(c3506e70.a() - f2) >= Math.abs(fA - f2));
                    fA = f2;
                }
                return i;
            }
        }
        return size;
    }

    @Override // defpackage.InterfaceC6653ss0
    public final T i(float f, float f2) {
        return (T) G(f, f2, a.g);
    }

    @Override // defpackage.InterfaceC6653ss0
    public final float o() {
        return this.q;
    }

    @Override // defpackage.InterfaceC6653ss0
    public final int p(C3506e70 c3506e70) {
        return this.o.indexOf(c3506e70);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        StringBuilder sb = new StringBuilder("DataSet, label: ");
        String str = this.c;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append(", entries: ");
        sb.append(this.o.size());
        sb.append("\n");
        stringBuffer2.append(sb.toString());
        stringBuffer.append(stringBuffer2.toString());
        for (int i = 0; i < this.o.size(); i++) {
            stringBuffer.append(((C3506e70) this.o.get(i)).toString() + " ");
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.InterfaceC6653ss0
    public final boolean w(T t) {
        ArrayList arrayList = this.o;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        f0(t);
        return arrayList.add(t);
    }

    @Override // defpackage.InterfaceC6653ss0
    public final T y(int i) {
        return (T) this.o.get(i);
    }
}
