package defpackage;

import android.app.Application;

/* JADX INFO: renamed from: g7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3925g7 implements Runnable {
    public final /* synthetic */ Application d;
    public final /* synthetic */ C4345i7.a e;

    public RunnableC3925g7(Application application, C4345i7.a aVar) {
        this.d = application;
        this.e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.unregisterActivityLifecycleCallbacks(this.e);
    }
}
