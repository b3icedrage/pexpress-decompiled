package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class BE1 extends C1802Pw {

    @NotNull
    public final transient byte[][] i;

    @NotNull
    public final transient int[] j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BE1(@NotNull byte[][] segments, @NotNull int[] directory) {
        super(C1802Pw.h.d);
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(directory, "directory");
        this.i = segments;
        this.j = directory;
    }

    @Override // defpackage.C1802Pw
    @NotNull
    public final String b() {
        throw null;
    }

    @Override // defpackage.C1802Pw
    @NotNull
    public final C1802Pw e(@NotNull String algorithm) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        byte[][] bArr = this.i;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.j;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.checkNotNull(bArrDigest);
        return new C1802Pw(bArrDigest);
    }

    @Override // defpackage.C1802Pw
    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1802Pw)) {
            return false;
        }
        C1802Pw c1802Pw = (C1802Pw) obj;
        return c1802Pw.f() == f() && m(f(), c1802Pw);
    }

    @Override // defpackage.C1802Pw
    public final int f() {
        return this.j[this.i.length - 1];
    }

    @Override // defpackage.C1802Pw
    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.i;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.j;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.e = i3;
        return i3;
    }

    @Override // defpackage.C1802Pw
    @NotNull
    public final String i() {
        return new C1802Pw(p()).i();
    }

    @Override // defpackage.C1802Pw
    @NotNull
    public final byte[] k() {
        return p();
    }

    @Override // defpackage.C1802Pw
    public final byte l(int i) {
        byte[][] bArr = this.i;
        int length = bArr.length - 1;
        int[] iArr = this.j;
        C5417n.b(iArr[length], i, 1L);
        int iP = C6561sS.p(this, i);
        return bArr[iP][(i - (iP == 0 ? 0 : iArr[iP - 1])) + iArr[bArr.length + iP]];
    }

    @Override // defpackage.C1802Pw
    public final boolean m(int i, @NotNull C1802Pw other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (f() - i >= 0) {
            int iP = C6561sS.p(this, 0);
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int[] iArr = this.j;
                int i4 = iP == 0 ? 0 : iArr[iP - 1];
                int i5 = iArr[iP] - i4;
                byte[][] bArr = this.i;
                int i6 = iArr[bArr.length + iP];
                int iMin = Math.min(i, i5 + i4) - i2;
                if (other.n(i3, bArr[iP], (i2 - i4) + i6, iMin)) {
                    i3 += iMin;
                    i2 += iMin;
                    iP++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.C1802Pw
    public final boolean n(int i, @NotNull byte[] other, int i2, int i3) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i < 0 || i > f() - i3 || i2 < 0 || i2 > other.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iP = C6561sS.p(this, i);
        while (i < i4) {
            int[] iArr = this.j;
            int i5 = iP == 0 ? 0 : iArr[iP - 1];
            int i6 = iArr[iP] - i5;
            byte[][] bArr = this.i;
            int i7 = iArr[bArr.length + iP];
            int iMin = Math.min(i4, i6 + i5) - i;
            if (!C5417n.a((i - i5) + i7, i2, iMin, bArr[iP], other)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iP++;
        }
        return true;
    }

    @Override // defpackage.C1802Pw
    @NotNull
    public final C1802Pw o() {
        return new C1802Pw(p()).o();
    }

    @Override // defpackage.C1802Pw
    @NotNull
    public final byte[] p() {
        byte[] bArr = new byte[f()];
        byte[][] bArr2 = this.i;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.j;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            C1371Kj.c(i3, i4, i4 + i6, bArr2[i], bArr);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // defpackage.C1802Pw
    public final void r(@NotNull C1481Lu buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int iP = C6561sS.p(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.j;
            int i3 = iP == 0 ? 0 : iArr[iP - 1];
            int i4 = iArr[iP] - i3;
            byte[][] bArr = this.i;
            int i5 = iArr[bArr.length + iP];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            C7782yE1 c7782yE1 = new C7782yE1(bArr[iP], i6, i6 + iMin, true, false);
            C7782yE1 c7782yE2 = buffer.d;
            if (c7782yE2 == null) {
                c7782yE1.g = c7782yE1;
                c7782yE1.f = c7782yE1;
                buffer.d = c7782yE1;
            } else {
                Intrinsics.checkNotNull(c7782yE2);
                C7782yE1 c7782yE3 = c7782yE2.g;
                Intrinsics.checkNotNull(c7782yE3);
                c7782yE3.b(c7782yE1);
            }
            i2 += iMin;
            iP++;
        }
        buffer.e += (long) i;
    }

    @Override // defpackage.C1802Pw
    @NotNull
    public final String toString() {
        return new C1802Pw(p()).toString();
    }
}
