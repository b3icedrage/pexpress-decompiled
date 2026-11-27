package io.sentry.android.core;

import android.app.Activity;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class G {

    @NotNull
    public static final G b = new G();

    @Nullable
    public WeakReference<Activity> a;

    public final void a(@NotNull Activity activity) {
        WeakReference<Activity> weakReference = this.a;
        if (weakReference == null || weakReference.get() != activity) {
            this.a = new WeakReference<>(activity);
        }
    }
}
