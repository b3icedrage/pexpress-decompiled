package defpackage;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: vd2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7230vd2 extends MediaDataSource {
    public final /* synthetic */ ByteBuffer d;

    public C7230vd2(ByteBuffer byteBuffer) {
        this.d = byteBuffer;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.d.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        ByteBuffer byteBuffer = this.d;
        if (j >= byteBuffer.limit()) {
            return -1;
        }
        byteBuffer.position((int) j);
        int iMin = Math.min(i2, byteBuffer.remaining());
        byteBuffer.get(bArr, i, iMin);
        return iMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
