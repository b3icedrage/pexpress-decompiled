package com.impl.feature.registration.screens.forgetpassword;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.v;
import com.base.feature.registration.screens.forgetpassword.ForgetPasswordFragment;
import defpackage.B9;
import defpackage.C0664Bh0;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C3296d7;
import defpackage.C5500nO;
import defpackage.C7034uh0;
import defpackage.C7244vh0;
import defpackage.EnumC4403iP0;
import defpackage.InterfaceC3770fO0;
import defpackage.InterfaceC5985ph0;
import defpackage.RunnableC6824th0;
import defpackage.Sd2;
import defpackage.XO0;
import defpackage.Y5;
import defpackage.Z5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/impl/feature/registration/screens/forgetpassword/ForgetPasswordFragmentImpl;", "Lcom/base/feature/registration/screens/forgetpassword/ForgetPasswordFragment;", "LBh0;", "FeatureRegistrationImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ForgetPasswordFragmentImpl extends ForgetPasswordFragment<C0664Bh0> {

    @NotNull
    public final Sd2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForgetPasswordFragmentImpl(@NotNull Sd2 viewModelFactory, @NotNull InterfaceC5985ph0 bindingProvider, @NotNull C3296d7 activityOnBackPressedProvider) {
        super(bindingProvider, activityOnBackPressedProvider);
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(bindingProvider, "bindingProvider");
        Intrinsics.checkNotNullParameter(activityOnBackPressedProvider, "activityOnBackPressedProvider");
        this.o = viewModelFactory;
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        C5500nO c5500nO = new C5500nO(this, 1);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new Y5(new C7034uh0(this, 0), 1));
        return C2151Ui0.a(this, C2017Sp1.a.b(C0664Bh0.class), new Z5(interfaceC3770fO0A, 1), new C7244vh0(interfaceC3770fO0A), c5500nO);
    }

    @Override // com.base.feature.registration.screens.forgetpassword.ForgetPasswordFragment, com.api.library.registration.screens.email.EmailFieldFragment
    public final void n() {
        super.n();
        this.k.B().setOnClickListener(new B9(this, 3));
    }

    @Override // com.base.feature.registration.screens.forgetpassword.ForgetPasswordFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        view.post(new RunnableC6824th0(this, 0));
    }
}
