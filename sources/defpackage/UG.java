package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class UG<T> {
    public final String a;
    public final Set<C7892yl1<? super T>> b;
    public final Set<C6996uX> c;
    public final int d;
    public final int e;
    public final InterfaceC5056lH<T> f;
    public final Set<Class<?>> g;

    public static class a<T> {
        public String a = null;
        public final HashSet b;
        public final HashSet c;
        public int d;
        public int e;
        public InterfaceC5056lH<T> f;
        public final HashSet g;

        public a(Class cls, Class[] clsArr) {
            HashSet hashSet = new HashSet();
            this.b = hashSet;
            this.c = new HashSet();
            this.d = 0;
            this.e = 0;
            this.g = new HashSet();
            hashSet.add(C7892yl1.a(cls));
            for (Class cls2 : clsArr) {
                C5208m0.f(cls2, "Null interface");
                this.b.add(C7892yl1.a(cls2));
            }
        }

        public final void a(C6996uX c6996uX) {
            if (this.b.contains(c6996uX.a)) {
                throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
            }
            this.c.add(c6996uX);
        }

        public final UG<T> b() {
            if (this.f != null) {
                return new UG<>(this.a, new HashSet(this.b), new HashSet(this.c), this.d, this.e, this.f, this.g);
            }
            throw new IllegalStateException("Missing required property: factory.");
        }

        public final void c(int i) {
            if (!(this.d == 0)) {
                throw new IllegalStateException("Instantiation type has already been set.");
            }
            this.d = i;
        }
    }

    public UG(String str, Set<C7892yl1<? super T>> set, Set<C6996uX> set2, int i, int i2, InterfaceC5056lH<T> interfaceC5056lH, Set<Class<?>> set3) {
        this.a = str;
        this.b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = interfaceC5056lH;
        this.g = Collections.unmodifiableSet(set3);
    }

    public static <T> a<T> a(Class<T> cls) {
        return new a<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> UG<T> b(T t, Class<T> cls, Class<? super T>... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(C7892yl1.a(cls));
        for (Class<? super T> cls2 : clsArr) {
            C5208m0.f(cls2, "Null interface");
            hashSet.add(C7892yl1.a(cls2));
        }
        return new UG<>(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new TG(t), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
