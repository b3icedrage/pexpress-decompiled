package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class F62 {
    public static Collection a(Collection collection) {
        if ((collection instanceof InterfaceC6745tJ0) && !(collection instanceof InterfaceC6955uJ0)) {
            g(collection, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            return collection;
        } catch (ClassCastException e) {
            Intrinsics.i(e, F62.class.getName());
            throw e;
        }
    }

    public static List b(List list) {
        if (!(list instanceof InterfaceC6745tJ0) || (list instanceof InterfaceC7165vJ0)) {
            return list;
        }
        g(list, "kotlin.collections.MutableList");
        throw null;
    }

    public static Map c(Object obj) {
        if ((obj instanceof InterfaceC6745tJ0) && !(obj instanceof InterfaceC7376wJ0)) {
            g(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            Intrinsics.i(e, F62.class.getName());
            throw e;
        }
    }

    public static Set d(Object obj) {
        if ((obj instanceof InterfaceC6745tJ0) && !(obj instanceof DJ0)) {
            g(obj, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            Intrinsics.i(e, F62.class.getName());
            throw e;
        }
    }

    public static void e(int i, Object obj) {
        if (obj == null || f(i, obj)) {
            return;
        }
        g(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static boolean f(int i, Object obj) {
        int arity;
        if (obj instanceof Function) {
            if (obj instanceof InterfaceC1764Pj0) {
                arity = ((InterfaceC1764Pj0) obj).getArity();
            } else if (obj instanceof Function0) {
                arity = 0;
            } else if (obj instanceof Function1) {
                arity = 1;
            } else if (obj instanceof Function2) {
                arity = 2;
            } else if (obj instanceof InterfaceC1060Gj0) {
                arity = 3;
            } else if (obj instanceof InterfaceC1138Hj0) {
                arity = 4;
            } else if (obj instanceof InterfaceC1216Ij0) {
                arity = 5;
            } else if (obj instanceof InterfaceC1294Jj0) {
                arity = 6;
            } else if (obj instanceof InterfaceC1372Kj0) {
                arity = 7;
            } else if (obj instanceof InterfaceC1450Lj0) {
                arity = 8;
            } else if (obj instanceof InterfaceC1527Mj0) {
                arity = 9;
            } else if (obj instanceof InterfaceC6622sj0) {
                arity = 10;
            } else if (obj instanceof InterfaceC6832tj0) {
                arity = 11;
            } else if (obj instanceof InterfaceC7042uj0) {
                arity = 12;
            } else if (obj instanceof InterfaceC7252vj0) {
                arity = 13;
            } else if (obj instanceof InterfaceC7463wj0) {
                arity = 14;
            } else if (obj instanceof InterfaceC7673xj0) {
                arity = 15;
            } else if (obj instanceof InterfaceC7883yj0) {
                arity = 16;
            } else if (obj instanceof InterfaceC8093zj0) {
                arity = 17;
            } else if (obj instanceof InterfaceC0592Aj0) {
                arity = 18;
            } else if (obj instanceof InterfaceC0670Bj0) {
                arity = 19;
            } else if (obj instanceof InterfaceC0826Dj0) {
                arity = 20;
            } else if (obj instanceof InterfaceC0904Ej0) {
                arity = 21;
            } else {
                arity = obj instanceof InterfaceC0982Fj0 ? 22 : -1;
            }
            if (arity == i) {
                return true;
            }
        }
        return false;
    }

    public static void g(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(C2629a1.b(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        Intrinsics.i(classCastException, F62.class.getName());
        throw classCastException;
    }
}
