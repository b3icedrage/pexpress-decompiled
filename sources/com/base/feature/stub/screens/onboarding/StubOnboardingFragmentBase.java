package com.base.feature.stub.screens.onboarding;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.v;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.api.core.SimpleViewModelFragment;
import com.google.android.material.button.MaterialButton;
import com.pexpress.tool.R;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;
import defpackage.A40;
import defpackage.AT1;
import defpackage.C1699On1;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2784ak0;
import defpackage.C3476e;
import defpackage.C5189lv;
import defpackage.C6566sT1;
import defpackage.C7331w6;
import defpackage.C7617xT1;
import defpackage.C7652xe;
import defpackage.C7827yT1;
import defpackage.C7955z40;
import defpackage.C8037zT1;
import defpackage.EnumC4403iP0;
import defpackage.FP0;
import defpackage.FT1;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC3770fO0;
import defpackage.L9;
import defpackage.Sd2;
import defpackage.WP;
import defpackage.XO0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/stub/screens/onboarding/StubOnboardingFragmentBase;", "Lcom/api/core/SimpleViewModelFragment;", "LFT1;", "LAT1;", "FeatureStubBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StubOnboardingFragmentBase extends SimpleViewModelFragment<FT1, AT1> {

    @NotNull
    public final Sd2 j;

    @NotNull
    public final a k;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, AT1> {
        public static final a m = new a(3, AT1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/stub/databinding/StubOnboardingFragmentBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final AT1 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.stub_onboarding_fragment, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.anchor_view;
            if (C3476e.h(viewInflate, R.id.anchor_view) != null) {
                i = R.id.stub_onboarding_dots_indicator;
                DotsIndicator dotsIndicator = (DotsIndicator) C3476e.h(viewInflate, R.id.stub_onboarding_dots_indicator);
                if (dotsIndicator != null) {
                    i = R.id.stub_onboarding_next_button;
                    MaterialButton materialButton = (MaterialButton) C3476e.h(viewInflate, R.id.stub_onboarding_next_button);
                    if (materialButton != null) {
                        i = R.id.stub_onboarding_view_pager;
                        ViewPager2 viewPager2 = (ViewPager2) C3476e.h(viewInflate, R.id.stub_onboarding_view_pager);
                        if (viewPager2 != null) {
                            return new AT1((ConstraintLayout) viewInflate, viewPager2, materialButton, dotsIndicator);
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
    }

    public StubOnboardingFragmentBase(@NotNull Sd2 viewModelFactory) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        this.j = viewModelFactory;
        this.k = a.m;
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        WP wp = new WP(this, 2);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new C7331w6(new C7955z40(this, 3), 3));
        return C2151Ui0.a(this, C2017Sp1.a.b(FT1.class), new A40(interfaceC3770fO0A, 2), new C7617xT1(interfaceC3770fO0A), wp);
    }

    @Override // defpackage.InterfaceC2311Wi0
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, AT1> g() {
        return this.k;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        AT1 at1K = k();
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        int size = ((FT1) obj).e.size();
        ViewPager2 viewPager2 = at1K.h;
        viewPager2.setOffscreenPageLimit(size);
        Object obj2 = this.i;
        Intrinsics.checkNotNull(obj2);
        viewPager2.setAdapter(new C6566sT1(this, ((FT1) obj2).e.size(), this.j));
        viewPager2.a(new C8037zT1(this));
        View childAt = k().h.getChildAt(0);
        Intrinsics.c(childAt, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        ((RecyclerView) childAt).setOverScrollMode(2);
        AT1 at1K2 = k();
        ViewPager2 stubOnboardingViewPager = at1K2.h;
        Intrinsics.checkNotNullExpressionValue(stubOnboardingViewPager, "stubOnboardingViewPager");
        at1K2.e.setViewPager2(stubOnboardingViewPager);
        AT1 at1K3 = k();
        Object obj3 = this.i;
        Intrinsics.checkNotNull(obj3);
        C1699On1 c1699On1 = ((FT1) obj3).g;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new C7827yT1(viewLifecycleOwner, c1699On1, null, at1K3), 3);
        AT1 at1K4 = k();
        at1K4.g.setOnClickListener(new L9(this, 2));
    }
}
