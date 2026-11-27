package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OE<C extends Collection<T>, T> extends AbstractC5897pG0<C> {
    public static final a b = new a();
    public final AbstractC5897pG0<T> a;

    public class a implements AbstractC5897pG0.a {
        @Override // defpackage.AbstractC5897pG0.a
        @Nullable
        public final AbstractC5897pG0<?> a(Type type, Set<? extends Annotation> set, C3903g11 c3903g11) {
            Class<?> clsC = C6918u72.c(type);
            if (set.isEmpty()) {
                if (clsC == List.class || clsC == Collection.class) {
                    Type typeA = C6918u72.a(type);
                    c3903g11.getClass();
                    return new PE(c3903g11.c(typeA, C6596sc2.a, null)).c();
                }
                if (clsC == Set.class) {
                    Type typeA2 = C6918u72.a(type);
                    c3903g11.getClass();
                    return new QE(c3903g11.c(typeA2, C6596sc2.a, null)).c();
                }
            }
            return null;
        }
    }

    public OE(AbstractC5897pG0 abstractC5897pG0) {
        this.a = abstractC5897pG0;
    }

    @Override // defpackage.AbstractC5897pG0
    public Object a(AbstractC8000zH0 abstractC8000zH0) {
        Collection collectionF = f();
        abstractC8000zH0.l1();
        while (abstractC8000zH0.hasNext()) {
            collectionF.add(this.a.a(abstractC8000zH0));
        }
        abstractC8000zH0.h1();
        return collectionF;
    }

    @Override // defpackage.AbstractC5897pG0
    public void e(YH0 yh0, Object obj) {
        yh0.c();
        Iterator it = ((Collection) obj).iterator();
        while (it.hasNext()) {
            this.a.e(yh0, (T) it.next());
        }
        yh0.k();
    }

    public abstract C f();

    public final String toString() {
        return this.a + ".collection()";
    }
}
