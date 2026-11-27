package com.impl.feature.activation.register;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import androidx.lifecycle.v;
import androidx.lifecycle.x;
import com.base.feature.activation.screens.reregister.ReRegistrationFragment;
import defpackage.B9;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C3296d7;
import defpackage.C4747jn1;
import defpackage.C7059un1;
import defpackage.C9;
import defpackage.EnumC4403iP0;
import defpackage.InterfaceC2428Xm1;
import defpackage.InterfaceC3728fA0;
import defpackage.InterfaceC3770fO0;
import defpackage.InterfaceC5167ln1;
import defpackage.InterfaceC6856tq;
import defpackage.InterfaceC8112zo0;
import defpackage.O4;
import defpackage.RunnableC0909El;
import defpackage.S4;
import defpackage.T4;
import defpackage.U4;
import defpackage.ViewOnClickListenerC3273d10;
import defpackage.XO0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/impl/feature/activation/register/ReRegistrationFragmentImpl;", "Lcom/base/feature/activation/screens/reregister/ReRegistrationFragment;", "Lun1;", "FeatureActivationImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReRegistrationFragmentImpl extends ReRegistrationFragment<C7059un1> {

    @NotNull
    public final InterfaceC2428Xm1 t;

    @NotNull
    public final x.b u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReRegistrationFragmentImpl(@NotNull InterfaceC2428Xm1 binding, @NotNull InterfaceC5167ln1 resourceProvider, @NotNull x.b viewModelFactory, @NotNull C3296d7 activityOnBackPressedProvider, @NotNull InterfaceC3728fA0 initializeCurrenciesGroupViewUseCase, @NotNull InterfaceC8112zo0 highlightedResourcesProvider) {
        super(binding, resourceProvider, activityOnBackPressedProvider, initializeCurrenciesGroupViewUseCase, highlightedResourcesProvider);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(activityOnBackPressedProvider, "activityOnBackPressedProvider");
        Intrinsics.checkNotNullParameter(initializeCurrenciesGroupViewUseCase, "initializeCurrenciesGroupViewUseCase");
        Intrinsics.checkNotNullParameter(highlightedResourcesProvider, "highlightedResourcesProvider");
        this.t = binding;
        this.u = viewModelFactory;
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        O4 o4 = new O4(this, 7);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new T4(new S4(this, 3), 2));
        return C2151Ui0.a(this, C2017Sp1.a.b(C7059un1.class), new U4(interfaceC3770fO0A, 1), new C4747jn1(interfaceC3770fO0A), o4);
    }

    @Override // com.api.core.BindingFragment
    /* JADX INFO: renamed from: k */
    public final InterfaceC6856tq getH() {
        return this.t;
    }

    @Override // com.base.feature.activation.screens.reregister.ReRegistrationFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        view.post(new RunnableC0909El(this, 1));
    }

    @Override // com.base.feature.activation.screens.reregister.ReRegistrationFragment
    public final void x() {
        p();
        q();
        n();
        InterfaceC2428Xm1 interfaceC2428Xm1 = this.t;
        interfaceC2428Xm1.t().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: an1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                Object obj = this.a.i;
                Intrinsics.checkNotNull(obj);
                ((AbstractC1394Kq1) obj).s(z);
            }
        });
        interfaceC2428Xm1.M().setOnClickListener(new B9(this, 4));
        interfaceC2428Xm1.a().setOnClickListener(new C9(this, 1));
        interfaceC2428Xm1.M().setOnClickListener(new ViewOnClickListenerC3273d10(this, 3));
    }
}
