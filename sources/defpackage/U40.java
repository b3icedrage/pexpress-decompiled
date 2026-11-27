package defpackage;

import defpackage.U40;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class U40<T extends U40<T>> implements C6803tc.b {
    public static final b l = new b();
    public static final c m = new c();
    public static final d n = new d();
    public static final e o = new e();
    public static final f p = new f();
    public static final a q = new a();
    public float a;
    public float b;
    public boolean c;
    public final C4318i00 d;
    public final C4318i00.a e;
    public boolean f;
    public final float g;
    public long h;
    public final float i;
    public final ArrayList<h> j;
    public final ArrayList<i> k;

    public static class a extends j {
    }

    public static class b extends j {
    }

    public static class c extends j {
    }

    public static class d extends j {
    }

    public static class e extends j {
    }

    public static class f extends j {
    }

    public static class g {
        public float a;
        public float b;
    }

    public interface h {
        void b();
    }

    public interface i {
        void a();
    }

    public static abstract class j extends G1 {
    }

    public U40(C4318i00 c4318i00) {
        C4318i00.a aVar = C4318i00.u;
        this.a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = -3.4028235E38f;
        this.h = 0L;
        this.j = new ArrayList<>();
        this.k = new ArrayList<>();
        this.d = c4318i00;
        this.e = aVar;
        if (aVar == n || aVar == o || aVar == p) {
            this.i = 0.1f;
            return;
        }
        if (aVar == q) {
            this.i = 0.00390625f;
        } else if (aVar == l || aVar == m) {
            this.i = 0.00390625f;
        } else {
            this.i = 1.0f;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:27:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:30:0x010d  */
    /* JADX WARN: Code duplicated, block: B:34:0x011f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0125  */
    /* JADX WARN: Code duplicated, block: B:40:0x0138  */
    /* JADX WARN: Code duplicated, block: B:42:0x013e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0131 A[EDGE_INSN: B:45:0x0131->B:38:0x0131 BREAK  A[LOOP:0: B:32:0x0117->B:37:0x012e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x012e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0141 A[SYNTHETIC] */
    @Override // defpackage.C6803tc.b
    public final boolean a(long j2) {
        boolean z;
        ThreadLocal<C6803tc> threadLocal;
        C6803tc c6803tc;
        ArrayList<C6803tc.b> arrayList;
        int iIndexOf;
        ArrayList<h> arrayList2;
        int size;
        long j3 = this.h;
        int i2 = 0;
        if (j3 == 0) {
            this.h = j2;
            b(this.b);
            return false;
        }
        long j4 = j2 - j3;
        this.h = j2;
        FO1 fo1 = (FO1) this;
        if (!fo1.t) {
            if (fo1.s != Float.MAX_VALUE) {
                GO1 go1 = fo1.r;
                double d2 = go1.i;
                long j5 = j4 / 2;
                g gVarA = go1.a(fo1.b, fo1.a, j5);
                GO1 go2 = fo1.r;
                go2.i = fo1.s;
                fo1.s = Float.MAX_VALUE;
                g gVarA2 = go2.a(gVarA.a, gVarA.b, j5);
                fo1.b = gVarA2.a;
                fo1.a = gVarA2.b;
            } else {
                g gVarA3 = fo1.r.a(fo1.b, fo1.a, j4);
                fo1.b = gVarA3.a;
                fo1.a = gVarA3.b;
            }
            float fMax = Math.max(fo1.b, fo1.g);
            fo1.b = fMax;
            float fMin = Math.min(fMax, Float.MAX_VALUE);
            fo1.b = fMin;
            float f2 = fo1.a;
            GO1 go3 = fo1.r;
            go3.getClass();
            if (Math.abs(f2) >= go3.e || Math.abs(fMin - ((float) go3.i)) >= go3.d) {
                z = false;
            } else {
                fo1.b = (float) fo1.r.i;
                fo1.a = 0.0f;
            }
            float fMin2 = Math.min(this.b, Float.MAX_VALUE);
            this.b = fMin2;
            float fMax2 = Math.max(fMin2, this.g);
            this.b = fMax2;
            b(fMax2);
            if (z) {
                this.f = false;
                threadLocal = C6803tc.f;
                if (threadLocal.get() == null) {
                    threadLocal.set(new C6803tc());
                }
                c6803tc = threadLocal.get();
                c6803tc.a.remove(this);
                arrayList = c6803tc.b;
                iIndexOf = arrayList.indexOf(this);
                if (iIndexOf >= 0) {
                    arrayList.set(iIndexOf, null);
                    c6803tc.e = true;
                }
                this.h = 0L;
                this.c = false;
                while (true) {
                    arrayList2 = this.j;
                    if (i2 < arrayList2.size()) {
                        break;
                    }
                    if (arrayList2.get(i2) != null) {
                        arrayList2.get(i2).b();
                    }
                    i2++;
                }
                for (size = arrayList2.size() - 1; size >= 0; size--) {
                    if (arrayList2.get(size) == null) {
                        arrayList2.remove(size);
                    }
                }
            }
            return z;
        }
        float f3 = fo1.s;
        if (f3 != Float.MAX_VALUE) {
            fo1.r.i = f3;
            fo1.s = Float.MAX_VALUE;
        }
        fo1.b = (float) fo1.r.i;
        fo1.a = 0.0f;
        fo1.t = false;
        z = true;
        float fMin3 = Math.min(this.b, Float.MAX_VALUE);
        this.b = fMin3;
        float fMax3 = Math.max(fMin3, this.g);
        this.b = fMax3;
        b(fMax3);
        if (z) {
            this.f = false;
            threadLocal = C6803tc.f;
            if (threadLocal.get() == null) {
                threadLocal.set(new C6803tc());
            }
            c6803tc = threadLocal.get();
            c6803tc.a.remove(this);
            arrayList = c6803tc.b;
            iIndexOf = arrayList.indexOf(this);
            if (iIndexOf >= 0) {
                arrayList.set(iIndexOf, null);
                c6803tc.e = true;
            }
            this.h = 0L;
            this.c = false;
            while (true) {
                arrayList2 = this.j;
                if (i2 < arrayList2.size()) {
                    break;
                    break;
                }
                if (arrayList2.get(i2) != null) {
                    arrayList2.get(i2).b();
                }
                i2++;
            }
            while (size >= 0) {
                if (arrayList2.get(size) == null) {
                    arrayList2.remove(size);
                }
            }
        }
        return z;
    }

    public final void b(float f2) {
        ArrayList<i> arrayList;
        this.e.getClass();
        C4318i00 c4318i00 = this.d;
        c4318i00.s = f2 / 10000.0f;
        c4318i00.invalidateSelf();
        int i2 = 0;
        while (true) {
            arrayList = this.k;
            if (i2 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i2) != null) {
                arrayList.get(i2).a();
            }
            i2++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }
}
