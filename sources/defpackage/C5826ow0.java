package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import androidx.annotation.NonNull;
import java.io.IOException;

/* JADX INFO: renamed from: ow0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5826ow0 extends AbstractC1158Hq {
    public final KL0 C;
    public final Rect D;
    public final Rect E;
    public final FU0 F;
    public Pc2 G;
    public Pc2 H;

    public C5826ow0(DU0 du0, ZN0 zn0) {
        super(du0, zn0);
        this.C = new KL0(3);
        this.D = new Rect();
        this.E = new Rect();
        C3788fU0 c3788fU0 = du0.d;
        this.F = c3788fU0 == null ? null : (FU0) c3788fU0.d.get(zn0.g);
    }

    @Override // defpackage.AbstractC1158Hq, defpackage.InterfaceC5489nK0
    public final void c(ColorFilter colorFilter, NU0 nu0) {
        super.c(colorFilter, nu0);
        if (colorFilter == IU0.F) {
            this.G = new Pc2(nu0, null);
        } else if (colorFilter == IU0.I) {
            this.H = new Pc2(nu0, null);
        }
    }

    @Override // defpackage.AbstractC1158Hq, defpackage.X30
    public final void f(RectF rectF, Matrix matrix, boolean z) {
        super.f(rectF, matrix, z);
        FU0 fu0 = this.F;
        if (fu0 != null) {
            float fC = C7857yc2.c();
            rectF.set(0.0f, 0.0f, fu0.a * fC, fu0.b * fC);
            this.n.mapRect(rectF);
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00f8  */
    @Override // defpackage.AbstractC1158Hq
    public final void l(@NonNull Canvas canvas, Matrix matrix, int i) {
        Bitmap bitmap;
        Bitmap bitmapDecodeStream;
        Pc2 pc2 = this.H;
        DU0 du0 = this.o;
        FU0 fu0 = this.F;
        if (pc2 == null || (bitmap = (Bitmap) pc2.f()) == null) {
            String str = this.p.g;
            C4553iw0 c4553iw0 = du0.l;
            if (c4553iw0 != null) {
                Drawable.Callback callback = du0.getCallback();
                Context context = (callback != null && (callback instanceof View)) ? ((View) callback).getContext() : null;
                Context context2 = c4553iw0.a;
                if ((context != null || context2 != null) && !context2.equals(context)) {
                    du0.l = null;
                }
            }
            if (du0.l == null) {
                du0.l = new C4553iw0(du0.getCallback(), du0.m, du0.d.d);
            }
            C4553iw0 c4553iw1 = du0.l;
            if (c4553iw1 != null) {
                String str2 = c4553iw1.b;
                FU0 fu1 = (FU0) c4553iw1.c.get(str);
                if (fu1 != null) {
                    Bitmap bitmap2 = fu1.d;
                    if (bitmap2 != null) {
                        bitmap = bitmap2;
                    } else {
                        Context context3 = c4553iw1.a;
                        if (context3 == null) {
                            bitmap = null;
                        } else {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inScaled = true;
                            options.inDensity = 160;
                            String str3 = fu1.c;
                            if (!str3.startsWith("data:") || str3.indexOf("base64,") <= 0) {
                                try {
                                    if (TextUtils.isEmpty(str2)) {
                                        throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                                    }
                                    try {
                                        bitmapDecodeStream = BitmapFactory.decodeStream(context3.getAssets().open(str2 + str3), null, options);
                                        if (bitmapDecodeStream == null) {
                                            CS0.b("Decoded image `" + str + "` is null.");
                                            bitmap = null;
                                        } else {
                                            int i2 = fu1.a;
                                            int i3 = fu1.b;
                                            C7857yc2.a aVar = C7857yc2.a;
                                            if (bitmapDecodeStream.getWidth() != i2 || bitmapDecodeStream.getHeight() != i3) {
                                                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeStream, i2, i3, true);
                                                bitmapDecodeStream.recycle();
                                                bitmapDecodeStream = bitmapCreateScaledBitmap;
                                            }
                                            synchronized (C4553iw0.d) {
                                                ((FU0) c4553iw1.c.get(str)).d = bitmapDecodeStream;
                                            }
                                            bitmap = bitmapDecodeStream;
                                        }
                                    } catch (IllegalArgumentException e) {
                                        CS0.c("Unable to decode image `" + str + "`.", e);
                                    }
                                } catch (IOException e2) {
                                    CS0.c("Unable to open asset.", e2);
                                }
                            } else {
                                try {
                                    byte[] bArrDecode = Base64.decode(str3.substring(str3.indexOf(44) + 1), 0);
                                    bitmapDecodeStream = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                                    synchronized (C4553iw0.d) {
                                        ((FU0) c4553iw1.c.get(str)).d = bitmapDecodeStream;
                                    }
                                    bitmap = bitmapDecodeStream;
                                } catch (IllegalArgumentException e3) {
                                    CS0.c("data URL did not have correct base64 format.", e3);
                                    bitmap = null;
                                }
                            }
                        }
                    }
                } else {
                    bitmap = null;
                }
            } else {
                bitmap = null;
            }
            if (bitmap == null) {
                bitmap = fu0 != null ? fu0.d : null;
            }
        }
        if (bitmap == null || bitmap.isRecycled() || fu0 == null) {
            return;
        }
        float fC = C7857yc2.c();
        KL0 kl0 = this.C;
        kl0.setAlpha(i);
        Pc2 pc3 = this.G;
        if (pc3 != null) {
            kl0.setColorFilter((ColorFilter) pc3.f());
        }
        canvas.save();
        canvas.concat(matrix);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Rect rect = this.D;
        rect.set(0, 0, width, height);
        boolean z = du0.r;
        Rect rect2 = this.E;
        if (z) {
            rect2.set(0, 0, (int) (fu0.a * fC), (int) (fu0.b * fC));
        } else {
            rect2.set(0, 0, (int) (bitmap.getWidth() * fC), (int) (bitmap.getHeight() * fC));
        }
        canvas.drawBitmap(bitmap, rect, rect2, kl0);
        canvas.restore();
    }
}
