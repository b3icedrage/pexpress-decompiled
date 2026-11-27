package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class OX0 {
    public static final int[] a = {R.attr.theme, com.pexpress.tool.R.attr.theme};
    public static final int[] b = {com.pexpress.tool.R.attr.materialThemeOverlay};

    @NonNull
    public static Context a(@NonNull Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z = (context instanceof HM) && ((HM) context).a == resourceId;
        if (resourceId == 0 || z) {
            return context;
        }
        HM hm = new HM(context, resourceId);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            hm.getTheme().applyStyle(resourceId2, true);
        }
        return hm;
    }
}
