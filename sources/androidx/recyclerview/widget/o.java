package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o extends G {
    public static TimeInterpolator s;
    public ArrayList<RecyclerView.C> h;
    public ArrayList<RecyclerView.C> i;
    public ArrayList<b> j;
    public ArrayList<a> k;
    public ArrayList<ArrayList<RecyclerView.C>> l;
    public ArrayList<ArrayList<b>> m;
    public ArrayList<ArrayList<a>> n;
    public ArrayList<RecyclerView.C> o;
    public ArrayList<RecyclerView.C> p;
    public ArrayList<RecyclerView.C> q;
    public ArrayList<RecyclerView.C> r;

    public static class a {
        public RecyclerView.C a;
        public RecyclerView.C b;
        public int c;
        public int d;
        public int e;
        public int f;

        @SuppressLint({"UnknownNullness"})
        public final String toString() {
            return "ChangeInfo{oldHolder=" + this.a + ", newHolder=" + this.b + ", fromX=" + this.c + ", fromY=" + this.d + ", toX=" + this.e + ", toY=" + this.f + '}';
        }
    }

    public static class b {
        public RecyclerView.C a;
        public int b;
        public int c;
        public int d;
        public int e;
    }

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((RecyclerView.C) arrayList.get(size)).a.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    @SuppressLint({"UnknownNullness"})
    public final void d(RecyclerView.C c) {
        View view = c.a;
        view.animate().cancel();
        ArrayList<b> arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (arrayList.get(size).a == c) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(c);
                arrayList.remove(size);
            }
        }
        j(this.k, c);
        if (this.h.remove(c)) {
            view.setAlpha(1.0f);
            c(c);
        }
        if (this.i.remove(c)) {
            view.setAlpha(1.0f);
            c(c);
        }
        ArrayList<ArrayList<a>> arrayList2 = this.n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList<a> arrayList3 = arrayList2.get(size2);
            j(arrayList3, c);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList<ArrayList<b>> arrayList4 = this.m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList<b> arrayList5 = arrayList4.get(size3);
            for (int size4 = arrayList5.size() - 1; size4 >= 0; size4--) {
                if (arrayList5.get(size4).a == c) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(c);
                    arrayList5.remove(size4);
                    if (!arrayList5.isEmpty()) {
                        break;
                    }
                    arrayList4.remove(size3);
                    break;
                }
            }
        }
        ArrayList<ArrayList<RecyclerView.C>> arrayList6 = this.l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.C> arrayList7 = arrayList6.get(size5);
            if (arrayList7.remove(c)) {
                view.setAlpha(1.0f);
                c(c);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.q.remove(c);
        this.o.remove(c);
        this.r.remove(c);
        this.p.remove(c);
        i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final void e() {
        ArrayList<b> arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            b bVar = arrayList.get(size);
            View view = bVar.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(bVar.a);
            arrayList.remove(size);
        }
        ArrayList<RecyclerView.C> arrayList2 = this.h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c(arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList<RecyclerView.C> arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.C c = arrayList3.get(size3);
            c.a.setAlpha(1.0f);
            c(c);
            arrayList3.remove(size3);
        }
        ArrayList<a> arrayList4 = this.k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            a aVar = arrayList4.get(size4);
            RecyclerView.C c2 = aVar.a;
            if (c2 != null) {
                k(aVar, c2);
            }
            RecyclerView.C c3 = aVar.b;
            if (c3 != null) {
                k(aVar, c3);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList<ArrayList<b>> arrayList5 = this.m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList<b> arrayList6 = arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    b bVar2 = arrayList6.get(size6);
                    View view2 = bVar2.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(bVar2.a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList<ArrayList<RecyclerView.C>> arrayList7 = this.l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.C> arrayList8 = arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.C c4 = arrayList8.get(size8);
                    c4.a.setAlpha(1.0f);
                    c(c4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList<ArrayList<a>> arrayList9 = this.n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList<a> arrayList10 = arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    a aVar2 = arrayList10.get(size10);
                    RecyclerView.C c5 = aVar2.a;
                    if (c5 != null) {
                        k(aVar2, c5);
                    }
                    RecyclerView.C c6 = aVar2.b;
                    if (c6 != null) {
                        k(aVar2, c6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.q);
            h(this.p);
            h(this.o);
            h(this.r);
            ArrayList<RecyclerView.j.a> arrayList11 = this.b;
            int size11 = arrayList11.size();
            for (int i = 0; i < size11; i++) {
                arrayList11.get(i).a();
            }
            arrayList11.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final boolean f() {
        return (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.G
    @SuppressLint({"UnknownNullness"})
    public final boolean g(RecyclerView.C c, int i, int i2, int i3, int i4) {
        View view = c.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) c.a.getTranslationY());
        l(c);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            c(c);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList<b> arrayList = this.j;
        b bVar = new b();
        bVar.a = c;
        bVar.b = translationX;
        bVar.c = translationY;
        bVar.d = i3;
        bVar.e = i4;
        arrayList.add(bVar);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList<RecyclerView.j.a> arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).a();
        }
        arrayList.clear();
    }

    public final void j(ArrayList arrayList, RecyclerView.C c) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            if (k(aVar, c) && aVar.a == null && aVar.b == null) {
                arrayList.remove(aVar);
            }
        }
    }

    public final boolean k(a aVar, RecyclerView.C c) {
        if (aVar.b == c) {
            aVar.b = null;
        } else {
            if (aVar.a != c) {
                return false;
            }
            aVar.a = null;
        }
        c.a.setAlpha(1.0f);
        View view = c.a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c(c);
        return true;
    }

    public final void l(RecyclerView.C c) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        c.a.animate().setInterpolator(s);
        d(c);
    }
}
