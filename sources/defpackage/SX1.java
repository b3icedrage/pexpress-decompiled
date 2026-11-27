package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.TypedValue;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class SX1 {
    public final ColorStateList a;
    public final String b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final boolean h;
    public final float i;
    public final ColorStateList j;
    public float k;
    public final int l;
    public boolean m = false;
    public Typeface n;

    public class a extends C7708xt1.e {
        public final /* synthetic */ G1 a;

        public a(G1 g1) {
            this.a = g1;
        }

        @Override // defpackage.C7708xt1.e
        public final void b(int i) {
            SX1.this.m = true;
            this.a.o(i);
        }

        @Override // defpackage.C7708xt1.e
        public final void c(@NonNull Typeface typeface) {
            SX1 sx1 = SX1.this;
            sx1.n = Typeface.create(typeface, sx1.c);
            sx1.m = true;
            this.a.p(sx1.n, false);
        }
    }

    public SX1(@NonNull Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, C2083Tl1.N);
        this.k = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.j = MX0.b(context, typedArrayObtainStyledAttributes, 3);
        MX0.b(context, typedArrayObtainStyledAttributes, 4);
        MX0.b(context, typedArrayObtainStyledAttributes, 5);
        this.c = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.d = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i2 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.l = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
        this.b = typedArrayObtainStyledAttributes.getString(i2);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.a = MX0.b(context, typedArrayObtainStyledAttributes, 6);
        this.e = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.g = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, C2083Tl1.A);
        this.h = typedArrayObtainStyledAttributes2.hasValue(0);
        this.i = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.n;
        int i = this.c;
        if (typeface == null && (str = this.b) != null) {
            this.n = Typeface.create(str, i);
        }
        if (this.n == null) {
            int i2 = this.d;
            if (i2 == 1) {
                this.n = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.n = Typeface.SERIF;
            } else if (i2 != 3) {
                this.n = Typeface.DEFAULT;
            } else {
                this.n = Typeface.MONOSPACE;
            }
            this.n = Typeface.create(this.n, i);
        }
    }

    @NonNull
    public final Typeface b(@NonNull Context context) {
        if (this.m) {
            return this.n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceA = C7708xt1.a(context, this.l);
                this.n = typefaceA;
                if (typefaceA != null) {
                    this.n = Typeface.create(typefaceA, this.c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException | Exception unused) {
            }
        }
        a();
        this.m = true;
        return this.n;
    }

    public final void c(@NonNull Context context, @NonNull G1 g1) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i = this.l;
        if (i == 0) {
            this.m = true;
        }
        if (this.m) {
            g1.p(this.n, true);
            return;
        }
        try {
            a aVar = new a(g1);
            ThreadLocal<TypedValue> threadLocal = C7708xt1.a;
            if (context.isRestricted()) {
                aVar.a(-4);
            } else {
                C7708xt1.b(context, i, new TypedValue(), 0, aVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.m = true;
            g1.o(1);
        } catch (Exception unused2) {
            this.m = true;
            g1.o(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typefaceB = null;
        int i = this.l;
        if (i != 0) {
            ThreadLocal<TypedValue> threadLocal = C7708xt1.a;
            if (!context.isRestricted()) {
                typefaceB = C7708xt1.b(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typefaceB != null;
    }

    public final void e(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull G1 g1) {
        f(context, textPaint, g1);
        ColorStateList colorStateList = this.j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.a;
        textPaint.setShadowLayer(this.g, this.e, this.f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull G1 g1) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.n);
        c(context, new TX1(this, context, textPaint, g1));
    }

    public final void g(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull Typeface typeface) {
        Typeface typefaceA = C6708t72.a(context.getResources().getConfiguration(), typeface);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.k);
        if (this.h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}
