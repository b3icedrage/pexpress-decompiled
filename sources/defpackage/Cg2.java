package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class Cg2 implements Closeable {

    @NotNull
    public final C3024bo1 d;

    @NotNull
    public final C7483wo1 e;
    public final boolean g;
    public final boolean h;
    public boolean i;
    public int j;
    public long k;
    public boolean l;
    public boolean m;
    public boolean n;

    @NotNull
    public final C1481Lu o;

    @NotNull
    public final C1481Lu p;

    @Nullable
    public C8054zZ0 q;

    @Nullable
    public final byte[] r;

    public Cg2(@NotNull C3024bo1 source, @NotNull C7483wo1 frameCallback, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(frameCallback, "frameCallback");
        this.d = source;
        this.e = frameCallback;
        this.g = z;
        this.h = z2;
        this.o = new C1481Lu();
        this.p = new C1481Lu();
        this.r = null;
    }

    public final void c() {
        String reason;
        short sL0;
        Cg2 cg2;
        C7667xh2 c7667xh2;
        String strE;
        long j = this.k;
        C1481Lu c1481Lu = this.o;
        if (j > 0) {
            this.d.p(c1481Lu, j);
        }
        int i = this.j;
        C7483wo1 c7483wo1 = this.e;
        switch (i) {
            case 8:
                long j2 = c1481Lu.e;
                if (j2 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                C3862fo1 c3862fo1 = null;
                if (j2 != 0) {
                    sL0 = c1481Lu.L0();
                    reason = c1481Lu.Q0();
                    if (sL0 < 1000 || sL0 >= 5000) {
                        strE = EK.e(sL0, "Code must be in range [1000,5000): ");
                    } else {
                        strE = ((1004 > sL0 || sL0 >= 1007) && (1015 > sL0 || sL0 >= 3000)) ? null : C1332Jw.a(sL0, "Code ", " is reserved and may not be used.");
                    }
                    if (strE != null) {
                        throw new ProtocolException(strE);
                    }
                } else {
                    reason = "";
                    sL0 = 1005;
                }
                Intrinsics.checkNotNullParameter(reason, "reason");
                if (sL0 == -1) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                synchronized (c7483wo1) {
                    try {
                        if (c7483wo1.r != -1) {
                            throw new IllegalStateException("already closed");
                        }
                        c7483wo1.r = sL0;
                        c7483wo1.s = reason;
                        if (c7483wo1.q && c7483wo1.o.isEmpty()) {
                            C3862fo1 c3862fo2 = c7483wo1.m;
                            c7483wo1.m = null;
                            cg2 = c7483wo1.i;
                            c7483wo1.i = null;
                            c7667xh2 = c7483wo1.j;
                            c7483wo1.j = null;
                            c7483wo1.k.f();
                            c3862fo1 = c3862fo2;
                        } else {
                            cg2 = null;
                            c7667xh2 = null;
                        }
                        Unit unit = Unit.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    c7483wo1.a.m(c7483wo1, sL0, reason);
                    if (c3862fo1 != null) {
                        c7483wo1.a.l(c7483wo1, sL0, reason);
                        break;
                    }
                    if (c3862fo1 != null) {
                        C6806tc2.d(c3862fo1);
                    }
                    if (cg2 != null) {
                        C6806tc2.d(cg2);
                    }
                    if (c7667xh2 != null) {
                        C6806tc2.d(c7667xh2);
                    }
                    this.i = true;
                    return;
                } catch (Throwable th2) {
                    if (c3862fo1 != null) {
                        C6806tc2.d(c3862fo1);
                    }
                    if (cg2 != null) {
                        C6806tc2.d(cg2);
                    }
                    if (c7667xh2 != null) {
                        C6806tc2.d(c7667xh2);
                    }
                    throw th2;
                }
            case 9:
                C1802Pw payload = c1481Lu.X(c1481Lu.e);
                synchronized (c7483wo1) {
                    try {
                        Intrinsics.checkNotNullParameter(payload, "payload");
                        if (!c7483wo1.t && (!c7483wo1.q || !c7483wo1.o.isEmpty())) {
                            c7483wo1.n.add(payload);
                            c7483wo1.h();
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            case 10:
                C1802Pw payload2 = c1481Lu.X(c1481Lu.e);
                synchronized (c7483wo1) {
                    Intrinsics.checkNotNullParameter(payload2, "payload");
                    c7483wo1.v = false;
                }
                return;
            default:
                StringBuilder sb = new StringBuilder("Unknown control opcode: ");
                int i2 = this.j;
                byte[] bArr = C6806tc2.a;
                String hexString = Integer.toHexString(i2);
                Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(this)");
                sb.append(hexString);
                throw new ProtocolException(sb.toString());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C8054zZ0 c8054zZ0 = this.q;
        if (c8054zZ0 != null) {
            c8054zZ0.close();
        }
    }

    public final void f() {
        boolean z;
        long jK0;
        if (this.i) {
            throw new IOException("closed");
        }
        C3024bo1 c3024bo1 = this.d;
        long jH = c3024bo1.d.o().h();
        UN1 un1 = c3024bo1.d;
        un1.o().b();
        try {
            byte bG = c3024bo1.g();
            byte[] bArr = C6806tc2.a;
            un1.o().g(jH, TimeUnit.NANOSECONDS);
            int i = bG & 15;
            this.j = i;
            boolean z2 = (bG & 128) != 0;
            this.l = z2;
            boolean z3 = (bG & 8) != 0;
            this.m = z3;
            if (z3 && !z2) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z4 = (bG & 64) != 0;
            if (i == 1 || i == 2) {
                if (!z4) {
                    z = false;
                } else {
                    if (!this.g) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z = true;
                }
                this.n = z;
            } else if (z4) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((bG & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((bG & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            byte bG2 = c3024bo1.g();
            boolean z5 = (bG2 & 128) != 0;
            if (z5) {
                throw new ProtocolException("Server-sent frames must not be masked.");
            }
            long j = bG2 & 127;
            this.k = j;
            C1481Lu c1481Lu = c3024bo1.e;
            if (j == 126) {
                this.k = c3024bo1.v() & 65535;
            } else if (j == 127) {
                c3024bo1.C(8L);
                if (c1481Lu.e < 8) {
                    throw new EOFException();
                }
                C7782yE1 c7782yE1 = c1481Lu.d;
                Intrinsics.checkNotNull(c7782yE1);
                int i2 = c7782yE1.b;
                int i3 = c7782yE1.c;
                if (i3 - i2 < 8) {
                    jK0 = ((((long) c1481Lu.K0()) & 4294967295L) << 32) | (4294967295L & ((long) c1481Lu.K0()));
                } else {
                    byte[] bArr2 = c7782yE1.a;
                    int i4 = i2 + 7;
                    long j2 = ((((long) bArr2[i2]) & 255) << 56) | ((((long) bArr2[1 + i2]) & 255) << 48) | ((((long) bArr2[2 + i2]) & 255) << 40) | ((((long) bArr2[i2 + 3]) & 255) << 32) | ((((long) bArr2[i2 + 4]) & 255) << 24) | ((((long) bArr2[i2 + 5]) & 255) << 16) | ((((long) bArr2[i2 + 6]) & 255) << 8);
                    int i5 = i2 + 8;
                    jK0 = j2 | (((long) bArr2[i4]) & 255);
                    c1481Lu.e -= 8;
                    if (i5 == i3) {
                        c1481Lu.d = c7782yE1.a();
                        AE1.a(c7782yE1);
                    } else {
                        c7782yE1.b = i5;
                    }
                }
                this.k = jK0;
                if (jK0 < 0) {
                    StringBuilder sb = new StringBuilder("Frame length 0x");
                    String hexString = Long.toHexString(this.k);
                    Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(this)");
                    sb.append(hexString);
                    sb.append(" > 0x7FFFFFFFFFFFFFFF");
                    throw new ProtocolException(sb.toString());
                }
            }
            if (this.m && this.k > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (!z5) {
                return;
            }
            byte[] sink = this.r;
            Intrinsics.checkNotNull(sink);
            Intrinsics.checkNotNullParameter(sink, "sink");
            try {
                c3024bo1.C(sink.length);
                c1481Lu.i0(sink);
            } catch (EOFException e) {
                int i6 = 0;
                while (true) {
                    long j3 = c1481Lu.e;
                    if (j3 <= 0) {
                        throw e;
                    }
                    int iG = c1481Lu.G(sink, i6, (int) j3);
                    if (iG == -1) {
                        throw new AssertionError();
                    }
                    i6 += iG;
                }
            }
        } catch (Throwable th) {
            un1.o().g(jH, TimeUnit.NANOSECONDS);
            throw th;
        }
    }
}
