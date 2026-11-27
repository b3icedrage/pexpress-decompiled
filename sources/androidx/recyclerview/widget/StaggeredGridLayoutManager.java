package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import defpackage.C1742Pc;
import defpackage.C5345me2;
import defpackage.Cd2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.m implements RecyclerView.x.b {
    public final d B;
    public final int C;
    public boolean D;
    public boolean E;
    public e F;
    public final Rect G;
    public final b H;
    public final boolean I;
    public int[] J;
    public final a K;
    public final int p;
    public final f[] q;

    @NonNull
    public final z r;

    @NonNull
    public final z s;
    public final int t;
    public int u;

    @NonNull
    public final t v;
    public boolean w;
    public final BitSet y;
    public boolean x = false;
    public int z = -1;
    public int A = Integer.MIN_VALUE;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            StaggeredGridLayoutManager.this.B0();
        }
    }

    public class b {
        public int a;
        public int b;
        public boolean c;
        public boolean d;
        public boolean e;
        public int[] f;

        public b() {
            a();
        }

        public final void a() {
            this.a = -1;
            this.b = Integer.MIN_VALUE;
            this.c = false;
            this.d = false;
            this.e = false;
            int[] iArr = this.f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    public static class c extends RecyclerView.n {
        public f e;
    }

    public static class d {
        public int[] a;
        public ArrayList b;

        @SuppressLint({"BanParcelableUsage"})
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0238a();
            public int d;
            public int e;
            public int[] g;
            public boolean h;

            /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            public class C0238a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                public final a createFromParcel(Parcel parcel) {
                    a aVar = new a();
                    aVar.d = parcel.readInt();
                    aVar.e = parcel.readInt();
                    aVar.h = parcel.readInt() == 1;
                    int i = parcel.readInt();
                    if (i > 0) {
                        int[] iArr = new int[i];
                        aVar.g = iArr;
                        parcel.readIntArray(iArr);
                    }
                    return aVar;
                }

                @Override // android.os.Parcelable.Creator
                public final a[] newArray(int i) {
                    return new a[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                return "FullSpanItem{mPosition=" + this.d + ", mGapDir=" + this.e + ", mHasUnwantedGapAfter=" + this.h + ", mGapPerSpan=" + Arrays.toString(this.g) + '}';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.d);
                parcel.writeInt(this.e);
                parcel.writeInt(this.h ? 1 : 0);
                int[] iArr = this.g;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.g);
                }
            }
        }

        public final void a() {
            int[] iArr = this.a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.b = null;
        }

        public final void b(int i) {
            int[] iArr = this.a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int length = iArr.length;
                while (length <= i) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public final void c(int i, int i2) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            b(i3);
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.a, i, i3, -1);
            ArrayList arrayList = this.b;
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) this.b.get(size);
                int i4 = aVar.d;
                if (i4 >= i) {
                    aVar.d = i4 + i2;
                }
            }
        }

        public final void d(int i, int i2) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            b(i3);
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.a;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            ArrayList arrayList = this.b;
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) this.b.get(size);
                int i4 = aVar.d;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.b.remove(size);
                    } else {
                        aVar.d = i4 - i2;
                    }
                }
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();
        public int d;
        public int e;
        public int g;
        public int[] h;
        public int i;
        public int[] j;
        public ArrayList k;
        public boolean l;
        public boolean m;
        public boolean n;

        public class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public final e createFromParcel(Parcel parcel) {
                e eVar = new e();
                eVar.d = parcel.readInt();
                eVar.e = parcel.readInt();
                int i = parcel.readInt();
                eVar.g = i;
                if (i > 0) {
                    int[] iArr = new int[i];
                    eVar.h = iArr;
                    parcel.readIntArray(iArr);
                }
                int i2 = parcel.readInt();
                eVar.i = i2;
                if (i2 > 0) {
                    int[] iArr2 = new int[i2];
                    eVar.j = iArr2;
                    parcel.readIntArray(iArr2);
                }
                eVar.l = parcel.readInt() == 1;
                eVar.m = parcel.readInt() == 1;
                eVar.n = parcel.readInt() == 1;
                eVar.k = parcel.readArrayList(d.a.class.getClassLoader());
                return eVar;
            }

            @Override // android.os.Parcelable.Creator
            public final e[] newArray(int i) {
                return new e[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeInt(this.g);
            if (this.g > 0) {
                parcel.writeIntArray(this.h);
            }
            parcel.writeInt(this.i);
            if (this.i > 0) {
                parcel.writeIntArray(this.j);
            }
            parcel.writeInt(this.l ? 1 : 0);
            parcel.writeInt(this.m ? 1 : 0);
            parcel.writeInt(this.n ? 1 : 0);
            parcel.writeList(this.k);
        }
    }

    public class f {
        public final ArrayList<View> a = new ArrayList<>();
        public int b = Integer.MIN_VALUE;
        public int c = Integer.MIN_VALUE;
        public int d = 0;
        public final int e;

        public f(int i) {
            this.e = i;
        }

        public final void a() {
            View view = (View) C1742Pc.c(1, this.a);
            c cVar = (c) view.getLayoutParams();
            this.c = StaggeredGridLayoutManager.this.r.b(view);
            cVar.getClass();
        }

        public final void b() {
            this.a.clear();
            this.b = Integer.MIN_VALUE;
            this.c = Integer.MIN_VALUE;
            this.d = 0;
        }

        public final int c() {
            boolean z = StaggeredGridLayoutManager.this.w;
            ArrayList<View> arrayList = this.a;
            return z ? e(arrayList.size() - 1, -1) : e(0, arrayList.size());
        }

        public final int d() {
            boolean z = StaggeredGridLayoutManager.this.w;
            ArrayList<View> arrayList = this.a;
            return z ? e(0, arrayList.size()) : e(arrayList.size() - 1, -1);
        }

        public final int e(int i, int i2) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            int iK = staggeredGridLayoutManager.r.k();
            int iG = staggeredGridLayoutManager.r.g();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.a.get(i);
                int iE = staggeredGridLayoutManager.r.e(view);
                int iB = staggeredGridLayoutManager.r.b(view);
                boolean z = iE <= iG;
                boolean z2 = iB >= iK;
                if (z && z2 && (iE < iK || iB > iG)) {
                    return RecyclerView.m.F(view);
                }
                i += i3;
            }
            return -1;
        }

        public final int f(int i) {
            int i2 = this.c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            a();
            return this.c;
        }

        public final View g(int i, int i2) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            ArrayList<View> arrayList = this.a;
            View view = null;
            if (i2 != -1) {
                int size = arrayList.size() - 1;
                while (size >= 0) {
                    View view2 = arrayList.get(size);
                    if ((staggeredGridLayoutManager.w && RecyclerView.m.F(view2) >= i) || ((!staggeredGridLayoutManager.w && RecyclerView.m.F(view2) <= i) || !view2.hasFocusable())) {
                        break;
                    }
                    size--;
                    view = view2;
                }
                return view;
            }
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                View view3 = arrayList.get(i3);
                if ((staggeredGridLayoutManager.w && RecyclerView.m.F(view3) <= i) || ((!staggeredGridLayoutManager.w && RecyclerView.m.F(view3) >= i) || !view3.hasFocusable())) {
                    break;
                }
                i3++;
                view = view3;
            }
            return view;
        }

        public final int h(int i) {
            int i2 = this.b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            View view = this.a.get(0);
            c cVar = (c) view.getLayoutParams();
            this.b = StaggeredGridLayoutManager.this.r.e(view);
            cVar.getClass();
            return this.b;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = -1;
        this.w = false;
        d dVar = new d();
        this.B = dVar;
        this.C = 2;
        this.G = new Rect();
        this.H = new b();
        this.I = true;
        this.K = new a();
        RecyclerView.m.c cVarG = RecyclerView.m.G(context, attributeSet, i, i2);
        int i3 = cVarG.a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i3 != this.t) {
            this.t = i3;
            z zVar = this.r;
            this.r = this.s;
            this.s = zVar;
            m0();
        }
        int i4 = cVarG.b;
        c(null);
        if (i4 != this.p) {
            dVar.a();
            m0();
            this.p = i4;
            this.y = new BitSet(this.p);
            this.q = new f[this.p];
            for (int i5 = 0; i5 < this.p; i5++) {
                this.q[i5] = new f(i5);
            }
            m0();
        }
        boolean z = cVarG.c;
        c(null);
        e eVar = this.F;
        if (eVar != null && eVar.l != z) {
            eVar.l = z;
        }
        this.w = z;
        m0();
        t tVar = new t();
        tVar.a = true;
        tVar.f = 0;
        tVar.g = 0;
        this.v = tVar;
        this.r = z.a(this, this.t);
        this.s = z.a(this, 1 - this.t);
    }

    public static int d1(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean A0() {
        return this.F == null;
    }

    public final boolean B0() {
        int iK0;
        if (v() != 0 && this.C != 0 && this.g) {
            if (this.x) {
                iK0 = L0();
                K0();
            } else {
                iK0 = K0();
                L0();
            }
            d dVar = this.B;
            if (iK0 == 0 && P0() != null) {
                dVar.a();
                this.f = true;
                m0();
                return true;
            }
        }
        return false;
    }

    public final int C0(RecyclerView.y yVar) {
        if (v() == 0) {
            return 0;
        }
        z zVar = this.r;
        boolean z = !this.I;
        return F.a(yVar, zVar, H0(z), G0(z), this, this.I);
    }

    public final int D0(RecyclerView.y yVar) {
        if (v() == 0) {
            return 0;
        }
        z zVar = this.r;
        boolean z = !this.I;
        return F.b(yVar, zVar, H0(z), G0(z), this, this.I, this.x);
    }

    public final int E0(RecyclerView.y yVar) {
        if (v() == 0) {
            return 0;
        }
        z zVar = this.r;
        boolean z = !this.I;
        return F.c(yVar, zVar, H0(z), G0(z), this, this.I);
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    public final int F0(RecyclerView.t tVar, t tVar2, RecyclerView.y yVar) {
        f fVar;
        ?? r6;
        int i;
        int iH;
        int iC;
        int iK;
        int iC2;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        int i6 = 1;
        this.y.set(0, this.p, true);
        t tVar3 = this.v;
        int i7 = tVar3.i ? tVar2.e == 1 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : Integer.MIN_VALUE : tVar2.e == 1 ? tVar2.g + tVar2.b : tVar2.f - tVar2.b;
        int i8 = tVar2.e;
        for (int i9 = 0; i9 < this.p; i9++) {
            if (!this.q[i9].a.isEmpty()) {
                c1(this.q[i9], i8, i7);
            }
        }
        int iG = this.x ? this.r.g() : this.r.k();
        boolean z = false;
        while (true) {
            int i10 = tVar2.c;
            if (((i10 < 0 || i10 >= yVar.b()) ? i5 : i6) == 0 || (!tVar3.i && this.y.isEmpty())) {
                break;
            }
            View view = tVar.k(tVar2.c, Long.MAX_VALUE).a;
            tVar2.c += tVar2.d;
            c cVar = (c) view.getLayoutParams();
            int iB = cVar.a.b();
            d dVar = this.B;
            int[] iArr = dVar.a;
            int i11 = (iArr == null || iB >= iArr.length) ? -1 : iArr[iB];
            if (i11 == -1) {
                if (T0(tVar2.e)) {
                    i4 = this.p - i6;
                    i3 = -1;
                    i2 = -1;
                } else {
                    i2 = i6;
                    i3 = this.p;
                    i4 = i5;
                }
                f fVar2 = null;
                if (tVar2.e == i6) {
                    int iK2 = this.r.k();
                    int i12 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    while (i4 != i3) {
                        f fVar3 = this.q[i4];
                        int iF = fVar3.f(iK2);
                        if (iF < i12) {
                            i12 = iF;
                            fVar2 = fVar3;
                        }
                        i4 += i2;
                    }
                } else {
                    int iG2 = this.r.g();
                    int i13 = Integer.MIN_VALUE;
                    while (i4 != i3) {
                        f fVar4 = this.q[i4];
                        int iH2 = fVar4.h(iG2);
                        if (iH2 > i13) {
                            fVar2 = fVar4;
                            i13 = iH2;
                        }
                        i4 += i2;
                    }
                }
                fVar = fVar2;
                dVar.b(iB);
                dVar.a[iB] = fVar.e;
            } else {
                fVar = this.q[i11];
            }
            cVar.e = fVar;
            if (tVar2.e == 1) {
                r6 = 0;
                b(view, -1, false);
            } else {
                r6 = 0;
                b(view, 0, false);
            }
            if (this.t == 1) {
                i = 1;
                R0(view, RecyclerView.m.w(r6, this.u, this.l, r6, ((ViewGroup.MarginLayoutParams) cVar).width), RecyclerView.m.w(true, this.o, this.m, B() + E(), ((ViewGroup.MarginLayoutParams) cVar).height));
            } else {
                i = 1;
                R0(view, RecyclerView.m.w(true, this.n, this.l, D() + C(), ((ViewGroup.MarginLayoutParams) cVar).width), RecyclerView.m.w(false, this.u, this.m, 0, ((ViewGroup.MarginLayoutParams) cVar).height));
            }
            if (tVar2.e == i) {
                iC = fVar.f(iG);
                iH = this.r.c(view) + iC;
            } else {
                iH = fVar.h(iG);
                iC = iH - this.r.c(view);
            }
            if (tVar2.e == 1) {
                f fVar5 = cVar.e;
                fVar5.getClass();
                c cVar2 = (c) view.getLayoutParams();
                cVar2.e = fVar5;
                ArrayList<View> arrayList = fVar5.a;
                arrayList.add(view);
                fVar5.c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    fVar5.b = Integer.MIN_VALUE;
                }
                if (cVar2.a.h() || cVar2.a.k()) {
                    fVar5.d = StaggeredGridLayoutManager.this.r.c(view) + fVar5.d;
                }
            } else {
                f fVar6 = cVar.e;
                fVar6.getClass();
                c cVar3 = (c) view.getLayoutParams();
                cVar3.e = fVar6;
                ArrayList<View> arrayList2 = fVar6.a;
                arrayList2.add(0, view);
                fVar6.b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    fVar6.c = Integer.MIN_VALUE;
                }
                if (cVar3.a.h() || cVar3.a.k()) {
                    fVar6.d = StaggeredGridLayoutManager.this.r.c(view) + fVar6.d;
                }
            }
            if (Q0() && this.t == 1) {
                iC2 = this.s.g() - (((this.p - 1) - fVar.e) * this.u);
                iK = iC2 - this.s.c(view);
            } else {
                iK = this.s.k() + (fVar.e * this.u);
                iC2 = this.s.c(view) + iK;
            }
            if (this.t == 1) {
                RecyclerView.m.L(view, iK, iC, iC2, iH);
            } else {
                RecyclerView.m.L(view, iC, iK, iH, iC2);
            }
            c1(fVar, tVar3.e, i7);
            V0(tVar, tVar3);
            if (tVar3.h && view.hasFocusable()) {
                this.y.set(fVar.e, false);
            }
            i6 = 1;
            z = true;
            i5 = 0;
        }
        if (!z) {
            V0(tVar, tVar3);
        }
        int iK3 = tVar3.e == -1 ? this.r.k() - N0(this.r.k()) : M0(this.r.g()) - this.r.g();
        if (iK3 > 0) {
            return Math.min(tVar2.b, iK3);
        }
        return 0;
    }

    public final View G0(boolean z) {
        int iK = this.r.k();
        int iG = this.r.g();
        View view = null;
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            int iE = this.r.e(viewU);
            int iB = this.r.b(viewU);
            if (iB > iK && iE < iG) {
                if (iB <= iG || !z) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    public final View H0(boolean z) {
        int iK = this.r.k();
        int iG = this.r.g();
        int iV = v();
        View view = null;
        for (int i = 0; i < iV; i++) {
            View viewU = u(i);
            int iE = this.r.e(viewU);
            if (this.r.b(viewU) > iK && iE < iG) {
                if (iE >= iK || !z) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    public final void I0(RecyclerView.t tVar, RecyclerView.y yVar, boolean z) {
        int iG;
        int iM0 = M0(Integer.MIN_VALUE);
        if (iM0 != Integer.MIN_VALUE && (iG = this.r.g() - iM0) > 0) {
            int i = iG - (-Z0(-iG, tVar, yVar));
            if (!z || i <= 0) {
                return;
            }
            this.r.o(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean J() {
        return this.C != 0;
    }

    public final void J0(RecyclerView.t tVar, RecyclerView.y yVar, boolean z) {
        int iK;
        int iN0 = N0(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (iN0 != Integer.MAX_VALUE && (iK = iN0 - this.r.k()) > 0) {
            int iZ0 = iK - Z0(iK, tVar, yVar);
            if (!z || iZ0 <= 0) {
                return;
            }
            this.r.o(-iZ0);
        }
    }

    public final int K0() {
        if (v() == 0) {
            return 0;
        }
        return RecyclerView.m.F(u(0));
    }

    public final int L0() {
        int iV = v();
        if (iV == 0) {
            return 0;
        }
        return RecyclerView.m.F(u(iV - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void M(int i) {
        super.M(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            f fVar = this.q[i2];
            int i3 = fVar.b;
            if (i3 != Integer.MIN_VALUE) {
                fVar.b = i3 + i;
            }
            int i4 = fVar.c;
            if (i4 != Integer.MIN_VALUE) {
                fVar.c = i4 + i;
            }
        }
    }

    public final int M0(int i) {
        int iF = this.q[0].f(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int iF2 = this.q[i2].f(i);
            if (iF2 > iF) {
                iF = iF2;
            }
        }
        return iF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void N(int i) {
        super.N(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            f fVar = this.q[i2];
            int i3 = fVar.b;
            if (i3 != Integer.MIN_VALUE) {
                fVar.b = i3 + i;
            }
            int i4 = fVar.c;
            if (i4 != Integer.MIN_VALUE) {
                fVar.c = i4 + i;
            }
        }
    }

    public final int N0(int i) {
        int iH = this.q[0].h(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int iH2 = this.q[i2].h(i);
            if (iH2 < iH) {
                iH = iH2;
            }
        }
        return iH;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void O() {
        this.B.a();
        for (int i = 0; i < this.p; i++) {
            this.q[i].b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0030  */
    /* JADX WARN: Code duplicated, block: B:22:0x0032 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0035  */
    /* JADX WARN: Code duplicated, block: B:26:0x003d  */
    /* JADX WARN: Code duplicated, block: B:29:0x004a A[LOOP:0: B:25:0x003b->B:29:0x004a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x004d A[EDGE_INSN: B:30:0x004d->B:31:0x004e BREAK  A[LOOP:0: B:25:0x003b->B:29:0x004a]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0050  */
    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b A[LOOP:1: B:34:0x005c->B:38:0x006b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0082  */
    /* JADX WARN: Code duplicated, block: B:44:0x008c  */
    /* JADX WARN: Code duplicated, block: B:47:0x009d  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:63:0x004d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x004e A[EDGE_INSN: B:64:0x004e->B:31:0x004e BREAK  A[LOOP:0: B:25:0x003b->B:29:0x004a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x006e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x006f A[EDGE_INSN: B:66:0x006f->B:40:0x006f BREAK  A[LOOP:1: B:34:0x005c->B:38:0x006b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public final void O0(int i, int i2, int i3) {
        int i4;
        int i5;
        d dVar;
        int[] iArr;
        int iL0;
        ArrayList arrayList;
        d.a aVar;
        int size;
        int i6;
        int i7;
        int size2;
        int iL1 = this.x ? L0() : K0();
        if (i3 == 8) {
            if (i < i2) {
                i4 = i2 + 1;
            } else {
                i4 = i + 1;
                i5 = i2;
            }
            dVar = this.B;
            iArr = dVar.a;
            if (iArr != null && i5 < iArr.length) {
                arrayList = dVar.b;
                if (arrayList != null) {
                    if (arrayList == null) {
                        size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 >= 0) {
                                aVar = null;
                                break;
                            }
                            aVar = (d.a) dVar.b.get(size2);
                            if (aVar.d == i5) {
                                break;
                            } else {
                                size2--;
                            }
                        }
                    } else {
                        aVar = null;
                        break;
                    }
                    if (aVar != null) {
                        dVar.b.remove(aVar);
                    }
                    size = dVar.b.size();
                    i6 = 0;
                    while (true) {
                        if (i6 < size) {
                            i6 = -1;
                            break;
                        } else if (((d.a) dVar.b.get(i6)).d >= i5) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                    if (i6 != -1) {
                        d.a aVar2 = (d.a) dVar.b.get(i6);
                        dVar.b.remove(i6);
                        i7 = aVar2.d;
                    } else {
                        i7 = -1;
                    }
                } else {
                    i7 = -1;
                }
                if (i7 == -1) {
                    int[] iArr2 = dVar.a;
                    Arrays.fill(iArr2, i5, iArr2.length, -1);
                    int length = dVar.a.length;
                } else {
                    Arrays.fill(dVar.a, i5, Math.min(i7 + 1, dVar.a.length), -1);
                }
            }
            if (i3 != 1) {
                dVar.c(i, i2);
            } else if (i3 != 2) {
                dVar.d(i, i2);
            } else if (i3 == 8) {
                dVar.d(i, 1);
                dVar.c(i2, 1);
            }
            if (i4 <= iL1) {
                return;
            }
            if (this.x) {
                iL0 = K0();
            } else {
                iL0 = L0();
            }
            if (i5 <= iL0) {
                m0();
            }
        }
        i4 = i + i2;
        i5 = i;
        dVar = this.B;
        iArr = dVar.a;
        if (iArr != null) {
            arrayList = dVar.b;
            if (arrayList != null) {
                if (arrayList == null) {
                    size2 = arrayList.size() - 1;
                    while (true) {
                        if (size2 >= 0) {
                            aVar = null;
                            break;
                        }
                        aVar = (d.a) dVar.b.get(size2);
                        if (aVar.d == i5) {
                            break;
                            break;
                        }
                        size2--;
                    }
                } else {
                    aVar = null;
                    break;
                }
                if (aVar != null) {
                    dVar.b.remove(aVar);
                }
                size = dVar.b.size();
                i6 = 0;
                while (true) {
                    if (i6 < size) {
                        i6 = -1;
                        break;
                    } else {
                        if (((d.a) dVar.b.get(i6)).d >= i5) {
                            break;
                            break;
                        }
                        i6++;
                    }
                }
                if (i6 != -1) {
                    d.a aVar3 = (d.a) dVar.b.get(i6);
                    dVar.b.remove(i6);
                    i7 = aVar3.d;
                } else {
                    i7 = -1;
                }
            } else {
                i7 = -1;
            }
            if (i7 == -1) {
                int[] iArr3 = dVar.a;
                Arrays.fill(iArr3, i5, iArr3.length, -1);
                int length2 = dVar.a.length;
            } else {
                Arrays.fill(dVar.a, i5, Math.min(i7 + 1, dVar.a.length), -1);
            }
        }
        if (i3 != 1) {
            dVar.c(i, i2);
        } else if (i3 != 2) {
            dVar.d(i, i2);
        } else if (i3 == 8) {
            dVar.d(i, 1);
            dVar.c(i2, 1);
        }
        if (i4 <= iL1) {
            return;
        }
        if (this.x) {
            iL0 = K0();
        } else {
            iL0 = L0();
        }
        if (i5 <= iL0) {
            m0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void P(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i = 0; i < this.p; i++) {
            this.q[i].b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x002c A[SYNTHETIC] */
    public final View P0() {
        boolean z;
        boolean z2;
        int iV = v();
        int i = iV - 1;
        BitSet bitSet = new BitSet(this.p);
        bitSet.set(0, this.p, true);
        byte b2 = (this.t == 1 && Q0()) ? (byte) 1 : (byte) -1;
        if (this.x) {
            iV = -1;
        } else {
            i = 0;
        }
        int i2 = i < iV ? 1 : -1;
        while (i != iV) {
            View viewU = u(i);
            c cVar = (c) viewU.getLayoutParams();
            if (bitSet.get(cVar.e.e)) {
                f fVar = cVar.e;
                if (this.x) {
                    int i3 = fVar.c;
                    if (i3 == Integer.MIN_VALUE) {
                        fVar.a();
                        i3 = fVar.c;
                    }
                    if (i3 < this.r.g()) {
                        ((c) ((View) C1742Pc.c(1, fVar.a)).getLayoutParams()).getClass();
                        return viewU;
                    }
                } else {
                    int i4 = fVar.b;
                    if (i4 == Integer.MIN_VALUE) {
                        View view = fVar.a.get(0);
                        c cVar2 = (c) view.getLayoutParams();
                        fVar.b = StaggeredGridLayoutManager.this.r.e(view);
                        cVar2.getClass();
                        i4 = fVar.b;
                    }
                    if (i4 > this.r.k()) {
                        ((c) fVar.a.get(0).getLayoutParams()).getClass();
                        return viewU;
                    }
                }
                bitSet.clear(cVar.e.e);
            }
            i += i2;
            if (i != iV) {
                View viewU2 = u(i);
                if (this.x) {
                    int iB = this.r.b(viewU);
                    int iB2 = this.r.b(viewU2);
                    if (iB >= iB2) {
                        if (iB == iB2) {
                            if (cVar.e.e - ((c) viewU2.getLayoutParams()).e.e < 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (b2 < 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z != z2) {
                            }
                        } else {
                            continue;
                        }
                    }
                    return viewU;
                }
                int iE = this.r.e(viewU);
                int iE2 = this.r.e(viewU2);
                if (iE <= iE2) {
                    if (iE == iE2) {
                        if (cVar.e.e - ((c) viewU2.getLayoutParams()).e.e < 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b2 < 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z != z2) {
                        }
                    } else {
                        continue;
                    }
                }
                return viewU;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0046  */
    /* JADX WARN: Code duplicated, block: B:37:0x0051  */
    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final View Q(View view, int i, RecyclerView.t tVar, RecyclerView.y yVar) {
        View viewC;
        int i2;
        if (v() != 0) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (viewC = recyclerView.C(view)) == null || this.a.c.contains(viewC)) {
                viewC = null;
            }
            if (viewC != null) {
                Y0();
                if (i != 1) {
                    if (i != 2) {
                        if (i != 17) {
                            if (i != 33) {
                                if (i == 66 ? this.t == 0 : !(i != 130 || this.t != 1)) {
                                    i2 = 1;
                                }
                            } else if (this.t == 1) {
                                i2 = -1;
                            }
                            i2 = Integer.MIN_VALUE;
                        } else if (this.t == 0) {
                            i2 = -1;
                        } else {
                            i2 = Integer.MIN_VALUE;
                        }
                    } else if (this.t != 1 && Q0()) {
                        i2 = -1;
                    } else {
                        i2 = 1;
                    }
                } else if (this.t != 1 && Q0()) {
                    i2 = 1;
                } else {
                    i2 = -1;
                }
                if (i2 != Integer.MIN_VALUE) {
                    c cVar = (c) viewC.getLayoutParams();
                    cVar.getClass();
                    f fVar = cVar.e;
                    int iL0 = i2 == 1 ? L0() : K0();
                    b1(iL0, yVar);
                    a1(i2);
                    t tVar2 = this.v;
                    tVar2.c = tVar2.d + iL0;
                    tVar2.b = (int) (this.r.l() * 0.33333334f);
                    tVar2.h = true;
                    tVar2.a = false;
                    F0(tVar, tVar2, yVar);
                    this.D = this.x;
                    View viewG = fVar.g(iL0, i2);
                    if (viewG != null && viewG != viewC) {
                        return viewG;
                    }
                    if (T0(i2)) {
                        for (int i3 = this.p - 1; i3 >= 0; i3--) {
                            View viewG2 = this.q[i3].g(iL0, i2);
                            if (viewG2 != null && viewG2 != viewC) {
                                return viewG2;
                            }
                        }
                    } else {
                        for (int i4 = 0; i4 < this.p; i4++) {
                            View viewG3 = this.q[i4].g(iL0, i2);
                            if (viewG3 != null && viewG3 != viewC) {
                                return viewG3;
                            }
                        }
                    }
                    boolean z = (this.w ^ true) == (i2 == -1);
                    View viewQ = q(z ? fVar.c() : fVar.d());
                    if (viewQ != null && viewQ != viewC) {
                        return viewQ;
                    }
                    if (T0(i2)) {
                        for (int i5 = this.p - 1; i5 >= 0; i5--) {
                            if (i5 != fVar.e) {
                                View viewQ2 = q(z ? this.q[i5].c() : this.q[i5].d());
                                if (viewQ2 != null && viewQ2 != viewC) {
                                    return viewQ2;
                                }
                            }
                        }
                    } else {
                        for (int i6 = 0; i6 < this.p; i6++) {
                            View viewQ3 = q(z ? this.q[i6].c() : this.q[i6].d());
                            if (viewQ3 != null && viewQ3 != viewC) {
                                return viewQ3;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final boolean Q0() {
        return A() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void R(AccessibilityEvent accessibilityEvent) {
        super.R(accessibilityEvent);
        if (v() > 0) {
            View viewH0 = H0(false);
            View viewG0 = G0(false);
            if (viewH0 == null || viewG0 == null) {
                return;
            }
            int iF = RecyclerView.m.F(viewH0);
            int iF2 = RecyclerView.m.F(viewG0);
            if (iF < iF2) {
                accessibilityEvent.setFromIndex(iF);
                accessibilityEvent.setToIndex(iF2);
            } else {
                accessibilityEvent.setFromIndex(iF2);
                accessibilityEvent.setToIndex(iF);
            }
        }
    }

    public final void R0(View view, int i, int i2) {
        RecyclerView recyclerView = this.b;
        Rect rect = this.G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.M(view));
        }
        c cVar = (c) view.getLayoutParams();
        int iD1 = d1(i, ((ViewGroup.MarginLayoutParams) cVar).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int iD2 = d1(i2, ((ViewGroup.MarginLayoutParams) cVar).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect.bottom);
        if (v0(view, iD1, iD2, cVar)) {
            view.measure(iD1, iD2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:109:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:123:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:131:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:133:0x0209  */
    /* JADX WARN: Code duplicated, block: B:255:0x0417  */
    /* JADX WARN: Code duplicated, block: B:266:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:0x01fc A[SYNTHETIC] */
    public final void S0(RecyclerView.t tVar, RecyclerView.y yVar, boolean z) {
        boolean z2;
        e eVar;
        int iV;
        int i;
        int iF;
        int iF2;
        int iV2;
        int i2;
        boolean z3;
        e eVar2 = this.F;
        b bVar = this.H;
        if (!(eVar2 == null && this.z == -1) && yVar.b() == 0) {
            g0(tVar);
            bVar.a();
            return;
        }
        boolean z4 = (bVar.e && this.z == -1 && this.F == null) ? false : true;
        d dVar = this.B;
        StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
        if (z4) {
            bVar.a();
            e eVar3 = this.F;
            if (eVar3 != null) {
                int i3 = eVar3.g;
                if (i3 > 0) {
                    if (i3 == this.p) {
                        for (int i4 = 0; i4 < this.p; i4++) {
                            this.q[i4].b();
                            e eVar4 = this.F;
                            int iG = eVar4.h[i4];
                            if (iG != Integer.MIN_VALUE) {
                                iG += eVar4.m ? this.r.g() : this.r.k();
                            }
                            f fVar = this.q[i4];
                            fVar.b = iG;
                            fVar.c = iG;
                        }
                    } else {
                        eVar3.h = null;
                        eVar3.g = 0;
                        eVar3.i = 0;
                        eVar3.j = null;
                        eVar3.k = null;
                        eVar3.d = eVar3.e;
                    }
                }
                e eVar5 = this.F;
                this.E = eVar5.n;
                boolean z5 = eVar5.l;
                c(null);
                e eVar6 = this.F;
                if (eVar6 != null && eVar6.l != z5) {
                    eVar6.l = z5;
                }
                this.w = z5;
                m0();
                Y0();
                e eVar7 = this.F;
                int i5 = eVar7.d;
                if (i5 != -1) {
                    this.z = i5;
                    bVar.c = eVar7.m;
                } else {
                    bVar.c = this.x;
                }
                if (eVar7.i > 1) {
                    dVar.a = eVar7.j;
                    dVar.b = eVar7.k;
                }
            } else {
                Y0();
                bVar.c = this.x;
            }
            if (yVar.g || (i2 = this.z) == -1) {
                if (this.D) {
                    int iB = yVar.b();
                    iV2 = v() - 1;
                    while (true) {
                        if (iV2 < 0) {
                            iF2 = 0;
                            break;
                        }
                        iF2 = RecyclerView.m.F(u(iV2));
                        if (iF2 < 0 && iF2 < iB) {
                            break;
                        } else {
                            iV2--;
                        }
                    }
                } else {
                    int iB2 = yVar.b();
                    iV = v();
                    i = 0;
                    while (true) {
                        if (i >= iV) {
                            iF2 = 0;
                            break;
                        }
                        iF = RecyclerView.m.F(u(i));
                        if (iF < 0 && iF < iB2) {
                            iF2 = iF;
                            break;
                        }
                        i++;
                    }
                }
                bVar.a = iF2;
                bVar.b = Integer.MIN_VALUE;
            } else if (i2 < 0 || i2 >= yVar.b()) {
                this.z = -1;
                this.A = Integer.MIN_VALUE;
                if (this.D) {
                    int iB3 = yVar.b();
                    iV2 = v() - 1;
                    while (true) {
                        if (iV2 < 0) {
                            iF2 = 0;
                            break;
                        } else {
                            iF2 = RecyclerView.m.F(u(iV2));
                            if (iF2 < 0) {
                            }
                            iV2--;
                        }
                    }
                } else {
                    int iB4 = yVar.b();
                    iV = v();
                    i = 0;
                    while (true) {
                        if (i >= iV) {
                            iF2 = 0;
                            break;
                        } else {
                            iF = RecyclerView.m.F(u(i));
                            if (iF < 0) {
                            }
                            i++;
                        }
                    }
                }
                bVar.a = iF2;
                bVar.b = Integer.MIN_VALUE;
            } else {
                e eVar8 = this.F;
                if (eVar8 == null || eVar8.d == -1 || eVar8.g < 1) {
                    View viewQ = q(this.z);
                    if (viewQ != null) {
                        bVar.a = this.x ? L0() : K0();
                        if (this.A != Integer.MIN_VALUE) {
                            if (bVar.c) {
                                bVar.b = (this.r.g() - this.A) - this.r.b(viewQ);
                            } else {
                                bVar.b = (this.r.k() + this.A) - this.r.e(viewQ);
                            }
                        } else if (this.r.c(viewQ) > this.r.l()) {
                            bVar.b = bVar.c ? this.r.g() : this.r.k();
                        } else {
                            int iE = this.r.e(viewQ) - this.r.k();
                            if (iE < 0) {
                                bVar.b = -iE;
                            } else {
                                int iG2 = this.r.g() - this.r.b(viewQ);
                                if (iG2 < 0) {
                                    bVar.b = iG2;
                                } else {
                                    bVar.b = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i6 = this.z;
                        bVar.a = i6;
                        int i7 = this.A;
                        if (i7 == Integer.MIN_VALUE) {
                            if (v() != 0) {
                                if ((i6 < K0()) != this.x) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                            } else if (this.x) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            bVar.c = z3;
                            bVar.b = z3 ? staggeredGridLayoutManager.r.g() : staggeredGridLayoutManager.r.k();
                        } else if (bVar.c) {
                            bVar.b = staggeredGridLayoutManager.r.g() - i7;
                        } else {
                            bVar.b = staggeredGridLayoutManager.r.k() + i7;
                        }
                        bVar.d = true;
                    }
                } else {
                    bVar.b = Integer.MIN_VALUE;
                    bVar.a = this.z;
                }
            }
            bVar.e = true;
        }
        if (this.F == null && this.z == -1 && (bVar.c != this.D || Q0() != this.E)) {
            dVar.a();
            bVar.d = true;
        }
        if (v() > 0 && ((eVar = this.F) == null || eVar.g < 1)) {
            if (bVar.d) {
                for (int i8 = 0; i8 < this.p; i8++) {
                    this.q[i8].b();
                    int i9 = bVar.b;
                    if (i9 != Integer.MIN_VALUE) {
                        f fVar2 = this.q[i8];
                        fVar2.b = i9;
                        fVar2.c = i9;
                    }
                }
            } else if (z4 || bVar.f == null) {
                for (int i10 = 0; i10 < this.p; i10++) {
                    f fVar3 = this.q[i10];
                    boolean z6 = this.x;
                    int i11 = bVar.b;
                    int iF3 = z6 ? fVar3.f(Integer.MIN_VALUE) : fVar3.h(Integer.MIN_VALUE);
                    fVar3.b();
                    if (iF3 != Integer.MIN_VALUE) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                        if ((!z6 || iF3 >= staggeredGridLayoutManager2.r.g()) && (z6 || iF3 <= staggeredGridLayoutManager2.r.k())) {
                            if (i11 != Integer.MIN_VALUE) {
                                iF3 += i11;
                            }
                            fVar3.c = iF3;
                            fVar3.b = iF3;
                        }
                    }
                }
                f[] fVarArr = this.q;
                int length = fVarArr.length;
                int[] iArr = bVar.f;
                if (iArr == null || iArr.length < length) {
                    bVar.f = new int[staggeredGridLayoutManager.q.length];
                }
                for (int i12 = 0; i12 < length; i12++) {
                    bVar.f[i12] = fVarArr[i12].h(Integer.MIN_VALUE);
                }
            } else {
                for (int i13 = 0; i13 < this.p; i13++) {
                    f fVar4 = this.q[i13];
                    fVar4.b();
                    int i14 = bVar.f[i13];
                    fVar4.b = i14;
                    fVar4.c = i14;
                }
            }
        }
        p(tVar);
        t tVar2 = this.v;
        tVar2.a = false;
        int iL = this.s.l();
        this.u = iL / this.p;
        View.MeasureSpec.makeMeasureSpec(iL, this.s.i());
        b1(bVar.a, yVar);
        if (bVar.c) {
            a1(-1);
            F0(tVar, tVar2, yVar);
            a1(1);
            tVar2.c = bVar.a + tVar2.d;
            F0(tVar, tVar2, yVar);
        } else {
            a1(1);
            F0(tVar, tVar2, yVar);
            a1(-1);
            tVar2.c = bVar.a + tVar2.d;
            F0(tVar, tVar2, yVar);
        }
        if (this.s.i() != 1073741824) {
            int iV3 = v();
            float fMax = 0.0f;
            for (int i15 = 0; i15 < iV3; i15++) {
                View viewU = u(i15);
                float fC = this.s.c(viewU);
                if (fC >= fMax) {
                    ((c) viewU.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fC);
                }
            }
            int i16 = this.u;
            int iRound = Math.round(fMax * this.p);
            if (this.s.i() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.s.l());
            }
            this.u = iRound / this.p;
            View.MeasureSpec.makeMeasureSpec(iRound, this.s.i());
            if (this.u != i16) {
                for (int i17 = 0; i17 < iV3; i17++) {
                    View viewU2 = u(i17);
                    c cVar = (c) viewU2.getLayoutParams();
                    cVar.getClass();
                    if (Q0() && this.t == 1) {
                        int i18 = -((this.p - 1) - cVar.e.e);
                        viewU2.offsetLeftAndRight((this.u * i18) - (i18 * i16));
                    } else {
                        int i19 = cVar.e.e;
                        int i20 = this.u * i19;
                        int i21 = i19 * i16;
                        if (this.t == 1) {
                            viewU2.offsetLeftAndRight(i20 - i21);
                        } else {
                            viewU2.offsetTopAndBottom(i20 - i21);
                        }
                    }
                }
            }
        }
        if (v() > 0) {
            if (this.x) {
                I0(tVar, yVar, true);
                J0(tVar, yVar, false);
            } else {
                J0(tVar, yVar, true);
                I0(tVar, yVar, false);
            }
        }
        if (z && !yVar.g && this.C != 0 && v() > 0 && P0() != null) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.K);
            }
            z2 = B0();
        }
        if (yVar.g) {
            bVar.a();
        }
        this.D = bVar.c;
        this.E = Q0();
        if (z2) {
            bVar.a();
            S0(tVar, yVar, false);
        }
    }

    public final boolean T0(int i) {
        if (this.t == 0) {
            return (i == -1) != this.x;
        }
        return ((i == -1) == this.x) == Q0();
    }

    public final void U0(int i, RecyclerView.y yVar) {
        int iK0;
        int i2;
        if (i > 0) {
            iK0 = L0();
            i2 = 1;
        } else {
            iK0 = K0();
            i2 = -1;
        }
        t tVar = this.v;
        tVar.a = true;
        b1(iK0, yVar);
        a1(i2);
        tVar.c = iK0 + tVar.d;
        tVar.b = Math.abs(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void V(int i, int i2) {
        O0(i, i2, 1);
    }

    public final void V0(RecyclerView.t tVar, t tVar2) {
        int iMin;
        if (!tVar2.a || tVar2.i) {
            return;
        }
        if (tVar2.b == 0) {
            if (tVar2.e == -1) {
                W0(tVar2.g, tVar);
                return;
            } else {
                X0(tVar2.f, tVar);
                return;
            }
        }
        int i = 1;
        if (tVar2.e == -1) {
            int i2 = tVar2.f;
            int iH = this.q[0].h(i2);
            while (i < this.p) {
                int iH2 = this.q[i].h(i2);
                if (iH2 > iH) {
                    iH = iH2;
                }
                i++;
            }
            int i3 = i2 - iH;
            W0(i3 < 0 ? tVar2.g : tVar2.g - Math.min(i3, tVar2.b), tVar);
            return;
        }
        int i4 = tVar2.g;
        int iF = this.q[0].f(i4);
        while (i < this.p) {
            int iF2 = this.q[i].f(i4);
            if (iF2 < iF) {
                iF = iF2;
            }
            i++;
        }
        int i5 = iF - tVar2.g;
        if (i5 < 0) {
            iMin = tVar2.f;
        } else {
            iMin = Math.min(i5, tVar2.b) + tVar2.f;
        }
        X0(iMin, tVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void W() {
        this.B.a();
        m0();
    }

    public final void W0(int i, RecyclerView.t tVar) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            if (this.r.e(viewU) < i || this.r.n(viewU) < i) {
                return;
            }
            c cVar = (c) viewU.getLayoutParams();
            cVar.getClass();
            if (cVar.e.a.size() == 1) {
                return;
            }
            f fVar = cVar.e;
            ArrayList<View> arrayList = fVar.a;
            int size = arrayList.size();
            View viewRemove = arrayList.remove(size - 1);
            c cVar2 = (c) viewRemove.getLayoutParams();
            cVar2.e = null;
            if (cVar2.a.h() || cVar2.a.k()) {
                fVar.d -= StaggeredGridLayoutManager.this.r.c(viewRemove);
            }
            if (size == 1) {
                fVar.b = Integer.MIN_VALUE;
            }
            fVar.c = Integer.MIN_VALUE;
            i0(viewU, tVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void X(int i, int i2) {
        O0(i, i2, 8);
    }

    public final void X0(int i, RecyclerView.t tVar) {
        while (v() > 0) {
            View viewU = u(0);
            if (this.r.b(viewU) > i || this.r.m(viewU) > i) {
                return;
            }
            c cVar = (c) viewU.getLayoutParams();
            cVar.getClass();
            if (cVar.e.a.size() == 1) {
                return;
            }
            f fVar = cVar.e;
            ArrayList<View> arrayList = fVar.a;
            View viewRemove = arrayList.remove(0);
            c cVar2 = (c) viewRemove.getLayoutParams();
            cVar2.e = null;
            if (arrayList.size() == 0) {
                fVar.c = Integer.MIN_VALUE;
            }
            if (cVar2.a.h() || cVar2.a.k()) {
                fVar.d -= StaggeredGridLayoutManager.this.r.c(viewRemove);
            }
            fVar.b = Integer.MIN_VALUE;
            i0(viewU, tVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void Y(int i, int i2) {
        O0(i, i2, 2);
    }

    public final void Y0() {
        if (this.t == 1 || !Q0()) {
            this.x = this.w;
        } else {
            this.x = !this.w;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void Z(int i, int i2) {
        O0(i, i2, 4);
    }

    public final int Z0(int i, RecyclerView.t tVar, RecyclerView.y yVar) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        U0(i, yVar);
        t tVar2 = this.v;
        int iF0 = F0(tVar, tVar2, yVar);
        if (tVar2.b >= iF0) {
            i = i < 0 ? -iF0 : iF0;
        }
        this.r.o(-i);
        this.D = this.x;
        tVar2.b = 0;
        V0(tVar, tVar2);
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000c  */
    @Override // androidx.recyclerview.widget.RecyclerView.x.b
    public final PointF a(int i) {
        int i2 = -1;
        if (v() != 0) {
            if ((i < K0()) == this.x) {
                i2 = 1;
            }
        } else if (this.x) {
            i2 = 1;
        }
        PointF pointF = new PointF();
        if (i2 == 0) {
            return null;
        }
        if (this.t == 0) {
            pointF.x = i2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i2;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void a0(RecyclerView.t tVar, RecyclerView.y yVar) {
        S0(tVar, yVar, true);
    }

    public final void a1(int i) {
        t tVar = this.v;
        tVar.e = i;
        tVar.d = this.x != (i == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void b0(RecyclerView.y yVar) {
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    public final void b1(int i, RecyclerView.y yVar) {
        int iL;
        int iL2;
        int i2;
        t tVar = this.v;
        boolean z = false;
        tVar.b = 0;
        tVar.c = i;
        u uVar = this.e;
        if (!(uVar != null && uVar.e) || (i2 = yVar.a) == -1) {
            iL = 0;
            iL2 = 0;
        } else {
            if (this.x == (i2 < i)) {
                iL = this.r.l();
                iL2 = 0;
            } else {
                iL2 = this.r.l();
                iL = 0;
            }
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || !recyclerView.l) {
            tVar.g = this.r.f() + iL;
            tVar.f = -iL2;
        } else {
            tVar.f = this.r.k() - iL2;
            tVar.g = this.r.g() + iL;
        }
        tVar.h = false;
        tVar.a = true;
        if (this.r.i() == 0 && this.r.f() == 0) {
            z = true;
        }
        tVar.i = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void c0(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            this.F = eVar;
            if (this.z != -1) {
                eVar.h = null;
                eVar.g = 0;
                eVar.d = -1;
                eVar.e = -1;
                eVar.h = null;
                eVar.g = 0;
                eVar.i = 0;
                eVar.j = null;
                eVar.k = null;
            }
            m0();
        }
    }

    public final void c1(f fVar, int i, int i2) {
        int i3 = fVar.d;
        int i4 = fVar.e;
        if (i != -1) {
            int i5 = fVar.c;
            if (i5 == Integer.MIN_VALUE) {
                fVar.a();
                i5 = fVar.c;
            }
            if (i5 - i3 >= i2) {
                this.y.set(i4, false);
                return;
            }
            return;
        }
        int i6 = fVar.b;
        if (i6 == Integer.MIN_VALUE) {
            View view = fVar.a.get(0);
            c cVar = (c) view.getLayoutParams();
            fVar.b = StaggeredGridLayoutManager.this.r.e(view);
            cVar.getClass();
            i6 = fVar.b;
        }
        if (i6 + i3 <= i2) {
            this.y.set(i4, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean d() {
        return this.t == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final Parcelable d0() {
        int iH;
        int iK;
        int[] iArr;
        e eVar = this.F;
        if (eVar != null) {
            e eVar2 = new e();
            eVar2.g = eVar.g;
            eVar2.d = eVar.d;
            eVar2.e = eVar.e;
            eVar2.h = eVar.h;
            eVar2.i = eVar.i;
            eVar2.j = eVar.j;
            eVar2.l = eVar.l;
            eVar2.m = eVar.m;
            eVar2.n = eVar.n;
            eVar2.k = eVar.k;
            return eVar2;
        }
        e eVar3 = new e();
        eVar3.l = this.w;
        eVar3.m = this.D;
        eVar3.n = this.E;
        d dVar = this.B;
        if (dVar == null || (iArr = dVar.a) == null) {
            eVar3.i = 0;
        } else {
            eVar3.j = iArr;
            eVar3.i = iArr.length;
            eVar3.k = dVar.b;
        }
        if (v() <= 0) {
            eVar3.d = -1;
            eVar3.e = -1;
            eVar3.g = 0;
            return eVar3;
        }
        eVar3.d = this.D ? L0() : K0();
        View viewG0 = this.x ? G0(true) : H0(true);
        eVar3.e = viewG0 != null ? RecyclerView.m.F(viewG0) : -1;
        int i = this.p;
        eVar3.g = i;
        eVar3.h = new int[i];
        for (int i2 = 0; i2 < this.p; i2++) {
            if (this.D) {
                iH = this.q[i2].f(Integer.MIN_VALUE);
                if (iH != Integer.MIN_VALUE) {
                    iK = this.r.g();
                    iH -= iK;
                }
            } else {
                iH = this.q[i2].h(Integer.MIN_VALUE);
                if (iH != Integer.MIN_VALUE) {
                    iK = this.r.k();
                    iH -= iK;
                }
            }
            eVar3.h[i2] = iH;
        }
        return eVar3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean e() {
        return this.t == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void e0(int i) {
        if (i == 0) {
            B0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean f(RecyclerView.n nVar) {
        return nVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void h(int i, int i2, RecyclerView.y yVar, s.b bVar) {
        t tVar;
        int iF;
        int iH;
        if (this.t != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        U0(i, yVar);
        int[] iArr = this.J;
        if (iArr == null || iArr.length < this.p) {
            this.J = new int[this.p];
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.p;
            tVar = this.v;
            if (i3 >= i5) {
                break;
            }
            if (tVar.d == -1) {
                iF = tVar.f;
                iH = this.q[i3].h(iF);
            } else {
                iF = this.q[i3].f(tVar.g);
                iH = tVar.g;
            }
            int i6 = iF - iH;
            if (i6 >= 0) {
                this.J[i4] = i6;
                i4++;
            }
            i3++;
        }
        Arrays.sort(this.J, 0, i4);
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = tVar.c;
            if (i8 < 0 || i8 >= yVar.b()) {
                return;
            }
            bVar.a(tVar.c, this.J[i7]);
            tVar.c += tVar.d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int j(RecyclerView.y yVar) {
        return C0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int k(RecyclerView.y yVar) {
        return D0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int l(RecyclerView.y yVar) {
        return E0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int m(RecyclerView.y yVar) {
        return C0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int n(RecyclerView.y yVar) {
        return D0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int n0(int i, RecyclerView.t tVar, RecyclerView.y yVar) {
        return Z0(i, tVar, yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int o(RecyclerView.y yVar) {
        return E0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void o0(int i) {
        e eVar = this.F;
        if (eVar != null && eVar.d != i) {
            eVar.h = null;
            eVar.g = 0;
            eVar.d = -1;
            eVar.e = -1;
        }
        this.z = i;
        this.A = Integer.MIN_VALUE;
        m0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int p0(int i, RecyclerView.t tVar, RecyclerView.y yVar) {
        return Z0(i, tVar, yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n r() {
        return this.t == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n s(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void s0(Rect rect, int i, int i2) {
        int iG;
        int iG2;
        int i3 = this.p;
        int iD = D() + C();
        int iB = B() + E();
        if (this.t == 1) {
            int iHeight = rect.height() + iB;
            RecyclerView recyclerView = this.b;
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            iG2 = RecyclerView.m.g(i2, iHeight, recyclerView.getMinimumHeight());
            iG = RecyclerView.m.g(i, (this.u * i3) + iD, this.b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iD;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap<View, C5345me2> weakHashMap2 = Cd2.a;
            iG = RecyclerView.m.g(i, iWidth, recyclerView2.getMinimumWidth());
            iG2 = RecyclerView.m.g(i2, (this.u * i3) + iB, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(iG, iG2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void y0(RecyclerView recyclerView, int i) {
        u uVar = new u(recyclerView.getContext());
        uVar.a = i;
        z0(uVar);
    }
}
