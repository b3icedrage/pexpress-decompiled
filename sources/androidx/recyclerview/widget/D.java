package androidx.recyclerview.widget;

import android.view.View;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class D {
    public final /* synthetic */ RecyclerView a;

    public D(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void a(C2802a.C0239a c0239a) {
        int i = c0239a.a;
        RecyclerView recyclerView = this.a;
        if (i == 1) {
            recyclerView.r.V(c0239a.b, c0239a.d);
            return;
        }
        if (i == 2) {
            recyclerView.r.Y(c0239a.b, c0239a.d);
        } else if (i == 4) {
            recyclerView.r.Z(c0239a.b, c0239a.d);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.r.X(c0239a.b, c0239a.d);
        }
    }

    public final RecyclerView.C b(int i) {
        RecyclerView recyclerView = this.a;
        int iH = recyclerView.j.h();
        RecyclerView.C c = null;
        for (int i2 = 0; i2 < iH; i2++) {
            RecyclerView.C cK = RecyclerView.K(recyclerView.j.g(i2));
            if (cK != null && !cK.h() && cK.c == i) {
                if (!recyclerView.j.c.contains(cK.a)) {
                    c = cK;
                    break;
                }
                c = cK;
            }
        }
        if (c == null || recyclerView.j.c.contains(c.a)) {
            return null;
        }
        return c;
    }

    public final void c(Object obj, int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.a;
        int iH = recyclerView.j.h();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iH; i6++) {
            View viewG = recyclerView.j.g(i6);
            RecyclerView.C cK = RecyclerView.K(viewG);
            if (cK != null && !cK.o() && (i4 = cK.c) >= i && i4 < i5) {
                cK.a(2);
                if (obj == null) {
                    cK.a(UserVerificationMethods.USER_VERIFY_ALL);
                } else if ((1024 & cK.j) == 0) {
                    if (cK.k == null) {
                        ArrayList arrayList = new ArrayList();
                        cK.k = arrayList;
                        cK.l = Collections.unmodifiableList(arrayList);
                    }
                    cK.k.add(obj);
                }
                ((RecyclerView.n) viewG.getLayoutParams()).c = true;
            }
        }
        RecyclerView.t tVar = recyclerView.g;
        ArrayList<RecyclerView.C> arrayList2 = tVar.c;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            RecyclerView.C c = arrayList2.get(size);
            if (c != null && (i3 = c.c) >= i && i3 < i5) {
                c.a(2);
                tVar.g(size);
            }
        }
        recyclerView.q0 = true;
    }

    public final void d(int i, int i2) {
        RecyclerView recyclerView = this.a;
        int iH = recyclerView.j.h();
        for (int i3 = 0; i3 < iH; i3++) {
            RecyclerView.C cK = RecyclerView.K(recyclerView.j.g(i3));
            if (cK != null && !cK.o() && cK.c >= i) {
                cK.l(i2, false);
                recyclerView.m0.f = true;
            }
        }
        ArrayList<RecyclerView.C> arrayList = recyclerView.g.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView.C c = arrayList.get(i4);
            if (c != null && c.c >= i) {
                c.l(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.p0 = true;
    }

    public final void e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.a;
        int iH = recyclerView.j.h();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < iH; i11++) {
            RecyclerView.C cK = RecyclerView.K(recyclerView.j.g(i11));
            if (cK != null && (i9 = cK.c) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    cK.l(i2 - i, false);
                } else {
                    cK.l(i5, false);
                }
                recyclerView.m0.f = true;
            }
        }
        RecyclerView.t tVar = recyclerView.g;
        tVar.getClass();
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        ArrayList<RecyclerView.C> arrayList = tVar.c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView.C c = arrayList.get(i12);
            if (c != null && (i8 = c.c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    c.l(i2 - i, false);
                } else {
                    c.l(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.p0 = true;
    }
}
