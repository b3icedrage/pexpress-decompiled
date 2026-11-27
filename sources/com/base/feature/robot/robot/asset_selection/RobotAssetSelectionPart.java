package com.base.feature.robot.robot.asset_selection;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.v;
import com.api.feature.navigation.adder.SimpleFragmentInflate;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.card.MaterialCardView;
import com.pexpress.tool.R;
import defpackage.C0632Aw1;
import defpackage.C1621Nn1;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2784ak0;
import defpackage.C2835av1;
import defpackage.C3045bv1;
import defpackage.C3463dv1;
import defpackage.C3476e;
import defpackage.C3481e1;
import defpackage.C3673ev1;
import defpackage.C3883fv1;
import defpackage.C5189lv;
import defpackage.C5191lv1;
import defpackage.C5770og;
import defpackage.C7652xe;
import defpackage.EnumC4403iP0;
import defpackage.FP0;
import defpackage.H6;
import defpackage.I6;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC3770fO0;
import defpackage.InterfaceC4303hv1;
import defpackage.InterfaceC6396rf0;
import defpackage.Sd2;
import defpackage.ViewOnClickListenerC6733tF0;
import defpackage.XO0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/robot/robot/asset_selection/RobotAssetSelectionPart;", "Lcom/api/feature/navigation/adder/SimpleFragmentInflate;", "Llv1;", "LAw1;", "FeatureRobotBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RobotAssetSelectionPart extends SimpleFragmentInflate<C5191lv1, C0632Aw1> {

    @NotNull
    public final Sd2 l;

    @NotNull
    public final C3481e1 m;

    @NotNull
    public final a n;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C0632Aw1> {
        public static final a m = new a(3, C0632Aw1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/robot/databinding/RobotFragmentAssetSelectionBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final C0632Aw1 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.robot_fragment_asset_selection, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.asset_auto_text;
            TextView textView = (TextView) C3476e.h(viewInflate, R.id.asset_auto_text);
            if (textView != null) {
                i = R.id.asset_icon;
                ImageView imageView = (ImageView) C3476e.h(viewInflate, R.id.asset_icon);
                if (imageView != null) {
                    i = R.id.asset_icon_barrier;
                    if (((Barrier) C3476e.h(viewInflate, R.id.asset_icon_barrier)) != null) {
                        i = R.id.asset_icon_next;
                        if (((AppCompatImageView) C3476e.h(viewInflate, R.id.asset_icon_next)) != null) {
                            i = R.id.asset_icon_shimmer;
                            if (((ImageView) C3476e.h(viewInflate, R.id.asset_icon_shimmer)) != null) {
                                i = R.id.asset_name;
                                TextView textView2 = (TextView) C3476e.h(viewInflate, R.id.asset_name);
                                if (textView2 != null) {
                                    i = R.id.asset_percents;
                                    TextView textView3 = (TextView) C3476e.h(viewInflate, R.id.asset_percents);
                                    if (textView3 != null) {
                                        i = R.id.asset_shimmer_layout;
                                        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C3476e.h(viewInflate, R.id.asset_shimmer_layout);
                                        if (shimmerFrameLayout != null) {
                                            i = R.id.asset_text_shimmer;
                                            if (((ImageView) C3476e.h(viewInflate, R.id.asset_text_shimmer)) != null) {
                                                i = R.id.asset_value_layout;
                                                MaterialCardView materialCardView = (MaterialCardView) C3476e.h(viewInflate, R.id.asset_value_layout);
                                                if (materialCardView != null) {
                                                    i = R.id.trading_asset_title;
                                                    if (((TextView) C3476e.h(viewInflate, R.id.trading_asset_title)) != null) {
                                                        return new C0632Aw1((ConstraintLayout) viewInflate, textView, imageView, textView2, textView3, shimmerFrameLayout, materialCardView);
                                                    }
                                                }
                                            }
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

    public RobotAssetSelectionPart(@NotNull Sd2 viewModelFactory, @NotNull C3481e1 bottomSheetDialogCreator) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(bottomSheetDialogCreator, "bottomSheetDialogCreator");
        this.l = viewModelFactory;
        this.m = bottomSheetDialogCreator;
        this.n = a.m;
    }

    @Override // defpackage.InterfaceC3092c81
    public final void a() {
        l(true);
        C0632Aw1 c0632Aw1 = (C0632Aw1) k();
        c0632Aw1.k.setOnClickListener(new ViewOnClickListenerC6733tF0(this, 2));
        C0632Aw1 c0632Aw2 = (C0632Aw1) k();
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        C1621Nn1 c1621Nn1 = ((C5191lv1) obj).g;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new C3463dv1(viewLifecycleOwner, c1621Nn1, null, this), 3);
        Object obj2 = this.i;
        Intrinsics.checkNotNull(obj2);
        C1621Nn1 c1621Nn2 = ((C5191lv1) obj2).h;
        FP0 viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner2), null, new C3673ev1(viewLifecycleOwner2, c1621Nn2, null, c0632Aw2), 3);
        Object obj3 = this.i;
        Intrinsics.checkNotNull(obj3);
        InterfaceC6396rf0<InterfaceC4303hv1> interfaceC6396rf0 = ((C5191lv1) obj3).f;
        FP0 viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner3), null, new C3883fv1(viewLifecycleOwner3, interfaceC6396rf0, null, this, c0632Aw2), 3);
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        C5770og c5770og = new C5770og(this, 3);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new I6(new H6(this, 2), 2));
        return C2151Ui0.a(this, C2017Sp1.a.b(C5191lv1.class), new C2835av1(interfaceC3770fO0A, 0), new C3045bv1(interfaceC3770fO0A), c5770og);
    }

    @Override // defpackage.InterfaceC2311Wi0
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C0632Aw1> g() {
        return this.n;
    }

    public final void l(boolean z) {
        C0632Aw1 c0632Aw1 = (C0632Aw1) k();
        ShimmerFrameLayout assetShimmerLayout = c0632Aw1.j;
        Intrinsics.checkNotNullExpressionValue(assetShimmerLayout, "assetShimmerLayout");
        assetShimmerLayout.setVisibility(z ? 0 : 8);
        Intrinsics.checkNotNullExpressionValue(assetShimmerLayout, "assetShimmerLayout");
        if (z) {
            assetShimmerLayout.b();
        } else {
            assetShimmerLayout.c();
        }
        TextView assetAutoText = c0632Aw1.e;
        Intrinsics.checkNotNullExpressionValue(assetAutoText, "assetAutoText");
        assetAutoText.setVisibility(z ? 8 : 0);
    }
}
