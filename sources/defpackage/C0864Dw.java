package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.Closeable;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Dw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0864Dw implements Appendable, Closeable {

    @NotNull
    public final RU d;

    @Nullable
    public C2895bC e;

    @Nullable
    public C2895bC g;

    @NotNull
    public ByteBuffer h;
    public int i;
    public int j;
    public int k;
    public int l;

    public C0864Dw() {
        this(null);
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) throws EOFException {
        l(c);
        return this;
    }

    public final void c() {
        C2895bC c2895bC = this.g;
        if (c2895bC != null) {
            this.i = c2895bC.c;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        RU pool = this.d;
        C2895bC c2895bCV = v();
        if (c2895bCV == null) {
            return;
        }
        C2895bC c2895bCG = c2895bCV;
        do {
            try {
                ByteBuffer source = c2895bCG.a;
                Intrinsics.checkNotNullParameter(source, "source");
                c2895bCG = c2895bCG.g();
            } finally {
                Intrinsics.checkNotNullParameter(pool, "pool");
                while (c2895bCV != null) {
                    C2895bC c2895bCF = c2895bCV.f();
                    c2895bCV.i(pool);
                    c2895bCV = c2895bCF;
                }
            }
        } while (c2895bCG != null);
    }

    public /* bridge */ /* synthetic */ C0864Dw f(char c) throws EOFException {
        l(c);
        return this;
    }

    public /* bridge */ /* synthetic */ C0864Dw g(CharSequence charSequence) {
        p(charSequence);
        return this;
    }

    public final C0864Dw k(CharSequence charSequence, int i, int i2) {
        C0864Dw c0864DwQ = q(charSequence, i, i2);
        Intrinsics.c(c0864DwQ, "null cannot be cast to non-null type io.ktor.utils.io.core.BytePacketBuilder");
        return c0864DwQ;
    }

    @NotNull
    public final C0864Dw l(char c) throws EOFException {
        int i = this.i;
        int i2 = 4;
        if (this.j - i >= 3) {
            ByteBuffer byteBuffer = this.h;
            if (c >= 0 && c < 128) {
                byteBuffer.put(i, (byte) c);
                i2 = 1;
            } else if (128 <= c && c < 2048) {
                byteBuffer.put(i, (byte) (((c >> 6) & 31) | 192));
                byteBuffer.put(i + 1, (byte) ((c & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                i2 = 2;
            } else if (2048 <= c && c < 0) {
                byteBuffer.put(i, (byte) (((c >> '\f') & 15) | 224));
                byteBuffer.put(i + 1, (byte) (((c >> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                byteBuffer.put(i + 2, (byte) ((c & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                i2 = 3;
            } else {
                if (0 > c || c >= 0) {
                    ED.l(c);
                    throw null;
                }
                byteBuffer.put(i, (byte) (((c >> 18) & 7) | 240));
                byteBuffer.put(i + 1, (byte) (((c >> '\f') & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                byteBuffer.put(i + 2, (byte) (((c >> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                byteBuffer.put(i + 3, (byte) ((c & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
            }
            this.i = i + i2;
            return this;
        }
        C2895bC c2895bCU = u(3);
        try {
            ByteBuffer byteBuffer2 = c2895bCU.a;
            int i3 = c2895bCU.c;
            if (c >= 0 && c < 128) {
                byteBuffer2.put(i3, (byte) c);
                i2 = 1;
            } else if (128 <= c && c < 2048) {
                byteBuffer2.put(i3, (byte) (((c >> 6) & 31) | 192));
                byteBuffer2.put(i3 + 1, (byte) ((c & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                i2 = 2;
            } else if (2048 <= c && c < 0) {
                byteBuffer2.put(i3, (byte) (((c >> '\f') & 15) | 224));
                byteBuffer2.put(i3 + 1, (byte) (((c >> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                byteBuffer2.put(i3 + 2, (byte) ((c & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                i2 = 3;
            } else {
                if (0 > c || c >= 0) {
                    ED.l(c);
                    throw null;
                }
                byteBuffer2.put(i3, (byte) (((c >> 18) & 7) | 240));
                byteBuffer2.put(i3 + 1, (byte) (((c >> '\f') & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                byteBuffer2.put(i3 + 2, (byte) (((c >> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                byteBuffer2.put(i3 + 3, (byte) ((c & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
            }
            c2895bCU.a(i2);
            if (i2 < 0) {
                throw new IllegalStateException("The returned value shouldn't be negative");
            }
            c();
            return this;
        } catch (Throwable th) {
            c();
            throw th;
        }
    }

    @NotNull
    public final C0864Dw p(@Nullable CharSequence charSequence) {
        if (charSequence == null) {
            k("null", 0, 4);
            return this;
        }
        k(charSequence, 0, charSequence.length());
        return this;
    }

    @NotNull
    public final C0864Dw q(@Nullable CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            return k("null", i, i2);
        }
        C6621sj.t(this, charSequence, i, i2, Charsets.UTF_8);
        return this;
    }

    @NotNull
    public final C1098Gw t() throws EOFException {
        int i = (this.i - this.k) + this.l;
        C2895bC c2895bCV = v();
        return c2895bCV == null ? C1098Gw.l : new C1098Gw(c2895bCV, i, this.d);
    }

    @NotNull
    public final String toString() {
        return "BytePacketBuilder[0x" + hashCode() + ']';
    }

    @NotNull
    public final C2895bC u(int i) throws EOFException {
        C2895bC c2895bC;
        int i2 = this.j;
        int i3 = this.i;
        if (i2 - i3 >= i && (c2895bC = this.g) != null) {
            c2895bC.b(i3);
            return c2895bC;
        }
        C2895bC buffer = this.d.S();
        buffer.e();
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (buffer.g() != null) {
            throw new IllegalStateException("It should be a single buffer chunk.");
        }
        C2895bC c2895bC2 = this.g;
        if (c2895bC2 == null) {
            this.e = buffer;
            this.l = 0;
        } else {
            c2895bC2.k(buffer);
            int i4 = this.i;
            c2895bC2.b(i4);
            this.l = (i4 - this.k) + this.l;
        }
        this.g = buffer;
        this.l += 0;
        this.h = buffer.a;
        this.i = buffer.c;
        this.k = buffer.b;
        this.j = buffer.e;
        return buffer;
    }

    @Nullable
    public final C2895bC v() throws EOFException {
        C2895bC c2895bC = this.e;
        if (c2895bC == null) {
            return null;
        }
        C2895bC c2895bC2 = this.g;
        if (c2895bC2 != null) {
            c2895bC2.b(this.i);
        }
        this.e = null;
        this.g = null;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.h = WY0.a;
        return c2895bC;
    }

    public C0864Dw(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2895bC.i;
        RU pool = C1718Ou.a;
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(pool, "pool");
        this.d = pool;
        this.h = WY0.a;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        p(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        C0864Dw c0864DwQ = q(charSequence, i, i2);
        Intrinsics.c(c0864DwQ, "null cannot be cast to non-null type io.ktor.utils.io.core.BytePacketBuilder");
        return c0864DwQ;
    }
}
