package com.base.feature.robot.indicatorselection.screens.indicators_details;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.v;
import com.api.feature.bottomsheetdialog.utils.SimpleBindingBottomSheetDialogFragment;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.pexpress.tool.R;
import defpackage.C1491Lx0;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2196Ux0;
import defpackage.C2274Vx0;
import defpackage.C2784ak0;
import defpackage.C3238cq0;
import defpackage.C3265cz0;
import defpackage.C3474dz0;
import defpackage.C3476e;
import defpackage.C3684ez0;
import defpackage.C3894fz0;
import defpackage.C4782jz0;
import defpackage.C5189lv;
import defpackage.C5500nO;
import defpackage.C7652xe;
import defpackage.EnumC4403iP0;
import defpackage.FP0;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC3770fO0;
import defpackage.InterfaceC6396rf0;
import defpackage.Sd2;
import defpackage.ViewOnClickListenerC3055bz0;
import defpackage.ViewOnClickListenerC6713t9;
import defpackage.XO0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/robot/indicatorselection/screens/indicators_details/IndicatorsDetailsBottomSheetDialogFragment;", "Lcom/api/feature/bottomsheetdialog/utils/SimpleBindingBottomSheetDialogFragment;", "Ljz0;", "LUx0;", "FeatureRobotBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IndicatorsDetailsBottomSheetDialogFragment extends SimpleBindingBottomSheetDialogFragment<C4782jz0, C2196Ux0> {

    @NotNull
    public final Sd2 i;

    @NotNull
    public final a j;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C2196Ux0> {
        public static final a m = new a(3, C2196Ux0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/robot/databinding/IndicatorDetailsBottomSheetFragmentBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final C2196Ux0 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.indicator_details_bottom_sheet_fragment, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.indicator_details_activation_button;
            MaterialButton materialButton = (MaterialButton) C3476e.h(viewInflate, R.id.indicator_details_activation_button);
            if (materialButton != null) {
                i = R.id.indicator_details_selection_button;
                MaterialButton materialButton2 = (MaterialButton) C3476e.h(viewInflate, R.id.indicator_details_selection_button);
                if (materialButton2 != null) {
                    i = R.id.indicator_details_top_warning_close;
                    if (((ImageView) C3476e.h(viewInflate, R.id.indicator_details_top_warning_close)) != null) {
                        i = R.id.indicator_details_view;
                        View viewH = C3476e.h(viewInflate, R.id.indicator_details_view);
                        if (viewH != null) {
                            int i2 = R.id.indicator_details_bottom_card;
                            CardView cardView = (CardView) C3476e.h(viewH, R.id.indicator_details_bottom_card);
                            if (cardView != null) {
                                i2 = R.id.indicator_details_bottom_card_description_second;
                                TextView textView = (TextView) C3476e.h(viewH, R.id.indicator_details_bottom_card_description_second);
                                if (textView != null) {
                                    i2 = R.id.indicator_details_bottom_card_description_third;
                                    TextView textView2 = (TextView) C3476e.h(viewH, R.id.indicator_details_bottom_card_description_third);
                                    if (textView2 != null) {
                                        i2 = R.id.indicator_details_bottom_card_details_first;
                                        TextView textView3 = (TextView) C3476e.h(viewH, R.id.indicator_details_bottom_card_details_first);
                                        if (textView3 != null) {
                                            i2 = R.id.indicator_details_bottom_card_title_first;
                                            if (((TextView) C3476e.h(viewH, R.id.indicator_details_bottom_card_title_first)) != null) {
                                                i2 = R.id.indicator_details_bottom_card_title_second;
                                                if (((TextView) C3476e.h(viewH, R.id.indicator_details_bottom_card_title_second)) != null) {
                                                    i2 = R.id.indicator_details_card_bottom_separator;
                                                    if (C3476e.h(viewH, R.id.indicator_details_card_bottom_separator) != null) {
                                                        i2 = R.id.indicator_details_icon;
                                                        ImageView imageView = (ImageView) C3476e.h(viewH, R.id.indicator_details_icon);
                                                        if (imageView != null) {
                                                            i2 = R.id.indicator_details_lock_icon;
                                                            ImageView imageView2 = (ImageView) C3476e.h(viewH, R.id.indicator_details_lock_icon);
                                                            if (imageView2 != null) {
                                                                i2 = R.id.indicator_details_page_description;
                                                                TextView textView4 = (TextView) C3476e.h(viewH, R.id.indicator_details_page_description);
                                                                if (textView4 != null) {
                                                                    i2 = R.id.indicator_details_page_illustration;
                                                                    ShapeableImageView shapeableImageView = (ShapeableImageView) C3476e.h(viewH, R.id.indicator_details_page_illustration);
                                                                    if (shapeableImageView != null) {
                                                                        i2 = R.id.indicator_details_title;
                                                                        TextView textView5 = (TextView) C3476e.h(viewH, R.id.indicator_details_title);
                                                                        if (textView5 != null) {
                                                                            i2 = R.id.indicator_tags;
                                                                            LinearLayout linearLayout = (LinearLayout) C3476e.h(viewH, R.id.indicator_tags);
                                                                            if (linearLayout != null) {
                                                                                C2274Vx0 c2274Vx0 = new C2274Vx0((NestedScrollView) viewH, cardView, textView, textView2, textView3, imageView, imageView2, textView4, shapeableImageView, textView5, linearLayout);
                                                                                i = R.id.indicators_details_scroll_view;
                                                                                if (((NestedScrollView) C3476e.h(viewInflate, R.id.indicators_details_scroll_view)) != null) {
                                                                                    return new C2196Ux0((ConstraintLayout) viewInflate, materialButton, materialButton2, c2274Vx0);
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
                                    }
                                }
                            }
                            throw new NullPointerException("Missing required view with ID: ".concat(viewH.getResources().getResourceName(i2)));
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
    }

    public IndicatorsDetailsBottomSheetDialogFragment(@NotNull Sd2 viewModelFactory) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        this.i = viewModelFactory;
        this.j = a.m;
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        C5500nO c5500nO = new C5500nO(this, 2);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new C3238cq0(new C3265cz0(this, 0), 1));
        return C2151Ui0.a(this, C2017Sp1.a.b(C4782jz0.class), new C3474dz0(interfaceC3770fO0A, 0), new C3684ez0(interfaceC3770fO0A), c5500nO);
    }

    @Override // com.api.feature.bottomsheetdialog.utils.SimpleBindingBottomSheetDialogFragment
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C2196Ux0> g() {
        return this.j;
    }

    @Override // com.api.core.bottomsheetdialogfragment.AbstractBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Object obj = this.g;
        Intrinsics.checkNotNull(obj);
        InterfaceC6396rf0<C1491Lx0> interfaceC6396rf0 = ((C4782jz0) obj).l;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new C3894fz0(viewLifecycleOwner, interfaceC6396rf0, null, this), 3);
        C2196Ux0 c2196Ux0I = i();
        c2196Ux0I.g.setOnClickListener(new ViewOnClickListenerC6713t9(this, 2));
        C2196Ux0 c2196Ux0I2 = i();
        c2196Ux0I2.e.setOnClickListener(new ViewOnClickListenerC3055bz0(this, 0));
    }
}
