package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class BS0 implements FS0, InterfaceC8088zi<InterfaceC6237qt0>, Serializable {
    public final String d;
    public transient C5714oP0 e;
    public transient int g;
    public final transient BS0 h;
    public transient CopyOnWriteArrayList i;
    public transient C0588Ai<InterfaceC6237qt0> j;
    public transient boolean k = true;
    public final transient HS0 l;

    public BS0(String str, BS0 bs0, HS0 hs0) {
        this.d = str;
        this.h = bs0;
        this.l = hs0;
    }

    @Override // defpackage.FS0
    public final void a() {
        e(C5714oP0.i, "Blocking network thread detected. \nIt can possible lead to a performance decline or even a deadlock.\nPlease make sure you're using blocking IO primitives like InputStream and OutputStream only in \nthe context of Dispatchers.IO:\n```\nwithContext(Dispatchers.IO) {\n    myInputStream.read()\n}\n```");
    }

    @Override // defpackage.InterfaceC8088zi
    public final synchronized void b(InterfaceC7668xi<InterfaceC6237qt0> interfaceC7668xi) {
        try {
            if (this.j == null) {
                this.j = new C0588Ai<>();
            }
            this.j.b(interfaceC7668xi);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.FS0
    public final void c(String str) {
        e(C5714oP0.l, str);
    }

    public final BS0 d(String str) {
        String str2 = this.d;
        int length = str2.length() + 1;
        int iIndexOf = str.indexOf(46, length);
        int iIndexOf2 = str.indexOf(36, length);
        if (iIndexOf == -1 && iIndexOf2 == -1) {
            iIndexOf = -1;
        } else if (iIndexOf == -1 || (iIndexOf2 != -1 && iIndexOf >= iIndexOf2)) {
            iIndexOf = iIndexOf2;
        }
        if (iIndexOf != -1) {
            StringBuilder sbA = C5896pG.a("For logger [", str2, "] child name [", str, " passed as parameter, may not include '.' after index");
            sbA.append(str2.length() + 1);
            throw new IllegalArgumentException(sbA.toString());
        }
        if (this.i == null) {
            this.i = new CopyOnWriteArrayList();
        }
        BS0 bs0 = new BS0(str, this, this.l);
        this.i.add(bs0);
        bs0.g = this.g;
        return bs0;
    }

    public final void e(C5714oP0 c5714oP0, String str) {
        EnumC6808td0 enumC6808td0Q;
        int i;
        HS0 hs0 = this.l;
        C7120v52 c7120v52 = hs0.t;
        int size = c7120v52.size();
        EnumC6808td0 enumC6808td0 = EnumC6808td0.e;
        EnumC6808td0 enumC6808td1 = EnumC6808td0.d;
        if (size == 0) {
            enumC6808td0Q = enumC6808td0;
        } else if (c7120v52.size() == 1) {
            try {
                enumC6808td0Q = c7120v52.get(0).q();
            } catch (IndexOutOfBoundsException unused) {
                enumC6808td0Q = enumC6808td0;
            }
        } else {
            Object[] array = c7120v52.toArray();
            int length = array.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    enumC6808td0Q = enumC6808td0;
                } else {
                    EnumC6808td0 enumC6808td0Q2 = ((AbstractC6910u52) array[i2]).q();
                    if (enumC6808td0Q2 == enumC6808td1 || enumC6808td0Q2 == EnumC6808td0.g) {
                        enumC6808td0Q = enumC6808td0Q2;
                    } else {
                        i2++;
                    }
                }
            }
        }
        if (enumC6808td0Q == enumC6808td0) {
            if (this.g > c5714oP0.d) {
                return;
            }
        } else if (enumC6808td0Q == enumC6808td1) {
            return;
        }
        QS0 qs0 = new QS0();
        String str2 = this.d;
        qs0.e = str2;
        qs0.g = hs0;
        qs0.h = hs0.s;
        qs0.i = c5714oP0;
        qs0.j = str;
        qs0.l = null;
        qs0.o = System.currentTimeMillis();
        int i3 = 0;
        for (BS0 bs0 = this; bs0 != null; bs0 = bs0.h) {
            C0588Ai<InterfaceC6237qt0> c0588Ai = bs0.j;
            if (c0588Ai != null) {
                C3049bx<InterfaceC7668xi<InterfaceC6237qt0>> c3049bx = c0588Ai.d;
                c3049bx.b();
                i = 0;
                for (InterfaceC7668xi<InterfaceC6237qt0> interfaceC7668xi : c3049bx.g) {
                    interfaceC7668xi.f(qs0);
                    i++;
                }
            } else {
                i = 0;
            }
            i3 += i;
            if (!bs0.k) {
                break;
            }
        }
        if (i3 == 0) {
            int i4 = hs0.p;
            hs0.p = i4 + 1;
            if (i4 == 0) {
                hs0.g.a(new Ff2("No appenders present in context [" + hs0.e + "] for logger [" + str2 + "].", this));
            }
        }
    }

    public final synchronized void f(int i) {
        if (this.e == null) {
            this.g = i;
            CopyOnWriteArrayList copyOnWriteArrayList = this.i;
            if (copyOnWriteArrayList != null) {
                int size = copyOnWriteArrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((BS0) this.i.get(i2)).f(i);
                }
            }
        }
    }

    public final void g() {
        C0588Ai<InterfaceC6237qt0> c0588Ai = this.j;
        if (c0588Ai != null) {
            C3049bx<InterfaceC7668xi<InterfaceC6237qt0>> c3049bx = c0588Ai.d;
            Iterator<InterfaceC7668xi<InterfaceC6237qt0>> it = c3049bx.e.iterator();
            while (it.hasNext()) {
                it.next().stop();
            }
            c3049bx.clear();
        }
        this.g = 10000;
        if (this.h == null) {
            this.e = C5714oP0.k;
        } else {
            this.e = null;
        }
        this.k = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.i;
        if (copyOnWriteArrayList == null) {
            return;
        }
        Iterator it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            ((BS0) it2.next()).g();
        }
    }

    @Override // defpackage.FS0
    public final String getName() {
        return this.d;
    }

    public final synchronized void h(C5714oP0 c5714oP0) {
        try {
            if (this.e == c5714oP0) {
                return;
            }
            if (c5714oP0 == null) {
                if (this.h == null) {
                    throw new IllegalArgumentException("The level of the root logger cannot be set to null");
                }
            }
            this.e = c5714oP0;
            if (c5714oP0 == null) {
                BS0 bs0 = this.h;
                this.g = bs0.g;
                int i = bs0.g;
                if (i == Integer.MIN_VALUE || i == 5000 || i == 10000 || i == 20000 || i != 30000) {
                }
            } else {
                this.g = c5714oP0.d;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.i;
            if (copyOnWriteArrayList != null) {
                int size = copyOnWriteArrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((BS0) this.i.get(i2)).f(this.g);
                }
            }
            Iterator it = this.l.q.iterator();
            while (it.hasNext()) {
                ((IS0) it.next()).getClass();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final String toString() {
        return C5807oq.b(new StringBuilder("Logger["), this.d, "]");
    }
}
