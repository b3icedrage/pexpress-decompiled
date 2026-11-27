package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ys, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7913ys implements InterfaceC5122lc0<Bitmap> {
    @Override // defpackage.InterfaceC5122lc0
    public final boolean a(Bitmap bitmap) {
        Bitmap data = bitmap;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(data, "data");
        return true;
    }

    @Override // defpackage.InterfaceC5122lc0
    public final String b(Bitmap bitmap) {
        Bitmap data = bitmap;
        Intrinsics.checkNotNullParameter(data, "data");
        return null;
    }

    @Override // defpackage.InterfaceC5122lc0
    public final Object c(C2509Yn1 c2509Yn1, Object obj, LM1 lm1, C4695ja1 c4695ja1, S60 s60) {
        Resources resources = c4695ja1.a.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        return new J30(new BitmapDrawable(resources, (Bitmap) obj), false, DS.e);
    }
}
