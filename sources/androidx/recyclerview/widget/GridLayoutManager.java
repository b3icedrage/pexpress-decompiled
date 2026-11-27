package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.annotation.NonNull;
import defpackage.C5345me2;
import defpackage.C5426n2;
import defpackage.Cd2;
import defpackage.EK;
import defpackage.SK;
import io.sentry.android.core.b0;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public final a K;
    public final Rect L;

    public static final class a extends c {
    }

    public static class b extends RecyclerView.n {
        public int e;
        public int f;

        public b(int i, int i2) {
            super(i, i2);
            this.e = -1;
            this.f = 0;
        }
    }

    public static abstract class c {
        public final SparseIntArray a = new SparseIntArray();
        public final SparseIntArray b = new SparseIntArray();

        public static int a(int i, int i2) {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i3++;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = 1;
                }
            }
            return i3 + 1 > i2 ? i4 + 1 : i4;
        }

        public final void b() {
            this.a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new a();
        this.L = new Rect();
        n1(RecyclerView.m.G(context, attributeSet, i, i2).b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final boolean A0() {
        return this.z == null && !this.E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void C0(RecyclerView.y yVar, LinearLayoutManager.c cVar, s.b bVar) {
        int i;
        int i2 = this.F;
        for (int i3 = 0; i3 < this.F && (i = cVar.d) >= 0 && i < yVar.b() && i2 > 0; i3++) {
            bVar.a(cVar.d, Math.max(0, cVar.g));
            this.K.getClass();
            i2--;
            cVar.d += cVar.e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int H(RecyclerView.t tVar, RecyclerView.y yVar) {
        if (this.p == 0) {
            return this.F;
        }
        if (yVar.b() < 1) {
            return 0;
        }
        return j1(yVar.b() - 1, tVar, yVar) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View P0(RecyclerView.t tVar, RecyclerView.y yVar, boolean z, boolean z2) {
        int i;
        int iV;
        int iV2 = v();
        int i2 = 1;
        if (z2) {
            iV = v() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iV2;
            iV = 0;
        }
        int iB = yVar.b();
        H0();
        int iK = this.r.k();
        int iG = this.r.g();
        View view = null;
        View view2 = null;
        while (iV != i) {
            View viewU = u(iV);
            int iF = RecyclerView.m.F(viewU);
            if (iF >= 0 && iF < iB && k1(iF, tVar, yVar) == 0) {
                if (((RecyclerView.n) viewU.getLayoutParams()).a.h()) {
                    if (view2 == null) {
                        view2 = viewU;
                    }
                } else {
                    if (this.r.e(viewU) < iG && this.r.b(viewU) >= iK) {
                        return viewU;
                    }
                    if (view == null) {
                        view = viewU;
                    }
                }
            }
            iV += i2;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e0, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View Q(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.t r25, androidx.recyclerview.widget.RecyclerView.y r26) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.Q(android.view.View, int, androidx.recyclerview.widget.RecyclerView$t, androidx.recyclerview.widget.RecyclerView$y):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void S(@NonNull RecyclerView.t tVar, @NonNull RecyclerView.y yVar, @NonNull C5426n2 c5426n2) {
        super.S(tVar, yVar, c5426n2);
        c5426n2.i(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void U(RecyclerView.t tVar, RecyclerView.y yVar, View view, C5426n2 c5426n2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            T(view, c5426n2);
            return;
        }
        b bVar = (b) layoutParams;
        int iJ1 = j1(bVar.a.b(), tVar, yVar);
        if (this.p == 0) {
            c5426n2.j(C5426n2.f.a(false, bVar.e, bVar.f, iJ1, 1));
        } else {
            c5426n2.j(C5426n2.f.a(false, iJ1, 1, bVar.e, bVar.f));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void V(int i, int i2) {
        a aVar = this.K;
        aVar.b();
        aVar.b.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v37 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void V0(RecyclerView.t tVar, RecyclerView.y yVar, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i;
        int i2;
        int i3;
        int iD;
        int iC;
        int iE;
        int iD2;
        int iW;
        int iW2;
        ?? r8;
        int i4;
        View viewB;
        int iJ = this.r.j();
        boolean z = iJ != 1073741824;
        int i5 = v() > 0 ? this.G[this.F] : 0;
        if (z) {
            o1();
        }
        boolean z2 = cVar.e == 1;
        int iK1 = this.F;
        if (!z2) {
            iK1 = k1(cVar.d, tVar, yVar) + l1(cVar.d, tVar, yVar);
        }
        int i6 = 0;
        while (i6 < this.F && (i4 = cVar.d) >= 0 && i4 < yVar.b() && iK1 > 0) {
            int i7 = cVar.d;
            int iL1 = l1(i7, tVar, yVar);
            if (iL1 > this.F) {
                StringBuilder sb = new StringBuilder("Item at position ");
                sb.append(i7);
                sb.append(" requires ");
                sb.append(iL1);
                sb.append(" spans but GridLayoutManager has only ");
                throw new IllegalArgumentException(SK.b(sb, this.F, " spans."));
            }
            iK1 -= iL1;
            if (iK1 < 0 || (viewB = cVar.b(tVar)) == null) {
                break;
            }
            this.H[i6] = viewB;
            i6++;
        }
        if (i6 == 0) {
            bVar.b = true;
            return;
        }
        if (z2) {
            i3 = 1;
            i2 = i6;
            i = 0;
        } else {
            i = i6 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i8 = 0;
        while (i != i2) {
            View view = this.H[i];
            b bVar2 = (b) view.getLayoutParams();
            int iL2 = l1(RecyclerView.m.F(view), tVar, yVar);
            bVar2.f = iL2;
            bVar2.e = i8;
            i8 += iL2;
            i += i3;
        }
        float f = 0.0f;
        int i9 = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            View view2 = this.H[i10];
            if (cVar.k != null) {
                r8 = 0;
                r8 = 0;
                if (z2) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            } else if (z2) {
                r8 = 0;
                b(view2, -1, false);
            } else {
                r8 = 0;
                b(view2, 0, false);
            }
            RecyclerView recyclerView = this.b;
            Rect rect = this.L;
            if (recyclerView == null) {
                rect.set(r8, r8, r8, r8);
            } else {
                rect.set(recyclerView.M(view2));
            }
            m1(view2, iJ, r8);
            int iC2 = this.r.c(view2);
            if (iC2 > i9) {
                i9 = iC2;
            }
            float fD = (this.r.d(view2) * 1.0f) / ((b) view2.getLayoutParams()).f;
            if (fD > f) {
                f = fD;
            }
        }
        if (z) {
            g1(Math.max(Math.round(f * this.F), i5));
            i9 = 0;
            for (int i11 = 0; i11 < i6; i11++) {
                View view3 = this.H[i11];
                m1(view3, 1073741824, true);
                int iC3 = this.r.c(view3);
                if (iC3 > i9) {
                    i9 = iC3;
                }
            }
        }
        for (int i12 = 0; i12 < i6; i12++) {
            View view4 = this.H[i12];
            if (this.r.c(view4) != i9) {
                b bVar3 = (b) view4.getLayoutParams();
                Rect rect2 = bVar3.b;
                int i13 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) bVar3).topMargin + ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin;
                int i14 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) bVar3).leftMargin + ((ViewGroup.MarginLayoutParams) bVar3).rightMargin;
                int iI1 = i1(bVar3.e, bVar3.f);
                if (this.p == 1) {
                    iW2 = RecyclerView.m.w(false, iI1, 1073741824, i14, ((ViewGroup.MarginLayoutParams) bVar3).width);
                    iW = View.MeasureSpec.makeMeasureSpec(i9 - i13, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - i14, 1073741824);
                    iW = RecyclerView.m.w(false, iI1, 1073741824, i13, ((ViewGroup.MarginLayoutParams) bVar3).height);
                    iW2 = iMakeMeasureSpec;
                }
                if (x0(view4, iW2, iW, (RecyclerView.n) view4.getLayoutParams())) {
                    view4.measure(iW2, iW);
                }
            }
        }
        bVar.a = i9;
        if (this.p != 1) {
            if (cVar.f == -1) {
                int i15 = cVar.b;
                iC = i15 - i9;
                iD = i15;
            } else {
                int i16 = cVar.b;
                iD = i16 + i9;
                iC = i16;
            }
            iE = 0;
            iD2 = 0;
        } else if (cVar.f == -1) {
            iD2 = cVar.b;
            iE = iD2 - i9;
            iC = 0;
            iD = 0;
        } else {
            int i17 = cVar.b;
            iE = i17;
            iD = 0;
            iD2 = i17 + i9;
            iC = 0;
        }
        for (int i18 = 0; i18 < i6; i18++) {
            View view5 = this.H[i18];
            b bVar4 = (b) view5.getLayoutParams();
            if (this.p != 1) {
                iE = E() + this.G[bVar4.e];
                iD2 = this.r.d(view5) + iE;
            } else if (U0()) {
                int iC4 = C() + this.G[this.F - bVar4.e];
                iD = iC4;
                iC = iC4 - this.r.d(view5);
            } else {
                iC = C() + this.G[bVar4.e];
                iD = this.r.d(view5) + iC;
            }
            RecyclerView.m.L(view5, iC, iE, iD, iD2);
            if (bVar4.a.h() || bVar4.a.k()) {
                bVar.c = true;
            }
            bVar.d = view5.hasFocusable() | bVar.d;
        }
        Arrays.fill(this.H, (Object) null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void W() {
        a aVar = this.K;
        aVar.b();
        aVar.b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void W0(RecyclerView.t tVar, RecyclerView.y yVar, LinearLayoutManager.a aVar, int i) {
        o1();
        if (yVar.b() > 0 && !yVar.g) {
            boolean z = i == 1;
            int iK1 = k1(aVar.b, tVar, yVar);
            if (z) {
                while (iK1 > 0) {
                    int i2 = aVar.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    aVar.b = i3;
                    iK1 = k1(i3, tVar, yVar);
                }
            } else {
                int iB = yVar.b() - 1;
                int i4 = aVar.b;
                while (i4 < iB) {
                    int i5 = i4 + 1;
                    int iK2 = k1(i5, tVar, yVar);
                    if (iK2 <= iK1) {
                        break;
                    }
                    i4 = i5;
                    iK1 = iK2;
                }
                aVar.b = i4;
            }
        }
        h1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void X(int i, int i2) {
        a aVar = this.K;
        aVar.b();
        aVar.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void Y(int i, int i2) {
        a aVar = this.K;
        aVar.b();
        aVar.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void Z(int i, int i2) {
        a aVar = this.K;
        aVar.b();
        aVar.b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final void a0(RecyclerView.t tVar, RecyclerView.y yVar) {
        boolean z = yVar.g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z) {
            int iV = v();
            for (int i = 0; i < iV; i++) {
                b bVar = (b) u(i).getLayoutParams();
                int iB = bVar.a.b();
                sparseIntArray2.put(iB, bVar.f);
                sparseIntArray.put(iB, bVar.e);
            }
        }
        super.a0(tVar, yVar);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final void b0(RecyclerView.y yVar) {
        super.b0(yVar);
        this.E = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void c1(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.c1(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean f(RecyclerView.n nVar) {
        return nVar instanceof b;
    }

    public final void g1(int i) {
        int i2;
        int[] iArr = this.G;
        int i3 = this.F;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.G = iArr;
    }

    public final void h1() {
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    public final int i1(int i, int i2) {
        if (this.p != 1 || !U0()) {
            int[] iArr = this.G;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.G;
        int i3 = this.F;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public final int j1(int i, RecyclerView.t tVar, RecyclerView.y yVar) {
        boolean z = yVar.g;
        a aVar = this.K;
        if (!z) {
            int i2 = this.F;
            aVar.getClass();
            return c.a(i, i2);
        }
        int iB = tVar.b(i);
        if (iB != -1) {
            int i3 = this.F;
            aVar.getClass();
            return c.a(iB, i3);
        }
        b0.e("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int k(RecyclerView.y yVar) {
        return E0(yVar);
    }

    public final int k1(int i, RecyclerView.t tVar, RecyclerView.y yVar) {
        boolean z = yVar.g;
        a aVar = this.K;
        if (!z) {
            int i2 = this.F;
            aVar.getClass();
            return i % i2;
        }
        int i3 = this.J.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int iB = tVar.b(i);
        if (iB != -1) {
            int i4 = this.F;
            aVar.getClass();
            return iB % i4;
        }
        b0.e("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int l(RecyclerView.y yVar) {
        return F0(yVar);
    }

    public final int l1(int i, RecyclerView.t tVar, RecyclerView.y yVar) {
        boolean z = yVar.g;
        a aVar = this.K;
        if (!z) {
            aVar.getClass();
            return 1;
        }
        int i2 = this.I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (tVar.b(i) != -1) {
            aVar.getClass();
            return 1;
        }
        b0.e("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    public final void m1(View view, int i, boolean z) {
        int iW;
        int iW2;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.b;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int iI1 = i1(bVar.e, bVar.f);
        if (this.p == 1) {
            iW2 = RecyclerView.m.w(false, iI1, i, i3, ((ViewGroup.MarginLayoutParams) bVar).width);
            iW = RecyclerView.m.w(true, this.r.l(), this.m, i2, ((ViewGroup.MarginLayoutParams) bVar).height);
        } else {
            int iW3 = RecyclerView.m.w(false, iI1, i, i2, ((ViewGroup.MarginLayoutParams) bVar).height);
            int iW4 = RecyclerView.m.w(true, this.r.l(), this.l, i3, ((ViewGroup.MarginLayoutParams) bVar).width);
            iW = iW3;
            iW2 = iW4;
        }
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        if (z ? x0(view, iW2, iW, nVar) : v0(view, iW2, iW, nVar)) {
            view.measure(iW2, iW);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int n(RecyclerView.y yVar) {
        return E0(yVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int n0(int i, RecyclerView.t tVar, RecyclerView.y yVar) {
        o1();
        h1();
        return super.n0(i, tVar, yVar);
    }

    public final void n1(int i) {
        if (i == this.F) {
            return;
        }
        this.E = true;
        if (i < 1) {
            throw new IllegalArgumentException(EK.e(i, "Span count should be at least 1. Provided "));
        }
        this.F = i;
        this.K.b();
        m0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int o(RecyclerView.y yVar) {
        return F0(yVar);
    }

    public final void o1() {
        int iB;
        int iE;
        if (this.p == 1) {
            iB = this.n - D();
            iE = C();
        } else {
            iB = this.o - B();
            iE = E();
        }
        g1(iB - iE);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int p0(int i, RecyclerView.t tVar, RecyclerView.y yVar) {
        o1();
        h1();
        return super.p0(i, tVar, yVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n r() {
        return this.p == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n s(Context context, AttributeSet attributeSet) {
        b bVar = new b(context, attributeSet);
        bVar.e = -1;
        bVar.f = 0;
        return bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void s0(Rect rect, int i, int i2) {
        int iG;
        int iG2;
        if (this.G == null) {
            super.s0(rect, i, i2);
        }
        int iD = D() + C();
        int iB = B() + E();
        if (this.p == 1) {
            int iHeight = rect.height() + iB;
            RecyclerView recyclerView = this.b;
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            iG2 = RecyclerView.m.g(i2, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.G;
            iG = RecyclerView.m.g(i, iArr[iArr.length - 1] + iD, this.b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iD;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap<View, C5345me2> weakHashMap2 = Cd2.a;
            iG = RecyclerView.m.g(i, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.G;
            iG2 = RecyclerView.m.g(i2, iArr2[iArr2.length - 1] + iB, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(iG, iG2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            b bVar = new b((ViewGroup.MarginLayoutParams) layoutParams);
            bVar.e = -1;
            bVar.f = 0;
            return bVar;
        }
        b bVar2 = new b(layoutParams);
        bVar2.e = -1;
        bVar2.f = 0;
        return bVar2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int x(RecyclerView.t tVar, RecyclerView.y yVar) {
        if (this.p == 1) {
            return this.F;
        }
        if (yVar.b() < 1) {
            return 0;
        }
        return j1(yVar.b() - 1, tVar, yVar) + 1;
    }

    public GridLayoutManager(int i) {
        super(1, false);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new a();
        this.L = new Rect();
        n1(i);
    }
}
