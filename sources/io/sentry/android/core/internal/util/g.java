package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.os.Build;
import defpackage.C2647a51;
import io.sentry.android.core.E;
import io.sentry.android.core.K;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    @NotNull
    public final E a = new E(C2647a51.a);

    @SuppressLint({"NewApi"})
    public final void a(@NotNull K k) {
        this.a.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || i > 28) {
            return;
        }
        String callingPackage = k.getCallingPackage();
        String packageName = k.getContext().getPackageName();
        if (callingPackage == null || !callingPackage.equals(packageName)) {
            throw new SecurityException("Provider does not allow for granting of Uri permissions");
        }
    }
}
