package io.sentry.android.core;

import android.os.SystemClock;
import defpackage.NG1;
import java.io.IOException;

/* JADX INFO: renamed from: io.sentry.android.core.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC4490a implements Runnable {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ Object e;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                C4491b c4491b = (C4491b) this.e;
                c4491b.getClass();
                c4491b.l = SystemClock.uptimeMillis();
                c4491b.m.set(false);
                break;
            default:
                io.sentry.cache.m mVar = (io.sentry.cache.m) this.e;
                mVar.getClass();
                try {
                    mVar.b.a().clear();
                } catch (IOException e) {
                    mVar.a.getLogger().d(NG1.ERROR, "Failed to clear breadcrumbs from file queue", e);
                }
                break;
        }
    }

    public /* synthetic */ RunnableC4490a(io.sentry.cache.m mVar) {
        this.e = mVar;
    }
}
