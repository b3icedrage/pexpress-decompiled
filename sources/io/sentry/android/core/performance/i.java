package io.sentry.android.core.performance;

import android.os.SystemClock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements Comparable<i> {

    @Nullable
    public String d;
    public long e;
    public long g;
    public long h;

    public final long b() {
        long j = this.h;
        if (j != 0) {
            return j - this.g;
        }
        return 0L;
    }

    @Override // java.lang.Comparable
    public final int compareTo(@NotNull i iVar) {
        return Long.compare(this.e, iVar.e);
    }

    public final boolean e() {
        return this.g != 0;
    }

    public final void f(long j) {
        this.g = j;
        this.e = System.currentTimeMillis() - (SystemClock.uptimeMillis() - this.g);
    }
}
