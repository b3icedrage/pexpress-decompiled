package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: aP0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2711aP0<T> implements InterfaceC1612Nk1<Set<T>> {
    public volatile Set<InterfaceC1612Nk1<T>> a;
    public volatile Set<T> b;

    public C2711aP0() {
        throw null;
    }

    @Override // defpackage.InterfaceC1612Nk1
    public final Object get() {
        if (this.b == null) {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        this.b = Collections.newSetFromMap(new ConcurrentHashMap());
                        synchronized (this) {
                            try {
                                Iterator<InterfaceC1612Nk1<T>> it = this.a.iterator();
                                while (it.hasNext()) {
                                    this.b.add(it.next().get());
                                }
                                this.a = null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return Collections.unmodifiableSet(this.b);
    }
}
