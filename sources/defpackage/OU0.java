package defpackage;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class OU0 {
    public final C3020bn0<a, Object> a = new C3020bn0<>();
    public final b b = new b();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final int e;
    public int f;

    public static final class a implements InterfaceC0971Ff1 {
        public final b a;
        public int b;
        public Class<?> c;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // defpackage.InterfaceC0971Ff1
        public final void a() {
            this.a.a(this);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.b == aVar.b && this.c == aVar.c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i = this.b * 31;
            Class<?> cls = this.c;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public final String toString() {
            return "Key{size=" + this.b + "array=" + this.c + '}';
        }
    }

    public static final class b extends AbstractC6646sq {
        public final InterfaceC0971Ff1 b() {
            return new a(this);
        }
    }

    public OU0(int i) {
        this.e = i;
    }

    public final synchronized void a() {
        c(0);
    }

    public final void b(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMapG = g(cls);
        Integer num = navigableMapG.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapG.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapG.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    public final void c(int i) {
        while (this.f > i) {
            Object objC = this.a.c();
            UE.d(objC);
            InterfaceC5362mj interfaceC5362mjE = e(objC.getClass());
            this.f -= interfaceC5362mjE.b() * interfaceC5362mjE.c(objC);
            b(interfaceC5362mjE.c(objC), objC.getClass());
            if (Log.isLoggable(interfaceC5362mjE.a(), 2)) {
                interfaceC5362mjE.c(objC);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized <T> T d(int i, Class<T> cls) {
        a aVar;
        int i2;
        try {
            Integer numCeilingKey = g(cls).ceilingKey(Integer.valueOf(i));
            if (numCeilingKey == null || ((i2 = this.f) != 0 && this.e / i2 < 2 && numCeilingKey.intValue() > i * 8)) {
                b bVar = this.b;
                InterfaceC0971Ff1 interfaceC0971Ff1B = (InterfaceC0971Ff1) ((ArrayDeque) bVar.b).poll();
                if (interfaceC0971Ff1B == null) {
                    interfaceC0971Ff1B = bVar.b();
                }
                aVar = (a) interfaceC0971Ff1B;
                aVar.b = i;
                aVar.c = cls;
            } else {
                b bVar2 = this.b;
                int iIntValue = numCeilingKey.intValue();
                InterfaceC0971Ff1 interfaceC0971Ff1B2 = (InterfaceC0971Ff1) ((ArrayDeque) bVar2.b).poll();
                if (interfaceC0971Ff1B2 == null) {
                    interfaceC0971Ff1B2 = bVar2.b();
                }
                aVar = (a) interfaceC0971Ff1B2;
                aVar.b = iIntValue;
                aVar.c = cls;
            }
        } catch (Throwable th) {
            throw th;
        }
        return (T) f(aVar, cls);
    }

    public final <T> InterfaceC5362mj<T> e(Class<T> cls) {
        InterfaceC5362mj<T> c1799Pv;
        HashMap map = this.d;
        InterfaceC5362mj<T> interfaceC5362mj = (InterfaceC5362mj) map.get(cls);
        if (interfaceC5362mj != null) {
            return interfaceC5362mj;
        }
        if (cls.equals(int[].class)) {
            c1799Pv = new GB0();
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            c1799Pv = new C1799Pv();
        }
        map.put(cls, c1799Pv);
        return c1799Pv;
    }

    public final <T> T f(a aVar, Class<T> cls) {
        InterfaceC5362mj<T> interfaceC5362mjE = e(cls);
        T t = (T) this.a.a(aVar);
        if (t != null) {
            this.f -= interfaceC5362mjE.b() * interfaceC5362mjE.c(t);
            b(interfaceC5362mjE.c(t), cls);
        }
        if (t != null) {
            return t;
        }
        Log.isLoggable(interfaceC5362mjE.a(), 2);
        return interfaceC5362mjE.newArray(aVar.b);
    }

    public final NavigableMap<Integer, Integer> g(Class<?> cls) {
        HashMap map = this.c;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    public final synchronized <T> void h(T t) {
        Class<?> cls = t.getClass();
        InterfaceC5362mj<T> interfaceC5362mjE = e(cls);
        int iC = interfaceC5362mjE.c(t);
        int iB = interfaceC5362mjE.b() * iC;
        if (iB <= this.e / 2) {
            b bVar = this.b;
            InterfaceC0971Ff1 interfaceC0971Ff1B = (InterfaceC0971Ff1) ((ArrayDeque) bVar.b).poll();
            if (interfaceC0971Ff1B == null) {
                interfaceC0971Ff1B = bVar.b();
            }
            a aVar = (a) interfaceC0971Ff1B;
            aVar.b = iC;
            aVar.c = cls;
            this.a.b(aVar, t);
            NavigableMap<Integer, Integer> navigableMapG = g(cls);
            Integer num = navigableMapG.get(Integer.valueOf(aVar.b));
            Integer numValueOf = Integer.valueOf(aVar.b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapG.put(numValueOf, Integer.valueOf(iIntValue));
            this.f += iB;
            c(this.e);
        }
    }
}
