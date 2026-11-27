package defpackage;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class SW0 extends FilterInputStream {
    public int d;

    public SW0(@NonNull D90 d90) {
        super(d90);
        this.d = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i = this.d;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    public final long c(long j) {
        int i = this.d;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : i;
    }

    public final void f(long j) {
        int i = this.d;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.d = (int) (((long) i) - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        super.mark(i);
        this.d = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (c(1L) == -1) {
            return -1;
        }
        int i = super.read();
        f(1L);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.d = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jC = c(j);
        if (jC == -1) {
            return 0L;
        }
        long jSkip = super.skip(jC);
        f(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
        int iC = (int) c(i2);
        if (iC == -1) {
            return -1;
        }
        int i3 = super.read(bArr, i, iC);
        f(i3);
        return i3;
    }
}
