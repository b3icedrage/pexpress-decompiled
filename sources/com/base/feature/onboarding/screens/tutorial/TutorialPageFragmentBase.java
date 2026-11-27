package com.base.feature.onboarding.screens.tutorial;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.v;
import com.airbnb.lottie.LottieAnimationView;
import com.api.core.SimpleViewModelFragment;
import com.pexpress.tool.R;
import defpackage.C1912Rg1;
import defpackage.C1917Ri0;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2784ak0;
import defpackage.C3476e;
import defpackage.C5189lv;
import defpackage.C5981pg0;
import defpackage.C6400rg0;
import defpackage.C7652xe;
import defpackage.FP0;
import defpackage.InterfaceC1060Gj0;
import defpackage.J52;
import defpackage.K52;
import defpackage.P52;
import defpackage.R4;
import defpackage.S4;
import defpackage.Sd2;
import defpackage.T4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/onboarding/screens/tutorial/TutorialPageFragmentBase;", "Lcom/api/core/SimpleViewModelFragment;", "LP52;", "LRi0;", "FeatureOnboardingBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TutorialPageFragmentBase extends SimpleViewModelFragment<P52, C1917Ri0> {
    public final int j;

    @NotNull
    public final Sd2 k;

    @NotNull
    public final a l;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C1917Ri0> {
        public static final a m = new a(3, C1917Ri0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/onboarding/databinding/FragmentTutorialPageBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final C1917Ri0 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.fragment_tutorial_page, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.fragmentTutorialItemDescriptionContainer;
            if (((LinearLayout) C3476e.h(viewInflate, R.id.fragmentTutorialItemDescriptionContainer)) != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                int i2 = R.id.tutorialImage;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) C3476e.h(viewInflate, R.id.tutorialImage);
                if (lottieAnimationView != null) {
                    i2 = R.id.tutorialItemSubTitle;
                    TextView textView = (TextView) C3476e.h(viewInflate, R.id.tutorialItemSubTitle);
                    if (textView != null) {
                        i2 = R.id.tutorialItemTitle;
                        TextView textView2 = (TextView) C3476e.h(viewInflate, R.id.tutorialItemTitle);
                        if (textView2 != null) {
                            return new C1917Ri0(constraintLayout, lottieAnimationView, textView, textView2);
                        }
                    }
                }
                i = i2;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
    }

    public TutorialPageFragmentBase(int i, @NotNull Sd2 viewModelFactory) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        this.j = i;
        this.k = viewModelFactory;
        this.l = a.m;
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        return C2151Ui0.a(this, C2017Sp1.a.b(P52.class), new S4(this, 6), new T4(this, 5), new R4(this, 7));
    }

    @Override // defpackage.InterfaceC2311Wi0
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C1917Ri0> g() {
        return this.l;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        P52 p52 = (P52) obj;
        C5981pg0 c5981pg0 = new C5981pg0(new C1912Rg1(p52.h, p52, 1), this, 2);
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new J52(viewLifecycleOwner, c5981pg0, null, this), 3);
        Object obj2 = this.i;
        Intrinsics.checkNotNull(obj2);
        P52 p53 = (P52) obj2;
        C6400rg0 c6400rg0 = new C6400rg0(1, new C1912Rg1(p53.h, p53, 1), this);
        FP0 viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner2), null, new K52(viewLifecycleOwner2, c6400rg0, null, this), 3);
    }
}
