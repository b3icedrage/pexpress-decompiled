package defpackage;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: wo1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7483wo1 implements Qf2 {

    @NotNull
    public static final List<EnumC1298Jk1> w = VE.c(EnumC1298Jk1.HTTP_1_1);

    @NotNull
    public final G1 a;

    @NotNull
    public final Random b;
    public final long c;

    @Nullable
    public C6612sg2 d;
    public final long e;

    @NotNull
    public final String f;

    @Nullable
    public C3233co1 g;

    @Nullable
    public d h;

    @Nullable
    public Cg2 i;

    @Nullable
    public C7667xh2 j;

    @NotNull
    public final C7839yX1 k;

    @Nullable
    public String l;

    @Nullable
    public C3862fo1 m;

    @NotNull
    public final ArrayDeque<C1802Pw> n;

    @NotNull
    public final ArrayDeque<Object> o;
    public long p;
    public boolean q;
    public int r;

    @Nullable
    public String s;
    public boolean t;
    public int u;
    public boolean v;

    /* JADX INFO: renamed from: wo1$a */
    public static final class a {
        public final int a;

        @Nullable
        public final C1802Pw b;

        public a(int i, @Nullable C1802Pw c1802Pw) {
            this.a = i;
            this.b = c1802Pw;
        }
    }

    /* JADX INFO: renamed from: wo1$b */
    public static final class b {
        public final int a;

        @NotNull
        public final C1802Pw b;

        public b(int i, @NotNull C1802Pw data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.a = i;
            this.b = data;
        }
    }

    /* JADX INFO: renamed from: wo1$c */
    public static abstract class c implements Closeable {

        @NotNull
        public final C3024bo1 d;

        @NotNull
        public final C2814ao1 e;

        public c(@NotNull C3024bo1 source, @NotNull C2814ao1 sink) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sink, "sink");
            this.d = source;
            this.e = sink;
        }
    }

    /* JADX INFO: renamed from: wo1$d */
    public final class d extends AbstractC6578sX1 {
        public d() {
            super(C5807oq.b(new StringBuilder(), C7483wo1.this.l, " writer"), true);
        }

        @Override // defpackage.AbstractC6578sX1
        public final long a() {
            C7483wo1 c7483wo1 = C7483wo1.this;
            try {
                return c7483wo1.j() ? 0L : -1L;
            } catch (IOException e) {
                c7483wo1.e(e, null);
                return -1L;
            }
        }
    }

    /* JADX INFO: renamed from: wo1$e */
    public static final class e extends AbstractC6578sX1 {
        public e(String str) {
            super(str, true);
        }

        @Override // defpackage.AbstractC6578sX1
        public final long a() {
            C7483wo1.this.cancel();
            return -1L;
        }
    }

    public C7483wo1(@NotNull C8049zX1 taskRunner, @NotNull C4543is1 originalRequest, @NotNull G1 listener, @NotNull Random random, long j, long j2) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(random, "random");
        this.a = listener;
        this.b = random;
        this.c = j;
        this.d = null;
        this.e = j2;
        this.k = taskRunner.e();
        this.n = new ArrayDeque<>();
        this.o = new ArrayDeque<>();
        this.r = -1;
        if (!"GET".equals(originalRequest.b)) {
            throw new IllegalArgumentException(("Request must be GET: " + originalRequest.b).toString());
        }
        C1802Pw c1802Pw = C1802Pw.h;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        Unit unit = Unit.a;
        this.f = C1802Pw.a.d(C5417n.b, bArr).b();
    }

    @Override // defpackage.Qf2
    public final boolean a(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        C1802Pw c1802Pw = C1802Pw.h;
        return i(1, C1802Pw.a.c(text));
    }

    @Override // defpackage.Qf2
    public final boolean b(@NotNull C1802Pw bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return i(2, bytes);
    }

    @Override // defpackage.Qf2
    public final boolean c(int i, @Nullable String str) {
        String str2;
        synchronized (this) {
            C1802Pw c1802PwC = null;
            try {
                if (i < 1000 || i >= 5000) {
                    str2 = "Code must be in range [1000,5000): " + i;
                } else if ((1004 > i || i >= 1007) && (1015 > i || i >= 3000)) {
                    str2 = null;
                } else {
                    str2 = "Code " + i + " is reserved and may not be used.";
                }
                if (str2 != null) {
                    Intrinsics.checkNotNull(str2);
                    throw new IllegalArgumentException(str2.toString());
                }
                if (str != null) {
                    C1802Pw c1802Pw = C1802Pw.h;
                    c1802PwC = C1802Pw.a.c(str);
                    if (c1802PwC.d.length > 123) {
                        throw new IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
                    }
                }
                if (!this.t && !this.q) {
                    this.q = true;
                    this.o.add(new a(i, c1802PwC));
                    h();
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.Qf2
    public final void cancel() {
        C3233co1 c3233co1 = this.g;
        Intrinsics.checkNotNull(c3233co1);
        c3233co1.cancel();
    }

    public final void d(@NotNull C0857Dt1 response, @Nullable K90 k90) throws ProtocolException {
        Intrinsics.checkNotNullParameter(response, "response");
        int i = response.h;
        if (i != 101) {
            StringBuilder sb = new StringBuilder("Expected HTTP 101 response but was '");
            sb.append(i);
            sb.append(' ');
            throw new ProtocolException(C1039Gc0.e(sb, response.g, '\''));
        }
        String strF = C0857Dt1.f(response, "Connection");
        if (!"Upgrade".equalsIgnoreCase(strF)) {
            throw new ProtocolException(C1742Pc.d('\'', "Expected 'Connection' header value 'Upgrade' but was '", strF));
        }
        String strF2 = C0857Dt1.f(response, "Upgrade");
        if (!"websocket".equalsIgnoreCase(strF2)) {
            throw new ProtocolException(C1742Pc.d('\'', "Expected 'Upgrade' header value 'websocket' but was '", strF2));
        }
        String strF3 = C0857Dt1.f(response, "Sec-WebSocket-Accept");
        C1802Pw c1802Pw = C1802Pw.h;
        String strB = C1802Pw.a.c(this.f + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").e("SHA-1").b();
        if (Intrinsics.a(strB, strF3)) {
            if (k90 == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strB + "' but was '" + strF3 + '\'');
    }

    public final void e(@NotNull Exception e2, @Nullable C0857Dt1 c0857Dt1) {
        Intrinsics.checkNotNullParameter(e2, "e");
        synchronized (this) {
            if (this.t) {
                return;
            }
            this.t = true;
            C3862fo1 c3862fo1 = this.m;
            this.m = null;
            Cg2 cg2 = this.i;
            this.i = null;
            C7667xh2 c7667xh2 = this.j;
            this.j = null;
            this.k.f();
            Unit unit = Unit.a;
            try {
                this.a.n(this, e2, c0857Dt1);
            } finally {
                if (c3862fo1 != null) {
                    C6806tc2.d(c3862fo1);
                }
                if (cg2 != null) {
                    C6806tc2.d(cg2);
                }
                if (c7667xh2 != null) {
                    C6806tc2.d(c7667xh2);
                }
            }
        }
    }

    public final void f(@NotNull String name, @NotNull C3862fo1 streams) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(streams, "streams");
        C6612sg2 c6612sg2 = this.d;
        Intrinsics.checkNotNull(c6612sg2);
        synchronized (this) {
            try {
                this.l = name;
                this.m = streams;
                this.j = new C7667xh2(streams.e, this.b, c6612sg2.a, c6612sg2.c, this.e);
                this.h = new d();
                long j = this.c;
                if (j != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                    this.k.c(new C7903yo1(name + " ping", this, nanos), nanos);
                }
                if (!this.o.isEmpty()) {
                    h();
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.i = new Cg2(streams.d, this, c6612sg2.a, c6612sg2.e);
    }

    public final void g() throws IOException {
        while (this.r == -1) {
            Cg2 cg2 = this.i;
            Intrinsics.checkNotNull(cg2);
            cg2.f();
            if (cg2.m) {
                cg2.c();
            } else {
                int i = cg2.j;
                if (i != 1 && i != 2) {
                    StringBuilder sb = new StringBuilder("Unknown opcode: ");
                    byte[] bArr = C6806tc2.a;
                    String hexString = Integer.toHexString(i);
                    Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(this)");
                    sb.append(hexString);
                    throw new ProtocolException(sb.toString());
                }
                while (true) {
                    if (!cg2.i) {
                        long j = cg2.k;
                        C1481Lu buffer = cg2.p;
                        if (j > 0) {
                            cg2.d.p(buffer, j);
                        }
                        if (cg2.l) {
                            if (cg2.n) {
                                C8054zZ0 c8054zZ0 = cg2.q;
                                if (c8054zZ0 == null) {
                                    c8054zZ0 = new C8054zZ0(cg2.h);
                                    cg2.q = c8054zZ0;
                                }
                                Intrinsics.checkNotNullParameter(buffer, "buffer");
                                C1481Lu c1481Lu = c8054zZ0.e;
                                if (c1481Lu.e != 0) {
                                    throw new IllegalArgumentException("Failed requirement.");
                                }
                                Inflater inflater = c8054zZ0.g;
                                if (c8054zZ0.d) {
                                    inflater.reset();
                                }
                                c1481Lu.l0(buffer);
                                c1481Lu.t1(65535);
                                long bytesRead = inflater.getBytesRead() + c1481Lu.e;
                                do {
                                    c8054zZ0.h.c(buffer, Long.MAX_VALUE);
                                } while (inflater.getBytesRead() < bytesRead);
                            }
                            C7483wo1 c7483wo1 = cg2.e;
                            G1 g1 = c7483wo1.a;
                            if (i != 1) {
                                C1802Pw bytes = buffer.X(buffer.e);
                                Intrinsics.checkNotNullParameter(bytes, "bytes");
                                g1.q(c7483wo1, bytes);
                                break;
                            } else {
                                String text = buffer.Q0();
                                Intrinsics.checkNotNullParameter(text, "text");
                                g1.r(c7483wo1, text);
                                break;
                            }
                        }
                        while (!cg2.i) {
                            cg2.f();
                            if (!cg2.m) {
                                break;
                            } else {
                                cg2.c();
                            }
                        }
                        if (cg2.j != 0) {
                            StringBuilder sb2 = new StringBuilder("Expected continuation opcode. Got: ");
                            int i2 = cg2.j;
                            byte[] bArr2 = C6806tc2.a;
                            String hexString2 = Integer.toHexString(i2);
                            Intrinsics.checkNotNullExpressionValue(hexString2, "toHexString(this)");
                            sb2.append(hexString2);
                            throw new ProtocolException(sb2.toString());
                        }
                    } else {
                        throw new IOException("closed");
                    }
                }
            }
        }
    }

    public final void h() {
        byte[] bArr = C6806tc2.a;
        d dVar = this.h;
        if (dVar != null) {
            this.k.c(dVar, 0L);
        }
    }

    public final synchronized boolean i(int i, C1802Pw c1802Pw) {
        if (!this.t && !this.q) {
            long j = this.p;
            byte[] bArr = c1802Pw.d;
            if (((long) bArr.length) + j > 16777216) {
                c(CredentialsApi.ACTIVITY_RESULT_OTHER_ACCOUNT, null);
                return false;
            }
            this.p = j + ((long) bArr.length);
            this.o.add(new b(i, c1802Pw));
            h();
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007c A[Catch: all -> 0x0090, TRY_ENTER, TryCatch #0 {all -> 0x0090, blocks: (B:29:0x007c, B:32:0x0093, B:34:0x0097, B:35:0x00a3, B:37:0x00af, B:40:0x00b3, B:41:0x00b4, B:42:0x00b5, B:44:0x00b9, B:74:0x0131, B:76:0x0135, B:85:0x014e, B:86:0x0150, B:62:0x00e7, B:66:0x010c, B:67:0x0118, B:63:0x00fb, B:68:0x0119, B:70:0x0123, B:71:0x0126, B:87:0x0151, B:88:0x0156, B:36:0x00a4, B:73:0x012e), top: B:98:0x007a, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0093 A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:29:0x007c, B:32:0x0093, B:34:0x0097, B:35:0x00a3, B:37:0x00af, B:40:0x00b3, B:41:0x00b4, B:42:0x00b5, B:44:0x00b9, B:74:0x0131, B:76:0x0135, B:85:0x014e, B:86:0x0150, B:62:0x00e7, B:66:0x010c, B:67:0x0118, B:63:0x00fb, B:68:0x0119, B:70:0x0123, B:71:0x0126, B:87:0x0151, B:88:0x0156, B:36:0x00a4, B:73:0x012e), top: B:98:0x007a, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0097 A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:29:0x007c, B:32:0x0093, B:34:0x0097, B:35:0x00a3, B:37:0x00af, B:40:0x00b3, B:41:0x00b4, B:42:0x00b5, B:44:0x00b9, B:74:0x0131, B:76:0x0135, B:85:0x014e, B:86:0x0150, B:62:0x00e7, B:66:0x010c, B:67:0x0118, B:63:0x00fb, B:68:0x0119, B:70:0x0123, B:71:0x0126, B:87:0x0151, B:88:0x0156, B:36:0x00a4, B:73:0x012e), top: B:98:0x007a, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b5 A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:29:0x007c, B:32:0x0093, B:34:0x0097, B:35:0x00a3, B:37:0x00af, B:40:0x00b3, B:41:0x00b4, B:42:0x00b5, B:44:0x00b9, B:74:0x0131, B:76:0x0135, B:85:0x014e, B:86:0x0150, B:62:0x00e7, B:66:0x010c, B:67:0x0118, B:63:0x00fb, B:68:0x0119, B:70:0x0123, B:71:0x0126, B:87:0x0151, B:88:0x0156, B:36:0x00a4, B:73:0x012e), top: B:98:0x007a, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b9 A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:29:0x007c, B:32:0x0093, B:34:0x0097, B:35:0x00a3, B:37:0x00af, B:40:0x00b3, B:41:0x00b4, B:42:0x00b5, B:44:0x00b9, B:74:0x0131, B:76:0x0135, B:85:0x014e, B:86:0x0150, B:62:0x00e7, B:66:0x010c, B:67:0x0118, B:63:0x00fb, B:68:0x0119, B:70:0x0123, B:71:0x0126, B:87:0x0151, B:88:0x0156, B:36:0x00a4, B:73:0x012e), top: B:98:0x007a, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fb A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:29:0x007c, B:32:0x0093, B:34:0x0097, B:35:0x00a3, B:37:0x00af, B:40:0x00b3, B:41:0x00b4, B:42:0x00b5, B:44:0x00b9, B:74:0x0131, B:76:0x0135, B:85:0x014e, B:86:0x0150, B:62:0x00e7, B:66:0x010c, B:67:0x0118, B:63:0x00fb, B:68:0x0119, B:70:0x0123, B:71:0x0126, B:87:0x0151, B:88:0x0156, B:36:0x00a4, B:73:0x012e), top: B:98:0x007a, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x010b  */
    /* JADX WARN: Code duplicated, block: B:66:0x010c A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:29:0x007c, B:32:0x0093, B:34:0x0097, B:35:0x00a3, B:37:0x00af, B:40:0x00b3, B:41:0x00b4, B:42:0x00b5, B:44:0x00b9, B:74:0x0131, B:76:0x0135, B:85:0x014e, B:86:0x0150, B:62:0x00e7, B:66:0x010c, B:67:0x0118, B:63:0x00fb, B:68:0x0119, B:70:0x0123, B:71:0x0126, B:87:0x0151, B:88:0x0156, B:36:0x00a4, B:73:0x012e), top: B:98:0x007a, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0123 A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:29:0x007c, B:32:0x0093, B:34:0x0097, B:35:0x00a3, B:37:0x00af, B:40:0x00b3, B:41:0x00b4, B:42:0x00b5, B:44:0x00b9, B:74:0x0131, B:76:0x0135, B:85:0x014e, B:86:0x0150, B:62:0x00e7, B:66:0x010c, B:67:0x0118, B:63:0x00fb, B:68:0x0119, B:70:0x0123, B:71:0x0126, B:87:0x0151, B:88:0x0156, B:36:0x00a4, B:73:0x012e), top: B:98:0x007a, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0135 A[Catch: all -> 0x0090, TRY_LEAVE, TryCatch #0 {all -> 0x0090, blocks: (B:29:0x007c, B:32:0x0093, B:34:0x0097, B:35:0x00a3, B:37:0x00af, B:40:0x00b3, B:41:0x00b4, B:42:0x00b5, B:44:0x00b9, B:74:0x0131, B:76:0x0135, B:85:0x014e, B:86:0x0150, B:62:0x00e7, B:66:0x010c, B:67:0x0118, B:63:0x00fb, B:68:0x0119, B:70:0x0123, B:71:0x0126, B:87:0x0151, B:88:0x0156, B:36:0x00a4, B:73:0x012e), top: B:98:0x007a, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x013f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0144  */
    /* JADX WARN: Code duplicated, block: B:82:0x0149  */
    /* JADX WARN: Code duplicated, block: B:87:0x0151 A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:29:0x007c, B:32:0x0093, B:34:0x0097, B:35:0x00a3, B:37:0x00af, B:40:0x00b3, B:41:0x00b4, B:42:0x00b5, B:44:0x00b9, B:74:0x0131, B:76:0x0135, B:85:0x014e, B:86:0x0150, B:62:0x00e7, B:66:0x010c, B:67:0x0118, B:63:0x00fb, B:68:0x0119, B:70:0x0123, B:71:0x0126, B:87:0x0151, B:88:0x0156, B:36:0x00a4, B:73:0x012e), top: B:98:0x007a, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x00a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x00fb, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean j() {
        Object objPoll;
        String str;
        int i;
        ?? r4;
        ?? r8;
        ?? r7;
        int i2;
        C1802Pw c1802Pw;
        C1802Pw c1802PwX;
        C1481Lu c1481Lu;
        b bVar;
        synchronized (this) {
            try {
                if (this.t) {
                    return false;
                }
                C7667xh2 c7667xh2 = this.j;
                C1802Pw c1802PwPoll = this.n.poll();
                String str2 = null;
                try {
                    if (c1802PwPoll == null) {
                        objPoll = this.o.poll();
                        if (objPoll instanceof a) {
                            i = this.r;
                            str = this.s;
                            if (i != -1) {
                                C3862fo1 c3862fo1 = this.m;
                                this.m = null;
                                Cg2 cg2 = this.i;
                                this.i = null;
                                C7667xh2 c7667xh3 = this.j;
                                this.j = null;
                                this.k.f();
                                r4 = c3862fo1;
                                r7 = cg2;
                                r8 = c7667xh3;
                            } else {
                                ((a) objPoll).getClass();
                                this.k.c(new e(this.l + " cancel"), TimeUnit.MILLISECONDS.toNanos(60000L));
                                r4 = 0;
                                r7 = 0;
                                r8 = 0;
                            }
                        } else {
                            if (objPoll == null) {
                                return false;
                            }
                            str = null;
                        }
                        Unit unit = Unit.a;
                        if (c1802PwPoll != null) {
                            Intrinsics.checkNotNull(c7667xh2);
                            C1802Pw payload = c1802PwPoll;
                            c7667xh2.getClass();
                            Intrinsics.checkNotNullParameter(payload, "payload");
                            c7667xh2.c(10, payload);
                        } else if (objPoll instanceof b) {
                            bVar = (b) objPoll;
                            Intrinsics.checkNotNull(c7667xh2);
                            c7667xh2.f(bVar.a, bVar.b);
                            synchronized (this) {
                                this.p -= (long) bVar.b.d.length;
                            }
                        } else {
                            if (objPoll instanceof a) {
                                throw new AssertionError();
                            }
                            a aVar = (a) objPoll;
                            Intrinsics.checkNotNull(c7667xh2);
                            i2 = aVar.a;
                            c1802Pw = aVar.b;
                            c7667xh2.getClass();
                            c1802PwX = C1802Pw.h;
                            if (i2 == 0 || c1802Pw != null) {
                                if (i2 != 0) {
                                    if (i2 >= 1000 || i2 >= 5000) {
                                        str2 = "Code must be in range [1000,5000): " + i2;
                                    } else if ((1004 <= i2 && i2 < 1007) || (1015 <= i2 && i2 < 3000)) {
                                        str2 = "Code " + i2 + " is reserved and may not be used.";
                                    }
                                    if (str2 != null) {
                                        Intrinsics.checkNotNull(str2);
                                        throw new IllegalArgumentException(str2.toString());
                                    }
                                }
                                c1481Lu = new C1481Lu();
                                c1481Lu.u1(i2);
                                if (c1802Pw != null) {
                                    c1481Lu.Y0(c1802Pw);
                                }
                                c1802PwX = c1481Lu.X(c1481Lu.e);
                            }
                            try {
                                c7667xh2.c(8, c1802PwX);
                                c7667xh2.l = true;
                                if (r4 != 0) {
                                    G1 g1 = this.a;
                                    Intrinsics.checkNotNull(str);
                                    g1.l(this, i, str);
                                }
                            } catch (Throwable th) {
                                c7667xh2.l = true;
                                throw th;
                            }
                        }
                        if (r4 != 0) {
                            C6806tc2.d(r4);
                        }
                        if (r7 != 0) {
                            C6806tc2.d(r7);
                        }
                        if (r8 != 0) {
                            C6806tc2.d(r8);
                        }
                        return true;
                    }
                    objPoll = null;
                    str = null;
                    if (c1802PwPoll != null) {
                        Intrinsics.checkNotNull(c7667xh2);
                        C1802Pw payload2 = c1802PwPoll;
                        c7667xh2.getClass();
                        Intrinsics.checkNotNullParameter(payload2, "payload");
                        c7667xh2.c(10, payload2);
                    } else if (objPoll instanceof b) {
                        bVar = (b) objPoll;
                        Intrinsics.checkNotNull(c7667xh2);
                        c7667xh2.f(bVar.a, bVar.b);
                        synchronized (this) {
                            this.p -= (long) bVar.b.d.length;
                        }
                    } else {
                        if (objPoll instanceof a) {
                            throw new AssertionError();
                        }
                        a aVar2 = (a) objPoll;
                        Intrinsics.checkNotNull(c7667xh2);
                        i2 = aVar2.a;
                        c1802Pw = aVar2.b;
                        c7667xh2.getClass();
                        c1802PwX = C1802Pw.h;
                        if (i2 == 0) {
                            if (i2 != 0) {
                                if (i2 >= 1000) {
                                    str2 = "Code must be in range [1000,5000): " + i2;
                                } else {
                                    str2 = "Code must be in range [1000,5000): " + i2;
                                }
                                if (str2 != null) {
                                    Intrinsics.checkNotNull(str2);
                                    throw new IllegalArgumentException(str2.toString());
                                }
                            }
                            c1481Lu = new C1481Lu();
                            c1481Lu.u1(i2);
                            if (c1802Pw != null) {
                                c1481Lu.Y0(c1802Pw);
                            }
                            c1802PwX = c1481Lu.X(c1481Lu.e);
                        } else {
                            if (i2 != 0) {
                                if (i2 >= 1000) {
                                    str2 = "Code must be in range [1000,5000): " + i2;
                                } else {
                                    str2 = "Code must be in range [1000,5000): " + i2;
                                }
                                if (str2 != null) {
                                    Intrinsics.checkNotNull(str2);
                                    throw new IllegalArgumentException(str2.toString());
                                }
                            }
                            c1481Lu = new C1481Lu();
                            c1481Lu.u1(i2);
                            if (c1802Pw != null) {
                                c1481Lu.Y0(c1802Pw);
                            }
                            c1802PwX = c1481Lu.X(c1481Lu.e);
                        }
                        c7667xh2.c(8, c1802PwX);
                        c7667xh2.l = true;
                        if (r4 != 0) {
                            G1 g2 = this.a;
                            Intrinsics.checkNotNull(str);
                            g2.l(this, i, str);
                        }
                    }
                    if (r4 != 0) {
                        C6806tc2.d(r4);
                    }
                    if (r7 != 0) {
                        C6806tc2.d(r7);
                    }
                    if (r8 != 0) {
                        C6806tc2.d(r8);
                    }
                    return true;
                } catch (Throwable th2) {
                    if (r4 != 0) {
                        C6806tc2.d(r4);
                    }
                    if (r7 != 0) {
                        C6806tc2.d(r7);
                    }
                    if (r8 != 0) {
                        C6806tc2.d(r8);
                    }
                    throw th2;
                }
                String str3 = str;
                String str4 = str3;
                i = -1;
                r4 = str4;
                r7 = str3;
                r8 = str4;
                Unit unit2 = Unit.a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
