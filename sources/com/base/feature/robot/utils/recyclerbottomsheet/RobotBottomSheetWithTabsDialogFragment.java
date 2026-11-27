package com.base.feature.robot.utils.recyclerbottomsheet;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.api.feature.bottomsheetdialog.utils.SimpleBindingBottomSheetDialogFragment;
import com.google.android.material.tabs.TabLayout;
import com.pexpress.tool.R;
import defpackage.AbstractC7066uq;
import defpackage.C2784ak0;
import defpackage.C3476e;
import defpackage.C4008gX1;
import defpackage.C6881ty0;
import defpackage.C7078uu;
import defpackage.InterfaceC1060Gj0;
import defpackage.XQ;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0005B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/base/feature/robot/utils/recyclerbottomsheet/RobotBottomSheetWithTabsDialogFragment;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "A", "Luq;", "VM", "Lcom/api/feature/bottomsheetdialog/utils/SimpleBindingBottomSheetDialogFragment;", "Luu;", "<init>", "()V", "FeatureRobotBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class RobotBottomSheetWithTabsDialogFragment<A extends FragmentStateAdapter, VM extends AbstractC7066uq> extends SimpleBindingBottomSheetDialogFragment<VM, C7078uu> {

    @NotNull
    public final String i = "";

    @NotNull
    public final a j = a.m;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C7078uu> {
        public static final a m = new a(3, C7078uu.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/robot/databinding/BottomSheetWithTabsFragmentBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final C7078uu k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.bottom_sheet_with_tabs_fragment, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.bottom_sheet_with_tabs_close_icon;
            ImageView imageView = (ImageView) C3476e.h(viewInflate, R.id.bottom_sheet_with_tabs_close_icon);
            if (imageView != null) {
                i = R.id.bottom_sheet_with_tabs_tab_container;
                TabLayout tabLayout = (TabLayout) C3476e.h(viewInflate, R.id.bottom_sheet_with_tabs_tab_container);
                if (tabLayout != null) {
                    i = R.id.bottom_sheet_with_tabs_title;
                    TextView textView = (TextView) C3476e.h(viewInflate, R.id.bottom_sheet_with_tabs_title);
                    if (textView != null) {
                        i = R.id.bottom_sheet_with_tabs_view_pager;
                        ViewPager2 viewPager2 = (ViewPager2) C3476e.h(viewInflate, R.id.bottom_sheet_with_tabs_view_pager);
                        if (viewPager2 != null) {
                            return new C7078uu((ConstraintLayout) viewInflate, imageView, tabLayout, textView, viewPager2);
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
    }

    @Override // com.api.feature.bottomsheetdialog.utils.SimpleBindingBottomSheetDialogFragment
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C7078uu> g() {
        return this.j;
    }

    @NotNull
    public abstract C6881ty0 j();

    @NotNull
    public abstract ArrayList k();

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public String getI() {
        return this.i;
    }

    public void m() {
    }

    @Override // com.api.feature.bottomsheetdialog.utils.BaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        m();
    }

    @Override // com.api.core.bottomsheetdialogfragment.AbstractBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        C7078uu c7078uuI = i();
        c7078uuI.e.setOnClickListener(new XQ(this, 2));
        c7078uuI.h.setText(getI());
        for (C4008gX1 c4008gX1 : k()) {
            TabLayout bottomSheetWithTabsTabContainer = c7078uuI.g;
            Intrinsics.checkNotNullExpressionValue(bottomSheetWithTabsTabContainer, "bottomSheetWithTabsTabContainer");
            TabLayout.f fVarG = bottomSheetWithTabsTabContainer.g();
            String str = c4008gX1.a;
            if (TextUtils.isEmpty(fVarG.b) && !TextUtils.isEmpty(str)) {
                fVarG.f.setContentDescription(str);
            }
            fVarG.a = str;
            TabLayout.h hVar = fVarG.f;
            if (hVar != null) {
                hVar.d();
            }
            bottomSheetWithTabsTabContainer.a(fVarG, c4008gX1.b, bottomSheetWithTabsTabContainer.e.isEmpty());
        }
        c7078uuI.i.setAdapter(j());
    }
}
