package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: Rd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1901Rd {

    @NonNull
    public final View a;
    public UZ1 d;
    public UZ1 e;
    public UZ1 f;
    public int c = -1;
    public final C5552ne b = C5552ne.a();

    public C1901Rd(@NonNull View view) {
        this.a = view;
    }

    public final void a() {
        View view = this.a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.d != null) {
                if (this.f == null) {
                    this.f = new UZ1();
                }
                UZ1 uz1 = this.f;
                uz1.a = null;
                uz1.d = false;
                uz1.b = null;
                uz1.c = false;
                WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                ColorStateList colorStateListG = Cd2.d.g(view);
                if (colorStateListG != null) {
                    uz1.d = true;
                    uz1.a = colorStateListG;
                }
                PorterDuff.Mode modeH = Cd2.d.h(view);
                if (modeH != null) {
                    uz1.c = true;
                    uz1.b = modeH;
                }
                if (uz1.d || uz1.c) {
                    C5552ne.e(background, uz1, view.getDrawableState());
                    return;
                }
            }
            UZ1 uz2 = this.e;
            if (uz2 != null) {
                C5552ne.e(background, uz2, view.getDrawableState());
                return;
            }
            UZ1 uz3 = this.d;
            if (uz3 != null) {
                C5552ne.e(background, uz3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        UZ1 uz1 = this.e;
        if (uz1 != null) {
            return uz1.a;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        UZ1 uz1 = this.e;
        if (uz1 != null) {
            return uz1.b;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListF;
        View view = this.a;
        Context context = view.getContext();
        int[] iArr = C3855fm1.A;
        WZ1 wz1E = WZ1.e(context, attributeSet, iArr, i);
        TypedArray typedArray = wz1E.b;
        View view2 = this.a;
        Cd2.k(view2, view2.getContext(), iArr, attributeSet, wz1E.b, i);
        try {
            if (typedArray.hasValue(0)) {
                this.c = typedArray.getResourceId(0, -1);
                C5552ne c5552ne = this.b;
                Context context2 = view.getContext();
                int i2 = this.c;
                synchronized (c5552ne) {
                    colorStateListF = c5552ne.a.f(context2, i2);
                }
                if (colorStateListF != null) {
                    g(colorStateListF);
                }
            }
            if (typedArray.hasValue(1)) {
                Cd2.d.q(view, wz1E.a(1));
            }
            if (typedArray.hasValue(2)) {
                Cd2.d.r(view, R30.c(typedArray.getInt(2, -1), null));
            }
            wz1E.f();
        } catch (Throwable th) {
            wz1E.f();
            throw th;
        }
    }

    public final void e() {
        this.c = -1;
        g(null);
        a();
    }

    public final void f(int i) {
        ColorStateList colorStateListF;
        this.c = i;
        C5552ne c5552ne = this.b;
        if (c5552ne != null) {
            Context context = this.a.getContext();
            synchronized (c5552ne) {
                colorStateListF = c5552ne.a.f(context, i);
            }
        } else {
            colorStateListF = null;
        }
        g(colorStateListF);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new UZ1();
            }
            UZ1 uz1 = this.d;
            uz1.a = colorStateList;
            uz1.d = true;
        } else {
            this.d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new UZ1();
        }
        UZ1 uz1 = this.e;
        uz1.a = colorStateList;
        uz1.d = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new UZ1();
        }
        UZ1 uz1 = this.e;
        uz1.b = mode;
        uz1.c = true;
        a();
    }
}
