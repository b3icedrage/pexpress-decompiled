package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: hS1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4203hS1 implements Closeable {
    public final FileInputStream d;
    public final Charset e;
    public byte[] g;
    public int h;
    public int i;

    /* JADX INFO: renamed from: hS1$a */
    public class a extends ByteArrayOutputStream {
        public a(int i) {
            super(i);
        }

        @Override // java.io.ByteArrayOutputStream
        public final String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            if (i > 0 && ((ByteArrayOutputStream) this).buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i, C4203hS1.this.e.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public C4203hS1(FileInputStream fileInputStream, Charset charset) {
        if (fileInputStream == null || charset == null) {
            throw null;
        }
        if (!charset.equals(C7226vc2.a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.d = fileInputStream;
        this.e = charset;
        this.g = new byte[8192];
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0040  */
    public final String c() {
        int i;
        synchronized (this.d) {
            try {
                byte[] bArr = this.g;
                if (bArr == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.h >= this.i) {
                    int i2 = this.d.read(bArr, 0, bArr.length);
                    if (i2 == -1) {
                        throw new EOFException();
                    }
                    this.h = 0;
                    this.i = i2;
                }
                for (int i3 = this.h; i3 != this.i; i3++) {
                    byte[] bArr2 = this.g;
                    if (bArr2[i3] == 10) {
                        int i4 = this.h;
                        if (i3 != i4) {
                            i = i3 - 1;
                            if (bArr2[i] != 13) {
                                i = i3;
                            }
                        } else {
                            i = i3;
                        }
                        String str = new String(bArr2, i4, i - i4, this.e.name());
                        this.h = i3 + 1;
                        return str;
                    }
                }
                a aVar = new a((this.i - this.h) + 80);
                while (true) {
                    byte[] bArr3 = this.g;
                    int i5 = this.h;
                    aVar.write(bArr3, i5, this.i - i5);
                    this.i = -1;
                    byte[] bArr4 = this.g;
                    int i6 = this.d.read(bArr4, 0, bArr4.length);
                    if (i6 == -1) {
                        throw new EOFException();
                    }
                    this.h = 0;
                    this.i = i6;
                    for (int i7 = 0; i7 != this.i; i7++) {
                        byte[] bArr5 = this.g;
                        if (bArr5[i7] == 10) {
                            int i8 = this.h;
                            if (i7 != i8) {
                                aVar.write(bArr5, i8, i7 - i8);
                            }
                            this.h = i7 + 1;
                            return aVar.toString();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.d) {
            try {
                if (this.g != null) {
                    this.g = null;
                    this.d.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
