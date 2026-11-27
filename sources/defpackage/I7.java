package defpackage;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class I7 implements AbstractC5897pG0.a {
    public final ArrayList a;
    public final ArrayList b;

    public class a extends AbstractC5897pG0<Object> {
        public final /* synthetic */ b a;
        public final /* synthetic */ AbstractC5897pG0 b;
        public final /* synthetic */ b c;
        public final /* synthetic */ Set d;
        public final /* synthetic */ Type e;

        public a(b bVar, AbstractC5897pG0 abstractC5897pG0, C3903g11 c3903g11, b bVar2, Set set, Type type) {
            this.a = bVar;
            this.b = abstractC5897pG0;
            this.c = bVar2;
            this.d = set;
            this.e = type;
        }

        @Override // defpackage.AbstractC5897pG0
        @Nullable
        public final Object a(AbstractC8000zH0 abstractC8000zH0) throws IOException {
            b bVar = this.c;
            if (bVar == null) {
                return this.b.a(abstractC8000zH0);
            }
            if (!bVar.g && abstractC8000zH0.k() == AbstractC8000zH0.b.m) {
                abstractC8000zH0.g();
                return null;
            }
            try {
                return bVar.b(abstractC8000zH0);
            } catch (InvocationTargetException e) {
                Throwable cause = e.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                throw new EG0(cause + " at " + abstractC8000zH0.c(), cause);
            }
        }

        @Override // defpackage.AbstractC5897pG0
        public final void e(YH0 yh0, @Nullable Object obj) throws IOException {
            b bVar = this.a;
            if (bVar == null) {
                this.b.e(yh0, obj);
                return;
            }
            if (!bVar.g && obj == null) {
                yh0.t();
                return;
            }
            try {
                bVar.d(yh0, obj);
            } catch (InvocationTargetException e) {
                Throwable cause = e.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                throw new EG0(cause + " at " + yh0.p(), cause);
            }
        }

        public final String toString() {
            return "JsonAdapter" + this.d + "(" + this.e + ")";
        }
    }

    public static abstract class b {
        public final Type a;
        public final Set<? extends Annotation> b;
        public final Object c;
        public final Method d;
        public final int e;
        public final AbstractC5897pG0<?>[] f;
        public final boolean g;

        public b(Type type, Set<? extends Annotation> set, Object obj, Method method, int i, int i2, boolean z) {
            this.a = C6596sc2.a(type);
            this.b = set;
            this.c = obj;
            this.d = method;
            this.e = i2;
            this.f = new AbstractC5897pG0[i - i2];
            this.g = z;
        }

        public void a(C3903g11 c3903g11, I7 i7) {
            AbstractC5897pG0<?>[] abstractC5897pG0Arr = this.f;
            if (abstractC5897pG0Arr.length > 0) {
                Method method = this.d;
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                int length = genericParameterTypes.length;
                int i = this.e;
                for (int i2 = i; i2 < length; i2++) {
                    Type type = ((ParameterizedType) genericParameterTypes[i2]).getActualTypeArguments()[0];
                    Set<? extends Annotation> setE = C6596sc2.e(parameterAnnotations[i2]);
                    abstractC5897pG0Arr[i2 - i] = (C6918u72.b(this.a, type) && this.b.equals(setE)) ? c3903g11.d(i7, type, setE) : c3903g11.c(type, setE, null);
                }
            }
        }

        @Nullable
        public Object b(AbstractC8000zH0 abstractC8000zH0) {
            throw new AssertionError();
        }

        @Nullable
        public final Object c(@Nullable Object obj) {
            AbstractC5897pG0<?>[] abstractC5897pG0Arr = this.f;
            Object[] objArr = new Object[abstractC5897pG0Arr.length + 1];
            objArr[0] = obj;
            System.arraycopy(abstractC5897pG0Arr, 0, objArr, 1, abstractC5897pG0Arr.length);
            try {
                return this.d.invoke(this.c, objArr);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }

        public void d(YH0 yh0, @Nullable Object obj) {
            throw new AssertionError();
        }
    }

    public I7(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    @Nullable
    public static b b(ArrayList arrayList, Type type, Set set) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            b bVar = (b) arrayList.get(i);
            if (C6918u72.b(bVar.a, type) && bVar.b.equals(set)) {
                return bVar;
            }
        }
        return null;
    }

    @Override // defpackage.AbstractC5897pG0.a
    @Nullable
    public final AbstractC5897pG0<?> a(Type type, Set<? extends Annotation> set, C3903g11 c3903g11) {
        b bVarB = b(this.a, type, set);
        b bVarB2 = b(this.b, type, set);
        AbstractC5897pG0 abstractC5897pG0D = null;
        if (bVarB == null && bVarB2 == null) {
            return null;
        }
        if (bVarB == null || bVarB2 == null) {
            try {
                abstractC5897pG0D = c3903g11.d(this, type, set);
            } catch (IllegalArgumentException e) {
                StringBuilder sbB = C6495s7.b("No ", bVarB == null ? "@ToJson" : "@FromJson", " adapter for ");
                sbB.append(C6596sc2.j(type, set));
                throw new IllegalArgumentException(sbB.toString(), e);
            }
        }
        AbstractC5897pG0 abstractC5897pG0 = abstractC5897pG0D;
        if (bVarB != null) {
            bVarB.a(c3903g11, this);
        }
        if (bVarB2 != null) {
            bVarB2.a(c3903g11, this);
        }
        return new a(bVarB, abstractC5897pG0, c3903g11, bVarB2, set, type);
    }
}
