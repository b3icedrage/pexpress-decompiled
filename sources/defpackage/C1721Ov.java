package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: Ov, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1721Ov {
    public ByteBuffer a;
    public int b = 0;

    public C1721Ov(int i) {
        this.a = ByteBuffer.allocate(i);
    }

    public final void a(int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        int iPosition = this.a.position();
        this.a.position(0);
        byteBufferAllocate.put(this.a);
        byteBufferAllocate.position(iPosition);
        this.a = byteBufferAllocate;
    }

    public final byte b(int i) {
        if (i < 0 || this.b <= i) {
            throw new IndexOutOfBoundsException(String.format("Bad index: index=%d, length=%d", Integer.valueOf(i), Integer.valueOf(this.b)));
        }
        return this.a.get(i);
    }

    public final boolean c(int i) {
        return ((1 << (i % 8)) & b(i / 8)) != 0;
    }

    public final void d(int i) {
        int iCapacity = this.a.capacity();
        int i2 = this.b;
        if (iCapacity < i2 + 1) {
            a(i2 + UserVerificationMethods.USER_VERIFY_ALL);
        }
        this.a.put((byte) i);
        this.b++;
    }

    public final void e(byte[] bArr) {
        int iCapacity = this.a.capacity();
        int i = this.b;
        if (iCapacity < bArr.length + i) {
            a(i + bArr.length + UserVerificationMethods.USER_VERIFY_ALL);
        }
        this.a.put(bArr);
        this.b += bArr.length;
    }

    public final int f(int[] iArr, int i) {
        int i2 = iArr[0];
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i) {
            if (c(i2 + i4)) {
                i5 += i3;
            }
            i4++;
            i3 *= 2;
        }
        iArr[0] = iArr[0] + i;
        return i5;
    }

    public final byte[] g(int i, int i2) {
        int i3 = i2 - i;
        if (i3 < 0 || i < 0 || this.b < i2) {
            throw new IllegalArgumentException(String.format("Bad range: beginIndex=%d, endIndex=%d, length=%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.b)));
        }
        byte[] bArr = new byte[i3];
        if (i3 != 0) {
            System.arraycopy(this.a.array(), i, bArr, 0, i3);
        }
        return bArr;
    }
}
