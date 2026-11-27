package com.jivosite.sdk.ui.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.jivosite.sdk.ui.views.ExpandableTextView;
import com.pexpress.tool.R;
import defpackage.C2161Ul1;
import defpackage.C6376ra0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/jivosite/sdk/ui/views/ExpandableTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/view/View$OnClickListener;", "", "text", "", "setTextNoCaching", "(Ljava/lang/CharSequence;)V", "", "getPaddingHeight", "()I", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ExpandableTextView extends AppCompatTextView implements View.OnClickListener {
    public static final /* synthetic */ int p = 0;
    public final ValueAnimator l;
    public boolean m;
    public CharSequence n;

    @NotNull
    public final String o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2161Ul1.a);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…eable.ExpandableTextView)");
            String string = context.getString(typedArrayObtainStyledAttributes.getResourceId(1, R.string.unsupported_message_postfix));
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(\n     …          )\n            )");
            this.o = string;
            typedArrayObtainStyledAttributes.recycle();
        } else {
            String string2 = context.getString(R.string.unsupported_message_postfix);
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…upported_message_postfix)");
            this.o = string2;
        }
        setMaxLines(2);
        setOnClickListener(this);
        ValueAnimator duration = ValueAnimator.ofInt(-1, -1).setDuration(450L);
        Intrinsics.checkNotNullExpressionValue(duration, "ofInt(-1, -1)\n            .setDuration(450)");
        this.l = duration;
        if (duration == null) {
            Intrinsics.l("animator");
            throw null;
        }
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        ValueAnimator valueAnimator = this.l;
        if (valueAnimator == null) {
            Intrinsics.l("animator");
            throw null;
        }
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: qa0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator animation) {
                int i = ExpandableTextView.p;
                ExpandableTextView this$0 = this.d;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(animation, "animation");
                Object animatedValue = animation.getAnimatedValue();
                Intrinsics.c(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) animatedValue).intValue();
                ViewGroup.LayoutParams layoutParams = this$0.getLayoutParams();
                layoutParams.height = iIntValue;
                this$0.setLayoutParams(layoutParams);
            }
        });
        ValueAnimator valueAnimator2 = this.l;
        if (valueAnimator2 != null) {
            valueAnimator2.addListener(new C6376ra0(this));
        } else {
            Intrinsics.l("animator");
            throw null;
        }
    }

    private final int getPaddingHeight() {
        return getCompoundPaddingTop() + getCompoundPaddingBottom();
    }

    private final void setTextNoCaching(CharSequence text) {
        super.setText(text, TextView.BufferType.NORMAL);
    }

    public final void g() {
        int lineEnd = getLayout().getLineEnd(1);
        CharSequence text = getText();
        int lineEnd2 = (getLayout().getLineEnd(1) - getLayout().getLineStart(1)) + 4;
        String str = this.o;
        if (lineEnd2 < str.length()) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
        spannableStringBuilder.replace(lineEnd - str.length(), lineEnd, (CharSequence) str);
        spannableStringBuilder.setSpan(new UnderlineSpan(), lineEnd - str.length(), lineEnd, 33);
        setTextNoCaching(spannableStringBuilder);
    }

    public final boolean h() {
        return Integer.MAX_VALUE != getMaxLines();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        int paddingHeight;
        ValueAnimator valueAnimator = this.l;
        if (valueAnimator == null) {
            Intrinsics.l("animator");
            throw null;
        }
        if (valueAnimator.isRunning()) {
            this.m = !this.m;
            ValueAnimator valueAnimator2 = this.l;
            if (valueAnimator2 != null) {
                valueAnimator2.reverse();
                return;
            } else {
                Intrinsics.l("animator");
                throw null;
            }
        }
        if (h()) {
            paddingHeight = getLayout().getHeight() + getPaddingHeight();
        } else {
            paddingHeight = getPaddingHeight() + getLayout().getBottomPadding() + getLayout().getLineBottom(1);
        }
        int height = getHeight();
        ValueAnimator valueAnimator3 = this.l;
        if (valueAnimator3 == null) {
            Intrinsics.l("animator");
            throw null;
        }
        valueAnimator3.setIntValues(height, paddingHeight);
        ValueAnimator valueAnimator4 = this.l;
        if (valueAnimator4 != null) {
            valueAnimator4.start();
        } else {
            Intrinsics.l("animator");
            throw null;
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getLineCount() <= 2) {
            CharSequence charSequence = this.n;
            if (charSequence == null) {
                Intrinsics.l("originalText");
                throw null;
            }
            setText(charSequence);
            setClickable(false);
            return;
        }
        setClickable(true);
        ValueAnimator valueAnimator = this.l;
        if (valueAnimator == null) {
            Intrinsics.l("animator");
            throw null;
        }
        if (valueAnimator.isRunning() || !h()) {
            return;
        }
        g();
    }

    @Override // android.widget.TextView
    public final void setText(@NotNull CharSequence text, @NotNull TextView.BufferType type) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(type, "type");
        this.n = text;
        super.setText(text, type);
    }
}
