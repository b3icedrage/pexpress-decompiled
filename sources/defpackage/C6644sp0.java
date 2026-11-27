package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: sp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6644sp0 implements Closeable {

    @NotNull
    public static final C6536sJ1 E;

    @NotNull
    public final Socket A;

    @NotNull
    public final C1000Fp0 B;

    @NotNull
    public final c C;

    @NotNull
    public final LinkedHashSet D;

    @NotNull
    public final b d;

    @NotNull
    public final LinkedHashMap e;

    @NotNull
    public final String g;
    public int h;
    public int i;
    public boolean j;

    @NotNull
    public final C8049zX1 k;

    @NotNull
    public final C7839yX1 l;

    @NotNull
    public final C7839yX1 m;

    @NotNull
    public final C7839yX1 n;

    @NotNull
    public final C7652xe o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;

    @NotNull
    public final C6536sJ1 u;

    @NotNull
    public C6536sJ1 v;
    public long w;
    public long x;
    public long y;
    public long z;

    /* JADX INFO: renamed from: sp0$a */
    public static final class a {

        @NotNull
        public final C8049zX1 a;
        public Socket b;
        public String c;
        public C3024bo1 d;
        public C2814ao1 e;

        @NotNull
        public b f;

        @NotNull
        public final C7652xe g;
        public int h;

        public a(@NotNull C8049zX1 taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            this.a = taskRunner;
            this.f = b.a;
            this.g = C7652xe.e;
        }
    }

    /* JADX INFO: renamed from: sp0$b */
    public static abstract class b {

        @NotNull
        public static final a a = new a();

        /* JADX INFO: renamed from: sp0$b$a */
        public static final class a extends b {
            @Override // defpackage.C6644sp0.b
            public final void c(@NotNull C0922Ep0 stream) {
                Intrinsics.checkNotNullParameter(stream, "stream");
                stream.c(EnumC7967z70.REFUSED_STREAM, null);
            }
        }

        public void b(@NotNull C6644sp0 connection, @NotNull C6536sJ1 settings) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(settings, "settings");
        }

        public abstract void c(@NotNull C0922Ep0 c0922Ep0);
    }

    /* JADX INFO: renamed from: sp0$c */
    public final class c implements Function0<Unit> {

        @NotNull
        public final C0844Dp0 d;
        public final /* synthetic */ C6644sp0 e;

        public c(@NotNull C6644sp0 c6644sp0, C0844Dp0 reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            this.e = c6644sp0;
            this.d = reader;
        }

        public final void a(boolean z, int i, @NotNull C3024bo1 source, int i2) {
            boolean z2;
            long j;
            boolean z3;
            Intrinsics.checkNotNullParameter(source, "source");
            this.e.getClass();
            long j2 = 0;
            if (i != 0 && (i & 1) == 0) {
                C6644sp0 c6644sp0 = this.e;
                c6644sp0.getClass();
                Intrinsics.checkNotNullParameter(source, "source");
                C1481Lu c1481Lu = new C1481Lu();
                long j3 = i2;
                source.C(j3);
                source.s0(c1481Lu, j3);
                c6644sp0.m.c(new C7695xp0(c6644sp0.g + '[' + i + "] onData", c6644sp0, i, c1481Lu, i2, z), 0L);
                return;
            }
            C0922Ep0 c0922Ep0G = this.e.g(i);
            if (c0922Ep0G == null) {
                this.e.t(i, EnumC7967z70.PROTOCOL_ERROR);
                long j4 = i2;
                this.e.p(j4);
                source.r(j4);
                return;
            }
            Intrinsics.checkNotNullParameter(source, "source");
            byte[] bArr = C6806tc2.a;
            C0922Ep0.b bVar = c0922Ep0G.i;
            long j5 = i2;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(source, "source");
            long j6 = j5;
            while (true) {
                if (j6 <= j2) {
                    byte[] bArr2 = C6806tc2.a;
                    C0922Ep0.this.b.p(j5);
                    break;
                }
                synchronized (C0922Ep0.this) {
                    z2 = bVar.e;
                    j = j2;
                    z3 = bVar.h.e + j6 > bVar.d;
                    Unit unit = Unit.a;
                }
                if (z3) {
                    source.r(j6);
                    C0922Ep0.this.e(EnumC7967z70.FLOW_CONTROL_ERROR);
                    break;
                }
                if (z2) {
                    source.r(j6);
                    break;
                }
                long jS0 = source.s0(bVar.g, j6);
                if (jS0 == -1) {
                    throw new EOFException();
                }
                j6 -= jS0;
                C0922Ep0 c0922Ep0 = C0922Ep0.this;
                synchronized (c0922Ep0) {
                    try {
                        if (bVar.i) {
                            bVar.g.g();
                        } else {
                            C1481Lu c1481Lu2 = bVar.h;
                            boolean z4 = c1481Lu2.e == j;
                            c1481Lu2.l0(bVar.g);
                            if (z4) {
                                c0922Ep0.notifyAll();
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                j2 = j;
            }
            if (z) {
                c0922Ep0G.i(C6806tc2.b, true);
            }
        }

        public final void b(int i, @NotNull List requestHeaders, boolean z) {
            Intrinsics.checkNotNullParameter(requestHeaders, "headerBlock");
            this.e.getClass();
            if (i != 0 && (i & 1) == 0) {
                C6644sp0 c6644sp0 = this.e;
                c6644sp0.getClass();
                Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
                c6644sp0.m.c(new C7905yp0(c6644sp0.g + '[' + i + "] onHeaders", c6644sp0, i, requestHeaders, z), 0L);
                return;
            }
            C6644sp0 c6644sp1 = this.e;
            synchronized (c6644sp1) {
                C0922Ep0 c0922Ep0G = c6644sp1.g(i);
                if (c0922Ep0G != null) {
                    Unit unit = Unit.a;
                    c0922Ep0G.i(C6806tc2.w(requestHeaders), z);
                    return;
                }
                if (c6644sp1.j) {
                    return;
                }
                if (i <= c6644sp1.h) {
                    return;
                }
                if (i % 2 == c6644sp1.i % 2) {
                    return;
                }
                C0922Ep0 c0922Ep0 = new C0922Ep0(i, c6644sp1, false, z, C6806tc2.w(requestHeaders));
                c6644sp1.h = i;
                c6644sp1.e.put(Integer.valueOf(i), c0922Ep0);
                c6644sp1.k.e().c(new C7064up0(c6644sp1.g + '[' + i + "] onStream", c6644sp1, c0922Ep0), 0L);
            }
        }

        public final void d(int i, @NotNull List requestHeaders) {
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            C6644sp0 c6644sp0 = this.e;
            c6644sp0.getClass();
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            synchronized (c6644sp0) {
                if (c6644sp0.D.contains(Integer.valueOf(i))) {
                    c6644sp0.t(i, EnumC7967z70.PROTOCOL_ERROR);
                    return;
                }
                c6644sp0.D.add(Integer.valueOf(i));
                c6644sp0.m.c(new C8115zp0(c6644sp0.g + '[' + i + "] onRequest", c6644sp0, i, requestHeaders), 0L);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() throws Throwable {
            EnumC7967z70 enumC7967z70;
            Throwable th;
            C6644sp0 c6644sp0 = this.e;
            C0844Dp0 c0844Dp0 = this.d;
            EnumC7967z70 enumC7967z71 = EnumC7967z70.INTERNAL_ERROR;
            IOException e = null;
            try {
                try {
                    Intrinsics.checkNotNullParameter(this, "handler");
                    if (!c0844Dp0.c(true, this)) {
                        throw new IOException("Required SETTINGS preface not received");
                    }
                    do {
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } while (c0844Dp0.c(false, this));
                    enumC7967z70 = EnumC7967z70.NO_ERROR;
                    try {
                        try {
                            c6644sp0.c(enumC7967z70, EnumC7967z70.CANCEL, null);
                        } catch (IOException e2) {
                            e = e2;
                            EnumC7967z70 enumC7967z72 = EnumC7967z70.PROTOCOL_ERROR;
                            c6644sp0.c(enumC7967z72, enumC7967z72, e);
                        }
                        C6806tc2.d(c0844Dp0);
                        return Unit.a;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (IOException e3) {
                e = e3;
                enumC7967z70 = enumC7967z71;
            }
            enumC7967z70 = enumC7967z71;
            c6644sp0.c(enumC7967z70, enumC7967z71, e);
            C6806tc2.d(c0844Dp0);
            throw th;
        }
    }

    /* JADX INFO: renamed from: sp0$d */
    public static final class d extends AbstractC6578sX1 {
        public final /* synthetic */ C6644sp0 e;
        public final /* synthetic */ long f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, C6644sp0 c6644sp0, long j) {
            super(str, true);
            this.e = c6644sp0;
            this.f = j;
        }

        @Override // defpackage.AbstractC6578sX1
        public final long a() {
            C6644sp0 c6644sp0;
            boolean z;
            synchronized (this.e) {
                c6644sp0 = this.e;
                long j = c6644sp0.q;
                long j2 = c6644sp0.p;
                if (j < j2) {
                    z = true;
                } else {
                    c6644sp0.p = j2 + 1;
                    z = false;
                }
            }
            if (z) {
                c6644sp0.f(null);
                return -1L;
            }
            try {
                c6644sp0.B.p(1, false, 0);
            } catch (IOException e) {
                c6644sp0.f(e);
            }
            return this.f;
        }
    }

    /* JADX INFO: renamed from: sp0$e */
    public static final class e extends AbstractC6578sX1 {
        public final /* synthetic */ C6644sp0 e;
        public final /* synthetic */ int f;
        public final /* synthetic */ EnumC7967z70 g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, C6644sp0 c6644sp0, int i, EnumC7967z70 enumC7967z70) {
            super(str, true);
            this.e = c6644sp0;
            this.f = i;
            this.g = enumC7967z70;
        }

        @Override // defpackage.AbstractC6578sX1
        public final long a() {
            C6644sp0 c6644sp0 = this.e;
            try {
                int i = this.f;
                EnumC7967z70 statusCode = this.g;
                c6644sp0.getClass();
                Intrinsics.checkNotNullParameter(statusCode, "statusCode");
                c6644sp0.B.q(i, statusCode);
                return -1L;
            } catch (IOException e) {
                c6644sp0.f(e);
                return -1L;
            }
        }
    }

    /* JADX INFO: renamed from: sp0$f */
    public static final class f extends AbstractC6578sX1 {
        public final /* synthetic */ C6644sp0 e;
        public final /* synthetic */ int f;
        public final /* synthetic */ long g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, C6644sp0 c6644sp0, int i, long j) {
            super(str, true);
            this.e = c6644sp0;
            this.f = i;
            this.g = j;
        }

        @Override // defpackage.AbstractC6578sX1
        public final long a() {
            C6644sp0 c6644sp0 = this.e;
            try {
                c6644sp0.B.t(this.f, this.g);
                return -1L;
            } catch (IOException e) {
                c6644sp0.f(e);
                return -1L;
            }
        }
    }

    static {
        C6536sJ1 c6536sJ1 = new C6536sJ1();
        c6536sJ1.c(7, 65535);
        c6536sJ1.c(5, 16384);
        E = c6536sJ1;
    }

    public C6644sp0(@NotNull a builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.d = builder.f;
        this.e = new LinkedHashMap();
        String str = builder.c;
        if (str == null) {
            Intrinsics.l("connectionName");
            throw null;
        }
        this.g = str;
        this.i = 3;
        C8049zX1 c8049zX1 = builder.a;
        this.k = c8049zX1;
        C7839yX1 c7839yX1E = c8049zX1.e();
        this.l = c7839yX1E;
        this.m = c8049zX1.e();
        this.n = c8049zX1.e();
        this.o = builder.g;
        C6536sJ1 c6536sJ1 = new C6536sJ1();
        c6536sJ1.c(7, 16777216);
        this.u = c6536sJ1;
        C6536sJ1 c6536sJ2 = E;
        this.v = c6536sJ2;
        this.z = c6536sJ2.a();
        Socket socket = builder.b;
        if (socket == null) {
            Intrinsics.l("socket");
            throw null;
        }
        this.A = socket;
        C2814ao1 c2814ao1 = builder.e;
        if (c2814ao1 == null) {
            Intrinsics.l("sink");
            throw null;
        }
        this.B = new C1000Fp0(c2814ao1);
        C3024bo1 c3024bo1 = builder.d;
        if (c3024bo1 == null) {
            Intrinsics.l(Payload.SOURCE);
            throw null;
        }
        this.C = new c(this, new C0844Dp0(c3024bo1));
        this.D = new LinkedHashSet();
        int i = builder.h;
        if (i != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            c7839yX1E.c(new d(str.concat(" ping"), this, nanos), nanos);
        }
    }

    public final void c(@NotNull EnumC7967z70 connectionCode, @NotNull EnumC7967z70 streamCode, @Nullable IOException iOException) {
        int i;
        Object[] array;
        Intrinsics.checkNotNullParameter(connectionCode, "connectionCode");
        Intrinsics.checkNotNullParameter(streamCode, "streamCode");
        byte[] bArr = C6806tc2.a;
        try {
            l(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.e.isEmpty()) {
                    array = null;
                } else {
                    array = this.e.values().toArray(new C0922Ep0[0]);
                    this.e.clear();
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        C0922Ep0[] c0922Ep0Arr = (C0922Ep0[]) array;
        if (c0922Ep0Arr != null) {
            for (C0922Ep0 c0922Ep0 : c0922Ep0Arr) {
                try {
                    c0922Ep0.c(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.B.close();
        } catch (IOException unused3) {
        }
        try {
            this.A.close();
        } catch (IOException unused4) {
        }
        this.l.f();
        this.m.f();
        this.n.f();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        c(EnumC7967z70.NO_ERROR, EnumC7967z70.CANCEL, null);
    }

    public final void f(IOException iOException) {
        EnumC7967z70 enumC7967z70 = EnumC7967z70.PROTOCOL_ERROR;
        c(enumC7967z70, enumC7967z70, iOException);
    }

    public final void flush() {
        this.B.flush();
    }

    @Nullable
    public final synchronized C0922Ep0 g(int i) {
        return (C0922Ep0) this.e.get(Integer.valueOf(i));
    }

    @Nullable
    public final synchronized C0922Ep0 k(int i) {
        C0922Ep0 c0922Ep0;
        c0922Ep0 = (C0922Ep0) this.e.remove(Integer.valueOf(i));
        notifyAll();
        return c0922Ep0;
    }

    public final void l(@NotNull EnumC7967z70 statusCode) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        synchronized (this.B) {
            C2590Zo1 c2590Zo1 = new C2590Zo1();
            synchronized (this) {
                if (this.j) {
                    return;
                }
                this.j = true;
                int i = this.h;
                c2590Zo1.d = i;
                Unit unit = Unit.a;
                this.B.k(i, statusCode, C6806tc2.a);
            }
        }
    }

    public final synchronized void p(long j) {
        long j2 = this.w + j;
        this.w = j2;
        long j3 = j2 - this.x;
        if (j3 >= this.u.a() / 2) {
            u(0, j3);
            this.x += j3;
        }
    }

    public final void q(int i, boolean z, @Nullable C1481Lu c1481Lu, long j) {
        long j2;
        long j3;
        int iMin;
        long j4;
        if (j == 0) {
            this.B.f(z, i, c1481Lu, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j2 = this.y;
                            j3 = this.z;
                            if (j2 >= j3) {
                                if (!this.e.containsKey(Integer.valueOf(i))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                iMin = Math.min((int) Math.min(j, j3 - j2), this.B.g);
                j4 = iMin;
                this.y += j4;
                Unit unit = Unit.a;
            }
            j -= j4;
            this.B.f(z && j == 0, i, c1481Lu, iMin);
        }
    }

    public final void t(int i, @NotNull EnumC7967z70 errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.l.c(new e(this.g + '[' + i + "] writeSynReset", this, i, errorCode), 0L);
    }

    public final void u(int i, long j) {
        this.l.c(new f(this.g + '[' + i + "] windowUpdate", this, i, j), 0L);
    }
}
