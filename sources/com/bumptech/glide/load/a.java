package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import defpackage.C2092To1;
import defpackage.C6035pw;
import defpackage.OU0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static int a(@NonNull ArrayList arrayList, InputStream inputStream, @NonNull OU0 ou0) throws IOException {
        if (inputStream != null) {
            if (!inputStream.markSupported()) {
                inputStream = new C2092To1(inputStream, ou0);
            }
            inputStream.mark(5242880);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                try {
                    int iD = ((ImageHeaderParser) arrayList.get(i)).d(inputStream, ou0);
                    inputStream.reset();
                    if (iD != -1) {
                        return iD;
                    }
                } catch (Throwable th) {
                    inputStream.reset();
                    throw th;
                }
            }
        }
        return -1;
    }

    @NonNull
    public static ImageHeaderParser.ImageType b(@NonNull ArrayList arrayList, InputStream inputStream, @NonNull OU0 ou0) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C2092To1(inputStream, ou0);
        }
        inputStream.mark(5242880);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser.ImageType imageTypeC = ((ImageHeaderParser) arrayList.get(i)).c(inputStream);
                inputStream.reset();
                if (imageTypeC != ImageHeaderParser.ImageType.UNKNOWN) {
                    return imageTypeC;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @NonNull
    public static ImageHeaderParser.ImageType c(@NonNull ArrayList arrayList, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser.ImageType imageTypeA = ((ImageHeaderParser) arrayList.get(i)).a(byteBuffer);
                AtomicReference<byte[]> atomicReference = C6035pw.a;
                if (imageTypeA != ImageHeaderParser.ImageType.UNKNOWN) {
                    return imageTypeA;
                }
            } catch (Throwable th) {
                AtomicReference<byte[]> atomicReference2 = C6035pw.a;
                throw th;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
