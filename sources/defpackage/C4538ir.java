package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ir, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4538ir {
    public final ArrayList a = new ArrayList();
    public final YR<XP1> b;
    public final C7279vr c;
    public int d;
    public final ArrayList e;
    public final C7279vr f;

    /* JADX WARN: Type inference failed for: r1v1, types: [E[], java.lang.Object[]] */
    public C4538ir() {
        YR<XP1> yr = new YR<>();
        yr.a = new Object[150];
        yr.b = 0;
        yr.c = 0;
        yr.d = 0;
        this.b = yr;
        this.c = new C7279vr();
        this.d = 0;
        this.e = new ArrayList();
        this.f = new C7279vr();
    }

    public final void a(YP1 yp1) {
        synchronized (this.f) {
            try {
                Iterator it = this.e.iterator();
                while (it.hasNext()) {
                    ((InterfaceC2939bQ1) it.next()).i(yp1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i = yp1.a;
        if (i > this.d) {
            this.d = i;
        }
        synchronized (this.c) {
            try {
                if (this.a.size() < 150) {
                    this.a.add(yp1);
                } else {
                    YR<XP1> yr = this.b;
                    XP1[] xp1Arr = yr.a;
                    int i2 = yr.c;
                    xp1Arr[i2] = yp1;
                    int i3 = i2 + 1;
                    yr.c = i3;
                    if (i3 == 150) {
                        yr.c = 0;
                    }
                    int i4 = yr.d;
                    if (i4 < 150) {
                        yr.d = i4 + 1;
                    } else {
                        int i5 = yr.b + 1;
                        yr.b = i5;
                        if (i5 == 150) {
                            yr.b = 0;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b(InterfaceC2939bQ1 interfaceC2939bQ1) {
        synchronized (this.f) {
            try {
                if (interfaceC2939bQ1 instanceof V81) {
                    ArrayList arrayList = this.e;
                    Class<?> cls = interfaceC2939bQ1.getClass();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((InterfaceC2939bQ1) it.next()).getClass() == cls) {
                            return false;
                        }
                    }
                }
                this.e.add(interfaceC2939bQ1);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ArrayList c() {
        ArrayList arrayList;
        synchronized (this.c) {
            arrayList = new ArrayList(this.a);
            YR<XP1> yr = this.b;
            yr.getClass();
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            while (true) {
                int i2 = yr.d;
                if (i < i2) {
                    arrayList2.add((i < 0 || i >= i2) ? null : yr.a[(yr.b + i) % 150]);
                    i++;
                } else {
                    arrayList.addAll(arrayList2);
                }
            }
        }
        return arrayList;
    }
}
