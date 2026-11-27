package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes3.dex */
public final class DQ0 implements InterfaceC7316w20, InterfaceC7737y20 {
    public LinkedList d;
    public volatile boolean e;

    @Override // defpackage.InterfaceC7737y20
    public final boolean a(InterfaceC7316w20 interfaceC7316w20) {
        if (this.e) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.e) {
                    return false;
                }
                LinkedList linkedList = this.d;
                if (linkedList != null && linkedList.remove(interfaceC7316w20)) {
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC7316w20
    public final void b() {
        if (this.e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.e) {
                    return;
                }
                this.e = true;
                LinkedList linkedList = this.d;
                ArrayList arrayList = null;
                this.d = null;
                if (linkedList == null) {
                    return;
                }
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    try {
                        ((InterfaceC7316w20) it.next()).b();
                    } catch (Throwable th) {
                        C4994l.j(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
                if (arrayList != null) {
                    if (arrayList.size() != 1) {
                        throw new HH(arrayList);
                    }
                    throw C90.a((Throwable) arrayList.get(0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.InterfaceC7737y20
    public final boolean c(InterfaceC7316w20 interfaceC7316w20) {
        if (!this.e) {
            synchronized (this) {
                try {
                    if (!this.e) {
                        LinkedList linkedList = this.d;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.d = linkedList;
                        }
                        linkedList.add(interfaceC7316w20);
                        return true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        interfaceC7316w20.b();
        return false;
    }

    @Override // defpackage.InterfaceC7737y20
    public final boolean d(InterfaceC7316w20 interfaceC7316w20) {
        if (!a(interfaceC7316w20)) {
            return false;
        }
        ((RunnableC4368iD1) interfaceC7316w20).b();
        return true;
    }
}
