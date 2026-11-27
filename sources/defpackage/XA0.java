package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class XA0 extends InputStream {
    public final InputStream d;
    public final W31 e;
    public final QZ1 g;
    public long i;
    public long h = -1;
    public long j = -1;

    public XA0(InputStream inputStream, W31 w31, QZ1 qz1) {
        this.g = qz1;
        this.d = inputStream;
        this.e = w31;
        this.i = ((V31) w31.h.e).S();
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        try {
            return this.d.available();
        } catch (IOException e) {
            long jA = this.g.a();
            W31 w31 = this.e;
            w31.i(jA);
            X31.c(w31);
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        W31 w31 = this.e;
        QZ1 qz1 = this.g;
        long jA = qz1.a();
        if (this.j == -1) {
            this.j = jA;
        }
        try {
            this.d.close();
            long j = this.h;
            if (j != -1) {
                w31.h(j);
            }
            long j2 = this.i;
            if (j2 != -1) {
                V31.a aVar = w31.h;
                aVar.p();
                V31.D((V31) aVar.e, j2);
            }
            w31.i(this.j);
            w31.b();
        } catch (IOException e) {
            C1742Pc.e(qz1, w31, w31);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.d.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.d.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        QZ1 qz1 = this.g;
        W31 w31 = this.e;
        try {
            int i = this.d.read();
            long jA = qz1.a();
            if (this.i == -1) {
                this.i = jA;
            }
            if (i == -1 && this.j == -1) {
                this.j = jA;
                w31.i(jA);
                w31.b();
                return i;
            }
            long j = this.h + 1;
            this.h = j;
            w31.h(j);
            return i;
        } catch (IOException e) {
            C1742Pc.e(qz1, w31, w31);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        try {
            this.d.reset();
        } catch (IOException e) {
            long jA = this.g.a();
            W31 w31 = this.e;
            w31.i(jA);
            X31.c(w31);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        QZ1 qz1 = this.g;
        W31 w31 = this.e;
        try {
            long jSkip = this.d.skip(j);
            long jA = qz1.a();
            if (this.i == -1) {
                this.i = jA;
            }
            if (jSkip == -1 && this.j == -1) {
                this.j = jA;
                w31.i(jA);
                return jSkip;
            }
            long j2 = this.h + jSkip;
            this.h = j2;
            w31.h(j2);
            return jSkip;
        } catch (IOException e) {
            C1742Pc.e(qz1, w31, w31);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        QZ1 qz1 = this.g;
        W31 w31 = this.e;
        try {
            int i3 = this.d.read(bArr, i, i2);
            long jA = qz1.a();
            if (this.i == -1) {
                this.i = jA;
            }
            if (i3 == -1 && this.j == -1) {
                this.j = jA;
                w31.i(jA);
                w31.b();
                return i3;
            }
            long j = this.h + ((long) i3);
            this.h = j;
            w31.h(j);
            return i3;
        } catch (IOException e) {
            C1742Pc.e(qz1, w31, w31);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        QZ1 qz1 = this.g;
        W31 w31 = this.e;
        try {
            int i = this.d.read(bArr);
            long jA = qz1.a();
            if (this.i == -1) {
                this.i = jA;
            }
            if (i == -1 && this.j == -1) {
                this.j = jA;
                w31.i(jA);
                w31.b();
                return i;
            }
            long j = this.h + ((long) i);
            this.h = j;
            w31.h(j);
            return i;
        } catch (IOException e) {
            C1742Pc.e(qz1, w31, w31);
            throw e;
        }
    }
}
