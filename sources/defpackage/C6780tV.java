package defpackage;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: tV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6780tV implements ImageHeaderParser {
    public static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    public static final int[] b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX INFO: renamed from: tV$a */
    public static final class a implements b {
        public final ByteBuffer a;

        public a(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // defpackage.C6780tV.b
        public final int a() {
            return (b() << 8) | b();
        }

        @Override // defpackage.C6780tV.b
        public final short b() throws b.a {
            ByteBuffer byteBuffer = this.a;
            if (byteBuffer.remaining() >= 1) {
                return (short) (byteBuffer.get() & 255);
            }
            throw new b.a();
        }

        @Override // defpackage.C6780tV.b
        public final int c(int i, byte[] bArr) {
            ByteBuffer byteBuffer = this.a;
            int iMin = Math.min(i, byteBuffer.remaining());
            if (iMin == 0) {
                return -1;
            }
            byteBuffer.get(bArr, 0, iMin);
            return iMin;
        }

        @Override // defpackage.C6780tV.b
        public final long r(long j) {
            ByteBuffer byteBuffer = this.a;
            int iMin = (int) Math.min(byteBuffer.remaining(), j);
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
    }

    /* JADX INFO: renamed from: tV$b */
    public interface b {

        /* JADX INFO: renamed from: tV$b$a */
        public static final class a extends IOException {
            public a() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a();

        short b();

        int c(int i, byte[] bArr);

        long r(long j);
    }

    /* JADX INFO: renamed from: tV$c */
    public static final class c implements b {
        public final InputStream a;

        public c(InputStream inputStream) {
            this.a = inputStream;
        }

        @Override // defpackage.C6780tV.b
        public final int a() {
            return (b() << 8) | b();
        }

        @Override // defpackage.C6780tV.b
        public final short b() throws IOException {
            int i = this.a.read();
            if (i != -1) {
                return (short) i;
            }
            throw new b.a();
        }

        @Override // defpackage.C6780tV.b
        public final int c(int i, byte[] bArr) throws b.a {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && (i3 = this.a.read(bArr, i2, i - i2)) != -1) {
                i2 += i3;
            }
            if (i2 == 0 && i3 == -1) {
                throw new b.a();
            }
            return i2;
        }

        @Override // defpackage.C6780tV.b
        public final long r(long j) throws IOException {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                InputStream inputStream = this.a;
                long jSkip = inputStream.skip(j2);
                if (jSkip > 0) {
                    j2 -= jSkip;
                } else {
                    if (inputStream.read() == -1) {
                        break;
                    }
                    j2--;
                }
            }
            return j - j2;
        }
    }

    public static int e(b bVar, OU0 ou0) {
        int iA;
        try {
            int iA2 = bVar.a();
            if (!((iA2 & 65496) == 65496 || iA2 == 19789 || iA2 == 18761)) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            while (true) {
                if (bVar.b() != 255) {
                    Log.isLoggable("DfltImageHeaderParser", 3);
                } else {
                    short sB = bVar.b();
                    if (sB != 218) {
                        if (sB != 217) {
                            iA = bVar.a() - 2;
                            if (sB == 225) {
                                break;
                            }
                            long j = iA;
                            if (bVar.r(j) != j) {
                                Log.isLoggable("DfltImageHeaderParser", 3);
                            }
                        } else {
                            Log.isLoggable("DfltImageHeaderParser", 3);
                        }
                    }
                }
                iA = -1;
                break;
            }
            if (iA == -1) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            byte[] bArr = (byte[]) ou0.d(iA, byte[].class);
            try {
                return g(bVar, bArr, iA);
            } finally {
                ou0.h(bArr);
            }
        } catch (b.a unused) {
            return -1;
        }
    }

    @NonNull
    public static ImageHeaderParser.ImageType f(b bVar) {
        try {
            int iA = bVar.a();
            if (iA == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int iB = (iA << 8) | bVar.b();
            if (iB == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int iB2 = (iB << 8) | bVar.b();
            if (iB2 == -1991225785) {
                bVar.r(21L);
                try {
                    return bVar.b() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (b.a unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (iB2 == 1380533830) {
                bVar.r(4L);
                if (((bVar.a() << 16) | bVar.a()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int iA2 = (bVar.a() << 16) | bVar.a();
                if ((iA2 & (-256)) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i = iA2 & 255;
                if (i != 88) {
                    if (i != 76) {
                        return ImageHeaderParser.ImageType.WEBP;
                    }
                    bVar.r(4L);
                    return (bVar.b() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                }
                bVar.r(4L);
                short sB = bVar.b();
                if ((sB & 2) != 0) {
                    return ImageHeaderParser.ImageType.ANIMATED_WEBP;
                }
                return (sB & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (((bVar.a() << 16) | bVar.a()) != 1718909296) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int iA3 = (bVar.a() << 16) | bVar.a();
            if (iA3 == 1635150195) {
                return ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            int i2 = 0;
            boolean z = iA3 == 1635150182;
            bVar.r(4L);
            int i3 = iB2 - 16;
            if (i3 % 4 == 0) {
                while (i2 < 5 && i3 > 0) {
                    int iA4 = (bVar.a() << 16) | bVar.a();
                    if (iA4 == 1635150195) {
                        return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                    }
                    if (iA4 == 1635150182) {
                        z = true;
                    }
                    i2++;
                    i3 -= 4;
                }
            }
            return z ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
        } catch (b.a unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    public static int g(b bVar, byte[] bArr, int i) {
        ByteOrder byteOrder;
        if (bVar.c(i, bArr) != i) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
        byte[] bArr2 = a;
        boolean z = bArr != null && i > bArr2.length;
        if (z) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                if (bArr[i2] != bArr2[i2]) {
                    z = false;
                    break;
                }
            }
        }
        if (!z) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
        ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        short s = byteBuffer.remaining() - 6 >= 2 ? byteBuffer.getShort(6) : (short) -1;
        if (s == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (s != 19789) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        byteBuffer.order(byteOrder);
        int i3 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
        int i4 = i3 + 6;
        short s2 = byteBuffer.remaining() - i4 >= 2 ? byteBuffer.getShort(i4) : (short) -1;
        for (int i5 = 0; i5 < s2; i5++) {
            int i6 = (i5 * 12) + i3 + 8;
            if ((byteBuffer.remaining() - i6 >= 2 ? byteBuffer.getShort(i6) : (short) -1) == 274) {
                int i7 = i6 + 2;
                short s3 = byteBuffer.remaining() - i7 >= 2 ? byteBuffer.getShort(i7) : (short) -1;
                if (s3 < 1 || s3 > 12) {
                    Log.isLoggable("DfltImageHeaderParser", 3);
                } else {
                    int i8 = i6 + 4;
                    int i9 = byteBuffer.remaining() - i8 >= 4 ? byteBuffer.getInt(i8) : -1;
                    if (i9 < 0) {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                    } else {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                        int i10 = i9 + b[s3];
                        if (i10 > 4) {
                            Log.isLoggable("DfltImageHeaderParser", 3);
                        } else {
                            int i11 = i6 + 8;
                            if (i11 < 0 || i11 > byteBuffer.remaining()) {
                                Log.isLoggable("DfltImageHeaderParser", 3);
                            } else {
                                if (i10 >= 0 && i10 + i11 <= byteBuffer.remaining()) {
                                    if (byteBuffer.remaining() - i11 >= 2) {
                                        return byteBuffer.getShort(i11);
                                    }
                                    return -1;
                                }
                                Log.isLoggable("DfltImageHeaderParser", 3);
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public final ImageHeaderParser.ImageType a(@NonNull ByteBuffer byteBuffer) {
        UE.e(byteBuffer, "Argument must not be null");
        return f(new a(byteBuffer));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int b(@NonNull ByteBuffer byteBuffer, @NonNull OU0 ou0) {
        a aVar = new a(byteBuffer);
        UE.e(ou0, "Argument must not be null");
        return e(aVar, ou0);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public final ImageHeaderParser.ImageType c(@NonNull InputStream inputStream) {
        return f(new c(inputStream));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int d(@NonNull InputStream inputStream, @NonNull OU0 ou0) {
        c cVar = new c(inputStream);
        UE.e(ou0, "Argument must not be null");
        return e(cVar, ou0);
    }
}
