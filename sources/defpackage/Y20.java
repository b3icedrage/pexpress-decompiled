package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class Y20<T> implements InterfaceC1454Lk1<T>, InterfaceC3560eO0<T> {
    public static final Object c = new Object();
    public volatile InterfaceC1454Lk1<T> a;
    public volatile Object b = c;

    public Y20(InterfaceC1454Lk1<T> interfaceC1454Lk1) {
        this.a = interfaceC1454Lk1;
    }

    @Deprecated
    public static InterfaceC1454Lk1 a(InterfaceC5331mb0 interfaceC5331mb0) {
        return b(new C1690Ok1(interfaceC5331mb0));
    }

    public static <P extends InterfaceC1454Lk1<T>, T> InterfaceC1454Lk1<T> b(P p) {
        p.getClass();
        return p instanceof Y20 ? p : new Y20(p);
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
