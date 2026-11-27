package io.sentry.android.core;

import defpackage.C0702Bu;
import defpackage.C4191hO1;
import defpackage.C4790k10;
import defpackage.NG1;
import defpackage.SD1;
import io.sentry.util.C4527a;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class P implements AppState.a {
    public final AtomicLong d;
    public final long e;

    @Nullable
    public O g;

    @NotNull
    public final io.sentry.util.l<Timer> h;

    @NotNull
    public final C4527a i;

    @NotNull
    public final SD1 j;
    public final boolean k;
    public final boolean l;

    @NotNull
    public final io.sentry.transport.c m;

    public P(boolean z, boolean z2, long j) {
        SD1 sd1 = SD1.a;
        io.sentry.transport.c cVar = io.sentry.transport.c.a;
        this.d = new AtomicLong(0L);
        this.h = new io.sentry.util.l<>(new C4790k10(4));
        this.i = new C4527a();
        this.e = j;
        this.k = z;
        this.l = z2;
        this.j = sd1;
        this.m = cVar;
    }

    public final void a(@NotNull String str) {
        if (this.l) {
            C0702Bu c0702Bu = new C0702Bu();
            c0702Bu.i = "navigation";
            c0702Bu.f(str, "state");
            c0702Bu.k = "app.lifecycle";
            c0702Bu.m = NG1.INFO;
            this.j.g(c0702Bu);
        }
    }

    public final void b() {
        C4527a.C0404a c0404aA = this.i.a();
        try {
            O o = this.g;
            if (o != null) {
                o.cancel();
                this.g = null;
            }
            c0404aA.close();
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.android.core.AppState.a
    public final void c() {
        b();
        this.m.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C4191hO1 c4191hO1 = new C4191hO1(this, 1);
        SD1 sd1 = this.j;
        sd1.A(null, c4191hO1);
        AtomicLong atomicLong = this.d;
        long j = atomicLong.get();
        if (j == 0 || j + this.e <= jCurrentTimeMillis) {
            if (this.k) {
                sd1.t();
            }
            sd1.p().getReplayController().p();
        }
        sd1.p().getReplayController().e();
        atomicLong.set(jCurrentTimeMillis);
        a("foreground");
    }

    @Override // io.sentry.android.core.AppState.a
    public final void f() {
        this.m.getClass();
        this.d.set(System.currentTimeMillis());
        this.j.p().getReplayController().b();
        C4527a.C0404a c0404aA = this.i.a();
        try {
            b();
            this.g = new O(this);
            this.h.a().schedule(this.g, this.e);
            c0404aA.close();
            a("background");
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
