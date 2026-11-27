package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Trace;
import defpackage.G02;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Runnable {
    public static final ThreadLocal<s> i = new ThreadLocal<>();
    public static final a j = new a();
    public long e;
    public long g;
    public final ArrayList<RecyclerView> d = new ArrayList<>();
    public final ArrayList<c> h = new ArrayList<>();

    public class a implements Comparator<c> {
        @Override // java.util.Comparator
        public final int compare(c cVar, c cVar2) {
            c cVar3 = cVar;
            c cVar4 = cVar2;
            RecyclerView recyclerView = cVar3.d;
            if ((recyclerView == null) == (cVar4.d == null)) {
                boolean z = cVar3.a;
                if (z == cVar4.a) {
                    int i = cVar4.b - cVar3.b;
                    if (i != 0) {
                        return i;
                    }
                    int i2 = cVar3.c - cVar4.c;
                    if (i2 != 0) {
                        return i2;
                    }
                    return 0;
                }
                if (z) {
                    return -1;
                }
            } else if (recyclerView != null) {
                return -1;
            }
            return 1;
        }
    }

    @SuppressLint({"VisibleForTests"})
    public static class b {
        public int a;
        public int b;
        public int[] c;
        public int d;

        public final void a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i3 = this.d;
            int i4 = i3 * 2;
            int[] iArr = this.c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i4 >= iArr.length) {
                int[] iArr3 = new int[i3 * 4];
                this.c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.c;
            iArr4[i4] = i;
            iArr4[i4 + 1] = i2;
            this.d++;
        }

        public final void b(RecyclerView recyclerView, boolean z) {
            this.d = 0;
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.m mVar = recyclerView.r;
            if (recyclerView.q == null || mVar == null || !mVar.i) {
                return;
            }
            if (z) {
                if (!recyclerView.i.g()) {
                    mVar.i(recyclerView.q.c(), this);
                }
            } else if (!recyclerView.N()) {
                mVar.h(this.a, this.b, recyclerView.m0, this);
            }
            int i = this.d;
            if (i > mVar.j) {
                mVar.j = i;
                mVar.k = z;
                recyclerView.g.m();
            }
        }
    }

    public static class c {
        public boolean a;
        public int b;
        public int c;
        public RecyclerView d;
        public int e;
    }

    public static RecyclerView.C c(RecyclerView recyclerView, int i2, long j2) {
        int iH = recyclerView.j.h();
        for (int i3 = 0; i3 < iH; i3++) {
            RecyclerView.C cK = RecyclerView.K(recyclerView.j.g(i3));
            if (cK.c == i2 && !cK.f()) {
                return null;
            }
        }
        RecyclerView.t tVar = recyclerView.g;
        try {
            recyclerView.S();
            RecyclerView.C cK2 = tVar.k(i2, j2);
            if (cK2 != null) {
                if (!cK2.e() || cK2.f()) {
                    tVar.a(cK2, false);
                } else {
                    tVar.h(cK2.a);
                }
            }
            return cK2;
        } finally {
            recyclerView.T(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i2, int i3) {
        if (recyclerView.x && this.e == 0) {
            this.e = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        b bVar = recyclerView.l0;
        bVar.a = i2;
        bVar.b = i3;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c8  */
    public final void b(long j2) {
        c cVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        c cVar2;
        ArrayList<RecyclerView> arrayList = this.d;
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView recyclerView3 = arrayList.get(i3);
            if (recyclerView3.getWindowVisibility() == 0) {
                b bVar = recyclerView3.l0;
                bVar.b(recyclerView3, false);
                i2 += bVar.d;
            }
        }
        ArrayList<c> arrayList2 = this.h;
        arrayList2.ensureCapacity(i2);
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView4 = arrayList.get(i5);
            if (recyclerView4.getWindowVisibility() == 0) {
                b bVar2 = recyclerView4.l0;
                int iAbs = Math.abs(bVar2.b) + Math.abs(bVar2.a);
                for (int i6 = 0; i6 < bVar2.d * 2; i6 += 2) {
                    if (i4 >= arrayList2.size()) {
                        cVar2 = new c();
                        arrayList2.add(cVar2);
                    } else {
                        cVar2 = arrayList2.get(i4);
                    }
                    int[] iArr = bVar2.c;
                    int i7 = iArr[i6 + 1];
                    cVar2.a = i7 <= iAbs;
                    cVar2.b = iAbs;
                    cVar2.c = i7;
                    cVar2.d = recyclerView4;
                    cVar2.e = iArr[i6];
                    i4++;
                }
            }
        }
        Collections.sort(arrayList2, j);
        for (int i8 = 0; i8 < arrayList2.size() && (recyclerView = (cVar = arrayList2.get(i8)).d) != null; i8++) {
            RecyclerView.C c2 = c(recyclerView, cVar.e, cVar.a ? Long.MAX_VALUE : j2);
            if (c2 != null && c2.b != null && c2.e() && !c2.f() && (recyclerView2 = c2.b.get()) != null) {
                if (recyclerView2.I && recyclerView2.j.h() != 0) {
                    RecyclerView.j jVar = recyclerView2.R;
                    if (jVar != null) {
                        jVar.e();
                    }
                    RecyclerView.m mVar = recyclerView2.r;
                    RecyclerView.t tVar = recyclerView2.g;
                    if (mVar != null) {
                        mVar.g0(tVar);
                        recyclerView2.r.h0(tVar);
                    }
                    tVar.a.clear();
                    tVar.f();
                }
                b bVar3 = recyclerView2.l0;
                bVar3.b(recyclerView2, true);
                if (bVar3.d != 0) {
                    try {
                        int i9 = G02.a;
                        Trace.beginSection("RV Nested Prefetch");
                        RecyclerView.y yVar = recyclerView2.m0;
                        RecyclerView.e eVar = recyclerView2.q;
                        yVar.d = 1;
                        yVar.e = eVar.c();
                        yVar.g = false;
                        yVar.h = false;
                        yVar.i = false;
                        for (int i10 = 0; i10 < bVar3.d * 2; i10 += 2) {
                            c(recyclerView2, bVar3.c[i10], j2);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        int i11 = G02.a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            cVar.a = false;
            cVar.b = 0;
            cVar.c = 0;
            cVar.d = null;
            cVar.e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i2 = G02.a;
            Trace.beginSection("RV Prefetch");
            ArrayList<RecyclerView> arrayList = this.d;
            if (arrayList.isEmpty()) {
                this.e = 0L;
                return;
            }
            int size = arrayList.size();
            long jMax = 0;
            for (int i3 = 0; i3 < size; i3++) {
                RecyclerView recyclerView = arrayList.get(i3);
                if (recyclerView.getWindowVisibility() == 0) {
                    jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.e = 0L;
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.g);
                this.e = 0L;
            }
        } finally {
            this.e = 0L;
            int i4 = G02.a;
            Trace.endSection();
        }
    }
}
