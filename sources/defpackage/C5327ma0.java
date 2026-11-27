package defpackage;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ma0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5327ma0 implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public final ImageHeaderParser.ImageType a(@NonNull ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int b(@NonNull ByteBuffer byteBuffer, @NonNull OU0 ou0) {
        AtomicReference<byte[]> atomicReference = C6035pw.a;
        return d(new C6035pw.a(byteBuffer), ou0);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public final ImageHeaderParser.ImageType c(@NonNull InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int d(@NonNull InputStream inputStream, @NonNull OU0 ou0) {
        int iC = new C5114la0(inputStream).c();
        if (iC == 0) {
            return -1;
        }
        return iC;
    }
}
