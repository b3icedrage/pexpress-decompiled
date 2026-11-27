package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: g11, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3903g11 {
    public static final ArrayList d;
    public final List<AbstractC5897pG0.a> a;
    public final ThreadLocal<c> b = new ThreadLocal<>();
    public final LinkedHashMap c = new LinkedHashMap();

    /* JADX INFO: renamed from: g11$a */
    public static final class a {
        public final ArrayList a = new ArrayList();
        public int b = 0;

        /* JADX WARN: Code duplicated, block: B:75:0x01ef  */
        /* JADX WARN: Code duplicated, block: B:99:0x01f5 A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object obj) {
            int i;
            Object obj2;
            Type type;
            String str;
            Class cls;
            int i2;
            int i3;
            I7.b m7;
            I7.b bVarB;
            boolean z;
            boolean z2;
            I7.b k7;
            boolean z3 = true;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Class<?> superclass = obj.getClass();
            while (superclass != Object.class) {
                Method[] declaredMethods = superclass.getDeclaredMethods();
                int length = declaredMethods.length;
                int i4 = 0;
                while (i4 < length) {
                    Method method = declaredMethods[i4];
                    boolean zIsAnnotationPresent = method.isAnnotationPresent(InterfaceC2628a02.class);
                    String str2 = "\n    ";
                    Class cls2 = Void.TYPE;
                    if (zIsAnnotationPresent) {
                        method.setAccessible(z3);
                        Type genericReturnType = method.getGenericReturnType();
                        i2 = 0;
                        Type[] genericParameterTypes = method.getGenericParameterTypes();
                        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                        boolean z4 = z3;
                        if (genericParameterTypes.length >= 2 && genericParameterTypes[0] == YH0.class && genericReturnType == cls2) {
                            int length2 = genericParameterTypes.length;
                            int i5 = 2;
                            while (true) {
                                if (i5 < length2) {
                                    int i6 = length2;
                                    Type type2 = genericParameterTypes[i5];
                                    int i7 = i5;
                                    if (!(type2 instanceof ParameterizedType) || ((ParameterizedType) type2).getRawType() != AbstractC5897pG0.class) {
                                        obj2 = "Nullable";
                                        type = AbstractC5897pG0.class;
                                        if (genericParameterTypes.length == z4) {
                                        }
                                        throw new IllegalArgumentException("Unexpected signature for " + method + ".\n@ToJson method signatures may have one of the following structures:\n    <any access modifier> void toJson(JsonWriter writer, T value) throws <any>;\n    <any access modifier> void toJson(JsonWriter writer, T value, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R toJson(T value) throws <any>;\n");
                                    }
                                    i5 = i7 + 1;
                                    length2 = i6;
                                } else {
                                    Set<? extends Annotation> setE = C6596sc2.e(parameterAnnotations[z4 ? 1 : 0]);
                                    Type type3 = genericParameterTypes[z4 ? 1 : 0];
                                    int length3 = genericParameterTypes.length;
                                    cls = cls2;
                                    type = AbstractC5897pG0.class;
                                    obj2 = "Nullable";
                                    k7 = new J7(type3, setE, obj, method, length3, 2, true);
                                    i = length;
                                    str = "Unexpected signature for ";
                                }
                            }
                        } else {
                            obj2 = "Nullable";
                            type = AbstractC5897pG0.class;
                            if (genericParameterTypes.length == z4 || genericReturnType == cls2) {
                                throw new IllegalArgumentException("Unexpected signature for " + method + ".\n@ToJson method signatures may have one of the following structures:\n    <any access modifier> void toJson(JsonWriter writer, T value) throws <any>;\n    <any access modifier> void toJson(JsonWriter writer, T value, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R toJson(T value) throws <any>;\n");
                            }
                            Set<Annotation> set = C6596sc2.a;
                            Set<? extends Annotation> setE2 = C6596sc2.e(method.getAnnotations());
                            Set<? extends Annotation> setE3 = C6596sc2.e(parameterAnnotations[0]);
                            Annotation[] annotationArr = parameterAnnotations[0];
                            int length4 = annotationArr.length;
                            int i8 = 0;
                            while (true) {
                                if (i8 >= length4) {
                                    i = length;
                                    z2 = false;
                                    break;
                                }
                                i = length;
                                if (annotationArr[i8].annotationType().getSimpleName().equals(obj2)) {
                                    z2 = true;
                                    break;
                                } else {
                                    i8++;
                                    length = i;
                                }
                            }
                            Type type4 = genericParameterTypes[0];
                            int length5 = genericParameterTypes.length;
                            cls = cls2;
                            str = "Unexpected signature for ";
                            k7 = new K7(type4, setE3, obj, method, length5, z2, genericParameterTypes, genericReturnType, setE3, setE2);
                        }
                        I7.b bVarB2 = I7.b(arrayList, k7.a, k7.b);
                        if (bVarB2 != null) {
                            throw new IllegalArgumentException("Conflicting @ToJson methods:\n    " + bVarB2.d + str2 + k7.d);
                        }
                        arrayList.add(k7);
                    } else {
                        declaredMethods = declaredMethods;
                        i = length;
                        obj2 = "Nullable";
                        type = AbstractC5897pG0.class;
                        str2 = "\n    ";
                        str = "Unexpected signature for ";
                        cls = cls2;
                        i2 = 0;
                    }
                    if (method.isAnnotationPresent(InterfaceC4262hj0.class)) {
                        method.setAccessible(true);
                        Type genericReturnType2 = method.getGenericReturnType();
                        Set<Annotation> set2 = C6596sc2.a;
                        Set<? extends Annotation> setE4 = C6596sc2.e(method.getAnnotations());
                        Type[] genericParameterTypes2 = method.getGenericParameterTypes();
                        Annotation[][] parameterAnnotations2 = method.getParameterAnnotations();
                        if (genericParameterTypes2.length < 1 || genericParameterTypes2[i2] != AbstractC8000zH0.class || genericReturnType2 == cls) {
                            i3 = i4;
                        } else {
                            int length6 = genericParameterTypes2.length;
                            int i9 = 1;
                            while (true) {
                                if (i9 < length6) {
                                    i3 = i4;
                                    Type type5 = genericParameterTypes2[i9];
                                    Type type6 = genericReturnType2;
                                    if ((type5 instanceof ParameterizedType) && ((ParameterizedType) type5).getRawType() == type) {
                                        i9++;
                                        genericReturnType2 = type6;
                                        i4 = i3;
                                    } else {
                                        genericReturnType2 = type6;
                                    }
                                } else {
                                    i3 = i4;
                                    m7 = new L7(genericReturnType2, setE4, obj, method, genericParameterTypes2.length, 1, true);
                                }
                                bVarB = I7.b(arrayList2, m7.a, m7.b);
                                if (bVarB == null) {
                                    throw new IllegalArgumentException("Conflicting @FromJson methods:\n    " + bVarB.d + str2 + m7.d);
                                }
                                arrayList2.add(m7);
                            }
                        }
                        if (genericParameterTypes2.length != 1 || genericReturnType2 == cls) {
                            throw new IllegalArgumentException(str + method + ".\n@FromJson method signatures may have one of the following structures:\n    <any access modifier> R fromJson(JsonReader jsonReader) throws <any>;\n    <any access modifier> R fromJson(JsonReader jsonReader, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R fromJson(T value) throws <any>;\n");
                        }
                        Set<? extends Annotation> setE5 = C6596sc2.e(parameterAnnotations2[i2]);
                        Annotation[] annotationArr2 = parameterAnnotations2[i2];
                        int length7 = annotationArr2.length;
                        int i10 = i2;
                        while (true) {
                            if (i10 >= length7) {
                                z = i2;
                                break;
                            } else {
                                if (annotationArr2[i10].annotationType().getSimpleName().equals(obj2)) {
                                    z = 1;
                                    break;
                                }
                                i10++;
                            }
                        }
                        m7 = new M7(genericReturnType2, setE4, obj, method, genericParameterTypes2.length, z, genericParameterTypes2, genericReturnType2, setE5, setE4);
                        bVarB = I7.b(arrayList2, m7.a, m7.b);
                        if (bVarB == null) {
                            throw new IllegalArgumentException("Conflicting @FromJson methods:\n    " + bVarB.d + str2 + m7.d);
                        }
                        arrayList2.add(m7);
                    } else {
                        i3 = i4;
                    }
                    i4 = i3 + 1;
                    superclass = superclass;
                    declaredMethods = declaredMethods;
                    length = i;
                    z3 = true;
                }
                superclass = superclass.getSuperclass();
                z3 = true;
            }
            if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                throw new IllegalArgumentException("Expected at least one @ToJson or @FromJson method on ".concat(obj.getClass().getName()));
            }
            I7 i11 = new I7(arrayList, arrayList2);
            ArrayList arrayList3 = this.a;
            int i12 = this.b;
            this.b = i12 + 1;
            arrayList3.add(i12, i11);
        }
    }

    /* JADX INFO: renamed from: g11$b */
    public static final class b<T> extends AbstractC5897pG0<T> {
        public final Type a;

        @Nullable
        public final String b;
        public final Object c;

        @Nullable
        public AbstractC5897pG0<T> d;

        public b(Type type, @Nullable String str, Object obj) {
            this.a = type;
            this.b = str;
            this.c = obj;
        }

        @Override // defpackage.AbstractC5897pG0
        public final T a(AbstractC8000zH0 abstractC8000zH0) {
            AbstractC5897pG0<T> abstractC5897pG0 = this.d;
            if (abstractC5897pG0 != null) {
                return abstractC5897pG0.a(abstractC8000zH0);
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        @Override // defpackage.AbstractC5897pG0
        public final void e(YH0 yh0, T t) {
            AbstractC5897pG0<T> abstractC5897pG0 = this.d;
            if (abstractC5897pG0 == null) {
                throw new IllegalStateException("JsonAdapter isn't ready");
            }
            abstractC5897pG0.e(yh0, t);
        }

        public final String toString() {
            AbstractC5897pG0<T> abstractC5897pG0 = this.d;
            return abstractC5897pG0 != null ? abstractC5897pG0.toString() : super.toString();
        }
    }

    /* JADX INFO: renamed from: g11$c */
    public final class c {
        public final ArrayList a = new ArrayList();
        public final ArrayDeque b = new ArrayDeque();
        public boolean c;

        public c() {
        }

        public final IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
            if (!this.c) {
                this.c = true;
                ArrayDeque arrayDeque = this.b;
                if (arrayDeque.size() != 1 || ((b) arrayDeque.getFirst()).b != null) {
                    StringBuilder sb = new StringBuilder(illegalArgumentException.getMessage());
                    Iterator itDescendingIterator = arrayDeque.descendingIterator();
                    while (itDescendingIterator.hasNext()) {
                        b bVar = (b) itDescendingIterator.next();
                        sb.append("\nfor ");
                        sb.append(bVar.a);
                        String str = bVar.b;
                        if (str != null) {
                            sb.append(' ');
                            sb.append(str);
                        }
                    }
                    return new IllegalArgumentException(sb.toString(), illegalArgumentException);
                }
            }
            return illegalArgumentException;
        }

        public final void b(boolean z) {
            this.b.removeLast();
            if (this.b.isEmpty()) {
                C3903g11.this.b.remove();
                if (z) {
                    synchronized (C3903g11.this.c) {
                        try {
                            int size = this.a.size();
                            for (int i = 0; i < size; i++) {
                                b bVar = (b) this.a.get(i);
                                AbstractC5897pG0<T> abstractC5897pG0 = (AbstractC5897pG0) C3903g11.this.c.put(bVar.c, bVar.d);
                                if (abstractC5897pG0 != 0) {
                                    bVar.d = abstractC5897pG0;
                                    C3903g11.this.c.put(bVar.c, abstractC5897pG0);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }
    }

    static {
        ArrayList arrayList = new ArrayList(5);
        d = arrayList;
        arrayList.add(C3984gP1.a);
        arrayList.add(OE.b);
        arrayList.add(EW0.c);
        arrayList.add(C6831tj.c);
        arrayList.add(C1543Mo1.a);
        arrayList.add(RC.d);
    }

    public C3903g11(a aVar) {
        ArrayList arrayList = aVar.a;
        int size = arrayList.size();
        ArrayList arrayList2 = d;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size);
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        this.a = Collections.unmodifiableList(arrayList3);
    }

    @CheckReturnValue
    public final <T> AbstractC5897pG0<T> a(Class<T> cls) {
        return c(cls, C6596sc2.a, null);
    }

    @CheckReturnValue
    public final <T> AbstractC5897pG0<T> b(Type type, Set<? extends Annotation> set) {
        return c(type, set, null);
    }

    @CheckReturnValue
    public final <T> AbstractC5897pG0<T> c(Type type, Set<? extends Annotation> set, @Nullable String str) {
        b bVar;
        if (type == null) {
            throw new NullPointerException("type == null");
        }
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type typeG = C6596sc2.g(C6596sc2.a(type));
        Object objAsList = set.isEmpty() ? typeG : Arrays.asList(typeG, set);
        synchronized (this.c) {
            try {
                AbstractC5897pG0<T> abstractC5897pG0 = (AbstractC5897pG0) this.c.get(objAsList);
                if (abstractC5897pG0 != null) {
                    return abstractC5897pG0;
                }
                c cVar = this.b.get();
                if (cVar == null) {
                    cVar = new c();
                    this.b.set(cVar);
                }
                ArrayList arrayList = cVar.a;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    ArrayDeque arrayDeque = cVar.b;
                    if (i >= size) {
                        b bVar2 = new b(typeG, str, objAsList);
                        arrayList.add(bVar2);
                        arrayDeque.add(bVar2);
                        bVar = null;
                        break;
                    }
                    bVar = (b) arrayList.get(i);
                    if (bVar.c.equals(objAsList)) {
                        arrayDeque.add(bVar);
                        AbstractC5897pG0<T> abstractC5897pG1 = bVar.d;
                        if (abstractC5897pG1 == null) {
                            break;
                        }
                        bVar = abstractC5897pG1;
                        break;
                    }
                    i++;
                }
                try {
                    if (bVar != null) {
                        cVar.b(false);
                        return bVar;
                    }
                    try {
                        int size2 = this.a.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            AbstractC5897pG0<T> abstractC5897pG2 = (AbstractC5897pG0<T>) this.a.get(i2).a(typeG, set, this);
                            if (abstractC5897pG2 != null) {
                                ((b) cVar.b.getLast()).d = abstractC5897pG2;
                                cVar.b(true);
                                return abstractC5897pG2;
                            }
                        }
                        throw new IllegalArgumentException("No JsonAdapter for " + C6596sc2.j(typeG, set));
                    } catch (IllegalArgumentException e) {
                        throw cVar.a(e);
                    }
                } catch (Throwable th) {
                    cVar.b(false);
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @CheckReturnValue
    public final AbstractC5897pG0 d(I7 i7, Type type, Set set) {
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type typeG = C6596sc2.g(C6596sc2.a(type));
        List<AbstractC5897pG0.a> list = this.a;
        int iIndexOf = list.indexOf(i7);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Unable to skip past unknown factory " + i7);
        }
        int size = list.size();
        for (int i = iIndexOf + 1; i < size; i++) {
            AbstractC5897pG0<?> abstractC5897pG0A = list.get(i).a(typeG, set, this);
            if (abstractC5897pG0A != null) {
                return abstractC5897pG0A;
            }
        }
        throw new IllegalArgumentException("No next JsonAdapter for " + C6596sc2.j(typeG, set));
    }
}
