package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class YA0 extends OutputStream {
    public final OutputStream d;
    public final QZ1 e;
    public final W31 g;
    public long h = -1;

    public YA0(OutputStream outputStream, W31 w31, QZ1 qz1) {
        this.d = outputStream;
        this.g = w31;
        this.e = qz1;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        long j = this.h;
        W31 w31 = this.g;
        if (j != -1) {
            w31.e(j);
        }
        QZ1 qz1 = this.e;
        long jA = qz1.a();
        V31.a aVar = w31.h;
        aVar.p();
        V31.C((V31) aVar.e, jA);
        try {
            this.d.close();
        } catch (IOException e) {
            C1742Pc.e(qz1, w31, w31);
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        try {
            this.d.flush();
        } catch (IOException e) {
            long jA = this.e.a();
            W31 w31 = this.g;
            w31.i(jA);
            X31.c(w31);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        W31 w31 = this.g;
        try {
            this.d.write(i);
            long j = this.h + 1;
            this.h = j;
            w31.e(j);
        } catch (IOException e) {
            C1742Pc.e(this.e, w31, w31);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        W31 w31 = this.g;
        try {
            this.d.write(bArr);
            long length = this.h + ((long) bArr.length);
            this.h = length;
            w31.e(length);
        } catch (IOException e) {
            C1742Pc.e(this.e, w31, w31);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        W31 w31 = this.g;
        try {
            this.d.write(bArr, i, i2);
            long j = this.h + ((long) i2);
            this.h = j;
            w31.e(j);
        } catch (IOException e) {
            C1742Pc.e(this.e, w31, w31);
            throw e;
        }
    }
}
