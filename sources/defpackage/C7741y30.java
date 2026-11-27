package defpackage;

import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.NonNull;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: y30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7741y30 extends Property<Drawable, Integer> {
    public static final C7741y30 a;

    static {
        C7741y30 c7741y30 = new C7741y30(Integer.class, "drawableAlphaCompat");
        new WeakHashMap();
        a = c7741y30;
    }

    @Override // android.util.Property
    public final Integer get(@NonNull Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    @Override // android.util.Property
    public final void set(@NonNull Drawable drawable, @NonNull Integer num) {
        drawable.setAlpha(num.intValue());
    }
}
