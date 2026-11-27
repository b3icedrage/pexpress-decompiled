package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: sD1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ThreadFactoryC6518sD1 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "IO-Thread");
    }
}
