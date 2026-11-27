package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.button.MaterialButton;
import com.pexpress.tool.R;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: vX0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7207vX0 {
    public final MaterialButton a;

    @NonNull
    public RJ1 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PorterDuff.Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public NX0 m;
    public boolean q;
    public RippleDrawable s;
    public int t;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean r = true;

    public C7207vX0(MaterialButton materialButton, @NonNull RJ1 rj1) {
        this.a = materialButton;
        this.b = rj1;
    }

    public final InterfaceC5280mK1 a() {
        RippleDrawable rippleDrawable = this.s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.s.getNumberOfLayers() > 2 ? (InterfaceC5280mK1) this.s.getDrawable(2) : (InterfaceC5280mK1) this.s.getDrawable(1);
    }

    public final NX0 b(boolean z) {
        RippleDrawable rippleDrawable = this.s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (NX0) ((LayerDrawable) ((InsetDrawable) this.s.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void c(@NonNull RJ1 rj1) {
        this.b = rj1;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(rj1);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(rj1);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(rj1);
        }
    }

    public final void d(int i, int i2) {
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        MaterialButton materialButton = this.a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.e;
        int i4 = this.f;
        this.f = i2;
        this.e = i;
        if (!this.o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void e() {
        NX0 nx0 = new NX0(this.b);
        MaterialButton materialButton = this.a;
        nx0.j(materialButton.getContext());
        A30.a.h(nx0, this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            A30.a.i(nx0, mode);
        }
        float f = this.h;
        ColorStateList colorStateList = this.k;
        nx0.d.j = f;
        nx0.invalidateSelf();
        NX0.b bVar = nx0.d;
        if (bVar.d != colorStateList) {
            bVar.d = colorStateList;
            nx0.onStateChange(nx0.getState());
        }
        NX0 nx1 = new NX0(this.b);
        nx1.setTint(0);
        float f2 = this.h;
        int iH = this.n ? C8056za.h(materialButton, R.attr.colorSurface) : 0;
        nx1.d.j = f2;
        nx1.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iH);
        NX0.b bVar2 = nx1.d;
        if (bVar2.d != colorStateListValueOf) {
            bVar2.d = colorStateListValueOf;
            nx1.onStateChange(nx1.getState());
        }
        NX0 nx2 = new NX0(this.b);
        this.m = nx2;
        A30.a.g(nx2, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(C7080uu1.c(this.l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{nx1, nx0}), this.c, this.e, this.d, this.f), this.m);
        this.s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        NX0 nx0B = b(false);
        if (nx0B != null) {
            nx0B.k(this.t);
            nx0B.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        NX0 nx0B = b(false);
        NX0 nx0B2 = b(true);
        if (nx0B != null) {
            float f = this.h;
            ColorStateList colorStateList = this.k;
            nx0B.d.j = f;
            nx0B.invalidateSelf();
            NX0.b bVar = nx0B.d;
            if (bVar.d != colorStateList) {
                bVar.d = colorStateList;
                nx0B.onStateChange(nx0B.getState());
            }
            if (nx0B2 != null) {
                float f2 = this.h;
                int iH = this.n ? C8056za.h(this.a, R.attr.colorSurface) : 0;
                nx0B2.d.j = f2;
                nx0B2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iH);
                NX0.b bVar2 = nx0B2.d;
                if (bVar2.d != colorStateListValueOf) {
                    bVar2.d = colorStateListValueOf;
                    nx0B2.onStateChange(nx0B2.getState());
                }
            }
        }
    }
}
