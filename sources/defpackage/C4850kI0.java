package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4850kI0 implements Function0 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ C4850kI0(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws C3885fw0 {
        switch (this.d) {
            case 0:
                C5060lI0 c5060lI0 = (C5060lI0) this.e;
                C4640jI0 c4640jI0 = c5060lI0.f;
                if (c4640jI0 == null) {
                    throw new AssertionError("JvmBuiltins instance has not been initialized properly");
                }
                C5060lI0.b bVar = (C5060lI0.b) c4640jI0.invoke();
                c5060lI0.f = null;
                return bVar;
            case 1:
                C3545eJ0.a aVar = (C3545eJ0.a) this.e;
                aVar.getClass();
                IJ0<Object>[] ij0Arr = C3545eJ0.a.p;
                IJ0<Object> ij0 = ij0Arr[13];
                Object objInvoke = aVar.n.invoke();
                Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
                IJ0<Object> ij1 = ij0Arr[14];
                Object objInvoke2 = aVar.o.invoke();
                Intrinsics.checkNotNullExpressionValue(objInvoke2, "getValue(...)");
                return CollectionsKt.Q((Collection) objInvoke, (Collection) objInvoke2);
            case 2:
                KJ0 kj0 = (KJ0) this.e;
                Object objU = kj0.u();
                try {
                    Object obj = OJ0.o;
                    Object objB = kj0.t() ? N7.b(kj0.l, kj0.o()) : null;
                    if (objB == obj) {
                        objB = null;
                    }
                    AccessibleObject accessibleObject = objU != null ? (AccessibleObject) objU : null;
                    if (accessibleObject != null) {
                        accessibleObject.setAccessible(QI0.a(kj0));
                    }
                    if (objU == null) {
                        return null;
                    }
                    if (objU instanceof Field) {
                        return ((Field) objU).get(objB);
                    }
                    if (!(objU instanceof Method)) {
                        throw new AssertionError("delegate field/method " + objU + " neither field nor method");
                    }
                    int length = ((Method) objU).getParameterTypes().length;
                    if (length == 0) {
                        return ((Method) objU).invoke(null, new Object[0]);
                    }
                    if (length == 1) {
                        Method method = (Method) objU;
                        if (objB == null) {
                            Class<?> cls = ((Method) objU).getParameterTypes()[0];
                            Intrinsics.checkNotNullExpressionValue(cls, "get(...)");
                            objB = C7437wc2.e(cls);
                        }
                        return method.invoke(null, objB);
                    }
                    if (length == 2) {
                        Method method2 = (Method) objU;
                        Class<?> cls2 = ((Method) objU).getParameterTypes()[1];
                        Intrinsics.checkNotNullExpressionValue(cls2, "get(...)");
                        return method2.invoke(null, objB, C7437wc2.e(cls2));
                    }
                    throw new AssertionError("delegate method " + objU + " should take 0, 1, or 2 parameters");
                } catch (IllegalAccessException cause) {
                    Intrinsics.checkNotNullParameter(cause, "cause");
                    throw new C3885fw0("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", cause);
                }
            default:
                return R70.c(Q70.CANNOT_COMPUTE_ERASED_BOUND, ((M62) this.e).toString());
        }
    }
}
