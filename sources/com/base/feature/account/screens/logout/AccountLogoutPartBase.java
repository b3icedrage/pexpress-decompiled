package com.base.feature.account.screens.logout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.v;
import com.api.feature.account.screens.logout.AccountLogoutPartApi;
import com.google.android.material.button.MaterialButton;
import com.pexpress.tool.R;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2784ak0;
import defpackage.C3476e;
import defpackage.C4797k3;
import defpackage.C5109lY1;
import defpackage.C5220m3;
import defpackage.C5430n3;
import defpackage.C5640o3;
import defpackage.C5850p3;
import defpackage.C6269r3;
import defpackage.C6333rM;
import defpackage.C7109v3;
import defpackage.C7652xe;
import defpackage.EnumC4403iP0;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC3770fO0;
import defpackage.L2;
import defpackage.Sd2;
import defpackage.ViewOnClickListenerC5007l3;
import defpackage.XO0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/base/feature/account/screens/logout/AccountLogoutPartBase;", "Lcom/api/feature/account/screens/logout/AccountLogoutPartApi;", "Lr3;", "FeatureAccountBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AccountLogoutPartBase extends AccountLogoutPartApi<C6269r3> {

    @NotNull
    public final Sd2 l;

    @NotNull
    public final a m;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C6269r3> {
        public static final a m = new a(3, C6269r3.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/account/databinding/AccountLogoutPartBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final C6269r3 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.account_logout_part, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            View viewH = C3476e.h(viewInflate, R.id.account_logout_logout_button);
            if (viewH == null) {
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.account_logout_logout_button)));
            }
            MaterialButton materialButton = (MaterialButton) viewH;
            return new C6269r3((ConstraintLayout) viewInflate, new L2(materialButton, materialButton));
        }
    }

    public AccountLogoutPartBase(@NotNull Sd2 viewModelFactory) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        this.l = viewModelFactory;
        this.m = a.m;
    }

    @Override // defpackage.InterfaceC3092c81
    public final void a() {
        MaterialButton materialButton = ((C6269r3) k()).e.e;
        materialButton.setText(requireContext().getText(R.string.log_out_text));
        materialButton.setTextColor(C6333rM.getColor(requireContext(), R.color.error));
        Intrinsics.checkNotNull(materialButton);
        C5109lY1.c(materialButton, C7652xe.f(this), Integer.valueOf(R.drawable.ic_account_logout), null, 28);
        materialButton.setOnClickListener(new ViewOnClickListenerC5007l3(this, 0));
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        C4797k3 c4797k3 = new C4797k3(this, 0);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new C5430n3(new C5220m3(this, 0), 0));
        return C2151Ui0.a(this, C2017Sp1.a.b(C7109v3.class), new C5640o3(interfaceC3770fO0A, 0), new C5850p3(interfaceC3770fO0A), c4797k3);
    }

    @Override // defpackage.InterfaceC2311Wi0
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C6269r3> g() {
        return this.m;
    }
}
