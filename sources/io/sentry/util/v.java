package io.sentry.util;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class v {

    @NotNull
    public static final a a = new a();

    public static class a extends ThreadLocal<t> {
        @Override // java.lang.ThreadLocal
        public final t initialValue() {
            return new t();
        }
    }

    @NotNull
    public static t a() {
        return a.get();
    }
}
