package com.impl.feature.registration.screens.duoauth;

import androidx.lifecycle.v;
import com.base.feature.registration.screens.duoauth.DuoAuthFragmentBase;
import defpackage.A40;
import defpackage.B40;
import defpackage.C1523Mi;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C3296d7;
import defpackage.C7331w6;
import defpackage.C7955z40;
import defpackage.EnumC4403iP0;
import defpackage.InterfaceC3770fO0;
import defpackage.InterfaceC5435n40;
import defpackage.L40;
import defpackage.Sd2;
import defpackage.XO0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/impl/feature/registration/screens/duoauth/DuoAuthFragmentImpl;", "Lcom/base/feature/registration/screens/duoauth/DuoAuthFragmentBase;", "LL40;", "FeatureRegistrationImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DuoAuthFragmentImpl extends DuoAuthFragmentBase<L40> {

    @NotNull
    public final Sd2 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DuoAuthFragmentImpl(@NotNull Sd2 viewModelFactory, @NotNull InterfaceC5435n40 bindingProvider, @NotNull C3296d7 onBackPressedProvider) {
        super(bindingProvider, onBackPressedProvider);
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(bindingProvider, "bindingProvider");
        Intrinsics.checkNotNullParameter(onBackPressedProvider, "onBackPressedProvider");
        this.l = viewModelFactory;
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        C1523Mi c1523Mi = new C1523Mi(this, 2);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new C7331w6(new C7955z40(this, 0), 1));
        return C2151Ui0.a(this, C2017Sp1.a.b(L40.class), new A40(interfaceC3770fO0A, 0), new B40(interfaceC3770fO0A), c1523Mi);
    }
}
