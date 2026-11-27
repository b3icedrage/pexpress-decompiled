package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.annotation.NonNull;
import com.pexpress.tool.R;

/* JADX INFO: renamed from: Sd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1979Sd extends Button {
    public final C1901Rd d;
    public final C0810De e;

    @NonNull
    public C5972pe g;

    public C1979Sd(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    @NonNull
    private C5972pe getEmojiTextViewHelper() {
        if (this.g == null) {
            this.g = new C5972pe(this);
        }
        return this.g;
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

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (Je2.b) {
            return super.getAutoSizeMaxTextSize();
        }
        C0810De c0810De = this.e;
        if (c0810De != null) {
            return Math.round(c0810De.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (Je2.b) {
            return super.getAutoSizeMinTextSize();
        }
        C0810De c0810De = this.e;
        if (c0810De != null) {
            return Math.round(c0810De.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (Je2.b) {
            return super.getAutoSizeStepGranularity();
        }
        C0810De c0810De = this.e;
        if (c0810De != null) {
            return Math.round(c0810De.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (Je2.b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0810De c0810De = this.e;
        return c0810De != null ? c0810De.i.f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (Je2.b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0810De c0810De = this.e;
        if (c0810De != null) {
            return c0810De.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C4899kY1.e(super.getCustomSelectionActionModeCallback());
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

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0810De c0810De = this.e;
        if (c0810De == null || Je2.b) {
            return;
        }
        c0810De.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0810De c0810De = this.e;
        if (c0810De == null || Je2.b) {
            return;
        }
        C0966Fe c0966Fe = c0810De.i;
        if (c0966Fe.f()) {
            c0966Fe.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (Je2.b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0810De c0810De = this.e;
        if (c0810De != null) {
            c0810De.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i) {
        if (Je2.b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0810De c0810De = this.e;
        if (c0810De != null) {
            c0810De.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (Je2.b) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0810De c0810De = this.e;
        if (c0810De != null) {
            c0810De.k(i);
        }
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
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C4899kY1.f(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        C0810De c0810De = this.e;
        if (c0810De != null) {
            c0810De.a.setAllCaps(z);
        }
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

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = Je2.b;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        C0810De c0810De = this.e;
        if (c0810De == null || z) {
            return;
        }
        C0966Fe c0966Fe = c0810De.i;
        if (c0966Fe.f()) {
            return;
        }
        c0966Fe.g(i, f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1979Sd(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TZ1.a(context);
        C7211vY1.a(this, getContext());
        C1901Rd c1901Rd = new C1901Rd(this);
        this.d = c1901Rd;
        c1901Rd.d(attributeSet, i);
        C0810De c0810De = new C0810De(this);
        this.e = c0810De;
        c0810De.f(attributeSet, i);
        c0810De.b();
        getEmojiTextViewHelper().b(attributeSet, i);
    }
}
