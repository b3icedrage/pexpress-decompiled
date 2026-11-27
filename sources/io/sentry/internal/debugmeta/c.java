package io.sentry.internal.debugmeta;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import defpackage.NG1;
import io.sentry.ILogger;
import io.sentry.util.C4528b;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements a {

    @NotNull
    public final ILogger a;

    @NotNull
    public final ClassLoader b;

    public c(@NotNull ILogger iLogger) {
        ClassLoader classLoader = c.class.getClassLoader();
        this.a = iLogger;
        this.b = C4528b.a(classLoader);
    }

    @Override // io.sentry.internal.debugmeta.a
    @Nullable
    public final List<Properties> a() {
        ILogger iLogger = this.a;
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = this.b.getResources("sentry-debug-meta.properties");
            while (resources.hasMoreElements()) {
                URL urlNextElement = resources.nextElement();
                try {
                    InputStream inputStreamOpenStream = FirebasePerfUrlConnection.openStream(urlNextElement);
                    try {
                        Properties properties = new Properties();
                        properties.load(inputStreamOpenStream);
                        arrayList.add(properties);
                        iLogger.a(NG1.INFO, "Debug Meta Data Properties loaded from %s", urlNextElement);
                        if (inputStreamOpenStream != null) {
                            inputStreamOpenStream.close();
                        }
                    } catch (Throwable th) {
                        if (inputStreamOpenStream != null) {
                            try {
                                inputStreamOpenStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (RuntimeException e) {
                    iLogger.c(NG1.ERROR, e, "%s file is malformed.", urlNextElement);
                }
            }
        } catch (IOException e2) {
            iLogger.c(NG1.ERROR, e2, "Failed to load %s", "sentry-debug-meta.properties");
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        iLogger.a(NG1.INFO, "No %s file was found.", "sentry-debug-meta.properties");
        return null;
    }
}
