package io.sentry.android.core;

import defpackage.C2688aH1;
import defpackage.NG1;

/* JADX INFO: renamed from: io.sentry.android.core.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4503n extends io.sentry.logger.f implements AppState.a {

    /* JADX INFO: renamed from: io.sentry.android.core.n$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C4503n.this.d(5000L);
        }
    }

    @Override // io.sentry.logger.f, io.sentry.logger.c
    public final void a(boolean z) {
        AppState.i.k(this);
        super.a(z);
    }

    @Override // io.sentry.android.core.AppState.a
    public final void c() {
    }

    @Override // io.sentry.android.core.AppState.a
    public final void f() {
        C2688aH1 c2688aH1 = this.d;
        try {
            c2688aH1.getExecutorService().submit(new a());
        } catch (Throwable th) {
            c2688aH1.getLogger().c(NG1.ERROR, th, "Failed to submit log flush in onBackground()", new Object[0]);
        }
    }
}
