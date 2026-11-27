package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import com.base.feature.robot.indicatorselection.screens.grouped_indicators.IndicatorSelectionGroupedIndicatorsBottomSheetDialogFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Qy0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1887Qy0 extends ViewPager2.e {
    public final /* synthetic */ IndicatorSelectionGroupedIndicatorsBottomSheetDialogFragment a;

    public C1887Qy0(IndicatorSelectionGroupedIndicatorsBottomSheetDialogFragment indicatorSelectionGroupedIndicatorsBottomSheetDialogFragment) {
        this.a = indicatorSelectionGroupedIndicatorsBottomSheetDialogFragment;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void c(int i) {
        Object obj = this.a.g;
        Intrinsics.checkNotNull(obj);
        Integer numValueOf = Integer.valueOf(i);
        GP1 gp1 = ((C0718Bz0) obj).q;
        gp1.getClass();
        gp1.m(null, numValueOf);
    }
}
