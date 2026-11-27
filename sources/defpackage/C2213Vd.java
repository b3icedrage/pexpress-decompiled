package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;
import com.pexpress.tool.R;

/* JADX INFO: renamed from: Vd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2213Vd extends CheckedTextView {
    public final C2295Wd d;
    public final C1901Rd e;
    public final C0810De g;

    @NonNull
    public C5972pe h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2213Vd(@NonNull Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        TZ1.a(context);
        C7211vY1.a(this, getContext());
        C0810De c0810De = new C0810De(this);
        this.g = c0810De;
        c0810De.f(attributeSet, R.attr.checkedTextViewStyle);
        c0810De.b();
        C1901Rd c1901Rd = new C1901Rd(this);
        this.e = c1901Rd;
        c1901Rd.d(attributeSet, R.attr.checkedTextViewStyle);
        this.d = new C2295Wd(this);
        Context context2 = getContext();
        int[] iArr = C3855fm1.l;
        WZ1 wz1E = WZ1.e(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = wz1E.b;
        Cd2.k(this, getContext(), iArr, attributeSet, wz1E.b, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(C7652xe.d(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(C7652xe.d(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(C7652xe.d(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(wz1E.a(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(R30.c(typedArray.getInt(3, -1), null));
            }
            wz1E.f();
            getEmojiTextViewHelper().b(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            wz1E.f();
            throw th;
        }
    }

    @NonNull
    private C5972pe getEmojiTextViewHelper() {
        if (this.h == null) {
            this.h = new C5972pe(this);
        }
        return this.h;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0810De c0810De = this.g;
        if (c0810De != null) {
            c0810De.b();
        }
        C1901Rd c1901Rd = this.e;
        if (c1901Rd != null) {
            c1901Rd.a();
        }
        C2295Wd c2295Wd = this.d;
        if (c2295Wd != null) {
            c2295Wd.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C4899kY1.e(super.getCustomSelectionActionModeCallback());
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

    public ColorStateList getSupportCheckMarkTintList() {
        C2295Wd c2295Wd = this.d;
        if (c2295Wd != null) {
            return c2295Wd.b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C2295Wd c2295Wd = this.d;
        if (c2295Wd != null) {
            return c2295Wd.c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.g.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.g.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(@NonNull EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        N7.s(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
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

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C2295Wd c2295Wd = this.d;
        if (c2295Wd != null) {
            if (c2295Wd.f) {
                c2295Wd.f = false;
            } else {
                c2295Wd.f = true;
                c2295Wd.a();
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C4899kY1.f(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
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

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C2295Wd c2295Wd = this.d;
        if (c2295Wd != null) {
            c2295Wd.b = colorStateList;
            c2295Wd.d = true;
            c2295Wd.a();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C2295Wd c2295Wd = this.d;
        if (c2295Wd != null) {
            c2295Wd.c = mode;
            c2295Wd.e = true;
            c2295Wd.a();
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

    @Override // android.widget.TextView
    public final void setTextAppearance(@NonNull Context context, int i) {
        super.setTextAppearance(context, i);
        C0810De c0810De = this.g;
        if (c0810De != null) {
            c0810De.g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C7652xe.d(getContext(), i));
    }
}
