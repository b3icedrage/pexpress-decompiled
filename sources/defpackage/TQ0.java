package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public class TQ0 extends AbstractC1724Ow {
    public final byte[] e;
    public int g = 0;

    public class a implements AbstractC1724Ow.a {
        public int d = 0;
        public final int e;

        public a() {
            this.e = TQ0.this.e.length;
        }

        public final byte a() {
            try {
                byte[] bArr = TQ0.this.e;
                int i = this.d;
                this.d = i + 1;
                return bArr[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d < this.e;
        }

        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(a());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public TQ0(byte[] bArr) {
        this.e = bArr;
    }

    @Override // defpackage.AbstractC1724Ow
    public void d(int i, byte[] bArr, int i2, int i3) {
        System.arraycopy(this.e, i, bArr, i2, i3);
    }

    @Override // defpackage.AbstractC1724Ow
    public final int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1724Ow) || size() != ((AbstractC1724Ow) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof TQ0) {
            return u((TQ0) obj, 0, size());
        }
        if (obj instanceof WA1) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(obj.getClass());
        throw new IllegalArgumentException(C5807oq.b(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
    }

    @Override // defpackage.AbstractC1724Ow
    public final boolean f() {
        return true;
    }

    @Override // defpackage.AbstractC1724Ow
    public final boolean h() {
        byte[] bArr = this.e;
        return C5207m.k(bArr, 0, bArr.length) == 0;
    }

    public final int hashCode() {
        int iM = this.g;
        if (iM == 0) {
            int size = size();
            iM = m(size, 0, size);
            if (iM == 0) {
                iM = 1;
            }
            this.g = iM;
        }
        return iM;
    }

    @Override // defpackage.AbstractC1724Ow
    /* JADX INFO: renamed from: i */
    public AbstractC1724Ow.a iterator() {
        return new a();
    }

    @Override // defpackage.AbstractC1724Ow, java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new a();
    }

    @Override // defpackage.AbstractC1724Ow
    public final int m(int i, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + this.e[i4];
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r0[r9] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
    
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        if (r0[r9] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0092, code lost:
    
        if (r0[r8] > (-65)) goto L59;
     */
    @Override // defpackage.AbstractC1724Ow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int n(int r8, int r9, int r10) {
        /*
            r7 = this;
            int r10 = r10 + r9
            byte[] r0 = r7.e
            if (r8 == 0) goto L95
            if (r9 < r10) goto L8
            return r8
        L8:
            byte r1 = (byte) r8
            r2 = -1
            r3 = -65
            r4 = -32
            if (r1 >= r4) goto L1f
            r8 = -62
            if (r1 < r8) goto L94
            int r8 = r9 + 1
            r9 = r0[r9]
            if (r9 <= r3) goto L1c
            goto L94
        L1c:
            r9 = r8
            goto L95
        L1f:
            r5 = -16
            if (r1 >= r5) goto L4c
            int r8 = r8 >> 8
            int r8 = ~r8
            byte r8 = (byte) r8
            if (r8 != 0) goto L37
            int r8 = r9 + 1
            r9 = r0[r9]
            if (r8 < r10) goto L34
            int r8 = defpackage.C5207m.h(r1, r9)
            return r8
        L34:
            r6 = r9
            r9 = r8
            r8 = r6
        L37:
            if (r8 > r3) goto L94
            r5 = -96
            if (r1 != r4) goto L3f
            if (r8 < r5) goto L94
        L3f:
            r4 = -19
            if (r1 != r4) goto L45
            if (r8 >= r5) goto L94
        L45:
            int r8 = r9 + 1
            r9 = r0[r9]
            if (r9 <= r3) goto L1c
            goto L94
        L4c:
            int r4 = r8 >> 8
            int r4 = ~r4
            byte r4 = (byte) r4
            if (r4 != 0) goto L5f
            int r8 = r9 + 1
            r4 = r0[r9]
            if (r8 < r10) goto L5d
            int r8 = defpackage.C5207m.h(r1, r4)
            return r8
        L5d:
            r9 = 0
            goto L65
        L5f:
            int r8 = r8 >> 16
            byte r8 = (byte) r8
            r6 = r9
            r9 = r8
            r8 = r6
        L65:
            if (r9 != 0) goto L81
            int r9 = r8 + 1
            r8 = r0[r8]
            if (r9 < r10) goto L7e
            r9 = -12
            if (r1 > r9) goto L7d
            if (r4 > r3) goto L7d
            if (r8 <= r3) goto L76
            goto L7d
        L76:
            int r9 = r4 << 8
            r9 = r9 ^ r1
            int r8 = r8 << 16
            r8 = r8 ^ r9
            return r8
        L7d:
            return r2
        L7e:
            r6 = r9
            r9 = r8
            r8 = r6
        L81:
            if (r4 > r3) goto L94
            int r1 = r1 << 28
            int r4 = r4 + 112
            int r4 = r4 + r1
            int r1 = r4 >> 30
            if (r1 != 0) goto L94
            if (r9 > r3) goto L94
            int r9 = r8 + 1
            r8 = r0[r8]
            if (r8 <= r3) goto L95
        L94:
            return r2
        L95:
            int r8 = defpackage.C5207m.k(r0, r9, r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.TQ0.n(int, int, int):int");
    }

    @Override // defpackage.AbstractC1724Ow
    public final int o() {
        return this.g;
    }

    @Override // defpackage.AbstractC1724Ow
    public final String q() {
        byte[] bArr = this.e;
        return new String(bArr, 0, bArr.length, "UTF-8");
    }

    @Override // defpackage.AbstractC1724Ow
    public final void s(OutputStream outputStream, int i, int i2) throws IOException {
        outputStream.write(this.e, i, i2);
    }

    @Override // defpackage.AbstractC1724Ow
    public int size() {
        return this.e.length;
    }

    public final boolean u(TQ0 tq0, int i, int i2) {
        byte[] bArr = tq0.e;
        int length = bArr.length;
        byte[] bArr2 = this.e;
        if (i2 > length) {
            int length2 = bArr2.length;
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        }
        int i3 = i + i2;
        int length3 = bArr.length;
        byte[] bArr3 = tq0.e;
        if (i3 <= length3) {
            int i4 = 0;
            while (i4 < i2) {
                if (bArr2[i4] != bArr3[i]) {
                    return false;
                }
                i4++;
                i++;
            }
            return true;
        }
        int length4 = bArr3.length;
        StringBuilder sb2 = new StringBuilder(59);
        sb2.append("Ran off end of other: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        sb2.append(", ");
        sb2.append(length4);
        throw new IllegalArgumentException(sb2.toString());
    }
}
