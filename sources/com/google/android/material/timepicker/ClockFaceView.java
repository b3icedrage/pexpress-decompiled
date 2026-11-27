package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.pexpress.tool.R;
import defpackage.C2083Tl1;
import defpackage.C4484im1;
import defpackage.C5426n2;
import defpackage.C6333rM;
import defpackage.Cd2;
import defpackage.MX0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class ClockFaceView extends C4484im1 implements ClockHandView.a {
    public final Rect A;
    public final RectF B;
    public final Rect C;
    public final SparseArray<TextView> D;
    public final b E;
    public final int[] F;
    public final float[] G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final String[] L;
    public float M;
    public final ColorStateList N;
    public final ClockHandView z;

    public ClockFaceView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.A = new Rect();
        this.B = new RectF();
        this.C = new Rect();
        SparseArray<TextView> sparseArray = new SparseArray<>();
        this.D = sparseArray;
        this.G = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2083Tl1.k, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListB = MX0.b(context, typedArrayObtainStyledAttributes, 1);
        this.N = colorStateListB;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.z = clockHandView;
        this.H = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListB.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListB.getDefaultColor());
        this.F = new int[]{colorForState, colorForState, colorStateListB.getDefaultColor()};
        clockHandView.g.add(this);
        int defaultColor = C6333rM.getColorStateList(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListB2 = MX0.b(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListB2 != null ? colorStateListB2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a(this));
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.E = new b(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.L = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z = false;
        for (int i = 0; i < Math.max(this.L.length, size); i++) {
            TextView textView = sparseArray.get(i);
            if (i >= this.L.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setText(this.L[i]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i));
                int i2 = (i / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i2));
                z = i2 > 1 ? true : z;
                Cd2.l(textView, this.E);
                textView.setTextColor(this.N);
            }
        }
        ClockHandView clockHandView2 = this.z;
        if (clockHandView2.e && !z) {
            clockHandView2.q = 1;
        }
        clockHandView2.e = z;
        clockHandView2.invalidate();
        this.I = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.J = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.K = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.a
    public final void a(float f) {
        if (Math.abs(this.M - f) > 0.001f) {
            this.M = f;
            r();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(C5426n2.e.a(1, this.L.length, 1).a);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        r();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.K / Math.max(Math.max(this.I / displayMetrics.heightPixels, this.J / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    @Override // defpackage.C4484im1
    public final void q() {
        super.q();
        int i = 0;
        while (true) {
            SparseArray<TextView> sparseArray = this.D;
            if (i >= sparseArray.size()) {
                return;
            }
            sparseArray.get(i).setVisibility(0);
            i++;
        }
    }

    public final void r() {
        SparseArray<TextView> sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.z.k;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.D;
            int size = sparseArray.size();
            rectF = this.B;
            rect = this.A;
            if (i >= size) {
                break;
            }
            TextView textView2 = sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f) {
                    textView = textView2;
                    f = fHeight;
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            TextView textView3 = sparseArray.get(i2);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                Rect rect2 = this.C;
                textView3.getLineBounds(0, rect2);
                rectF.inset(rect2.left, rect2.top);
                textView3.getPaint().setShader(RectF.intersects(rectF2, rectF) ? new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.F, this.G, Shader.TileMode.CLAMP) : null);
                textView3.invalidate();
            }
        }
    }
}
