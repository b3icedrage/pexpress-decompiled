package com.impl.feature.robot.account;

import androidx.lifecycle.v;
import com.base.feature.robot.accountselection.screens.AccountSelectionFragment;
import defpackage.AbstractC5603ns;
import defpackage.C2;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C4333i4;
import defpackage.C4591j4;
import defpackage.C4801k4;
import defpackage.C5011l4;
import defpackage.C5854p4;
import defpackage.EnumC4403iP0;
import defpackage.InterfaceC3770fO0;
import defpackage.InterfaceC4119h3;
import defpackage.Sd2;
import defpackage.XO0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/impl/feature/robot/account/AccountSelectionFragmentImpl;", "Lcom/base/feature/robot/accountselection/screens/AccountSelectionFragment;", "FeatureRobotImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AccountSelectionFragmentImpl extends AccountSelectionFragment {

    @NotNull
    public final Sd2 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountSelectionFragmentImpl(@NotNull Sd2 viewModelFactory, @NotNull AbstractC5603ns bindingProviderFactory, @NotNull InterfaceC4119h3 accountItemResourceProvider) {
        super(bindingProviderFactory, accountItemResourceProvider);
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(bindingProviderFactory, "bindingProviderFactory");
        Intrinsics.checkNotNullParameter(accountItemResourceProvider, "accountItemResourceProvider");
        this.m = viewModelFactory;
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        C4333i4 c4333i4 = new C4333i4(this, 0);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new C4591j4(new C2(this, 1), 0));
        return C2151Ui0.a(this, C2017Sp1.a.b(C5854p4.class), new C4801k4(interfaceC3770fO0A, 0), new C5011l4(interfaceC3770fO0A), c4333i4);
    }
}
