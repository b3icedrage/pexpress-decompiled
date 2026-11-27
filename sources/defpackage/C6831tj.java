package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: tj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6831tj extends AbstractC5897pG0<Object> {
    public static final a c = new a();
    public final Class<?> a;
    public final AbstractC5897pG0<Object> b;

    /* JADX INFO: renamed from: tj$a */
    public class a implements AbstractC5897pG0.a {
        @Override // defpackage.AbstractC5897pG0.a
        @Nullable
        public final AbstractC5897pG0<?> a(Type type, Set<? extends Annotation> set, C3903g11 c3903g11) {
            Type componentType;
            if (type instanceof GenericArrayType) {
                componentType = ((GenericArrayType) type).getGenericComponentType();
            } else {
                componentType = type instanceof Class ? ((Class) type).getComponentType() : null;
            }
            if (componentType == null || !set.isEmpty()) {
                return null;
            }
            Class<?> clsC = C6918u72.c(componentType);
            c3903g11.getClass();
            return new C6831tj(clsC, c3903g11.c(componentType, C6596sc2.a, null)).c();
        }
    }

    public C6831tj(Class<?> cls, AbstractC5897pG0<Object> abstractC5897pG0) {
        this.a = cls;
        this.b = abstractC5897pG0;
    }

    @Override // defpackage.AbstractC5897pG0
    public final Object a(AbstractC8000zH0 abstractC8000zH0) {
        ArrayList arrayList = new ArrayList();
        abstractC8000zH0.l1();
        while (abstractC8000zH0.hasNext()) {
            arrayList.add(this.b.a(abstractC8000zH0));
        }
        abstractC8000zH0.h1();
        Object objNewInstance = Array.newInstance(this.a, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            Array.set(objNewInstance, i, arrayList.get(i));
        }
        return objNewInstance;
    }

    @Override // defpackage.AbstractC5897pG0
    public final void e(YH0 yh0, Object obj) {
        yh0.c();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.b.e(yh0, Array.get(obj, i));
        }
        yh0.k();
    }

    public final String toString() {
        return this.b + ".array()";
    }
}
