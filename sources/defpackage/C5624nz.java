package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* JADX INFO: renamed from: nz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5624nz extends AbstractC1242Is {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(InterfaceC3129cK0.a);

    @Override // defpackage.InterfaceC3129cK0
    public final void b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.AbstractC1242Is
    public final Bitmap c(@NonNull InterfaceC0930Es interfaceC0930Es, @NonNull Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        Paint paint = C7326w42.a;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = i2 / bitmap.getHeight();
            width2 = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapD = interfaceC0930Es.d(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapD.setHasAlpha(bitmap.hasAlpha());
        C7326w42.a(bitmap, bitmapD, matrix);
        return bitmapD;
    }

    @Override // defpackage.InterfaceC3129cK0
    public final boolean equals(Object obj) {
        return obj instanceof C5624nz;
    }

    @Override // defpackage.InterfaceC3129cK0
    public final int hashCode() {
        return -599754482;
    }
}
