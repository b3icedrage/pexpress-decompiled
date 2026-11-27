package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.AbstractViewOnTouchListenerC1366Kh0;
import defpackage.C3855fm1;
import defpackage.C6051q02;
import defpackage.InterfaceC8013zL1;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements k.a, View.OnClickListener, ActionMenuView.a {
    public h l;
    public CharSequence m;
    public Drawable n;
    public f.b o;
    public a p;
    public b q;
    public boolean r;
    public boolean s;
    public final int t;
    public int u;
    public final int v;

    public class a extends AbstractViewOnTouchListenerC1366Kh0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // defpackage.AbstractViewOnTouchListenerC1366Kh0
        public final InterfaceC8013zL1 b() {
            androidx.appcompat.widget.a.C0220a c0220a;
            b bVar = ActionMenuItemView.this.q;
            if (bVar == null || (c0220a = androidx.appcompat.widget.a.this.y) == null) {
                return null;
            }
            return c0220a.a();
        }

        @Override // defpackage.AbstractViewOnTouchListenerC1366Kh0
        public final boolean c() {
            InterfaceC8013zL1 interfaceC8013zL1B;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            f.b bVar = actionMenuItemView.o;
            return bVar != null && bVar.a(actionMenuItemView.l) && (interfaceC8013zL1B = b()) != null && interfaceC8013zL1B.a();
        }
    }

    public static abstract class b {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.r = g();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3855fm1.c, 0, 0);
        this.t = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.v = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.u = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public final boolean b() {
        return !TextUtils.isEmpty(getText()) && this.l.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public final void d(h hVar) {
        this.l = hVar;
        setIcon(hVar.getIcon());
        setTitle(hVar.getTitleCondensed());
        setId(hVar.a);
        setVisibility(hVar.isVisible() ? 0 : 8);
        setEnabled(hVar.isEnabled());
        if (hVar.hasSubMenu() && this.p == null) {
            this.p = new a();
        }
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.l;
    }

    public final void h() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.m);
        if (this.n != null && ((this.l.y & 4) != 4 || (!this.r && !this.s))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.m : null);
        CharSequence charSequence = this.l.q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.l.e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.l.r;
        if (TextUtils.isEmpty(charSequence2)) {
            C6051q02.a(this, z3 ? null : this.l.e);
        } else {
            C6051q02.a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        f.b bVar = this.o;
        if (bVar != null) {
            bVar.a(this.l);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.r = g();
        h();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i3 = this.u) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.t;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zIsEmpty || this.n == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.n.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.l.hasSubMenu() && (aVar = this.p) != null && aVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.s != z) {
            this.s = z;
            h hVar = this.l;
            if (hVar != null) {
                f fVar = hVar.n;
                fVar.k = true;
                fVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.n = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.v;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(f.b bVar) {
        this.o = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.u = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(b bVar) {
        this.q = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.m = charSequence;
        h();
    }
}
