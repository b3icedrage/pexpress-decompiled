package androidx.lifecycle;

import defpackage.EP0;
import defpackage.FP0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class a {
    public static final a c = new a();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    /* JADX INFO: renamed from: androidx.lifecycle.a$a, reason: collision with other inner class name */
    @Deprecated
    public static class C0234a {
        public final HashMap a = new HashMap();
        public final HashMap b;

        public C0234a(HashMap map) {
            this.b = map;
            for (Map.Entry entry : map.entrySet()) {
                g.a aVar = (g.a) entry.getValue();
                List arrayList = (List) this.a.get(aVar);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.a.put(aVar, arrayList);
                }
                arrayList.add((b) entry.getKey());
            }
        }

        public static void a(List list, FP0 fp0, g.a aVar, EP0 ep0) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    b bVar = (b) list.get(size);
                    bVar.getClass();
                    try {
                        int i = bVar.a;
                        Method method = bVar.b;
                        if (i == 0) {
                            method.invoke(ep0, new Object[0]);
                        } else if (i == 1) {
                            method.invoke(ep0, fp0);
                        } else if (i == 2) {
                            method.invoke(ep0, fp0, aVar);
                        }
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException("Failed to call observer method", e2.getCause());
                    }
                }
            }
        }
    }

    @Deprecated
    public static final class b {
        public final int a;
        public final Method b;

        public b(int i, Method method) {
            this.a = i;
            this.b = method;
            method.setAccessible(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b.getName().equals(bVar.b.getName());
        }

        public final int hashCode() {
            return this.b.getName().hashCode() + (this.a * 31);
        }
    }

    public static void b(HashMap map, b bVar, g.a aVar, Class cls) {
        g.a aVar2 = (g.a) map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    public final C0234a a(Class<?> cls, Method[] methodArr) {
        int i;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.a;
        if (superclass != null) {
            C0234a c0234aA = (C0234a) map2.get(superclass);
            if (c0234aA == null) {
                c0234aA = a(superclass, null);
            }
            map.putAll(c0234aA.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0234a c0234aA2 = (C0234a) map2.get(cls2);
            if (c0234aA2 == null) {
                c0234aA2 = a(cls2, null);
            }
            for (Map.Entry entry : c0234aA2.b.entrySet()) {
                b(map, (b) entry.getKey(), (g.a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            m mVar = (m) method.getAnnotation(m.class);
            if (mVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!FP0.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                g.a aVarValue = mVar.value();
                if (parameterTypes.length > 1) {
                    if (!g.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (aVarValue != g.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(map, new b(i, method), aVarValue, cls);
                z = true;
            }
        }
        C0234a c0234a = new C0234a(map);
        map2.put(cls, c0234a);
        this.b.put(cls, Boolean.valueOf(z));
        return c0234a;
    }
}
