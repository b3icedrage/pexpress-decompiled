package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import defpackage.A;
import defpackage.A30;
import defpackage.AbstractC7727y;
import defpackage.BY;
import defpackage.C0564Aa;
import defpackage.C0681Bn;
import defpackage.C1952Ru;
import defpackage.C2083Tl1;
import defpackage.C2359Wy0;
import defpackage.C2463Xy0;
import defpackage.C3498e50;
import defpackage.C3522eB1;
import defpackage.C3872fs;
import defpackage.C4162hF;
import defpackage.C4257hi;
import defpackage.C4802k40;
import defpackage.C5295mP1;
import defpackage.C5345me2;
import defpackage.C5426n2;
import defpackage.C5552ne;
import defpackage.C5621ny;
import defpackage.C6333rM;
import defpackage.C6561sS;
import defpackage.C6577sX0;
import defpackage.C6590sb0;
import defpackage.C6662sv0;
import defpackage.C6997uX0;
import defpackage.C7001uY1;
import defpackage.C7013uc;
import defpackage.C7103v11;
import defpackage.C7652xe;
import defpackage.C8056za;
import defpackage.Cd2;
import defpackage.Fe2;
import defpackage.InterfaceC7807yN;
import defpackage.K42;
import defpackage.MX0;
import defpackage.NE;
import defpackage.NX0;
import defpackage.OX0;
import defpackage.R1;
import defpackage.R30;
import defpackage.RJ1;
import defpackage.SK;
import defpackage.SX1;
import defpackage.UR;
import defpackage.WX1;
import defpackage.WZ1;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {
    public static final int[][] C0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public C6590sb0 A;
    public boolean A0;
    public C6590sb0 B;
    public boolean B0;
    public ColorStateList C;
    public ColorStateList D;
    public boolean E;
    public CharSequence F;
    public boolean G;
    public NX0 H;
    public NX0 I;
    public StateListDrawable J;
    public boolean K;
    public NX0 L;
    public NX0 M;

    @NonNull
    public RJ1 N;
    public boolean O;
    public final int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public final Rect a0;
    public final Rect b0;
    public final RectF c0;

    @NonNull
    public final FrameLayout d;
    public Typeface d0;

    @NonNull
    public final C5295mP1 e;
    public ColorDrawable e0;
    public int f0;

    @NonNull
    public final com.google.android.material.textfield.a g;
    public final LinkedHashSet<g> g0;
    public EditText h;
    public ColorDrawable h0;
    public CharSequence i;
    public int i0;
    public int j;
    public Drawable j0;
    public int k;
    public ColorStateList k0;
    public int l;
    public ColorStateList l0;
    public int m;
    public int m0;
    public final C2359Wy0 n;
    public int n0;
    public boolean o;
    public int o0;
    public int p;
    public ColorStateList p0;
    public boolean q;
    public int q0;

    @NonNull
    public f r;
    public int r0;
    public AppCompatTextView s;
    public int s0;
    public int t;
    public int t0;
    public int u;
    public int u0;
    public CharSequence v;
    public boolean v0;
    public boolean w;
    public final NE w0;
    public AppCompatTextView x;
    public boolean x0;
    public ColorStateList y;
    public boolean y0;
    public int z;
    public ValueAnimator z0;

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@NonNull Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.t(!textInputLayout.B0, false);
            if (textInputLayout.o) {
                textInputLayout.n(editable);
            }
            if (textInputLayout.w) {
                textInputLayout.u(editable);
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            CheckableImageButton checkableImageButton = TextInputLayout.this.g.k;
            checkableImageButton.performClick();
            checkableImageButton.jumpDrawablesToCurrentState();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            TextInputLayout.this.h.requestLayout();
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            TextInputLayout.this.w0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class e extends R1 {
        public final TextInputLayout d;

        public e(@NonNull TextInputLayout textInputLayout) {
            this.d = textInputLayout;
        }

        @Override // defpackage.R1
        public final void d(@NonNull View view, @NonNull C5426n2 c5426n2) {
            View.AccessibilityDelegate accessibilityDelegate = this.a;
            AccessibilityNodeInfo accessibilityNodeInfo = c5426n2.a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            TextInputLayout textInputLayout = this.d;
            EditText editText = textInputLayout.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = textInputLayout.getHint();
            CharSequence error = textInputLayout.getError();
            CharSequence placeholderText = textInputLayout.getPlaceholderText();
            int counterMaxLength = textInputLayout.getCounterMaxLength();
            CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
            boolean z = textInputLayout.v0;
            boolean zIsEmpty3 = TextUtils.isEmpty(error);
            boolean z2 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String string = !zIsEmpty2 ? hint.toString() : "";
            C5295mP1 c5295mP1 = textInputLayout.e;
            AppCompatTextView appCompatTextView = c5295mP1.e;
            if (appCompatTextView.getVisibility() == 0) {
                accessibilityNodeInfo.setLabelFor(appCompatTextView);
                accessibilityNodeInfo.setTraversalAfter(appCompatTextView);
            } else {
                accessibilityNodeInfo.setTraversalAfter(c5295mP1.h);
            }
            if (!zIsEmpty) {
                c5426n2.m(text);
            } else if (!TextUtils.isEmpty(string)) {
                c5426n2.m(string);
                if (!z && placeholderText != null) {
                    c5426n2.m(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                c5426n2.m(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                int i = Build.VERSION.SDK_INT;
                if (i >= 26) {
                    c5426n2.k(string);
                } else {
                    if (!zIsEmpty) {
                        string = ((Object) text) + ", " + string;
                    }
                    c5426n2.m(string);
                }
                if (i >= 26) {
                    accessibilityNodeInfo.setShowingHintText(zIsEmpty);
                } else {
                    c5426n2.h(4, zIsEmpty);
                }
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
            if (z2) {
                if (zIsEmpty3) {
                    error = counterOverflowDescription;
                }
                accessibilityNodeInfo.setError(error);
            }
            AppCompatTextView appCompatTextView2 = textInputLayout.n.y;
            if (appCompatTextView2 != null) {
                accessibilityNodeInfo.setLabelFor(appCompatTextView2);
            }
            textInputLayout.g.b().n(c5426n2);
        }

        @Override // defpackage.R1
        public final void e(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            super.e(view, accessibilityEvent);
            this.d.g.b().o(accessibilityEvent);
        }
    }

    public interface f {
    }

    public interface g {
        void a(@NonNull TextInputLayout textInputLayout);
    }

    public interface h {
        void a();
    }

    public static class i extends AbstractC7727y {
        public static final Parcelable.Creator<i> CREATOR = new a();
        public CharSequence g;
        public boolean h;

        public class a implements Parcelable.ClassLoaderCreator<i> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public final i createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object[] newArray(int i) {
                return new i[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(@NonNull Parcel parcel) {
                return new i(parcel, null);
            }
        }

        public i(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.h = parcel.readInt() == 1;
        }

        @NonNull
        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.g) + "}";
        }

        @Override // defpackage.AbstractC7727y, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.g, parcel, i);
            parcel.writeInt(this.h ? 1 : 0);
        }
    }

    public TextInputLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(OX0.a(context, attributeSet, com.pexpress.tool.R.attr.textInputStyle, com.pexpress.tool.R.style.Widget_Design_TextInputLayout), attributeSet, com.pexpress.tool.R.attr.textInputStyle);
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = new C2359Wy0(this);
        this.r = new C0681Bn();
        this.a0 = new Rect();
        this.b0 = new Rect();
        this.c0 = new RectF();
        this.g0 = new LinkedHashSet<>();
        NE ne = new NE(this);
        this.w0 = ne;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.d = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = C7013uc.a;
        ne.Q = linearInterpolator;
        ne.h(false);
        ne.P = linearInterpolator;
        ne.h(false);
        if (ne.g != 8388659) {
            ne.g = 8388659;
            ne.h(false);
        }
        WZ1 wz1E = C7001uY1.e(context2, attributeSet, C2083Tl1.P, com.pexpress.tool.R.attr.textInputStyle, com.pexpress.tool.R.style.Widget_Design_TextInputLayout, 22, 20, 38, 43, 47);
        C5295mP1 c5295mP1 = new C5295mP1(this, wz1E);
        this.e = c5295mP1;
        TypedArray typedArray = wz1E.b;
        this.E = typedArray.getBoolean(46, true);
        setHint(typedArray.getText(4));
        this.y0 = typedArray.getBoolean(45, true);
        this.x0 = typedArray.getBoolean(40, true);
        if (typedArray.hasValue(6)) {
            setMinEms(typedArray.getInt(6, -1));
        } else if (typedArray.hasValue(3)) {
            setMinWidth(typedArray.getDimensionPixelSize(3, -1));
        }
        if (typedArray.hasValue(5)) {
            setMaxEms(typedArray.getInt(5, -1));
        } else if (typedArray.hasValue(2)) {
            setMaxWidth(typedArray.getDimensionPixelSize(2, -1));
        }
        this.N = RJ1.b(context2, attributeSet, com.pexpress.tool.R.attr.textInputStyle, com.pexpress.tool.R.style.Widget_Design_TextInputLayout).a();
        this.P = context2.getResources().getDimensionPixelOffset(com.pexpress.tool.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.R = typedArray.getDimensionPixelOffset(9, 0);
        this.T = typedArray.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.pexpress.tool.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.U = typedArray.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.pexpress.tool.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.S = this.T;
        float dimension = typedArray.getDimension(13, -1.0f);
        float dimension2 = typedArray.getDimension(12, -1.0f);
        float dimension3 = typedArray.getDimension(10, -1.0f);
        float dimension4 = typedArray.getDimension(11, -1.0f);
        RJ1.a aVarE = this.N.e();
        if (dimension >= 0.0f) {
            aVarE.e = new A(dimension);
        }
        if (dimension2 >= 0.0f) {
            aVarE.f = new A(dimension2);
        }
        if (dimension3 >= 0.0f) {
            aVarE.g = new A(dimension3);
        }
        if (dimension4 >= 0.0f) {
            aVarE.h = new A(dimension4);
        }
        this.N = aVarE.a();
        ColorStateList colorStateListA = MX0.a(context2, wz1E, 7);
        if (colorStateListA != null) {
            int defaultColor = colorStateListA.getDefaultColor();
            this.q0 = defaultColor;
            this.W = defaultColor;
            if (colorStateListA.isStateful()) {
                this.r0 = colorStateListA.getColorForState(new int[]{-16842910}, -1);
                this.s0 = colorStateListA.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.t0 = colorStateListA.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.s0 = this.q0;
                ColorStateList colorStateList = C6333rM.getColorStateList(context2, com.pexpress.tool.R.color.mtrl_filled_background_color);
                this.r0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
                this.t0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.W = 0;
            this.q0 = 0;
            this.r0 = 0;
            this.s0 = 0;
            this.t0 = 0;
        }
        if (typedArray.hasValue(1)) {
            ColorStateList colorStateListA2 = wz1E.a(1);
            this.l0 = colorStateListA2;
            this.k0 = colorStateListA2;
        }
        ColorStateList colorStateListA3 = MX0.a(context2, wz1E, 14);
        this.o0 = typedArray.getColor(14, 0);
        this.m0 = C6333rM.getColor(context2, com.pexpress.tool.R.color.mtrl_textinput_default_box_stroke_color);
        this.u0 = C6333rM.getColor(context2, com.pexpress.tool.R.color.mtrl_textinput_disabled_color);
        this.n0 = C6333rM.getColor(context2, com.pexpress.tool.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListA3 != null) {
            setBoxStrokeColorStateList(colorStateListA3);
        }
        if (typedArray.hasValue(15)) {
            setBoxStrokeErrorColor(MX0.a(context2, wz1E, 15));
        }
        if (typedArray.getResourceId(47, -1) != -1) {
            setHintTextAppearance(typedArray.getResourceId(47, 0));
        }
        int resourceId = typedArray.getResourceId(38, 0);
        CharSequence text = typedArray.getText(33);
        int i2 = typedArray.getInt(32, 1);
        boolean z = typedArray.getBoolean(34, false);
        int resourceId2 = typedArray.getResourceId(43, 0);
        boolean z2 = typedArray.getBoolean(42, false);
        CharSequence text2 = typedArray.getText(41);
        int resourceId3 = typedArray.getResourceId(55, 0);
        CharSequence text3 = typedArray.getText(54);
        boolean z3 = typedArray.getBoolean(18, false);
        setCounterMaxLength(typedArray.getInt(19, -1));
        this.u = typedArray.getResourceId(22, 0);
        this.t = typedArray.getResourceId(20, 0);
        setBoxBackgroundMode(typedArray.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i2);
        setCounterOverflowTextAppearance(this.t);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.u);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArray.hasValue(39)) {
            setErrorTextColor(wz1E.a(39));
        }
        if (typedArray.hasValue(44)) {
            setHelperTextColor(wz1E.a(44));
        }
        if (typedArray.hasValue(48)) {
            setHintTextColor(wz1E.a(48));
        }
        if (typedArray.hasValue(23)) {
            setCounterTextColor(wz1E.a(23));
        }
        if (typedArray.hasValue(21)) {
            setCounterOverflowTextColor(wz1E.a(21));
        }
        if (typedArray.hasValue(56)) {
            setPlaceholderTextColor(wz1E.a(56));
        }
        com.google.android.material.textfield.a aVar = new com.google.android.material.textfield.a(this, wz1E);
        this.g = aVar;
        boolean z4 = typedArray.getBoolean(0, true);
        wz1E.f();
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        setImportantForAccessibility(2);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26 && i3 >= 26) {
            Cd2.g.m(this, 1);
        }
        frameLayout.addView(c5295mP1);
        frameLayout.addView(aVar);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.h;
        if (!(editText instanceof AutoCompleteTextView) || C1952Ru.l(editText)) {
            return this.H;
        }
        int iH = C8056za.h(this.h, com.pexpress.tool.R.attr.colorControlHighlight);
        int i2 = this.Q;
        int[][] iArr = C0;
        if (i2 != 2) {
            if (i2 != 1) {
                return null;
            }
            NX0 nx0 = this.H;
            int i3 = this.W;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{C8056za.o(0.1f, iH, i3), i3}), nx0, nx0);
        }
        Context context = getContext();
        NX0 nx1 = this.H;
        TypedValue typedValueC = C6577sX0.c(context, com.pexpress.tool.R.attr.colorSurface, "TextInputLayout");
        int i4 = typedValueC.resourceId;
        int color = i4 != 0 ? C6333rM.getColor(context, i4) : typedValueC.data;
        NX0 nx2 = new NX0(nx1.d.a);
        int iO = C8056za.o(0.1f, iH, color);
        nx2.l(new ColorStateList(iArr, new int[]{iO, 0}));
        nx2.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iO, color});
        NX0 nx3 = new NX0(nx1.d.a);
        nx3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, nx2, nx3), nx1});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.J == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.J = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.J.addState(new int[0], f(false));
        }
        return this.J;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.I == null) {
            this.I = f(true);
        }
        return this.I;
    }

    public static void k(@NonNull ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.h != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3) {
            boolean z = editText instanceof TextInputEditText;
        }
        this.h = editText;
        int i2 = this.j;
        if (i2 != -1) {
            setMinEms(i2);
        } else {
            setMinWidth(this.l);
        }
        int i3 = this.k;
        if (i3 != -1) {
            setMaxEms(i3);
        } else {
            setMaxWidth(this.m);
        }
        this.K = false;
        i();
        setTextInputAccessibilityDelegate(new e(this));
        Typeface typeface = this.h.getTypeface();
        NE ne = this.w0;
        ne.m(typeface);
        float textSize = this.h.getTextSize();
        if (ne.h != textSize) {
            ne.h = textSize;
            ne.h(false);
        }
        float letterSpacing = this.h.getLetterSpacing();
        if (ne.W != letterSpacing) {
            ne.W = letterSpacing;
            ne.h(false);
        }
        int gravity = this.h.getGravity();
        int i4 = (gravity & (-113)) | 48;
        if (ne.g != i4) {
            ne.g = i4;
            ne.h(false);
        }
        if (ne.f != gravity) {
            ne.f = gravity;
            ne.h(false);
        }
        this.h.addTextChangedListener(new a());
        if (this.k0 == null) {
            this.k0 = this.h.getHintTextColors();
        }
        if (this.E) {
            if (TextUtils.isEmpty(this.F)) {
                CharSequence hint = this.h.getHint();
                this.i = hint;
                setHint(hint);
                this.h.setHint((CharSequence) null);
            }
            this.G = true;
        }
        if (this.s != null) {
            n(this.h.getText());
        }
        q();
        this.n.b();
        this.e.bringToFront();
        com.google.android.material.textfield.a aVar = this.g;
        aVar.bringToFront();
        Iterator<g> it = this.g0.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
        aVar.l();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        t(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.F)) {
            return;
        }
        this.F = charSequence;
        NE ne = this.w0;
        if (charSequence == null || !TextUtils.equals(ne.A, charSequence)) {
            ne.A = charSequence;
            ne.B = null;
            Bitmap bitmap = ne.E;
            if (bitmap != null) {
                bitmap.recycle();
                ne.E = null;
            }
            ne.h(false);
        }
        if (this.v0) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.w == z) {
            return;
        }
        if (z) {
            AppCompatTextView appCompatTextView = this.x;
            if (appCompatTextView != null) {
                this.d.addView(appCompatTextView);
                this.x.setVisibility(0);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.x;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setVisibility(8);
            }
            this.x = null;
        }
        this.w = z;
    }

    public final void a(float f2) {
        NE ne = this.w0;
        if (ne.b == f2) {
            return;
        }
        if (this.z0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.z0 = valueAnimator;
            valueAnimator.setInterpolator(C7103v11.d(getContext(), com.pexpress.tool.R.attr.motionEasingEmphasizedInterpolator, C7013uc.b));
            this.z0.setDuration(C7103v11.c(getContext(), com.pexpress.tool.R.attr.motionDurationMedium4, 167));
            this.z0.addUpdateListener(new d());
        }
        this.z0.setFloatValues(ne.b, f2);
        this.z0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(@NonNull View view, int i2, @NonNull ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i2, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.d;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        s();
        setEditText((EditText) view);
    }

    public final void b() {
        int i2;
        int i3;
        NX0 nx0 = this.H;
        if (nx0 == null) {
            return;
        }
        RJ1 rj1 = nx0.d.a;
        RJ1 rj2 = this.N;
        if (rj1 != rj2) {
            nx0.setShapeAppearanceModel(rj2);
        }
        if (this.Q == 2 && (i2 = this.S) > -1 && (i3 = this.V) != 0) {
            NX0 nx1 = this.H;
            nx1.d.j = i2;
            nx1.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i3);
            NX0.b bVar = nx1.d;
            if (bVar.d != colorStateListValueOf) {
                bVar.d = colorStateListValueOf;
                nx1.onStateChange(nx1.getState());
            }
        }
        int iB = this.W;
        if (this.Q == 1) {
            iB = C4162hF.b(this.W, C8056za.g(getContext(), com.pexpress.tool.R.attr.colorSurface, 0));
        }
        this.W = iB;
        this.H.l(ColorStateList.valueOf(iB));
        NX0 nx2 = this.L;
        if (nx2 != null && this.M != null) {
            if (this.S > -1 && this.V != 0) {
                nx2.l(this.h.isFocused() ? ColorStateList.valueOf(this.m0) : ColorStateList.valueOf(this.V));
                this.M.l(ColorStateList.valueOf(this.V));
            }
            invalidate();
        }
        r();
    }

    public final int c() {
        float fD;
        if (!this.E) {
            return 0;
        }
        int i2 = this.Q;
        NE ne = this.w0;
        if (i2 == 0) {
            fD = ne.d();
        } else {
            if (i2 != 2) {
                return 0;
            }
            fD = ne.d() / 2.0f;
        }
        return (int) fD;
    }

    public final C6590sb0 d() {
        C6590sb0 c6590sb0 = new C6590sb0();
        c6590sb0.g = C7103v11.c(getContext(), com.pexpress.tool.R.attr.motionDurationShort2, 87);
        c6590sb0.h = C7103v11.d(getContext(), com.pexpress.tool.R.attr.motionEasingLinearInterpolator, C7013uc.a);
        return c6590sb0;
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public final void dispatchProvideAutofillStructure(@NonNull ViewStructure viewStructure, int i2) {
        EditText editText = this.h;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
            return;
        }
        if (this.i != null) {
            boolean z = this.G;
            this.G = false;
            CharSequence hint = editText.getHint();
            this.h.setHint(this.i);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i2);
                return;
            } finally {
                this.h.setHint(hint);
                this.G = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i2);
        onProvideAutofillVirtualStructure(viewStructure, i2);
        FrameLayout frameLayout = this.d;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i3 = 0; i3 < frameLayout.getChildCount(); i3++) {
            View childAt = frameLayout.getChildAt(i3);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i3);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i2);
            if (childAt == this.h) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(@NonNull SparseArray<Parcelable> sparseArray) {
        this.B0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.B0 = false;
    }

    @Override // android.view.View
    public final void draw(@NonNull Canvas canvas) {
        NX0 nx0;
        super.draw(canvas);
        boolean z = this.E;
        NE ne = this.w0;
        if (z) {
            ne.getClass();
            int iSave = canvas.save();
            if (ne.B != null) {
                RectF rectF = ne.e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = ne.N;
                    textPaint.setTextSize(ne.G);
                    float f2 = ne.p;
                    float f3 = ne.q;
                    float f4 = ne.F;
                    if (f4 != 1.0f) {
                        canvas.scale(f4, f4, f2, f3);
                    }
                    if (ne.d0 <= 1 || ne.C) {
                        canvas.translate(f2, f3);
                        ne.Y.draw(canvas);
                    } else {
                        float lineStart = ne.p - ne.Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f3);
                        float f5 = alpha;
                        textPaint.setAlpha((int) (ne.b0 * f5));
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 31) {
                            textPaint.setShadowLayer(ne.H, ne.I, ne.J, C8056za.b(ne.K, textPaint.getAlpha()));
                        }
                        ne.Y.draw(canvas);
                        textPaint.setAlpha((int) (ne.a0 * f5));
                        if (i2 >= 31) {
                            textPaint.setShadowLayer(ne.H, ne.I, ne.J, C8056za.b(ne.K, textPaint.getAlpha()));
                        }
                        int lineBaseline = ne.Y.getLineBaseline(0);
                        CharSequence charSequence = ne.c0;
                        float f6 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f6, textPaint);
                        if (i2 >= 31) {
                            textPaint.setShadowLayer(ne.H, ne.I, ne.J, ne.K);
                        }
                        String strTrim = ne.c0.toString().trim();
                        if (strTrim.endsWith("…")) {
                            strTrim = strTrim.substring(0, strTrim.length() - 1);
                        }
                        String str = strTrim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(ne.Y.getLineEnd(0), str.length()), 0.0f, f6, (Paint) textPaint);
                        canvas = canvas;
                    }
                    canvas.restoreToCount(iSave);
                }
            }
        }
        if (this.M == null || (nx0 = this.L) == null) {
            return;
        }
        nx0.draw(canvas);
        if (this.h.isFocused()) {
            Rect bounds = this.M.getBounds();
            Rect bounds2 = this.L.getBounds();
            float f7 = ne.b;
            int iCenterX = bounds2.centerX();
            bounds.left = C7013uc.c(f7, iCenterX, bounds2.left);
            bounds.right = C7013uc.c(f7, iCenterX, bounds2.right);
            this.M.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        if (this.A0) {
            return;
        }
        this.A0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        NE ne = this.w0;
        if (ne != null) {
            ne.L = drawableState;
            ColorStateList colorStateList2 = ne.k;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = ne.j) == null || !colorStateList.isStateful())) {
                z = false;
            } else {
                ne.h(false);
                z = true;
            }
        } else {
            z = false;
        }
        if (this.h != null) {
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            t(isLaidOut() && isEnabled(), false);
        }
        q();
        w();
        if (z) {
            invalidate();
        }
        this.A0 = false;
    }

    public final boolean e() {
        return this.E && !TextUtils.isEmpty(this.F) && (this.H instanceof UR);
    }

    public final NX0 f(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.pexpress.tool.R.dimen.mtrl_shape_corner_size_small_component);
        float f2 = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.h;
        float popupElevation = editText instanceof C6997uX0 ? ((C6997uX0) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.pexpress.tool.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.pexpress.tool.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C3522eB1 c3522eB1 = new C3522eB1();
        C3522eB1 c3522eB2 = new C3522eB1();
        C3522eB1 c3522eB3 = new C3522eB1();
        C3522eB1 c3522eB4 = new C3522eB1();
        C3498e50 c3498e50 = new C3498e50();
        C3498e50 c3498e51 = new C3498e50();
        C3498e50 c3498e52 = new C3498e50();
        C3498e50 c3498e53 = new C3498e50();
        A a2 = new A(f2);
        A a3 = new A(f2);
        A a4 = new A(dimensionPixelOffset);
        A a5 = new A(dimensionPixelOffset);
        RJ1 rj1 = new RJ1();
        rj1.a = c3522eB1;
        rj1.b = c3522eB2;
        rj1.c = c3522eB3;
        rj1.d = c3522eB4;
        rj1.e = a2;
        rj1.f = a3;
        rj1.g = a5;
        rj1.h = a4;
        rj1.i = c3498e50;
        rj1.j = c3498e51;
        rj1.k = c3498e52;
        rj1.l = c3498e53;
        Context context = getContext();
        Paint paint = NX0.A;
        TypedValue typedValueC = C6577sX0.c(context, com.pexpress.tool.R.attr.colorSurface, NX0.class.getSimpleName());
        int i2 = typedValueC.resourceId;
        int color = i2 != 0 ? C6333rM.getColor(context, i2) : typedValueC.data;
        NX0 nx0 = new NX0();
        nx0.j(context);
        nx0.l(ColorStateList.valueOf(color));
        nx0.k(popupElevation);
        nx0.setShapeAppearanceModel(rj1);
        NX0.b bVar = nx0.d;
        if (bVar.g == null) {
            bVar.g = new Rect();
        }
        nx0.d.g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        nx0.invalidateSelf();
        return nx0;
    }

    public final int g(int i2, boolean z) {
        int compoundPaddingLeft = this.h.getCompoundPaddingLeft() + i2;
        if (getPrefixText() == null || z) {
            return compoundPaddingLeft;
        }
        return getPrefixTextView().getPaddingLeft() + (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.h;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    @NonNull
    public NX0 getBoxBackground() {
        int i2 = this.Q;
        if (i2 == 1 || i2 == 2) {
            return this.H;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.W;
    }

    public int getBoxBackgroundMode() {
        return this.Q;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.R;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean zC = Fe2.c(this);
        RectF rectF = this.c0;
        return zC ? this.N.h.a(rectF) : this.N.g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean zC = Fe2.c(this);
        RectF rectF = this.c0;
        return zC ? this.N.g.a(rectF) : this.N.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean zC = Fe2.c(this);
        RectF rectF = this.c0;
        return zC ? this.N.e.a(rectF) : this.N.f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean zC = Fe2.c(this);
        RectF rectF = this.c0;
        return zC ? this.N.f.a(rectF) : this.N.e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.o0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.p0;
    }

    public int getBoxStrokeWidth() {
        return this.T;
    }

    public int getBoxStrokeWidthFocused() {
        return this.U;
    }

    public int getCounterMaxLength() {
        return this.p;
    }

    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.o && this.q && (appCompatTextView = this.s) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.D;
    }

    public ColorStateList getCounterTextColor() {
        return this.C;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.k0;
    }

    public EditText getEditText() {
        return this.h;
    }

    public CharSequence getEndIconContentDescription() {
        return this.g.k.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.g.k.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.g.q;
    }

    public int getEndIconMode() {
        return this.g.m;
    }

    @NonNull
    public ImageView.ScaleType getEndIconScaleType() {
        return this.g.r;
    }

    @NonNull
    public CheckableImageButton getEndIconView() {
        return this.g.k;
    }

    public CharSequence getError() {
        C2359Wy0 c2359Wy0 = this.n;
        if (c2359Wy0.q) {
            return c2359Wy0.p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.n.t;
    }

    public CharSequence getErrorContentDescription() {
        return this.n.s;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.n.r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.g.g.getDrawable();
    }

    public CharSequence getHelperText() {
        C2359Wy0 c2359Wy0 = this.n;
        if (c2359Wy0.x) {
            return c2359Wy0.w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.n.y;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.E) {
            return this.F;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.w0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        NE ne = this.w0;
        return ne.e(ne.k);
    }

    public ColorStateList getHintTextColor() {
        return this.l0;
    }

    @NonNull
    public f getLengthCounter() {
        return this.r;
    }

    public int getMaxEms() {
        return this.k;
    }

    public int getMaxWidth() {
        return this.m;
    }

    public int getMinEms() {
        return this.j;
    }

    public int getMinWidth() {
        return this.l;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.g.k.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.g.k.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.w) {
            return this.v;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.z;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.y;
    }

    public CharSequence getPrefixText() {
        return this.e.g;
    }

    public ColorStateList getPrefixTextColor() {
        return this.e.e.getTextColors();
    }

    @NonNull
    public TextView getPrefixTextView() {
        return this.e.e;
    }

    @NonNull
    public RJ1 getShapeAppearanceModel() {
        return this.N;
    }

    public CharSequence getStartIconContentDescription() {
        return this.e.h.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.e.h.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.e.k;
    }

    @NonNull
    public ImageView.ScaleType getStartIconScaleType() {
        return this.e.l;
    }

    public CharSequence getSuffixText() {
        return this.g.t;
    }

    public ColorStateList getSuffixTextColor() {
        return this.g.u.getTextColors();
    }

    @NonNull
    public TextView getSuffixTextView() {
        return this.g.u;
    }

    public Typeface getTypeface() {
        return this.d0;
    }

    public final int h(int i2, boolean z) {
        int compoundPaddingRight = i2 - this.h.getCompoundPaddingRight();
        return (getPrefixText() == null || !z) ? compoundPaddingRight : (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight()) + compoundPaddingRight;
    }

    public final void i() {
        int i2 = this.Q;
        if (i2 == 0) {
            this.H = null;
            this.L = null;
            this.M = null;
        } else if (i2 == 1) {
            this.H = new NX0(this.N);
            this.L = new NX0();
            this.M = new NX0();
        } else {
            if (i2 != 2) {
                throw new IllegalArgumentException(SK.b(new StringBuilder(), this.Q, " is illegal; only @BoxBackgroundMode constants are supported."));
            }
            if (!this.E || (this.H instanceof UR)) {
                this.H = new NX0(this.N);
            } else {
                RJ1 rj1 = this.N;
                int i3 = UR.C;
                if (rj1 == null) {
                    rj1 = new RJ1();
                }
                UR.a aVar = new UR.a(rj1, new RectF());
                UR.b bVar = new UR.b(aVar);
                bVar.B = aVar;
                this.H = bVar;
            }
            this.L = null;
            this.M = null;
        }
        r();
        w();
        if (this.Q == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.R = getResources().getDimensionPixelSize(com.pexpress.tool.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (MX0.e(getContext())) {
                this.R = getResources().getDimensionPixelSize(com.pexpress.tool.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.h != null && this.Q == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.h;
                WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.pexpress.tool.R.dimen.material_filled_edittext_font_2_0_padding_top), this.h.getPaddingEnd(), getResources().getDimensionPixelSize(com.pexpress.tool.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (MX0.e(getContext())) {
                EditText editText2 = this.h;
                WeakHashMap<View, C5345me2> weakHashMap2 = Cd2.a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.pexpress.tool.R.dimen.material_filled_edittext_font_1_3_padding_top), this.h.getPaddingEnd(), getResources().getDimensionPixelSize(com.pexpress.tool.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.Q != 0) {
            s();
        }
        EditText editText3 = this.h;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i4 = this.Q;
                if (i4 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i4 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008d  */
    public final void j() {
        float f2;
        float f3;
        float f4;
        RectF rectF;
        float f5;
        int i2;
        float f6;
        int i3;
        if (e()) {
            int width = this.h.getWidth();
            int gravity = this.h.getGravity();
            NE ne = this.w0;
            boolean zB = ne.b(ne.A);
            ne.C = zB;
            Rect rect = ne.d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zB) {
                        i3 = rect.left;
                        f4 = i3;
                    } else {
                        f2 = rect.right;
                        f3 = ne.Z;
                    }
                } else if (zB) {
                    f2 = rect.right;
                    f3 = ne.Z;
                } else {
                    i3 = rect.left;
                    f4 = i3;
                }
                float fMax = Math.max(f4, rect.left);
                rectF = this.c0;
                rectF.left = fMax;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f5 = (width / 2.0f) + (ne.Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (ne.C) {
                        f6 = ne.Z;
                        f5 = f6 + fMax;
                    } else {
                        i2 = rect.right;
                        f5 = i2;
                    }
                } else if (ne.C) {
                    i2 = rect.right;
                    f5 = i2;
                } else {
                    f6 = ne.Z;
                    f5 = f6 + fMax;
                }
                rectF.right = Math.min(f5, rect.right);
                rectF.bottom = ne.d() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f7 = rectF.left;
                float f8 = this.P;
                rectF.left = f7 - f8;
                rectF.right += f8;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.S);
                UR ur = (UR) this.H;
                ur.getClass();
                ur.r(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f2 = width / 2.0f;
            f3 = ne.Z / 2.0f;
            f4 = f2 - f3;
            float fMax2 = Math.max(f4, rect.left);
            rectF = this.c0;
            rectF.left = fMax2;
            rectF.top = rect.top;
            if (gravity != 17) {
                f5 = (width / 2.0f) + (ne.Z / 2.0f);
            } else {
                f5 = (width / 2.0f) + (ne.Z / 2.0f);
            }
            rectF.right = Math.min(f5, rect.right);
            rectF.bottom = ne.d() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void l(@NonNull AppCompatTextView appCompatTextView, int i2) {
        try {
            appCompatTextView.setTextAppearance(i2);
            if (appCompatTextView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        appCompatTextView.setTextAppearance(com.pexpress.tool.R.style.TextAppearance_AppCompat_Caption);
        appCompatTextView.setTextColor(C6333rM.getColor(getContext(), com.pexpress.tool.R.color.design_error));
    }

    public final boolean m() {
        C2359Wy0 c2359Wy0 = this.n;
        return (c2359Wy0.o != 1 || c2359Wy0.r == null || TextUtils.isEmpty(c2359Wy0.p)) ? false : true;
    }

    public final void n(Editable editable) {
        ((C0681Bn) this.r).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.q;
        int i2 = this.p;
        String string = null;
        if (i2 == -1) {
            this.s.setText(String.valueOf(length));
            this.s.setContentDescription(null);
            this.q = false;
        } else {
            this.q = length > i2;
            Context context = getContext();
            this.s.setContentDescription(context.getString(this.q ? com.pexpress.tool.R.string.character_counter_overflowed_content_description : com.pexpress.tool.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.p)));
            if (z != this.q) {
                o();
            }
            String str = C3872fs.b;
            C3872fs c3872fs = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C3872fs.e : C3872fs.d;
            AppCompatTextView appCompatTextView = this.s;
            String string2 = getContext().getString(com.pexpress.tool.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.p));
            if (string2 == null) {
                c3872fs.getClass();
            } else {
                c3872fs.getClass();
                WX1.c cVar = WX1.a;
                string = c3872fs.c(string2).toString();
            }
            appCompatTextView.setText(string);
        }
        if (this.h == null || z == this.q) {
            return;
        }
        t(false, false);
        w();
        q();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.s;
        if (appCompatTextView != null) {
            l(appCompatTextView, this.q ? this.t : this.u);
            if (!this.q && (colorStateList2 = this.C) != null) {
                this.s.setTextColor(colorStateList2);
            }
            if (!this.q || (colorStateList = this.D) == null) {
                return;
            }
            this.s.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.w0.g(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        EditText editText = this.h;
        if (editText != null) {
            Rect rect = this.a0;
            BY.a(this, editText, rect);
            NX0 nx0 = this.L;
            if (nx0 != null) {
                int i6 = rect.bottom;
                nx0.setBounds(rect.left, i6 - this.T, rect.right, i6);
            }
            NX0 nx1 = this.M;
            if (nx1 != null) {
                int i7 = rect.bottom;
                nx1.setBounds(rect.left, i7 - this.U, rect.right, i7);
            }
            if (this.E) {
                float textSize = this.h.getTextSize();
                NE ne = this.w0;
                if (ne.h != textSize) {
                    ne.h = textSize;
                    ne.h(false);
                }
                int gravity = this.h.getGravity();
                int i8 = (gravity & (-113)) | 48;
                if (ne.g != i8) {
                    ne.g = i8;
                    ne.h(false);
                }
                if (ne.f != gravity) {
                    ne.f = gravity;
                    ne.h(false);
                }
                if (this.h == null) {
                    throw new IllegalStateException();
                }
                boolean zC = Fe2.c(this);
                int i9 = rect.bottom;
                Rect rect2 = this.b0;
                rect2.bottom = i9;
                int i10 = this.Q;
                if (i10 == 1) {
                    rect2.left = g(rect.left, zC);
                    rect2.top = rect.top + this.R;
                    rect2.right = h(rect.right, zC);
                } else if (i10 != 2) {
                    rect2.left = g(rect.left, zC);
                    rect2.top = getPaddingTop();
                    rect2.right = h(rect.right, zC);
                } else {
                    rect2.left = this.h.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - c();
                    rect2.right = rect.right - this.h.getPaddingRight();
                }
                int i11 = rect2.left;
                int i12 = rect2.top;
                int i13 = rect2.right;
                int i14 = rect2.bottom;
                Rect rect3 = ne.d;
                if (rect3.left != i11 || rect3.top != i12 || rect3.right != i13 || rect3.bottom != i14) {
                    rect3.set(i11, i12, i13, i14);
                    ne.M = true;
                }
                if (this.h == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = ne.O;
                textPaint.setTextSize(ne.h);
                textPaint.setTypeface(ne.u);
                textPaint.setLetterSpacing(ne.W);
                float f2 = -textPaint.ascent();
                rect2.left = this.h.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.Q != 1 || this.h.getMinLines() > 1) ? rect.top + this.h.getCompoundPaddingTop() : (int) (rect.centerY() - (f2 / 2.0f));
                rect2.right = rect.right - this.h.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.Q != 1 || this.h.getMinLines() > 1) ? rect.bottom - this.h.getCompoundPaddingBottom() : (int) (rect2.top + f2);
                rect2.bottom = compoundPaddingBottom;
                int i15 = rect2.left;
                int i16 = rect2.top;
                int i17 = rect2.right;
                Rect rect4 = ne.c;
                if (rect4.left != i15 || rect4.top != i16 || rect4.right != i17 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i15, i16, i17, compoundPaddingBottom);
                    ne.M = true;
                }
                ne.h(false);
                if (!e() || this.v0) {
                    return;
                }
                j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        EditText editText;
        int iMax;
        super.onMeasure(i2, i3);
        EditText editText2 = this.h;
        com.google.android.material.textfield.a aVar = this.g;
        boolean z = false;
        if (editText2 != null && this.h.getMeasuredHeight() < (iMax = Math.max(aVar.getMeasuredHeight(), this.e.getMeasuredHeight()))) {
            this.h.setMinimumHeight(iMax);
            z = true;
        }
        boolean zP = p();
        if (z || zP) {
            this.h.post(new c());
        }
        if (this.x != null && (editText = this.h) != null) {
            this.x.setGravity(editText.getGravity());
            this.x.setPadding(this.h.getCompoundPaddingLeft(), this.h.getCompoundPaddingTop(), this.h.getCompoundPaddingRight(), this.h.getCompoundPaddingBottom());
        }
        aVar.l();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.d);
        setError(iVar.g);
        if (iVar.h) {
            post(new b());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        boolean z = i2 == 1;
        if (z != this.O) {
            InterfaceC7807yN interfaceC7807yN = this.N.e;
            RectF rectF = this.c0;
            float fA = interfaceC7807yN.a(rectF);
            float fA2 = this.N.f.a(rectF);
            float fA3 = this.N.h.a(rectF);
            float fA4 = this.N.g.a(rectF);
            RJ1 rj1 = this.N;
            C6561sS c6561sS = rj1.a;
            C6561sS c6561sS2 = rj1.b;
            C6561sS c6561sS3 = rj1.d;
            C6561sS c6561sS4 = rj1.c;
            new C3522eB1();
            new C3522eB1();
            new C3522eB1();
            new C3522eB1();
            C3498e50 c3498e50 = new C3498e50();
            C3498e50 c3498e51 = new C3498e50();
            C3498e50 c3498e52 = new C3498e50();
            C3498e50 c3498e53 = new C3498e50();
            RJ1.a.b(c6561sS2);
            RJ1.a.b(c6561sS);
            RJ1.a.b(c6561sS4);
            RJ1.a.b(c6561sS3);
            A a2 = new A(fA2);
            A a3 = new A(fA);
            A a4 = new A(fA4);
            A a5 = new A(fA3);
            RJ1 rj2 = new RJ1();
            rj2.a = c6561sS2;
            rj2.b = c6561sS;
            rj2.c = c6561sS3;
            rj2.d = c6561sS4;
            rj2.e = a2;
            rj2.f = a3;
            rj2.g = a5;
            rj2.h = a4;
            rj2.i = c3498e50;
            rj2.j = c3498e51;
            rj2.k = c3498e52;
            rj2.l = c3498e53;
            this.O = z;
            setShapeAppearanceModel(rj2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        i iVar = new i(super.onSaveInstanceState());
        if (m()) {
            iVar.g = getError();
        }
        com.google.android.material.textfield.a aVar = this.g;
        iVar.h = aVar.m != 0 && aVar.k.h;
        return iVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    public final boolean p() {
        boolean z;
        if (this.h == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z2 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            C5295mP1 c5295mP1 = this.e;
            if (c5295mP1.getMeasuredWidth() > 0) {
                int measuredWidth = c5295mP1.getMeasuredWidth() - this.h.getPaddingLeft();
                if (this.e0 == null || this.f0 != measuredWidth) {
                    ColorDrawable colorDrawable = new ColorDrawable();
                    this.e0 = colorDrawable;
                    this.f0 = measuredWidth;
                    colorDrawable.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative = this.h.getCompoundDrawablesRelative();
                Drawable drawable = compoundDrawablesRelative[0];
                ColorDrawable colorDrawable2 = this.e0;
                if (drawable != colorDrawable2) {
                    this.h.setCompoundDrawablesRelative(colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    z = true;
                } else {
                    z = false;
                }
            } else if (this.e0 != null) {
                Drawable[] compoundDrawablesRelative2 = this.h.getCompoundDrawablesRelative();
                this.h.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.e0 = null;
                z = true;
            } else {
                z = false;
            }
        } else if (this.e0 != null) {
            Drawable[] compoundDrawablesRelative3 = this.h.getCompoundDrawablesRelative();
            this.h.setCompoundDrawablesRelative(null, compoundDrawablesRelative3[1], compoundDrawablesRelative3[2], compoundDrawablesRelative3[3]);
            this.e0 = null;
            z = true;
        } else {
            z = false;
        }
        com.google.android.material.textfield.a aVar = this.g;
        if ((aVar.d() || ((aVar.m != 0 && aVar.c()) || aVar.t != null)) && aVar.getMeasuredWidth() > 0) {
            int measuredWidth2 = aVar.u.getMeasuredWidth() - this.h.getPaddingRight();
            if (aVar.d()) {
                checkableImageButton = aVar.g;
            } else if (aVar.m != 0 && aVar.c()) {
                checkableImageButton = aVar.k;
            }
            if (checkableImageButton != null) {
                measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative4 = this.h.getCompoundDrawablesRelative();
            ColorDrawable colorDrawable3 = this.h0;
            if (colorDrawable3 != null && this.i0 != measuredWidth2) {
                this.i0 = measuredWidth2;
                colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                this.h.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.h0, compoundDrawablesRelative4[3]);
                return true;
            }
            if (colorDrawable3 == null) {
                ColorDrawable colorDrawable4 = new ColorDrawable();
                this.h0 = colorDrawable4;
                this.i0 = measuredWidth2;
                colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable2 = compoundDrawablesRelative4[2];
            ColorDrawable colorDrawable5 = this.h0;
            if (drawable2 != colorDrawable5) {
                this.j0 = drawable2;
                this.h.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], colorDrawable5, compoundDrawablesRelative4[3]);
                return true;
            }
        } else if (this.h0 != null) {
            Drawable[] compoundDrawablesRelative5 = this.h.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative5[2] == this.h0) {
                this.h.setCompoundDrawablesRelative(compoundDrawablesRelative5[0], compoundDrawablesRelative5[1], this.j0, compoundDrawablesRelative5[3]);
            } else {
                z2 = z;
            }
            this.h0 = null;
            return z2;
        }
        return z;
    }

    public final void q() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.h;
        if (editText == null || this.Q != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = R30.a;
        Drawable drawableMutate = background.mutate();
        if (m()) {
            drawableMutate.setColorFilter(C5552ne.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.q && (appCompatTextView = this.s) != null) {
            drawableMutate.setColorFilter(C5552ne.c(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.h.refreshDrawableState();
        }
    }

    public final void r() {
        EditText editText = this.h;
        if (editText == null || this.H == null) {
            return;
        }
        if ((this.K || editText.getBackground() == null) && this.Q != 0) {
            EditText editText2 = this.h;
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            editText2.setBackground(editTextBoxBackground);
            this.K = true;
        }
    }

    public final void s() {
        if (this.Q != 1) {
            FrameLayout frameLayout = this.d;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iC = c();
            if (iC != layoutParams.topMargin) {
                layoutParams.topMargin = iC;
                frameLayout.requestLayout();
            }
        }
    }

    public void setBoxBackgroundColor(int i2) {
        if (this.W != i2) {
            this.W = i2;
            this.q0 = i2;
            this.s0 = i2;
            this.t0 = i2;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i2) {
        setBoxBackgroundColor(C6333rM.getColor(getContext(), i2));
    }

    public void setBoxBackgroundColorStateList(@NonNull ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.q0 = defaultColor;
        this.W = defaultColor;
        this.r0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.s0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.t0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i2) {
        if (i2 == this.Q) {
            return;
        }
        this.Q = i2;
        if (this.h != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i2) {
        this.R = i2;
    }

    public void setBoxCornerFamily(int i2) {
        RJ1.a aVarE = this.N.e();
        InterfaceC7807yN interfaceC7807yN = this.N.e;
        C6561sS c6561sSE = C0564Aa.e(i2);
        aVarE.a = c6561sSE;
        RJ1.a.b(c6561sSE);
        aVarE.e = interfaceC7807yN;
        InterfaceC7807yN interfaceC7807yN2 = this.N.f;
        C6561sS c6561sSE2 = C0564Aa.e(i2);
        aVarE.b = c6561sSE2;
        RJ1.a.b(c6561sSE2);
        aVarE.f = interfaceC7807yN2;
        InterfaceC7807yN interfaceC7807yN3 = this.N.h;
        C6561sS c6561sSE3 = C0564Aa.e(i2);
        aVarE.d = c6561sSE3;
        RJ1.a.b(c6561sSE3);
        aVarE.h = interfaceC7807yN3;
        InterfaceC7807yN interfaceC7807yN4 = this.N.g;
        C6561sS c6561sSE4 = C0564Aa.e(i2);
        aVarE.c = c6561sSE4;
        RJ1.a.b(c6561sSE4);
        aVarE.g = interfaceC7807yN4;
        this.N = aVarE.a();
        b();
    }

    public void setBoxStrokeColor(int i2) {
        if (this.o0 != i2) {
            this.o0 = i2;
            w();
        }
    }

    public void setBoxStrokeColorStateList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.m0 = colorStateList.getDefaultColor();
            this.u0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.n0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.o0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.o0 != colorStateList.getDefaultColor()) {
            this.o0 = colorStateList.getDefaultColor();
        }
        w();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.p0 != colorStateList) {
            this.p0 = colorStateList;
            w();
        }
    }

    public void setBoxStrokeWidth(int i2) {
        this.T = i2;
        w();
    }

    public void setBoxStrokeWidthFocused(int i2) {
        this.U = i2;
        w();
    }

    public void setBoxStrokeWidthFocusedResource(int i2) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i2));
    }

    public void setBoxStrokeWidthResource(int i2) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i2));
    }

    public void setCounterEnabled(boolean z) {
        if (this.o != z) {
            C2359Wy0 c2359Wy0 = this.n;
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
                this.s = appCompatTextView;
                appCompatTextView.setId(com.pexpress.tool.R.id.textinput_counter);
                Typeface typeface = this.d0;
                if (typeface != null) {
                    this.s.setTypeface(typeface);
                }
                this.s.setMaxLines(1);
                c2359Wy0.a(this.s, 2);
                ((ViewGroup.MarginLayoutParams) this.s.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.pexpress.tool.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.s != null) {
                    EditText editText = this.h;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                c2359Wy0.g(this.s, 2);
                this.s = null;
            }
            this.o = z;
        }
    }

    public void setCounterMaxLength(int i2) {
        if (this.p != i2) {
            if (i2 > 0) {
                this.p = i2;
            } else {
                this.p = -1;
            }
            if (!this.o || this.s == null) {
                return;
            }
            EditText editText = this.h;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i2) {
        if (this.t != i2) {
            this.t = i2;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i2) {
        if (this.u != i2) {
            this.u = i2;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            o();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.k0 = colorStateList;
        this.l0 = colorStateList;
        if (this.h != null) {
            t(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        k(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.g.k.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.g.k.setCheckable(z);
    }

    public void setEndIconContentDescription(int i2) {
        com.google.android.material.textfield.a aVar = this.g;
        CharSequence text = i2 != 0 ? aVar.getResources().getText(i2) : null;
        CheckableImageButton checkableImageButton = aVar.k;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i2) {
        com.google.android.material.textfield.a aVar = this.g;
        Drawable drawableD = i2 != 0 ? C7652xe.d(aVar.getContext(), i2) : null;
        CheckableImageButton checkableImageButton = aVar.k;
        checkableImageButton.setImageDrawable(drawableD);
        if (drawableD != null) {
            ColorStateList colorStateList = aVar.o;
            PorterDuff.Mode mode = aVar.p;
            TextInputLayout textInputLayout = aVar.d;
            C6662sv0.a(textInputLayout, checkableImageButton, colorStateList, mode);
            C6662sv0.c(textInputLayout, checkableImageButton, aVar.o);
        }
    }

    public void setEndIconMinSize(int i2) {
        com.google.android.material.textfield.a aVar = this.g;
        if (i2 < 0) {
            aVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i2 != aVar.q) {
            aVar.q = i2;
            CheckableImageButton checkableImageButton = aVar.k;
            checkableImageButton.setMinimumWidth(i2);
            checkableImageButton.setMinimumHeight(i2);
            CheckableImageButton checkableImageButton2 = aVar.g;
            checkableImageButton2.setMinimumWidth(i2);
            checkableImageButton2.setMinimumHeight(i2);
        }
    }

    public void setEndIconMode(int i2) {
        this.g.f(i2);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        com.google.android.material.textfield.a aVar = this.g;
        View.OnLongClickListener onLongClickListener = aVar.s;
        CheckableImageButton checkableImageButton = aVar.k;
        checkableImageButton.setOnClickListener(onClickListener);
        C6662sv0.d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        com.google.android.material.textfield.a aVar = this.g;
        aVar.s = onLongClickListener;
        CheckableImageButton checkableImageButton = aVar.k;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        C6662sv0.d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        com.google.android.material.textfield.a aVar = this.g;
        aVar.r = scaleType;
        aVar.k.setScaleType(scaleType);
        aVar.g.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        com.google.android.material.textfield.a aVar = this.g;
        if (aVar.o != colorStateList) {
            aVar.o = colorStateList;
            C6662sv0.a(aVar.d, aVar.k, colorStateList, aVar.p);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        com.google.android.material.textfield.a aVar = this.g;
        if (aVar.p != mode) {
            aVar.p = mode;
            C6662sv0.a(aVar.d, aVar.k, aVar.o, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.g.g(z);
    }

    public void setError(CharSequence charSequence) {
        C2359Wy0 c2359Wy0 = this.n;
        if (!c2359Wy0.q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            c2359Wy0.f();
            return;
        }
        c2359Wy0.c();
        c2359Wy0.p = charSequence;
        c2359Wy0.r.setText(charSequence);
        int i2 = c2359Wy0.n;
        if (i2 != 1) {
            c2359Wy0.o = 1;
        }
        c2359Wy0.i(i2, c2359Wy0.h(c2359Wy0.r, charSequence), c2359Wy0.o);
    }

    public void setErrorAccessibilityLiveRegion(int i2) {
        C2359Wy0 c2359Wy0 = this.n;
        c2359Wy0.t = i2;
        AppCompatTextView appCompatTextView = c2359Wy0.r;
        if (appCompatTextView != null) {
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            appCompatTextView.setAccessibilityLiveRegion(i2);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C2359Wy0 c2359Wy0 = this.n;
        c2359Wy0.s = charSequence;
        AppCompatTextView appCompatTextView = c2359Wy0.r;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        C2359Wy0 c2359Wy0 = this.n;
        if (c2359Wy0.q == z) {
            return;
        }
        c2359Wy0.c();
        TextInputLayout textInputLayout = c2359Wy0.h;
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(c2359Wy0.g, null);
            c2359Wy0.r = appCompatTextView;
            appCompatTextView.setId(com.pexpress.tool.R.id.textinput_error);
            c2359Wy0.r.setTextAlignment(5);
            Typeface typeface = c2359Wy0.B;
            if (typeface != null) {
                c2359Wy0.r.setTypeface(typeface);
            }
            int i2 = c2359Wy0.u;
            c2359Wy0.u = i2;
            AppCompatTextView appCompatTextView2 = c2359Wy0.r;
            if (appCompatTextView2 != null) {
                textInputLayout.l(appCompatTextView2, i2);
            }
            ColorStateList colorStateList = c2359Wy0.v;
            c2359Wy0.v = colorStateList;
            AppCompatTextView appCompatTextView3 = c2359Wy0.r;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = c2359Wy0.s;
            c2359Wy0.s = charSequence;
            AppCompatTextView appCompatTextView4 = c2359Wy0.r;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            int i3 = c2359Wy0.t;
            c2359Wy0.t = i3;
            AppCompatTextView appCompatTextView5 = c2359Wy0.r;
            if (appCompatTextView5 != null) {
                WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                appCompatTextView5.setAccessibilityLiveRegion(i3);
            }
            c2359Wy0.r.setVisibility(4);
            c2359Wy0.a(c2359Wy0.r, 0);
        } else {
            c2359Wy0.f();
            c2359Wy0.g(c2359Wy0.r, 0);
            c2359Wy0.r = null;
            textInputLayout.q();
            textInputLayout.w();
        }
        c2359Wy0.q = z;
    }

    public void setErrorIconDrawable(int i2) {
        com.google.android.material.textfield.a aVar = this.g;
        aVar.h(i2 != 0 ? C7652xe.d(aVar.getContext(), i2) : null);
        C6662sv0.c(aVar.d, aVar.g, aVar.h);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        com.google.android.material.textfield.a aVar = this.g;
        CheckableImageButton checkableImageButton = aVar.g;
        View.OnLongClickListener onLongClickListener = aVar.j;
        checkableImageButton.setOnClickListener(onClickListener);
        C6662sv0.d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        com.google.android.material.textfield.a aVar = this.g;
        aVar.j = onLongClickListener;
        CheckableImageButton checkableImageButton = aVar.g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        C6662sv0.d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        com.google.android.material.textfield.a aVar = this.g;
        if (aVar.h != colorStateList) {
            aVar.h = colorStateList;
            C6662sv0.a(aVar.d, aVar.g, colorStateList, aVar.i);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        com.google.android.material.textfield.a aVar = this.g;
        if (aVar.i != mode) {
            aVar.i = mode;
            C6662sv0.a(aVar.d, aVar.g, aVar.h, mode);
        }
    }

    public void setErrorTextAppearance(int i2) {
        C2359Wy0 c2359Wy0 = this.n;
        c2359Wy0.u = i2;
        AppCompatTextView appCompatTextView = c2359Wy0.r;
        if (appCompatTextView != null) {
            c2359Wy0.h.l(appCompatTextView, i2);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C2359Wy0 c2359Wy0 = this.n;
        c2359Wy0.v = colorStateList;
        AppCompatTextView appCompatTextView = c2359Wy0.r;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.x0 != z) {
            this.x0 = z;
            t(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        C2359Wy0 c2359Wy0 = this.n;
        if (zIsEmpty) {
            if (c2359Wy0.x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!c2359Wy0.x) {
            setHelperTextEnabled(true);
        }
        c2359Wy0.c();
        c2359Wy0.w = charSequence;
        c2359Wy0.y.setText(charSequence);
        int i2 = c2359Wy0.n;
        if (i2 != 2) {
            c2359Wy0.o = 2;
        }
        c2359Wy0.i(i2, c2359Wy0.h(c2359Wy0.y, charSequence), c2359Wy0.o);
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C2359Wy0 c2359Wy0 = this.n;
        c2359Wy0.A = colorStateList;
        AppCompatTextView appCompatTextView = c2359Wy0.y;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        C2359Wy0 c2359Wy0 = this.n;
        if (c2359Wy0.x == z) {
            return;
        }
        c2359Wy0.c();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(c2359Wy0.g, null);
            c2359Wy0.y = appCompatTextView;
            appCompatTextView.setId(com.pexpress.tool.R.id.textinput_helper_text);
            c2359Wy0.y.setTextAlignment(5);
            Typeface typeface = c2359Wy0.B;
            if (typeface != null) {
                c2359Wy0.y.setTypeface(typeface);
            }
            c2359Wy0.y.setVisibility(4);
            AppCompatTextView appCompatTextView2 = c2359Wy0.y;
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            appCompatTextView2.setAccessibilityLiveRegion(1);
            int i2 = c2359Wy0.z;
            c2359Wy0.z = i2;
            AppCompatTextView appCompatTextView3 = c2359Wy0.y;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTextAppearance(i2);
            }
            ColorStateList colorStateList = c2359Wy0.A;
            c2359Wy0.A = colorStateList;
            AppCompatTextView appCompatTextView4 = c2359Wy0.y;
            if (appCompatTextView4 != null && colorStateList != null) {
                appCompatTextView4.setTextColor(colorStateList);
            }
            c2359Wy0.a(c2359Wy0.y, 1);
            c2359Wy0.y.setAccessibilityDelegate(new C2463Xy0(c2359Wy0));
        } else {
            c2359Wy0.c();
            int i3 = c2359Wy0.n;
            if (i3 == 2) {
                c2359Wy0.o = 0;
            }
            c2359Wy0.i(i3, c2359Wy0.h(c2359Wy0.y, ""), c2359Wy0.o);
            c2359Wy0.g(c2359Wy0.y, 1);
            c2359Wy0.y = null;
            TextInputLayout textInputLayout = c2359Wy0.h;
            textInputLayout.q();
            textInputLayout.w();
        }
        c2359Wy0.x = z;
    }

    public void setHelperTextTextAppearance(int i2) {
        C2359Wy0 c2359Wy0 = this.n;
        c2359Wy0.z = i2;
        AppCompatTextView appCompatTextView = c2359Wy0.y;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i2);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.E) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.y0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.E) {
            this.E = z;
            if (z) {
                CharSequence hint = this.h.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.F)) {
                        setHint(hint);
                    }
                    this.h.setHint((CharSequence) null);
                }
                this.G = true;
            } else {
                this.G = false;
                if (!TextUtils.isEmpty(this.F) && TextUtils.isEmpty(this.h.getHint())) {
                    this.h.setHint(this.F);
                }
                setHintInternal(null);
            }
            if (this.h != null) {
                s();
            }
        }
    }

    public void setHintTextAppearance(int i2) {
        NE ne = this.w0;
        TextInputLayout textInputLayout = ne.a;
        SX1 sx1 = new SX1(textInputLayout.getContext(), i2);
        ColorStateList colorStateList = sx1.j;
        if (colorStateList != null) {
            ne.k = colorStateList;
        }
        float f2 = sx1.k;
        if (f2 != 0.0f) {
            ne.i = f2;
        }
        ColorStateList colorStateList2 = sx1.a;
        if (colorStateList2 != null) {
            ne.U = colorStateList2;
        }
        ne.S = sx1.e;
        ne.T = sx1.f;
        ne.R = sx1.g;
        ne.V = sx1.i;
        C5621ny c5621ny = ne.y;
        if (c5621ny != null) {
            c5621ny.g = true;
        }
        C4257hi c4257hi = new C4257hi(ne);
        sx1.a();
        ne.y = new C5621ny(c4257hi, sx1.n);
        sx1.c(textInputLayout.getContext(), ne.y);
        ne.h(false);
        this.l0 = ne.k;
        if (this.h != null) {
            t(false, false);
            s();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.l0 != colorStateList) {
            if (this.k0 == null) {
                NE ne = this.w0;
                if (ne.k != colorStateList) {
                    ne.k = colorStateList;
                    ne.h(false);
                }
            }
            this.l0 = colorStateList;
            if (this.h != null) {
                t(false, false);
            }
        }
    }

    public void setLengthCounter(@NonNull f fVar) {
        this.r = fVar;
    }

    public void setMaxEms(int i2) {
        this.k = i2;
        EditText editText = this.h;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMaxEms(i2);
    }

    public void setMaxWidth(int i2) {
        this.m = i2;
        EditText editText = this.h;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMaxWidth(i2);
    }

    public void setMaxWidthResource(int i2) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    public void setMinEms(int i2) {
        this.j = i2;
        EditText editText = this.h;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMinEms(i2);
    }

    public void setMinWidth(int i2) {
        this.l = i2;
        EditText editText = this.h;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMinWidth(i2);
    }

    public void setMinWidthResource(int i2) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i2) {
        com.google.android.material.textfield.a aVar = this.g;
        aVar.k.setContentDescription(i2 != 0 ? aVar.getResources().getText(i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i2) {
        com.google.android.material.textfield.a aVar = this.g;
        aVar.k.setImageDrawable(i2 != 0 ? C7652xe.d(aVar.getContext(), i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        com.google.android.material.textfield.a aVar = this.g;
        if (z && aVar.m != 1) {
            aVar.f(1);
        } else if (z) {
            aVar.getClass();
        } else {
            aVar.f(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        com.google.android.material.textfield.a aVar = this.g;
        aVar.o = colorStateList;
        C6662sv0.a(aVar.d, aVar.k, colorStateList, aVar.p);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        com.google.android.material.textfield.a aVar = this.g;
        aVar.p = mode;
        C6662sv0.a(aVar.d, aVar.k, aVar.o, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.x == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
            this.x = appCompatTextView;
            appCompatTextView.setId(com.pexpress.tool.R.id.textinput_placeholder);
            AppCompatTextView appCompatTextView2 = this.x;
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            appCompatTextView2.setImportantForAccessibility(2);
            C6590sb0 c6590sb0D = d();
            this.A = c6590sb0D;
            c6590sb0D.e = 67L;
            this.B = d();
            setPlaceholderTextAppearance(this.z);
            setPlaceholderTextColor(this.y);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.w) {
                setPlaceholderTextEnabled(true);
            }
            this.v = charSequence;
        }
        EditText editText = this.h;
        u(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i2) {
        this.z = i2;
        AppCompatTextView appCompatTextView = this.x;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i2);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.y != colorStateList) {
            this.y = colorStateList;
            AppCompatTextView appCompatTextView = this.x;
            if (appCompatTextView == null || colorStateList == null) {
                return;
            }
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        C5295mP1 c5295mP1 = this.e;
        c5295mP1.getClass();
        c5295mP1.g = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c5295mP1.e.setText(charSequence);
        c5295mP1.d();
    }

    public void setPrefixTextAppearance(int i2) {
        this.e.e.setTextAppearance(i2);
    }

    public void setPrefixTextColor(@NonNull ColorStateList colorStateList) {
        this.e.e.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(@NonNull RJ1 rj1) {
        NX0 nx0 = this.H;
        if (nx0 == null || nx0.d.a == rj1) {
            return;
        }
        this.N = rj1;
        b();
    }

    public void setStartIconCheckable(boolean z) {
        this.e.h.setCheckable(z);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.e.h;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i2) {
        setStartIconDrawable(i2 != 0 ? C7652xe.d(getContext(), i2) : null);
    }

    public void setStartIconMinSize(int i2) {
        C5295mP1 c5295mP1 = this.e;
        if (i2 < 0) {
            c5295mP1.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i2 != c5295mP1.k) {
            c5295mP1.k = i2;
            CheckableImageButton checkableImageButton = c5295mP1.h;
            checkableImageButton.setMinimumWidth(i2);
            checkableImageButton.setMinimumHeight(i2);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        C5295mP1 c5295mP1 = this.e;
        View.OnLongClickListener onLongClickListener = c5295mP1.m;
        CheckableImageButton checkableImageButton = c5295mP1.h;
        checkableImageButton.setOnClickListener(onClickListener);
        C6662sv0.d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C5295mP1 c5295mP1 = this.e;
        c5295mP1.m = onLongClickListener;
        CheckableImageButton checkableImageButton = c5295mP1.h;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        C6662sv0.d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        C5295mP1 c5295mP1 = this.e;
        c5295mP1.l = scaleType;
        c5295mP1.h.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        C5295mP1 c5295mP1 = this.e;
        if (c5295mP1.i != colorStateList) {
            c5295mP1.i = colorStateList;
            C6662sv0.a(c5295mP1.d, c5295mP1.h, colorStateList, c5295mP1.j);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        C5295mP1 c5295mP1 = this.e;
        if (c5295mP1.j != mode) {
            c5295mP1.j = mode;
            C6662sv0.a(c5295mP1.d, c5295mP1.h, c5295mP1.i, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.e.b(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        com.google.android.material.textfield.a aVar = this.g;
        aVar.getClass();
        aVar.t = TextUtils.isEmpty(charSequence) ? null : charSequence;
        aVar.u.setText(charSequence);
        aVar.m();
    }

    public void setSuffixTextAppearance(int i2) {
        this.g.u.setTextAppearance(i2);
    }

    public void setSuffixTextColor(@NonNull ColorStateList colorStateList) {
        this.g.u.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.h;
        if (editText != null) {
            Cd2.l(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.d0) {
            this.d0 = typeface;
            this.w0.m(typeface);
            C2359Wy0 c2359Wy0 = this.n;
            if (typeface != c2359Wy0.B) {
                c2359Wy0.B = typeface;
                AppCompatTextView appCompatTextView = c2359Wy0.r;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = c2359Wy0.y;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.s;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public final void t(boolean z, boolean z2) {
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.h;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.h;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.k0;
        NE ne = this.w0;
        if (colorStateList2 != null) {
            ne.i(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.k0;
            ne.i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.u0) : this.u0));
        } else if (m()) {
            AppCompatTextView appCompatTextView2 = this.n.r;
            ne.i(appCompatTextView2 != null ? appCompatTextView2.getTextColors() : null);
        } else if (this.q && (appCompatTextView = this.s) != null) {
            ne.i(appCompatTextView.getTextColors());
        } else if (z4 && (colorStateList = this.l0) != null && ne.k != colorStateList) {
            ne.k = colorStateList;
            ne.h(false);
        }
        com.google.android.material.textfield.a aVar = this.g;
        C5295mP1 c5295mP1 = this.e;
        if (z3 || !this.x0 || (isEnabled() && z4)) {
            if (z2 || this.v0) {
                ValueAnimator valueAnimator = this.z0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.z0.cancel();
                }
                if (z && this.y0) {
                    a(1.0f);
                } else {
                    ne.k(1.0f);
                }
                this.v0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.h;
                u(editText3 != null ? editText3.getText() : null);
                c5295mP1.n = false;
                c5295mP1.d();
                aVar.v = false;
                aVar.m();
                return;
            }
            return;
        }
        if (z2 || !this.v0) {
            ValueAnimator valueAnimator2 = this.z0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.z0.cancel();
            }
            if (z && this.y0) {
                a(0.0f);
            } else {
                ne.k(0.0f);
            }
            if (e() && !((UR) this.H).B.r.isEmpty() && e()) {
                ((UR) this.H).r(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.v0 = true;
            AppCompatTextView appCompatTextView3 = this.x;
            if (appCompatTextView3 != null && this.w) {
                appCompatTextView3.setText((CharSequence) null);
                K42.a(this.d, this.B);
                this.x.setVisibility(4);
            }
            c5295mP1.n = true;
            c5295mP1.d();
            aVar.v = true;
            aVar.m();
        }
    }

    public final void u(Editable editable) {
        ((C0681Bn) this.r).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.d;
        if (length != 0 || this.v0) {
            AppCompatTextView appCompatTextView = this.x;
            if (appCompatTextView == null || !this.w) {
                return;
            }
            appCompatTextView.setText((CharSequence) null);
            K42.a(frameLayout, this.B);
            this.x.setVisibility(4);
            return;
        }
        if (this.x == null || !this.w || TextUtils.isEmpty(this.v)) {
            return;
        }
        this.x.setText(this.v);
        K42.a(frameLayout, this.A);
        this.x.setVisibility(0);
        this.x.bringToFront();
        announceForAccessibility(this.v);
    }

    public final void v(boolean z, boolean z2) {
        int defaultColor = this.p0.getDefaultColor();
        int colorForState = this.p0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.p0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.V = colorForState2;
        } else if (z2) {
            this.V = colorForState;
        } else {
            this.V = defaultColor;
        }
    }

    public final void w() {
        AppCompatTextView appCompatTextView;
        EditText editText;
        EditText editText2;
        if (this.H == null || this.Q == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.h) != null && editText2.hasFocus());
        boolean z3 = isHovered() || ((editText = this.h) != null && editText.isHovered());
        if (m() || (this.s != null && this.q)) {
            z = true;
        }
        if (!isEnabled()) {
            this.V = this.u0;
        } else if (m()) {
            if (this.p0 != null) {
                v(z2, z3);
            } else {
                this.V = getErrorCurrentTextColors();
            }
        } else if (!this.q || (appCompatTextView = this.s) == null) {
            if (z2) {
                this.V = this.o0;
            } else if (z3) {
                this.V = this.n0;
            } else {
                this.V = this.m0;
            }
        } else if (this.p0 != null) {
            v(z2, z3);
        } else {
            this.V = appCompatTextView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Context context = getContext();
            TypedValue typedValueA = C6577sX0.a(context, com.pexpress.tool.R.attr.colorControlActivated);
            ColorStateList colorStateListValueOf = null;
            if (typedValueA != null) {
                int i2 = typedValueA.resourceId;
                if (i2 != 0) {
                    colorStateListValueOf = C6333rM.getColorStateList(context, i2);
                } else {
                    int i3 = typedValueA.data;
                    if (i3 != 0) {
                        colorStateListValueOf = ColorStateList.valueOf(i3);
                    }
                }
            }
            EditText editText3 = this.h;
            if (editText3 != null && editText3.getTextCursorDrawable() != null && colorStateListValueOf != null) {
                Drawable textCursorDrawable = this.h.getTextCursorDrawable();
                if (z) {
                    ColorStateList colorStateListValueOf2 = this.p0;
                    if (colorStateListValueOf2 == null) {
                        colorStateListValueOf2 = ColorStateList.valueOf(this.V);
                    }
                    colorStateListValueOf = colorStateListValueOf2;
                }
                A30.a.h(textCursorDrawable, colorStateListValueOf);
            }
        }
        com.google.android.material.textfield.a aVar = this.g;
        aVar.k();
        CheckableImageButton checkableImageButton = aVar.g;
        ColorStateList colorStateList = aVar.h;
        TextInputLayout textInputLayout = aVar.d;
        C6662sv0.c(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = aVar.o;
        CheckableImageButton checkableImageButton2 = aVar.k;
        C6662sv0.c(textInputLayout, checkableImageButton2, colorStateList2);
        if (aVar.b() instanceof C4802k40) {
            if (!textInputLayout.m() || checkableImageButton2.getDrawable() == null) {
                C6662sv0.a(textInputLayout, checkableImageButton2, aVar.o, aVar.p);
            } else {
                Drawable drawableMutate = checkableImageButton2.getDrawable().mutate();
                A30.a.g(drawableMutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(drawableMutate);
            }
        }
        C5295mP1 c5295mP1 = this.e;
        C6662sv0.c(c5295mP1.d, c5295mP1.h, c5295mP1.i);
        if (this.Q == 2) {
            int i4 = this.S;
            if (z2 && isEnabled()) {
                this.S = this.U;
            } else {
                this.S = this.T;
            }
            if (this.S != i4 && e() && !this.v0) {
                if (e()) {
                    ((UR) this.H).r(0.0f, 0.0f, 0.0f, 0.0f);
                }
                j();
            }
        }
        if (this.Q == 1) {
            if (!isEnabled()) {
                this.W = this.r0;
            } else if (z3 && !z2) {
                this.W = this.t0;
            } else if (z2) {
                this.W = this.s0;
            } else {
                this.W = this.q0;
            }
        }
        b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.e.a(drawable);
    }

    public void setHint(int i2) {
        setHint(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setStartIconContentDescription(int i2) {
        setStartIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.g.k.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.g.k.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.g.h(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.g.k;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        com.google.android.material.textfield.a aVar = this.g;
        CheckableImageButton checkableImageButton = aVar.k;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = aVar.o;
            PorterDuff.Mode mode = aVar.p;
            TextInputLayout textInputLayout = aVar.d;
            C6662sv0.a(textInputLayout, checkableImageButton, colorStateList, mode);
            C6662sv0.c(textInputLayout, checkableImageButton, aVar.o);
        }
    }
}
