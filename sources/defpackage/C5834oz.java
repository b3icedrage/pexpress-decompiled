package defpackage;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* JADX INFO: renamed from: oz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5834oz extends AbstractC1242Is {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(InterfaceC3129cK0.a);

    @Override // defpackage.InterfaceC3129cK0
    public final void b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.AbstractC1242Is
    public final Bitmap c(@NonNull InterfaceC0930Es interfaceC0930Es, @NonNull Bitmap bitmap, int i, int i2) {
        Paint paint = C7326w42.a;
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            Log.isLoggable("TransformationUtils", 2);
            return C7326w42.b(interfaceC0930Es, bitmap, i, i2);
        }
        Log.isLoggable("TransformationUtils", 2);
        return bitmap;
    }

    @Override // defpackage.InterfaceC3129cK0
    public final boolean equals(Object obj) {
        return obj instanceof C5834oz;
    }

    @Override // defpackage.InterfaceC3129cK0
    public final int hashCode() {
        return -670243078;
    }
}
