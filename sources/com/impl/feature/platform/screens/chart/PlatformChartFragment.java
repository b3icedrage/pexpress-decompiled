package com.impl.feature.platform.screens.chart;

import androidx.lifecycle.v;
import com.api.core.ViewModelFragment;
import defpackage.C0690Bq;
import defpackage.C0768Cq;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2761ae1;
import defpackage.C3194ce1;
import defpackage.C3613ee1;
import defpackage.C6399rg;
import defpackage.EnumC4403iP0;
import defpackage.InterfaceC3770fO0;
import defpackage.Sd2;
import defpackage.T2;
import defpackage.XO0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/impl/feature/platform/screens/chart/PlatformChartFragment;", "Lcom/api/core/ViewModelFragment;", "Lee1;", "FeaturePlatformImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PlatformChartFragment extends ViewModelFragment<C3613ee1> {

    @NotNull
    public final Sd2 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformChartFragment(@NotNull Sd2 viewModelFactory, @NotNull C2761ae1 bindingProvider) {
        super(bindingProvider);
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(bindingProvider, "bindingProvider");
        this.j = viewModelFactory;
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        C6399rg c6399rg = new C6399rg(this, 5);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new C0690Bq(new T2(this, 6), 2));
        return C2151Ui0.a(this, C2017Sp1.a.b(C3613ee1.class), new C0768Cq(interfaceC3770fO0A, 2), new C3194ce1(interfaceC3770fO0A), c6399rg);
    }
}
