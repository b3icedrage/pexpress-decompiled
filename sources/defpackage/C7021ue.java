package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.annotation.NonNull;
import com.pexpress.tool.R;

/* JADX INFO: renamed from: ue, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7021ue extends RadioButton implements XZ1 {
    public final C2399Xd d;
    public final C1901Rd e;
    public final C0810De g;
    public C5972pe h;

    public C7021ue(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @NonNull
    private C5972pe getEmojiTextViewHelper() {
        if (this.h == null) {
            this.h = new C5972pe(this);
        }
        return this.h;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1901Rd c1901Rd = this.e;
        if (c1901Rd != null) {
            c1901Rd.a();
        }
        C0810De c0810De = this.g;
        if (c0810De != null) {
            c0810De.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C2399Xd c2399Xd = this.d;
        if (c2399Xd != null) {
            c2399Xd.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1901Rd c1901Rd = this.e;
        if (c1901Rd != null) {
            return c1901Rd.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1901Rd c1901Rd = this.e;
        if (c1901Rd != null) {
            return c1901Rd.c();
        }
        return null;
    }

    @Override // defpackage.XZ1
    public ColorStateList getSupportButtonTintList() {
        C2399Xd c2399Xd = this.d;
        if (c2399Xd != null) {
            return c2399Xd.b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C2399Xd c2399Xd = this.d;
        if (c2399Xd != null) {
            return c2399Xd.c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.g.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.g.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1901Rd c1901Rd = this.e;
        if (c1901Rd != null) {
            c1901Rd.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1901Rd c1901Rd = this.e;
        if (c1901Rd != null) {
            c1901Rd.f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C2399Xd c2399Xd = this.d;
        if (c2399Xd != null) {
            if (c2399Xd.f) {
                c2399Xd.f = false;
            } else {
                c2399Xd.f = true;
                c2399Xd.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0810De c0810De = this.g;
        if (c0810De != null) {
            c0810De.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0810De c0810De = this.g;
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
        C1901Rd c1901Rd = this.e;
        if (c1901Rd != null) {
            c1901Rd.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1901Rd c1901Rd = this.e;
        if (c1901Rd != null) {
            c1901Rd.i(mode);
        }
    }

    @Override // defpackage.XZ1
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C2399Xd c2399Xd = this.d;
        if (c2399Xd != null) {
            c2399Xd.b = colorStateList;
            c2399Xd.d = true;
            c2399Xd.a();
        }
    }

    @Override // defpackage.XZ1
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C2399Xd c2399Xd = this.d;
        if (c2399Xd != null) {
            c2399Xd.c = mode;
            c2399Xd.e = true;
            c2399Xd.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0810De c0810De = this.g;
        c0810De.l(colorStateList);
        c0810De.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0810De c0810De = this.g;
        c0810De.m(mode);
        c0810De.b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7021ue(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        TZ1.a(context);
        C7211vY1.a(this, getContext());
        C2399Xd c2399Xd = new C2399Xd(this);
        this.d = c2399Xd;
        c2399Xd.b(attributeSet, R.attr.radioButtonStyle);
        C1901Rd c1901Rd = new C1901Rd(this);
        this.e = c1901Rd;
        c1901Rd.d(attributeSet, R.attr.radioButtonStyle);
        C0810De c0810De = new C0810De(this);
        this.g = c0810De;
        c0810De.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.radioButtonStyle);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(C7652xe.d(getContext(), i));
    }
}
