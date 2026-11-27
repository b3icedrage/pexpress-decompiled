package defpackage;

import android.content.Context;
import com.appsflyer.internal.AFi1aSDK;
import com.appsflyer.internal.AFi1gSDK;
import com.google.firebase.perf.session.SessionManager;

/* JADX INFO: renamed from: cX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3167cX implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ RunnableC3167cX(AFi1aSDK aFi1aSDK, AFi1gSDK aFi1gSDK, Runnable runnable) {
        this.d = 2;
        this.e = aFi1aSDK;
        this.h = aFi1gSDK;
        this.g = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                ScheduledExecutorServiceC3796fX scheduledExecutorServiceC3796fX = (ScheduledExecutorServiceC3796fX) this.e;
                int i = 0;
                scheduledExecutorServiceC3796fX.d.execute(new WW(i, (Runnable) this.g, (ScheduledFutureC4006gX.a) this.h));
                break;
            case 1:
                ((SessionManager) this.e).lambda$setApplicationContext$0((Context) this.g, (C5760od1) this.h);
                break;
            default:
                ((AFi1aSDK) this.e).AFLogger((AFi1gSDK) this.h, (Runnable) this.g);
                break;
        }
    }

    public /* synthetic */ RunnableC3167cX(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
        this.h = obj3;
    }
}
