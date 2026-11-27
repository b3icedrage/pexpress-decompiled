package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class F30 implements InterfaceC5122lc0<Drawable> {
    public final E30 a;

    public F30(@NotNull E30 drawableDecoder) {
        Intrinsics.checkNotNullParameter(drawableDecoder, "drawableDecoder");
        this.a = drawableDecoder;
    }

    @Override // defpackage.InterfaceC5122lc0
    public final boolean a(Drawable drawable) {
        Drawable data = drawable;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(data, "data");
        return true;
    }

    @Override // defpackage.InterfaceC5122lc0
    public final String b(Drawable drawable) {
        Drawable data = drawable;
        Intrinsics.checkNotNullParameter(data, "data");
        return null;
    }

    @Override // defpackage.InterfaceC5122lc0
    public final Object c(C2509Yn1 c2509Yn1, Object obj, LM1 lm1, C4695ja1 c4695ja1, S60 s60) {
        Drawable isVector = (Drawable) obj;
        C2813ao0 c2813ao0 = C4316i.a;
        Intrinsics.checkNotNullParameter(isVector, "$this$isVector");
        boolean z = (isVector instanceof C4030gd2) || (isVector instanceof VectorDrawable);
        if (z) {
            Bitmap bitmapA = this.a.a(isVector, c4695ja1.b, lm1, c4695ja1.d, c4695ja1.e);
            Resources resources = c4695ja1.a.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
            isVector = new BitmapDrawable(resources, bitmapA);
        }
        return new J30(isVector, z, DS.e);
    }
}
