package defpackage;

/* JADX INFO: renamed from: uc2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7016uc2 {
    public static a a = null;
    public static boolean b = false;

    /* JADX INFO: renamed from: uc2$a */
    public static final class a extends SecurityManager {
        @Override // java.lang.SecurityManager
        public final Class<?>[] getClassContext() {
            return super.getClassContext();
        }
    }

    public static final void a(String str) {
        System.err.println("SLF4J: " + str);
    }

    public static final void b(String str, Throwable th) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th.printStackTrace();
    }
}
