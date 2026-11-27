package defpackage;

import androidx.annotation.NonNull;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: gt1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4087gt1 implements InterfaceC6981uS, InterfaceC6771tS.a<Object> {
    public final RunnableC6777tU d;
    public final C6567sU<?> e;
    public int g;
    public int h = -1;
    public InterfaceC3129cK0 i;
    public List<I01<File, ?>> j;
    public int k;
    public volatile I01.a<?> l;
    public File m;
    public C4297ht1 n;

    public C4087gt1(C6567sU c6567sU, RunnableC6777tU runnableC6777tU) {
        this.e = c6567sU;
        this.d = runnableC6777tU;
    }

    @Override // defpackage.InterfaceC6981uS
    public final boolean a() {
        List list;
        ArrayList arrayListC;
        ArrayList arrayListA = this.e.a();
        boolean z = false;
        if (!arrayListA.isEmpty()) {
            C6567sU<?> c6567sU = this.e;
            C2596Zq1 c2596Zq1A = c6567sU.c.a();
            Class<?> cls = c6567sU.d.getClass();
            Class<?> cls2 = c6567sU.g;
            Class<?> cls3 = c6567sU.k;
            C8047zX c8047zX = c2596Zq1A.h;
            G11 g11 = (G11) ((AtomicReference) c8047zX.a).getAndSet(null);
            if (g11 == null) {
                g11 = new G11(cls, cls2, cls3);
            } else {
                g11.a = cls;
                g11.b = cls2;
                g11.c = cls3;
            }
            synchronized (((C8092zj) c8047zX.b)) {
                list = (List) ((C8092zj) c8047zX.b).getOrDefault(g11, null);
            }
            ((AtomicReference) c8047zX.a).set(g11);
            List list2 = list;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                K01 k01 = c2596Zq1A.a;
                synchronized (k01) {
                    arrayListC = k01.a.c(cls);
                }
                Iterator it = arrayListC.iterator();
                while (it.hasNext()) {
                    for (Class cls4 : c2596Zq1A.c.b((Class) it.next(), cls2)) {
                        if (!c2596Zq1A.f.a(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                            arrayList.add(cls4);
                        }
                    }
                }
                C8047zX c8047zX2 = c2596Zq1A.h;
                List listUnmodifiableList = Collections.unmodifiableList(arrayList);
                synchronized (((C8092zj) c8047zX2.b)) {
                    ((C8092zj) c8047zX2.b).put(new G11(cls, cls2, cls3), listUnmodifiableList);
                }
                list2 = arrayList;
            }
            if (!list2.isEmpty()) {
                while (true) {
                    List<I01<File, ?>> list3 = this.j;
                    if (list3 != null && this.k < list3.size()) {
                        this.l = null;
                        while (!z && this.k < this.j.size()) {
                            List<I01<File, ?>> list4 = this.j;
                            int i = this.k;
                            this.k = i + 1;
                            I01<File, ?> i01 = list4.get(i);
                            File file = this.m;
                            C6567sU<?> c6567sU2 = this.e;
                            this.l = i01.b(file, c6567sU2.e, c6567sU2.f, c6567sU2.i);
                            if (this.l != null && this.e.c(this.l.c.a()) != null) {
                                this.l.c.c(this.e.o, this);
                                z = true;
                            }
                        }
                        return z;
                    }
                    int i2 = this.h + 1;
                    this.h = i2;
                    if (i2 >= list2.size()) {
                        int i3 = this.g + 1;
                        this.g = i3;
                        if (i3 >= arrayListA.size()) {
                            break;
                        }
                        this.h = 0;
                    }
                    InterfaceC3129cK0 interfaceC3129cK0 = (InterfaceC3129cK0) arrayListA.get(this.g);
                    Class cls5 = (Class) list2.get(this.h);
                    InterfaceC6486s42<Z> interfaceC6486s42E = this.e.e(cls5);
                    C6567sU<?> c6567sU3 = this.e;
                    this.n = new C4297ht1(c6567sU3.c.a, interfaceC3129cK0, c6567sU3.n, c6567sU3.e, c6567sU3.f, interfaceC6486s42E, cls5, c6567sU3.i);
                    File fileA = c6567sU3.h.a().a(this.n);
                    this.m = fileA;
                    if (fileA != null) {
                        this.i = interfaceC3129cK0;
                        this.j = this.e.c.a().f(fileA);
                        this.k = 0;
                    }
                }
            } else if (!File.class.equals(this.e.k)) {
                throw new IllegalStateException("Failed to find any load path from " + this.e.d.getClass() + " to " + this.e.k);
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC6981uS
    public final void cancel() {
        I01.a<?> aVar = this.l;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    @Override // defpackage.InterfaceC6771tS.a
    public final void d(@NonNull Exception exc) {
        this.d.e(this.n, exc, this.l.c, CS.h);
    }

    @Override // defpackage.InterfaceC6771tS.a
    public final void f(Object obj) {
        this.d.b(this.i, obj, this.l.c, CS.h, this.n);
    }
}
