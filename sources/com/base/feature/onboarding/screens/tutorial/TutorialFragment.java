package com.base.feature.onboarding.screens.tutorial;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.v;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.api.core.SimpleViewModelFragment;
import com.api.feature.analytics.reporters.ReporterApi;
import com.base.feature.onboarding.screens.tutorial.TutorialFragment;
import com.google.android.material.button.MaterialButton;
import com.pexpress.tool.R;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;
import defpackage.B9;
import defpackage.C1839Qi0;
import defpackage.C1912Rg1;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2784ak0;
import defpackage.C3476e;
import defpackage.C5189lv;
import defpackage.C5729oU0;
import defpackage.C7330w52;
import defpackage.C7652xe;
import defpackage.CallableC5519nU0;
import defpackage.D52;
import defpackage.FP0;
import defpackage.G52;
import defpackage.GP1;
import defpackage.InterfaceC1060Gj0;
import defpackage.P52;
import defpackage.R40;
import defpackage.Sd2;
import defpackage.ViewOnClickListenerC5622ny0;
import defpackage.X5;
import defpackage.XE;
import defpackage.Y5;
import defpackage.Z5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/onboarding/screens/tutorial/TutorialFragment;", "Lcom/api/core/SimpleViewModelFragment;", "LP52;", "LQi0;", "FeatureOnboardingBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TutorialFragment extends SimpleViewModelFragment<P52, C1839Qi0> {
    public static final long l;
    public static final /* synthetic */ int m = 0;

    @NotNull
    public final Sd2 j;

    @NotNull
    public final a k;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C1839Qi0> {
        public static final a m = new a(3, C1839Qi0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/onboarding/databinding/FragmentTutorialBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final C1839Qi0 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.fragment_tutorial, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            int i = R.id.next_on_boarding_screen_button;
            MaterialButton materialButton = (MaterialButton) C3476e.h(viewInflate, R.id.next_on_boarding_screen_button);
            if (materialButton != null) {
                i = R.id.tutorialBackButton;
                ImageView imageView = (ImageView) C3476e.h(viewInflate, R.id.tutorialBackButton);
                if (imageView != null) {
                    i = R.id.tutorialDotsIndicator;
                    DotsIndicator dotsIndicator = (DotsIndicator) C3476e.h(viewInflate, R.id.tutorialDotsIndicator);
                    if (dotsIndicator != null) {
                        i = R.id.tutorialPager;
                        ViewPager2 viewPager2 = (ViewPager2) C3476e.h(viewInflate, R.id.tutorialPager);
                        if (viewPager2 != null) {
                            i = R.id.tutorialSkipButton;
                            ImageView imageView2 = (ImageView) C3476e.h(viewInflate, R.id.tutorialSkipButton);
                            if (imageView2 != null) {
                                return new C1839Qi0(constraintLayout, materialButton, imageView, dotsIndicator, viewPager2, imageView2);
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
    }

    public static final class b extends ViewPager2.e {
        public b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public final void c(int i) {
            Object obj = TutorialFragment.this.i;
            Intrinsics.checkNotNull(obj);
            GP1 gp1 = ((P52) obj).h;
            Integer numValueOf = Integer.valueOf(i);
            gp1.getClass();
            gp1.m(null, numValueOf);
        }
    }

    static {
        kotlin.time.b.a aVar = kotlin.time.b.e;
        l = c.g(100, R40.MILLISECONDS);
    }

    public TutorialFragment(@NotNull Sd2 viewModelFactory) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        this.j = viewModelFactory;
        this.k = a.m;
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        return C2151Ui0.a(this, C2017Sp1.a.b(P52.class), new Y5(this, 5), new Z5(this, 4), new X5(this, 9));
    }

    @Override // defpackage.InterfaceC2311Wi0
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C1839Qi0> g() {
        return this.k;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        P52 p52 = (P52) obj;
        C1912Rg1 c1912Rg1 = new C1912Rg1(p52.h, p52, 1);
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new D52(viewLifecycleOwner, c1912Rg1, null, this), 3);
        Object obj2 = this.i;
        Intrinsics.checkNotNull(obj2);
        List<G52> list = ((P52) obj2).g;
        ArrayList arrayList = new ArrayList(XE.m(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((G52) it.next()).d));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            Context contextRequireContext = requireContext();
            String strI = C5729oU0.i(contextRequireContext, iIntValue);
            C5729oU0.a(strI, new CallableC5519nU0(new WeakReference(contextRequireContext), contextRequireContext.getApplicationContext(), iIntValue, strI));
        }
        C1839Qi0 c1839Qi0K = k();
        c1839Qi0K.j.setOnClickListener(new ViewOnClickListenerC5622ny0(this, 2));
        c1839Qi0K.e.setOnClickListener(new View.OnClickListener() { // from class: C52
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object value;
                int i = TutorialFragment.m;
                Object obj3 = this.d.i;
                Intrinsics.checkNotNull(obj3);
                P52 p53 = (P52) obj3;
                GP1 gp1 = p53.h;
                if (((Number) gp1.getValue()).intValue() != WE.e(p53.g)) {
                    do {
                        value = gp1.getValue();
                    } while (!gp1.d(value, Integer.valueOf(((Number) value).intValue() + 1)));
                    return;
                }
                EnumC5028l80 enumC5028l80 = EnumC5028l80.i;
                L80 l80 = L80.MAX_PROFIT;
                ReporterApi.a.b(p53.e, enumC5028l80, new C1510Md1("Passed"), VE.c(EnumC5326ma.g), 8);
                C5189lv.k(C8056za.j(p53), null, new N52(p53, null), 3);
            }
        });
        c1839Qi0K.g.setOnClickListener(new B9(this, 5));
        Object obj3 = this.i;
        Intrinsics.checkNotNull(obj3);
        int size = ((P52) obj3).g.size();
        ViewPager2 tutorialPager = c1839Qi0K.i;
        tutorialPager.setOffscreenPageLimit(size);
        Object obj4 = this.i;
        Intrinsics.checkNotNull(obj4);
        tutorialPager.setAdapter(new C7330w52(this, ((P52) obj4).g.size(), this.j));
        Intrinsics.checkNotNullExpressionValue(tutorialPager, "tutorialPager");
        c1839Qi0K.h.setViewPager2(tutorialPager);
        tutorialPager.a(new b());
        View childAt = tutorialPager.getChildAt(0);
        Intrinsics.c(childAt, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        ((RecyclerView) childAt).setOverScrollMode(2);
    }
}
