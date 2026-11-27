package com.impl.feature.changelanguage.screens.changelanguage;

import androidx.lifecycle.v;
import androidx.lifecycle.x;
import com.api.feature.analytics.reporters.ReporterApi;
import com.base.feature.changelanguage.screens.changelanguage.ChangeLanguageFragmentRepeat;
import defpackage.AbstractC5603ns;
import defpackage.C0951Ez;
import defpackage.C1029Fz;
import defpackage.C1263Iz;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C3;
import defpackage.C3554eM0;
import defpackage.C4612j90;
import defpackage.EnumC4403iP0;
import defpackage.InterfaceC2130Ub0;
import defpackage.InterfaceC3770fO0;
import defpackage.P4;
import defpackage.S4;
import defpackage.WL0;
import defpackage.XO0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/impl/feature/changelanguage/screens/changelanguage/ChangeLanguageFragmentRepeatImpl;", "Lcom/base/feature/changelanguage/screens/changelanguage/ChangeLanguageFragmentRepeat;", "FeatureChangeLanguageImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChangeLanguageFragmentRepeatImpl extends ChangeLanguageFragmentRepeat {

    @NotNull
    public final x.b r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeLanguageFragmentRepeatImpl(@NotNull WL0 binding, @NotNull AbstractC5603ns languageFactory, @NotNull C3554eM0 resourcesProvider, @NotNull x.b viewModelFactory, @NotNull InterfaceC2130Ub0 callback, @NotNull C4612j90 eventsFlowsProvider, @NotNull ReporterApi reporter) {
        super(binding, languageFactory, resourcesProvider, callback, eventsFlowsProvider, reporter);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(languageFactory, "languageFactory");
        Intrinsics.checkNotNullParameter(resourcesProvider, "resourcesProvider");
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(eventsFlowsProvider, "eventsFlowsProvider");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.r = viewModelFactory;
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        P4 p4 = new P4(this, 4);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new S4(new C3(this, 1), 1));
        return C2151Ui0.a(this, C2017Sp1.a.b(C1263Iz.class), new C0951Ez(interfaceC3770fO0A, 0), new C1029Fz(interfaceC3770fO0A), p4);
    }
}
