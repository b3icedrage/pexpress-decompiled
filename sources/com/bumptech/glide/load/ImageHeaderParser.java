package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import defpackage.OU0;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        ANIMATED_AVIF(true),
        UNKNOWN(false);

        public final boolean d;

        ImageType(boolean z) {
            this.d = z;
        }

        public boolean hasAlpha() {
            return this.d;
        }

        public boolean isWebp() {
            int i = a.a[ordinal()];
            return i == 1 || i == 2 || i == 3;
        }
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ImageType.values().length];
            a = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @NonNull
    ImageType a(@NonNull ByteBuffer byteBuffer);

    int b(@NonNull ByteBuffer byteBuffer, @NonNull OU0 ou0);

    @NonNull
    ImageType c(@NonNull InputStream inputStream);

    int d(@NonNull InputStream inputStream, @NonNull OU0 ou0);
}
