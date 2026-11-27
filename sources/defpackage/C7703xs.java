package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import com.google.android.gms.common.api.Api;
import defpackage.C3024bo1.a;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7703xs implements InterfaceC8038zU {
    public static final String[] c = {"image/jpeg", "image/webp", "image/heic", "image/heif"};
    public final Paint a;
    public final Context b;

    /* JADX INFO: renamed from: xs$a */
    public static final class a extends AbstractC1521Mh0 {

        @Nullable
        public Exception e;

        @Override // defpackage.AbstractC1521Mh0, defpackage.UN1
        public final long s0(@NotNull C1481Lu sink, long j) throws Exception {
            Intrinsics.checkNotNullParameter(sink, "sink");
            try {
                return super.s0(sink, j);
            } catch (Exception e) {
                this.e = e;
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: xs$b */
    public static final class b extends InputStream {
        public final InputStream d;

        public b(@NotNull InputStream delegate) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.d = delegate;
        }

        @Override // java.io.InputStream
        public final int available() {
            return 1073741824;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.d.close();
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
        public final int read() {
            return this.d.read();
        }

        @Override // java.io.InputStream
        public final void reset() throws IOException {
            this.d.reset();
        }

        @Override // java.io.InputStream
        public final long skip(long j) {
            return this.d.skip(j);
        }

        @Override // java.io.InputStream
        public final int read(@NotNull byte[] b) {
            Intrinsics.checkNotNullParameter(b, "b");
            return this.d.read(b);
        }

        @Override // java.io.InputStream
        public final int read(@NotNull byte[] b, int i, int i2) {
            Intrinsics.checkNotNullParameter(b, "b");
            return this.d.read(b, i, i2);
        }
    }

    public C7703xs(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.b = context;
        this.a = new Paint(3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C7197vU c(C7703xs c7703xs, C2509Yn1 c2509Yn1, C3734fC0 delegate, LM1 lm1, C4695ja1 c4695ja1) throws Exception {
        int i;
        boolean z;
        boolean z2;
        Rect rect;
        Bitmap bitmap;
        C7703xs c7703xs2;
        int iMin;
        double dMax;
        Bitmap bitmapB;
        ColorSpace colorSpace;
        c7703xs.getClass();
        BitmapFactory.Options options = new BitmapFactory.Options();
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        a aVar = new a(delegate);
        C3024bo1 c3024bo1E = Cm2.e(aVar);
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(c3024bo1E.peek().new a(), null, options);
        Exception exc = aVar.e;
        if (exc != null) {
            throw exc;
        }
        options.inJustDecodeBounds = false;
        String str = options.outMimeType;
        if (str != null && C1526Mj.m(c, str)) {
            C5114la0 c5114la0 = new C5114la0(new b(c3024bo1E.peek().new a()));
            int iC = c5114la0.c();
            z = iC == 2 || iC == 7 || iC == 4 || iC == 5;
            switch (c5114la0.c()) {
                case 3:
                case 4:
                    i = 180;
                    break;
                case 5:
                case 8:
                    i = 270;
                    break;
                case 6:
                case 7:
                    i = 90;
                    break;
                default:
                    i = 0;
                    break;
            }
        } else {
            i = 0;
            z = false;
        }
        boolean z3 = i == 90 || i == 270;
        int i2 = z3 ? options.outHeight : options.outWidth;
        int i3 = z3 ? options.outWidth : options.outHeight;
        Bitmap.Config config = c4695ja1.b;
        if ((z || i > 0) && (config == null || C3057c.k(config))) {
            config = Bitmap.Config.ARGB_8888;
        }
        if (c4695ja1.f && config == Bitmap.Config.ARGB_8888 && Intrinsics.a(options.outMimeType, "image/jpeg")) {
            config = Bitmap.Config.RGB_565;
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26 && options.outConfig == Bitmap.Config.RGBA_F16 && config != Bitmap.Config.HARDWARE) {
            config = Bitmap.Config.RGBA_F16;
        }
        options.inPreferredConfig = config;
        if (i4 >= 26 && (colorSpace = c4695ja1.c) != null) {
            options.inPreferredColorSpace = colorSpace;
        }
        options.inPremultiplied = c4695ja1.g;
        options.inMutable = false;
        options.inScaled = false;
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            i = i;
            z2 = z;
            options.inSampleSize = 1;
            options.inScaled = false;
            rect = null;
            options.inBitmap = null;
        } else {
            if (lm1 instanceof C1433Ld1) {
                C1433Ld1 c1433Ld1 = (C1433Ld1) lm1;
                int i5 = c1433Ld1.d;
                int i6 = C7618xU.a;
                XC1 scale = c4695ja1.d;
                Intrinsics.checkNotNullParameter(scale, "scale");
                int iHighestOneBit = Integer.highestOneBit(i2 / i5);
                z2 = z;
                if (iHighestOneBit < 1) {
                    iHighestOneBit = 1;
                }
                int i7 = c1433Ld1.e;
                int iHighestOneBit2 = Integer.highestOneBit(i3 / i7);
                if (iHighestOneBit2 < 1) {
                    iHighestOneBit2 = 1;
                }
                int iOrdinal = scale.ordinal();
                if (iOrdinal == 0) {
                    iMin = Math.min(iHighestOneBit, iHighestOneBit2);
                } else {
                    if (iOrdinal != 1) {
                        throw new C6489s51();
                    }
                    iMin = Math.max(iHighestOneBit, iHighestOneBit2);
                }
                options.inSampleSize = iMin;
                double d = iMin;
                Intrinsics.checkNotNullParameter(scale, "scale");
                double d2 = ((double) i5) / (((double) i2) / d);
                double d3 = ((double) i7) / (((double) i3) / d);
                int iOrdinal2 = scale.ordinal();
                if (iOrdinal2 == 0) {
                    dMax = Math.max(d2, d3);
                } else {
                    if (iOrdinal2 != 1) {
                        throw new C6489s51();
                    }
                    dMax = Math.min(d2, d3);
                }
                if (c4695ja1.e && dMax > 1.0d) {
                    dMax = 1.0d;
                }
                boolean z4 = dMax != 1.0d;
                options.inScaled = z4;
                if (z4) {
                    if (dMax > 1) {
                        options.inDensity = QX0.a(((double) Api.BaseClientBuilder.API_PRIORITY_OTHER) / dMax);
                        options.inTargetDensity = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    } else {
                        options.inDensity = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                        options.inTargetDensity = QX0.a(((double) Api.BaseClientBuilder.API_PRIORITY_OTHER) * dMax);
                    }
                }
                if (options.inMutable) {
                    int i8 = options.inSampleSize;
                    if (i8 != 1 || options.inScaled) {
                        double d4 = i8;
                        double d5 = ((double) options.outWidth) / d4;
                        double d6 = ((double) options.outHeight) / d4;
                        int iCeil = (int) Math.ceil((d5 * dMax) + 0.5d);
                        int iCeil2 = (int) Math.ceil((dMax * d6) + 0.5d);
                        Bitmap.Config inPreferredConfig = options.inPreferredConfig;
                        Intrinsics.checkNotNullExpressionValue(inPreferredConfig, "inPreferredConfig");
                        bitmapB = c2509Yn1.b(iCeil, iCeil2, inPreferredConfig);
                    } else {
                        int i9 = options.outWidth;
                        int i10 = options.outHeight;
                        Bitmap.Config inPreferredConfig2 = options.inPreferredConfig;
                        Intrinsics.checkNotNullExpressionValue(inPreferredConfig2, "inPreferredConfig");
                        bitmapB = c2509Yn1.b(i9, i10, inPreferredConfig2);
                    }
                    options.inBitmap = bitmapB;
                }
            } else {
                options.inSampleSize = 1;
                options.inScaled = false;
                i = i;
                z2 = z;
            }
            rect = null;
        }
        Bitmap bitmap2 = options.inBitmap;
        try {
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(c3024bo1E.new a(), rect, options);
                c3024bo1E.close();
                try {
                    Exception exc2 = aVar.e;
                    if (exc2 != null) {
                        throw exc2;
                    }
                    if (bitmapDecodeStream == null) {
                        throw new IllegalStateException("BitmapFactory returned a null Bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network or disk) as it's not encoded as a valid image format.");
                    }
                    Bitmap.Config inPreferredConfig3 = options.inPreferredConfig;
                    Intrinsics.checkNotNullExpressionValue(inPreferredConfig3, "inPreferredConfig");
                    boolean z5 = i > 0;
                    if (z2 || z5) {
                        Matrix matrix = new Matrix();
                        float width = bitmapDecodeStream.getWidth() / 2.0f;
                        float height = bitmapDecodeStream.getHeight() / 2.0f;
                        if (z2) {
                            matrix.postScale(-1.0f, 1.0f, width, height);
                        }
                        int i11 = i;
                        if (z5) {
                            matrix.postRotate(i11, width, height);
                        }
                        RectF rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                        matrix.mapRect(rectF);
                        float f = rectF.left;
                        if (f != 0.0f || rectF.top != 0.0f) {
                            matrix.postTranslate(-f, -rectF.top);
                        }
                        Bitmap bitmapA = (i11 == 90 || i11 == 270) ? c2509Yn1.a(bitmapDecodeStream.getHeight(), bitmapDecodeStream.getWidth(), inPreferredConfig3) : c2509Yn1.a(bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), inPreferredConfig3);
                        c7703xs2 = c7703xs;
                        new Canvas(bitmapA).drawBitmap(bitmapDecodeStream, matrix, c7703xs2.a);
                        c2509Yn1.d(bitmapDecodeStream);
                        bitmapDecodeStream = bitmapA;
                    } else {
                        c7703xs2 = c7703xs;
                    }
                    bitmapDecodeStream.setDensity(0);
                    Resources resources = c7703xs2.b.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
                    return new C7197vU(new BitmapDrawable(resources, bitmapDecodeStream), options.inSampleSize > 1 || options.inScaled);
                } catch (Throwable th) {
                    th = th;
                    bitmap = bitmapDecodeStream;
                    if (bitmap2 != null) {
                        c2509Yn1.d(bitmap2);
                    }
                    if (bitmap != bitmap2 && bitmap != 0) {
                        c2509Yn1.d(bitmap);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bitmap = rect;
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                C6621sj.b(c3024bo1E, th3);
                throw th4;
            }
        }
    }

    @Override // defpackage.InterfaceC8038zU
    @Nullable
    public final Object a(@NotNull C2509Yn1 c2509Yn1, @NotNull InterfaceC2833av interfaceC2833av, @NotNull LM1 lm1, @NotNull C4695ja1 c4695ja1, @NotNull S60 frame) throws Exception {
        C6251qy c6251qy = new C6251qy(1, C5885pC0.b(frame));
        c6251qy.r();
        try {
            C3734fC0 c3734fC0 = new C3734fC0(c6251qy, interfaceC2833av);
            try {
                C7197vU c7197vUC = c(this, c2509Yn1, c3734fC0, lm1, c4695ja1);
                C1717Ot1.a aVar = C1717Ot1.e;
                c6251qy.resumeWith(c7197vUC);
                c3734fC0.t();
                Object objQ = c6251qy.q();
                if (objQ == MN.d) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                }
                return objQ;
            } catch (Throwable th) {
                c3734fC0.t();
                throw th;
            }
        } catch (Exception e) {
            if (!(e instanceof InterruptedException) && !(e instanceof InterruptedIOException)) {
                throw e;
            }
            Throwable thInitCause = new CancellationException("Blocking call was interrupted due to parent cancellation.").initCause(e);
            Intrinsics.checkNotNullExpressionValue(thInitCause, "CancellationException(\"B…n.\").initCause(exception)");
            throw thInitCause;
        }
    }

    @Override // defpackage.InterfaceC8038zU
    public final boolean b(@NotNull InterfaceC2833av source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return true;
    }
}
