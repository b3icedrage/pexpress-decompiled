package defpackage;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class BX1 {

    @NotNull
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;

    @NotNull
    public static final C7528x21 f;

    @NotNull
    public static final C6998uX1 g;

    @NotNull
    public static final C6998uX1 h;

    static {
        String property;
        int i = C3379dX1.a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        a = property;
        b = C8056za.u(100000L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.resolution.ns");
        int i2 = C3379dX1.a;
        if (i2 < 2) {
            i2 = 2;
        }
        c = C8056za.v(i2, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = C8056za.v(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        e = TimeUnit.SECONDS.toNanos(C8056za.u(60L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.keep.alive.sec"));
        f = C7528x21.e;
        g = new C6998uX1(0);
        h = new C6998uX1(1);
    }
}
