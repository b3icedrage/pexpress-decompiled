package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Yn1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2509Yn1 {
    public static final C3337dJ1 j;
    public final HashSet<Bitmap> a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final int g;
    public final C3337dJ1 h;
    public final PM1 i;

    static {
        C3337dJ1 c3337dJ1 = new C3337dJ1();
        c3337dJ1.add(Bitmap.Config.ALPHA_8);
        c3337dJ1.add(Bitmap.Config.RGB_565);
        c3337dJ1.add(Bitmap.Config.ARGB_4444);
        c3337dJ1.add(Bitmap.Config.ARGB_8888);
        if (Build.VERSION.SDK_INT >= 26) {
            c3337dJ1.add(Bitmap.Config.RGBA_F16);
        }
        j = C5487nJ1.a(c3337dJ1);
    }

    public C2509Yn1(int i) {
        PM1 strategy = new PM1();
        C3337dJ1 allowedConfigs = j;
        Intrinsics.checkNotNullParameter(allowedConfigs, "allowedConfigs");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.g = i;
        this.h = allowedConfigs;
        this.i = strategy;
        this.a = new HashSet<>();
        if (i < 0) {
            throw new IllegalArgumentException("maxSize must be >= 0.");
        }
    }

    @NotNull
    public final Bitmap a(int i, int i2, @NotNull Bitmap.Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(config, "config");
        Bitmap bitmapC = c(i, i2, config);
        if (bitmapC != null) {
            bitmapC.eraseColor(0);
        } else {
            bitmapC = null;
        }
        if (bitmapC != null) {
            return bitmapC;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, config);
        Intrinsics.b(bitmapCreateBitmap, "Bitmap.createBitmap(width, height, config)");
        return bitmapCreateBitmap;
    }

    @NotNull
    public final Bitmap b(int i, int i2, @NotNull Bitmap.Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        Bitmap bitmapC = c(i, i2, config);
        if (bitmapC != null) {
            return bitmapC;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, config);
        Intrinsics.b(bitmapCreateBitmap, "Bitmap.createBitmap(width, height, config)");
        return bitmapCreateBitmap;
    }

    @Nullable
    public final synchronized Bitmap c(int i, int i2, @NotNull Bitmap.Config config) {
        Bitmap bitmapB;
        try {
            Intrinsics.checkNotNullParameter(config, "config");
            if (C3057c.k(config)) {
                throw new IllegalArgumentException("Cannot create a mutable hardware bitmap.");
            }
            bitmapB = this.i.b(i, i2, config);
            if (bitmapB == null) {
                this.d++;
            } else {
                this.a.remove(bitmapB);
                this.b -= C3057c.g(bitmapB);
                this.c++;
                bitmapB.setDensity(0);
                bitmapB.setHasAlpha(true);
                bitmapB.setPremultiplied(true);
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmapB;
    }

    public final synchronized void d(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        if (bitmap.isRecycled()) {
            return;
        }
        int iG = C3057c.g(bitmap);
        if (bitmap.isMutable() && iG <= this.g) {
            if (this.h.d.containsKey(bitmap.getConfig())) {
                if (this.a.contains(bitmap)) {
                    return;
                }
                this.i.c(bitmap);
                this.a.add(bitmap);
                this.b += iG;
                this.e++;
                e(this.g);
                return;
            }
        }
        bitmap.recycle();
    }

    public final synchronized void e(int i) {
        while (this.b > i) {
            Bitmap bitmapD = this.i.d();
            if (bitmapD == null) {
                this.b = 0;
                return;
            }
            this.a.remove(bitmapD);
            this.b -= C3057c.g(bitmapD);
            this.f++;
            bitmapD.recycle();
        }
    }
}
