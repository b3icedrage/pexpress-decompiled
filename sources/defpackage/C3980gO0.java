package defpackage;

/* JADX INFO: renamed from: gO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3980gO0<T> implements InterfaceC1612Nk1<T> {
    public static final Object c = new Object();
    public volatile Object a = c;
    public volatile InterfaceC1612Nk1<T> b;

    public C3980gO0(InterfaceC1612Nk1<T> interfaceC1612Nk1) {
        this.b = interfaceC1612Nk1;
    }

    @Override // defpackage.InterfaceC1612Nk1
    public final T get() {
        T t;
        T t2 = (T) this.a;
        Object obj = c;
        if (t2 != obj) {
            return t2;
        }
        synchronized (this) {
            try {
                t = (T) this.a;
                if (t == obj) {
                    t = this.b.get();
                    this.a = t;
                    this.b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }
}
