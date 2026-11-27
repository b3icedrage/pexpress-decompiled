package defpackage;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: To1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2092To1 extends FilterInputStream {
    public volatile byte[] d;
    public int e;
    public int g;
    public int h;
    public int i;
    public final OU0 j;

    /* JADX INFO: renamed from: To1$a */
    public static class a extends IOException {
    }

    public C2092To1(@NonNull InputStream inputStream, @NonNull OU0 ou0) {
        super(inputStream);
        this.h = -1;
        this.j = ou0;
        this.d = (byte[]) ou0.d(65536, byte[].class);
    }

    public static void f() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.d == null || inputStream == null) {
            f();
            throw null;
        }
        return (this.e - this.i) + inputStream.available();
    }

    public final int c(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.h;
        if (i != -1) {
            int i2 = this.i - i;
            int i3 = this.g;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.e == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.j.d(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.d = bArr2;
                    this.j.h(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.i - this.h;
                this.i = i4;
                this.h = 0;
                this.e = 0;
                int i5 = inputStream.read(bArr, i4, bArr.length - i4);
                int i6 = this.i;
                if (i5 > 0) {
                    i6 += i5;
                }
                this.e = i6;
                return i5;
            }
        }
        int i7 = inputStream.read(bArr);
        if (i7 > 0) {
            this.h = -1;
            this.i = 0;
            this.e = i7;
        }
        return i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.d != null) {
            this.j.h(this.d);
            this.d = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.g = Math.max(this.g, i);
        this.h = this.i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.d;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            f();
            throw null;
        }
        if (this.i >= this.e && c(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.d && (bArr = this.d) == null) {
            f();
            throw null;
        }
        int i = this.e;
        int i2 = this.i;
        if (i - i2 <= 0) {
            return -1;
        }
        this.i = i2 + 1;
        return bArr[i2] & 255;
    }

    public final synchronized void release() {
        if (this.d != null) {
            this.j.h(this.d);
            this.d = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.d == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.h;
        if (-1 == i) {
            throw new a("Mark has been invalidated, pos: " + this.i + " markLimit: " + this.g);
        }
        this.i = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.d;
        if (bArr == null) {
            f();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            f();
            throw null;
        }
        int i = this.e;
        int i2 = this.i;
        if (i - i2 >= j) {
            this.i = (int) (((long) i2) + j);
            return j;
        }
        long j2 = ((long) i) - ((long) i2);
        this.i = i;
        if (this.h == -1 || j > this.g) {
            long jSkip = inputStream.skip(j - j2);
            if (jSkip > 0) {
                this.h = -1;
            }
            return j2 + jSkip;
        }
        if (c(inputStream, bArr) == -1) {
            return j2;
        }
        int i3 = this.e;
        int i4 = this.i;
        if (i3 - i4 >= j - j2) {
            this.i = (int) ((((long) i4) + j) - j2);
            return j;
        }
        long j3 = (j2 + ((long) i3)) - ((long) i4);
        this.i = i3;
        return j3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(@NonNull byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr2 = this.d;
        if (bArr2 == null) {
            f();
            throw null;
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i5 = this.i;
            int i6 = this.e;
            if (i5 < i6) {
                int i7 = i6 - i5;
                if (i7 >= i2) {
                    i7 = i2;
                }
                System.arraycopy(bArr2, i5, bArr, i, i7);
                this.i += i7;
                if (i7 == i2 || inputStream.available() == 0) {
                    return i7;
                }
                i += i7;
                i3 = i2 - i7;
            } else {
                i3 = i2;
            }
            while (true) {
                if (this.h == -1 && i3 >= bArr2.length) {
                    i4 = inputStream.read(bArr, i, i3);
                    if (i4 == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                } else {
                    if (c(inputStream, bArr2) == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                    if (bArr2 != this.d && (bArr2 = this.d) == null) {
                        f();
                        throw null;
                    }
                    int i8 = this.e;
                    int i9 = this.i;
                    i4 = i8 - i9;
                    if (i4 >= i3) {
                        i4 = i3;
                    }
                    System.arraycopy(bArr2, i9, bArr, i, i4);
                    this.i += i4;
                }
                i3 -= i4;
                if (i3 == 0) {
                    return i2;
                }
                if (inputStream.available() == 0) {
                    return i2 - i3;
                }
                i += i4;
            }
        } else {
            f();
            throw null;
        }
    }
}
