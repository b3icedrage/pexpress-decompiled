package com.base.feature.stories.screens.full;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.v;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.api.core.BaseFragment;
import com.api.core.SimpleViewModelFragment;
import com.api.feature.analytics.reporters.ReporterApi;
import com.pexpress.tool.R;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2649a6;
import defpackage.C2784ak0;
import defpackage.C3151cR1;
import defpackage.C3476e;
import defpackage.C4467ii0;
import defpackage.C4471ij0;
import defpackage.C4730jj0;
import defpackage.C4940kj0;
import defpackage.C5150lj0;
import defpackage.C5189lv;
import defpackage.C5363mj0;
import defpackage.C5573nj0;
import defpackage.C5783oj0;
import defpackage.C7652xe;
import defpackage.EnumC4403iP0;
import defpackage.EnumC5028l80;
import defpackage.FP0;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC3570eR1;
import defpackage.InterfaceC3770fO0;
import defpackage.InterfaceC6396rf0;
import defpackage.Sd2;
import defpackage.TQ1;
import defpackage.VE;
import defpackage.X5;
import defpackage.XO0;
import defpackage.Y5;
import defpackage.YQ;
import defpackage.Z5;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/stories/screens/full/FullStoriesFragmentBase;", "Lcom/api/core/SimpleViewModelFragment;", "Loj0;", "Lii0;", "FeatureStoriesBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FullStoriesFragmentBase extends SimpleViewModelFragment<C5783oj0, C4467ii0> {

    @NotNull
    public final Sd2 j;

    @NotNull
    public final List<BaseFragment.a.d> k;

    @Nullable
    public final Integer l;

    @NotNull
    public final a m;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C4467ii0> {
        public static final a m = new a(3, C4467ii0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/stories/databinding/FragmentFullStoriesBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final C4467ii0 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.fragment_full_stories, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            ViewPager2 viewPager2 = (ViewPager2) C3476e.h(viewInflate, R.id.view_pager);
            if (viewPager2 != null) {
                return new C4467ii0((ConstraintLayout) viewInflate, viewPager2);
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.view_pager)));
        }
    }

    public FullStoriesFragmentBase(@NotNull Sd2 viewModelFactory) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        this.j = viewModelFactory;
        this.k = VE.c(BaseFragment.a.d.a);
        this.l = Integer.valueOf(R.color.black);
        this.m = a.m;
    }

    public static final YQ l(FullStoriesFragmentBase fullStoriesFragmentBase) {
        ViewPager2 viewPager = fullStoriesFragmentBase.k().e;
        Intrinsics.checkNotNullExpressionValue(viewPager, "viewPager");
        View childAt = viewPager.getChildAt(0);
        if (childAt == null) {
            throw new IndexOutOfBoundsException("Index: 0, Size: " + viewPager.getChildCount());
        }
        RecyclerView.C cG = ((RecyclerView) childAt).G(fullStoriesFragmentBase.k().e.getCurrentItem());
        if (cG instanceof YQ) {
            return (YQ) cG;
        }
        return null;
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        X5 x5 = new X5(this, 4);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new Z5(new Y5(this, 2), 2));
        return C2151Ui0.a(this, C2017Sp1.a.b(C5783oj0.class), new C2649a6(interfaceC3770fO0A, 1), new C4471ij0(interfaceC3770fO0A), x5);
    }

    @Override // defpackage.InterfaceC2311Wi0
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C4467ii0> g() {
        return this.m;
    }

    @Override // com.api.core.BaseFragment
    @NotNull
    public final List<BaseFragment.a.d> i() {
        return this.k;
    }

    @Override // com.api.core.BaseFragment
    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final Integer getN() {
        return this.l;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        ((C5783oj0) obj).b();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        ((C5783oj0) obj).e();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        List<List<C3151cR1>> listK = ((C5783oj0) obj).d.k();
        C4467ii0 c4467ii0K = k();
        Object obj2 = this.i;
        Intrinsics.checkNotNull(obj2);
        TQ1 tq1 = new TQ1(listK, (InterfaceC3570eR1) obj2);
        ViewPager2 viewPager2 = c4467ii0K.e;
        viewPager2.setAdapter(tq1);
        viewPager2.a(new C4730jj0(this));
        Object obj3 = this.i;
        Intrinsics.checkNotNull(obj3);
        C5783oj0 c5783oj0 = (C5783oj0) obj3;
        InterfaceC6396rf0<Unit> interfaceC6396rf0 = c5783oj0.f;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new C4940kj0(viewLifecycleOwner, interfaceC6396rf0, null, this), 3);
        FP0 viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner2), null, new C5150lj0(viewLifecycleOwner2, c5783oj0.g, null, this), 3);
        FP0 viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner3), null, new C5363mj0(viewLifecycleOwner3, c5783oj0.h, null, this), 3);
        FP0 viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner4), null, new C5573nj0(viewLifecycleOwner4, c5783oj0.j, null, this, c5783oj0), 3);
        Object obj4 = this.i;
        Intrinsics.checkNotNull(obj4);
        C5783oj0 c5783oj1 = (C5783oj0) obj4;
        FP0 viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        LifecycleCoroutineScopeImpl scope = C7652xe.f(viewLifecycleOwner5);
        c5783oj1.getClass();
        Intrinsics.checkNotNullParameter(scope, "scope");
        c5783oj1.d.l(scope);
        ReporterApi.a.b(c5783oj1.e, EnumC5028l80.s0, null, null, 14);
    }
}
