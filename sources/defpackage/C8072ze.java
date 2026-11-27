package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.pexpress.tool.R;

/* JADX INFO: renamed from: ze, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8072ze extends C6811te {
    public final C7862ye d;
    public Drawable e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public boolean h;
    public boolean i;

    public C8072ze(C7862ye c7862ye) {
        super(c7862ye);
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = false;
        this.d = c7862ye;
    }

    @Override // defpackage.C6811te
    public final void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, R.attr.seekBarStyle);
        C7862ye c7862ye = this.d;
        Context context = c7862ye.getContext();
        int[] iArr = C3855fm1.g;
        WZ1 wz1E = WZ1.e(context, attributeSet, iArr, R.attr.seekBarStyle);
        Cd2.k(c7862ye, c7862ye.getContext(), iArr, attributeSet, wz1E.b, R.attr.seekBarStyle);
        Drawable drawableC = wz1E.c(0);
        if (drawableC != null) {
            c7862ye.setThumb(drawableC);
        }
        Drawable drawableB = wz1E.b(1);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.e = drawableB;
        if (drawableB != null) {
            drawableB.setCallback(c7862ye);
            A30.b.b(drawableB, c7862ye.getLayoutDirection());
            if (drawableB.isStateful()) {
                drawableB.setState(c7862ye.getDrawableState());
            }
            c();
        }
        c7862ye.invalidate();
        TypedArray typedArray = wz1E.b;
        if (typedArray.hasValue(3)) {
            this.g = R30.c(typedArray.getInt(3, -1), this.g);
            this.i = true;
        }
        if (typedArray.hasValue(2)) {
            this.f = wz1E.a(2);
            this.h = true;
        }
        wz1E.f();
        c();
    }

    public final void c() {
        Drawable drawable = this.e;
        if (drawable != null) {
            if (this.h || this.i) {
                Drawable drawableMutate = drawable.mutate();
                this.e = drawableMutate;
                if (this.h) {
                    A30.a.h(drawableMutate, this.f);
                }
                if (this.i) {
                    A30.a.i(this.e, this.g);
                }
                if (this.e.isStateful()) {
                    this.e.setState(this.d.getDrawableState());
                }
            }
        }
    }

    public final void d(Canvas canvas) {
        if (this.e != null) {
            C7862ye c7862ye = this.d;
            int max = c7862ye.getMax();
            if (max > 1) {
                int intrinsicWidth = this.e.getIntrinsicWidth();
                int intrinsicHeight = this.e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.e.setBounds(-i, -i2, i, i2);
                float width = ((c7862ye.getWidth() - c7862ye.getPaddingLeft()) - c7862ye.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(c7862ye.getPaddingLeft(), c7862ye.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
