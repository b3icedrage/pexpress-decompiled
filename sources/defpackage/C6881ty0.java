package defpackage;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.base.feature.robot.indicatorselection.screens.grouped_indicators.IndicatorPageItemFragment;
import com.base.feature.robot.indicatorselection.screens.grouped_indicators.IndicatorSelectionGroupedIndicatorsBottomSheetDialogFragment;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ty0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6881ty0 extends FragmentStateAdapter {

    @NotNull
    public final Sd2 l;

    @NotNull
    public final AbstractC5603ns m;

    @NotNull
    public final ArrayList n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6881ty0(@NotNull IndicatorSelectionGroupedIndicatorsBottomSheetDialogFragment fragment, @NotNull Sd2 viewModelFactory, @NotNull AbstractC5603ns bindingFactory) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(bindingFactory, "bindingFactory");
        this.l = viewModelFactory;
        this.m = bindingFactory;
        EnumC2121Ty0.d.getClass();
        this.n = EnumC2121Ty0.e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int c() {
        return this.n.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    @NotNull
    public final Fragment q(int i) {
        return new IndicatorPageItemFragment(this.l, (EnumC2121Ty0) this.n.get(i), this.m);
    }
}
