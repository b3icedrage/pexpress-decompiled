package io.sentry.cache.tape;

import defpackage.C0681Bn;
import defpackage.C1332Jw;
import defpackage.SK;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Closeable, Iterable<byte[]> {
    public static final byte[] o = new byte[4096];
    public RandomAccessFile d;
    public final File e;
    public long g;
    public int h;
    public a i;
    public a j;
    public final byte[] k = new byte[32];
    public int l = 0;
    public final int m;
    public boolean n;

    public static final class a {
        public static final a c = new a(0, 0);
        public final long a;
        public final int b;

        public a(int i, long j) {
            this.a = j;
            this.b = i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(a.class.getSimpleName());
            sb.append("[position=");
            sb.append(this.a);
            sb.append(", length=");
            return SK.b(sb, this.b, "]");
        }
    }

    public final class b implements Iterator<byte[]> {
        public int d = 0;
        public long e;
        public int g;

        public b() {
            this.e = d.this.i.a;
            this.g = d.this.l;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            d dVar = d.this;
            if (dVar.n) {
                throw new IllegalStateException("closed");
            }
            if (dVar.l == this.g) {
                return this.d != dVar.h;
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.Iterator
        public final byte[] next() throws IOException {
            byte[] bArr = d.o;
            d dVar = d.this;
            if (dVar.n) {
                throw new IllegalStateException("closed");
            }
            if (dVar.l != this.g) {
                throw new ConcurrentModificationException();
            }
            int i = dVar.h;
            if (i == 0) {
                throw new NoSuchElementException();
            }
            if (this.d >= i) {
                throw new NoSuchElementException();
            }
            try {
                a aVarF = dVar.f(this.e);
                int i2 = aVarF.b;
                long j = aVarF.a;
                byte[] bArr2 = new byte[i2];
                long j2 = j + 4;
                long jK0 = dVar.K0(j2);
                this.e = jK0;
                if (!dVar.L(i2, jK0, bArr2)) {
                    this.d = dVar.h;
                    return bArr;
                }
                this.e = dVar.K0(j2 + ((long) i2));
                this.d++;
                return bArr2;
            } catch (IOException e) {
                throw e;
            } catch (OutOfMemoryError unused) {
                dVar.G();
                this.d = dVar.h;
                return bArr;
            }
        }

        @Override // java.util.Iterator
        public final void remove() throws IOException {
            d dVar = d.this;
            if (dVar.l != this.g) {
                throw new ConcurrentModificationException();
            }
            if (dVar.h == 0) {
                throw new NoSuchElementException();
            }
            if (this.d != 1) {
                throw new UnsupportedOperationException("Removal is only permitted from the head.");
            }
            dVar.D(1);
            this.g = dVar.l;
            this.d--;
        }
    }

    public d(File file, RandomAccessFile randomAccessFile, int i) throws IOException {
        this.e = file;
        this.d = randomAccessFile;
        this.m = i;
        q();
    }

    public static long A(int i, byte[] bArr) {
        return ((((long) bArr[i]) & 255) << 56) + ((((long) bArr[i + 1]) & 255) << 48) + ((((long) bArr[i + 2]) & 255) << 40) + ((((long) bArr[i + 3]) & 255) << 32) + ((((long) bArr[i + 4]) & 255) << 24) + ((((long) bArr[i + 5]) & 255) << 16) + ((((long) bArr[i + 6]) & 255) << 8) + (((long) bArr[i + 7]) & 255);
    }

    public static void Q0(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    public static void R0(int i, long j, byte[] bArr) {
        bArr[i] = (byte) (j >> 56);
        bArr[i + 1] = (byte) (j >> 48);
        bArr[i + 2] = (byte) (j >> 40);
        bArr[i + 3] = (byte) (j >> 32);
        bArr[i + 4] = (byte) (j >> 24);
        bArr[i + 5] = (byte) (j >> 16);
        bArr[i + 6] = (byte) (j >> 8);
        bArr[i + 7] = (byte) j;
    }

    public static RandomAccessFile c(File file) throws IOException {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                randomAccessFile.writeInt(-2147483647);
                randomAccessFile.writeLong(4096L);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        return new RandomAccessFile(file, "rwd");
    }

    public static int u(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    public final void D(int i) throws IOException {
        if (i < 0) {
            throw new IllegalArgumentException(C1332Jw.a(i, "Cannot remove negative (", ") number of elements."));
        }
        if (i == 0) {
            return;
        }
        int i2 = this.h;
        if (i == i2) {
            clear();
            return;
        }
        if (i2 == 0) {
            throw new NoSuchElementException();
        }
        if (i > i2) {
            throw new IllegalArgumentException(SK.b(C1332Jw.c(i, "Cannot remove more elements (", ") than present in queue ("), this.h, ")."));
        }
        a aVar = this.i;
        long j = aVar.a;
        int iU = aVar.b;
        long jK0 = j;
        long j2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            j2 += (long) (iU + 4);
            jK0 = K0(jK0 + 4 + ((long) iU));
            byte[] bArr = this.k;
            if (!L(4, jK0, bArr)) {
                return;
            }
            iU = u(0, bArr);
        }
        M0(this.g, this.h - i, jK0, this.j.a);
        this.h -= i;
        this.l++;
        this.i = new a(iU, jK0);
        while (j2 > 0) {
            int iMin = (int) Math.min(j2, 4096);
            Z(iMin, j, o);
            long j3 = iMin;
            j2 -= j3;
            j += j3;
        }
    }

    public final void G() throws IOException {
        this.d.close();
        File file = this.e;
        file.delete();
        this.d = c(file);
        q();
    }

    public final long K0(long j) {
        long j2 = this.g;
        return j < j2 ? j : (j + 32) - j2;
    }

    public final boolean L(int i, long j, byte[] bArr) throws IOException {
        try {
            long jK0 = K0(j);
            long j2 = ((long) i) + jK0;
            long j3 = this.g;
            if (j2 <= j3) {
                this.d.seek(jK0);
                this.d.readFully(bArr, 0, i);
                return true;
            }
            int i2 = (int) (j3 - jK0);
            this.d.seek(jK0);
            this.d.readFully(bArr, 0, i2);
            this.d.seek(32L);
            this.d.readFully(bArr, i2, i - i2);
            return true;
        } catch (EOFException unused) {
            G();
            return false;
        } catch (IOException e) {
            throw e;
        } catch (Throwable unused2) {
            G();
            return false;
        }
    }

    public final void M0(long j, int i, long j2, long j3) throws IOException {
        this.d.seek(0L);
        byte[] bArr = this.k;
        Q0(bArr, 0, -2147483647);
        R0(4, j, bArr);
        Q0(bArr, 12, i);
        R0(16, j2, bArr);
        R0(24, j3, bArr);
        this.d.write(bArr, 0, 32);
    }

    public final void Z(int i, long j, byte[] bArr) throws IOException {
        long jK0 = K0(j);
        long j2 = ((long) i) + jK0;
        long j3 = this.g;
        if (j2 <= j3) {
            this.d.seek(jK0);
            this.d.write(bArr, 0, i);
            return;
        }
        int i2 = (int) (j3 - jK0);
        this.d.seek(jK0);
        this.d.write(bArr, 0, i2);
        this.d.seek(32L);
        this.d.write(bArr, i2, i - i2);
    }

    public final void clear() throws IOException {
        if (this.n) {
            throw new IllegalStateException("closed");
        }
        M0(4096L, 0, 0L, 0L);
        this.d.seek(32L);
        this.d.write(o, 0, 4064);
        this.h = 0;
        a aVar = a.c;
        this.i = aVar;
        this.j = aVar;
        if (this.g > 4096) {
            this.d.setLength(4096L);
            this.d.getChannel().force(true);
        }
        this.g = 4096L;
        this.l++;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.n = true;
        this.d.close();
    }

    public final a f(long j) {
        a aVar = a.c;
        if (j != 0) {
            byte[] bArr = this.k;
            if (L(4, j, bArr)) {
                return new a(u(0, bArr), j);
            }
        }
        return aVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<byte[]> iterator() {
        return new b();
    }

    public final void q() throws IOException {
        this.d.seek(0L);
        RandomAccessFile randomAccessFile = this.d;
        byte[] bArr = this.k;
        randomAccessFile.readFully(bArr);
        this.g = A(4, bArr);
        this.h = u(12, bArr);
        long jA = A(16, bArr);
        long jA2 = A(24, bArr);
        if (this.g <= this.d.length()) {
            if (this.g <= 32) {
                throw new IOException(C0681Bn.c(new StringBuilder("File is corrupt; length stored in header ("), this.g, ") is invalid."));
            }
            this.i = f(jA);
            this.j = f(jA2);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.g + ", Actual length: " + this.d.length());
    }

    public final String toString() {
        return "QueueFile{file=" + this.e + ", zero=true, length=" + this.g + ", size=" + this.h + ", first=" + this.i + ", last=" + this.j + '}';
    }
}
