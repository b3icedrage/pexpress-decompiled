package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.pexpress.tool.R;
import defpackage.C0650Bc1;
import defpackage.C4802k40;
import defpackage.C5086lR;
import defpackage.C5345me2;
import defpackage.C5952pY1;
import defpackage.C6662sv0;
import defpackage.C7567xD;
import defpackage.C7652xe;
import defpackage.C8100zl;
import defpackage.Cd2;
import defpackage.EK;
import defpackage.Fe2;
import defpackage.K60;
import defpackage.MX0;
import defpackage.R41;
import defpackage.S1;
import defpackage.WZ1;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
public final class a extends LinearLayout {
    public final TextInputLayout d;

    @NonNull
    public final FrameLayout e;

    @NonNull
    public final CheckableImageButton g;
    public ColorStateList h;
    public PorterDuff.Mode i;
    public View.OnLongClickListener j;

    @NonNull
    public final CheckableImageButton k;
    public final d l;
    public int m;
    public final LinkedHashSet<TextInputLayout.h> n;
    public ColorStateList o;
    public PorterDuff.Mode p;
    public int q;

    @NonNull
    public ImageView.ScaleType r;
    public View.OnLongClickListener s;
    public CharSequence t;

    @NonNull
    public final AppCompatTextView u;
    public boolean v;
    public EditText w;
    public final AccessibilityManager x;
    public C8100zl y;
    public final C0315a z;

    /* JADX INFO: renamed from: com.google.android.material.textfield.a$a, reason: collision with other inner class name */
    public class C0315a extends C5952pY1 {
        public C0315a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            a.this.b().a();
        }

