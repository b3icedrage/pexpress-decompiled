package defpackage;

import com.base.feature.robot.indicatorselection.screens.grouped_indicators.IndicatorSelectionGroupedIndicatorsBottomSheetDialogFragment;
import com.google.android.material.tabs.TabLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ry0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1965Ry0 implements TabLayout.d {
    public final /* synthetic */ IndicatorSelectionGroupedIndicatorsBottomSheetDialogFragment a;

    public C1965Ry0(IndicatorSelectionGroupedIndicatorsBottomSheetDialogFragment indicatorSelectionGroupedIndicatorsBottomSheetDialogFragment) {
        this.a = indicatorSelectionGroupedIndicatorsBottomSheetDialogFragment;
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void a(TabLayout.f tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void b(TabLayout.f tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        Object obj = this.a.g;
        Intrinsics.checkNotNull(obj);
        Integer numValueOf = Integer.valueOf(tab.c);
        GP1 gp1 = ((C0718Bz0) obj).q;
        gp1.getClass();
        gp1.m(null, numValueOf);
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void c(TabLayout.f tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
    }
}
