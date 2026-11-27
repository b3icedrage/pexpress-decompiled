package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import com.base.feature.stub.screens.onboarding.StubOnboardingFragmentBase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: zT1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8037zT1 extends ViewPager2.e {
    public final /* synthetic */ StubOnboardingFragmentBase a;

    public C8037zT1(StubOnboardingFragmentBase stubOnboardingFragmentBase) {
        this.a = stubOnboardingFragmentBase;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void c(int i) {
        Object obj = this.a.i;
        Intrinsics.checkNotNull(obj);
        GP1 gp1 = ((FT1) obj).f;
        Integer numValueOf = Integer.valueOf(i);
        gp1.getClass();
        gp1.m(null, numValueOf);
    }
}
