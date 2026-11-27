package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.a;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.pexpress.tool.R;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class MA1 {
    public static final void a(@NotNull final MaterialCardView materialCardView) {
        Intrinsics.checkNotNullParameter(materialCardView, "<this>");
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(materialCardView.getContext(), R.animator.time_container_stroke_anim);
        Intrinsics.c(animatorLoadAnimator, "null cannot be cast to non-null type android.animation.ValueAnimator");
        ValueAnimator valueAnimator = (ValueAnimator) animatorLoadAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: KA1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Object animatedValue = it.getAnimatedValue();
                Intrinsics.c(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(((Integer) animatedValue).intValue());
                MaterialCardView materialCardView2 = materialCardView;
                materialCardView2.setStrokeColor(colorStateListValueOf);
                materialCardView2.invalidate();
            }
        });
        valueAnimator.start();
    }

    public static final String b(InterfaceC7441wd2 interfaceC7441wd2, int i, String... strArr) {
        String string = interfaceC7441wd2.a().getContext().getString(i, strArr);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @NotNull
    public static final C5981pg0 c(@NotNull InterfaceC6396rf0 demoFlow, @NotNull InterfaceC6396rf0 realFlow, @NotNull O3 accountModeSelectionUseCase, @NotNull C4923kf appData) {
        Intrinsics.checkNotNullParameter(demoFlow, "demoFlow");
        Intrinsics.checkNotNullParameter(realFlow, "realFlow");
        Intrinsics.checkNotNullParameter(accountModeSelectionUseCase, "accountModeSelectionUseCase");
        Intrinsics.checkNotNullParameter(appData, "appData");
        return C4466ii.l(demoFlow, realFlow, accountModeSelectionUseCase.k(), appData.k, new LA1(5, null));
    }

    public static final void d(@NotNull ImageView imageView, @NotNull String imageUrl) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        a.d(imageView).n(imageUrl).i().N(imageView);
    }

    public static final void e(@NotNull C3702f32 c3702f32, @NotNull C1491Lx0 state, @Nullable InterfaceC7722xy0<?> interfaceC7722xy0, boolean z) {
        C7725xz0 c7725xz0A;
        Intrinsics.checkNotNullParameter(c3702f32, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        c3702f32.p.setText(state.e);
        TextView textView = c3702f32.k;
        Integer num = state.g;
        if (num != null) {
            textView.setText(b(c3702f32, num.intValue(), new String[0]));
        }
        ImageView indicatorSelectionIllustration = c3702f32.l;
        Intrinsics.checkNotNullExpressionValue(indicatorSelectionIllustration, "indicatorSelectionIllustration");
        d(indicatorSelectionIllustration, state.c);
        MaterialRadioButton indicatorSelectionRadioButton = c3702f32.o;
        indicatorSelectionRadioButton.setChecked(state.k);
        Intrinsics.checkNotNullExpressionValue(indicatorSelectionRadioButton, "indicatorSelectionRadioButton");
        boolean z2 = state.m;
        indicatorSelectionRadioButton.setVisibility(!z2 ? 0 : 8);
        ImageButton indicatorSelectionArrowNextButton = c3702f32.i;
        Intrinsics.checkNotNullExpressionValue(indicatorSelectionArrowNextButton, "indicatorSelectionArrowNextButton");
        indicatorSelectionArrowNextButton.setVisibility(z2 ? 0 : 8);
        ImageView indicatorSelectionLockIconV1 = c3702f32.m;
        Intrinsics.checkNotNullExpressionValue(indicatorSelectionLockIconV1, "indicatorSelectionLockIconV1");
        boolean z3 = state.l;
        indicatorSelectionLockIconV1.setVisibility(z3 ? 0 : 8);
        MaterialCardView materialCardView = c3702f32.d;
        materialCardView.setCardBackgroundColor(C6333rM.getColor(materialCardView.getContext(), R.color.surface));
        textView.setTextColor(C6333rM.getColor(materialCardView.getContext(), R.color.textGrey));
        boolean z4 = (state.h == null || z2) ? false : true;
        boolean z5 = z4 && !z;
        boolean z6 = z4 && z;
        boolean z7 = z6 && interfaceC7722xy0 != null;
        TextView indicatorParamsDescription = c3702f32.h;
        Intrinsics.checkNotNullExpressionValue(indicatorParamsDescription, "indicatorParamsDescription");
        indicatorParamsDescription.setVisibility(z7 ? 0 : 8);
        Intrinsics.checkNotNullExpressionValue(indicatorParamsDescription, "indicatorParamsDescription");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int color = C6333rM.getColor(indicatorParamsDescription.getContext(), R.color.textGrey);
        if (interfaceC7722xy0 != null && (c7725xz0A = C7935yz0.a(interfaceC7722xy0)) != null) {
            Iterator it = c7725xz0A.c.iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    WE.l();
                    throw null;
                }
                Iterator it2 = it;
                C1027Fy0 c1027Fy0 = (C1027Fy0) next;
                boolean z8 = z3;
                if (i > 0) {
                    SpannableString spannableString = new SpannableString("   •   ");
                    spannableString.setSpan(new ForegroundColorSpan(color), 0, spannableString.length(), 33);
                    spannableStringBuilder.append((CharSequence) spannableString);
                }
                SpannableString spannableString2 = new SpannableString("●");
                spannableString2.setSpan(new ForegroundColorSpan(Color.parseColor(c1027Fy0.b)), 0, spannableString2.length(), 33);
                spannableString2.setSpan(new AbsoluteSizeSpan(QX0.b(indicatorParamsDescription.getTextSize() * 1.25f)), 0, spannableString2.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString2);
                SpannableString spannableString3 = new SpannableString(C5491nL.c(" ", CollectionsKt.J(c1027Fy0.c, "/", null, null, new JA1(0), 30)));
                spannableString3.setSpan(new ForegroundColorSpan(Color.parseColor(c1027Fy0.b)), 0, spannableString3.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString3);
                it = it2;
                z6 = z6;
                z3 = z8;
                i = i2;
                color = color;
                z7 = z7;
                materialCardView = materialCardView;
            }
        }
        boolean z9 = z3;
        MaterialCardView materialCardView2 = materialCardView;
        boolean z10 = z6;
        boolean z11 = z7;
        indicatorParamsDescription.setText(SpannableString.valueOf(spannableStringBuilder));
        TextView indicatorShowDetails = c3702f32.q;
        Intrinsics.checkNotNullExpressionValue(indicatorShowDetails, "indicatorShowDetails");
        indicatorShowDetails.setVisibility(z5 ? 0 : 8);
        indicatorShowDetails.setText(b(c3702f32, R.string.show_details_text, new String[0]));
        indicatorShowDetails.setTextColor(C6333rM.getColor(materialCardView2.getContext(), R.color.primary));
        MaterialButton indicatorShowDetailsBtn = c3702f32.r;
        Intrinsics.checkNotNullExpressionValue(indicatorShowDetailsBtn, "indicatorShowDetailsBtn");
        indicatorShowDetailsBtn.setVisibility(z10 ? 0 : 8);
        indicatorShowDetailsBtn.setText(b(c3702f32, R.string.show_details_text, new String[0]));
        indicatorShowDetailsBtn.setTextColor(C6333rM.getColor(materialCardView2.getContext(), R.color.primary));
        View btnSpacer = c3702f32.e;
        Intrinsics.checkNotNullExpressionValue(btnSpacer, "btnSpacer");
        btnSpacer.setVisibility(z11 ? 0 : 8);
        MaterialButton indicatorEditBtn = c3702f32.g;
        Intrinsics.checkNotNullExpressionValue(indicatorEditBtn, "indicatorEditBtn");
        indicatorEditBtn.setVisibility(z11 ? 0 : 8);
        indicatorEditBtn.setText(b(c3702f32, R.string.btn_edit, new String[0]));
        indicatorEditBtn.setTextColor(C6333rM.getColor(materialCardView2.getContext(), R.color.primary));
        if (!Intrinsics.a(state.b, "summary")) {
            materialCardView2.setBackgroundResource(R.drawable.summary_gradient_background_activated);
            return;
        }
        if (z2) {
            textView.setTextColor(C6333rM.getColor(materialCardView2.getContext(), R.color.textGrey));
        } else {
            textView.setTextColor(C6333rM.getColor(materialCardView2.getContext(), R.color.white));
        }
        indicatorSelectionIllustration.setBackground(C6333rM.getDrawable(materialCardView2.getContext(), R.drawable.transparent_bg));
        if (z9) {
            indicatorShowDetails.setText(b(c3702f32, R.string.activate_text, new String[0]));
            indicatorShowDetails.setTextColor(C6333rM.getColor(materialCardView2.getContext(), R.color.white));
            indicatorShowDetailsBtn.setText(b(c3702f32, R.string.activate_text, new String[0]));
            indicatorShowDetailsBtn.setBackgroundTintList(ColorStateList.valueOf(C6333rM.getColor(materialCardView2.getContext(), R.color.white)));
            indicatorShowDetailsBtn.setTextColor(C6333rM.getColor(materialCardView2.getContext(), R.color.black));
            ImageView indicatorSelectionLockIconV2 = c3702f32.n;
            Intrinsics.checkNotNullExpressionValue(indicatorSelectionLockIconV2, "indicatorSelectionLockIconV2");
            indicatorSelectionLockIconV2.setVisibility(8);
            Intrinsics.checkNotNullExpressionValue(indicatorSelectionLockIconV1, "indicatorSelectionLockIconV1");
            indicatorSelectionLockIconV1.setVisibility(8);
            Intrinsics.checkNotNullExpressionValue(indicatorSelectionRadioButton, "indicatorSelectionRadioButton");
            indicatorSelectionRadioButton.setVisibility(8);
        }
    }

    public static final void f(@NotNull C3077c42 c3077c42, @NotNull C3496e42 state) {
        String string;
        Intrinsics.checkNotNullParameter(c3077c42, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        boolean z = state.a == EnumC2644a42.k;
        c3077c42.q.setText(b(c3077c42, state.b, new String[0]));
        EnumC7290vu1 enumC7290vu1 = state.f;
        String strB = b(c3077c42, enumC7290vu1.d, new String[0]);
        TextView strategySelectionRiskLabel = c3077c42.n;
        strategySelectionRiskLabel.setText(strB);
        MaterialCardView materialCardView = c3077c42.d;
        strategySelectionRiskLabel.setTextColor(C6333rM.getColor(materialCardView.getContext(), enumC7290vu1.e));
        ImageView strategySelectionRiskIcon = c3077c42.m;
        Integer num = enumC7290vu1.g;
        if (num != null) {
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullExpressionValue(strategySelectionRiskIcon, "strategySelectionRiskIcon");
            C3435dm0.d(strategySelectionRiskIcon, iIntValue);
        }
        Intrinsics.checkNotNullExpressionValue(strategySelectionRiskIcon, "strategySelectionRiskIcon");
        strategySelectionRiskIcon.setVisibility(num != null ? 0 : 8);
        Drawable drawableD = C7652xe.d(materialCardView.getContext(), state.k);
        ImageView strategySelectionIllustration = c3077c42.i;
        strategySelectionIllustration.setBackground(drawableD);
        Intrinsics.checkNotNullExpressionValue(strategySelectionIllustration, "strategySelectionIllustration");
        d(strategySelectionIllustration, state.n);
        String string2 = materialCardView.getContext().getString(state.h, state.j);
        TextView strategySelectionAtLeast = c3077c42.g;
        strategySelectionAtLeast.setText(string2);
        c3077c42.k.setChecked(state.m);
        ImageView strategySelectionLockIcon = c3077c42.j;
        Intrinsics.checkNotNullExpressionValue(strategySelectionLockIcon, "strategySelectionLockIcon");
        strategySelectionLockIcon.setVisibility(state.l ? 0 : 8);
        if (z) {
            string = b(c3077c42, R.string.strategy_without_text, new String[0]);
        } else {
            string = materialCardView.getContext().getString(R.string.recommended_balance_text, "");
            Intrinsics.checkNotNull(string);
        }
        c3077c42.l.setText(string);
        Intrinsics.checkNotNullExpressionValue(strategySelectionAtLeast, "strategySelectionAtLeast");
        strategySelectionAtLeast.setVisibility(!z ? 0 : 8);
        Intrinsics.checkNotNullExpressionValue(strategySelectionRiskLabel, "strategySelectionRiskLabel");
        strategySelectionRiskLabel.setVisibility(z ? 8 : 0);
    }
}
