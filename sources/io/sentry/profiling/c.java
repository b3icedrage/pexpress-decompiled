package io.sentry.profiling;

import defpackage.InterfaceC1405Ku0;
import defpackage.InterfaceC5394ms0;
import defpackage.NG1;
import defpackage.X41;
import io.sentry.ILogger;
import java.util.Iterator;
import java.util.ServiceLoader;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    @NotNull
    public static InterfaceC5394ms0 a(ILogger iLogger, String str, int i, InterfaceC1405Ku0 interfaceC1405Ku0) {
        X41 x41 = X41.d;
        try {
            Iterator it = ServiceLoader.load(a.class).iterator();
            a aVar = (a) (it.hasNext() ? it.next() : null);
            if (aVar != null) {
                iLogger.a(NG1.DEBUG, "Loaded continuous profiler from provider: %s", aVar.getClass().getName());
                return aVar.a();
            }
            iLogger.a(NG1.DEBUG, "No continuous profiler provider found, using NoOpContinuousProfiler", new Object[0]);
            return x41;
        } catch (Throwable th) {
            iLogger.d(NG1.ERROR, "Failed to load continuous profiler provider, using NoOpContinuousProfiler", th);
            return x41;
        }
    }
}
