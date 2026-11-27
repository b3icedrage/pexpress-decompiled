package defpackage;

import androidx.annotation.NonNull;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: Yu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2528Yu extends OutputStream {

    @NonNull
    public final FileOutputStream d;
    public byte[] e;
    public final OU0 g;
    public int h;

    public C2528Yu(@NonNull FileOutputStream fileOutputStream, @NonNull OU0 ou0) {
        this.d = fileOutputStream;
        this.g = ou0;
        this.e = (byte[]) ou0.d(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.d;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.e;
            if (bArr != null) {
                this.g.h(bArr);
                this.e = null;
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.h;
        FileOutputStream fileOutputStream = this.d;
        if (i > 0) {
            fileOutputStream.write(this.e, 0, i);
            this.h = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.e;
        int i2 = this.h;
        int i3 = i2 + 1;
        this.h = i3;
        bArr[i2] = (byte) i;
        if (i3 != bArr.length || i3 <= 0) {
            return;
        }
        this.d.write(bArr, 0, i3);
        this.h = 0;
    }

    @Override // java.io.OutputStream
    public final void write(@NonNull byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(@NonNull byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.h;
            FileOutputStream fileOutputStream = this.d;
            if (i6 == 0 && i4 >= this.e.length) {
                fileOutputStream.write(bArr, i5, i4);
                return;
            }
            int iMin = Math.min(i4, this.e.length - i6);
            System.arraycopy(bArr, i5, this.e, this.h, iMin);
            int i7 = this.h + iMin;
            this.h = i7;
            i3 += iMin;
            byte[] bArr2 = this.e;
            if (i7 == bArr2.length && i7 > 0) {
                fileOutputStream.write(bArr2, 0, i7);
                this.h = 0;
            }
        } while (i3 < i2);
    }
}
