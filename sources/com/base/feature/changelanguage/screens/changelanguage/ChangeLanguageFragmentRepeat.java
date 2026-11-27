package com.base.feature.changelanguage.screens.changelanguage;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.g;
import androidx.recyclerview.widget.RecyclerView;
import com.api.feature.analytics.reporters.ReporterApi;
import com.api.resources.CenteredToolbar;
import defpackage.AbstractC5603ns;
import defpackage.ActivityC1745Pd;
import defpackage.C0639Az;
import defpackage.C1263Iz;
import defpackage.C3554eM0;
import defpackage.C4612j90;
import defpackage.C5189lv;
import defpackage.C5421n02;
import defpackage.C6610sg0;
import defpackage.C6682t10;
import defpackage.C7514wz;
import defpackage.C7652xe;
import defpackage.C8144zz;
import defpackage.FP0;
import defpackage.InterfaceC2130Ub0;
import defpackage.InterfaceC6856tq;
import defpackage.WL0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/base/feature/changelanguage/screens/changelanguage/ChangeLanguageFragmentRepeat;", "Lcom/base/feature/changelanguage/screens/changelanguage/ChangeLanguageFragmentAbstract;", "FeatureChangeLanguageBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ChangeLanguageFragmentRepeat extends ChangeLanguageFragmentAbstract {

    @NotNull
    public final WL0 o;

    @NotNull
    public final C4612j90 p;

    @NotNull
    public final ReporterApi q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeLanguageFragmentRepeat(@NotNull WL0 binding, @NotNull AbstractC5603ns languageFactory, @NotNull C3554eM0 resourcesProvider, @NotNull InterfaceC2130Ub0 callback, @NotNull C4612j90 eventsFlowsProvider, @NotNull ReporterApi reporter) {
        super(binding, languageFactory, resourcesProvider, callback);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(languageFactory, "languageFactory");
        Intrinsics.checkNotNullParameter(resourcesProvider, "resourcesProvider");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(eventsFlowsProvider, "eventsFlowsProvider");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.o = binding;
        this.p = eventsFlowsProvider;
        this.q = reporter;
    }

    @Override // com.api.core.BindingFragment
    /* JADX INFO: renamed from: k */
    public final InterfaceC6856tq getH() {
        return this.o;
    }

    @Override // com.base.feature.changelanguage.screens.changelanguage.ChangeLanguageFragmentAbstract, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        C6682t10 c6682t10 = new C6682t10();
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        C0639Az c0639Az = new C0639Az(1, obj, C1263Iz.class, "onNewSelect", "onNewSelect(Lcom/api/feature/changelanguage/models/LanguageModel;)V", 0, 0);
        C7514wz c7514wz = new C7514wz(this.k, this.l, this.m, c6682t10, c0639Az);
        WL0 wl0 = this.o;
        RecyclerView recyclerViewP = wl0.p();
        recyclerViewP.setAdapter(c7514wz);
        recyclerViewP.setHasFixedSize(true);
        Object obj2 = this.i;
        Intrinsics.checkNotNull(obj2);
        C6610sg0 c6610sg0 = ((C1263Iz) obj2).j;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new C8144zz(viewLifecycleOwner, c6610sg0, null, c7514wz), 3);
        CenteredToolbar centeredToolbarI = wl0.I();
        g gVarRequireActivity = requireActivity();
        Intrinsics.c(gVarRequireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        C5421n02.a(centeredToolbarI, (ActivityC1745Pd) gVarRequireActivity);
    }
}
