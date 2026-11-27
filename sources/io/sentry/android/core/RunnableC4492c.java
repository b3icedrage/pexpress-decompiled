package io.sentry.android.core;

import android.app.Activity;

/* JADX INFO: renamed from: io.sentry.android.core.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC4492c implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ RunnableC4492c(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                ((C4494e) this.e).a.a().a((Activity) this.g);
                break;
            default:
                io.sentry.cache.m mVar = (io.sentry.cache.m) this.e;
                String str = (String) this.g;
                if (str != null) {
                    mVar.f(str, "transaction.json");
                } else {
                    mVar.a("transaction.json");
                }
                break;
        }
    }
}
