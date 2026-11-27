package com.tbuonomo.viewpagerdotsindicator;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.pexpress.tool.R;
import defpackage.AbstractC7907yq;
import defpackage.C2239Vl1;
import defpackage.R51;
import defpackage.S20;
import defpackage.T20;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R*\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/tbuonomo/viewpagerdotsindicator/DotsIndicator;", "Lyq;", "", "color", "", "setSelectedPointColor", "(I)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, R51.PUSH_MINIFIED_BUTTON_ICON, "I", "getSelectedDotColor", "()I", "setSelectedDotColor", "selectedDotColor", "Lyq$b;", "getType", "()Lyq$b;", "type", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 4, 2})
public final class DotsIndicator extends AbstractC7907yq {
    public final LinearLayout l;
    public final float m;
    public final boolean n;
    public final float o;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public int selectedDotColor;
    public final ArgbEvaluator q;

    public static final class a implements View.OnClickListener {
        public final /* synthetic */ int e;

        public a(int i) {
            this.e = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            DotsIndicator dotsIndicator = DotsIndicator.this;
            if (dotsIndicator.getDotsClickable()) {
                AbstractC7907yq.a pager = dotsIndicator.getPager();
                int count = pager != null ? pager.getCount() : 0;
                int i = this.e;
                if (i < count) {
                    AbstractC7907yq.a pager2 = dotsIndicator.getPager();
                    Intrinsics.checkNotNull(pager2);
                    pager2.c(i);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DotsIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.q = new ArgbEvaluator();
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.l = linearLayout;
        linearLayout.setOrientation(0);
        LinearLayout linearLayout2 = this.l;
        if (linearLayout2 == null) {
            Intrinsics.l("linearLayout");
            throw null;
        }
        addView(linearLayout2, -2, -2);
        this.m = 2.5f;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C2239Vl1.a);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr….styleable.DotsIndicator)");
            setSelectedDotColor(typedArrayObtainStyledAttributes.getColor(8, -16711681));
            float f = typedArrayObtainStyledAttributes.getFloat(6, 2.5f);
            this.m = f;
            if (f < 1) {
                this.m = 2.5f;
            }
            this.n = typedArrayObtainStyledAttributes.getBoolean(7, false);
            this.o = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
        if (isInEditMode()) {
            for (int i = 0; i < 5; i++) {
                a(i);
            }
            d();
        }
    }

    @Override // defpackage.AbstractC7907yq
    public final void a(int i) {
        View setPaddingVertical = LayoutInflater.from(getContext()).inflate(R.layout.dot_layout, (ViewGroup) this, false);
        ImageView imageView = (ImageView) setPaddingVertical.findViewById(R.id.dot);
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        Intrinsics.checkNotNullExpressionValue(setPaddingVertical, "dot");
        setPaddingVertical.setLayoutDirection(0);
        int dotsSize = (int) getDotsSize();
        layoutParams2.height = dotsSize;
        layoutParams2.width = dotsSize;
        layoutParams2.setMargins((int) getDotsSpacing(), 0, (int) getDotsSpacing(), 0);
        S20 s20 = new S20();
        s20.setCornerRadius(getDotsCornerRadius());
        if (isInEditMode()) {
            s20.setColor(i == 0 ? this.selectedDotColor : getDotsColor());
        } else {
            AbstractC7907yq.a pager = getPager();
            Intrinsics.checkNotNull(pager);
            s20.setColor(pager.b() == i ? this.selectedDotColor : getDotsColor());
        }
        imageView.setBackgroundDrawable(s20);
        setPaddingVertical.setOnClickListener(new a(i));
        Intrinsics.checkNotNullExpressionValue(setPaddingVertical, "dot");
        int i2 = (int) (this.o * 0.8f);
        Intrinsics.checkNotNullParameter(setPaddingVertical, "$this$setPaddingHorizontal");
        setPaddingVertical.setPadding(i2, setPaddingVertical.getPaddingTop(), i2, setPaddingVertical.getPaddingBottom());
        int i3 = (int) (this.o * 2);
        Intrinsics.checkNotNullParameter(setPaddingVertical, "$this$setPaddingVertical");
        setPaddingVertical.setPadding(setPaddingVertical.getPaddingLeft(), i3, setPaddingVertical.getPaddingRight(), i3);
        imageView.setElevation(this.o);
        this.d.add(imageView);
        LinearLayout linearLayout = this.l;
        if (linearLayout != null) {
            linearLayout.addView(setPaddingVertical);
        } else {
            Intrinsics.l("linearLayout");
            throw null;
        }
    }

    @Override // defpackage.AbstractC7907yq
    @NotNull
    public final T20 b() {
        return new T20(this);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    @Override // defpackage.AbstractC7907yq
    public final void c(int i) {
        ImageView imageView = this.d.get(i);
        Intrinsics.checkNotNullExpressionValue(imageView, "dots[index]");
        ImageView imageView2 = imageView;
        Drawable background = imageView2.getBackground();
        if (!(background instanceof S20)) {
            background = null;
        }
        S20 s20 = (S20) background;
        if (s20 != null) {
            AbstractC7907yq.a pager = getPager();
            Intrinsics.checkNotNull(pager);
            if (i == pager.b()) {
                s20.setColor(this.selectedDotColor);
            } else {
                if (this.n) {
                    AbstractC7907yq.a pager2 = getPager();
                    Intrinsics.checkNotNull(pager2);
                    if (i < pager2.b()) {
                        s20.setColor(this.selectedDotColor);
                    }
                }
                s20.setColor(getDotsColor());
            }
        }
        imageView2.setBackgroundDrawable(s20);
        imageView2.invalidate();
    }

    @Override // defpackage.AbstractC7907yq
    public final void f() {
        LinearLayout linearLayout = this.l;
        if (linearLayout == null) {
            Intrinsics.l("linearLayout");
            throw null;
        }
        linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
        ArrayList<ImageView> arrayList = this.d;
        arrayList.remove(arrayList.size() - 1);
    }

    public final int getSelectedDotColor() {
        return this.selectedDotColor;
    }

    @Override // defpackage.AbstractC7907yq
    @NotNull
    public AbstractC7907yq.b getType() {
        return AbstractC7907yq.b.k;
    }

    public final void setSelectedDotColor(int i) {
        this.selectedDotColor = i;
        e();
    }

    public final void setSelectedPointColor(int color) {
        setSelectedDotColor(color);
    }
}
