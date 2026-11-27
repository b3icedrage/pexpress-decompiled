package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class EY1 {

    @NotNull
    public static final ThreadLocal<A80> a = new ThreadLocal<>();

    @NotNull
    public static A80 a() {
        ThreadLocal<A80> threadLocal = a;
        A80 a80 = threadLocal.get();
        if (a80 != null) {
            return a80;
        }
        C4085gt c4085gt = new C4085gt(Thread.currentThread());
        threadLocal.set(c4085gt);
        return c4085gt;
    }
}
