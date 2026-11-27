package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class E42 implements Cloneable {
    public ArrayList<Q42> o;
    public ArrayList<Q42> p;
    public c w;
    public static final int[] y = {2, 1, 3, 4};
    public static final a z = new a();
    public static final ThreadLocal<C8092zj<Animator, b>> A = new ThreadLocal<>();
    public final String d = getClass().getName();
    public long e = -1;
    public long g = -1;
    public TimeInterpolator h = null;
    public final ArrayList<Integer> i = new ArrayList<>();
    public final ArrayList<View> j = new ArrayList<>();
    public RO k = new RO();
    public RO l = new RO();
    public M42 m = null;
    public final int[] n = y;
    public final ArrayList<Animator> q = new ArrayList<>();
    public int r = 0;
    public boolean s = false;
    public boolean t = false;
    public ArrayList<d> u = null;
    public ArrayList<Animator> v = new ArrayList<>();
    public a x = z;

    public static class a extends G1 {
        public final Path w(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    public static class b {
        public View a;
        public String b;
        public Q42 c;
        public Ui2 d;
        public E42 e;
    }

    public static abstract class c {
    }

    public interface d {
        void a();

        void b(@NonNull E42 e42);

        void c();

        void d();

        void e();
    }

    public static void d(RO ro, View view, Q42 q42) {
        ((C8092zj) ro.a).put(view, q42);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) ro.b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        String strK = Cd2.d.k(view);
        if (strK != null) {
            C8092zj c8092zj = (C8092zj) ro.d;
            if (c8092zj.containsKey(strK)) {
                c8092zj.put(strK, null);
            } else {
                c8092zj.put(strK, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                HT0 ht0 = (HT0) ro.c;
                if (ht0.d) {
                    ht0.b();
                }
                if (U0.c(ht0.e, ht0.h, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    ht0.g(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) ht0.d(itemIdAtPosition, null);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    ht0.g(itemIdAtPosition, null);
                }
            }
        }
    }

    public static C8092zj<Animator, b> s() {
        ThreadLocal<C8092zj<Animator, b>> threadLocal = A;
        C8092zj<Animator, b> c8092zj = threadLocal.get();
        if (c8092zj != null) {
            return c8092zj;
        }
        C8092zj<Animator, b> c8092zj2 = new C8092zj<>();
        threadLocal.set(c8092zj2);
        return c8092zj2;
    }

    @NonNull
    public void A(@NonNull View view) {
        this.j.remove(view);
    }

    public void B(View view) {
        if (this.s) {
            if (!this.t) {
                C8092zj<Animator, b> c8092zjS = s();
                int i = c8092zjS.g;
                Pe2 pe2 = He2.a;
                WindowId windowId = view.getWindowId();
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    b bVarM = c8092zjS.m(i2);
                    if (bVarM.a != null && bVarM.d.a.equals(windowId)) {
                        c8092zjS.i(i2).resume();
                    }
                }
                ArrayList<d> arrayList = this.u;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.u.clone();
                    int size = arrayList2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((d) arrayList2.get(i3)).e();
                    }
                }
            }
            this.s = false;
        }
    }

    public void C() {
        K();
        C8092zj<Animator, b> c8092zjS = s();
        for (Animator animator : this.v) {
            if (c8092zjS.containsKey(animator)) {
                K();
                if (animator != null) {
                    animator.addListener(new F42(this, c8092zjS));
                    long j = this.g;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.e;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.h;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new G42(this));
                    animator.start();
                }
            }
        }
        this.v.clear();
        o();
    }

    @NonNull
    public E42 E(long j) {
        this.g = j;
        return this;
    }

    public void F(c cVar) {
        this.w = cVar;
    }

    @NonNull
    public void G(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
    }

    public void H(a aVar) {
        if (aVar == null) {
            this.x = z;
        } else {
            this.x = aVar;
        }
    }

    @NonNull
    public void J(long j) {
        this.e = j;
    }

    public final void K() {
        if (this.r == 0) {
            ArrayList<d> arrayList = this.u;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.u.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((d) arrayList2.get(i)).d();
                }
            }
            this.t = false;
        }
        this.r++;
    }

    public String L(String str) {
        StringBuilder sbF = C1039Gc0.f(str);
        sbF.append(getClass().getSimpleName());
        sbF.append("@");
        sbF.append(Integer.toHexString(hashCode()));
        sbF.append(": ");
        String string = sbF.toString();
        if (this.g != -1) {
            string = C0681Bn.c(K1.b(string, "dur("), this.g, ") ");
        }
        if (this.e != -1) {
            string = C0681Bn.c(K1.b(string, "dly("), this.e, ") ");
        }
        if (this.h != null) {
            StringBuilder sbB = K1.b(string, "interp(");
            sbB.append(this.h);
            sbB.append(") ");
            string = sbB.toString();
        }
        ArrayList<Integer> arrayList = this.i;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.j;
        if (size <= 0 && arrayList2.size() <= 0) {
            return string;
        }
        String strC = Z0.c(string, "tgts(");
        if (arrayList.size() > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (i > 0) {
                    strC = Z0.c(strC, ", ");
                }
                StringBuilder sbF2 = C1039Gc0.f(strC);
                sbF2.append(arrayList.get(i));
                strC = sbF2.toString();
            }
        }
        if (arrayList2.size() > 0) {
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                if (i2 > 0) {
                    strC = Z0.c(strC, ", ");
                }
                StringBuilder sbF3 = C1039Gc0.f(strC);
                sbF3.append(arrayList2.get(i2));
                strC = sbF3.toString();
            }
        }
        return Z0.c(strC, ")");
    }

    @NonNull
    public void a(@NonNull d dVar) {
        if (this.u == null) {
            this.u = new ArrayList<>();
        }
        this.u.add(dVar);
    }

    @NonNull
    public void b(@NonNull View view) {
        this.j.add(view);
    }

    public abstract void e(@NonNull Q42 q42);

    public final void g(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            Q42 q42 = new Q42(view);
            if (z2) {
                i(q42);
            } else {
                e(q42);
            }
            q42.c.add(this);
            h(q42);
            if (z2) {
                d(this.k, view, q42);
            } else {
                d(this.l, view, q42);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), z2);
            }
        }
    }

    public abstract void i(@NonNull Q42 q42);

    public final void j(ViewGroup viewGroup, boolean z2) {
        k(z2);
        ArrayList<Integer> arrayList = this.i;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.j;
        if (size <= 0 && arrayList2.size() <= 0) {
            g(viewGroup, z2);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(arrayList.get(i).intValue());
            if (viewFindViewById != null) {
                Q42 q42 = new Q42(viewFindViewById);
                if (z2) {
                    i(q42);
                } else {
                    e(q42);
                }
                q42.c.add(this);
                h(q42);
                if (z2) {
                    d(this.k, viewFindViewById, q42);
                } else {
                    d(this.l, viewFindViewById, q42);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = arrayList2.get(i2);
            Q42 q43 = new Q42(view);
            if (z2) {
                i(q43);
            } else {
                e(q43);
            }
            q43.c.add(this);
            h(q43);
            if (z2) {
                d(this.k, view, q43);
            } else {
                d(this.l, view, q43);
            }
        }
    }

    public final void k(boolean z2) {
        if (z2) {
            ((C8092zj) this.k.a).clear();
            ((SparseArray) this.k.b).clear();
            ((HT0) this.k.c).a();
        } else {
            ((C8092zj) this.l.a).clear();
            ((SparseArray) this.l.b).clear();
            ((HT0) this.l.c).a();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: l */
    public E42 clone() {
        try {
            E42 e42 = (E42) super.clone();
            e42.v = new ArrayList<>();
            e42.k = new RO();
            e42.l = new RO();
            e42.o = null;
            e42.p = null;
            return e42;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator m(@NonNull ViewGroup viewGroup, Q42 q42, Q42 q43) {
        return null;
    }

    public void n(ViewGroup viewGroup, RO ro, RO ro2, ArrayList<Q42> arrayList, ArrayList<Q42> arrayList2) {
        Animator animatorM;
        int i;
        int i2;
        View view;
        Q42 q42;
        Animator animator;
        C8092zj<Animator, b> c8092zjS = s();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Q42 q43 = arrayList.get(i3);
            Q42 q44 = arrayList2.get(i3);
            Q42 q45 = null;
            if (q43 != null && !q43.c.contains(this)) {
                q43 = null;
            }
            if (q44 != null && !q44.c.contains(this)) {
                q44 = null;
            }
            if (!(q43 == null && q44 == null) && ((q43 == null || q44 == null || w(q43, q44)) && (animatorM = m(viewGroup, q43, q44)) != null)) {
                String str = this.d;
                if (q44 != null) {
                    String[] strArrT = t();
                    view = q44.b;
                    if (strArrT == null || strArrT.length <= 0) {
                        i = size;
                        i2 = i3;
                        q42 = null;
                    } else {
                        q42 = new Q42(view);
                        Q42 q46 = (Q42) ((C8092zj) ro2.a).getOrDefault(view, null);
                        i = size;
                        if (q46 != null) {
                            int i4 = 0;
                            while (i4 < strArrT.length) {
                                HashMap map = q42.a;
                                int i5 = i3;
                                String str2 = strArrT[i4];
                                map.put(str2, q46.a.get(str2));
                                i4++;
                                i3 = i5;
                            }
                        }
                        i2 = i3;
                        int i6 = c8092zjS.g;
                        int i7 = 0;
                        while (true) {
                            if (i7 < i6) {
                                b orDefault = c8092zjS.getOrDefault(c8092zjS.i(i7), null);
                                if (orDefault.c != null && orDefault.a == view && orDefault.b.equals(str) && orDefault.c.equals(q42)) {
                                    animator = null;
                                    break;
                                }
                                i7++;
                            }
                        }
                        animatorM = animator;
                        q45 = q42;
                    }
                    animator = animatorM;
                    animatorM = animator;
                    q45 = q42;
                } else {
                    i = size;
                    i2 = i3;
                    view = q43.b;
                }
                if (animatorM != null) {
                    Pe2 pe2 = He2.a;
                    Ui2 ui2 = new Ui2(viewGroup);
                    b bVar = new b();
                    bVar.a = view;
                    bVar.b = str;
                    bVar.c = q45;
                    bVar.d = ui2;
                    bVar.e = this;
                    c8092zjS.put(animatorM, bVar);
                    this.v.add(animatorM);
                }
            } else {
                i = size;
                i2 = i3;
            }
            i3 = i2 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i8 = 0; i8 < sparseIntArray.size(); i8++) {
                Animator animator2 = this.v.get(sparseIntArray.keyAt(i8));
                animator2.setStartDelay(animator2.getStartDelay() + (((long) sparseIntArray.valueAt(i8)) - Long.MAX_VALUE));
            }
        }
    }

    public final void o() {
        int i = this.r - 1;
        this.r = i;
        if (i == 0) {
            ArrayList<d> arrayList = this.u;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.u.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((d) arrayList2.get(i2)).b(this);
                }
            }
            for (int i3 = 0; i3 < ((HT0) this.k.c).i(); i3++) {
                View view = (View) ((HT0) this.k.c).j(i3);
                if (view != null) {
                    WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                    view.setHasTransientState(false);
                }
            }
            for (int i4 = 0; i4 < ((HT0) this.l.c).i(); i4++) {
                View view2 = (View) ((HT0) this.l.c).j(i4);
                if (view2 != null) {
                    WeakHashMap<View, C5345me2> weakHashMap2 = Cd2.a;
                    view2.setHasTransientState(false);
                }
            }
            this.t = true;
        }
    }

    public void p(ConstraintLayout constraintLayout) {
        C8092zj<Animator, b> c8092zjS = s();
        int i = c8092zjS.g;
        if (i == 0) {
            return;
        }
        Pe2 pe2 = He2.a;
        WindowId windowId = constraintLayout.getWindowId();
        C8092zj c8092zj = new C8092zj(c8092zjS);
        c8092zjS.clear();
        for (int i2 = i - 1; i2 >= 0; i2--) {
            b bVar = (b) c8092zj.m(i2);
            if (bVar.a != null && bVar.d.a.equals(windowId)) {
                ((Animator) c8092zj.i(i2)).end();
            }
        }
    }

    public final Q42 r(View view, boolean z2) {
        M42 m42 = this.m;
        if (m42 != null) {
            return m42.r(view, z2);
        }
        ArrayList<Q42> arrayList = z2 ? this.o : this.p;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            Q42 q42 = arrayList.get(i);
            if (q42 == null) {
                return null;
            }
            if (q42.b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (z2 ? this.p : this.o).get(i);
        }
        return null;
    }

    public String[] t() {
        return null;
    }

    public final String toString() {
        return L("");
    }

    public final Q42 v(@NonNull View view, boolean z2) {
        M42 m42 = this.m;
        if (m42 != null) {
            return m42.v(view, z2);
        }
        return (Q42) ((C8092zj) (z2 ? this.k : this.l).a).getOrDefault(view, null);
    }

    public boolean w(Q42 q42, Q42 q43) {
        if (q42 != null && q43 != null) {
            String[] strArrT = t();
            HashMap map = q42.a;
            HashMap map2 = q43.a;
            if (strArrT != null) {
                for (String str : strArrT) {
                    Object obj = map.get(str);
                    Object obj2 = map2.get(str);
                    if ((obj == null && obj2 == null) ? false : (obj == null || obj2 == null) ? true : !obj.equals(obj2)) {
                        return true;
                    }
                }
            } else {
                for (String str2 : map.keySet()) {
                    Object obj3 = map.get(str2);
                    Object obj4 = map2.get(str2);
                    if ((obj3 == null && obj4 == null) ? false : (obj3 == null || obj4 == null) ? true : !obj3.equals(obj4)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean x(View view) {
        int id = view.getId();
        ArrayList<Integer> arrayList = this.i;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.j;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public void y(ViewGroup viewGroup) {
        if (this.t) {
            return;
        }
        C8092zj<Animator, b> c8092zjS = s();
        int i = c8092zjS.g;
        Pe2 pe2 = He2.a;
        WindowId windowId = viewGroup.getWindowId();
        for (int i2 = i - 1; i2 >= 0; i2--) {
            b bVarM = c8092zjS.m(i2);
            if (bVarM.a != null && bVarM.d.a.equals(windowId)) {
                c8092zjS.i(i2).pause();
            }
        }
        ArrayList<d> arrayList = this.u;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.u.clone();
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((d) arrayList2.get(i3)).a();
            }
        }
        this.s = true;
    }

    @NonNull
    public void z(@NonNull d dVar) {
        ArrayList<d> arrayList = this.u;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(dVar);
        if (this.u.size() == 0) {
            this.u = null;
        }
    }

    public void I() {
    }

    public void h(Q42 q42) {
    }
}
