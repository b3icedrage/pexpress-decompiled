package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: yA0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7769yA0 implements Closeable {

    @NotNull
    public final O71<C2895bC> d;

    @NotNull
    public C2895bC e;

    @NotNull
    public ByteBuffer g;
    public int h;
    public int i;
    public long j;
    public boolean k;

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC7769yA0() {
        C2895bC c2895bC = C2895bC.l;
        this(c2895bC, C3043bv.g(c2895bC), C1718Ou.a);
    }

    public final C2895bC A(int i, C2895bC c2895bC) {
        while (true) {
            int i2 = this.i - this.h;
            if (i2 >= i) {
                break;
            }
            C2895bC c2895bCG = c2895bC.g();
            if (c2895bCG == null && (c2895bCG = f()) == null) {
                return null;
            }
            if (i2 == 0) {
                if (c2895bC != C2895bC.l) {
                    C(c2895bC);
                }
                c2895bC = c2895bCG;
            } else {
                int iY = C8056za.y(c2895bC, c2895bCG, i - i2);
                this.i = c2895bC.c;
                D(this.j - ((long) iY));
                int i3 = c2895bCG.c;
                int i4 = c2895bCG.b;
                if (i3 <= i4) {
                    c2895bC.f();
                    c2895bC.k(c2895bCG.f());
                    c2895bCG.i(this.d);
                } else {
                    if (iY < 0) {
                        throw new IllegalArgumentException(EK.e(iY, "startGap shouldn't be negative: ").toString());
                    }
                    if (i4 >= iY) {
                        c2895bCG.d = iY;
                    } else {
                        if (i4 != i3) {
                            Intrinsics.checkNotNullParameter(c2895bCG, "<this>");
                            StringBuilder sbC = C1332Jw.c(iY, "Unable to reserve ", " start gap: there are already ");
                            sbC.append(c2895bCG.c - c2895bCG.b);
                            sbC.append(" content bytes starting at offset ");
                            sbC.append(c2895bCG.b);
                            throw new IllegalStateException(sbC.toString());
                        }
                        if (iY > c2895bCG.e) {
                            Intrinsics.checkNotNullParameter(c2895bCG, "<this>");
                            int i5 = c2895bCG.f;
                            if (iY > i5) {
                                throw new IllegalArgumentException(C4564j.c(iY, i5, "Start gap ", " is bigger than the capacity "));
                            }
                            StringBuilder sbC2 = C1332Jw.c(iY, "Unable to reserve ", " start gap: there are already ");
                            sbC2.append(i5 - c2895bCG.e);
                            sbC2.append(" bytes reserved in the end");
                            throw new IllegalStateException(sbC2.toString());
                        }
                        c2895bCG.c = iY;
                        c2895bCG.b = iY;
                        c2895bCG.d = iY;
                    }
                }
                if (c2895bC.c - c2895bC.b >= i) {
                    break;
                }
                if (i > 8) {
                    throw new IllegalStateException(C1332Jw.a(i, "minSize of ", " is too big (should be less than 8)"));
                }
            }
        }
        return c2895bC;
    }

    @NotNull
    public final void C(@NotNull C2895bC head) {
        Intrinsics.checkNotNullParameter(head, "head");
        C2895bC c2895bCF = head.f();
        if (c2895bCF == null) {
            c2895bCF = C2895bC.l;
        }
        G(c2895bCF);
        D(this.j - ((long) (c2895bCF.c - c2895bCF.b)));
        head.i(this.d);
    }

    public final void D(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(C6419rl.a("tailRemaining shouldn't be negative: ", j).toString());
        }
        this.j = j;
    }

    public final void G(C2895bC c2895bC) {
        this.e = c2895bC;
        this.g = c2895bC.a;
        this.h = c2895bC.b;
        this.i = c2895bC.c;
    }

    public final void c(int i) throws EOFException {
        if (i < 0) {
            throw new IllegalArgumentException(EK.e(i, "Negative discard is not allowed: ").toString());
        }
        int i2 = 0;
        int i3 = i;
        while (i3 != 0) {
            C2895bC c2895bCV = v();
            if (c2895bCV == null) {
                break;
            }
            int iMin = Math.min(c2895bCV.c - c2895bCV.b, i3);
            c2895bCV.c(iMin);
            this.h += iMin;
            if (c2895bCV.c - c2895bCV.b == 0) {
                C(c2895bCV);
            }
            i3 -= iMin;
            i2 += iMin;
        }
        if (i2 != i) {
            throw new EOFException(C1332Jw.a(i, "Unable to discard ", " bytes due to end of packet"));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws EOFException {
        C2895bC c2895bCT = t();
        C2895bC c2895bC = C2895bC.l;
        if (c2895bCT != c2895bC) {
            G(c2895bC);
            D(0L);
            O71<C2895bC> pool = this.d;
            Intrinsics.checkNotNullParameter(pool, "pool");
            while (c2895bCT != null) {
                C2895bC c2895bCF = c2895bCT.f();
                c2895bCT.i(pool);
                c2895bCT = c2895bCF;
            }
        }
        if (this.k) {
            return;
        }
        this.k = true;
    }

    public final C2895bC f() {
        if (this.k) {
            return null;
        }
        C2895bC c2895bCK = k();
        if (c2895bCK == null) {
            this.k = true;
            return null;
        }
        C2895bC c2895bC = this.e;
        Intrinsics.checkNotNullParameter(c2895bC, "<this>");
        while (true) {
            C2895bC c2895bCG = c2895bC.g();
            if (c2895bCG == null) {
                break;
            }
            c2895bC = c2895bCG;
        }
        if (c2895bC != C2895bC.l) {
            c2895bC.k(c2895bCK);
            D(C3043bv.g(c2895bCK) + this.j);
            return c2895bCK;
        }
        G(c2895bCK);
        if (this.j != 0) {
            throw new IllegalStateException("It should be no tail remaining bytes if current tail is EmptyBuffer");
        }
        C2895bC c2895bCG2 = c2895bCK.g();
        D(c2895bCG2 != null ? C3043bv.g(c2895bCG2) : 0L);
        return c2895bCK;
    }

    @Nullable
    public final C2895bC g(@NotNull C2895bC current) {
        Intrinsics.checkNotNullParameter(current, "current");
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2895bC.i;
        C2895bC c2895bC = C2895bC.l;
        while (current != c2895bC) {
            C2895bC c2895bCF = current.f();
            current.i(this.d);
            if (c2895bCF == null) {
                G(c2895bC);
                D(0L);
                current = c2895bC;
            } else {
                if (c2895bCF.c > c2895bCF.b) {
                    G(c2895bCF);
                    D(this.j - ((long) (c2895bCF.c - c2895bCF.b)));
                    return c2895bCF;
                }
                current = c2895bCF;
            }
        }
        return f();
    }

    @Nullable
    public C2895bC k() {
        O71<C2895bC> o71 = this.d;
        C2895bC c2895bCS = o71.S();
        try {
            c2895bCS.e();
            l(c2895bCS.a);
            this.k = true;
            if (c2895bCS.c > c2895bCS.b) {
                c2895bCS.a(0);
                return c2895bCS;
            }
            c2895bCS.i(o71);
            return null;
        } catch (Throwable th) {
            c2895bCS.i(o71);
            throw th;
        }
    }

    public abstract void l(@NotNull ByteBuffer byteBuffer);

    public final void p(C2895bC c2895bC) {
        if (this.k && c2895bC.g() == null) {
            this.h = c2895bC.b;
            this.i = c2895bC.c;
            D(0L);
            return;
        }
        int i = c2895bC.c - c2895bC.b;
        int iMin = Math.min(i, 8 - (c2895bC.f - c2895bC.e));
        O71<C2895bC> o71 = this.d;
        if (i > iMin) {
            C2895bC c2895bCS = o71.S();
            C2895bC c2895bCS2 = o71.S();
            c2895bCS.e();
            c2895bCS2.e();
            c2895bCS.k(c2895bCS2);
            c2895bCS2.k(c2895bC.f());
            C8056za.y(c2895bCS, c2895bC, i - iMin);
            C8056za.y(c2895bCS2, c2895bC, iMin);
            G(c2895bCS);
            D(C3043bv.g(c2895bCS2));
        } else {
            C2895bC c2895bCS3 = o71.S();
            c2895bCS3.e();
            c2895bCS3.k(c2895bC.f());
            C8056za.y(c2895bCS3, c2895bC, i);
            G(c2895bCS3);
        }
        c2895bC.i(o71);
    }

    public final boolean q() {
        if (this.i - this.h == 0 && this.j == 0) {
            return this.k || f() == null;
        }
        return false;
    }

    @NotNull
    public final C2895bC t() throws EOFException {
        C2895bC c2895bC = this.e;
        int i = this.h;
        if (i < 0 || i > c2895bC.c) {
            int i2 = c2895bC.b;
            C0564Aa.g(i - i2, c2895bC.c - i2);
            throw null;
        }
        if (c2895bC.b != i) {
            c2895bC.b = i;
        }
        return c2895bC;
    }

    public final long u() {
        return ((long) (this.i - this.h)) + this.j;
    }

    @Nullable
    public final C2895bC v() throws EOFException {
        C2895bC c2895bCT = t();
        return this.i - this.h >= 1 ? c2895bCT : A(1, c2895bCT);
    }

    public AbstractC7769yA0(@NotNull C2895bC head, long j, @NotNull O71<C2895bC> pool) {
        Intrinsics.checkNotNullParameter(head, "head");
        Intrinsics.checkNotNullParameter(pool, "pool");
        this.d = pool;
        this.e = head;
        this.g = head.a;
        int i = head.b;
        this.h = i;
        int i2 = head.c;
        this.i = i2;
        this.j = j - ((long) (i2 - i));
    }
}
