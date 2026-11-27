package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: re, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6391re extends MultiAutoCompleteTextView {
    public static final int[] h = {R.attr.popupBackground};
    public final C1901Rd d;
    public final C0810De e;

    @NonNull
    public final C5762oe g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6391re(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.pexpress.tool.R.attr.autoCompleteTextViewStyle);
        TZ1.a(context);
        C7211vY1.a(this, getContext());
        WZ1 wz1E = WZ1.e(getContext(), attributeSet, h, com.pexpress.tool.R.attr.autoCompleteTextViewStyle);
        if (wz1E.b.hasValue(0)) {
            setDropDownBackgroundDrawable(wz1E.b(0));
        }
        wz1E.f();
        C1901Rd c1901Rd = new C1901Rd(this);
        this.d = c1901Rd;
        c1901Rd.d(attributeSet, com.pexpress.tool.R.attr.autoCompleteTextViewStyle);
        C0810De c0810De = new C0810De(this);
        this.e = c0810De;
        c0810De.f(attributeSet, com.pexpress.tool.R.attr.autoCompleteTextViewStyle);
        c0810De.b();
        C5762oe c5762oe = new C5762oe(this);
        this.g = c5762oe;
        c5762oe.b(attributeSet, com.pexpress.tool.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerA = c5762oe.a(keyListener);
        if (keyListenerA == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerA);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
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

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        N7.s(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.g.c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
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

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C7652xe.d(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.g.d(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.g.a(keyListener));
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

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0810De c0810De = this.e;
        if (c0810De != null) {
            c0810De.g(context, i);
        }
    }
}
