package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes.dex */
public final class WZ1 {
    public final Context a;
    public final TypedArray b;
    public TypedValue c;

    public WZ1(Context context, TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }

    public static WZ1 e(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new WZ1(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public final ColorStateList a(int i) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = this.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateList = C6333rM.getColorStateList(this.a, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateList;
    }

    public final Drawable b(int i) {
        int resourceId;
        TypedArray typedArray = this.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : C7652xe.d(this.a, resourceId);
    }

    public final Drawable c(int i) {
        int resourceId;
        Drawable drawableD;
        if (!this.b.hasValue(i) || (resourceId = this.b.getResourceId(i, 0)) == 0) {
            return null;
        }
        C5552ne c5552neA = C5552ne.a();
        Context context = this.a;
        synchronized (c5552neA) {
            drawableD = c5552neA.a.d(context, resourceId, true);
        }
        return drawableD;
    }

    public final Typeface d(int i, int i2, C0810De.a aVar) {
        int resourceId = this.b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.c == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = this.c;
        ThreadLocal<TypedValue> threadLocal = C7708xt1.a;
        Context context = this.a;
        if (context.isRestricted()) {
            return null;
        }
        return C7708xt1.b(context, resourceId, typedValue, i2, aVar, true, false);
    }

    public final void f() {
        this.b.recycle();
    }
}
