package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Z20<T> implements InterfaceC1531Mk1<T> {
    public static final Object c = new Object();
    public volatile InterfaceC5541nb0 a;
    public volatile Object b;

    public static InterfaceC1531Mk1 a(InterfaceC5541nb0 interfaceC5541nb0) {
        if (interfaceC5541nb0 instanceof Z20) {
            return interfaceC5541nb0;
        }
        Z20 z20 = new Z20();
        z20.b = c;
        z20.a = interfaceC5541nb0;
        return z20;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final T get() {
        T t;
        T t2 = (T) this.b;
        Object obj = c;
        if (t2 != obj) {
            return t2;
        }
        synchronized (this) {
            try {
                t = (T) this.b;
                if (t == obj) {
                    t = this.a.get();
                    Object obj2 = this.b;
                    if (obj2 != obj && obj2 != t) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + t + ". This is likely due to a circular dependency.");
                    }
                    this.b = t;
                    this.a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }
}
