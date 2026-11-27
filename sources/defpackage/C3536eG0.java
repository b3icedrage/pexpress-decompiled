package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: eG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3536eG0<R> implements PQ0<R> {

    @NotNull
    public final C6117qJ1<R> d;

    public C3536eG0(C2684aG0 job) {
        C6117qJ1<R> underlying = new C6117qJ1<>();
        Intrinsics.checkNotNullExpressionValue(underlying, "create()");
        Intrinsics.checkNotNullParameter(job, "job");
        Intrinsics.checkNotNullParameter(underlying, "underlying");
        this.d = underlying;
        job.W(new C3327dG0(this, 0));
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.d.cancel(z);
    }

    @Override // defpackage.PQ0
    public final void f(Runnable runnable, Executor executor) {
        this.d.f(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final R get() {
        return this.d.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.d.d instanceof AbstractC4575j0.b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.d.isDone();
    }

    @Override // java.util.concurrent.Future
    public final R get(long j, TimeUnit timeUnit) {
        return this.d.get(j, timeUnit);
    }
}
