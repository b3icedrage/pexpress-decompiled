package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: Ie, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1200Ie extends ToggleButton {
    public final C1901Rd d;
    public final C0810De e;
    public C5972pe g;

    public C1200Ie(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        C7211vY1.a(this, getContext());
        C1901Rd c1901Rd = new C1901Rd(this);
        this.d = c1901Rd;
        c1901Rd.d(attributeSet, R.attr.buttonStyleToggle);
        C0810De c0810De = new C0810De(this);
        this.e = c0810De;
        c0810De.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.buttonStyleToggle);
    }

    @NonNull
    private C5972pe getEmojiTextViewHelper() {
        if (this.g == null) {
            this.g = new C5972pe(this);
        }
        return this.g;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1901Rd c1901Rd = this.d;
        if (c1901Rd != null) {
            c1901Rd.a();
        }
        C0810De c0810De = this.e;
        if (c0810De != null) {
            c0810De.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1901Rd c1901Rd = this.d;
        if (c1901Rd != null) {
            return c1901Rd.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1901Rd c1901Rd = this.d;
        if (c1901Rd != null) {
            return c1901Rd.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.e.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.e.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1901Rd c1901Rd = this.d;
        if (c1901Rd != null) {
            c1901Rd.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1901Rd c1901Rd = this.d;
        if (c1901Rd != null) {
            c1901Rd.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0810De c0810De = this.e;
        if (c0810De != null) {
            c0810De.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0810De c0810De = this.e;
        if (c0810De != null) {
            c0810De.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1901Rd c1901Rd = this.d;
        if (c1901Rd != null) {
            c1901Rd.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1901Rd c1901Rd = this.d;
        if (c1901Rd != null) {
            c1901Rd.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0810De c0810De = this.e;
        c0810De.l(colorStateList);
        c0810De.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0810De c0810De = this.e;
        c0810De.m(mode);
        c0810De.b();
    }
}
