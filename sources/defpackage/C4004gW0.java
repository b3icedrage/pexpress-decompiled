package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: gW0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C4004gW0 {
    public static InterfaceC3644em0 a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object objNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (objNewInstance instanceof InterfaceC3644em0) {
                    return (InterfaceC3644em0) objNewInstance;
                }
                throw new RuntimeException(FK.c(objNewInstance, "Expected instanceof GlideModule, but found: "));
            } catch (IllegalAccessException e) {
                b(cls, e);
                throw null;
            } catch (InstantiationException e2) {
                b(cls, e2);
                throw null;
            } catch (NoSuchMethodException e3) {
                b(cls, e3);
                throw null;
            } catch (InvocationTargetException e4) {
                b(cls, e4);
                throw null;
            }
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    public static void b(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, reflectiveOperationException);
    }
}
