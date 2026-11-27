package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RH implements ThreadFactory {
    public final /* synthetic */ String d;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.d);
        thread.setPriority(10);
        return thread;
    }
}
