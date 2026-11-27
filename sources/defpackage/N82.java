package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class N82<T, B> {
    public abstract void a(B b, int i, int i2);

    public abstract void b(B b, int i, long j);

    public abstract void c(int i, Object obj, Object obj2);

    public abstract void d(B b, int i, AbstractC1565Mw abstractC1565Mw);

    public abstract void e(B b, int i, long j);

    public abstract P82 f(Object obj);

    public abstract P82 g(Object obj);

    public abstract int h(T t);

    public abstract int i(T t);

    public abstract void j(Object obj);

    public abstract P82 k(Object obj, Object obj2);

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean l(int i, FE fe, Object obj) throws C6724tC0 {
        int i2 = fe.b;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            fe.w(0);
            e(obj, i3, fe.a.o());
            return true;
        }
        if (i4 == 1) {
            fe.w(1);
            b(obj, i3, fe.a.l());
            return true;
        }
        if (i4 == 2) {
            d(obj, i3, fe.e());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw C6724tC0.b();
            }
            fe.w(5);
            a(obj, i3, fe.a.k());
            return true;
        }
        P82 p82M = m();
        int i5 = (i3 << 3) | 4;
        int i6 = i + 1;
        if (i6 >= 100) {
            throw new C6724tC0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (fe.a() != Integer.MAX_VALUE && l(i6, fe, p82M)) {
        }
        if (i5 != fe.b) {
            throw new C6724tC0("Protocol message end-group tag did not match expected tag.");
        }
        c(i3, obj, p(p82M));
        return true;
    }

    public abstract P82 m();

    public abstract void n(Object obj, B b);

    public abstract void o(Object obj, T t);

    public abstract P82 p(Object obj);

    public abstract void q(T t, InterfaceC5373ml2 interfaceC5373ml2);

    public abstract void r(T t, InterfaceC5373ml2 interfaceC5373ml2);
}
