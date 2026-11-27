package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.NonNull;
import defpackage.C0732Ce;
import defpackage.C0810De;
import defpackage.C0966Fe;
import defpackage.C1901Rd;
import defpackage.C2563Zf1;
import defpackage.C4606j72;
import defpackage.C4899kY1;
import defpackage.C5869p72;
import defpackage.C5972pe;
import defpackage.C7211vY1;
import defpackage.C7652xe;
import defpackage.Je2;
import defpackage.N7;
import defpackage.TZ1;
import defpackage.U0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatTextView extends TextView {
    public final C1901Rd d;
    public final C0810De e;
    public final C0732Ce g;

    @NonNull
    public C5972pe h;
    public boolean i;
    public b j;
    public Future<C2563Zf1> k;

    public interface a {
        void a(int i);

        void b(int i);
    }

    public class b implements a {
        public b() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void a(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void b(int i) {
        }
    }

    public class c extends b {
        public c() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public final void a(int i) {
            AppCompatTextView.super.setLastBaselineToBottomHeight(i);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public final void b(int i) {
            AppCompatTextView.super.setFirstBaselineToTopHeight(i);
        }
    }

    public AppCompatTextView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @NonNull
    private C5972pe getEmojiTextViewHelper() {
        if (this.h == null) {
            this.h = new C5972pe(this);
        }
        return this.h;
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

    public final void f() {
        Future<C2563Zf1> future = this.k;
        if (future != null) {
            try {
                this.k = null;
                C4899kY1.d(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public a getSuperCaller() {
        if (this.j == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                this.j = new c();
            } else if (i >= 26) {
                this.j = new b();
            }
        }
        return this.j;
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
    public CharSequence getText() {
        f();
        return super.getText();
    }

    @Override // android.widget.TextView
    @NonNull
    public TextClassifier getTextClassifier() {
        C0732Ce c0732Ce;
        if (Build.VERSION.SDK_INT >= 28 || (c0732Ce = this.g) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = c0732Ce.b;
        return textClassifier == null ? C0732Ce.a.a(c0732Ce.a) : textClassifier;
    }

    @NonNull
    public C2563Zf1.a getTextMetricsParamsCompat() {
        return C4899kY1.a(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.e.getClass();
        C0810De.h(editorInfo, inputConnectionOnCreateInputConnection, this);
        N7.s(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
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

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        f();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
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

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0810De c0810De = this.e;
        if (c0810De != null) {
            c0810De.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0810De c0810De = this.e;
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

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i);
        } else {
            C4899kY1.b(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().a(i);
        } else {
            C4899kY1.c(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        U0.e(i);
        int fontMetricsInt = getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    public void setPrecomputedText(@NonNull C2563Zf1 c2563Zf1) {
        C4899kY1.d(this, c2563Zf1);
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
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0810De c0810De = this.e;
        if (c0810De != null) {
            c0810De.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0732Ce c0732Ce;
        if (Build.VERSION.SDK_INT >= 28 || (c0732Ce = this.g) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0732Ce.b = textClassifier;
        }
    }

    public void setTextFuture(Future<C2563Zf1> future) {
        this.k = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@NonNull C2563Zf1.a aVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = aVar.b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(aVar.a);
        C4899kY1.a.e(this, aVar.c);
        C4899kY1.a.h(this, aVar.d);
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

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.i) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            C5869p72 c5869p72 = C4606j72.a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.i = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.i = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TZ1.a(context);
        this.i = false;
        this.j = null;
        C7211vY1.a(this, getContext());
        C1901Rd c1901Rd = new C1901Rd(this);
        this.d = c1901Rd;
        c1901Rd.d(attributeSet, i);
        C0810De c0810De = new C0810De(this);
        this.e = c0810De;
        c0810De.f(attributeSet, i);
        c0810De.b();
        C0732Ce c0732Ce = new C0732Ce();
        c0732Ce.a = this;
        this.g = c0732Ce;
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? C7652xe.d(context, i) : null, i2 != 0 ? C7652xe.d(context, i2) : null, i3 != 0 ? C7652xe.d(context, i3) : null, i4 != 0 ? C7652xe.d(context, i4) : null);
        C0810De c0810De = this.e;
        if (c0810De != null) {
            c0810De.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? C7652xe.d(context, i) : null, i2 != 0 ? C7652xe.d(context, i2) : null, i3 != 0 ? C7652xe.d(context, i3) : null, i4 != 0 ? C7652xe.d(context, i4) : null);
        C0810De c0810De = this.e;
        if (c0810De != null) {
            c0810De.b();
        }
    }
}
