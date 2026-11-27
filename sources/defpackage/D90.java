package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class D90 extends InputStream {
    public static final ArrayDeque g;
    public C2092To1 d;
    public IOException e;

    static {
        char[] cArr = C6177qc2.a;
        g = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.d.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.d.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.d.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        this.d.getClass();
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.d.read();
        } catch (IOException e) {
            this.e = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.d.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        try {
            return this.d.skip(j);
        } catch (IOException e) {
            this.e = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.d.read(bArr);
        } catch (IOException e) {
            this.e = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.d.read(bArr, i, i2);
        } catch (IOException e) {
            this.e = e;
            throw e;
        }
    }
}
