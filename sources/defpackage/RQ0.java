package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class RQ0 {
    public final Rf2 a;
    public final ArrayList b = new ArrayList();
    public boolean c = true;
    public ArrayList d;

    public RQ0(Rf2 rf2) {
        this.a = rf2;
    }

    public final void a(InterfaceC7873yg2 interfaceC7873yg2, Throwable th) {
        try {
            interfaceC7873yg2.getClass();
        } catch (Throwable unused) {
        }
    }

    public final void b(C6193qg2 c6193qg2) {
        for (InterfaceC7873yg2 interfaceC7873yg2 : (ArrayList) g()) {
            try {
                interfaceC7873yg2.b(c6193qg2);
            } catch (Throwable th) {
                a(interfaceC7873yg2, th);
            }
        }
    }

    public final void c(C6193qg2 c6193qg2, C6822tg2 c6822tg2) {
        for (InterfaceC7873yg2 interfaceC7873yg2 : (ArrayList) g()) {
            try {
                interfaceC7873yg2.getClass();
            } catch (Throwable th) {
                a(interfaceC7873yg2, th);
            }
        }
    }

    public final void d(EnumC5357mh2 enumC5357mh2) {
        for (InterfaceC7873yg2 interfaceC7873yg2 : (ArrayList) g()) {
            try {
                interfaceC7873yg2.getClass();
            } catch (Throwable th) {
                a(interfaceC7873yg2, th);
            }
        }
    }

    public final void e(KY1 ky1, AbstractC5567nh2 abstractC5567nh2) {
        for (InterfaceC7873yg2 interfaceC7873yg2 : (ArrayList) g()) {
            try {
                interfaceC7873yg2.getClass();
            } catch (Throwable th) {
                a(interfaceC7873yg2, th);
            }
        }
    }

    public final void f(C6193qg2 c6193qg2) {
        for (InterfaceC7873yg2 interfaceC7873yg2 : (ArrayList) g()) {
            try {
                interfaceC7873yg2.getClass();
            } catch (Throwable th) {
                a(interfaceC7873yg2, th);
            }
        }
    }

    public final List<InterfaceC7873yg2> g() {
        synchronized (this.b) {
            try {
                if (!this.c) {
                    return this.d;
                }
                ArrayList arrayList = new ArrayList(this.b.size());
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    arrayList.add((InterfaceC7873yg2) it.next());
                }
                this.d = arrayList;
                this.c = false;
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
