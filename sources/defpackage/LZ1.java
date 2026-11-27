package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class LZ1 {

    @NotNull
    public static final a d = new a();
    public boolean a;
    public long b;
    public long c;

    @NotNull
    public LZ1 a() {
        this.a = false;
        return this;
    }

    @NotNull
    public LZ1 b() {
        this.c = 0L;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline");
    }

    @NotNull
    public LZ1 d(long j) {
        this.a = true;
        this.b = j;
        return this;
    }

    public boolean e() {
        return this.a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    @NotNull
    public LZ1 g(long j, @NotNull TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j < 0) {
            throw new IllegalArgumentException(C6419rl.a("timeout < 0: ", j).toString());
        }
        this.c = unit.toNanos(j);
        return this;
    }

    public long h() {
        return this.c;
    }

    public static final class a extends LZ1 {
        @Override // defpackage.LZ1
        @NotNull
        public final LZ1 g(long j, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            return this;
        }

        @Override // defpackage.LZ1
        public final void f() {
        }

        @Override // defpackage.LZ1
        @NotNull
        public final LZ1 d(long j) {
            return this;
        }
    }
}
