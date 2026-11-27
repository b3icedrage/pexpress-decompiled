package io.sentry.util;

import defpackage.L02;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class u {
    @NotNull
    public static L02 a(@NotNull L02 l02) {
        if (l02.c != null) {
            return l02;
        }
        return new L02(l02.a, l02.b, b(null, l02.b, l02.a), l02.d, l02.e);
    }

    @NotNull
    public static Double b(@Nullable Double d, @Nullable Double d2, @Nullable Boolean bool) {
        if (d != null) {
            return d;
        }
        double dC = v.a().c();
        if (d2 == null || bool == null) {
            return Double.valueOf(dC);
        }
        if (bool.booleanValue()) {
            return Double.valueOf(d2.doubleValue() * dC);
        }
        return Double.valueOf(((1.0d - d2.doubleValue()) * dC) + d2.doubleValue());
    }

    public static boolean c(@Nullable Double d, boolean z) {
        if (d == null) {
            return z;
        }
        return !d.isNaN() && d.doubleValue() >= 0.0d && d.doubleValue() <= 1.0d;
    }
}
