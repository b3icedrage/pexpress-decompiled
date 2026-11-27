package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class E30 {
    public final C2509Yn1 a;

    public E30(@NotNull C2509Yn1 bitmapPool) {
        Intrinsics.checkNotNullParameter(bitmapPool, "bitmapPool");
        this.a = bitmapPool;
    }

    @NotNull
    public final Bitmap a(@NotNull Drawable height, @NotNull Bitmap.Config config, @NotNull LM1 size, @NotNull XC1 scale, boolean z) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Intrinsics.checkNotNullParameter(height, "drawable");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(scale, "scale");
        boolean z2 = height instanceof BitmapDrawable;
        if (z2) {
            Bitmap bitmap3 = ((BitmapDrawable) height).getBitmap();
            Intrinsics.checkNotNullExpressionValue(bitmap3, "bitmap");
            if (bitmap3.getConfig() == ((config == null || C3057c.k(config)) ? Bitmap.Config.ARGB_8888 : config) && (z || (size instanceof C5748oa1) || size.equals(C7618xU.a(bitmap3.getWidth(), bitmap3.getHeight(), size, scale)))) {
                return bitmap3;
            }
        }
        C2813ao0 c2813ao0 = C4316i.a;
        Intrinsics.checkNotNullParameter(height, "$this$width");
        BitmapDrawable bitmapDrawable = (BitmapDrawable) (!z2 ? null : height);
        int intrinsicWidth = (bitmapDrawable == null || (bitmap2 = bitmapDrawable.getBitmap()) == null) ? height.getIntrinsicWidth() : bitmap2.getWidth();
        int i = UserVerificationMethods.USER_VERIFY_NONE;
        if (intrinsicWidth <= 0) {
            intrinsicWidth = 512;
        }
        Intrinsics.checkNotNullParameter(height, "$this$height");
        BitmapDrawable bitmapDrawable2 = (BitmapDrawable) (z2 ? height : null);
        int intrinsicHeight = (bitmapDrawable2 == null || (bitmap = bitmapDrawable2.getBitmap()) == null) ? height.getIntrinsicHeight() : bitmap.getHeight();
        if (intrinsicHeight > 0) {
            i = intrinsicHeight;
        }
        C1433Ld1 c1433Ld1A = C7618xU.a(intrinsicWidth, i, size, scale);
        C2509Yn1 c2509Yn1 = this.a;
        if (config == null || C3057c.k(config)) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i2 = c1433Ld1A.d;
        int i3 = c1433Ld1A.e;
        Bitmap bitmapA = c2509Yn1.a(i2, i3, config);
        Rect bounds = height.getBounds();
        int i4 = bounds.left;
        int i5 = bounds.top;
        int i6 = bounds.right;
        int i7 = bounds.bottom;
        height.setBounds(0, 0, i2, i3);
        height.draw(new Canvas(bitmapA));
        height.setBounds(i4, i5, i6, i7);
        return bitmapA;
    }
}
