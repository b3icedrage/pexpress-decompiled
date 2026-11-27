package defpackage;

import com.google.android.gms.common.api.Api;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Fp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1000Fp0 implements Closeable {
    public static final Logger j = Logger.getLogger(C6434rp0.class.getName());

    @NotNull
    public final C2814ao1 d;

    @NotNull
    public final C1481Lu e;
    public int g;
    public boolean h;

    @NotNull
    public final C5172lp0.b i;

    public C1000Fp0(@NotNull C2814ao1 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.d = sink;
        C1481Lu c1481Lu = new C1481Lu();
        this.e = c1481Lu;
        this.g = 16384;
        this.i = new C5172lp0.b(c1481Lu);
    }

    public final synchronized void c(@NotNull C6536sJ1 peerSettings) {
        try {
            Intrinsics.checkNotNullParameter(peerSettings, "peerSettings");
            if (this.h) {
                throw new IOException("closed");
            }
            int i = this.g;
            int i2 = peerSettings.a;
            if ((i2 & 32) != 0) {
                i = peerSettings.b[5];
            }
            this.g = i;
            if (((i2 & 2) != 0 ? peerSettings.b[1] : -1) != -1) {
                C5172lp0.b bVar = this.i;
                int i3 = (i2 & 2) != 0 ? peerSettings.b[1] : -1;
                bVar.getClass();
                int iMin = Math.min(i3, 16384);
                int i4 = bVar.d;
                if (i4 != iMin) {
                    if (iMin < i4) {
                        bVar.b = Math.min(bVar.b, iMin);
                    }
                    bVar.c = true;
                    bVar.d = iMin;
                    int i5 = bVar.h;
                    if (iMin < i5) {
                        if (iMin == 0) {
                            C1932Rn0[] c1932Rn0Arr = bVar.e;
                            C1371Kj.f(c1932Rn0Arr, null, 0, c1932Rn0Arr.length);
                            bVar.f = bVar.e.length - 1;
                            bVar.g = 0;
                            bVar.h = 0;
                        } else {
                            bVar.a(i5 - iMin);
                        }
                    }
                }
            }
            g(0, 0, 4, 1);
            this.d.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.h = true;
        this.d.close();
    }

    public final synchronized void f(boolean z, int i, @Nullable C1481Lu c1481Lu, int i2) {
        if (this.h) {
            throw new IOException("closed");
        }
        g(i, i2, 0, z ? 1 : 0);
        if (i2 > 0) {
            Intrinsics.checkNotNull(c1481Lu);
            this.d.i1(c1481Lu, i2);
        }
    }

    public final synchronized void flush() {
        if (this.h) {
            throw new IOException("closed");
        }
        this.d.flush();
    }

    public final void g(int i, int i2, int i3, int i4) {
        Level level = Level.FINE;
        Logger logger = j;
        if (logger.isLoggable(level)) {
            C6434rp0.a.getClass();
            logger.fine(C6434rp0.a(false, i, i2, i3, i4));
        }
        if (i2 > this.g) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.g + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(EK.e(i, "reserved bit set: ").toString());
        }
        byte[] bArr = C6806tc2.a;
        C2814ao1 c2814ao1 = this.d;
        Intrinsics.checkNotNullParameter(c2814ao1, "<this>");
        c2814ao1.Y((i2 >>> 16) & 255);
        c2814ao1.Y((i2 >>> 8) & 255);
        c2814ao1.Y(i2 & 255);
        c2814ao1.Y(i3 & 255);
        c2814ao1.Y(i4 & 255);
        c2814ao1.f(i & Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public final synchronized void k(int i, @NotNull EnumC7967z70 errorCode, @NotNull byte[] debugData) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(debugData, "debugData");
        if (this.h) {
            throw new IOException("closed");
        }
        if (errorCode.d == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        g(0, debugData.length + 8, 7, 0);
        this.d.f(i);
        this.d.f(errorCode.d);
        if (debugData.length != 0) {
            this.d.Z0(debugData);
        }
        this.d.flush();
    }

    public final synchronized void l(boolean z, int i, @NotNull ArrayList headerBlock) {
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        if (this.h) {
            throw new IOException("closed");
        }
        this.i.d(headerBlock);
        long j2 = this.e.e;
        long jMin = Math.min(this.g, j2);
        int i2 = j2 == jMin ? 4 : 0;
        if (z) {
            i2 |= 1;
        }
        g(i, (int) jMin, 1, i2);
        this.d.i1(this.e, jMin);
        if (j2 > jMin) {
            long j3 = j2 - jMin;
            while (j3 > 0) {
                long jMin2 = Math.min(this.g, j3);
                j3 -= jMin2;
                g(i, (int) jMin2, 9, j3 == 0 ? 4 : 0);
                this.d.i1(this.e, jMin2);
            }
        }
    }

    public final synchronized void p(int i, boolean z, int i2) {
        if (this.h) {
            throw new IOException("closed");
        }
        g(0, 8, 6, z ? 1 : 0);
        this.d.f(i);
        this.d.f(i2);
        this.d.flush();
    }

    public final synchronized void q(int i, @NotNull EnumC7967z70 errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.h) {
            throw new IOException("closed");
        }
        if (errorCode.d == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        g(i, 4, 3, 0);
        this.d.f(errorCode.d);
        this.d.flush();
    }

    public final synchronized void t(int i, long j2) {
        if (this.h) {
            throw new IOException("closed");
        }
        if (j2 == 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j2).toString());
        }
        g(i, 4, 8, 0);
        this.d.f((int) j2);
        this.d.flush();
    }
}
