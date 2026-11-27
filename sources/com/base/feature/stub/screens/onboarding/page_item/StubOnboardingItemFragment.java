package com.base.feature.stub.screens.onboarding.page_item;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.v;
import com.api.core.SimpleViewModelFragment;
import com.pexpress.tool.R;
import defpackage.BT1;
import defpackage.C2;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2784ak0;
import defpackage.C3476e;
import defpackage.C4333i4;
import defpackage.C4591j4;
import defpackage.C6333rM;
import defpackage.CT1;
import defpackage.EnumC7778yD0;
import defpackage.FT1;
import defpackage.InterfaceC1060Gj0;
import defpackage.Sd2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/stub/screens/onboarding/page_item/StubOnboardingItemFragment;", "Lcom/api/core/SimpleViewModelFragment;", "LFT1;", "LCT1;", "FeatureStubBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StubOnboardingItemFragment extends SimpleViewModelFragment<FT1, CT1> {
    public final int j;

    @NotNull
    public final Sd2 k;

    @NotNull
    public final a l;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, CT1> {
        public static final a m = new a(3, CT1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/stub/databinding/StubOnboardingPagerItemBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final CT1 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.stub_onboarding_pager_item, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.stub_onboarding_item_bottom_info_container;
            ConstraintLayout constraintLayout = (ConstraintLayout) C3476e.h(viewInflate, R.id.stub_onboarding_item_bottom_info_container);
            if (constraintLayout != null) {
                i = R.id.stub_onboarding_item_bottom_info_subtitle;
                if (((TextView) C3476e.h(viewInflate, R.id.stub_onboarding_item_bottom_info_subtitle)) != null) {
                    i = R.id.stub_onboarding_item_bottom_info_subtitle_acceptIcon_1;
                    if (((ImageView) C3476e.h(viewInflate, R.id.stub_onboarding_item_bottom_info_subtitle_acceptIcon_1)) != null) {
                        i = R.id.stub_onboarding_item_bottom_info_subtitle_acceptIcon_2;
                        if (((ImageView) C3476e.h(viewInflate, R.id.stub_onboarding_item_bottom_info_subtitle_acceptIcon_2)) != null) {
                            i = R.id.stub_onboarding_item_bottom_info_subtitle_acceptIcon_3;
                            if (((ImageView) C3476e.h(viewInflate, R.id.stub_onboarding_item_bottom_info_subtitle_acceptIcon_3)) != null) {
                                i = R.id.stub_onboarding_item_image_view;
                                ImageView imageView = (ImageView) C3476e.h(viewInflate, R.id.stub_onboarding_item_image_view);
                                if (imageView != null) {
                                    i = R.id.stub_onboarding_item_text_view;
                                    TextView textView = (TextView) C3476e.h(viewInflate, R.id.stub_onboarding_item_text_view);
                                    if (textView != null) {
                                        i = R.id.stub_onboarding_item_view_spacer;
                                        View viewH = C3476e.h(viewInflate, R.id.stub_onboarding_item_view_spacer);
                                        if (viewH != null) {
                                            return new CT1((ConstraintLayout) viewInflate, constraintLayout, imageView, textView, viewH);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
    }

    public StubOnboardingItemFragment(int i, @NotNull Sd2 viewModelFactory) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        this.j = i;
        this.k = viewModelFactory;
        this.l = a.m;
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        return C2151Ui0.a(this, C2017Sp1.a.b(FT1.class), new C2(this, 5), new C4591j4(this, 4), new C4333i4(this, 2));
    }

    @Override // defpackage.InterfaceC2311Wi0
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, CT1> g() {
        return this.l;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        CT1 ct1K = k();
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        BT1 bt1 = ((FT1) obj).e.get(this.j);
        ct1K.h.setText(getString(bt1.b));
        ImageView stubOnboardingItemImageView = ct1K.g;
        Intrinsics.checkNotNullExpressionValue(stubOnboardingItemImageView, "stubOnboardingItemImageView");
        Intrinsics.checkNotNullParameter(stubOnboardingItemImageView, "<this>");
        stubOnboardingItemImageView.startAnimation(AnimationUtils.loadAnimation(stubOnboardingItemImageView.getContext(), R.anim.img_fade_in));
        stubOnboardingItemImageView.setImageDrawable(C6333rM.getDrawable(stubOnboardingItemImageView.getContext(), bt1.a));
        View stubOnboardingItemViewSpacer = ct1K.i;
        Intrinsics.checkNotNullExpressionValue(stubOnboardingItemViewSpacer, "stubOnboardingItemViewSpacer");
        EnumC7778yD0 enumC7778yD0 = EnumC7778yD0.e;
        EnumC7778yD0 enumC7778yD1 = bt1.c;
        stubOnboardingItemViewSpacer.setVisibility(enumC7778yD1 == enumC7778yD0 ? 0 : 8);
        ConstraintLayout stubOnboardingItemBottomInfoContainer = ct1K.e;
        Intrinsics.checkNotNullExpressionValue(stubOnboardingItemBottomInfoContainer, "stubOnboardingItemBottomInfoContainer");
        stubOnboardingItemBottomInfoContainer.setVisibility(enumC7778yD1 != enumC7778yD0 ? 8 : 0);
    }
}
