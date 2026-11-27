package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xh2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7667xh2 implements Closeable {

    @NotNull
    public final C2814ao1 d;

    @NotNull
    public final Random e;
    public final boolean g;
    public final boolean h;
    public final long i;

    @NotNull
    public final C1481Lu j;

    @NotNull
    public final C1481Lu k;
    public boolean l;

    @Nullable
    public C7424wZ0 m;

    @Nullable
    public final byte[] n;

    @Nullable
    public final C1481Lu.b o;

    public C7667xh2(@NotNull C2814ao1 sink, @NotNull Random random, boolean z, boolean z2, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(random, "random");
        this.d = sink;
        this.e = random;
        this.g = z;
        this.h = z2;
        this.i = j;
        this.j = new C1481Lu();
        this.k = sink.e;
        this.n = new byte[4];
        this.o = new C1481Lu.b();
    }

    public final void c(int i, C1802Pw c1802Pw) throws IOException {
        if (this.l) {
            throw new IOException("closed");
        }
        int iF = c1802Pw.f();
        if (iF > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        int i2 = i | UserVerificationMethods.USER_VERIFY_PATTERN;
        C1481Lu c1481Lu = this.k;
        c1481Lu.j1(i2);
        c1481Lu.j1(iF | UserVerificationMethods.USER_VERIFY_PATTERN);
        byte[] bArr = this.n;
        Intrinsics.checkNotNull(bArr);
        this.e.nextBytes(bArr);
        c1481Lu.b1(bArr);
        if (iF > 0) {
            long j = c1481Lu.e;
            c1481Lu.Y0(c1802Pw);
            C1481Lu.b bVar = this.o;
            Intrinsics.checkNotNull(bVar);
            c1481Lu.L(bVar);
            bVar.f(j);
            Bg2.a(bVar, bArr);
            bVar.close();
        }
        this.d.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        C7424wZ0 c7424wZ0 = this.m;
        if (c7424wZ0 != null) {
            c7424wZ0.close();
        }
    }

    public final void f(int i, @NotNull C1802Pw data) throws IOException {
        Intrinsics.checkNotNullParameter(data, "data");
        if (this.l) {
            throw new IOException("closed");
        }
        C1481Lu buffer = this.j;
        buffer.Y0(data);
        int i2 = i | UserVerificationMethods.USER_VERIFY_PATTERN;
        if (this.g && data.d.length >= this.i) {
            C7424wZ0 c7424wZ0 = this.m;
            if (c7424wZ0 == null) {
                c7424wZ0 = new C7424wZ0(this.h);
                this.m = c7424wZ0;
            }
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            C1481Lu c1481Lu = c7424wZ0.e;
            if (c1481Lu.e != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (c7424wZ0.d) {
                c7424wZ0.g.reset();
            }
            long j = buffer.e;
            FW fw = c7424wZ0.h;
            fw.i1(buffer, j);
            fw.flush();
            C1802Pw c1802Pw = C7634xZ0.a;
            if (c1481Lu.U(c1481Lu.e - ((long) c1802Pw.d.length), c1802Pw)) {
                long j2 = c1481Lu.e - ((long) 4);
                C1481Lu.b bVarL = c1481Lu.L(C5417n.a);
                try {
                    bVarL.c(j2);
                    bVarL.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        C6621sj.b(bVarL, th);
                        throw th2;
                    }
                }
            } else {
                c1481Lu.j1(0);
            }
            buffer.i1(c1481Lu, c1481Lu.e);
            i2 = i | 192;
        }
        long j3 = buffer.e;
        C1481Lu c1481Lu2 = this.k;
        c1481Lu2.j1(i2);
        if (j3 <= 125) {
            c1481Lu2.j1(((int) j3) | UserVerificationMethods.USER_VERIFY_PATTERN);
        } else if (j3 <= 65535) {
            c1481Lu2.j1(254);
            c1481Lu2.u1((int) j3);
        } else {
            c1481Lu2.j1(255);
            C7782yE1 c7782yE1V0 = c1481Lu2.V0(8);
            int i3 = c7782yE1V0.c;
            byte[] bArr = c7782yE1V0.a;
            bArr[i3] = (byte) ((j3 >>> 56) & 255);
            bArr[i3 + 1] = (byte) ((j3 >>> 48) & 255);
            bArr[i3 + 2] = (byte) ((j3 >>> 40) & 255);
            bArr[i3 + 3] = (byte) ((j3 >>> 32) & 255);
            bArr[i3 + 4] = (byte) ((j3 >>> 24) & 255);
            bArr[i3 + 5] = (byte) ((j3 >>> 16) & 255);
            bArr[i3 + 6] = (byte) ((j3 >>> 8) & 255);
            bArr[i3 + 7] = (byte) (j3 & 255);
            c7782yE1V0.c = i3 + 8;
            c1481Lu2.e += 8;
        }
        byte[] bArr2 = this.n;
        Intrinsics.checkNotNull(bArr2);
        this.e.nextBytes(bArr2);
        c1481Lu2.b1(bArr2);
        if (j3 > 0) {
            C1481Lu.b bVar = this.o;
            Intrinsics.checkNotNull(bVar);
            buffer.L(bVar);
            bVar.f(0L);
            Bg2.a(bVar, bArr2);
            bVar.close();
        }
        c1481Lu2.i1(buffer, j3);
        C2814ao1 c2814ao1 = this.d;
        if (c2814ao1.g) {
            throw new IllegalStateException("closed");
        }
        C1481Lu c1481Lu3 = c2814ao1.e;
        long j4 = c1481Lu3.e;
        if (j4 > 0) {
            c2814ao1.d.i1(c1481Lu3, j4);
        }
    }
}
