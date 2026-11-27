package com.base.feature.launchapp.screens.launchapp;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.v;
import com.api.core.BaseFragment;
import com.api.core.ViewModelFragment;
import com.impl.feature.launchapp.screens.launchapp.LaunchAppFragmentImpl;
import defpackage.AbstractC6076q7;
import defpackage.C1621Nn1;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2879b71;
import defpackage.C3238cq0;
import defpackage.C3265cz0;
import defpackage.C3474dz0;
import defpackage.C5189lv;
import defpackage.C5500nO;
import defpackage.C5656o7;
import defpackage.C6120qK1;
import defpackage.C6561sS;
import defpackage.C7652xe;
import defpackage.EnumC4403iP0;
import defpackage.FP0;
import defpackage.InterfaceC2394Xb0;
import defpackage.InterfaceC3770fO0;
import defpackage.InterfaceC4813k7;
import defpackage.InterfaceC5569ni0;
import defpackage.KM0;
import defpackage.MM0;
import defpackage.NM0;
import defpackage.NN0;
import defpackage.OM0;
import defpackage.ON0;
import defpackage.PM0;
import defpackage.QM0;
import defpackage.Sd2;
import defpackage.WE;
import defpackage.XO0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/base/feature/launchapp/screens/launchapp/LaunchAppFragmentBase;", "Lcom/api/core/ViewModelFragment;", "LON0;", "FeatureLaunchAppBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class LaunchAppFragmentBase extends ViewModelFragment<ON0> {

    @NotNull
    public final Sd2 j;

    @NotNull
    public final InterfaceC2394Xb0 k;

    @NotNull
    public final C2879b71 l;

    @Nullable
    public AbstractC6076q7<String> m;

    @NotNull
    public final List<BaseFragment.a> n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LaunchAppFragmentBase(@NotNull Sd2 viewModelFactory, @NotNull InterfaceC2394Xb0 callback, @NotNull InterfaceC5569ni0 bindingProvider, @NotNull C2879b71 notificationsPermissionUseCase) {
        super(bindingProvider);
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(bindingProvider, "bindingProvider");
        Intrinsics.checkNotNullParameter(notificationsPermissionUseCase, "notificationsPermissionUseCase");
        this.j = viewModelFactory;
        this.k = callback;
        this.l = notificationsPermissionUseCase;
        this.n = WE.f(BaseFragment.a.b.a, BaseFragment.a.c.a);
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        C5500nO c5500nO = new C5500nO(this, 3);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new C3238cq0(new C3265cz0(this, 2), 2));
        return C2151Ui0.a(this, C2017Sp1.a.b(ON0.class), new C3474dz0(interfaceC3770fO0A, 1), new KM0(interfaceC3770fO0A), c5500nO);
    }

    @Override // com.api.core.BaseFragment
    @NotNull
    public final List<BaseFragment.a> i() {
        return this.n;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        LaunchAppFragmentImpl launchAppFragmentImpl = (LaunchAppFragmentImpl) this;
        Object obj = launchAppFragmentImpl.i;
        Intrinsics.checkNotNull(obj);
        ON0 on0 = (ON0) obj;
        C1621Nn1 c1621Nn1 = on0.l;
        FP0 viewLifecycleOwner = launchAppFragmentImpl.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new NM0(viewLifecycleOwner, c1621Nn1, null, on0), 3);
        C6120qK1 c6120qK1 = on0.o;
        FP0 viewLifecycleOwner2 = launchAppFragmentImpl.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner2), null, new MM0(viewLifecycleOwner2, c6120qK1, null, launchAppFragmentImpl), 3);
        FP0 viewLifecycleOwner3 = launchAppFragmentImpl.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner3), null, new OM0(viewLifecycleOwner3, on0.n, null, launchAppFragmentImpl), 3);
        Object obj2 = launchAppFragmentImpl.i;
        Intrinsics.checkNotNull(obj2);
        C1621Nn1 c1621Nn2 = ((ON0) obj2).k;
        FP0 viewLifecycleOwner4 = launchAppFragmentImpl.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner4), null, new PM0(viewLifecycleOwner4, c1621Nn2, null, launchAppFragmentImpl), 3);
        Object obj3 = launchAppFragmentImpl.i;
        Intrinsics.checkNotNull(obj3);
        C1621Nn1 c1621Nn3 = ((ON0) obj3).j;
        FP0 viewLifecycleOwner5 = launchAppFragmentImpl.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner5), null, new QM0(viewLifecycleOwner5, c1621Nn3, null, launchAppFragmentImpl), 3);
        this.m = registerForActivityResult(new C5656o7(), new InterfaceC4813k7() { // from class: JM0
            @Override // defpackage.InterfaceC4813k7
            public final void b(Object obj4) {
                Boolean isGranted = (Boolean) obj4;
                Intrinsics.checkNotNullParameter(isGranted, "isGranted");
                Object obj5 = this.a.i;
                Intrinsics.checkNotNull(obj5);
                ((ON0) obj5).i.b(isGranted.booleanValue());
            }
        });
        Object obj4 = this.i;
        Intrinsics.checkNotNull(obj4);
        ON0 on1 = (ON0) obj4;
        on1.getClass();
        C6561sS.g(on1, new NN0(on1, null));
    }
}
