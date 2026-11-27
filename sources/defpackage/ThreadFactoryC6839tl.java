package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: tl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC6839tl implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "auth-telemetry");
        thread.setDaemon(true);
        return thread;
    }
}
