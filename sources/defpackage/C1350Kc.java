package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Kc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1350Kc implements InvocationHandler {
    public final Class a;
    public final Map b;
    public final KW1 c;
    public final KW1 d;
    public final List e;

    public C1350Kc(Class cls, Map map, KW1 kw1, KW1 kw2, List list) {
        this.a = cls;
        this.b = map;
        this.c = kw1;
        this.d = kw2;
        this.e = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        boolean zA;
        boolean z;
        String name = method.getName();
        Class cls = this.a;
        if (name != null) {
            int iHashCode = name.hashCode();
            if (iHashCode != -1776922004) {
                if (iHashCode != 147696667) {
                    if (iHashCode == 1444986633 && name.equals("annotationType")) {
                        return cls;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(((Number) this.d.getValue()).intValue());
                }
            } else if (name.equals("toString")) {
                return (String) this.c.getValue();
            }
        }
        boolean zA2 = Intrinsics.a(name, "equals");
        Map map = this.b;
        boolean z2 = false;
        if (!zA2 || objArr == null || objArr.length != 1) {
            if (map.containsKey(name)) {
                return map.get(name);
            }
            StringBuilder sb = new StringBuilder("Method is not supported: ");
            sb.append(method);
            sb.append(" (args: ");
            if (objArr == null) {
                objArr = new Object[0];
            }
            sb.append(C1526Mj.F(objArr));
            sb.append(')');
            throw new C3761fL0(sb.toString());
        }
        Object objA = C1526Mj.A(objArr);
        Annotation annotation = objA instanceof Annotation ? (Annotation) objA : null;
        if (Intrinsics.a(annotation != null ? C7279vr.g(C7279vr.e(annotation)) : null, cls)) {
            List list = this.e;
            if (list != null && list.isEmpty()) {
                z = true;
                break;
            }
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                Method method2 = (Method) it.next();
                Object obj2 = map.get(method2.getName());
                Object objInvoke = method2.invoke(objA, new Object[0]);
                if (obj2 instanceof boolean[]) {
                    Intrinsics.c(objInvoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                    zA = Arrays.equals((boolean[]) obj2, (boolean[]) objInvoke);
                } else if (obj2 instanceof char[]) {
                    Intrinsics.c(objInvoke, "null cannot be cast to non-null type kotlin.CharArray");
                    zA = Arrays.equals((char[]) obj2, (char[]) objInvoke);
                } else if (obj2 instanceof byte[]) {
                    Intrinsics.c(objInvoke, "null cannot be cast to non-null type kotlin.ByteArray");
                    zA = Arrays.equals((byte[]) obj2, (byte[]) objInvoke);
                } else if (obj2 instanceof short[]) {
                    Intrinsics.c(objInvoke, "null cannot be cast to non-null type kotlin.ShortArray");
                    zA = Arrays.equals((short[]) obj2, (short[]) objInvoke);
                } else if (obj2 instanceof int[]) {
                    Intrinsics.c(objInvoke, "null cannot be cast to non-null type kotlin.IntArray");
                    zA = Arrays.equals((int[]) obj2, (int[]) objInvoke);
                } else if (obj2 instanceof float[]) {
                    Intrinsics.c(objInvoke, "null cannot be cast to non-null type kotlin.FloatArray");
                    zA = Arrays.equals((float[]) obj2, (float[]) objInvoke);
                } else if (obj2 instanceof long[]) {
                    Intrinsics.c(objInvoke, "null cannot be cast to non-null type kotlin.LongArray");
                    zA = Arrays.equals((long[]) obj2, (long[]) objInvoke);
                } else if (obj2 instanceof double[]) {
                    Intrinsics.c(objInvoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                    zA = Arrays.equals((double[]) obj2, (double[]) objInvoke);
                } else if (obj2 instanceof Object[]) {
                    Intrinsics.c(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
                    zA = Arrays.equals((Object[]) obj2, (Object[]) objInvoke);
                } else {
                    zA = Intrinsics.a(obj2, objInvoke);
                }
                if (!zA) {
                    z = false;
                    break;
                }
            }
            if (z) {
                z2 = true;
            }
        }
        return Boolean.valueOf(z2);
    }
}
