package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ep0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0922Ep0 {
    public final int a;

    @NotNull
    public final C6644sp0 b;
    public long c;
    public long d;
    public long e;
    public long f;

    @NotNull
    public final ArrayDeque<C2813ao0> g;
    public boolean h;

    @NotNull
    public final b i;

    @NotNull
    public final a j;

    @NotNull
    public final c k;

    @NotNull
    public final c l;

    @Nullable
    public EnumC7967z70 m;

    @Nullable
    public IOException n;

    /* JADX INFO: renamed from: Ep0$a */
    public final class a implements KM1 {
        public final boolean d;

        @NotNull
        public final C1481Lu e = new C1481Lu();
        public boolean g;

        public a(boolean z) {
            this.d = z;
        }

        public final void c(boolean z) throws SocketTimeoutException {
            long jMin;
            boolean z2;
            C0922Ep0 c0922Ep0 = C0922Ep0.this;
            synchronized (c0922Ep0) {
                try {
                    c0922Ep0.l.i();
                    while (c0922Ep0.e >= c0922Ep0.f && !this.d && !this.g) {
                        try {
                            synchronized (c0922Ep0) {
                                EnumC7967z70 enumC7967z70 = c0922Ep0.m;
                                if (enumC7967z70 != null) {
                                    break;
                                } else {
                                    c0922Ep0.k();
                                }
                            }
                        } catch (Throwable th) {
                            c0922Ep0.l.l();
                            throw th;
                        }
                    }
                    c0922Ep0.l.l();
                    c0922Ep0.b();
                    jMin = Math.min(c0922Ep0.f - c0922Ep0.e, this.e.e);
                    c0922Ep0.e += jMin;
                    z2 = z && jMin == this.e.e;
                    Unit unit = Unit.a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C0922Ep0.this.l.i();
            try {
                C0922Ep0 c0922Ep1 = C0922Ep0.this;
                c0922Ep1.b.q(c0922Ep1.a, z2, this.e, jMin);
            } finally {
                C0922Ep0.this.l.l();
            }
        }

        @Override // defpackage.KM1, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws SocketTimeoutException {
            boolean z;
            C0922Ep0 c0922Ep0 = C0922Ep0.this;
            byte[] bArr = C6806tc2.a;
            synchronized (c0922Ep0) {
                if (this.g) {
                    return;
                }
                synchronized (c0922Ep0) {
                    z = c0922Ep0.m == null;
                    Unit unit = Unit.a;
                }
                C0922Ep0 c0922Ep1 = C0922Ep0.this;
                if (!c0922Ep1.j.d) {
                    if (this.e.e > 0) {
                        while (this.e.e > 0) {
                            c(true);
                        }
                    } else if (z) {
                        c0922Ep1.b.q(c0922Ep1.a, true, null, 0L);
                    }
                }
                synchronized (C0922Ep0.this) {
                    this.g = true;
                    Unit unit2 = Unit.a;
                }
                C0922Ep0.this.b.flush();
                C0922Ep0.this.a();
            }
        }

        @Override // defpackage.KM1, java.io.Flushable
        public final void flush() throws SocketTimeoutException {
            C0922Ep0 c0922Ep0 = C0922Ep0.this;
            byte[] bArr = C6806tc2.a;
            synchronized (c0922Ep0) {
                c0922Ep0.b();
                Unit unit = Unit.a;
            }
            while (this.e.e > 0) {
                c(false);
                C0922Ep0.this.b.flush();
            }
        }

        @Override // defpackage.KM1
        public final void i1(@NotNull C1481Lu source, long j) throws SocketTimeoutException {
            Intrinsics.checkNotNullParameter(source, "source");
            byte[] bArr = C6806tc2.a;
            C1481Lu c1481Lu = this.e;
            c1481Lu.i1(source, j);
            while (c1481Lu.e >= 16384) {
                c(false);
            }
        }

        @Override // defpackage.KM1
        @NotNull
        public final LZ1 o() {
            return C0922Ep0.this.l;
        }
    }

    /* JADX INFO: renamed from: Ep0$b */
    public final class b implements UN1 {
        public final long d;
        public boolean e;

        @NotNull
        public final C1481Lu g = new C1481Lu();

        @NotNull
        public final C1481Lu h = new C1481Lu();
        public boolean i;

        public b(long j, boolean z) {
            this.d = j;
            this.e = z;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            long j;
            C0922Ep0 c0922Ep0 = C0922Ep0.this;
            synchronized (c0922Ep0) {
                this.i = true;
                C1481Lu c1481Lu = this.h;
                j = c1481Lu.e;
                c1481Lu.g();
                c0922Ep0.notifyAll();
                Unit unit = Unit.a;
            }
            if (j > 0) {
                byte[] bArr = C6806tc2.a;
                C0922Ep0.this.b.p(j);
            }
            C0922Ep0.this.a();
        }

        @Override // defpackage.UN1
        @NotNull
        public final LZ1 o() {
            return C0922Ep0.this.k;
        }

        /* JADX WARN: Code duplicated, block: B:45:0x0089 A[LOOP:0: B:4:0x000e->B:45:0x0089, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:48:0x0090 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:49:0x0091 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:50:0x0093 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:51:0x0094  */
        /* JADX WARN: Code duplicated, block: B:72:0x008c A[SYNTHETIC] */
        @Override // defpackage.UN1
        public final long s0(@NotNull C1481Lu sink, long j) throws Throwable {
            EnumC7967z70 enumC7967z70;
            Throwable c2945bS1;
            boolean z;
            long jS0;
            Intrinsics.checkNotNullParameter(sink, "sink");
            long j2 = 0;
            if (j < 0) {
                throw new IllegalArgumentException(C6419rl.a("byteCount < 0: ", j).toString());
            }
            while (true) {
                C0922Ep0 c0922Ep0 = C0922Ep0.this;
                synchronized (c0922Ep0) {
                    c0922Ep0.k.i();
                    try {
                        synchronized (c0922Ep0) {
                            enumC7967z70 = c0922Ep0.m;
                        }
                        if (z) {
                            if (jS0 != -1) {
                                return jS0;
                            }
                            if (c2945bS1 == null) {
                                return -1L;
                            }
                            throw c2945bS1;
                        }
                        j2 = 0;
                    } catch (Throwable th) {
                        c0922Ep0.k.l();
                        throw th;
                    }
                }
                if (enumC7967z70 == null || this.e) {
                    c2945bS1 = null;
                } else {
                    c2945bS1 = c0922Ep0.n;
                    if (c2945bS1 == null) {
                        synchronized (c0922Ep0) {
                            EnumC7967z70 enumC7967z71 = c0922Ep0.m;
                            Intrinsics.checkNotNull(enumC7967z71);
                            c2945bS1 = new C2945bS1(enumC7967z71);
                        }
                    }
                }
                if (this.i) {
                    throw new IOException("stream closed");
                }
                C1481Lu c1481Lu = this.h;
                long j3 = c1481Lu.e;
                z = false;
                if (j3 > j2) {
                    jS0 = c1481Lu.s0(sink, Math.min(j, j3));
                    long j4 = c0922Ep0.c + jS0;
                    c0922Ep0.c = j4;
                    long j5 = j4 - c0922Ep0.d;
                    if (c2945bS1 == null && j5 >= c0922Ep0.b.u.a() / 2) {
                        c0922Ep0.b.u(c0922Ep0.a, j5);
                        c0922Ep0.d = c0922Ep0.c;
                    }
                } else {
                    if (!this.e && c2945bS1 == null) {
                        c0922Ep0.k();
                        z = true;
                    }
                    jS0 = -1;
                }
                c0922Ep0.k.l();
                Unit unit = Unit.a;
                if (z) {
                    if (jS0 != -1) {
                        return jS0;
                    }
                    if (c2945bS1 == null) {
                        return -1L;
                    }
                    throw c2945bS1;
                }
                j2 = 0;
            }
        }
    }

    /* JADX INFO: renamed from: Ep0$c */
    public final class c extends C7255vk {
        public c() {
        }

        @Override // defpackage.C7255vk
        public final void k() {
            C0922Ep0.this.e(EnumC7967z70.CANCEL);
            C6644sp0 c6644sp0 = C0922Ep0.this.b;
            synchronized (c6644sp0) {
                long j = c6644sp0.s;
                long j2 = c6644sp0.r;
                if (j < j2) {
                    return;
                }
                c6644sp0.r = j2 + 1;
                c6644sp0.t = System.nanoTime() + ((long) 1000000000);
                Unit unit = Unit.a;
                c6644sp0.l.c(new C0688Bp0(C5807oq.b(new StringBuilder(), c6644sp0.g, " ping"), c6644sp0), 0L);
            }
        }

        public final void l() throws SocketTimeoutException {
            if (j()) {
                throw new SocketTimeoutException("timeout");
            }
        }
    }

    public C0922Ep0(int i, @NotNull C6644sp0 connection, boolean z, boolean z2, @Nullable C2813ao0 c2813ao0) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.a = i;
        this.b = connection;
        this.f = connection.v.a();
        ArrayDeque<C2813ao0> arrayDeque = new ArrayDeque<>();
        this.g = arrayDeque;
        this.i = new b(connection.u.a(), z2);
        this.j = new a(z);
        this.k = new c();
        this.l = new c();
        if (c2813ao0 == null) {
            if (!g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (g()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(c2813ao0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001b  */
    public final void a() {
        boolean z;
        boolean zH;
        byte[] bArr = C6806tc2.a;
        synchronized (this) {
            try {
                b bVar = this.i;
                if (bVar.e || !bVar.i) {
                    z = false;
                } else {
                    a aVar = this.j;
                    if (aVar.d || aVar.g) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                zH = h();
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            c(EnumC7967z70.CANCEL, null);
        } else {
            if (zH) {
                return;
            }
            this.b.k(this.a);
        }
    }

    public final void b() throws IOException {
        a aVar = this.j;
        if (aVar.g) {
            throw new IOException("stream closed");
        }
        if (aVar.d) {
            throw new IOException("stream finished");
        }
        if (this.m != null) {
            IOException iOException = this.n;
            if (iOException != null) {
                throw iOException;
            }
            EnumC7967z70 enumC7967z70 = this.m;
            Intrinsics.checkNotNull(enumC7967z70);
            throw new C2945bS1(enumC7967z70);
        }
    }

    public final void c(@NotNull EnumC7967z70 statusCode, @Nullable IOException iOException) {
        Intrinsics.checkNotNullParameter(statusCode, "rstStatusCode");
        if (d(statusCode, iOException)) {
            C6644sp0 c6644sp0 = this.b;
            c6644sp0.getClass();
            Intrinsics.checkNotNullParameter(statusCode, "statusCode");
            c6644sp0.B.q(this.a, statusCode);
        }
    }

    public final boolean d(EnumC7967z70 enumC7967z70, IOException iOException) {
        byte[] bArr = C6806tc2.a;
        synchronized (this) {
            if (this.m != null) {
                return false;
            }
            this.m = enumC7967z70;
            this.n = iOException;
            notifyAll();
            if (this.i.e && this.j.d) {
                return false;
            }
            Unit unit = Unit.a;
            this.b.k(this.a);
            return true;
        }
    }

    public final void e(@NotNull EnumC7967z70 errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (d(errorCode, null)) {
            this.b.t(this.a, errorCode);
        }
    }

    @NotNull
    public final a f() {
        synchronized (this) {
            try {
                if (!this.h && !g()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.j;
    }

    public final boolean g() {
        boolean z = (this.a & 1) == 1;
        this.b.getClass();
        return true == z;
    }

    public final synchronized boolean h() {
        if (this.m != null) {
            return false;
        }
        b bVar = this.i;
        if (bVar.e || bVar.i) {
            a aVar = this.j;
            if ((aVar.d || aVar.g) && this.h) {
                return false;
            }
        }
        return true;
    }

    public final void i(@NotNull C2813ao0 headers, boolean z) {
        boolean zH;
        Intrinsics.checkNotNullParameter(headers, "headers");
        byte[] bArr = C6806tc2.a;
        synchronized (this) {
            try {
                if (this.h && z) {
                    this.i.getClass();
                } else {
                    this.h = true;
                    this.g.add(headers);
                }
                if (z) {
                    this.i.e = true;
                }
                zH = h();
                notifyAll();
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zH) {
            return;
        }
        this.b.k(this.a);
    }

    public final synchronized void j(@NotNull EnumC7967z70 errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.m == null) {
            this.m = errorCode;
            notifyAll();
        }
    }

    public final void k() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
