package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.a;

/* JADX INFO: renamed from: Is, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1242Is implements InterfaceC6486s42<Bitmap> {
    @Override // defpackage.InterfaceC6486s42
    @NonNull
    public final InterfaceC3667et1<Bitmap> a(@NonNull Context context, @NonNull InterfaceC3667et1<Bitmap> interfaceC3667et1, int i, int i2) {
        if (!C6177qc2.j(i, i2)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        InterfaceC0930Es interfaceC0930Es = a.a(context).d;
        Bitmap bitmap = interfaceC3667et1.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapC = c(interfaceC0930Es, bitmap, i, i2);
        return bitmap.equals(bitmapC) ? interfaceC3667et1 : C1164Hs.e(interfaceC0930Es, bitmapC);
    }

    public abstract Bitmap c(@NonNull InterfaceC0930Es interfaceC0930Es, @NonNull Bitmap bitmap, int i, int i2);
}
