package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class MX0 {
    public static ColorStateList a(@NonNull Context context, @NonNull WZ1 wz1, int i) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = wz1.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateList = C6333rM.getColorStateList(context, resourceId)) == null) ? wz1.a(i) : colorStateList;
    }

    public static ColorStateList b(@NonNull Context context, @NonNull TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateList;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateList = C6333rM.getColorStateList(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateList;
    }

    public static int c(@NonNull Context context, @NonNull TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i2);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable d(@NonNull Context context, @NonNull TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableD;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableD = C7652xe.d(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableD;
    }

    public static boolean e(@NonNull Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }
}
