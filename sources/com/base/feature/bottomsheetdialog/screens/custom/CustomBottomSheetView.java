package com.base.feature.bottomsheetdialog.screens.custom;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.api.core.bottomsheetdialogfragment.AbstractBottomSheetDialogFragment;
import com.google.android.material.button.MaterialButton;
import com.pexpress.tool.R;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;
import defpackage.ActivityC1745Pd;
import defpackage.C2830au;
import defpackage.C3668eu;
import defpackage.InterfaceC3453ds0;
import defpackage.V00;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/base/feature/bottomsheetdialog/screens/custom/CustomBottomSheetView;", "Lcom/api/core/bottomsheetdialogfragment/AbstractBottomSheetDialogFragment;", "Lds0;", "FeatureBottomSheetDialogBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CustomBottomSheetView extends AbstractBottomSheetDialogFragment implements InterfaceC3453ds0 {

    @NotNull
    public final Context g;

    @Nullable
    public V00 h;

    public CustomBottomSheetView(@NotNull Context contextLocal) {
        Intrinsics.checkNotNullParameter(contextLocal, "contextLocal");
        this.g = contextLocal;
    }

    @Override // defpackage.InterfaceC3453ds0
    public final void b(@NotNull C3668eu value) {
        Intrinsics.checkNotNullParameter(value, "value");
        V00 v00 = this.h;
        Intrinsics.checkNotNull(v00);
        v00.h.setAdapter(new C2830au(value));
        V00 v01 = this.h;
        Intrinsics.checkNotNull(v01);
        DotsIndicator dotsIndicator = v01.g;
        V00 v02 = this.h;
        Intrinsics.checkNotNull(v02);
        ViewPager2 viewPager = v02.h;
        Intrinsics.checkNotNullExpressionValue(viewPager, "viewPager");
        dotsIndicator.setViewPager2(viewPager);
    }

    @NotNull
    public final CustomBottomSheetView i() {
        V00 v00 = this.h;
        Intrinsics.checkNotNull(v00);
        RecyclerView.e adapter = v00.h.getAdapter();
        if (adapter != null && adapter.c() <= 1) {
            V00 v01 = this.h;
            Intrinsics.checkNotNull(v01);
            DotsIndicator dotsIndicator = v01.g;
            Intrinsics.checkNotNullExpressionValue(dotsIndicator, "dotsIndicator");
            dotsIndicator.setVisibility(8);
            V00 v02 = this.h;
            Intrinsics.checkNotNull(v02);
            View childAt = v02.h.getChildAt(0);
            RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
            if (recyclerView != null) {
                recyclerView.setOverScrollMode(2);
            }
        }
        V00 v03 = this.h;
        Intrinsics.checkNotNull(v03);
        if (!v03.e.hasOnClickListeners()) {
            V00 v04 = this.h;
            Intrinsics.checkNotNull(v04);
            MaterialButton button = v04.e;
            Intrinsics.checkNotNullExpressionValue(button, "button");
            button.setVisibility(8);
        }
        Context context = this.g;
        Intrinsics.c(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        FragmentManager supportFragmentManager = ((ActivityC1745Pd) context).getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        show(supportFragmentManager, "BOTTOM_SHEET");
        return this;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.CustomBottomSheetDialogTheme);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        V00 v00 = this.h;
        Intrinsics.checkNotNull(v00);
        ConstraintLayout constraintLayout = v00.d;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.h = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
    }

    @Override // com.api.core.bottomsheetdialogfragment.AbstractBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull final View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: jR
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    view.post(new RunnableC4408iR(dialogInterface, 0));
                }
            });
        }
    }
}
