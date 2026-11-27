package io.sentry.android.core;

import io.sentry.ILogger;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class B implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ B(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                ((AppState) this.e).f((ILogger) this.g);
                break;
            default:
                ((io.sentry.cache.m) this.e).f((ConcurrentHashMap) this.g, "extras.json");
                break;
        }
    }
}
