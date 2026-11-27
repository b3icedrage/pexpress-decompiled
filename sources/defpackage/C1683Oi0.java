package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* JADX INFO: renamed from: Oi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedApi"})
public class C1683Oi0 extends AbstractC1605Ni0 {

    /* JADX INFO: renamed from: Oi0$a */
    public class a extends E42.c {
    }

    /* JADX INFO: renamed from: Oi0$c */
    public class c extends E42.c {
    }

    @Override // defpackage.AbstractC1605Ni0
    public final void a(View view, Object obj) {
        ((E42) obj).b(view);
    }

    @Override // defpackage.AbstractC1605Ni0
    public final void b(Object obj, ArrayList<View> arrayList) {
        E42 e42 = (E42) obj;
        if (e42 == null) {
            return;
        }
        int i = 0;
        if (e42 instanceof M42) {
            M42 m42 = (M42) e42;
            int size = m42.B.size();
            while (i < size) {
                b((i < 0 || i >= m42.B.size()) ? null : m42.B.get(i), arrayList);
                i++;
            }
            return;
        }
        if (AbstractC1605Ni0.h(e42.i) && AbstractC1605Ni0.h(e42.j)) {
            int size2 = arrayList.size();
            while (i < size2) {
                e42.b(arrayList.get(i));
                i++;
            }
        }
    }

    @Override // defpackage.AbstractC1605Ni0
    public final void c(ViewGroup viewGroup, Object obj) {
        K42.a(viewGroup, (E42) obj);
    }

    @Override // defpackage.AbstractC1605Ni0
    public final boolean e(Object obj) {
        return obj instanceof E42;
    }

    @Override // defpackage.AbstractC1605Ni0
    public final Object f(Object obj) {
        if (obj != null) {
            return ((E42) obj).clone();
        }
        return null;
    }

    @Override // defpackage.AbstractC1605Ni0
    public final Object i(Object obj, Object obj2, Object obj3) {
        E42 e42 = (E42) obj;
        E42 e43 = (E42) obj2;
        E42 e44 = (E42) obj3;
        if (e42 != null && e43 != null) {
            M42 m42 = new M42();
            m42.M(e42);
            m42.M(e43);
            m42.P(1);
            e42 = m42;
        } else if (e42 == null) {
            e42 = e43 != null ? e43 : null;
        }
        if (e44 == null) {
            return e42;
        }
        M42 m43 = new M42();
        if (e42 != null) {
            m43.M(e42);
        }
        m43.M(e44);
        return m43;
    }

    @Override // defpackage.AbstractC1605Ni0
    public final Object j(Object obj, Object obj2) {
        M42 m42 = new M42();
        if (obj != null) {
            m42.M((E42) obj);
        }
        m42.M((E42) obj2);
        return m42;
    }

    @Override // defpackage.AbstractC1605Ni0
    public final void k(Object obj, View view, ArrayList<View> arrayList) {
        ((E42) obj).a(new b(view, arrayList));
    }

    @Override // defpackage.AbstractC1605Ni0
    public final void l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((E42) obj).a(new C1761Pi0(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // defpackage.AbstractC1605Ni0
    public final void m(View view, Object obj) {
        if (view != null) {
            AbstractC1605Ni0.g(view, new Rect());
            ((E42) obj).F(new a());
        }
    }

    @Override // defpackage.AbstractC1605Ni0
    public final void n(Object obj, Rect rect) {
        ((E42) obj).F(new c());
    }

    @Override // defpackage.AbstractC1605Ni0
    public final void p(Object obj, View view, ArrayList<View> arrayList) {
        M42 m42 = (M42) obj;
        ArrayList<View> arrayList2 = m42.j;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC1605Ni0.d(arrayList.get(i), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(m42, arrayList);
    }

    @Override // defpackage.AbstractC1605Ni0
    public final void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        M42 m42 = (M42) obj;
        if (m42 != null) {
            ArrayList<View> arrayList3 = m42.j;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            s(m42, arrayList, arrayList2);
        }
    }

    @Override // defpackage.AbstractC1605Ni0
    public final Object r(Object obj) {
        if (obj == null) {
            return null;
        }
        M42 m42 = new M42();
        m42.M((E42) obj);
        return m42;
    }

    public final void s(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        E42 e42 = (E42) obj;
        int i = 0;
        if (e42 instanceof M42) {
            M42 m42 = (M42) e42;
            int size = m42.B.size();
            while (i < size) {
                s((i < 0 || i >= m42.B.size()) ? null : m42.B.get(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (AbstractC1605Ni0.h(e42.i)) {
            ArrayList<View> arrayList3 = e42.j;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size2) {
                    e42.b(arrayList2.get(i));
                    i++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    e42.A(arrayList.get(size3));
                }
            }
        }
    }

    /* JADX INFO: renamed from: Oi0$b */
    public class b implements E42.d {
        public final /* synthetic */ View d;
        public final /* synthetic */ ArrayList e;

        public b(View view, ArrayList arrayList) {
            this.d = view;
            this.e = arrayList;
        }

        @Override // E42.d
        public final void b(@NonNull E42 e42) {
            e42.z(this);
            this.d.setVisibility(8);
            ArrayList arrayList = this.e;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((View) arrayList.get(i)).setVisibility(0);
            }
        }

        @Override // E42.d
        public final void a() {
        }

        @Override // E42.d
        public final void c() {
        }

        @Override // E42.d
        public final void d() {
        }

        @Override // E42.d
        public final void e() {
        }
    }
}
