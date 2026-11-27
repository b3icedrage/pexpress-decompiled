package defpackage;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* JADX INFO: renamed from: sR0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6559sR0 {
    public static final boolean a;

    /* JADX INFO: renamed from: sR0$a */
    public static class a implements PrivilegedAction<Boolean> {
        @Override // java.security.PrivilegedAction
        public final Boolean run() {
            try {
                AccessController.checkPermission(new RuntimePermission("getClassLoader"));
                return Boolean.TRUE;
            } catch (SecurityException unused) {
                return Boolean.FALSE;
            }
        }
    }

    static {
        String property = null;
        try {
            property = System.getProperty("logback.ignoreTCL", null);
        } catch (SecurityException unused) {
        }
        if (property != null) {
            a = C8056za.w(property, true);
        }
        ((Boolean) AccessController.doPrivileged(new a())).getClass();
    }

    public static ClassLoader a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Argument cannot be null");
        }
        ClassLoader classLoader = obj.getClass().getClassLoader();
        return classLoader == null ? ClassLoader.getSystemClassLoader() : classLoader;
    }
}
