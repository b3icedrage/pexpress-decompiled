package com.appsflyer.internal;

import android.content.Context;
import defpackage.InterfaceC2347Wu0;
import io.sentry.android.core.ActivityLifecycleIntegration;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
        this.h = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                AFg1tSDK.AFLogger((AFg1tSDK) this.e, (AFh1pSDK) this.g, (Context) this.h);
                break;
            default:
                ((ActivityLifecycleIntegration) this.e).l((InterfaceC2347Wu0) this.g, (InterfaceC2347Wu0) this.h);
                break;
        }
    }
}
