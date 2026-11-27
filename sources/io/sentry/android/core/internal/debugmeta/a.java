package io.sentry.android.core.internal.debugmeta;

import android.content.Context;
import defpackage.NG1;
import io.sentry.ILogger;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements io.sentry.internal.debugmeta.a {

    @NotNull
    public final Context a;

    @NotNull
    public final ILogger b;

    public a(@NotNull Context context, @NotNull ILogger iLogger) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext != null ? applicationContext : context;
        this.b = iLogger;
    }

    @Override // io.sentry.internal.debugmeta.a
    @Nullable
    public final List<Properties> a() {
        ILogger iLogger = this.b;
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(this.a.getAssets().open("sentry-debug-meta.properties"));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                List<Properties> listSingletonList = Collections.singletonList(properties);
                bufferedInputStream.close();
                return listSingletonList;
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (FileNotFoundException unused) {
            iLogger.a(NG1.INFO, "%s file was not found.", "sentry-debug-meta.properties");
            return null;
        } catch (IOException e) {
            iLogger.d(NG1.ERROR, "Error getting Proguard UUIDs.", e);
            return null;
        } catch (RuntimeException e2) {
            iLogger.c(NG1.ERROR, e2, "%s file is malformed.", "sentry-debug-meta.properties");
            return null;
        }
    }
}