        @Override // defpackage.C5952pY1, android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            a.this.b().b();
        }
    }

    public class b implements TextInputLayout.g {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public final void a(@NonNull TextInputLayout textInputLayout) {
            a aVar = a.this;
            if (aVar.w == textInputLayout.getEditText()) {
                return;
            }
            EditText editText = aVar.w;
            C0315a c0315a = aVar.z;
            if (editText != null) {
                editText.removeTextChangedListener(c0315a);
                if (aVar.w.getOnFocusChangeListener() == aVar.b().e()) {
                    aVar.w.setOnFocusChangeListener(null);
                }
            }
            EditText editText2 = textInputLayout.getEditText();
            aVar.w = editText2;
            if (editText2 != null) {
                editText2.addTextChangedListener(c0315a);
            }
            aVar.b().m(aVar.w);
            aVar.i(aVar.b());
        }
    }

    public class c implements View.OnAttachStateChangeListener {
        public c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            AccessibilityManager accessibilityManager;
            a aVar = a.this;
            if (aVar.y == null || (accessibilityManager = aVar.x) == null) {
                return;
            }
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            if (aVar.isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new S1(aVar.y));
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            AccessibilityManager accessibilityManager;
            a aVar = a.this;
            C8100zl c8100zl = aVar.y;
            if (c8100zl == null || (accessibilityManager = aVar.x) == null) {
                return;
            }
            accessibilityManager.removeTouchExplorationStateChangeListener(new S1(c8100zl));
        }
    }

    public static class d {
        public final SparseArray<K60> a = new SparseArray<>();
        public final a b;
        public final int c;
        public final int d;

        public d(a aVar, WZ1 wz1) {
            this.b = aVar;
            TypedArray typedArray = wz1.b;
            this.c = typedArray.getResourceId(26, 0);
            this.d = typedArray.getResourceId(50, 0);
        }
    }

    public a(TextInputLayout textInputLayout, WZ1 wz1) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.m = 0;
        this.n = new LinkedHashSet<>();
        this.z = new C0315a();
        b bVar = new b();
        this.x = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.d = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.e = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.g = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.k = checkableImageButtonA2;
        this.l = new d(this, wz1);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.u = appCompatTextView;
        TypedArray typedArray = wz1.b;
        if (typedArray.hasValue(36)) {
            this.h = MX0.a(getContext(), wz1, 36);
        }
        if (typedArray.hasValue(37)) {
            this.i = Fe2.d(typedArray.getInt(37, -1), null);
        }
        if (typedArray.hasValue(35)) {
            h(wz1.b(35));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        checkableImageButtonA.setImportantForAccessibility(2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setFocusable(false);
        if (!typedArray.hasValue(51)) {
            if (typedArray.hasValue(30)) {
                this.o = MX0.a(getContext(), wz1, 30);
            }
            if (typedArray.hasValue(31)) {
                this.p = Fe2.d(typedArray.getInt(31, -1), null);
            }
        }
        if (typedArray.hasValue(28)) {
            f(typedArray.getInt(28, 0));
            if (typedArray.hasValue(25) && checkableImageButtonA2.getContentDescription() != (text = typedArray.getText(25))) {
                checkableImageButtonA2.setContentDescription(text);
            }
            checkableImageButtonA2.setCheckable(typedArray.getBoolean(24, true));
        } else if (typedArray.hasValue(51)) {
            if (typedArray.hasValue(52)) {
                this.o = MX0.a(getContext(), wz1, 52);
            }
            if (typedArray.hasValue(53)) {
                this.p = Fe2.d(typedArray.getInt(53, -1), null);
            }
            f(typedArray.getBoolean(51, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(49);
            if (checkableImageButtonA2.getContentDescription() != text2) {
                checkableImageButtonA2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(27, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.q) {
            this.q = dimensionPixelSize;
            checkableImageButtonA2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonA.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(29)) {
            ImageView.ScaleType scaleTypeB = C6662sv0.b(typedArray.getInt(29, -1));
            this.r = scaleTypeB;
            checkableImageButtonA2.setScaleType(scaleTypeB);
            checkableImageButtonA.setScaleType(scaleTypeB);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray.getResourceId(70, 0));
        if (typedArray.hasValue(71)) {
            appCompatTextView.setTextColor(wz1.a(71));
        }
        CharSequence text3 = typedArray.getText(69);
        this.t = TextUtils.isEmpty(text3) ? null : text3;
        appCompatTextView.setText(text3);
        m();
        frameLayout.addView(checkableImageButtonA2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonA);
        textInputLayout.g0.add(bVar);
        if (textInputLayout.h != null) {
            bVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new c());
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (MX0.e(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final K60 b() {
        K60 c5086lR;
        int i = this.m;
        d dVar = this.l;
        SparseArray<K60> sparseArray = dVar.a;
        K60 k60 = sparseArray.get(i);
        if (k60 != null) {
            return k60;
        }
        a aVar = dVar.b;
        if (i == -1) {
            c5086lR = new C5086lR(aVar);
        } else if (i == 0) {
            c5086lR = new R41(aVar);
        } else if (i == 1) {
            c5086lR = new C0650Bc1(aVar, dVar.d);
        } else if (i == 2) {
            c5086lR = new C7567xD(aVar);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(EK.e(i, "Invalid end icon mode: "));
            }
            c5086lR = new C4802k40(aVar);
        }
        sparseArray.append(i, c5086lR);
        return c5086lR;
    }

    public final boolean c() {
        return this.e.getVisibility() == 0 && this.k.getVisibility() == 0;
    }

    public final boolean d() {
        return this.g.getVisibility() == 0;
    }

    public final void e(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean z3;
        K60 k60B = b();
        boolean zK = k60B.k();
        CheckableImageButton checkableImageButton = this.k;
        boolean z4 = true;
        if (!zK || (z3 = checkableImageButton.h) == k60B.l()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(k60B instanceof C4802k40) || (zIsActivated = checkableImageButton.isActivated()) == k60B.j()) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            C6662sv0.c(this.d, checkableImageButton, this.o);
        }
    }

    public final void f(int i) {
        if (this.m == i) {
            return;
        }
        K60 k60B = b();
        C8100zl c8100zl = this.y;
        AccessibilityManager accessibilityManager = this.x;
        if (c8100zl != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new S1(c8100zl));
        }
        this.y = null;
        k60B.s();
        this.m = i;
        Iterator<TextInputLayout.h> it = this.n.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        g(i != 0);
        K60 k60B2 = b();
        int iD = this.l.c;
        if (iD == 0) {
            iD = k60B2.d();
        }
        Drawable drawableD = iD != 0 ? C7652xe.d(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.k;
        checkableImageButton.setImageDrawable(drawableD);
        TextInputLayout textInputLayout = this.d;
        if (drawableD != null) {
            C6662sv0.a(textInputLayout, checkableImageButton, this.o, this.p);
            C6662sv0.c(textInputLayout, checkableImageButton, this.o);
        }
        int iC = k60B2.c();
        CharSequence text = iC != 0 ? getResources().getText(iC) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(k60B2.k());
        if (!k60B2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        k60B2.r();
        C8100zl c8100zlH = k60B2.h();
        this.y = c8100zlH;
        if (c8100zlH != null && accessibilityManager != null) {
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new S1(this.y));
            }
        }
        View.OnClickListener onClickListenerF = k60B2.f();
        View.OnLongClickListener onLongClickListener = this.s;
        checkableImageButton.setOnClickListener(onClickListenerF);
        C6662sv0.d(checkableImageButton, onLongClickListener);
        EditText editText = this.w;
        if (editText != null) {
            k60B2.m(editText);
            i(k60B2);
        }
        C6662sv0.a(textInputLayout, checkableImageButton, this.o, this.p);
        e(true);
    }

    public final void g(boolean z) {
        if (c() != z) {
            this.k.setVisibility(z ? 0 : 8);
            j();
            l();
            this.d.p();
        }
    }

    public final void h(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.g;
        checkableImageButton.setImageDrawable(drawable);
        k();
        C6662sv0.a(this.d, checkableImageButton, this.h, this.i);
    }

    public final void i(K60 k60) {
        if (this.w == null) {
            return;
        }
        if (k60.e() != null) {
            this.w.setOnFocusChangeListener(k60.e());
        }
        if (k60.g() != null) {
            this.k.setOnFocusChangeListener(k60.g());
        }
    }

    public final void j() {
        this.e.setVisibility((this.k.getVisibility() != 0 || d()) ? 8 : 0);
        setVisibility((c() || d() || ((this.t == null || this.v) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    public final void k() {
        CheckableImageButton checkableImageButton = this.g;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.d;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.n.q && textInputLayout.m()) ? 0 : 8);
        j();
        l();
        if (this.m != 0) {
            return;
        }
        textInputLayout.p();
    }

    public final void l() {
        int paddingEnd;
        TextInputLayout textInputLayout = this.d;
        if (textInputLayout.h == null) {
            return;
        }
        if (c() || d()) {
            paddingEnd = 0;
        } else {
            EditText editText = textInputLayout.h;
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            paddingEnd = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.h.getPaddingTop();
        int paddingBottom = textInputLayout.h.getPaddingBottom();
        WeakHashMap<View, C5345me2> weakHashMap2 = Cd2.a;
        this.u.setPaddingRelative(dimensionPixelSize, paddingTop, paddingEnd, paddingBottom);
    }

    public final void m() {
        AppCompatTextView appCompatTextView = this.u;
        int visibility = appCompatTextView.getVisibility();
        int i = (this.t == null || this.v) ? 8 : 0;
        if (visibility != i) {
            b().p(i == 0);
        }
        j();
        appCompatTextView.setVisibility(i);
        this.d.p();
    }
}
