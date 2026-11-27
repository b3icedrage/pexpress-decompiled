package com.base.feature.support.support.screens.issue_categories;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.v;
import androidx.recyclerview.widget.RecyclerView;
import com.api.feature.navigation.adder.SimpleFragmentInflate;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.pexpress.tool.R;
import defpackage.B3;
import defpackage.BV1;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2784ak0;
import defpackage.C3;
import defpackage.C3410dg;
import defpackage.C3476e;
import defpackage.C5189lv;
import defpackage.C5266mG;
import defpackage.C6098qD0;
import defpackage.C6307rD0;
import defpackage.C7652xe;
import defpackage.CV1;
import defpackage.DV1;
import defpackage.EnumC4403iP0;
import defpackage.FP0;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC3770fO0;
import defpackage.InterfaceC6396rf0;
import defpackage.KW1;
import defpackage.O4;
import defpackage.S4;
import defpackage.Sd2;
import defpackage.ViewOnClickListenerC7950z3;
import defpackage.XO0;
import defpackage.XV1;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/support/support/screens/issue_categories/SupportIssueCategoriesPartBase;", "Lcom/api/feature/navigation/adder/SimpleFragmentInflate;", "LXV1;", "LqD0;", "FeatureSupportBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SupportIssueCategoriesPartBase extends SimpleFragmentInflate<XV1, C6098qD0> {

    @NotNull
    public final Sd2 l;

    @NotNull
    public final KW1 m;

    @NotNull
    public final b n;

    public /* synthetic */ class a extends C2784ak0 implements Function1<String, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String p0 = str;
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((XV1) this.e).l(p0);
            return Unit.a;
        }
    }

    public /* synthetic */ class b extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C6098qD0> {
        public static final b m = new b(3, C6098qD0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/support/databinding/IssueCategoriesPartBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final C6098qD0 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.issue_categories_part, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.categories_list_shimmer;
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C3476e.h(viewInflate, R.id.categories_list_shimmer);
            if (shimmerFrameLayout != null) {
                i = R.id.issue_categories_part_title;
                if (((TextView) C3476e.h(viewInflate, R.id.issue_categories_part_title)) != null) {
                    i = R.id.issue_categories_recycler;
                    RecyclerView recyclerView = (RecyclerView) C3476e.h(viewInflate, R.id.issue_categories_recycler);
                    if (recyclerView != null) {
                        i = R.id.view_all_text;
                        TextView textView = (TextView) C3476e.h(viewInflate, R.id.view_all_text);
                        if (textView != null) {
                            return new C6098qD0((ConstraintLayout) viewInflate, shimmerFrameLayout, recyclerView, textView);
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
    }

    public SupportIssueCategoriesPartBase(@NotNull Sd2 viewModelFactory) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        this.l = viewModelFactory;
        this.m = XO0.b(new O4(this, 8));
        this.n = b.m;
    }

    @Override // defpackage.InterfaceC3092c81
    public final void a() {
        ((C6098qD0) k()).g.setAdapter((C6307rD0) this.m.getValue());
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        InterfaceC6396rf0<List<C5266mG>> interfaceC6396rf0 = ((XV1) obj).g;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new CV1(viewLifecycleOwner, interfaceC6396rf0, null, this), 3);
        Object obj2 = this.i;
        Intrinsics.checkNotNull(obj2);
        XV1.b bVar = ((XV1) obj2).i;
        FP0 viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner2), null, new DV1(viewLifecycleOwner2, bVar, null, this), 3);
        C6098qD0 c6098qD0 = (C6098qD0) k();
        c6098qD0.h.setOnClickListener(new ViewOnClickListenerC7950z3(this, 3));
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        C3410dg c3410dg = new C3410dg(this, 3);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new C3(new B3(this, 3), 3));
        return C2151Ui0.a(this, C2017Sp1.a.b(XV1.class), new S4(interfaceC3770fO0A, 5), new BV1(interfaceC3770fO0A), c3410dg);
    }

    @Override // defpackage.InterfaceC2311Wi0
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C6098qD0> g() {
        return this.n;
    }
}
