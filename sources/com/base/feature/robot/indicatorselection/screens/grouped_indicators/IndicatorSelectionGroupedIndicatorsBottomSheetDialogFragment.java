package com.base.feature.robot.indicatorselection.screens.grouped_indicators;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.v;
import com.base.feature.robot.utils.recyclerbottomsheet.RobotBottomSheetWithTabsDialogFragment;
import com.google.android.material.tabs.TabLayout;
import com.pexpress.tool.R;
import defpackage.AbstractC5603ns;
import defpackage.C0718Bz0;
import defpackage.C1699On1;
import defpackage.C1809Py0;
import defpackage.C1887Qy0;
import defpackage.C1965Ry0;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C4008gX1;
import defpackage.C5189lv;
import defpackage.C6881ty0;
import defpackage.C7078uu;
import defpackage.C7652xe;
import defpackage.EnumC2121Ty0;
import defpackage.FP0;
import defpackage.InterfaceC3902g10;
import defpackage.LL;
import defpackage.Q2;
import defpackage.S2;
import defpackage.Sd2;
import defpackage.T2;
import defpackage.WE;
import defpackage.XE;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/robot/indicatorselection/screens/grouped_indicators/IndicatorSelectionGroupedIndicatorsBottomSheetDialogFragment;", "Lcom/base/feature/robot/utils/recyclerbottomsheet/RobotBottomSheetWithTabsDialogFragment;", "Lty0;", "LBz0;", "FeatureRobotBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IndicatorSelectionGroupedIndicatorsBottomSheetDialogFragment extends RobotBottomSheetWithTabsDialogFragment<C6881ty0, C0718Bz0> {

    @NotNull
    public final Sd2 k;

    @NotNull
    public final AbstractC5603ns l;

    @NotNull
    public final InterfaceC3902g10 m;
    public boolean n;

    public IndicatorSelectionGroupedIndicatorsBottomSheetDialogFragment(@NotNull Sd2 viewModelFactory, @NotNull AbstractC5603ns bindingFactory, @NotNull InterfaceC3902g10 dialogsProvider) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(bindingFactory, "bindingFactory");
        Intrinsics.checkNotNullParameter(dialogsProvider, "dialogsProvider");
        this.k = viewModelFactory;
        this.l = bindingFactory;
        this.m = dialogsProvider;
        this.n = true;
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        return C2151Ui0.a(this, C2017Sp1.a.b(C0718Bz0.class), new S2(this, 3), new T2(this, 5), new Q2(this, 5));
    }

    @Override // com.base.feature.robot.utils.recyclerbottomsheet.RobotBottomSheetWithTabsDialogFragment
    public final C6881ty0 j() {
        return new C6881ty0(this, this.k, this.l);
    }

    @Override // com.base.feature.robot.utils.recyclerbottomsheet.RobotBottomSheetWithTabsDialogFragment
    @NotNull
    public final ArrayList k() {
        EnumC2121Ty0.d.getClass();
        ArrayList arrayList = EnumC2121Ty0.e;
        ArrayList arrayList2 = new ArrayList(XE.m(arrayList, 10));
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                WE.l();
                throw null;
            }
            String string = getString(LL.l((EnumC2121Ty0) obj));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            arrayList2.add(new C4008gX1(string, i));
            i = i2;
        }
        return arrayList2;
    }

    @Override // com.base.feature.robot.utils.recyclerbottomsheet.RobotBottomSheetWithTabsDialogFragment
    @NotNull
    /* JADX INFO: renamed from: l */
    public final String getI() {
        String string = getString(R.string.indicator_selection_text);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // com.base.feature.robot.utils.recyclerbottomsheet.RobotBottomSheetWithTabsDialogFragment
    public final void m() {
        this.n = false;
    }

    @Override // com.base.feature.robot.utils.recyclerbottomsheet.RobotBottomSheetWithTabsDialogFragment, com.api.core.bottomsheetdialogfragment.AbstractBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        C7078uu c7078uuI = i();
        C1965Ry0 c1965Ry0 = new C1965Ry0(this);
        ArrayList<TabLayout.c> arrayList = c7078uuI.g.O;
        if (!arrayList.contains(c1965Ry0)) {
            arrayList.add(c1965Ry0);
        }
        C7078uu c7078uuI2 = i();
        c7078uuI2.i.a(new C1887Qy0(this));
        Object obj = this.g;
        Intrinsics.checkNotNull(obj);
        C1699On1 c1699On1 = ((C0718Bz0) obj).r;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new C1809Py0(viewLifecycleOwner, c1699On1, null, this), 3);
    }
}
