package io.sentry.internal.modules;

import defpackage.NG1;
import io.sentry.ILogger;
import io.sentry.util.C4528b;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends d {

    @NotNull
    public final ClassLoader e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@NotNull ILogger iLogger) {
        super(iLogger);
        ClassLoader classLoader = f.class.getClassLoader();
        this.e = C4528b.a(classLoader);
    }

    @Override // io.sentry.internal.modules.d
    public final Map<String, String> b() {
        ILogger iLogger = this.a;
        TreeMap treeMap = new TreeMap();
        try {
            InputStream resourceAsStream = this.e.getResourceAsStream("sentry-external-modules.txt");
            try {
                if (resourceAsStream != null) {
                    TreeMap treeMapC = c(resourceAsStream);
                    resourceAsStream.close();
                    return treeMapC;
                }
                iLogger.a(NG1.INFO, "%s file was not found.", "sentry-external-modules.txt");
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                    return treeMap;
                }
                return treeMap;
            } catch (Throwable th) {
                if (resourceAsStream != null) {
                    try {
                        resourceAsStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            iLogger.d(NG1.INFO, "Access to resources failed.", e);
        } catch (SecurityException e2) {
            iLogger.d(NG1.INFO, "Access to resources denied.", e2);
        }
    }
}
