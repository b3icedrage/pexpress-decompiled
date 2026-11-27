package com.appsflyer.internal;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import defpackage.C2688aH1;
import defpackage.NG1;
import io.sentry.android.core.AnrIntegration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.util.C4527a;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ m(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [fO0, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                AFe1wSDK.AFKeystoreWrapper((AFe1wSDK) this.e, (AFe1ySDK) this.g);
                return;
            case 1:
                SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.g;
                AnrIntegration anrIntegration = (AnrIntegration) this.e;
                C4527a.C0404a c0404aA = anrIntegration.g.a();
                try {
                    if (!anrIntegration.e) {
                        anrIntegration.c(sentryAndroidOptions);
                        break;
                    }
                    c0404aA.close();
                    return;
                } catch (Throwable th) {
                    try {
                        c0404aA.close();
                        break;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 2:
                io.sentry.android.replay.screenshot.e eVar = (io.sentry.android.replay.screenshot.e) this.e;
                boolean z = eVar.k.get();
                C2688aH1 c2688aH1 = eVar.b;
                if (!z) {
                    Bitmap bitmap = eVar.f;
                    if (!bitmap.isRecycled()) {
                        Matrix matrix = (Matrix) eVar.g.getValue();
                        eVar.i.c(bitmap, (io.sentry.android.replay.viewhierarchy.b) this.g, matrix);
                        c2688aH1.getReplayController().getClass();
                        eVar.a.A(bitmap);
                        eVar.h.set(true);
                        eVar.j.set(false);
                        return;
                    }
                }
                c2688aH1.getLogger().a(NG1.DEBUG, "PixelCopyStrategy is closed, skipping masking", new Object[0]);
                return;
            default:
                ((io.sentry.cache.m) this.e).f((ConcurrentHashMap) this.g, "tags.json");
                return;
        }
    }

    public /* synthetic */ m(io.sentry.android.replay.screenshot.e eVar, io.sentry.android.replay.viewhierarchy.b bVar, View view) {
        this.d = 2;
        this.e = eVar;
        this.g = bVar;
    }
}
