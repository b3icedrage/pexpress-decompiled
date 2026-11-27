package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class EW0<K, V> extends AbstractC5897pG0<Map<K, V>> {
    public static final a c = new a();
    public final AbstractC5897pG0<K> a;
    public final AbstractC5897pG0<V> b;

    public class a implements AbstractC5897pG0.a {
        @Override // defpackage.AbstractC5897pG0.a
        @Nullable
        public final AbstractC5897pG0<?> a(Type type, Set<? extends Annotation> set, C3903g11 c3903g11) {
            Class<?> clsC;
            Type[] actualTypeArguments;
            if (!set.isEmpty() || (clsC = C6918u72.c(type)) != Map.class) {
                return null;
            }
            if (type == Properties.class) {
                actualTypeArguments = new Type[]{String.class, String.class};
            } else {
                if (!Map.class.isAssignableFrom(clsC)) {
                    throw new IllegalArgumentException();
                }
                Type typeH = C6596sc2.h(type, clsC, C6596sc2.c(type, clsC, Map.class), new LinkedHashSet());
                actualTypeArguments = typeH instanceof ParameterizedType ? ((ParameterizedType) typeH).getActualTypeArguments() : new Type[]{Object.class, Object.class};
            }
            return new EW0(c3903g11, actualTypeArguments[0], actualTypeArguments[1]).c();
        }
    }

    public EW0(C3903g11 c3903g11, Type type, Type type2) {
        c3903g11.getClass();
        Set<Annotation> set = C6596sc2.a;
        this.a = c3903g11.b(type, set);
        this.b = c3903g11.b(type2, set);
    }

    @Override // defpackage.AbstractC5897pG0
    public final Object a(AbstractC8000zH0 abstractC8000zH0) {
        C7397wQ0 c7397wQ0 = new C7397wQ0();
        abstractC8000zH0.X0();
        while (abstractC8000zH0.hasNext()) {
            abstractC8000zH0.l();
            K kA = this.a.a(abstractC8000zH0);
            V vA = this.b.a(abstractC8000zH0);
            Object objPut = c7397wQ0.put(kA, vA);
            if (objPut != null) {
                throw new EG0("Map key '" + kA + "' has multiple values at path " + abstractC8000zH0.c() + ": " + objPut + " and " + vA);
            }
        }
        abstractC8000zH0.B0();
        return c7397wQ0;
    }

    @Override // defpackage.AbstractC5897pG0
    public final void e(YH0 yh0, Object obj) {
        yh0.f();
        for (Map.Entry<K, V> entry : ((Map) obj).entrySet()) {
            if (entry.getKey() == null) {
                throw new EG0("Map key is null at " + yh0.p());
            }
            int iU = yh0.u();
            if (iU != 5 && iU != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            yh0.i = true;
            this.a.e(yh0, entry.getKey());
            this.b.e(yh0, entry.getValue());
        }
        yh0.l();
    }

    public final String toString() {
        return "JsonAdapter(" + this.a + "=" + this.b + ")";
    }
}
