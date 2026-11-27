package com.base.feature.changelanguage.screens.changelanguage;

import android.os.Bundle;
import android.view.View;
import com.api.core.ViewModelFragment;
import com.pexpress.tool.R;
import defpackage.AbstractC5603ns;
import defpackage.C0873Dz;
import defpackage.C1263Iz;
import defpackage.C3554eM0;
import defpackage.C4250hg0;
import defpackage.C5189lv;
import defpackage.C7652xe;
import defpackage.FP0;
import defpackage.InterfaceC2130Ub0;
import defpackage.ViewOnClickListenerC0717Bz;
import defpackage.WL0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/base/feature/changelanguage/screens/changelanguage/ChangeLanguageFragmentAbstract;", "Lcom/api/core/ViewModelFragment;", "LIz;", "FeatureChangeLanguageBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ChangeLanguageFragmentAbstract extends ViewModelFragment<C1263Iz> {

    @NotNull
    public final WL0 j;

    @NotNull
    public final AbstractC5603ns k;

    @NotNull
    public final C3554eM0 l;

    @NotNull
    public final InterfaceC2130Ub0 m;

    @Nullable
    public final Integer n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeLanguageFragmentAbstract(@NotNull WL0 binding, @NotNull AbstractC5603ns languageFactory, @NotNull C3554eM0 resourcesProvider, @NotNull InterfaceC2130Ub0 callback) {
        super(binding);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(languageFactory, "languageFactory");
        Intrinsics.checkNotNullParameter(resourcesProvider, "resourcesProvider");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.j = binding;
        this.k = languageFactory;
        this.l = resourcesProvider;
        this.m = callback;
        this.n = Integer.valueOf(R.color.toolbarBackground);
    }

    @Override // com.api.core.BaseFragment
    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final Integer getP() {
        return this.n;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ChangeLanguageFragmentRepeat changeLanguageFragmentRepeat = (ChangeLanguageFragmentRepeat) this;
        Object obj = changeLanguageFragmentRepeat.i;
        Intrinsics.checkNotNull(obj);
        C4250hg0 c4250hg0 = new C4250hg0(((C1263Iz) obj).i, 0);
        FP0 viewLifecycleOwner = changeLanguageFragmentRepeat.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new C0873Dz(viewLifecycleOwner, c4250hg0, null, changeLanguageFragmentRepeat), 3);
        changeLanguageFragmentRepeat.o.s().setOnClickListener(new ViewOnClickListenerC0717Bz(changeLanguageFragmentRepeat, 0));
    }
}
