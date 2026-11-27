package defpackage;

/* JADX INFO: renamed from: Cx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0789Cx {
    public static final boolean a;

    static {
        boolean z;
        try {
            Class.forName("java.lang.ClassValue");
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        a = z;
    }
}
