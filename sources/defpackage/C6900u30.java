package defpackage;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Objects;

/* JADX INFO: renamed from: u30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6900u30 {
    public static final Z91<EnumC6357rU> f = Z91.a(EnumC6357rU.g, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");
    public static final Z91<EnumC2410Xg1> g = new Z91<>("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, Z91.e);
    public static final Z91<Boolean> h;
    public static final Z91<Boolean> i;
    public static final a j;
    public static final ArrayDeque k;
    public final InterfaceC0930Es a;
    public final DisplayMetrics b;
    public final OU0 c;
    public final ArrayList d;
    public final C1228In0 e = C1228In0.a();

    /* JADX INFO: renamed from: u30$b */
    public interface b {
        void a();

        void b(InterfaceC0930Es interfaceC0930Es, Bitmap bitmap);
    }

    static {
        AbstractC6270r30.e eVar = AbstractC6270r30.a;
        Boolean bool = Boolean.FALSE;
        h = Z91.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        i = Z91.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        j = new a();
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        char[] cArr = C6177qc2.a;
        k = new ArrayDeque(0);
    }

    public C6900u30(ArrayList arrayList, DisplayMetrics displayMetrics, InterfaceC0930Es interfaceC0930Es, OU0 ou0) {
        this.d = arrayList;
        UE.e(displayMetrics, "Argument must not be null");
        this.b = displayMetrics;
        UE.e(interfaceC0930Es, "Argument must not be null");
        this.a = interfaceC0930Es;
        UE.e(ou0, "Argument must not be null");
        this.c = ou0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap c(defpackage.InterfaceC7506ww0 r4, android.graphics.BitmapFactory.Options r5, defpackage.C6900u30.b r6, defpackage.InterfaceC0930Es r7) {
        /*
            boolean r0 = r5.inJustDecodeBounds
            if (r0 != 0) goto La
            r6.a()
            r4.c()
        La:
            int r0 = r5.outWidth
            int r1 = r5.outHeight
            java.lang.String r2 = r5.outMimeType
            java.util.concurrent.locks.Lock r3 = defpackage.C7326w42.b
            r3.lock()
            android.graphics.Bitmap r4 = r4.b(r5)     // Catch: java.lang.IllegalArgumentException -> L1d java.lang.Throwable -> L3e
            r3.unlock()
            return r4
        L1d:
            r3 = move-exception
            java.io.IOException r0 = e(r3, r0, r1, r2, r5)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r1 = "Downsampler"
            r2 = 3
            android.util.Log.isLoggable(r1, r2)     // Catch: java.lang.Throwable -> L3e
            android.graphics.Bitmap r1 = r5.inBitmap     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L3d
            r7.c(r1)     // Catch: java.io.IOException -> L3c java.lang.Throwable -> L3e
            r1 = 0
            r5.inBitmap = r1     // Catch: java.io.IOException -> L3c java.lang.Throwable -> L3e
            android.graphics.Bitmap r4 = c(r4, r5, r6, r7)     // Catch: java.io.IOException -> L3c java.lang.Throwable -> L3e
            java.util.concurrent.locks.Lock r5 = defpackage.C7326w42.b
            r5.unlock()
            return r4
        L3c:
            throw r0     // Catch: java.lang.Throwable -> L3e
        L3d:
            throw r0     // Catch: java.lang.Throwable -> L3e
        L3e:
            r4 = move-exception
            java.util.concurrent.locks.Lock r5 = defpackage.C7326w42.b
            r5.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6900u30.c(ww0, android.graphics.BitmapFactory$Options, u30$b, Es):android.graphics.Bitmap");
    }

    @TargetApi(19)
    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static IOException e(IllegalArgumentException illegalArgumentException, int i2, int i3, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i2 + ", outHeight: " + i3 + ", outMimeType: " + str + ", inBitmap: " + d(options.inBitmap), illegalArgumentException);
    }

    public static void f(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final C1164Hs a(InterfaceC7506ww0 interfaceC7506ww0, int i2, int i3, C4227ha1 c4227ha1, b bVar) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        byte[] bArr = (byte[]) this.c.d(65536, byte[].class);
        synchronized (C6900u30.class) {
            arrayDeque = k;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                f(options);
            }
        }
        options.inTempStorage = bArr;
        EnumC6357rU enumC6357rU = (EnumC6357rU) c4227ha1.c(f);
        EnumC2410Xg1 enumC2410Xg1 = (EnumC2410Xg1) c4227ha1.c(g);
        AbstractC6270r30 abstractC6270r30 = (AbstractC6270r30) c4227ha1.c(AbstractC6270r30.f);
        boolean zBooleanValue = ((Boolean) c4227ha1.c(h)).booleanValue();
        Z91<Boolean> z91 = i;
        try {
            C1164Hs c1164HsE = C1164Hs.e(this.a, b(interfaceC7506ww0, options, abstractC6270r30, enumC6357rU, enumC2410Xg1, c4227ha1.c(z91) != null && ((Boolean) c4227ha1.c(z91)).booleanValue(), i2, i3, zBooleanValue, bVar));
            f(options);
            synchronized (arrayDeque) {
                arrayDeque.offer(options);
            }
            return c1164HsE;
        } finally {
            f(options);
            ArrayDeque arrayDeque2 = k;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options);
                this.c.h(bArr);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0223  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.graphics.Bitmap, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r38v0, types: [u30$b] */
    /* JADX WARN: Type inference failed for: r3v10, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r7v1, types: [Es] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Bitmap b(InterfaceC7506ww0 interfaceC7506ww0, BitmapFactory.Options options, AbstractC6270r30 abstractC6270r30, EnumC6357rU enumC6357rU, EnumC2410Xg1 enumC2410Xg1, boolean z, int i2, int i3, boolean z2, b bVar) {
        char c;
        boolean z3;
        int i4;
        int i5;
        boolean z4;
        boolean zHasAlpha;
        boolean z5;
        int i6;
        Bitmap.Config config;
        int i7;
        int i8;
        int iFloor;
        int iFloor2;
        int i9 = C6562sS0.a;
        SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        ?? r7 = this.a;
        c(interfaceC7506ww0, options, bVar, r7);
        options.inJustDecodeBounds = false;
        int[] iArr = {options.outWidth, options.outHeight};
        int i10 = iArr[0];
        int i11 = iArr[1];
        boolean z6 = (i10 == -1 || i11 == -1) ? false : z;
        int iA = interfaceC7506ww0.a();
        switch (iA) {
            case 3:
            case 4:
                c = 180;
                break;
            case 5:
            case 6:
                c = 'Z';
                break;
            case 7:
            case 8:
                c = 270;
                break;
            default:
                c = 0;
                break;
        }
        switch (iA) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                z3 = true;
                break;
            default:
                z3 = false;
                break;
        }
        int i12 = i2;
        if (i12 == Integer.MIN_VALUE) {
            i12 = (c == 'Z' || c == 270) ? i11 : i10;
        }
        if (i3 == -2147483648) {
            i3 = (c == 'Z' || c == 270) ? i10 : i11;
        }
        ImageHeaderParser.ImageType imageTypeD = interfaceC7506ww0.d();
        if (i10 <= 0 || i11 <= 0) {
            i4 = i11;
            i5 = i10;
            if (Log.isLoggable("Downsampler", 3)) {
                Objects.toString(imageTypeD);
            }
        } else {
            if (c == 'Z' || c == 270) {
                i7 = i11;
                i8 = i10;
            } else {
                i8 = i11;
                i7 = i10;
            }
            float fB = abstractC6270r30.b(i7, i8, i12, i3);
            if (fB <= 0.0f) {
                throw new IllegalArgumentException("Cannot scale with factor: " + fB + " from: " + abstractC6270r30 + ", source: [" + i10 + "x" + i11 + "], target: [" + i12 + "x" + i3 + "]");
            }
            AbstractC6270r30.g gVarA = abstractC6270r30.a(i7, i8, i12, i3);
            if (gVarA == null) {
                throw new IllegalArgumentException("Cannot round with null rounding");
            }
            float f2 = i7;
            float f3 = i8;
            int i13 = i7 / ((int) (((double) (fB * f2)) + 0.5d));
            int i14 = i8 / ((int) (((double) (fB * f3)) + 0.5d));
            AbstractC6270r30.g gVar = AbstractC6270r30.g.d;
            int iMax = Math.max(1, Integer.highestOneBit(gVarA == gVar ? Math.max(i13, i14) : Math.min(i13, i14)));
            if (gVarA == gVar && iMax < 1.0f / fB) {
                iMax <<= 1;
            }
            options.inSampleSize = iMax;
            if (imageTypeD == ImageHeaderParser.ImageType.JPEG) {
                float fMin = Math.min(iMax, 8);
                iFloor = (int) Math.ceil(f2 / fMin);
                iFloor2 = (int) Math.ceil(f3 / fMin);
                int i15 = iMax / 8;
                if (i15 > 0) {
                    iFloor /= i15;
                    iFloor2 /= i15;
                }
            } else if (imageTypeD == ImageHeaderParser.ImageType.PNG || imageTypeD == ImageHeaderParser.ImageType.PNG_A) {
                float f4 = iMax;
                iFloor = (int) Math.floor(f2 / f4);
                iFloor2 = (int) Math.floor(f3 / f4);
            } else if (imageTypeD.isWebp()) {
                float f5 = iMax;
                iFloor = Math.round(f2 / f5);
                iFloor2 = Math.round(f3 / f5);
            } else if (i7 % iMax == 0 && i8 % iMax == 0) {
                iFloor = i7 / iMax;
                iFloor2 = i8 / iMax;
            } else {
                options.inJustDecodeBounds = true;
                c(interfaceC7506ww0, options, bVar, r7);
                options.inJustDecodeBounds = false;
                int[] iArr2 = {options.outWidth, options.outHeight};
                iFloor = iArr2[0];
                iFloor2 = iArr2[1];
            }
            double dB = abstractC6270r30.b(iFloor, iFloor2, i12, i3);
            int iRound = (int) Math.round((dB <= 1.0d ? dB : 1.0d / dB) * 2.147483647E9d);
            int i16 = (int) ((((double) iRound) * dB) + 0.5d);
            options.inTargetDensity = (int) (((dB / ((double) (i16 / iRound))) * ((double) i16)) + 0.5d);
            if (dB > 1.0d) {
                dB = 1.0d / dB;
            }
            int iRound2 = (int) Math.round(dB * 2.147483647E9d);
            options.inDensity = iRound2;
            int i17 = options.inTargetDensity;
            if (i17 <= 0 || iRound2 <= 0 || i17 == iRound2) {
                options.inTargetDensity = 0;
                options.inDensity = 0;
            } else {
                options.inScaled = true;
            }
            Log.isLoggable("Downsampler", 2);
            i5 = i10;
            i4 = i11;
        }
        boolean zB = this.e.b(i12, i3, z6, z3);
        if (zB) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            z4 = false;
            options.inMutable = false;
        } else {
            z4 = false;
        }
        if (zB) {
            z5 = true;
        } else if (enumC6357rU != EnumC6357rU.d) {
            try {
                zHasAlpha = interfaceC7506ww0.d().hasAlpha();
            } catch (IOException unused) {
                if (Log.isLoggable("Downsampler", 3)) {
                    Objects.toString(enumC6357rU);
                }
                zHasAlpha = z4;
            }
            Bitmap.Config config2 = zHasAlpha ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
            options.inPreferredConfig = config2;
            if (config2 == Bitmap.Config.RGB_565) {
                z5 = true;
                options.inDither = true;
            } else {
                z5 = true;
            }
        } else {
            z5 = true;
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        }
        int i18 = Build.VERSION.SDK_INT;
        if (i5 < 0 || i4 < 0 || !z2) {
            int i19 = options.inTargetDensity;
            float f6 = (i19 <= 0 || (i6 = options.inDensity) <= 0 || i19 == i6) ? z4 : z5 ? i19 / options.inDensity : 1.0f;
            float f7 = options.inSampleSize;
            int iCeil = (int) Math.ceil(i5 / f7);
            int iCeil2 = (int) Math.ceil(i4 / f7);
            int iRound3 = Math.round(iCeil * f6);
            i3 = Math.round(iCeil2 * f6);
            Log.isLoggable("Downsampler", 2);
            i12 = iRound3;
        }
        ?? r3 = 0;
        if (i12 > 0 && i3 > 0) {
            if (i18 < 26) {
                config = null;
            } else if (options.inPreferredConfig != Bitmap.Config.HARDWARE) {
                config = options.outConfig;
            }
            if (config == null) {
                config = options.inPreferredConfig;
            }
            options.inBitmap = r7.b(i12, i3, config);
        }
        if (enumC2410Xg1 != null) {
            if (i18 >= 28) {
                options.inPreferredColorSpace = ColorSpace.get((enumC2410Xg1 != EnumC2410Xg1.d || options.outColorSpace == null || !options.outColorSpace.isWideGamut()) ? z4 : z5 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
            } else if (i18 >= 26) {
                ColorSpace.Named unused2 = ColorSpace.Named.SRGB;
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
        }
        ?? C = c(interfaceC7506ww0, options, bVar, r7);
        bVar.b(r7, C);
        if (Log.isLoggable("Downsampler", 2)) {
            d(C);
            d(options.inBitmap);
            Thread.currentThread().getName();
            SystemClock.elapsedRealtimeNanos();
        }
        if (C != 0) {
            C.setDensity(this.b.densityDpi);
            switch (iA) {
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    Matrix matrix = new Matrix();
                    switch (iA) {
                        case 2:
                            matrix.setScale(-1.0f, 1.0f);
                            break;
                        case 3:
                            matrix.setRotate(180.0f);
                            break;
                        case 4:
                            matrix.setRotate(180.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            break;
                        case 5:
                            matrix.setRotate(90.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            break;
                        case 6:
                            matrix.setRotate(90.0f);
                            break;
                        case 7:
                            matrix.setRotate(-90.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            break;
                        case 8:
                            matrix.setRotate(-90.0f);
                            break;
                    }
                    RectF rectF = new RectF(0.0f, 0.0f, C.getWidth(), C.getHeight());
                    matrix.mapRect(rectF);
                    Bitmap bitmapD = r7.d(Math.round(rectF.width()), Math.round(rectF.height()), C.getConfig() != null ? C.getConfig() : Bitmap.Config.ARGB_8888);
                    matrix.postTranslate(-rectF.left, -rectF.top);
                    bitmapD.setHasAlpha(C.hasAlpha());
                    C7326w42.a(C, bitmapD, matrix);
                    r3 = bitmapD;
                    break;
                default:
                    r3 = C;
                    break;
            }
            if (!C.equals(r3)) {
                r7.c(C);
            }
        }
        return r3;
    }

    /* JADX INFO: renamed from: u30$a */
    public class a implements b {
        @Override // defpackage.C6900u30.b
        public final void a() {
        }

        @Override // defpackage.C6900u30.b
        public final void b(InterfaceC0930Es interfaceC0930Es, Bitmap bitmap) {
        }
    }
}
