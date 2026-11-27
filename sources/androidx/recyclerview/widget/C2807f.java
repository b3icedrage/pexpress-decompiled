package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import defpackage.C5345me2;
import defpackage.Cd2;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: androidx.recyclerview.widget.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2807f {
    public final C a;
    public final a b = new a();
    public final ArrayList c = new ArrayList();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.f$a */
    public static class a {
        public long a = 0;
        public a b;

        public final void a(int i) {
            if (i < 64) {
                this.a &= ~(1 << i);
                return;
            }
            a aVar = this.b;
            if (aVar != null) {
                aVar.a(i - 64);
            }
        }

        public final int b(int i) {
            a aVar = this.b;
            if (aVar == null) {
                return i >= 64 ? Long.bitCount(this.a) : Long.bitCount(this.a & ((1 << i) - 1));
            }
            if (i < 64) {
                return Long.bitCount(this.a & ((1 << i) - 1));
            }
            return Long.bitCount(this.a) + aVar.b(i - 64);
        }

        public final void c() {
            if (this.b == null) {
                this.b = new a();
            }
        }

        public final boolean d(int i) {
            if (i < 64) {
                return (this.a & (1 << i)) != 0;
            }
            c();
            return this.b.d(i - 64);
        }

        public final void e(int i, boolean z) {
            if (i >= 64) {
                c();
                this.b.e(i - 64, z);
                return;
            }
            long j = this.a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.a = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                h(i);
            } else {
                a(i);
            }
            if (z2 || this.b != null) {
                c();
                this.b.e(0, z2);
            }
        }

        public final boolean f(int i) {
            if (i >= 64) {
                c();
                return this.b.f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.a;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (~j);
            this.a = j3;
            long j4 = j - 1;
            this.a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            a aVar = this.b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.b.f(0);
            }
            return z;
        }

        public final void g() {
            this.a = 0L;
            a aVar = this.b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public final void h(int i) {
            if (i < 64) {
                this.a |= 1 << i;
            } else {
                c();
                this.b.h(i - 64);
            }
        }

        public final String toString() {
            if (this.b == null) {
                return Long.toBinaryString(this.a);
            }
            return this.b.toString() + "xx" + Long.toBinaryString(this.a);
        }
    }

    public C2807f(C c) {
        this.a = c;
    }

    public final void a(View view, int i, boolean z) {
        RecyclerView recyclerView = this.a.a;
        int childCount = i < 0 ? recyclerView.getChildCount() : f(i);
        this.b.e(childCount, z);
        if (z) {
            i(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.C cK = RecyclerView.K(view);
        RecyclerView.e eVar = recyclerView.q;
        if (eVar != null && cK != null) {
            eVar.l(cK);
        }
        ArrayList arrayList = recyclerView.H;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((RecyclerView.o) recyclerView.H.get(size)).a(view);
            }
        }
    }

    public final void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = this.a.a;
        int childCount = i < 0 ? recyclerView.getChildCount() : f(i);
        this.b.e(childCount, z);
        if (z) {
            i(view);
        }
        RecyclerView.C cK = RecyclerView.K(view);
        if (cK != null) {
            if (!cK.j() && !cK.o()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + cK + recyclerView.A());
            }
            cK.j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final void c(int i) {
        RecyclerView.C cK;
        int iF = f(i);
        this.b.f(iF);
        RecyclerView recyclerView = this.a.a;
        View childAt = recyclerView.getChildAt(iF);
        if (childAt != null && (cK = RecyclerView.K(childAt)) != null) {
            if (cK.j() && !cK.o()) {
                throw new IllegalArgumentException("called detach on an already detached child " + cK + recyclerView.A());
            }
            cK.a(UserVerificationMethods.USER_VERIFY_HANDPRINT);
        }
        recyclerView.detachViewFromParent(iF);
    }

    public final View d(int i) {
        return this.a.a.getChildAt(f(i));
    }

    public final int e() {
        return this.a.a.getChildCount() - this.c.size();
    }

    public final int f(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = this.a.a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            a aVar = this.b;
            int iB = i - (i2 - aVar.b(i2));
            if (iB == 0) {
                while (aVar.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iB;
        }
        return -1;
    }

    public final View g(int i) {
        return this.a.a.getChildAt(i);
    }

    public final int h() {
        return this.a.a.getChildCount();
    }

    public final void i(View view) {
        this.c.add(view);
        C c = this.a;
        RecyclerView.C cK = RecyclerView.K(view);
        if (cK != null) {
            int i = cK.q;
            View view2 = cK.a;
            if (i != -1) {
                cK.p = i;
            } else {
                WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                cK.p = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = c.a;
            if (recyclerView.O()) {
                cK.q = 4;
                recyclerView.z0.add(cK);
            } else {
                WeakHashMap<View, C5345me2> weakHashMap2 = Cd2.a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public final void j(View view) {
        if (this.c.remove(view)) {
            C c = this.a;
            RecyclerView.C cK = RecyclerView.K(view);
            if (cK != null) {
                int i = cK.p;
                RecyclerView recyclerView = c.a;
                if (recyclerView.O()) {
                    cK.q = i;
                    recyclerView.z0.add(cK);
                } else {
                    WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                    cK.a.setImportantForAccessibility(i);
                }
                cK.p = 0;
            }
        }
    }

    public final String toString() {
        return this.b.toString() + ", hidden list:" + this.c.size();
    }
}
