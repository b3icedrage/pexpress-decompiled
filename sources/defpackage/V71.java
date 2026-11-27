package defpackage;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class V71 extends T52<Object> {
    public static final U71 c = new U71(EnumC2852b02.d);
    public final Gson a;
    public final EnumC2852b02 b;

    public V71(Gson gson, EnumC2852b02 enumC2852b02) {
        this.a = gson;
        this.b = enumC2852b02;
    }

    @Override // defpackage.T52
    public final Object a(C7790yH0 c7790yH0) throws IOException {
        Object arrayList;
        Serializable arrayList2;
        JH0 jh0G = c7790yH0.G();
        int iOrdinal = jh0G.ordinal();
        if (iOrdinal == 0) {
            c7790yH0.l1();
            arrayList = new ArrayList();
        } else if (iOrdinal != 2) {
            arrayList = null;
        } else {
            c7790yH0.X0();
            arrayList = new C7817yQ0();
        }
        if (arrayList == null) {
            return c(c7790yH0, jh0G);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c7790yH0.hasNext()) {
                String strX0 = arrayList instanceof Map ? c7790yH0.x0() : null;
                JH0 jh0G2 = c7790yH0.G();
                int iOrdinal2 = jh0G2.ordinal();
                if (iOrdinal2 == 0) {
                    c7790yH0.l1();
                    arrayList2 = new ArrayList();
                } else if (iOrdinal2 != 2) {
                    arrayList2 = null;
                } else {
                    c7790yH0.X0();
                    arrayList2 = new C7817yQ0();
                }
                boolean z = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = c(c7790yH0, jh0G2);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(strX0, arrayList2);
                }
                if (z) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    c7790yH0.h1();
                } else {
                    c7790yH0.B0();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // defpackage.T52
    public final void b(ZH0 zh0, Object obj) throws IOException {
        if (obj == null) {
            zh0.l();
            return;
        }
        Class<?> cls = obj.getClass();
        Gson gson = this.a;
        gson.getClass();
        T52 t52F = gson.f(TypeToken.get((Class) cls));
        if (!(t52F instanceof V71)) {
            t52F.b(zh0, obj);
        } else {
            zh0.X0();
            zh0.B0();
        }
    }

    public final Serializable c(C7790yH0 c7790yH0, JH0 jh0) throws IOException {
        int iOrdinal = jh0.ordinal();
        if (iOrdinal == 5) {
            return c7790yH0.B();
        }
        if (iOrdinal == 6) {
            return this.b.b(c7790yH0);
        }
        if (iOrdinal == 7) {
            return Boolean.valueOf(c7790yH0.u());
        }
        if (iOrdinal == 8) {
            c7790yH0.A();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + jh0);
    }
}
