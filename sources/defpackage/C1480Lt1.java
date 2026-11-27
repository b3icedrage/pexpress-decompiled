package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: Lt1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1480Lt1 implements InterfaceC3958gH {
    public final Set<C7892yl1<?>> a;
    public final Set<C7892yl1<?>> b;
    public final Set<C7892yl1<?>> c;
    public final Set<C7892yl1<?>> d;
    public final Set<C7892yl1<?>> e;
    public final InterfaceC3958gH f;

    /* JADX INFO: renamed from: Lt1$a */
    public static class a implements InterfaceC2318Wk1 {
        public final InterfaceC2318Wk1 a;

        public a(InterfaceC2318Wk1 interfaceC2318Wk1) {
            this.a = interfaceC2318Wk1;
        }
    }

    public C1480Lt1(UG<?> ug, InterfaceC3958gH interfaceC3958gH) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (C6996uX c6996uX : ug.c) {
            int i = c6996uX.c;
            boolean z = i == 0;
            int i2 = c6996uX.b;
            C7892yl1<?> c7892yl1 = c6996uX.a;
            if (z) {
                if (i2 == 2) {
                    hashSet4.add(c7892yl1);
                } else {
                    hashSet.add(c7892yl1);
                }
            } else if (i == 2) {
                hashSet3.add(c7892yl1);
            } else if (i2 == 2) {
                hashSet5.add(c7892yl1);
            } else {
                hashSet2.add(c7892yl1);
            }
        }
        if (!ug.g.isEmpty()) {
            hashSet.add(C7892yl1.a(InterfaceC2318Wk1.class));
        }
        this.a = Collections.unmodifiableSet(hashSet);
        this.b = Collections.unmodifiableSet(hashSet2);
        this.c = Collections.unmodifiableSet(hashSet3);
        this.d = Collections.unmodifiableSet(hashSet4);
        this.e = Collections.unmodifiableSet(hashSet5);
        this.f = interfaceC3958gH;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC3958gH
    public final <T> T a(Class<T> cls) {
        if (this.a.contains(C7892yl1.a(cls))) {
            T t = (T) this.f.a(cls);
            return !cls.equals(InterfaceC2318Wk1.class) ? t : (T) new a((InterfaceC2318Wk1) t);
        }
        throw new AX("Attempting to request an undeclared dependency " + cls + ".");
    }

    @Override // defpackage.InterfaceC3958gH
    public final <T> Set<T> b(C7892yl1<T> c7892yl1) {
        if (this.d.contains(c7892yl1)) {
            return this.f.b(c7892yl1);
        }
        throw new AX("Attempting to request an undeclared dependency Set<" + c7892yl1 + ">.");
    }

    @Override // defpackage.InterfaceC3958gH
    public final <T> InterfaceC1612Nk1<T> c(Class<T> cls) {
        return f(C7892yl1.a(cls));
    }

    @Override // defpackage.InterfaceC3958gH
    public final <T> InterfaceC1612Nk1<Set<T>> d(C7892yl1<T> c7892yl1) {
        if (this.e.contains(c7892yl1)) {
            return this.f.d(c7892yl1);
        }
        throw new AX("Attempting to request an undeclared dependency Provider<Set<" + c7892yl1 + ">>.");
    }

    @Override // defpackage.InterfaceC3958gH
    public final <T> InterfaceC7203vW<T> e(C7892yl1<T> c7892yl1) {
        if (this.c.contains(c7892yl1)) {
            return this.f.e(c7892yl1);
        }
        throw new AX("Attempting to request an undeclared dependency Deferred<" + c7892yl1 + ">.");
    }

    @Override // defpackage.InterfaceC3958gH
    public final <T> InterfaceC1612Nk1<T> f(C7892yl1<T> c7892yl1) {
        if (this.b.contains(c7892yl1)) {
            return this.f.f(c7892yl1);
        }
        throw new AX("Attempting to request an undeclared dependency Provider<" + c7892yl1 + ">.");
    }

    @Override // defpackage.InterfaceC3958gH
    public final <T> T g(C7892yl1<T> c7892yl1) {
        if (this.a.contains(c7892yl1)) {
            return (T) this.f.g(c7892yl1);
        }
        throw new AX("Attempting to request an undeclared dependency " + c7892yl1 + ".");
    }

    public final <T> InterfaceC7203vW<T> h(Class<T> cls) {
        return e(C7892yl1.a(cls));
    }
}
