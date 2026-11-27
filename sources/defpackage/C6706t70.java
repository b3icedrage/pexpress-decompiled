package defpackage;

/* JADX INFO: renamed from: t70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6706t70 {
    public static boolean a() {
        boolean z = C6559sR0.a;
        ClassLoader classLoader = C6706t70.class.getClassLoader();
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        try {
            return classLoader.loadClass("groovy.lang.Binding") != null;
        } catch (ClassNotFoundException unused) {
        }
    }
}
