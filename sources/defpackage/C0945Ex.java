package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import com.google.android.material.datepicker.MaterialCalendar;
import com.pexpress.tool.R;

/* JADX INFO: renamed from: Ex, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0945Ex {

    @NonNull
    public final C0867Dx a;

    @NonNull
    public final C0867Dx b;

    @NonNull
    public final C0867Dx c;

    @NonNull
    public final C0867Dx d;

    @NonNull
    public final C0867Dx e;

    @NonNull
    public final C0867Dx f;

    @NonNull
    public final C0867Dx g;

    @NonNull
    public final Paint h;

    public C0945Ex(@NonNull Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C6577sX0.c(context, R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()).data, C2083Tl1.u);
        this.a = C0867Dx.a(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        this.g = C0867Dx.a(context, typedArrayObtainStyledAttributes.getResourceId(1, 0));
        this.b = C0867Dx.a(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        this.c = C0867Dx.a(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        ColorStateList colorStateListB = MX0.b(context, typedArrayObtainStyledAttributes, 6);
        this.d = C0867Dx.a(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.e = C0867Dx.a(context, typedArrayObtainStyledAttributes.getResourceId(7, 0));
        this.f = C0867Dx.a(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(colorStateListB.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
