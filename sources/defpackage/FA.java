package defpackage;

import defpackage.InterfaceC6653ss0;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class FA<T extends InterfaceC6653ss0<? extends C3506e70>> {
    public float a = -3.4028235E38f;
    public float b = Float.MAX_VALUE;
    public float c = -3.4028235E38f;
    public float d = Float.MAX_VALUE;
    public float e = -3.4028235E38f;
    public float f = Float.MAX_VALUE;
    public float g = -3.4028235E38f;
    public float h = Float.MAX_VALUE;
    public final ArrayList i = new ArrayList();

    public final void a(YP0 yp0) {
        if (yp0 == null) {
            return;
        }
        c(yp0);
        this.i.add(yp0);
    }

    public void b() {
        Kl2.a aVar;
        InterfaceC6653ss0 interfaceC6653ss0;
        InterfaceC6653ss0 interfaceC6653ss1;
        Kl2.a aVar2;
        ArrayList<InterfaceC6653ss0> arrayList = this.i;
        if (arrayList == null) {
            return;
        }
        this.a = -3.4028235E38f;
        this.b = Float.MAX_VALUE;
        this.c = -3.4028235E38f;
        this.d = Float.MAX_VALUE;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c((InterfaceC6653ss0) it.next());
        }
        this.e = -3.4028235E38f;
        this.f = Float.MAX_VALUE;
        this.g = -3.4028235E38f;
        this.h = Float.MAX_VALUE;
        Iterator it2 = arrayList.iterator();
        do {
            boolean zHasNext = it2.hasNext();
            aVar = Kl2.a.d;
            interfaceC6653ss0 = null;
            if (!zHasNext) {
                interfaceC6653ss1 = null;
                break;
            }
            interfaceC6653ss1 = (InterfaceC6653ss0) it2.next();
        } while (interfaceC6653ss1.S() != aVar);
        if (interfaceC6653ss1 != null) {
            this.e = interfaceC6653ss1.g();
            this.f = interfaceC6653ss1.o();
            for (InterfaceC6653ss0 interfaceC6653ss2 : arrayList) {
                if (interfaceC6653ss2.S() == aVar) {
                    if (interfaceC6653ss2.o() < this.f) {
                        this.f = interfaceC6653ss2.o();
                    }
                    if (interfaceC6653ss2.g() > this.e) {
                        this.e = interfaceC6653ss2.g();
                    }
                }
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            boolean zHasNext2 = it3.hasNext();
            aVar2 = Kl2.a.e;
            if (!zHasNext2) {
                break;
            }
            InterfaceC6653ss0 interfaceC6653ss3 = (InterfaceC6653ss0) it3.next();
            if (interfaceC6653ss3.S() == aVar2) {
                interfaceC6653ss0 = interfaceC6653ss3;
                break;
            }
        }
        if (interfaceC6653ss0 != null) {
            this.g = interfaceC6653ss0.g();
            this.h = interfaceC6653ss0.o();
            for (InterfaceC6653ss0 interfaceC6653ss4 : arrayList) {
                if (interfaceC6653ss4.S() == aVar2) {
                    if (interfaceC6653ss4.o() < this.h) {
                        this.h = interfaceC6653ss4.o();
                    }
                    if (interfaceC6653ss4.g() > this.g) {
                        this.g = interfaceC6653ss4.g();
                    }
                }
            }
        }
    }

    public final void c(T t) {
        if (this.a < t.g()) {
            this.a = t.g();
        }
        if (this.b > t.o()) {
            this.b = t.o();
        }
        if (this.c < t.L()) {
            this.c = t.L();
        }
        if (this.d > t.e()) {
            this.d = t.e();
        }
        if (t.S() == Kl2.a.d) {
            if (this.e < t.g()) {
                this.e = t.g();
            }
            if (this.f > t.o()) {
                this.f = t.o();
                return;
            }
            return;
        }
        if (this.g < t.g()) {
            this.g = t.g();
        }
        if (this.h > t.o()) {
            this.h = t.o();
        }
    }

    public void d(float f, float f2) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((InterfaceC6653ss0) it.next()).J(f, f2);
        }
        b();
    }

    public final T e(int i) {
        ArrayList arrayList = this.i;
        if (arrayList == null || i < 0 || i >= arrayList.size()) {
            return null;
        }
        return (T) arrayList.get(i);
    }

    public final InterfaceC6653ss0 f(String str) {
        ArrayList arrayList = this.i;
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                i = -1;
                break;
            }
            if (str.equals(((InterfaceC6653ss0) arrayList.get(i)).a())) {
                break;
            }
            i++;
        }
        if (i < 0 || i >= arrayList.size()) {
            return null;
        }
        return (InterfaceC6653ss0) arrayList.get(i);
    }

    public final int g() {
        ArrayList arrayList = this.i;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final int h() {
        Iterator it = this.i.iterator();
        int iT = 0;
        while (it.hasNext()) {
            iT += ((InterfaceC6653ss0) it.next()).T();
        }
        return iT;
    }

    public final C3506e70 i(C7482wo0 c7482wo0) {
        int i = c7482wo0.f;
        ArrayList arrayList = this.i;
        if (i >= arrayList.size()) {
            return null;
        }
        return ((InterfaceC6653ss0) arrayList.get(c7482wo0.f)).i(c7482wo0.a, c7482wo0.b);
    }

    public final float j(Kl2.a aVar) {
        if (aVar == Kl2.a.d) {
            float f = this.e;
            return f == -3.4028235E38f ? this.g : f;
        }
        float f2 = this.g;
        return f2 == -3.4028235E38f ? this.e : f2;
    }

    public final float k(Kl2.a aVar) {
        if (aVar == Kl2.a.d) {
            float f = this.f;
            return f == Float.MAX_VALUE ? this.h : f;
        }
        float f2 = this.h;
        return f2 == Float.MAX_VALUE ? this.f : f2;
    }
}
