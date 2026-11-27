package io.sentry.util;

import java.lang.ref.WeakReference;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class q<A, B> {

    @Nullable
    public final WeakReference a;

    @Nullable
    public final String b;

    public q(@Nullable WeakReference weakReference, @Nullable String str) {
        this.a = weakReference;
        this.b = str;
    }
}
