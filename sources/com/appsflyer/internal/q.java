package com.appsflyer.internal;

import defpackage.InterfaceC2347Wu0;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.ndk.NativeScope;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
        this.h = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                ((AFi1aSDK) this.e).d((ExecutorService) this.g, (Runnable) this.h);
                break;
            case 1:
                ((ActivityLifecycleIntegration) this.e).l((InterfaceC2347Wu0) this.g, (InterfaceC2347Wu0) this.h);
                break;
            default:
                ((io.sentry.android.ndk.c) this.e).b.getClass();
                NativeScope.nativeSetExtra((String) this.g, (String) this.h);
                break;
        }
    }
}
