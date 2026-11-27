package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: Dx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0867Dx {

    @NonNull
    public final Rect a;
    public final ColorStateList b;
    public final ColorStateList c;
    public final ColorStateList d;
    public final int e;
    public final RJ1 f;

    public C0867Dx(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, RJ1 rj1, @NonNull Rect rect) {
        U0.e(rect.left);
        U0.e(rect.top);
        U0.e(rect.right);
        U0.e(rect.bottom);
        this.a = rect;
        this.b = colorStateList2;
        this.c = colorStateList;
        this.d = colorStateList3;
        this.e = i;
        this.f = rj1;
    }

    @NonNull
    public static C0867Dx a(@NonNull Context context, int i) {
        U0.d("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, C2083Tl1.v);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateListB = MX0.b(context, typedArrayObtainStyledAttributes, 4);
        ColorStateList colorStateListB2 = MX0.b(context, typedArrayObtainStyledAttributes, 9);
        ColorStateList colorStateListB3 = MX0.b(context, typedArrayObtainStyledAttributes, 7);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        RJ1 rj1A = RJ1.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0), new A(0)).a();
        typedArrayObtainStyledAttributes.recycle();
        return new C0867Dx(colorStateListB, colorStateListB2, colorStateListB3, dimensionPixelSize, rj1A, rect);
    }

    public final void b(@NonNull TextView textView) {
        NX0 nx0 = new NX0();
        NX0 nx1 = new NX0();
        RJ1 rj1 = this.f;
        nx0.setShapeAppearanceModel(rj1);
        nx1.setShapeAppearanceModel(rj1);
        nx0.l(this.c);
        nx0.d.j = this.e;
        nx0.invalidateSelf();
        NX0.b bVar = nx0.d;
        ColorStateList colorStateList = bVar.d;
        ColorStateList colorStateList2 = this.d;
        if (colorStateList != colorStateList2) {
            bVar.d = colorStateList2;
            nx0.onStateChange(nx0.getState());
        }
        ColorStateList colorStateList3 = this.b;
        textView.setTextColor(colorStateList3);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList3.withAlpha(30), nx0, nx1);
        Rect rect = this.a;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        textView.setBackground(insetDrawable);
    }
}
