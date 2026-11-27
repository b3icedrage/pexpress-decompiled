package com.google.gson;

import com.google.gson.reflect.TypeToken;
import defpackage.A71;
import defpackage.C0981Fj;
import defpackage.C2911bH0;
import defpackage.C3239cq1;
import defpackage.C3351dO0;
import defpackage.C3439dn0;
import defpackage.C3584eW0;
import defpackage.C3648en0;
import defpackage.C3858fn0;
import defpackage.C4068gn0;
import defpackage.C4278hn0;
import defpackage.C6316rG0;
import defpackage.C7790yH0;
import defpackage.C7968z71;
import defpackage.C8056za;
import defpackage.EnumC2852b02;
import defpackage.EnumC7645xc0;
import defpackage.FT0;
import defpackage.HH0;
import defpackage.InterfaceC2095Tp1;
import defpackage.JH0;
import defpackage.JW0;
import defpackage.NH0;
import defpackage.OT;
import defpackage.P90;
import defpackage.QO1;
import defpackage.RH0;
import defpackage.S52;
import defpackage.SA0;
import defpackage.T52;
import defpackage.TE;
import defpackage.U52;
import defpackage.U71;
import defpackage.V71;
import defpackage.W52;
import defpackage.Y52;
import defpackage.YH1;
import defpackage.Z52;
import defpackage.ZH0;
import defpackage.ZK;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes.dex */
public final class Gson {
    public final ThreadLocal<Map<TypeToken<?>, T52<?>>> a;
    public final ConcurrentHashMap b;
    public final ZK c;
    public final C6316rG0 d;
    public final List<U52> e;
    public final Map<Type, SA0<?>> f;
    public final boolean g;
    public final boolean h;
    public final List<U52> i;
    public final List<U52> j;
    public final List<InterfaceC2095Tp1> k;

    public static class a<T> extends YH1<T> {
        public T52<T> a;

