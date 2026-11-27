package defpackage;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.pexpress.tool.R;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: mP1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
public final class C5295mP1 extends LinearLayout {
    public final TextInputLayout d;
    public final AppCompatTextView e;
    public CharSequence g;
    public final CheckableImageButton h;
    public ColorStateList i;
    public PorterDuff.Mode j;
    public int k;

    @NonNull
    public ImageView.ScaleType l;
    public View.OnLongClickListener m;
    public boolean n;

    public C5295mP1(TextInputLayout textInputLayout, WZ1 wz1) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.d = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.h = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.e = appCompatTextView;
        if (MX0.e(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.m;
        checkableImageButton.setOnClickListener(null);
        C6662sv0.d(checkableImageButton, onLongClickListener);
        this.m = null;
        checkableImageButton.setOnLongClickListener(null);
        C6662sv0.d(checkableImageButton, null);
        TypedArray typedArray = wz1.b;
        if (typedArray.hasValue(67)) {
            this.i = MX0.a(getContext(), wz1, 67);
        }
        if (typedArray.hasValue(68)) {
            this.j = Fe2.d(typedArray.getInt(68, -1), null);
        }
        if (typedArray.hasValue(64)) {
            a(wz1.b(64));
            if (typedArray.hasValue(63) && checkableImageButton.getContentDescription() != (text = typedArray.getText(63))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(62, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(65, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.k) {
            this.k = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(66)) {
            ImageView.ScaleType scaleTypeB = C6662sv0.b(typedArray.getInt(66, -1));
            this.l = scaleTypeB;
            checkableImageButton.setScaleType(scaleTypeB);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray.getResourceId(58, 0));
        if (typedArray.hasValue(59)) {
            appCompatTextView.setTextColor(wz1.a(59));
        }
        CharSequence text2 = typedArray.getText(57);
        this.g = TextUtils.isEmpty(text2) ? null : text2;
        appCompatTextView.setText(text2);
        d();
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    public final void a(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.h;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.i;
            PorterDuff.Mode mode = this.j;
            TextInputLayout textInputLayout = this.d;
            C6662sv0.a(textInputLayout, checkableImageButton, colorStateList, mode);
            b(true);
            C6662sv0.c(textInputLayout, checkableImageButton, this.i);
            return;
        }
        b(false);
        View.OnLongClickListener onLongClickListener = this.m;
        checkableImageButton.setOnClickListener(null);
        C6662sv0.d(checkableImageButton, onLongClickListener);
        this.m = null;
        checkableImageButton.setOnLongClickListener(null);
        C6662sv0.d(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void b(boolean z) {
        CheckableImageButton checkableImageButton = this.h;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            checkableImageButton.setVisibility(z ? 0 : 8);
            c();
            d();
        }
    }

    public final void c() {
        int paddingStart;
        EditText editText = this.d.h;
        if (editText == null) {
            return;
        }
        if (this.h.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap<View, C5345me2> weakHashMap2 = Cd2.a;
        this.e.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void d() {
        int i = (this.g == null || this.n) ? 8 : 0;
        setVisibility((this.h.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.e.setVisibility(i);
        this.d.p();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        c();
    }
}
