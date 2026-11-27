package com.base.feature.support.support.screens.popular_questions;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.api.feature.navigation.adder.SimpleFragmentInflate;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.pexpress.tool.R;
import defpackage.B5;
import defpackage.C1597Nf1;
import defpackage.C1753Pf1;
import defpackage.C1831Qf1;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2784ak0;
import defpackage.C3444dp0;
import defpackage.C3476e;
import defpackage.C5053lG;
import defpackage.C5189lv;
import defpackage.C5770og;
import defpackage.C6980uR1;
import defpackage.C7652xe;
import defpackage.EnumC4403iP0;
import defpackage.F6;
import defpackage.FP0;
import defpackage.I6;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC3770fO0;
import defpackage.InterfaceC6396rf0;
import defpackage.KW1;
import defpackage.S2;
import defpackage.Sd2;
import defpackage.UV1;
import defpackage.VV1;
import defpackage.WV1;
import defpackage.XO0;
import defpackage.XV1;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/support/support/screens/popular_questions/SupportPopularQuestionsPartBase;", "Lcom/api/feature/navigation/adder/SimpleFragmentInflate;", "LXV1;", "LQf1;", "FeatureSupportBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SupportPopularQuestionsPartBase extends SimpleFragmentInflate<XV1, C1831Qf1> {

    @NotNull
    public final Sd2 l;

    @NotNull
    public final KW1 m;

    @NotNull
    public final KW1 n;

    @NotNull
    public final b o;

    public /* synthetic */ class a extends C2784ak0 implements Function1<String, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String p0 = str;
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((XV1) this.e).l(p0);
            return Unit.a;
        }
    }

    public /* synthetic */ class b extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C1831Qf1> {
        public static final b m = new b(3, C1831Qf1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/support/databinding/PopularQuestionsPartBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final C1831Qf1 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.popular_questions_part, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.highest_item;
            View viewH = C3476e.h(viewInflate, R.id.highest_item);
            if (viewH != null) {
                C1753Pf1 c1753Pf1B = C1753Pf1.b(viewH);
                int i2 = R.id.how_can_we_help_title;
                if (((TextView) C3476e.h(viewInflate, R.id.how_can_we_help_title)) != null) {
                    i2 = R.id.popular_questions_recycler;
                    RecyclerView recyclerView = (RecyclerView) C3476e.h(viewInflate, R.id.popular_questions_recycler);
                    if (recyclerView != null) {
                        i2 = R.id.popular_questions_title;
                        if (((TextView) C3476e.h(viewInflate, R.id.popular_questions_title)) != null) {
                            i2 = R.id.question_list_shimmer;
                            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C3476e.h(viewInflate, R.id.question_list_shimmer);
                            if (shimmerFrameLayout != null) {
                                return new C1831Qf1((ConstraintLayout) viewInflate, c1753Pf1B, recyclerView, shimmerFrameLayout);
                            }
                        }
                    }
                }
                i = i2;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
    }

    public SupportPopularQuestionsPartBase(@NotNull Sd2 viewModelFactory) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        this.l = viewModelFactory;
        this.m = XO0.b(new C5770og(this, 5));
        this.n = XO0.b(new B5(this, 6));
        this.o = b.m;
    }

    @Override // defpackage.InterfaceC3092c81
    public final void a() {
        C1831Qf1 c1831Qf1 = (C1831Qf1) k();
        requireContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        RecyclerView recyclerView = c1831Qf1.g;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter((C1597Nf1) this.m.getValue());
        recyclerView.g((C3444dp0) this.n.getValue());
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        InterfaceC6396rf0<List<C5053lG>> interfaceC6396rf0 = ((XV1) obj).f;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new VV1(viewLifecycleOwner, interfaceC6396rf0, null, this), 3);
        Object obj2 = this.i;
        Intrinsics.checkNotNull(obj2);
        XV1.a aVar = ((XV1) obj2).h;
        FP0 viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner2), null, new WV1(viewLifecycleOwner2, aVar, null, this), 3);
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        F6 f6 = new F6(this, 2);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new S2(new I6(this, 5), 5));
        return C2151Ui0.a(this, C2017Sp1.a.b(XV1.class), new C6980uR1(interfaceC3770fO0A, 1), new UV1(interfaceC3770fO0A), f6);
    }

    @Override // defpackage.InterfaceC2311Wi0
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C1831Qf1> g() {
        return this.o;
    }
}
