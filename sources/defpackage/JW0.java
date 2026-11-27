package defpackage;

import com.google.gson.Gson;
import com.google.gson.JsonPrimitive;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: loaded from: classes.dex */
public final class JW0 implements U52 {
    public final ZK d;

    public final class a<K, V> extends T52<Map<K, V>> {
        public final V52 a;
        public final V52 b;
        public final J71<? extends Map<K, V>> c;

        public a(Gson gson, Type type, T52<K> t52, Type type2, T52<V> t53, J71<? extends Map<K, V>> j71) {
            this.a = new V52(gson, t52, type);
            this.b = new V52(gson, t53, type2);
            this.c = j71;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.T52
        public final Object a(C7790yH0 c7790yH0) throws IOException {
            JH0 jh0G = c7790yH0.G();
            if (jh0G == JH0.m) {
                c7790yH0.A();
                return null;
            }
            Map<K, V> mapE = this.c.e();
            JH0 jh0 = JH0.d;
            V52 v52 = this.b;
            V52 v53 = this.a;
            if (jh0G == jh0) {
                c7790yH0.l1();
                while (c7790yH0.hasNext()) {
                    c7790yH0.l1();
                    Object objA = v53.b.a(c7790yH0);
                    if (mapE.put(objA, v52.b.a(c7790yH0)) != null) {
                        throw new HH0(FK.c(objA, "duplicate key: "));
                    }
                    c7790yH0.h1();
                }
                c7790yH0.h1();
                return mapE;
            }
            c7790yH0.X0();
            while (c7790yH0.hasNext()) {
                G1.d.getClass();
                if (c7790yH0 instanceof NH0) {
                    NH0 nh0 = (NH0) c7790yH0;
                    nh0.K0(JH0.i);
                    Map.Entry entry = (Map.Entry) ((Iterator) nh0.R0()).next();
                    nh0.U0(entry.getValue());
                    nh0.U0(new JsonPrimitive((String) entry.getKey()));
                } else {
                    int iF = c7790yH0.l;
                    if (iF == 0) {
                        iF = c7790yH0.f();
                    }
                    if (iF == 13) {
                        c7790yH0.l = 9;
                    } else if (iF == 12) {
                        c7790yH0.l = 8;
                    } else {
                        if (iF != 14) {
                            throw new IllegalStateException("Expected a name but was " + c7790yH0.G() + c7790yH0.t());
                        }
                        c7790yH0.l = 10;
                    }
                }
                Object objA2 = v53.b.a(c7790yH0);
                if (mapE.put(objA2, v52.b.a(c7790yH0)) != null) {
                    throw new HH0(FK.c(objA2, "duplicate key: "));
                }
            }
            c7790yH0.B0();
            return mapE;
        }

        @Override // defpackage.T52
        public final void b(ZH0 zh0, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map == null) {
                zh0.l();
                return;
            }
            JW0.this.getClass();
            zh0.X0();
            for (Map.Entry<K, V> entry : map.entrySet()) {
                zh0.g(String.valueOf(entry.getKey()));
                this.b.b(zh0, entry.getValue());
            }
            zh0.B0();
        }
    }

    public JW0(ZK zk) {
        this.d = zk;
    }

    @Override // defpackage.U52
    public final <T> T52<T> a(Gson gson, TypeToken<T> typeToken) {
        Type[] actualTypeArguments;
        Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        if (!Map.class.isAssignableFrom(rawType)) {
            return null;
        }
        if (type == Properties.class) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            if (type instanceof WildcardType) {
                type = ((WildcardType) type).getUpperBounds()[0];
            }
            C7652xe.b(Map.class.isAssignableFrom(rawType));
            Type typeF = C2624a.f(type, rawType, C2624a.d(type, rawType, Map.class), new HashMap());
            actualTypeArguments = typeF instanceof ParameterizedType ? ((ParameterizedType) typeF).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        return new a(gson, actualTypeArguments[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? W52.c : gson.f(TypeToken.get(type2)), actualTypeArguments[1], gson.f(TypeToken.get(actualTypeArguments[1])), this.d.b(typeToken));
    }
}
