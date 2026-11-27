package defpackage;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.base.feature.onboarding.screens.tutorial.TutorialFragment;
import com.base.feature.onboarding.screens.tutorial.TutorialPageFragmentBase;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: w52, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7330w52 extends FragmentStateAdapter {
    public final int l;

    @NotNull
    public final Sd2 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7330w52(@NotNull TutorialFragment tutorialFragment, int i, @NotNull Sd2 tutorialViewModelFactory) {
        super(tutorialFragment);
        Intrinsics.checkNotNullParameter(tutorialFragment, "tutorialFragment");
        Intrinsics.checkNotNullParameter(tutorialViewModelFactory, "tutorialViewModelFactory");
        this.l = i;
        this.m = tutorialViewModelFactory;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int c() {
        return this.l;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    @NotNull
    public final Fragment q(int i) {
        return new TutorialPageFragmentBase(i, this.m);
    }
}
