package defpackage;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import androidx.annotation.NonNull;
import com.pexpress.tool.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class K42 {
    public static final C1697On a = new C1697On();
    public static final ThreadLocal<WeakReference<C8092zj<ViewGroup, ArrayList<E42>>>> b = new ThreadLocal<>();
    public static final ArrayList<ViewGroup> c = new ArrayList<>();

    public static void a(@NonNull ViewGroup viewGroup, E42 e42) {
        ArrayList<ViewGroup> arrayList = c;
        if (arrayList.contains(viewGroup)) {
            return;
        }
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        if (viewGroup.isLaidOut()) {
            arrayList.add(viewGroup);
            if (e42 == null) {
                e42 = a;
            }
            E42 e42Clone = e42.clone();
            ArrayList<E42> orDefault = b().getOrDefault(viewGroup, null);
            if (orDefault != null && orDefault.size() > 0) {
                Iterator<E42> it = orDefault.iterator();
                while (it.hasNext()) {
                    it.next().y(viewGroup);
                }
            }
            if (e42Clone != null) {
                e42Clone.j(viewGroup, true);
            }
            if (((C3948gD1) viewGroup.getTag(R.id.transition_current_scene)) != null) {
                throw null;
            }
            viewGroup.setTag(R.id.transition_current_scene, null);
            if (e42Clone != null) {
                a aVar = new a();
                aVar.d = e42Clone;
                aVar.e = viewGroup;
                viewGroup.addOnAttachStateChangeListener(aVar);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
            }
        }
    }

    public static C8092zj<ViewGroup, ArrayList<E42>> b() {
        C8092zj<ViewGroup, ArrayList<E42>> c8092zj;
        ThreadLocal<WeakReference<C8092zj<ViewGroup, ArrayList<E42>>>> threadLocal = b;
        WeakReference<C8092zj<ViewGroup, ArrayList<E42>>> weakReference = threadLocal.get();
        if (weakReference != null && (c8092zj = weakReference.get()) != null) {
            return c8092zj;
        }
        C8092zj<ViewGroup, ArrayList<E42>> c8092zj2 = new C8092zj<>();
        threadLocal.set(new WeakReference<>(c8092zj2));
        return c8092zj2;
    }

    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
        public E42 d;
        public ViewGroup e;

        /* JADX INFO: renamed from: K42$a$a, reason: collision with other inner class name */
        public class C0072a extends J42 {
            public final /* synthetic */ C8092zj d;

            public C0072a(C8092zj c8092zj) {
                this.d = c8092zj;
            }

            @Override // E42.d
            public final void b(@NonNull E42 e42) {
                ((ArrayList) this.d.getOrDefault(a.this.e, null)).remove(e42);
                e42.z(this);
            }
        }

        /* JADX WARN: Code duplicated, block: B:101:0x021f  */
        /* JADX WARN: Code duplicated, block: B:105:0x023d  */
        /* JADX WARN: Code duplicated, block: B:129:0x029d  */
        /* JADX WARN: Code duplicated, block: B:134:0x01e9 A[EDGE_INSN: B:134:0x01e9->B:89:0x01e9 BREAK  A[LOOP:1: B:19:0x0088->B:88:0x01df], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:14:0x004f  */
        /* JADX WARN: Code duplicated, block: B:167:0x0209 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:170:0x022a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:17:0x0059 A[LOOP:0: B:15:0x0053->B:17:0x0059, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:21:0x008d  */
        /* JADX WARN: Code duplicated, block: B:23:0x0091  */
        /* JADX WARN: Code duplicated, block: B:25:0x0094  */
        /* JADX WARN: Code duplicated, block: B:27:0x0097  */
        /* JADX WARN: Code duplicated, block: B:30:0x009e  */
        /* JADX WARN: Code duplicated, block: B:32:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:44:0x00f1  */
        /* JADX WARN: Code duplicated, block: B:46:0x00fa  */
        /* JADX WARN: Code duplicated, block: B:48:0x010b  */
        /* JADX WARN: Code duplicated, block: B:61:0x0153  */
        /* JADX WARN: Code duplicated, block: B:63:0x0162  */
        /* JADX WARN: Code duplicated, block: B:76:0x01a6  */
        /* JADX WARN: Code duplicated, block: B:78:0x01ae  */
        /* JADX WARN: Code duplicated, block: B:92:0x01f0  */
        /* JADX WARN: Code duplicated, block: B:94:0x01fe  */
        /* JADX WARN: Code duplicated, block: B:99:0x0211  */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            ArrayList arrayList;
            E42 e42;
            int i;
            RO ro;
            RO ro2;
            C8092zj c8092zj;
            C8092zj c8092zj2;
            int i2;
            int[] iArr;
            boolean z;
            int i3;
            int i4;
            C8092zj<Animator, E42.b> c8092zjS;
            int i5;
            Animator animatorI;
            E42.b orDefault;
            View view;
            Q42 q42;
            Q42 q43;
            int i6;
            boolean z2;
            int i7;
            View view2;
            Q42 q44;
            C8092zj c8092zj3;
            int i8;
            int i9;
            View view3;
            View view4;
            SparseArray sparseArray;
            int size;
            int i10;
            View view5;
            View view6;
            HT0 ht0;
            int i11;
            int i12;
            View view7;
            boolean z3;
            Iterator it;
            boolean z4 = true;
            ViewGroup viewGroup = this.e;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            ArrayList<ViewGroup> arrayList2 = K42.c;
            ViewGroup viewGroup2 = this.e;
            if (!arrayList2.remove(viewGroup2)) {
                return true;
            }
            C8092zj<ViewGroup, ArrayList<E42>> c8092zjB = K42.b();
            Long l = null;
            ArrayList<E42> orDefault2 = c8092zjB.getOrDefault(viewGroup2, null);
            if (orDefault2 != null) {
                arrayList = orDefault2.size() > 0 ? new ArrayList(orDefault2) : null;
                e42 = this.d;
                orDefault2.add(e42);
                e42.a(new C0072a(c8092zjB));
                i = 0;
                e42.j(viewGroup2, false);
                if (arrayList != null) {
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((E42) it.next()).B(viewGroup2);
                    }
                }
                e42.o = new ArrayList<>();
                e42.p = new ArrayList<>();
                ro = e42.k;
                ro2 = e42.l;
                c8092zj = new C8092zj((C8092zj) ro.a);
                c8092zj2 = new C8092zj((C8092zj) ro2.a);
                i2 = 0;
                while (true) {
                    iArr = e42.n;
                    if (i2 < iArr.length) {
                        break;
                    }
                    i6 = iArr[i2];
                    if (i6 != z4) {
                        z2 = z4;
                        for (i7 = c8092zj.g - 1; i7 >= 0; i7--) {
                            view2 = (View) c8092zj.i(i7);
                            if (view2 == null && e42.x(view2) && (q44 = (Q42) c8092zj2.remove(view2)) != null && e42.x(q44.b)) {
                                e42.o.add((Q42) c8092zj.k(i7));
                                e42.p.add(q44);
                            }
                        }
                    } else if (i6 != 2) {
                        z2 = z4;
                        c8092zj3 = (C8092zj) ro.d;
                        C8092zj c8092zj4 = (C8092zj) ro2.d;
                        i8 = c8092zj3.g;
                        for (i9 = 0; i9 < i8; i9++) {
                            view3 = (View) c8092zj3.m(i9);
                            if (view3 == null && e42.x(view3) && (view4 = (View) c8092zj4.getOrDefault(c8092zj3.i(i9), null)) != null && e42.x(view4)) {
                                Q42 q45 = (Q42) c8092zj.getOrDefault(view3, null);
                                Q42 q46 = (Q42) c8092zj2.getOrDefault(view4, null);
                                if (q45 != null && q46 != null) {
                                    e42.o.add(q45);
                                    e42.p.add(q46);
                                    c8092zj.remove(view3);
                                    c8092zj2.remove(view4);
                                }
                            }
                        }
                    } else if (i6 != 3) {
                        if (i6 == 4) {
                            ht0 = (HT0) ro.c;
                            i11 = ht0.i();
                            i12 = i;
                            while (i12 < i11) {
                                view7 = (View) ht0.j(i12);
                                if (view7 == null && e42.x(view7)) {
                                    z3 = z4;
                                    View view8 = (View) ((HT0) ro2.c).d(ht0.e(i12), l);
                                    if (view8 != null && e42.x(view8)) {
                                        Q42 q47 = (Q42) c8092zj.getOrDefault(view7, l);
                                        Q42 q48 = (Q42) c8092zj2.getOrDefault(view8, l);
                                        if (q47 != null && q48 != null) {
                                            e42.o.add(q47);
                                            e42.p.add(q48);
                                            c8092zj.remove(view7);
                                            c8092zj2.remove(view8);
                                        }
                                    }
                                } else {
                                    z3 = z4;
                                }
                                i12++;
                                z4 = z3;
                                l = null;
                            }
                        }
                        z2 = z4;
                    } else {
                        z2 = z4;
                        sparseArray = (SparseArray) ro.b;
                        SparseArray sparseArray2 = (SparseArray) ro2.b;
                        size = sparseArray.size();
                        for (i10 = 0; i10 < size; i10++) {
                            view5 = (View) sparseArray.valueAt(i10);
                            if (view5 == null && e42.x(view5) && (view6 = (View) sparseArray2.get(sparseArray.keyAt(i10))) != null && e42.x(view6)) {
                                Q42 q49 = (Q42) c8092zj.getOrDefault(view5, null);
                                Q42 q410 = (Q42) c8092zj2.getOrDefault(view6, null);
                                if (q49 != null && q410 != null) {
                                    e42.o.add(q49);
                                    e42.p.add(q410);
                                    c8092zj.remove(view5);
                                    c8092zj2.remove(view6);
                                }
                            }
                        }
                    }
                    i2++;
                    z4 = z2;
                    i = 0;
                    l = null;
                }
                z = z4;
                for (i3 = 0; i3 < c8092zj.g; i3++) {
                    q43 = (Q42) c8092zj.m(i3);
                    if (e42.x(q43.b)) {
                        e42.o.add(q43);
                        e42.p.add(null);
                    }
                }
                for (i4 = 0; i4 < c8092zj2.g; i4++) {
                    q42 = (Q42) c8092zj2.m(i4);
                    if (e42.x(q42.b)) {
                        e42.p.add(q42);
                        e42.o.add(null);
                    }
                }
                c8092zjS = E42.s();
                int i13 = c8092zjS.g;
                Pe2 pe2 = He2.a;
                WindowId windowId = viewGroup2.getWindowId();
                i5 = i13 - 1;
                while (i5 >= 0) {
                    animatorI = c8092zjS.i(i5);
                    if (animatorI == null && (orDefault = c8092zjS.getOrDefault(animatorI, null)) != null && (view = orDefault.a) != null && orDefault.d.a.equals(windowId)) {
                        boolean z5 = z;
                        Q42 q42V = e42.v(view, z5);
                        Q42 q42R = e42.r(view, z5);
                        if (q42V == null && q42R == null) {
                            q42R = (Q42) ((C8092zj) e42.l.a).getOrDefault(view, null);
                        }
                        if ((q42V != null || q42R != null) && orDefault.e.w(orDefault.c, q42R)) {
                            if (animatorI.isRunning() || animatorI.isStarted()) {
                                animatorI.cancel();
                            } else {
                                c8092zjS.remove(animatorI);
                            }
                        }
                    }
                    i5--;
                    z = true;
                }
                e42.n(viewGroup2, e42.k, e42.l, e42.o, e42.p);
                e42.C();
                return true;
            }
            orDefault2 = new ArrayList<>();
            c8092zjB.put(viewGroup2, orDefault2);
            e42 = this.d;
            orDefault2.add(e42);
            e42.a(new C0072a(c8092zjB));
            i = 0;
            e42.j(viewGroup2, false);
            if (arrayList != null) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    ((E42) it.next()).B(viewGroup2);
                }
            }
            e42.o = new ArrayList<>();
            e42.p = new ArrayList<>();
            ro = e42.k;
            ro2 = e42.l;
            c8092zj = new C8092zj((C8092zj) ro.a);
            c8092zj2 = new C8092zj((C8092zj) ro2.a);
            i2 = 0;
            while (true) {
                iArr = e42.n;
                if (i2 < iArr.length) {
                    break;
                    break;
                }
                i6 = iArr[i2];
                if (i6 != z4) {
                    z2 = z4;
                    while (i7 >= 0) {
                        view2 = (View) c8092zj.i(i7);
                        if (view2 == null) {
                        }
                    }
                } else if (i6 != 2) {
                    z2 = z4;
                    c8092zj3 = (C8092zj) ro.d;
                    C8092zj c8092zj5 = (C8092zj) ro2.d;
                    i8 = c8092zj3.g;
                    while (i9 < i8) {
                        view3 = (View) c8092zj3.m(i9);
                        if (view3 == null) {
                        }
                    }
                } else if (i6 != 3) {
                    if (i6 == 4) {
                        ht0 = (HT0) ro.c;
                        i11 = ht0.i();
                        i12 = i;
                        while (i12 < i11) {
                            view7 = (View) ht0.j(i12);
                            if (view7 == null) {
                                z3 = z4;
                            } else {
                                z3 = z4;
                            }
                            i12++;
                            z4 = z3;
                            l = null;
                        }
                    }
                    z2 = z4;
                } else {
                    z2 = z4;
                    sparseArray = (SparseArray) ro.b;
                    SparseArray sparseArray3 = (SparseArray) ro2.b;
                    size = sparseArray.size();
                    while (i10 < size) {
                        view5 = (View) sparseArray.valueAt(i10);
                        if (view5 == null) {
                        }
                    }
                }
                i2++;
                z4 = z2;
                i = 0;
                l = null;
            }
            z = z4;
            while (i3 < c8092zj.g) {
                q43 = (Q42) c8092zj.m(i3);
                if (e42.x(q43.b)) {
                    e42.o.add(q43);
                    e42.p.add(null);
                }
            }
            while (i4 < c8092zj2.g) {
                q42 = (Q42) c8092zj2.m(i4);
                if (e42.x(q42.b)) {
                    e42.p.add(q42);
                    e42.o.add(null);
                }
            }
            c8092zjS = E42.s();
            int i14 = c8092zjS.g;
            Pe2 pe3 = He2.a;
            WindowId windowId2 = viewGroup2.getWindowId();
            i5 = i14 - 1;
            while (i5 >= 0) {
                animatorI = c8092zjS.i(i5);
                if (animatorI == null) {
                }
                i5--;
                z = true;
            }
            e42.n(viewGroup2, e42.k, e42.l, e42.o, e42.p);
            e42.C();
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewGroup viewGroup = this.e;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            ArrayList<ViewGroup> arrayList = K42.c;
            ViewGroup viewGroup2 = this.e;
            arrayList.remove(viewGroup2);
            ArrayList<E42> orDefault = K42.b().getOrDefault(viewGroup2, null);
            if (orDefault != null && orDefault.size() > 0) {
                Iterator<E42> it = orDefault.iterator();
                while (it.hasNext()) {
                    it.next().B(viewGroup2);
                }
            }
            this.d.k(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }
}
