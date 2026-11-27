package com.base.feature.robot.robot.confirm_bottomsheet.screens.stop_cofirm;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.v;
import com.api.feature.analytics.reporters.ReporterApi;
import com.api.feature.bottomsheetdialog.utils.SimpleBindingBottomSheetDialogFragment;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.pexpress.tool.R;
import defpackage.AQ1;
import defpackage.C1449Lj;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2784ak0;
import defpackage.C3238cq0;
import defpackage.C3265cz0;
import defpackage.C3452ds;
import defpackage.C3474dz0;
import defpackage.C3476e;
import defpackage.C5189lv;
import defpackage.C7652xe;
import defpackage.C8028zQ1;
import defpackage.DQ1;
import defpackage.EQ1;
import defpackage.EnumC4403iP0;
import defpackage.FP0;
import defpackage.IQ1;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC3770fO0;
import defpackage.InterfaceC6396rf0;
import defpackage.Sd2;
import defpackage.XO0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/robot/robot/confirm_bottomsheet/screens/stop_cofirm/StopConfirmBottomSheetDialogFragment;", "Lcom/api/feature/bottomsheetdialog/utils/SimpleBindingBottomSheetDialogFragment;", "LDQ1;", "LIQ1;", "FeatureRobotBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StopConfirmBottomSheetDialogFragment extends SimpleBindingBottomSheetDialogFragment<DQ1, IQ1> {

    @NotNull
    public final Sd2 i;

    @NotNull
    public final ReporterApi j;

    @NotNull
    public final a k;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, IQ1> {
        public static final a m = new a(3, IQ1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/robot/databinding/StopWarningViewBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final IQ1 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.stop_warning_view, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.cancel_button;
            MaterialButton materialButton = (MaterialButton) C3476e.h(viewInflate, R.id.cancel_button);
            if (materialButton != null) {
                i = R.id.collapse_view;
                if (((ImageView) C3476e.h(viewInflate, R.id.collapse_view)) != null) {
                    i = R.id.confirm_button;
                    MaterialButton materialButton2 = (MaterialButton) C3476e.h(viewInflate, R.id.confirm_button);
                    if (materialButton2 != null) {
                        i = R.id.one_click_stop_view;
                        View viewH = C3476e.h(viewInflate, R.id.one_click_stop_view);
                        if (viewH != null) {
                            C3452ds c3452dsB = C3452ds.b(viewH);
                            i = R.id.one_click_stop_view_container;
                            if (((MaterialCardView) C3476e.h(viewInflate, R.id.one_click_stop_view_container)) != null) {
                                i = R.id.title_image;
                                ImageView imageView = (ImageView) C3476e.h(viewInflate, R.id.title_image);
                                if (imageView != null) {
                                    i = R.id.title_text;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) C3476e.h(viewInflate, R.id.title_text);
                                    if (appCompatTextView != null) {
                                        return new IQ1((ConstraintLayout) viewInflate, materialButton, materialButton2, c3452dsB, imageView, appCompatTextView);
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

    public StopConfirmBottomSheetDialogFragment(@NotNull Sd2 viewModelFactory, @NotNull ReporterApi reporter) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.i = viewModelFactory;
        this.j = reporter;
        this.k = a.m;
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        C1449Lj c1449Lj = new C1449Lj(this, 4);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new C3238cq0(new C3265cz0(this, 9), 7));
        return C2151Ui0.a(this, C2017Sp1.a.b(DQ1.class), new C3474dz0(interfaceC3770fO0A, 5), new C8028zQ1(interfaceC3770fO0A), c1449Lj);
    }

    @Override // com.api.feature.bottomsheetdialog.utils.SimpleBindingBottomSheetDialogFragment
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, IQ1> g() {
        return this.k;
    }

    @Override // com.api.feature.bottomsheetdialog.utils.BaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, R.style.CustomBottomSheetDialogTheme);
    }

    @Override // com.api.core.bottomsheetdialogfragment.AbstractBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull final View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        Object obj = this.g;
        Intrinsics.checkNotNull(obj);
        InterfaceC6396rf0<EQ1> interfaceC6396rf0 = ((DQ1) obj).g;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new AQ1(viewLifecycleOwner, interfaceC6396rf0, null, this), 3);
        ImageView titleImage = i().i;
        Intrinsics.checkNotNullExpressionValue(titleImage, "titleImage");
        Intrinsics.checkNotNullParameter(titleImage, "<this>");
        Object drawable = titleImage.getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable != null) {
            animatable.start();
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: xQ1
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    view.post(new RunnableC3329dH(dialogInterface, 4));
                }
            });
        }
    }
}
