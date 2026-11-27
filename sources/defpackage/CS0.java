package defpackage;

import io.sentry.android.core.b0;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class CS0 {
    public static final C8033zS0 a = new C8033zS0();

    public static void a() {
        a.getClass();
    }

    public static void b(String str) {
        a.getClass();
        HashSet hashSet = C8033zS0.a;
        if (hashSet.contains(str)) {
            return;
        }
        b0.f("LOTTIE", str, null);
        hashSet.add(str);
    }

    public static void c(String str, Throwable th) {
        a.getClass();
        HashSet hashSet = C8033zS0.a;
        if (hashSet.contains(str)) {
            return;
        }
        b0.f("LOTTIE", str, th);
        hashSet.add(str);
    }
}
