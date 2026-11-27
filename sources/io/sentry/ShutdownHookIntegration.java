package io.sentry;

import defpackage.C2688aH1;
import defpackage.NG1;
import defpackage.OB0;
import defpackage.RunnableC3329dH;
import io.sentry.util.j;
import io.sentry.util.p;
import java.io.Closeable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class ShutdownHookIntegration implements OB0, Closeable {

    @NotNull
    public final Runtime d;

    @Nullable
    public Thread e;

    public ShutdownHookIntegration() {
        Runtime runtime = Runtime.getRuntime();
        p.b(runtime, "Runtime is required");
        this.d = runtime;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.e != null) {
            try {
                this.d.removeShutdownHook(this.e);
            } catch (IllegalStateException e) {
                String message = e.getMessage();
                if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                    throw e;
                }
            }
        }
    }

    @Override // defpackage.OB0
    public final void t(@NotNull C2688aH1 c2688aH1) {
        if (!c2688aH1.isEnableShutdownHook()) {
            c2688aH1.getLogger().a(NG1.INFO, "enableShutdownHook is disabled.", new Object[0]);
            return;
        }
        this.e = new Thread(new RunnableC3329dH(c2688aH1, 2), "sentry-shutdownhook");
        try {
            this.d.addShutdownHook(this.e);
            c2688aH1.getLogger().a(NG1.DEBUG, "ShutdownHookIntegration installed.", new Object[0]);
            j.a("ShutdownHook");
        } catch (IllegalStateException e) {
            String message = e.getMessage();
            if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                throw e;
            }
        }
    }
}
