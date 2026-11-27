package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Hp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1157Hp1 extends AbstractC0845Dp1 implements IE0 {

    @NotNull
    public final Object a;

    public C1157Hp1(@NotNull Object recordComponent) {
        Intrinsics.checkNotNullParameter(recordComponent, "recordComponent");
        this.a = recordComponent;
    }

    @Override // defpackage.AbstractC0845Dp1
    @NotNull
    public final Member O() throws IllegalAccessException, InvocationTargetException {
        Object recordComponent = this.a;
        Intrinsics.checkNotNullParameter(recordComponent, "recordComponent");
        ND0.a aVar = ND0.a;
        Method method = null;
        if (aVar == null) {
            Class<?> cls = recordComponent.getClass();
            try {
                aVar = new ND0.a(cls.getMethod("getType", new Class[0]), cls.getMethod("getAccessor", new Class[0]));
            } catch (NoSuchMethodException unused) {
                aVar = new ND0.a(null, null);
            }
            ND0.a = aVar;
        }
        Method method2 = aVar.b;
        if (method2 != null) {
            Object objInvoke = method2.invoke(recordComponent, new Object[0]);
            Intrinsics.c(objInvoke, "null cannot be cast to non-null type java.lang.reflect.Method");
            method = (Method) objInvoke;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    @Override // defpackage.IE0
    @NotNull
    public final TE0 getType() throws IllegalAccessException, InvocationTargetException {
        Object recordComponent = this.a;
        Intrinsics.checkNotNullParameter(recordComponent, "recordComponent");
        ND0.a aVar = ND0.a;
        Class cls = null;
        if (aVar == null) {
            Class<?> cls2 = recordComponent.getClass();
            try {
                aVar = new ND0.a(cls2.getMethod("getType", new Class[0]), cls2.getMethod("getAccessor", new Class[0]));
            } catch (NoSuchMethodException unused) {
                aVar = new ND0.a(null, null);
            }
            ND0.a = aVar;
        }
        Method method = aVar.a;
        if (method != null) {
            Object objInvoke = method.invoke(recordComponent, new Object[0]);
            Intrinsics.c(objInvoke, "null cannot be cast to non-null type java.lang.Class<*>");
            cls = (Class) objInvoke;
        }
        if (cls != null) {
            return new C7696xp1(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
