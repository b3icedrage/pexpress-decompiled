package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.pexpress.tool.R;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: Rp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1937Rp extends Drawable implements XX1.b {

    @NonNull
    public final WeakReference<Context> d;

    @NonNull
    public final NX0 e;

    @NonNull
    public final XX1 g;

    @NonNull
    public final Rect h;

    @NonNull
    public final C2015Sp i;
    public float j;
    public float k;
    public final int l;
    public float m;
    public float n;
    public float o;
    public WeakReference<View> p;
    public WeakReference<FrameLayout> q;

    public C1937Rp(@NonNull Context context, C2015Sp.a aVar) {
        SX1 sx1;
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.d = weakReference;
        C7001uY1.c(context, C7001uY1.b, "Theme.MaterialComponents");
        this.h = new Rect();
        XX1 xx1 = new XX1(this);
        this.g = xx1;
        TextPaint textPaint = xx1.a;
        textPaint.setTextAlign(Paint.Align.CENTER);
        C2015Sp c2015Sp = new C2015Sp(context, aVar);
        this.i = c2015Sp;
        boolean zA = c2015Sp.a();
        C2015Sp.a aVar2 = c2015Sp.b;
        NX0 nx0 = new NX0(RJ1.a(context, zA ? aVar2.k.intValue() : aVar2.i.intValue(), c2015Sp.a() ? aVar2.l.intValue() : aVar2.j.intValue(), new A(0)).a());
        this.e = nx0;
        f();
        Context context2 = weakReference.get();
        if (context2 != null && xx1.f != (sx1 = new SX1(context2, aVar2.h.intValue()))) {
            xx1.b(sx1, context2);
            textPaint.setColor(aVar2.g.intValue());
            invalidateSelf();
            h();
            invalidateSelf();
        }
        this.l = ((int) Math.pow(10.0d, ((double) aVar2.o) - 1.0d)) - 1;
        xx1.d = true;
        h();
        invalidateSelf();
        xx1.d = true;
        f();
        h();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(aVar2.e.intValue());
        if (nx0.d.c != colorStateListValueOf) {
            nx0.l(colorStateListValueOf);
            invalidateSelf();
        }
        textPaint.setColor(aVar2.g.intValue());
        invalidateSelf();
        e();
        h();
        setVisible(aVar2.u.booleanValue(), false);
    }

    @Override // XX1.b
    public final void a() {
        invalidateSelf();
    }

    @NonNull
    public final String b() {
        int iD = d();
        int i = this.l;
        C2015Sp c2015Sp = this.i;
        if (iD <= i) {
            return NumberFormat.getInstance(c2015Sp.b.p).format(d());
        }
        Context context = this.d.get();
        return context == null ? "" : String.format(c2015Sp.b.p, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.l), "+");
    }

    public final CharSequence c() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        C2015Sp c2015Sp = this.i;
        boolean zA = c2015Sp.a();
        C2015Sp.a aVar = c2015Sp.b;
        if (!zA) {
            return aVar.q;
        }
        if (aVar.r == 0 || (context = this.d.get()) == null) {
            return null;
        }
        int iD = d();
        int i = this.l;
        return iD <= i ? context.getResources().getQuantityString(aVar.r, d(), Integer.valueOf(d())) : context.getString(aVar.s, Integer.valueOf(i));
    }

    public final int d() {
        C2015Sp c2015Sp = this.i;
        if (c2015Sp.a()) {
            return c2015Sp.b.n;
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.e.draw(canvas);
        if (this.i.a()) {
            Rect rect = new Rect();
            String strB = b();
            XX1 xx1 = this.g;
            xx1.a.getTextBounds(strB, 0, strB.length(), rect);
            canvas.drawText(strB, this.j, this.k + (rect.height() / 2), xx1.a);
        }
    }

    public final void e() {
        WeakReference<View> weakReference = this.p;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = this.p.get();
        WeakReference<FrameLayout> weakReference2 = this.q;
        g(view, weakReference2 != null ? weakReference2.get() : null);
    }

    public final void f() {
        Context context = this.d.get();
        if (context == null) {
            return;
        }
        C2015Sp c2015Sp = this.i;
        boolean zA = c2015Sp.a();
        C2015Sp.a aVar = c2015Sp.b;
        this.e.setShapeAppearanceModel(RJ1.a(context, zA ? aVar.k.intValue() : aVar.i.intValue(), c2015Sp.a() ? aVar.l.intValue() : aVar.j.intValue(), new A(0)).a());
        invalidateSelf();
    }

    public final void g(@NonNull View view, FrameLayout frameLayout) {
        this.p = new WeakReference<>(view);
        this.q = new WeakReference<>(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        h();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.i.b.m;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.h.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.h.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        Context context = this.d.get();
        WeakReference<View> weakReference = this.p;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.h;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference<FrameLayout> weakReference2 = this.q;
        FrameLayout frameLayout = weakReference2 != null ? weakReference2.get() : null;
        if (frameLayout != null) {
            frameLayout.offsetDescendantRectToMyCoords(view, rect3);
        }
        C2015Sp c2015Sp = this.i;
        float f = !c2015Sp.a() ? c2015Sp.c : c2015Sp.d;
        this.m = f;
        if (f != -1.0f) {
            this.o = f;
            this.n = f;
        } else {
            this.o = Math.round((!c2015Sp.a() ? c2015Sp.f : c2015Sp.h) / 2.0f);
            this.n = Math.round((!c2015Sp.a() ? c2015Sp.e : c2015Sp.g) / 2.0f);
        }
        if (d() > 9) {
            this.n = Math.max(this.n, (this.g.a(b()) / 2.0f) + c2015Sp.i);
        }
        boolean zA = c2015Sp.a();
        C2015Sp.a aVar = c2015Sp.b;
        int iIntValue = zA ? aVar.y.intValue() : aVar.w.intValue();
        int i = c2015Sp.l;
        if (i == 0) {
            iIntValue -= Math.round(this.o);
        }
        int iIntValue2 = aVar.A.intValue() + iIntValue;
        int iIntValue3 = aVar.t.intValue();
        if (iIntValue3 == 8388691 || iIntValue3 == 8388693) {
            this.k = rect3.bottom - iIntValue2;
        } else {
            this.k = rect3.top + iIntValue2;
        }
        int iIntValue4 = c2015Sp.a() ? aVar.x.intValue() : aVar.v.intValue();
        if (i == 1) {
            iIntValue4 += c2015Sp.a() ? c2015Sp.k : c2015Sp.j;
        }
        int iIntValue5 = aVar.z.intValue() + iIntValue4;
        int iIntValue6 = aVar.t.intValue();
        if (iIntValue6 == 8388659 || iIntValue6 == 8388691) {
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            this.j = view.getLayoutDirection() == 0 ? (rect3.left - this.n) + iIntValue5 : (rect3.right + this.n) - iIntValue5;
        } else {
            WeakHashMap<View, C5345me2> weakHashMap2 = Cd2.a;
            this.j = view.getLayoutDirection() == 0 ? (rect3.right + this.n) - iIntValue5 : (rect3.left - this.n) + iIntValue5;
        }
        float f2 = this.j;
        float f3 = this.k;
        float f4 = this.n;
        float f5 = this.o;
        rect2.set((int) (f2 - f4), (int) (f3 - f5), (int) (f2 + f4), (int) (f3 + f5));
        float f6 = this.m;
        NX0 nx0 = this.e;
        if (f6 != -1.0f) {
            RJ1.a aVarE = nx0.d.a.e();
            aVarE.e = new A(f6);
            aVarE.f = new A(f6);
            aVarE.g = new A(f6);
            aVarE.h = new A(f6);
            nx0.setShapeAppearanceModel(aVarE.a());
        }
        if (rect.equals(rect2)) {
            return;
        }
        nx0.setBounds(rect2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, XX1.b
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        C2015Sp c2015Sp = this.i;
        c2015Sp.a.m = i;
        c2015Sp.b.m = i;
        this.g.a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
