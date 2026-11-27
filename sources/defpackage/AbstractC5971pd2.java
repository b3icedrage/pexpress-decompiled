package defpackage;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: pd2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5971pd2 {
    public final C8092zj<String, Method> a;
    public final C8092zj<String, Method> b;
    public final C8092zj<String, Class> c;

    public AbstractC5971pd2(C8092zj<String, Method> c8092zj, C8092zj<String, Method> c8092zj2, C8092zj<String, Class> c8092zj3) {
        this.a = c8092zj;
        this.b = c8092zj2;
        this.c = c8092zj3;
    }

    public abstract C6181qd2 a();

    public final Class b(Class<? extends InterfaceC6390rd2> cls) throws ClassNotFoundException {
        String name = cls.getName();
        C8092zj<String, Class> c8092zj = this.c;
        Class orDefault = c8092zj.getOrDefault(name, null);
        if (orDefault != null) {
            return orDefault;
        }
        Class<?> cls2 = Class.forName(ID.c(cls.getPackage().getName(), ".", cls.getSimpleName(), "Parcelizer"), false, cls.getClassLoader());
        c8092zj.put(cls.getName(), cls2);
        return cls2;
    }

    public final Method c(String str) throws NoSuchMethodException {
        C8092zj<String, Method> c8092zj = this.a;
        Method orDefault = c8092zj.getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC5971pd2.class.getClassLoader()).getDeclaredMethod("read", AbstractC5971pd2.class);
        c8092zj.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        C8092zj<String, Method> c8092zj = this.b;
        Method orDefault = c8092zj.getOrDefault(name, null);
        if (orDefault != null) {
            return orDefault;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, AbstractC5971pd2.class);
        c8092zj.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e();

    public abstract byte[] f();

    public abstract CharSequence g();

    public abstract boolean h(int i);

    public abstract int i();

    public abstract <T extends Parcelable> T j();

    public abstract String k();

    public final <T extends InterfaceC6390rd2> T l() {
        String strK = k();
        if (strK == null) {
            return null;
        }
        try {
            return (T) c(strK).invoke(null, a());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public abstract void m(int i);

    public abstract void n(boolean z);

    public abstract void o(byte[] bArr);

    public abstract void p(CharSequence charSequence);

    public abstract void q(int i);

    public abstract void r(Parcelable parcelable);

    public abstract void s(String str);

    /* JADX WARN: Multi-variable type inference failed */
    public final void t(InterfaceC6390rd2 interfaceC6390rd2) {
        if (interfaceC6390rd2 == null) {
            s(null);
            return;
        }
        try {
            s(b(interfaceC6390rd2.getClass()).getName());
            C6181qd2 c6181qd2A = a();
            try {
                d(interfaceC6390rd2.getClass()).invoke(null, interfaceC6390rd2, c6181qd2A);
                c6181qd2A.u();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(interfaceC6390rd2.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
