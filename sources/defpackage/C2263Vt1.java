package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Vt1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2263Vt1 {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final InterfaceC1023Fx.a b;
    public final C1318Jr0 c;
    public final List<WM.a> d;
    public final List<InterfaceC1179Hx.a> e;

    @Nullable
    public final Executor f;

    /* JADX INFO: renamed from: Vt1$a */
    public class a implements InvocationHandler {
        public final C1981Sd1 a = C1981Sd1.b;
        public final Object[] b = new Object[0];
        public final /* synthetic */ Class c;

        public a(Class cls) {
            this.c = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public final Object invoke(Object obj, Method method, @Nullable Object[] objArr) {
            AbstractC6323rI1 abstractC6323rI1B;
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.b;
            }
            C1981Sd1 c1981Sd1 = this.a;
            c1981Sd1.getClass();
            if (method.isDefault()) {
                return c1981Sd1.b(method, this.c, obj, objArr);
            }
            C2263Vt1 c2263Vt1 = C2263Vt1.this;
            AbstractC6323rI1 abstractC6323rI1 = (AbstractC6323rI1) c2263Vt1.a.get(method);
            if (abstractC6323rI1 == null) {
                synchronized (c2263Vt1.a) {
                    try {
                        abstractC6323rI1B = (AbstractC6323rI1) c2263Vt1.a.get(method);
                        if (abstractC6323rI1B == null) {
                            abstractC6323rI1B = AbstractC6323rI1.b(c2263Vt1, method);
                            c2263Vt1.a.put(method, abstractC6323rI1B);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                abstractC6323rI1 = abstractC6323rI1B;
            }
            return abstractC6323rI1.a(objArr);
        }
    }

    /* JADX INFO: renamed from: Vt1$b */
    public static final class b {
        public final C1981Sd1 a;

        @Nullable
        public C6711t81 b;

        @Nullable
        public C1318Jr0 c;
        public final ArrayList d;
        public final ArrayList e;

        public b() {
            C1981Sd1 c1981Sd1 = C1981Sd1.b;
            this.d = new ArrayList();
            this.e = new ArrayList();
            this.a = c1981Sd1;
        }

        public final void a(WM.a aVar) {
            ArrayList arrayList = this.d;
            Objects.requireNonNull(aVar, "factory == null");
            arrayList.add(aVar);
        }

        public final void b(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            C1318Jr0.a aVar = new C1318Jr0.a();
            aVar.e(null, str);
            C1318Jr0 c1318Jr0A = aVar.a();
            ArrayList arrayList = c1318Jr0A.f;
            if ("".equals(arrayList.get(arrayList.size() - 1))) {
                this.c = c1318Jr0A;
            } else {
                throw new IllegalArgumentException("baseUrl must end in /: " + c1318Jr0A);
            }
        }

        public final C2263Vt1 c() {
            if (this.c == null) {
                throw new IllegalStateException("Base URL required.");
            }
            C6711t81 c6711t81 = this.b;
            if (c6711t81 == null) {
                c6711t81 = new C6711t81();
            }
            C6711t81 c6711t82 = c6711t81;
            Executor executorA = this.a.a();
            ArrayList arrayList = new ArrayList(this.e);
            arrayList.addAll(Arrays.asList(EG.a, new UU(executorA)));
            ArrayList arrayList2 = this.d;
            ArrayList arrayList3 = new ArrayList(arrayList2.size() + 2);
            C6032pv c6032pv = new C6032pv();
            c6032pv.a = true;
            arrayList3.add(c6032pv);
            arrayList3.addAll(arrayList2);
            arrayList3.addAll(Collections.singletonList(C2969ba1.a));
            return new C2263Vt1(c6711t82, this.c, Collections.unmodifiableList(arrayList3), Collections.unmodifiableList(arrayList), executorA);
        }
    }

    public C2263Vt1(InterfaceC1023Fx.a aVar, C1318Jr0 c1318Jr0, List list, List list2, @Nullable Executor executor) {
        this.b = aVar;
        this.c = c1318Jr0;
        this.d = list;
        this.e = list2;
        this.f = executor;
    }

    public final InterfaceC1179Hx<?, ?> a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List<InterfaceC1179Hx.a> list = this.e;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            InterfaceC1179Hx<?, ?> interfaceC1179HxA = list.get(i).a(type, annotationArr, this);
            if (interfaceC1179HxA != null) {
                return interfaceC1179HxA;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(list.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> T b(Class<T> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class<T> cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                sb.append(cls2.getName());
                if (cls2 != cls) {
                    sb.append(" which is an interface of ");
                    sb.append(cls.getName());
                }
                throw new IllegalArgumentException(sb.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    public final <T> WM<T, AbstractC5395ms1> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List<WM.a> list = this.d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            WM<T, AbstractC5395ms1> wm = (WM<T, AbstractC5395ms1>) list.get(i).a(type, annotationArr, annotationArr2, this);
            if (wm != null) {
                return wm;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(list.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> WM<AbstractC1091Gt1, T> d(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List<WM.a> list = this.d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            WM<AbstractC1091Gt1, T> wm = (WM<AbstractC1091Gt1, T>) list.get(i).b(type, annotationArr, this);
            if (wm != null) {
                return wm;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(list.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> WM<T, String> e(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List<WM.a> list = this.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            WM<T, String> wm = (WM<T, String>) list.get(i).c(type, annotationArr, this);
            if (wm != null) {
                return wm;
            }
        }
        return C6032pv.d.a;
    }
}
