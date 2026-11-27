package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import io.sentry.android.core.b0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class PU0 implements InterfaceC0930Es {
    public static final Bitmap.Config f = Bitmap.Config.ARGB_8888;
    public final MM1 a;
    public final Set<Bitmap.Config> b;
    public final a c;
    public final long d;
    public long e;

    public static final class a {
    }

    public PU0(long j) {
        MM1 mm1 = new MM1();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set<Bitmap.Config> setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.d = j;
        this.a = mm1;
        this.b = setUnmodifiableSet;
        this.c = new a();
    }

    @Override // defpackage.InterfaceC0930Es
    @SuppressLint({"InlinedApi"})
    public final void a(int i) {
        Log.isLoggable("LruBitmapPool", 3);
        if (i >= 40 || i >= 20) {
            e();
        } else if (i >= 20 || i == 15) {
            g(this.d / 2);
        }
    }

    @Override // defpackage.InterfaceC0930Es
    @NonNull
    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapF = f(i, i2, config);
        if (bitmapF != null) {
            return bitmapF;
        }
        if (config == null) {
            config = f;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.InterfaceC0930Es
    public final synchronized void c(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.a.getClass();
                if (C6177qc2.c(bitmap) <= this.d && this.b.contains(bitmap.getConfig())) {
                    this.a.getClass();
                    int iC = C6177qc2.c(bitmap);
                    this.a.e(bitmap);
                    this.c.getClass();
                    this.e += (long) iC;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        this.a.getClass();
                        MM1.c(C6177qc2.c(bitmap), bitmap.getConfig());
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Objects.toString(this.a);
                    }
                    g(this.d);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.a.getClass();
                MM1.c(C6177qc2.c(bitmap), bitmap.getConfig());
                bitmap.isMutable();
                this.b.contains(bitmap.getConfig());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.InterfaceC0930Es
    @NonNull
    public final Bitmap d(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapF = f(i, i2, config);
        if (bitmapF != null) {
            bitmapF.eraseColor(0);
            return bitmapF;
        }
        if (config == null) {
            config = f;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.InterfaceC0930Es
    public final void e() {
        Log.isLoggable("LruBitmapPool", 3);
        g(0L);
    }

    public final synchronized Bitmap f(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapB;
        try {
            if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapB = this.a.b(i, i2, config != null ? config : f);
            if (bitmapB != null) {
                long j = this.e;
                this.a.getClass();
                this.e = j - ((long) C6177qc2.c(bitmapB));
                this.c.getClass();
                bitmapB.setHasAlpha(true);
                bitmapB.setPremultiplied(true);
            } else if (Log.isLoggable("LruBitmapPool", 3)) {
                this.a.getClass();
                MM1.c(C6177qc2.d(config) * i * i2, config);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.a.getClass();
                MM1.c(C6177qc2.d(config) * i * i2, config);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Objects.toString(this.a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmapB;
    }

    public final synchronized void g(long j) {
        while (this.e > j) {
            try {
                MM1 mm1 = this.a;
                Bitmap bitmapC = mm1.b.c();
                if (bitmapC != null) {
                    mm1.a(Integer.valueOf(C6177qc2.c(bitmapC)), bitmapC);
                }
                if (bitmapC == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        b0.e("LruBitmapPool", "Size mismatch, resetting");
                        Objects.toString(this.a);
                    }
                    this.e = 0L;
                    return;
                }
                this.c.getClass();
                long j2 = this.e;
                this.a.getClass();
                this.e = j2 - ((long) C6177qc2.c(bitmapC));
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    this.a.getClass();
                    MM1.c(C6177qc2.c(bitmapC), bitmapC.getConfig());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Objects.toString(this.a);
                }
                bitmapC.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
