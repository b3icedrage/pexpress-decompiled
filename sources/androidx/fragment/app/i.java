package androidx.fragment.app;

import androidx.annotation.NonNull;
import defpackage.C1039Gc0;
import defpackage.C2703aM1;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class i {
    public static final C2703aM1<ClassLoader, C2703aM1<String, Class<?>>> a = new C2703aM1<>();

    @NonNull
    public static Class<?> b(@NonNull ClassLoader classLoader, @NonNull String str) throws ClassNotFoundException {
        C2703aM1<ClassLoader, C2703aM1<String, Class<?>>> c2703aM1 = a;
        C2703aM1<String, Class<?>> orDefault = c2703aM1.getOrDefault(classLoader, null);
        if (orDefault == null) {
            orDefault = new C2703aM1<>();
            c2703aM1.put(classLoader, orDefault);
        }
        Class<?> orDefault2 = orDefault.getOrDefault(str, null);
        if (orDefault2 != null) {
            return orDefault2;
        }
        Class<?> cls = Class.forName(str, false, classLoader);
        orDefault.put(str, cls);
        return cls;
    }

    @NonNull
    public static Class<? extends Fragment> c(@NonNull ClassLoader classLoader, @NonNull String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new Fragment.k(C1039Gc0.d("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new Fragment.k(C1039Gc0.d("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    @NonNull
    public Fragment a(@NonNull ClassLoader classLoader, @NonNull String str) {
        try {
            return c(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e) {
            throw new Fragment.k(C1039Gc0.d("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new Fragment.k(C1039Gc0.d("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new Fragment.k(C1039Gc0.d("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new Fragment.k(C1039Gc0.d("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
