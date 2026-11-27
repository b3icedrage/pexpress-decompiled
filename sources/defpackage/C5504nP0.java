package defpackage;

import androidx.annotation.NonNull;
import java.io.OutputStream;

/* JADX INFO: renamed from: nP0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5504nP0 extends OutputStream {
    public long d;

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.d++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.d += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(@NonNull byte[] bArr, int i, int i2) {
        int i3;
        if (i >= 0 && i <= bArr.length && i2 >= 0 && (i3 = i + i2) <= bArr.length && i3 >= 0) {
            this.d += (long) i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
