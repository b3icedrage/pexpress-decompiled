package com.base.feature.robot.robot.confirm_bottomsheet.screens.bet_cofirm;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.v;
import com.api.feature.bottomsheetdialog.utils.SimpleBindingBottomSheetDialogFragment;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.pexpress.tool.R;
import defpackage.C0690Bq;
import defpackage.C0768Cq;
import defpackage.C1083Gr;
import defpackage.C1317Jr;
import defpackage.C1631Nr;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2784ak0;
import defpackage.C3243cs;
import defpackage.C3452ds;
import defpackage.C3476e;
import defpackage.C3662es;
import defpackage.C5189lv;
import defpackage.C6399rg;
import defpackage.C7652xe;
import defpackage.EnumC4403iP0;
import defpackage.FP0;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC3770fO0;
import defpackage.InterfaceC6396rf0;
import defpackage.Lr;
import defpackage.Sd2;
import defpackage.T2;
import defpackage.XO0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/robot/robot/confirm_bottomsheet/screens/bet_cofirm/BetConfirmBottomSheetDialogFragment;", "Lcom/api/feature/bottomsheetdialog/utils/SimpleBindingBottomSheetDialogFragment;", "LLr;", "Les;", "FeatureRobotBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BetConfirmBottomSheetDialogFragment extends SimpleBindingBottomSheetDialogFragment<Lr, C3662es> {

    @NotNull
    public final Sd2 i;

    @NotNull
    public final a j;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C3662es> {
        public static final a m = new a(3, C3662es.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/robot/databinding/BetWarningViewBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final C3662es k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.bet_warning_view, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.amount_view;
            View viewH = C3476e.h(viewInflate, R.id.amount_view);
            if (viewH != null) {
                C3243cs c3243csB = C3243cs.b(viewH);
                i = R.id.bet_warning_values_container;
                if (((MaterialCardView) C3476e.h(viewInflate, R.id.bet_warning_values_container)) != null) {
                    i = R.id.confirm_button;
                    MaterialButton materialButton = (MaterialButton) C3476e.h(viewInflate, R.id.confirm_button);
                    if (materialButton != null) {
                        i = R.id.indicator_view;
                        View viewH2 = C3476e.h(viewInflate, R.id.indicator_view);
                        if (viewH2 != null) {
                            C3243cs c3243csB2 = C3243cs.b(viewH2);
                            i = R.id.one_click_deals_view;
                            View viewH3 = C3476e.h(viewInflate, R.id.one_click_deals_view);
                            if (viewH3 != null) {
                                C3452ds c3452dsB = C3452ds.b(viewH3);
                                i = R.id.one_click_deals_view_container;
                                if (((MaterialCardView) C3476e.h(viewInflate, R.id.one_click_deals_view_container)) != null) {
                                    i = R.id.strategy_view;
                                    View viewH4 = C3476e.h(viewInflate, R.id.strategy_view);
                                    if (viewH4 != null) {
                                        C3243cs c3243csB3 = C3243cs.b(viewH4);
                                        i = R.id.time_view;
                                        View viewH5 = C3476e.h(viewInflate, R.id.time_view);
                                        if (viewH5 != null) {
                                            C3243cs c3243csB4 = C3243cs.b(viewH5);
                                            i = R.id.title_image;
                                            ImageView imageView = (ImageView) C3476e.h(viewInflate, R.id.title_image);
                                            if (imageView != null) {
                                                i = R.id.title_text;
                                                TextView textView = (TextView) C3476e.h(viewInflate, R.id.title_text);
                                                if (textView != null) {
                                                    return new C3662es((ConstraintLayout) viewInflate, c3243csB, materialButton, c3243csB2, c3452dsB, c3243csB3, c3243csB4, imageView, textView);
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

    public BetConfirmBottomSheetDialogFragment(@NotNull Sd2 viewModelFactory) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        this.i = viewModelFactory;
        this.j = a.m;
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        C6399rg c6399rg = new C6399rg(this, 3);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new C0690Bq(new T2(this, 3), 1));
        return C2151Ui0.a(this, C2017Sp1.a.b(Lr.class), new C0768Cq(interfaceC3770fO0A, 1), new C1083Gr(interfaceC3770fO0A), c6399rg);
    }

    @Override // com.api.feature.bottomsheetdialog.utils.SimpleBindingBottomSheetDialogFragment
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C3662es> g() {
        return this.j;
    }

    @Override // com.api.feature.bottomsheetdialog.utils.BaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, R.style.CustomBottomSheetDialogTheme);
    }

    @Override // com.api.core.bottomsheetdialogfragment.AbstractBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Object obj = this.g;
        Intrinsics.checkNotNull(obj);
        InterfaceC6396rf0<C1631Nr> interfaceC6396rf0 = ((Lr) obj).e;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new C1317Jr(viewLifecycleOwner, interfaceC6396rf0, null, this), 3);
    }
}
