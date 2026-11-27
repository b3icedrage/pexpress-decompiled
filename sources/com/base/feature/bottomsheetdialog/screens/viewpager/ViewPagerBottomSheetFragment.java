package com.base.feature.bottomsheetdialog.screens.viewpager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.api.feature.bottomsheetdialog.utils.SimpleBottomSheetWithDataFragment;
import com.google.android.material.button.MaterialButton;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;
import defpackage.AbstractC3405de2;
import defpackage.C2784ak0;
import defpackage.C2830au;
import defpackage.C3668eu;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC3371dV;
import defpackage.V00;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/bottomsheetdialog/screens/viewpager/ViewPagerBottomSheetFragment;", "Lcom/api/feature/bottomsheetdialog/utils/SimpleBottomSheetWithDataFragment;", "LV00;", "Leu;", "FeatureBottomSheetDialogBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ViewPagerBottomSheetFragment extends SimpleBottomSheetWithDataFragment<V00, C3668eu> {

    @NotNull
    public final a j;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, V00> {
        public static final a m = new a(3, V00.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/api/feature/bottomsheetdialog/databinding/DialogDefaultBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final V00 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            return V00.b(p0, viewGroup, zBooleanValue);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewPagerBottomSheetFragment(@NotNull AbstractC3405de2 defaultBottomSheetDataProvider, @NotNull InterfaceC3371dV defaultDialogCallbacks) {
        super(defaultBottomSheetDataProvider, defaultDialogCallbacks);
        Intrinsics.checkNotNullParameter(defaultBottomSheetDataProvider, "defaultBottomSheetDataProvider");
        Intrinsics.checkNotNullParameter(defaultDialogCallbacks, "defaultDialogCallbacks");
        this.j = a.m;
    }

    @Override // com.api.feature.bottomsheetdialog.utils.SimpleBottomSheetWithDataFragment
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, V00> g() {
        return this.j;
    }

    @Override // com.api.feature.bottomsheetdialog.utils.SimpleBottomSheetWithDataFragment
    public final void i(C3668eu c3668eu) {
        C3668eu data = c3668eu;
        Intrinsics.checkNotNullParameter(data, "data");
        V00 v00J = j();
        v00J.h.setAdapter(new C2830au(data));
        V00 v00J2 = j();
        ViewPager2 viewPager = j().h;
        Intrinsics.checkNotNullExpressionValue(viewPager, "viewPager");
        v00J2.g.setViewPager2(viewPager);
        RecyclerView.e adapter = j().h.getAdapter();
        if (adapter != null && adapter.c() <= 1) {
            DotsIndicator dotsIndicator = j().g;
            Intrinsics.checkNotNullExpressionValue(dotsIndicator, "dotsIndicator");
            dotsIndicator.setVisibility(8);
            ViewPager2 viewPager2 = j().h;
            Intrinsics.checkNotNullExpressionValue(viewPager2, "viewPager");
            Intrinsics.checkNotNullParameter(viewPager2, "<this>");
            View childAt = viewPager2.getChildAt(0);
            Intrinsics.c(childAt, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            ((RecyclerView) childAt).setOverScrollMode(2);
        }
        MaterialButton materialButton = j().e;
        Integer num = data.b;
        if (num != null) {
            materialButton.setText(num.intValue());
        }
        final Function0<Unit> function0 = data.c;
        if (function0 != null) {
            materialButton.setOnClickListener(new View.OnClickListener() { // from class: ge2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.dismiss();
                    function0.invoke();
                }
            });
        }
        if (j().e.hasOnClickListeners()) {
            return;
        }
        MaterialButton button = j().e;
        Intrinsics.checkNotNullExpressionValue(button, "button");
        button.setVisibility(8);
    }
}
