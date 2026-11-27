package defpackage;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.base.feature.stub.screens.onboarding.StubOnboardingFragmentBase;
import com.base.feature.stub.screens.onboarding.page_item.StubOnboardingItemFragment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: sT1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6566sT1 extends FragmentStateAdapter {
    public final int l;

    @NotNull
    public final Sd2 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6566sT1(@NotNull StubOnboardingFragmentBase stubOnboardingFragment, int i, @NotNull Sd2 viewModelFactory) {
        super(stubOnboardingFragment);
        Intrinsics.checkNotNullParameter(stubOnboardingFragment, "stubOnboardingFragment");
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        this.l = i;
        this.m = viewModelFactory;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int c() {
        return this.l;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    @NotNull
    public final Fragment q(int i) {
        return new StubOnboardingItemFragment(i, this.m);
    }
}
