package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: qp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6225qp0 implements L90 {

    @Nullable
    public final C6711t81 a;

    @NotNull
    public final C3442do1 b;

    @NotNull
    public final C3024bo1 c;

    @NotNull
    public final C2814ao1 d;
    public int e;

    @NotNull
    public final C3861fo0 f;

    @Nullable
    public C2813ao0 g;

    /* JADX INFO: renamed from: qp0$a */
    public abstract class a implements UN1 {

        @NotNull
        public final C1680Oh0 d;
        public boolean e;

        public a() {
            this.d = new C1680Oh0(C6225qp0.this.c.d.o());
        }

        public final void c() {
            C6225qp0 c6225qp0 = C6225qp0.this;
            int i = c6225qp0.e;
            if (i == 6) {
                return;
            }
            if (i == 5) {
                C6225qp0.i(c6225qp0, this.d);
                c6225qp0.e = 6;
            } else {
                throw new IllegalStateException("state: " + c6225qp0.e);
            }
        }

        @Override // defpackage.UN1
        @NotNull
        public final LZ1 o() {
            return this.d;
        }

        @Override // defpackage.UN1
        public long s0(@NotNull C1481Lu sink, long j) throws IOException {
            C6225qp0 c6225qp0 = C6225qp0.this;
            Intrinsics.checkNotNullParameter(sink, "sink");
            try {
                return c6225qp0.c.s0(sink, j);
            } catch (IOException e) {
                c6225qp0.b.l();
                c();
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: qp0$b */
    public final class b implements KM1 {

        @NotNull
        public final C1680Oh0 d;
        public boolean e;

        public b() {
            this.d = new C1680Oh0(C6225qp0.this.d.d.o());
        }

        @Override // defpackage.KM1, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            if (this.e) {
                return;
            }
            this.e = true;
            C6225qp0.this.d.y0("0\r\n\r\n");
            C6225qp0.i(C6225qp0.this, this.d);
            C6225qp0.this.e = 3;
        }

        @Override // defpackage.KM1, java.io.Flushable
        public final synchronized void flush() {
            if (this.e) {
                return;
            }
            C6225qp0.this.d.flush();
        }

        @Override // defpackage.KM1
        public final void i1(@NotNull C1481Lu source, long j) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.e) {
                throw new IllegalStateException("closed");
            }
            if (j == 0) {
                return;
            }
            C6225qp0 c6225qp0 = C6225qp0.this;
            C2814ao1 c2814ao1 = c6225qp0.d;
            if (c2814ao1.g) {
                throw new IllegalStateException("closed");
            }
            c2814ao1.e.s1(j);
            c2814ao1.c();
            C2814ao1 c2814ao2 = c6225qp0.d;
            c2814ao2.y0("\r\n");
            c2814ao2.i1(source, j);
            c2814ao2.y0("\r\n");
        }

        @Override // defpackage.KM1
        @NotNull
        public final LZ1 o() {
            return this.d;
        }
    }

    /* JADX INFO: renamed from: qp0$c */
    public final class c extends a {

        @NotNull
        public final C1318Jr0 h;
        public long i;
        public boolean j;
        public final /* synthetic */ C6225qp0 k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull C6225qp0 c6225qp0, C1318Jr0 url) {
            super();
            Intrinsics.checkNotNullParameter(url, "url");
            this.k = c6225qp0;
            this.h = url;
            this.i = -1L;
            this.j = true;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.e) {
                return;
            }
            if (this.j) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (!C6806tc2.i(this)) {
                    this.k.b.l();
                    c();
                }
            }
            this.e = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x00b2, code lost:
        
            if (r10.j == false) goto L34;
         */
        @Override // defpackage.C6225qp0.a, defpackage.UN1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final long s0(@org.jetbrains.annotations.NotNull defpackage.C1481Lu r11, long r12) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 279
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C6225qp0.c.s0(Lu, long):long");
        }
    }

    /* JADX INFO: renamed from: qp0$d */
    public final class d extends a {
        public long h;

        public d(long j) {
            super();
            this.h = j;
            if (j == 0) {
                c();
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.e) {
                return;
            }
            if (this.h != 0) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (!C6806tc2.i(this)) {
                    C6225qp0.this.b.l();
                    c();
                }
            }
            this.e = true;
        }

        @Override // defpackage.C6225qp0.a, defpackage.UN1
        public final long s0(@NotNull C1481Lu sink, long j) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j < 0) {
                throw new IllegalArgumentException(C6419rl.a("byteCount < 0: ", j).toString());
            }
            if (this.e) {
                throw new IllegalStateException("closed");
            }
            long j2 = this.h;
            if (j2 == 0) {
                return -1L;
            }
            long jS0 = super.s0(sink, Math.min(j2, j));
            if (jS0 == -1) {
                C6225qp0.this.b.l();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                c();
                throw protocolException;
            }
            long j3 = this.h - jS0;
            this.h = j3;
            if (j3 == 0) {
                c();
            }
            return jS0;
        }
    }

    /* JADX INFO: renamed from: qp0$e */
    public final class e implements KM1 {

        @NotNull
        public final C1680Oh0 d;
        public boolean e;

        public e() {
            this.d = new C1680Oh0(C6225qp0.this.d.d.o());
        }

        @Override // defpackage.KM1, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.e) {
                return;
            }
            this.e = true;
            C6225qp0 c6225qp0 = C6225qp0.this;
            C6225qp0.i(c6225qp0, this.d);
            c6225qp0.e = 3;
        }

        @Override // defpackage.KM1, java.io.Flushable
        public final void flush() {
            if (this.e) {
                return;
            }
            C6225qp0.this.d.flush();
        }

        @Override // defpackage.KM1
        public final void i1(@NotNull C1481Lu source, long j) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.e) {
                throw new IllegalStateException("closed");
            }
            C6806tc2.c(source.e, 0L, j);
            C6225qp0.this.d.i1(source, j);
        }

        @Override // defpackage.KM1
        @NotNull
        public final LZ1 o() {
            return this.d;
        }
    }

    /* JADX INFO: renamed from: qp0$f */
    public final class f extends a {
        public boolean h;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.e) {
                return;
            }
            if (!this.h) {
                c();
            }
            this.e = true;
        }

        @Override // defpackage.C6225qp0.a, defpackage.UN1
        public final long s0(@NotNull C1481Lu sink, long j) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j < 0) {
                throw new IllegalArgumentException(C6419rl.a("byteCount < 0: ", j).toString());
            }
            if (this.e) {
                throw new IllegalStateException("closed");
            }
            if (this.h) {
                return -1L;
            }
            long jS0 = super.s0(sink, j);
            if (jS0 != -1) {
                return jS0;
            }
            this.h = true;
            c();
            return -1L;
        }
    }

    public C6225qp0(@Nullable C6711t81 c6711t81, @NotNull C3442do1 connection, @NotNull C3024bo1 source, @NotNull C2814ao1 sink) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.a = c6711t81;
        this.b = connection;
        this.c = source;
        this.d = sink;
        this.f = new C3861fo0(source);
    }

    public static final void i(C6225qp0 c6225qp0, C1680Oh0 c1680Oh0) {
        c6225qp0.getClass();
        LZ1 lz1 = c1680Oh0.e;
        LZ1.a delegate = LZ1.d;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        c1680Oh0.e = delegate;
        lz1.a();
        lz1.b();
    }

    @Override // defpackage.L90
    public final void a(@NotNull C4543is1 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Proxy.Type proxyType = this.b.b.b.type();
        Intrinsics.checkNotNullExpressionValue(proxyType, "connection.route().proxy.type()");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(proxyType, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(request.b);
        sb.append(' ');
        C1318Jr0 url = request.a;
        if (url.j || proxyType != Proxy.Type.HTTP) {
            Intrinsics.checkNotNullParameter(url, "url");
            String strB = url.b();
            String strD = url.d();
            if (strD != null) {
                strB = strB + '?' + strD;
            }
            sb.append(strB);
        } else {
            sb.append(url);
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        k(request.c, string);
    }

    @Override // defpackage.L90
    @NotNull
    public final UN1 b(@NotNull C0857Dt1 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!C1081Gq0.a(response)) {
            return j(0L);
        }
        if ("chunked".equalsIgnoreCase(C0857Dt1.f(response, "Transfer-Encoding"))) {
            C1318Jr0 c1318Jr0 = response.d.a;
            if (this.e == 4) {
                this.e = 5;
                return new c(this, c1318Jr0);
            }
            throw new IllegalStateException(("state: " + this.e).toString());
        }
        long jL = C6806tc2.l(response);
        if (jL != -1) {
            return j(jL);
        }
        if (this.e == 4) {
            this.e = 5;
            this.b.l();
            return new f();
        }
        throw new IllegalStateException(("state: " + this.e).toString());
    }

    @Override // defpackage.L90
    public final void c() {
        this.d.flush();
    }

    @Override // defpackage.L90
    public final void cancel() {
        Socket socket = this.b.c;
        if (socket != null) {
            C6806tc2.e(socket);
        }
    }

    @Override // defpackage.L90
    @NotNull
    public final KM1 d(@NotNull C4543is1 request, long j) {
        Intrinsics.checkNotNullParameter(request, "request");
        AbstractC5395ms1 abstractC5395ms1 = request.d;
        if ("chunked".equalsIgnoreCase(request.a("Transfer-Encoding"))) {
            if (this.e == 1) {
                this.e = 2;
                return new b();
            }
            throw new IllegalStateException(("state: " + this.e).toString());
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.e == 1) {
            this.e = 2;
            return new e();
        }
        throw new IllegalStateException(("state: " + this.e).toString());
    }

    @Override // defpackage.L90
    @Nullable
    public final C0857Dt1.a e(boolean z) {
        C3861fo0 c3861fo0 = this.f;
        int i = this.e;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.e).toString());
        }
        try {
            String strA = c3861fo0.a.A(c3861fo0.b);
            c3861fo0.b -= (long) strA.length();
            ZP1 zp1A = ZP1.a.a(strA);
            int i2 = zp1A.b;
            C0857Dt1.a aVar = new C0857Dt1.a();
            EnumC1298Jk1 protocol = zp1A.a;
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            aVar.b = protocol;
            aVar.c = i2;
            String message = zp1A.c;
            Intrinsics.checkNotNullParameter(message, "message");
            aVar.d = message;
            C2813ao0.a aVar2 = new C2813ao0.a();
            while (true) {
                String strA2 = c3861fo0.a.A(c3861fo0.b);
                c3861fo0.b -= (long) strA2.length();
                if (strA2.length() == 0) {
                    break;
                }
                aVar2.b(strA2);
            }
            aVar.c(aVar2.d());
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.e = 3;
                return aVar;
            }
            if (102 > i2 || i2 >= 200) {
                this.e = 4;
                return aVar;
            }
            this.e = 3;
            return aVar;
        } catch (EOFException e2) {
            throw new IOException(C5491nL.c("unexpected end of stream on ", this.b.b.a.h.h()), e2);
        }
    }

    @Override // defpackage.L90
    public final long f(@NotNull C0857Dt1 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!C1081Gq0.a(response)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(C0857Dt1.f(response, "Transfer-Encoding"))) {
            return -1L;
        }
        return C6806tc2.l(response);
    }

    @Override // defpackage.L90
    @NotNull
    public final C3442do1 g() {
        return this.b;
    }

    @Override // defpackage.L90
    public final void h() {
        this.d.flush();
    }

    public final d j(long j) {
        if (this.e == 4) {
            this.e = 5;
            return new d(j);
        }
        throw new IllegalStateException(("state: " + this.e).toString());
    }

    public final void k(@NotNull C2813ao0 headers, @NotNull String requestLine) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(requestLine, "requestLine");
        if (this.e != 0) {
            throw new IllegalStateException(("state: " + this.e).toString());
        }
        C2814ao1 c2814ao1 = this.d;
        c2814ao1.y0(requestLine);
        c2814ao1.y0("\r\n");
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            c2814ao1.y0(headers.c(i));
            c2814ao1.y0(": ");
            c2814ao1.y0(headers.f(i));
            c2814ao1.y0("\r\n");
        }
        c2814ao1.y0("\r\n");
        this.e = 1;
    }
}
