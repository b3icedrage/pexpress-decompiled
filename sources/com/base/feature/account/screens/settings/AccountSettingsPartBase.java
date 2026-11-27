package com.base.feature.account.screens.settings;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.v;
import com.api.feature.account.screens.settings.AccountSettingsPartApi;
import com.google.android.material.button.MaterialButton;
import com.pexpress.tool.R;
import defpackage.A4;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2784ak0;
import defpackage.C3476e;
import defpackage.C5109lY1;
import defpackage.C5829ox0;
import defpackage.C6693t4;
import defpackage.C7113v4;
import defpackage.C7323w4;
import defpackage.C7476wm1;
import defpackage.C7534x4;
import defpackage.C7652xe;
import defpackage.C7744y4;
import defpackage.EnumC4403iP0;
import defpackage.G4;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC3770fO0;
import defpackage.L2;
import defpackage.Sd2;
import defpackage.ViewOnClickListenerC6273r4;
import defpackage.ViewOnClickListenerC6483s4;
import defpackage.ViewOnClickListenerC6903u4;
import defpackage.XO0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/base/feature/account/screens/settings/AccountSettingsPartBase;", "Lcom/api/feature/account/screens/settings/AccountSettingsPartApi;", "LA4;", "FeatureAccountBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AccountSettingsPartBase extends AccountSettingsPartApi<A4> {

    @NotNull
    public final Sd2 l;

    @NotNull
    public final C5829ox0 m;

    @NotNull
    public final a n;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, A4> {
        public static final a m = new a(3, A4.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/account/databinding/AccountSettingsPartBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final A4 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.account_settings_part, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.account_settings_profile_button;
            View viewH = C3476e.h(viewInflate, R.id.account_settings_profile_button);
            if (viewH != null) {
                MaterialButton materialButton = (MaterialButton) viewH;
                L2 l2 = new L2(materialButton, materialButton);
                View viewH2 = C3476e.h(viewInflate, R.id.account_settings_settings_button);
                if (viewH2 != null) {
                    MaterialButton materialButton2 = (MaterialButton) viewH2;
                    L2 l3 = new L2(materialButton2, materialButton2);
                    View viewH3 = C3476e.h(viewInflate, R.id.in_app_review_button);
                    if (viewH3 != null) {
                        MaterialButton materialButton3 = (MaterialButton) viewH3;
                        return new A4((ConstraintLayout) viewInflate, l2, l3, new C7476wm1(materialButton3, materialButton3));
                    }
                    i = R.id.in_app_review_button;
                } else {
                    i = R.id.account_settings_settings_button;
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
    }

    public AccountSettingsPartBase(@NotNull Sd2 viewModelFactory, @NotNull C5829ox0 inAppReviewLocalExperiment) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(inAppReviewLocalExperiment, "inAppReviewLocalExperiment");
        this.l = viewModelFactory;
        this.m = inAppReviewLocalExperiment;
        this.n = a.m;
    }

    @Override // defpackage.InterfaceC3092c81
    public final void a() {
        A4 a4 = (A4) k();
        MaterialButton materialButton = a4.g.e;
        materialButton.setText(requireContext().getString(R.string.settings_text));
        Intrinsics.checkNotNull(materialButton);
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = C7652xe.f(this);
        Integer numValueOf = Integer.valueOf(R.drawable.ic_account_settings_settings);
        Integer numValueOf2 = Integer.valueOf(R.drawable.ic_right_arrow);
        C5109lY1.b(materialButton, lifecycleCoroutineScopeImplF, numValueOf, numValueOf2);
        materialButton.setOnClickListener(new ViewOnClickListenerC6273r4(this, 0));
        MaterialButton materialButton2 = a4.e.e;
        materialButton2.setText(requireContext().getString(R.string.profile_tittle));
        Intrinsics.checkNotNull(materialButton2);
        C5109lY1.b(materialButton2, C7652xe.f(this), Integer.valueOf(R.drawable.ic_account_settings_profile), numValueOf2);
        materialButton2.setOnClickListener(new ViewOnClickListenerC6483s4(this, 0));
        C7476wm1 c7476wm1 = ((A4) k()).h;
        MaterialButton materialButton3 = c7476wm1.d;
        Intrinsics.checkNotNullExpressionValue(materialButton3, "getRoot(...)");
        materialButton3.setVisibility(this.m.o() ? 0 : 8);
        MaterialButton materialButton4 = c7476wm1.e;
        materialButton4.setText(R.string.rate_us);
        Intrinsics.checkNotNull(materialButton4);
        C5109lY1.b(materialButton4, C7652xe.f(this), Integer.valueOf(R.drawable.ic_rate_app), numValueOf2);
        materialButton4.setOnClickListener(new ViewOnClickListenerC6903u4(this, 0));
        Intrinsics.checkNotNullExpressionValue(materialButton4, "with(...)");
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        C6693t4 c6693t4 = new C6693t4(this, 0);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new C7323w4(new C7113v4(this, 0), 0));
        return C2151Ui0.a(this, C2017Sp1.a.b(G4.class), new C7534x4(interfaceC3770fO0A, 0), new C7744y4(interfaceC3770fO0A), c6693t4);
    }

    @Override // defpackage.InterfaceC2311Wi0
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, A4> g() {
        return this.n;
    }
}
