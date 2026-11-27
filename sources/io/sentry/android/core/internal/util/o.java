package io.sentry.android.core.internal.util;

import android.content.Context;
import io.sentry.ILogger;
import io.sentry.android.core.E;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o {
    public static final Charset g = Charset.forName("UTF-8");

    @NotNull
    public final Context a;

    @NotNull
    public final E b;

    @NotNull
    public final ILogger c;

    @NotNull
    public final String[] d;

    @NotNull
    public final String[] e;

    @NotNull
    public final Runtime f;

    public o(@NotNull Context context, @NotNull E e, @NotNull ILogger iLogger) {
        Runtime runtime = Runtime.getRuntime();
        this.a = context;
        io.sentry.util.p.b(e, "The BuildInfoProvider is required.");
        this.b = e;
        io.sentry.util.p.b(iLogger, "The Logger is required.");
        this.c = iLogger;
        this.d = new String[]{"/sbin/su", "/data/local/xbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/bin/su", "/system/app/Superuser.apk", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"};
        this.e = new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"};
        io.sentry.util.p.b(runtime, "The Runtime is required.");
        this.f = runtime;
    }
}
