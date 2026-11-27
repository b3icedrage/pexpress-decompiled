package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Up1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2173Up1 {

    /* JADX INFO: renamed from: Up1$a */
    public static abstract class a {
        public static final a a;

        /* JADX INFO: renamed from: Up1$a$a, reason: collision with other inner class name */
        public class C0157a extends a {
            public final /* synthetic */ Method b;

            public C0157a(Method method) {
                this.b = method;
            }

            @Override // defpackage.C2173Up1.a
            public final boolean a(Object obj, AccessibleObject accessibleObject) {
                try {
                    return ((Boolean) this.b.invoke(accessibleObject, obj)).booleanValue();
                } catch (Exception e) {
                    throw new RuntimeException("Failed invoking canAccess", e);
                }
            }
        }

        /* JADX INFO: renamed from: Up1$a$b */
        public class b extends a {
            @Override // defpackage.C2173Up1.a
            public final boolean a(Object obj, AccessibleObject accessibleObject) {
                return true;
            }
        }

        static {
            a c0157a;
            if (C4163hF0.a >= 9) {
                try {
                    c0157a = new C0157a(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
                } catch (NoSuchMethodException unused) {
                    c0157a = null;
                }
            } else {
                c0157a = null;
            }
            if (c0157a == null) {
                c0157a = new b();
            }
            a = c0157a;
        }

        public abstract boolean a(Object obj, AccessibleObject accessibleObject);
    }

    public static InterfaceC2095Tp1.a a(Class cls, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC2095Tp1.a aVarA = ((InterfaceC2095Tp1) it.next()).a();
            if (aVarA != InterfaceC2095Tp1.a.e) {
                return aVarA;
            }
        }
        return InterfaceC2095Tp1.a.d;
    }
}
