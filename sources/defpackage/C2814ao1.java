package defpackage;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ao1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2814ao1 implements InterfaceC2606Zu {

    @NotNull
    public final KM1 d;

    @NotNull
    public final C1481Lu e;
    public boolean g;

    public C2814ao1(@NotNull KM1 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.d = sink;
        this.e = new C1481Lu();
    }

    @Override // defpackage.InterfaceC2606Zu
    @NotNull
    public final InterfaceC2606Zu Y(int i) {
        if (this.g) {
            throw new IllegalStateException("closed");
        }
        this.e.j1(i);
        c();
        return this;
    }

    @Override // defpackage.InterfaceC2606Zu
    @NotNull
    public final InterfaceC2606Zu Z0(@NotNull byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.g) {
            throw new IllegalStateException("closed");
        }
        this.e.b1(source);
        c();
        return this;
    }

    @NotNull
    public final InterfaceC2606Zu c() {
        if (this.g) {
            throw new IllegalStateException("closed");
        }
        C1481Lu c1481Lu = this.e;
        long jL = c1481Lu.l();
        if (jL > 0) {
            this.d.i1(c1481Lu, jL);
        }
        return this;
    }

    @Override // defpackage.KM1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        KM1 km1 = this.d;
        if (this.g) {
            return;
        }
        C1481Lu c1481Lu = this.e;
        long j = c1481Lu.e;
        if (j > 0) {
            km1.i1(c1481Lu, j);
        }
        th = null;
        try {
            km1.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.g = true;
        if (th != null) {
            throw th;
        }
    }

    @NotNull
    public final InterfaceC2606Zu f(int i) {
        if (this.g) {
            throw new IllegalStateException("closed");
        }
        this.e.t1(i);
        c();
        return this;
    }

    @Override // defpackage.KM1, java.io.Flushable
    public final void flush() {
        if (this.g) {
            throw new IllegalStateException("closed");
        }
        C1481Lu c1481Lu = this.e;
        long j = c1481Lu.e;
        KM1 km1 = this.d;
        if (j > 0) {
            km1.i1(c1481Lu, j);
        }
        km1.flush();
    }

    @Override // defpackage.KM1
    public final void i1(@NotNull C1481Lu source, long j) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.g) {
            throw new IllegalStateException("closed");
        }
        this.e.i1(source, j);
        c();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.g;
    }

    @Override // defpackage.InterfaceC2606Zu
    public final long l0(@NotNull UN1 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j = 0;
        while (true) {
            long jS0 = ((IA0) source).s0(this.e, 8192L);
            if (jS0 == -1) {
                return j;
            }
            j += jS0;
            c();
        }
    }

    @Override // defpackage.InterfaceC2606Zu
    @NotNull
    public final C1481Lu n() {
        return this.e;
    }

    @Override // defpackage.KM1
    @NotNull
    public final LZ1 o() {
        return this.d.o();
    }

    @Override // defpackage.InterfaceC2606Zu
    @NotNull
    public final InterfaceC2606Zu o1(long j) {
        if (this.g) {
            throw new IllegalStateException("closed");
        }
        this.e.k1(j);
        c();
        return this;
    }

    @Override // defpackage.InterfaceC2606Zu
    @NotNull
    public final InterfaceC2606Zu q1(@NotNull C1802Pw byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (this.g) {
            throw new IllegalStateException("closed");
        }
        this.e.Y0(byteString);
        c();
        return this;
    }

    @NotNull
    public final String toString() {
        return "buffer(" + this.d + ')';
    }

    @Override // defpackage.InterfaceC2606Zu
    @NotNull
    public final InterfaceC2606Zu w0(int i, @NotNull byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.g) {
            throw new IllegalStateException("closed");
        }
        this.e.c1(source, 0, i);
        c();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(@NotNull ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.g) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.e.write(source);
        c();
        return iWrite;
    }

    @Override // defpackage.InterfaceC2606Zu
    @NotNull
    public final InterfaceC2606Zu y0(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (this.g) {
            throw new IllegalStateException("closed");
        }
        this.e.w1(string);
        c();
        return this;
    }
}
