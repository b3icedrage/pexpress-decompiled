package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: iC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4363iC implements InterfaceC6696t42 {

    @NotNull
    public static final PorterDuffXfermode a = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);

    @Override // defpackage.InterfaceC6696t42
    @Nullable
    public final Bitmap a(@NotNull C2509Yn1 c2509Yn1, @NotNull Bitmap bitmap) {
        Paint paint = new Paint(3);
        int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
        float f = iMin / 2.0f;
        Bitmap bitmapA = c2509Yn1.a(iMin, iMin, C3057c.h(bitmap));
        Canvas canvas = new Canvas(bitmapA);
        canvas.drawCircle(f, f, f, paint);
        paint.setXfermode(a);
        canvas.drawBitmap(bitmap, f - (bitmap.getWidth() / 2.0f), f - (bitmap.getHeight() / 2.0f), paint);
        return bitmapA;
    }

    @Override // defpackage.InterfaceC6696t42
    @NotNull
    public final String b() {
        String name = C4363iC.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "CircleCropTransformation::class.java.name");
        return name;
    }

    public final boolean equals(@Nullable Object obj) {
        return obj instanceof C4363iC;
    }

    public final int hashCode() {
        return C4363iC.class.hashCode();
    }

    @NotNull
    public final String toString() {
        return "CircleCropTransformation()";
    }
}
