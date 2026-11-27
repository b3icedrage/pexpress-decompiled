package io.sentry.android.core.internal.modules;

import android.content.Context;
import defpackage.NG1;
import defpackage.RunnableC0675Bl;
import io.sentry.ILogger;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.internal.modules.d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends d {

    @NotNull
    public final Context e;

    public a(@NotNull Context context, @NotNull SentryAndroidOptions sentryAndroidOptions) {
        super(sentryAndroidOptions.getLogger());
        Context applicationContext = context.getApplicationContext();
        this.e = applicationContext != null ? applicationContext : context;
        try {
            sentryAndroidOptions.getExecutorService().submit(new RunnableC0675Bl(this, 2));
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().d(NG1.ERROR, "AssetsModulesLoader submit failed", th);
        }
    }

    @Override // io.sentry.internal.modules.d
    public final Map<String, String> b() {
        ILogger iLogger = this.a;
        TreeMap treeMap = new TreeMap();
        try {
            InputStream inputStreamOpen = this.e.getAssets().open("sentry-external-modules.txt");
            try {
                TreeMap treeMapC = c(inputStreamOpen);
                if (inputStreamOpen == null) {
                    return treeMapC;
                }
                inputStreamOpen.close();
                return treeMapC;
            } catch (Throwable th) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused) {
            iLogger.a(NG1.INFO, "%s file was not found.", "sentry-external-modules.txt");
            return treeMap;
        } catch (IOException e) {
            iLogger.d(NG1.ERROR, "Error extracting modules.", e);
            return treeMap;
        }
    }
}