        @Override // defpackage.T52
        public final T a(C7790yH0 c7790yH0) {
            T52<T> t52 = this.a;
            if (t52 != null) {
                return t52.a(c7790yH0);
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        @Override // defpackage.T52
        public final void b(ZH0 zh0, T t) {
            T52<T> t52 = this.a;
            if (t52 == null) {
                throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
            }
            t52.b(zh0, t);
        }

        @Override // defpackage.YH1
        public final T52<T> c() {
            T52<T> t52 = this.a;
            if (t52 != null) {
                return t52;
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Gson() {
        P90 p90 = P90.g;
        EnumC7645xc0.a aVar = EnumC7645xc0.d;
        Map map = Collections.EMPTY_MAP;
        FT0.a aVar2 = FT0.d;
        List list = Collections.EMPTY_LIST;
        this(p90, aVar, map, false, true, true, aVar2, list, list, list, EnumC2852b02.d, EnumC2852b02.e, list);
    }

    public static void a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final <T> T b(C7790yH0 c7790yH0, TypeToken<T> typeToken) {
        boolean z = c7790yH0.e;
        boolean z2 = true;
        c7790yH0.e = true;
        try {
            try {
                try {
                    try {
                        c7790yH0.G();
                        z2 = false;
                        T tA = f(typeToken).a(c7790yH0);
                        c7790yH0.e = z;
                        return tA;
                    } catch (EOFException e) {
                        if (!z2) {
                            throw new HH0(e);
                        }
                        c7790yH0.e = z;
                        return null;
                    }
                } catch (IllegalStateException e2) {
                    throw new HH0(e2);
                }
            } catch (IOException e3) {
                throw new HH0(e3);
            } catch (AssertionError e4) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e4.getMessage(), e4);
            }
        } catch (Throwable th) {
            c7790yH0.e = z;
            throw th;
        }
    }

    public final <T> T c(JsonElement jsonElement, TypeToken<T> typeToken) {
        if (jsonElement == null) {
            return null;
        }
        NH0 nh0 = new NH0(NH0.x);
        nh0.t = new Object[32];
        nh0.u = 0;
        nh0.v = new String[32];
        nh0.w = new int[32];
        nh0.U0(jsonElement);
        return (T) b(nh0, typeToken);
    }

    public final Object d(Class cls, String str) {
        return C8056za.x(cls).cast(e(str, TypeToken.get(cls)));
    }

    public final <T> T e(String str, TypeToken<T> typeToken) {
        if (str == null) {
            return null;
        }
        C7790yH0 c7790yH0 = new C7790yH0(new StringReader(str));
        c7790yH0.e = false;
        T t = (T) b(c7790yH0, typeToken);
        if (t != null) {
            try {
                if (c7790yH0.G() != JH0.n) {
                    throw new HH0("JSON document was not fully consumed.");
                }
            } catch (C3584eW0 e) {
                throw new HH0(e);
            } catch (IOException e2) {
                throw new C2911bH0(e2);
            }
        }
        return t;
    }

    public final <T> T52<T> f(TypeToken<T> typeToken) {
        boolean z;
        Objects.requireNonNull(typeToken, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.b;
        T52<T> t52 = (T52) concurrentHashMap.get(typeToken);
        if (t52 != null) {
            return t52;
        }
        ThreadLocal<Map<TypeToken<?>, T52<?>>> threadLocal = this.a;
        Map map = threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set((Map<TypeToken<?>, T52<?>>) map);
            z = true;
        } else {
            T52<T> t53 = (T52) map.get(typeToken);
            if (t53 != null) {
                return t53;
            }
            z = false;
        }
        try {
            a aVar = new a();
            aVar.a = null;
            map.put(typeToken, aVar);
            Iterator<U52> it = this.e.iterator();
            T52<T> t52A = null;
            while (it.hasNext()) {
                t52A = it.next().a(this, typeToken);
                if (t52A != null) {
                    if (aVar.a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    aVar.a = t52A;
                    map.put(typeToken, t52A);
                    break;
                }
            }
            if (z) {
                threadLocal.remove();
            }
            if (t52A != null) {
                if (z) {
                    concurrentHashMap.putAll(map);
                }
                return t52A;
            }
            throw new IllegalArgumentException("GSON (2.10.1) cannot handle " + typeToken);
        } catch (Throwable th) {
            if (z) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    public final <T> T52<T> g(U52 u52, TypeToken<T> typeToken) {
        List<U52> list = this.e;
        if (!list.contains(u52)) {
            u52 = this.d;
        }
        boolean z = false;
        for (U52 u53 : list) {
            if (z) {
                T52<T> t52A = u53.a(this, typeToken);
                if (t52A != null) {
                    return t52A;
                }
            } else if (u53 == u52) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + typeToken);
    }

    public final ZH0 h(Writer writer) {
        ZH0 zh0 = new ZH0(writer);
        zh0.j = this.h;
        zh0.i = false;
        zh0.l = this.g;
        return zh0;
    }

    public final String i(Object obj) {
        if (obj == null) {
            JsonNull jsonNull = JsonNull.d;
            StringWriter stringWriter = new StringWriter();
            try {
                j(jsonNull, h(stringWriter));
                return stringWriter.toString();
            } catch (IOException e) {
                throw new C2911bH0(e);
            }
        }
        Class cls = obj.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            k(obj, cls, h(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e2) {
            throw new C2911bH0(e2);
        }
    }

    public final void j(JsonNull jsonNull, ZH0 zh0) {
        boolean z = zh0.i;
        zh0.i = true;
        boolean z2 = zh0.j;
        zh0.j = this.h;
        boolean z3 = zh0.l;
        zh0.l = this.g;
        try {
            try {
                W52.z.getClass();
                W52.t.d(zh0, jsonNull);
                zh0.i = z;
                zh0.j = z2;
                zh0.l = z3;
            } catch (IOException e) {
                throw new C2911bH0(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            zh0.i = z;
            zh0.j = z2;
            zh0.l = z3;
            throw th;
        }
    }

    public final void k(Object obj, Class cls, ZH0 zh0) {
        T52 t52F = f(TypeToken.get((Type) cls));
        boolean z = zh0.i;
        zh0.i = true;
        boolean z2 = zh0.j;
        zh0.j = this.h;
        boolean z3 = zh0.l;
        zh0.l = this.g;
        try {
            try {
                try {
                    t52F.b(zh0, obj);
                    zh0.i = z;
                    zh0.j = z2;
                    zh0.l = z3;
                } catch (IOException e) {
                    throw new C2911bH0(e);
                }
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            zh0.i = z;
            zh0.j = z2;
            zh0.l = z3;
            throw th;
        }
    }

    public final JsonElement l(Object obj) {
        if (obj == null) {
            return JsonNull.d;
        }
        Class cls = obj.getClass();
        RH0 rh0 = new RH0();
        k(obj, cls, rh0);
        ArrayList arrayList = rh0.p;
        if (arrayList.isEmpty()) {
            return rh0.r;
        }
        throw new IllegalStateException("Expected one JSON element but was " + arrayList);
    }

    public final String toString() {
        return "{serializeNulls:" + this.g + ",factories:" + this.e + ",instanceCreators:" + this.c + "}";
    }

    public Gson(P90 p90, EnumC7645xc0 enumC7645xc0, Map map, boolean z, boolean z2, boolean z3, FT0.a aVar, List list, List list2, List list3, EnumC2852b02 enumC2852b02, EnumC2852b02 enumC2852b03, List list4) {
        U71 u71;
        T52 c3858fn0;
        C7968z71 c7968z71;
        this.a = new ThreadLocal<>();
        this.b = new ConcurrentHashMap();
        this.f = map;
        ZK zk = new ZK(map, z3, list4);
        this.c = zk;
        this.g = z;
        this.h = z2;
        this.i = list;
        this.j = list2;
        this.k = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(W52.A);
        if (enumC2852b02 == EnumC2852b02.d) {
            u71 = V71.c;
        } else {
            u71 = new U71(enumC2852b02);
        }
        arrayList.add(u71);
        arrayList.add(p90);
        arrayList.addAll(list3);
        arrayList.add(W52.p);
        arrayList.add(W52.g);
        arrayList.add(W52.d);
        arrayList.add(W52.e);
        arrayList.add(W52.f);
        if (aVar == FT0.d) {
            c3858fn0 = W52.k;
        } else {
            c3858fn0 = new C3858fn0();
        }
        arrayList.add(new Z52(Long.TYPE, Long.class, c3858fn0));
        arrayList.add(new Z52(Double.TYPE, Double.class, new C3439dn0()));
        arrayList.add(new Z52(Float.TYPE, Float.class, new C3648en0()));
        if (enumC2852b03 == EnumC2852b02.e) {
            c7968z71 = A71.b;
        } else {
            c7968z71 = new C7968z71(new A71(enumC2852b03));
        }
        arrayList.add(c7968z71);
        arrayList.add(W52.h);
        arrayList.add(W52.i);
        arrayList.add(new Y52(AtomicLong.class, new S52(new C4068gn0(c3858fn0))));
        arrayList.add(new Y52(AtomicLongArray.class, new S52(new C4278hn0(c3858fn0))));
        arrayList.add(W52.j);
        arrayList.add(W52.l);
        arrayList.add(W52.q);
        arrayList.add(W52.r);
        arrayList.add(new Y52(BigDecimal.class, W52.m));
        arrayList.add(new Y52(BigInteger.class, W52.n));
        arrayList.add(new Y52(C3351dO0.class, W52.o));
        arrayList.add(W52.s);
        arrayList.add(W52.t);
        arrayList.add(W52.v);
        arrayList.add(W52.w);
        arrayList.add(W52.y);
        arrayList.add(W52.u);
        arrayList.add(W52.b);
        arrayList.add(OT.b);
        arrayList.add(W52.x);
        if (QO1.a) {
            arrayList.add(QO1.e);
            arrayList.add(QO1.d);
            arrayList.add(QO1.f);
        }
        arrayList.add(C0981Fj.c);
        arrayList.add(W52.a);
        arrayList.add(new TE(zk));
        arrayList.add(new JW0(zk));
        C6316rG0 c6316rG0 = new C6316rG0(zk);
        this.d = c6316rG0;
        arrayList.add(c6316rG0);
        arrayList.add(W52.B);
        arrayList.add(new C3239cq1(zk, enumC7645xc0, p90, c6316rG0, list4));
        this.e = Collections.unmodifiableList(arrayList);
    }
}
