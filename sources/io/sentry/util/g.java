package io.sentry.util;

import defpackage.C0841Do0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class g {
    public static C0841Do0 a(Object obj) {
        C0841Do0 c0841Do0 = new C0841Do0();
        c0841Do0.d(obj, "sentry:typeCheckHint");
        return c0841Do0;
    }

    public static boolean b(@NotNull C0841Do0 c0841Do0, @NotNull Class<?> cls) {
        return cls.isInstance(c0841Do0.b("sentry:typeCheckHint"));
    }

    public static boolean c(@NotNull C0841Do0 c0841Do0) {
        return Boolean.TRUE.equals(c0841Do0.c(Boolean.class, "sentry:isFromHybridSdk"));
    }

    public static boolean d(@NotNull C0841Do0 c0841Do0) {
        return !(io.sentry.hints.e.class.isInstance(c0841Do0.b("sentry:typeCheckHint")) || io.sentry.hints.c.class.isInstance(c0841Do0.b("sentry:typeCheckHint"))) || io.sentry.hints.b.class.isInstance(c0841Do0.b("sentry:typeCheckHint"));
    }
}
