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
import defpackage.C4564j;
import defpackage.EK;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.m implements RecyclerView.x.b {
    public final a A;
    public final b B;
    public final int C;
    public final int[] D;
    public int p;
    public c q;
    public z r;
    public boolean s;
    public final boolean t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public int x;
    public int y;
    public d z;

    public static class a {
        public z a;
        public int b;
        public int c;
        public boolean d;
        public boolean e;

        public a() {
            d();
        }

        public final void a() {
            this.c = this.d ? this.a.g() : this.a.k();
        }

        public final void b(View view, int i) {
            if (this.d) {
                int iB = this.a.b(view);
                z zVar = this.a;
                this.c = (Integer.MIN_VALUE == zVar.b ? 0 : zVar.l() - zVar.b) + iB;
            } else {
                this.c = this.a.e(view);
            }
            this.b = i;
        }

        public final void c(View view, int i) {
            z zVar = this.a;
            int iL = Integer.MIN_VALUE == zVar.b ? 0 : zVar.l() - zVar.b;
            if (iL >= 0) {
                b(view, i);
                return;
            }
            this.b = i;
            if (!this.d) {
                int iE = this.a.e(view);
                int iK = iE - this.a.k();
                this.c = iE;
                if (iK > 0) {
                    int iG = (this.a.g() - Math.min(0, (this.a.g() - iL) - this.a.b(view))) - (this.a.c(view) + iE);
                    if (iG < 0) {
                        this.c -= Math.min(iK, -iG);
                        return;
                    }
                    return;
                }
                return;
            }
            int iG2 = (this.a.g() - iL) - this.a.b(view);
            this.c = this.a.g() - iG2;
            if (iG2 > 0) {
                int iC = this.c - this.a.c(view);
                int iK2 = this.a.k();
                int iMin = iC - (Math.min(this.a.e(view) - iK2, 0) + iK2);
                if (iMin < 0) {
                    this.c = Math.min(iG2, -iMin) + this.c;
                }
            }
        }

        public final void d() {
            this.b = -1;
            this.c = Integer.MIN_VALUE;
            this.d = false;
            this.e = false;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
            sb.append(this.b);
            sb.append(", mCoordinate=");
            sb.append(this.c);
            sb.append(", mLayoutFromEnd=");
            sb.append(this.d);
            sb.append(", mValid=");
            return C4564j.f(sb, this.e, '}');
        }
    }

    public static class b {
        public int a;
        public boolean b;
        public boolean c;
        public boolean d;
    }

    public static class c {
        public boolean a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public List<RecyclerView.C> k;
        public boolean l;

        public final void a(View view) {
            int iB;
            int size = this.k.size();
            View view2 = null;
            int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.k.get(i2).a;
                RecyclerView.n nVar = (RecyclerView.n) view3.getLayoutParams();
                if (view3 != view && !nVar.a.h() && (iB = (nVar.a.b() - this.d) * this.e) >= 0 && iB < i) {
                    view2 = view3;
                    if (iB == 0) {
                        break;
                    } else {
                        i = iB;
                    }
                }
            }
            if (view2 == null) {
                this.d = -1;
            } else {
                this.d = ((RecyclerView.n) view2.getLayoutParams()).a.b();
            }
        }

        public final View b(RecyclerView.t tVar) {
            List<RecyclerView.C> list = this.k;
            if (list == null) {
                View view = tVar.k(this.d, Long.MAX_VALUE).a;
                this.d += this.e;
                return view;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view2 = this.k.get(i).a;
                RecyclerView.n nVar = (RecyclerView.n) view2.getLayoutParams();
                if (!nVar.a.h() && this.d == nVar.a.b()) {
                    a(view2);
                    return view2;
                }
            }
            return null;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();
        public int d;
        public int e;
        public boolean g;

        public class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                d dVar = new d();
                dVar.d = parcel.readInt();
                dVar.e = parcel.readInt();
                dVar.g = parcel.readInt() == 1;
                return dVar;
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i) {
                return new d[i];
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
            parcel.writeInt(this.g ? 1 : 0);
        }
    }

    public LinearLayoutManager() {
        this(1, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean A0() {
        return this.z == null && this.s == this.v;
    }

    public void B0(@NonNull RecyclerView.y yVar, @NonNull int[] iArr) {
        int i;
        int iL = yVar.a != -1 ? this.r.l() : 0;
        if (this.q.f == -1) {
            i = 0;
        } else {
            i = iL;
            iL = 0;
        }
        iArr[0] = iL;
        iArr[1] = i;
    }

    public void C0(RecyclerView.y yVar, c cVar, s.b bVar) {
        int i = cVar.d;
        if (i < 0 || i >= yVar.b()) {
            return;
        }
        bVar.a(i, Math.max(0, cVar.g));
    }

    public final int D0(RecyclerView.y yVar) {
        if (v() == 0) {
            return 0;
        }
        H0();
        z zVar = this.r;
        boolean z = !this.w;
        return F.a(yVar, zVar, K0(z), J0(z), this, this.w);
    }

    public final int E0(RecyclerView.y yVar) {
        if (v() == 0) {
            return 0;
        }
        H0();
        z zVar = this.r;
        boolean z = !this.w;
        return F.b(yVar, zVar, K0(z), J0(z), this, this.w, this.u);
    }

    public final int F0(RecyclerView.y yVar) {
        if (v() == 0) {
            return 0;
        }
        H0();
        z zVar = this.r;
        boolean z = !this.w;
        return F.c(yVar, zVar, K0(z), J0(z), this, this.w);
    }

    public final int G0(int i) {
        if (i == 1) {
            return (this.p != 1 && U0()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.p != 1 && U0()) ? -1 : 1;
        }
        if (i == 17) {
            return this.p == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 33) {
            return this.p == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i != 66) {
            return (i == 130 && this.p == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.p == 0 ? 1 : Integer.MIN_VALUE;
    }

    public final void H0() {
        if (this.q == null) {
            c cVar = new c();
            cVar.a = true;
            cVar.h = 0;
            cVar.i = 0;
            cVar.k = null;
            this.q = cVar;
        }
    }

    public final int I0(RecyclerView.t tVar, c cVar, RecyclerView.y yVar, boolean z) {
        int i;
        int i2 = cVar.c;
        int i3 = cVar.g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                cVar.g = i3 + i2;
            }
            X0(tVar, cVar);
        }
        int i4 = cVar.c + cVar.h;
        while (true) {
            if ((!cVar.l && i4 <= 0) || (i = cVar.d) < 0 || i >= yVar.b()) {
                break;
            }
            b bVar = this.B;
            bVar.a = 0;
            bVar.b = false;
            bVar.c = false;
            bVar.d = false;
            V0(tVar, yVar, cVar, bVar);
            if (!bVar.b) {
                int i5 = cVar.b;
                int i6 = bVar.a;
                cVar.b = (cVar.f * i6) + i5;
                if (!bVar.c || cVar.k != null || !yVar.g) {
                    cVar.c -= i6;
                    i4 -= i6;
                }
                int i7 = cVar.g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    cVar.g = i8;
                    int i9 = cVar.c;
                    if (i9 < 0) {
                        cVar.g = i8 + i9;
                    }
                    X0(tVar, cVar);
                }
                if (z && bVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - cVar.c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean J() {
        return true;
    }

    public final View J0(boolean z) {
        return this.u ? O0(0, z, v()) : O0(v() - 1, z, -1);
    }

    public final View K0(boolean z) {
        return this.u ? O0(v() - 1, z, -1) : O0(0, z, v());
    }

    public final int L0() {
        View viewO0 = O0(0, false, v());
        if (viewO0 == null) {
            return -1;
        }
        return RecyclerView.m.F(viewO0);
    }

    public final int M0() {
        View viewO0 = O0(v() - 1, false, -1);
        if (viewO0 == null) {
            return -1;
        }
        return RecyclerView.m.F(viewO0);
    }

    public final View N0(int i, int i2) {
        int i3;
        int i4;
        H0();
        if (i2 <= i && i2 >= i) {
            return u(i);
        }
        if (this.r.e(u(i)) < this.r.k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.p == 0 ? this.c.a(i, i2, i3, i4) : this.d.a(i, i2, i3, i4);
    }

    public final View O0(int i, boolean z, int i2) {
        H0();
        int i3 = z ? 24579 : 320;
        return this.p == 0 ? this.c.a(i, i2, i3, 320) : this.d.a(i, i2, i3, 320);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    public View P0(RecyclerView.t tVar, RecyclerView.y yVar, boolean z, boolean z2) {
        int i;
        int iV;
        int i2;
        H0();
        int iV2 = v();
        if (z2) {
            iV = v() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iV2;
            iV = 0;
            i2 = 1;
        }
        int iB = yVar.b();
        int iK = this.r.k();
        int iG = this.r.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iV != i) {
            View viewU = u(iV);
            int iF = RecyclerView.m.F(viewU);
            int iE = this.r.e(viewU);
            int iB2 = this.r.b(viewU);
            if (iF >= 0 && iF < iB) {
                if (!((RecyclerView.n) viewU.getLayoutParams()).a.h()) {
                    boolean z3 = iB2 <= iK && iE < iK;
                    boolean z4 = iE >= iG && iB2 > iG;
                    if (!z3 && !z4) {
                        return viewU;
                    }
                    if (z) {
                        if (z4) {
                            view2 = viewU;
                        } else if (view == null) {
                            view = viewU;
                        }
                    } else if (z3) {
                        view2 = viewU;
                    } else if (view == null) {
                        view = viewU;
                    }
                } else if (view3 == null) {
                    view3 = viewU;
                }
            }
            iV += i2;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public View Q(View view, int i, RecyclerView.t tVar, RecyclerView.y yVar) {
        int iG0;
        View viewN0;
        Z0();
        if (v() != 0 && (iG0 = G0(i)) != Integer.MIN_VALUE) {
            H0();
            d1(iG0, (int) (this.r.l() * 0.33333334f), false, yVar);
            c cVar = this.q;
            cVar.g = Integer.MIN_VALUE;
            cVar.a = false;
            I0(tVar, cVar, yVar, true);
            if (iG0 == -1) {
                viewN0 = this.u ? N0(v() - 1, -1) : N0(0, v());
            } else {
                viewN0 = this.u ? N0(0, v()) : N0(v() - 1, -1);
            }
            View viewT0 = iG0 == -1 ? T0() : S0();
            if (!viewT0.hasFocusable()) {
                return viewN0;
            }
            if (viewN0 != null) {
                return viewT0;
            }
        }
        return null;
    }

    public final int Q0(int i, RecyclerView.t tVar, RecyclerView.y yVar, boolean z) {
        int iG;
        int iG2 = this.r.g() - i;
        if (iG2 <= 0) {
            return 0;
        }
        int i2 = -a1(-iG2, tVar, yVar);
        int i3 = i + i2;
        if (!z || (iG = this.r.g() - i3) <= 0) {
            return i2;
        }
        this.r.o(iG);
        return iG + i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public final void R(AccessibilityEvent accessibilityEvent) {
        super.R(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(L0());
            accessibilityEvent.setToIndex(M0());
        }
    }

    public final int R0(int i, RecyclerView.t tVar, RecyclerView.y yVar, boolean z) {
        int iK;
        int iK2 = i - this.r.k();
        if (iK2 <= 0) {
            return 0;
        }
        int i2 = -a1(iK2, tVar, yVar);
        int i3 = i + i2;
        if (!z || (iK = i3 - this.r.k()) <= 0) {
            return i2;
        }
        this.r.o(-iK);
        return i2 - iK;
    }

    public final View S0() {
        return u(this.u ? 0 : v() - 1);
    }

    public final View T0() {
        return u(this.u ? v() - 1 : 0);
    }

    public final boolean U0() {
        return A() == 1;
    }

    public void V0(RecyclerView.t tVar, RecyclerView.y yVar, c cVar, b bVar) {
        int iC;
        int i;
        int i2;
        int iD;
        View viewB = cVar.b(tVar);
        if (viewB == null) {
            bVar.b = true;
            return;
        }
        RecyclerView.n nVar = (RecyclerView.n) viewB.getLayoutParams();
        if (cVar.k == null) {
            if (this.u == (cVar.f == -1)) {
                b(viewB, -1, false);
            } else {
                b(viewB, 0, false);
            }
        } else {
            if (this.u == (cVar.f == -1)) {
                b(viewB, -1, true);
            } else {
                b(viewB, 0, true);
            }
        }
        RecyclerView.n nVar2 = (RecyclerView.n) viewB.getLayoutParams();
        Rect rectM = this.b.M(viewB);
        int i3 = rectM.left + rectM.right;
        int i4 = rectM.top + rectM.bottom;
        int iW = RecyclerView.m.w(d(), this.n, this.l, D() + C() + ((ViewGroup.MarginLayoutParams) nVar2).leftMargin + ((ViewGroup.MarginLayoutParams) nVar2).rightMargin + i3, ((ViewGroup.MarginLayoutParams) nVar2).width);
        int iW2 = RecyclerView.m.w(e(), this.o, this.m, B() + E() + ((ViewGroup.MarginLayoutParams) nVar2).topMargin + ((ViewGroup.MarginLayoutParams) nVar2).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) nVar2).height);
        if (v0(viewB, iW, iW2, nVar2)) {
            viewB.measure(iW, iW2);
        }
        bVar.a = this.r.c(viewB);
        if (this.p == 1) {
            if (U0()) {
                iD = this.n - D();
                iC = iD - this.r.d(viewB);
            } else {
                iC = C();
                iD = this.r.d(viewB) + iC;
            }
            if (cVar.f == -1) {
                i = cVar.b;
                i2 = i - bVar.a;
            } else {
                i2 = cVar.b;
                i = bVar.a + i2;
            }
        } else {
            int iE = E();
            int iD2 = this.r.d(viewB) + iE;
            if (cVar.f == -1) {
                int i5 = cVar.b;
                int i6 = i5 - bVar.a;
                iD = i5;
                i = iD2;
                iC = i6;
                i2 = iE;
            } else {
                int i7 = cVar.b;
                int i8 = bVar.a + i7;
                iC = i7;
                i = iD2;
                i2 = iE;
                iD = i8;
            }
        }
        RecyclerView.m.L(viewB, iC, i2, iD, i);
        if (nVar.a.h() || nVar.a.k()) {
            bVar.c = true;
        }
        bVar.d = viewB.hasFocusable();
    }

    public void W0(RecyclerView.t tVar, RecyclerView.y yVar, a aVar, int i) {
    }

    public final void X0(RecyclerView.t tVar, c cVar) {
        if (!cVar.a || cVar.l) {
            return;
        }
        int i = cVar.g;
        int i2 = cVar.i;
        if (cVar.f == -1) {
            int iV = v();
            if (i < 0) {
                return;
            }
            int iF = (this.r.f() - i) + i2;
            if (this.u) {
                for (int i3 = 0; i3 < iV; i3++) {
                    View viewU = u(i3);
                    if (this.r.e(viewU) < iF || this.r.n(viewU) < iF) {
                        Y0(tVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iV - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewU2 = u(i5);
                if (this.r.e(viewU2) < iF || this.r.n(viewU2) < iF) {
                    Y0(tVar, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int iV2 = v();
        if (!this.u) {
            for (int i7 = 0; i7 < iV2; i7++) {
                View viewU3 = u(i7);
                if (this.r.b(viewU3) > i6 || this.r.m(viewU3) > i6) {
                    Y0(tVar, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = iV2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewU4 = u(i9);
            if (this.r.b(viewU4) > i6 || this.r.m(viewU4) > i6) {
                Y0(tVar, i8, i9);
                return;
            }
        }
    }

    public final void Y0(RecyclerView.t tVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                j0(i, tVar);
                i--;
            }
        } else {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                j0(i3, tVar);
            }
        }
    }

    public final void Z0() {
        if (this.p == 1 || !U0()) {
            this.u = this.t;
        } else {
            this.u = !this.t;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.x.b
    @SuppressLint({"UnknownNullness"})
    public final PointF a(int i) {
        if (v() == 0) {
            return null;
        }
        int i2 = (i < RecyclerView.m.F(u(0))) != this.u ? -1 : 1;
        return this.p == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:104:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:114:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:122:0x020f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x0213  */
    /* JADX WARN: Code duplicated, block: B:126:0x0216 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x021a  */
    /* JADX WARN: Code duplicated, block: B:130:0x021d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:131:0x021f  */
    /* JADX WARN: Code duplicated, block: B:133:0x0223  */
    /* JADX WARN: Code duplicated, block: B:135:0x0227  */
    /* JADX WARN: Code duplicated, block: B:137:0x022e  */
    /* JADX WARN: Code duplicated, block: B:138:0x0234  */
    /* JADX WARN: Code duplicated, block: B:95:0x0192  */
    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public void a0(RecyclerView.t tVar, RecyclerView.y yVar) {
        View focusedChild;
        int iB;
        RecyclerView recyclerView;
        View focusedChild2;
        boolean z;
        boolean z2;
        View viewP0;
        int iE;
        int iB2;
        int iK;
        int iG;
        boolean z3;
        boolean z4;
        RecyclerView.n nVar;
        int i;
        int iE2;
        int i2;
        int i3;
        List<RecyclerView.C> list;
        int i4;
        int i5;
        int iQ0;
        int i6;
        View viewQ;
        int iE3;
        int iG2;
        int i7;
        int i8 = -1;
        if (!(this.z == null && this.x == -1) && yVar.b() == 0) {
            g0(tVar);
            return;
        }
        d dVar = this.z;
        if (dVar != null && (i7 = dVar.d) >= 0) {
            this.x = i7;
        }
        H0();
        this.q.a = false;
        Z0();
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 == null || (focusedChild = recyclerView2.getFocusedChild()) == null || this.a.c.contains(focusedChild)) {
            focusedChild = null;
        }
        a aVar = this.A;
        if (!aVar.e || this.x != -1 || this.z != null) {
            aVar.d();
            aVar.d = this.u ^ this.v;
            if (yVar.g || (i = this.x) == -1) {
                if (v() != 0) {
                    recyclerView = this.b;
                    if (recyclerView != null || (focusedChild2 = recyclerView.getFocusedChild()) == null || this.a.c.contains(focusedChild2)) {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        nVar = (RecyclerView.n) focusedChild2.getLayoutParams();
                        if (!nVar.a.h() || nVar.a.b() < 0 || nVar.a.b() >= yVar.b()) {
                            z = this.s;
                            z2 = this.v;
                            if (z == z2 || (viewP0 = P0(tVar, yVar, aVar.d, z2)) == null) {
                                aVar.a();
                                if (this.v) {
                                    iB = yVar.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                aVar.b = iB;
                            } else {
                                aVar.b(viewP0, RecyclerView.m.F(viewP0));
                                if (!yVar.g && A0()) {
                                    iE = this.r.e(viewP0);
                                    iB2 = this.r.b(viewP0);
                                    iK = this.r.k();
                                    iG = this.r.g();
                                    if (iB2 <= iK || iE >= iK) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    if (iE >= iG || iB2 <= iG) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    if (z3 || z4) {
                                        if (aVar.d) {
                                            iK = iG;
                                        }
                                        aVar.c = iK;
                                    }
                                }
                            }
                        } else {
                            aVar.c(focusedChild2, RecyclerView.m.F(focusedChild2));
                        }
                    } else {
                        z = this.s;
                        z2 = this.v;
                        if (z == z2) {
                            aVar.a();
                            if (this.v) {
                                iB = yVar.b() - 1;
                            } else {
                                iB = 0;
                            }
                            aVar.b = iB;
                        } else {
                            aVar.b(viewP0, RecyclerView.m.F(viewP0));
                            if (!yVar.g) {
                                iE = this.r.e(viewP0);
                                iB2 = this.r.b(viewP0);
                                iK = this.r.k();
                                iG = this.r.g();
                                if (iB2 <= iK) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                if (iE >= iG) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (z3) {
                                    if (aVar.d) {
                                        iK = iG;
                                    }
                                    aVar.c = iK;
                                } else {
                                    if (aVar.d) {
                                        iK = iG;
                                    }
                                    aVar.c = iK;
                                }
                            }
                        }
                    }
                } else {
                    aVar.a();
                    if (this.v) {
                        iB = yVar.b() - 1;
                    } else {
                        iB = 0;
                    }
                    aVar.b = iB;
                }
            } else if (i < 0 || i >= yVar.b()) {
                this.x = -1;
                this.y = Integer.MIN_VALUE;
                if (v() != 0) {
                    recyclerView = this.b;
                    if (recyclerView != null) {
                        focusedChild2 = null;
                    } else {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        nVar = (RecyclerView.n) focusedChild2.getLayoutParams();
                        if (nVar.a.h()) {
                            z = this.s;
                            z2 = this.v;
                            if (z == z2) {
                                aVar.a();
                                if (this.v) {
                                    iB = yVar.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                aVar.b = iB;
                            } else {
                                aVar.b(viewP0, RecyclerView.m.F(viewP0));
                                if (!yVar.g) {
                                    iE = this.r.e(viewP0);
                                    iB2 = this.r.b(viewP0);
                                    iK = this.r.k();
                                    iG = this.r.g();
                                    if (iB2 <= iK) {
                                        z3 = false;
                                    } else {
                                        z3 = false;
                                    }
                                    if (iE >= iG) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z3) {
                                        if (aVar.d) {
                                            iK = iG;
                                        }
                                        aVar.c = iK;
                                    } else {
                                        if (aVar.d) {
                                            iK = iG;
                                        }
                                        aVar.c = iK;
                                    }
                                }
                            }
                        } else {
                            z = this.s;
                            z2 = this.v;
                            if (z == z2) {
                                aVar.a();
                                if (this.v) {
                                    iB = yVar.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                aVar.b = iB;
                            } else {
                                aVar.b(viewP0, RecyclerView.m.F(viewP0));
                                if (!yVar.g) {
                                    iE = this.r.e(viewP0);
                                    iB2 = this.r.b(viewP0);
                                    iK = this.r.k();
                                    iG = this.r.g();
                                    if (iB2 <= iK) {
                                        z3 = false;
                                    } else {
                                        z3 = false;
                                    }
                                    if (iE >= iG) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z3) {
                                        if (aVar.d) {
                                            iK = iG;
                                        }
                                        aVar.c = iK;
                                    } else {
                                        if (aVar.d) {
                                            iK = iG;
                                        }
                                        aVar.c = iK;
                                    }
                                }
                            }
                        }
                    } else {
                        z = this.s;
                        z2 = this.v;
                        if (z == z2) {
                            aVar.a();
                            if (this.v) {
                                iB = yVar.b() - 1;
                            } else {
                                iB = 0;
                            }
                            aVar.b = iB;
                        } else {
                            aVar.b(viewP0, RecyclerView.m.F(viewP0));
                            if (!yVar.g) {
                                iE = this.r.e(viewP0);
                                iB2 = this.r.b(viewP0);
                                iK = this.r.k();
                                iG = this.r.g();
                                if (iB2 <= iK) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                if (iE >= iG) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (z3) {
                                    if (aVar.d) {
                                        iK = iG;
                                    }
                                    aVar.c = iK;
                                } else {
                                    if (aVar.d) {
                                        iK = iG;
                                    }
                                    aVar.c = iK;
                                }
                            }
                        }
                    }
                } else {
                    aVar.a();
                    if (this.v) {
                        iB = yVar.b() - 1;
                    } else {
                        iB = 0;
                    }
                    aVar.b = iB;
                }
            } else {
                int i9 = this.x;
                aVar.b = i9;
                d dVar2 = this.z;
                if (dVar2 != null && dVar2.d >= 0) {
                    boolean z5 = dVar2.g;
                    aVar.d = z5;
                    if (z5) {
                        aVar.c = this.r.g() - this.z.e;
                    } else {
                        aVar.c = this.r.k() + this.z.e;
                    }
                } else if (this.y == Integer.MIN_VALUE) {
                    View viewQ2 = q(i9);
                    if (viewQ2 == null) {
                        if (v() > 0) {
                            aVar.d = (this.x < RecyclerView.m.F(u(0))) == this.u;
                        }
                        aVar.a();
                    } else if (this.r.c(viewQ2) > this.r.l()) {
                        aVar.a();
                    } else if (this.r.e(viewQ2) - this.r.k() < 0) {
                        aVar.c = this.r.k();
                        aVar.d = false;
                    } else if (this.r.g() - this.r.b(viewQ2) < 0) {
                        aVar.c = this.r.g();
                        aVar.d = true;
                    } else {
                        if (aVar.d) {
                            int iB3 = this.r.b(viewQ2);
                            z zVar = this.r;
                            iE2 = (Integer.MIN_VALUE == zVar.b ? 0 : zVar.l() - zVar.b) + iB3;
                        } else {
                            iE2 = this.r.e(viewQ2);
                        }
                        aVar.c = iE2;
                    }
                } else {
                    boolean z6 = this.u;
                    aVar.d = z6;
                    if (z6) {
                        aVar.c = this.r.g() - this.y;
                    } else {
                        aVar.c = this.r.k() + this.y;
                    }
                }
            }
            aVar.e = true;
        } else if (focusedChild != null && (this.r.e(focusedChild) >= this.r.g() || this.r.b(focusedChild) <= this.r.k())) {
            aVar.c(focusedChild, RecyclerView.m.F(focusedChild));
        }
        c cVar = this.q;
        cVar.f = cVar.j >= 0 ? 1 : -1;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        B0(yVar, iArr);
        int iK2 = this.r.k() + Math.max(0, iArr[0]);
        int iH = this.r.h() + Math.max(0, iArr[1]);
        if (yVar.g && (i6 = this.x) != -1 && this.y != Integer.MIN_VALUE && (viewQ = q(i6)) != null) {
            if (this.u) {
                iG2 = this.r.g() - this.r.b(viewQ);
                iE3 = this.y;
            } else {
                iE3 = this.r.e(viewQ) - this.r.k();
                iG2 = this.y;
            }
            int i10 = iG2 - iE3;
            if (i10 > 0) {
                iK2 += i10;
            } else {
                iH -= i10;
            }
        }
        if (!aVar.d ? !this.u : this.u) {
            i8 = 1;
        }
        W0(tVar, yVar, aVar, i8);
        p(tVar);
        this.q.l = this.r.i() == 0 && this.r.f() == 0;
        this.q.getClass();
        this.q.i = 0;
        if (aVar.d) {
            f1(aVar.b, aVar.c);
            c cVar2 = this.q;
            cVar2.h = iK2;
            I0(tVar, cVar2, yVar, false);
            c cVar3 = this.q;
            i3 = cVar3.b;
            int i11 = cVar3.d;
            int i12 = cVar3.c;
            if (i12 > 0) {
                iH += i12;
            }
            e1(aVar.b, aVar.c);
            c cVar4 = this.q;
            cVar4.h = iH;
            cVar4.d += cVar4.e;
            I0(tVar, cVar4, yVar, false);
            c cVar5 = this.q;
            i2 = cVar5.b;
            int i13 = cVar5.c;
            if (i13 > 0) {
                f1(i11, i3);
                c cVar6 = this.q;
                cVar6.h = i13;
                I0(tVar, cVar6, yVar, false);
                i3 = this.q.b;
            }
        } else {
            e1(aVar.b, aVar.c);
            c cVar7 = this.q;
            cVar7.h = iH;
            I0(tVar, cVar7, yVar, false);
            c cVar8 = this.q;
            i2 = cVar8.b;
            int i14 = cVar8.d;
            int i15 = cVar8.c;
            if (i15 > 0) {
                iK2 += i15;
            }
            f1(aVar.b, aVar.c);
            c cVar9 = this.q;
            cVar9.h = iK2;
            cVar9.d += cVar9.e;
            I0(tVar, cVar9, yVar, false);
            c cVar10 = this.q;
            int i16 = cVar10.b;
            int i17 = cVar10.c;
            if (i17 > 0) {
                e1(i14, i2);
                c cVar11 = this.q;
                cVar11.h = i17;
                I0(tVar, cVar11, yVar, false);
                i2 = this.q.b;
            }
            i3 = i16;
        }
        if (v() > 0) {
            if (this.u ^ this.v) {
                int iQ1 = Q0(i2, tVar, yVar, true);
                i4 = i3 + iQ1;
                i5 = i2 + iQ1;
                iQ0 = R0(i4, tVar, yVar, false);
            } else {
                int iR0 = R0(i3, tVar, yVar, true);
                i4 = i3 + iR0;
                i5 = i2 + iR0;
                iQ0 = Q0(i5, tVar, yVar, false);
            }
            i3 = i4 + iQ0;
            i2 = i5 + iQ0;
        }
        if (yVar.k && v() != 0 && !yVar.g && A0()) {
            List<RecyclerView.C> list2 = tVar.d;
            int size = list2.size();
            int iF = RecyclerView.m.F(u(0));
            int iC = 0;
            int iC2 = 0;
            for (int i18 = 0; i18 < size; i18++) {
                RecyclerView.C c2 = list2.get(i18);
                if (!c2.h()) {
                    boolean z7 = c2.b() < iF;
                    boolean z8 = this.u;
                    View view = c2.a;
                    if (z7 != z8) {
                        iC += this.r.c(view);
                    } else {
                        iC2 += this.r.c(view);
                    }
                }
            }
            this.q.k = list2;
            if (iC > 0) {
                f1(RecyclerView.m.F(T0()), i3);
                c cVar12 = this.q;
                cVar12.h = iC;
                cVar12.c = 0;
                cVar12.a(null);
                I0(tVar, this.q, yVar, false);
            }
            if (iC2 > 0) {
                e1(RecyclerView.m.F(S0()), i2);
                c cVar13 = this.q;
                cVar13.h = iC2;
                cVar13.c = 0;
                list = null;
                cVar13.a(null);
                I0(tVar, this.q, yVar, false);
            } else {
                list = null;
            }
            this.q.k = list;
        }
        if (yVar.g) {
            aVar.d();
        } else {
            z zVar2 = this.r;
            zVar2.b = zVar2.l();
        }
        this.s = this.v;
    }

    public final int a1(int i, RecyclerView.t tVar, RecyclerView.y yVar) {
        if (v() != 0 && i != 0) {
            H0();
            this.q.a = true;
            int i2 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            d1(i2, iAbs, true, yVar);
            c cVar = this.q;
            int iI0 = I0(tVar, cVar, yVar, false) + cVar.g;
            if (iI0 >= 0) {
                if (iAbs > iI0) {
                    i = i2 * iI0;
                }
                this.r.o(-i);
                this.q.j = i;
                return i;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public void b0(RecyclerView.y yVar) {
        this.z = null;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.A.d();
    }

    public final void b1(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(EK.e(i, "invalid orientation:"));
        }
        c(null);
        if (i != this.p || this.r == null) {
            z zVarA = z.a(this, i);
            this.r = zVarA;
            this.A.a = zVarA;
            this.p = i;
            m0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public final void c(String str) {
        if (this.z == null) {
            super.c(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public final void c0(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.z = dVar;
            if (this.x != -1) {
                dVar.d = -1;
            }
            m0();
        }
    }

    public void c1(boolean z) {
        c(null);
        if (this.v == z) {
            return;
        }
        this.v = z;
        m0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean d() {
        return this.p == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public final Parcelable d0() {
        d dVar = this.z;
        if (dVar != null) {
            d dVar2 = new d();
            dVar2.d = dVar.d;
            dVar2.e = dVar.e;
            dVar2.g = dVar.g;
            return dVar2;
        }
        d dVar3 = new d();
        if (v() <= 0) {
            dVar3.d = -1;
            return dVar3;
        }
        H0();
        boolean z = this.s ^ this.u;
        dVar3.g = z;
        if (z) {
            View viewS0 = S0();
            dVar3.e = this.r.g() - this.r.b(viewS0);
            dVar3.d = RecyclerView.m.F(viewS0);
            return dVar3;
        }
        View viewT0 = T0();
        dVar3.d = RecyclerView.m.F(viewT0);
        dVar3.e = this.r.e(viewT0) - this.r.k();
        return dVar3;
    }

    public final void d1(int i, int i2, boolean z, RecyclerView.y yVar) {
        int iK;
        this.q.l = this.r.i() == 0 && this.r.f() == 0;
        this.q.f = i;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        B0(yVar, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        c cVar = this.q;
        int i3 = z2 ? iMax2 : iMax;
        cVar.h = i3;
        if (!z2) {
            iMax = iMax2;
        }
        cVar.i = iMax;
        if (z2) {
            cVar.h = this.r.h() + i3;
            View viewS0 = S0();
            c cVar2 = this.q;
            cVar2.e = this.u ? -1 : 1;
            int iF = RecyclerView.m.F(viewS0);
            c cVar3 = this.q;
            cVar2.d = iF + cVar3.e;
            cVar3.b = this.r.b(viewS0);
            iK = this.r.b(viewS0) - this.r.g();
        } else {
            View viewT0 = T0();
            c cVar4 = this.q;
            cVar4.h = this.r.k() + cVar4.h;
            c cVar5 = this.q;
            cVar5.e = this.u ? 1 : -1;
            int iF2 = RecyclerView.m.F(viewT0);
            c cVar6 = this.q;
            cVar5.d = iF2 + cVar6.e;
            cVar6.b = this.r.e(viewT0);
            iK = (-this.r.e(viewT0)) + this.r.k();
        }
        c cVar7 = this.q;
        cVar7.c = i2;
        if (z) {
            cVar7.c = i2 - iK;
        }
        cVar7.g = iK;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean e() {
        return this.p == 1;
    }

    public final void e1(int i, int i2) {
        this.q.c = this.r.g() - i2;
        c cVar = this.q;
        cVar.e = this.u ? -1 : 1;
        cVar.d = i;
        cVar.f = 1;
        cVar.b = i2;
        cVar.g = Integer.MIN_VALUE;
    }

    public final void f1(int i, int i2) {
        this.q.c = i2 - this.r.k();
        c cVar = this.q;
        cVar.d = i;
        cVar.e = this.u ? 1 : -1;
        cVar.f = -1;
        cVar.b = i2;
        cVar.g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public final void h(int i, int i2, RecyclerView.y yVar, s.b bVar) {
        if (this.p != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        H0();
        d1(i > 0 ? 1 : -1, Math.abs(i), true, yVar);
        C0(yVar, this.q, bVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public final void i(int i, s.b bVar) {
        boolean z;
        int i2;
        d dVar = this.z;
        if (dVar == null || (i2 = dVar.d) < 0) {
            Z0();
            z = this.u;
            i2 = this.x;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = dVar.g;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.C && i2 >= 0 && i2 < i; i4++) {
            bVar.a(i2, 0);
            i2 += i3;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public final int j(RecyclerView.y yVar) {
        return D0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public int k(RecyclerView.y yVar) {
        return E0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public int l(RecyclerView.y yVar) {
        return F0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public final int m(RecyclerView.y yVar) {
        return D0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public int n(RecyclerView.y yVar) {
        return E0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public int n0(int i, RecyclerView.t tVar, RecyclerView.y yVar) {
        if (this.p == 1) {
            return 0;
        }
        return a1(i, tVar, yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public int o(RecyclerView.y yVar) {
        return F0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void o0(int i) {
        this.x = i;
        this.y = Integer.MIN_VALUE;
        d dVar = this.z;
        if (dVar != null) {
            dVar.d = -1;
        }
        m0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public int p0(int i, RecyclerView.t tVar, RecyclerView.y yVar) {
        if (this.p == 0) {
            return 0;
        }
        return a1(i, tVar, yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public final View q(int i) {
        int iV = v();
        if (iV == 0) {
            return null;
        }
        int iF = i - RecyclerView.m.F(u(0));
        if (iF >= 0 && iF < iV) {
            View viewU = u(iF);
            if (RecyclerView.m.F(viewU) == i) {
                return viewU;
            }
        }
        return super.q(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public RecyclerView.n r() {
        return new RecyclerView.n(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean w0() {
        if (this.m != 1073741824 && this.l != 1073741824) {
            int iV = v();
            for (int i = 0; i < iV; i++) {
                ViewGroup.LayoutParams layoutParams = u(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public void y0(RecyclerView recyclerView, int i) {
        u uVar = new u(recyclerView.getContext());
        uVar.a = i;
        z0(uVar);
    }

    public LinearLayoutManager(int i, boolean z) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new a();
        this.B = new b();
        this.C = 2;
        this.D = new int[2];
        b1(i);
        c(null);
        if (z == this.t) {
            return;
        }
        this.t = z;
        m0();
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new a();
        this.B = new b();
        this.C = 2;
        this.D = new int[2];
        RecyclerView.m.c cVarG = RecyclerView.m.G(context, attributeSet, i, i2);
        b1(cVarG.a);
        boolean z = cVarG.c;
        c(null);
        if (z != this.t) {
            this.t = z;
            m0();
        }
        c1(cVarG.d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public final void P(RecyclerView recyclerView) {
    }
}
