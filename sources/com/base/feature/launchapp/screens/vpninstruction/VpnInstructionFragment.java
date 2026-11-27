package com.base.feature.launchapp.screens.vpninstruction;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.g;
import androidx.lifecycle.v;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import com.api.core.SimpleViewModelFragment;
import com.api.resources.CenteredToolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import com.pexpress.tool.R;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2229Vi0;
import defpackage.C2784ak0;
import defpackage.C2835av1;
import defpackage.C3476e;
import defpackage.C3618ef2;
import defpackage.C4248hf2;
import defpackage.C4716jf2;
import defpackage.C4926kf2;
import defpackage.C5189lv;
import defpackage.C5421n02;
import defpackage.C6189qf2;
import defpackage.C6333rM;
import defpackage.C8056za;
import defpackage.EnumC4403iP0;
import defpackage.F6;
import defpackage.H6;
import defpackage.I6;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC3199cf2;
import defpackage.InterfaceC3770fO0;
import defpackage.Sd2;
import defpackage.ViewOnClickListenerC0792Cy;
import defpackage.XO0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/launchapp/screens/vpninstruction/VpnInstructionFragment;", "Lcom/api/core/SimpleViewModelFragment;", "Lkf2;", "LVi0;", "FeatureLaunchAppBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VpnInstructionFragment extends SimpleViewModelFragment<C4926kf2, C2229Vi0> {

    @NotNull
    public final Sd2 j;

    @NotNull
    public final C6189qf2 k;

    @NotNull
    public final InterfaceC3199cf2 l;
    public final int m;

    @NotNull
    public final a n;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C2229Vi0> {
        public static final a m = new a(3, C2229Vi0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/launchapp/databinding/FragmentVpnInstructionBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final C2229Vi0 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.fragment_vpn_instruction, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.appBarLayout;
            if (((AppBarLayout) C3476e.h(viewInflate, R.id.appBarLayout)) != null) {
                i = R.id.downloadVpnButton;
                MaterialButton materialButton = (MaterialButton) C3476e.h(viewInflate, R.id.downloadVpnButton);
                if (materialButton != null) {
                    i = R.id.toolbar;
                    CenteredToolbar centeredToolbar = (CenteredToolbar) C3476e.h(viewInflate, R.id.toolbar);
                    if (centeredToolbar != null) {
                        i = R.id.vpnRecyclerView;
                        RecyclerView recyclerView = (RecyclerView) C3476e.h(viewInflate, R.id.vpnRecyclerView);
                        if (recyclerView != null) {
                            return new C2229Vi0((ConstraintLayout) viewInflate, recyclerView, centeredToolbar, materialButton);
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
    }

    public VpnInstructionFragment(@NotNull Sd2 viewModelFactory, @NotNull C6189qf2 resourceProvider, @NotNull InterfaceC3199cf2 callback) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.j = viewModelFactory;
        this.k = resourceProvider;
        this.l = callback;
        this.m = R.color.toolbarBackground;
        this.n = a.m;
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        F6 f6 = new F6(this, 3);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new I6(new H6(this, 4), 6));
        return C2151Ui0.a(this, C2017Sp1.a.b(C4926kf2.class), new C2835av1(interfaceC3770fO0A, 2), new C3618ef2(interfaceC3770fO0A), f6);
    }

    @Override // defpackage.InterfaceC2311Wi0
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C2229Vi0> g() {
        return this.n;
    }

    @Override // com.api.core.BaseFragment
    @NotNull
    /* JADX INFO: renamed from: j */
    public final Integer getL() {
        return Integer.valueOf(this.m);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        C4248hf2 vpnAdapter = new C4248hf2(C4248hf2.e);
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        C4926kf2 c4926kf2 = (C4926kf2) obj;
        c4926kf2.getClass();
        Intrinsics.checkNotNullParameter(vpnAdapter, "vpnAdapter");
        C5189lv.k(C8056za.j(c4926kf2), null, new C4716jf2(vpnAdapter, c4926kf2, null), 3);
        k().h.setAdapter(vpnAdapter);
        q qVar = new q(requireContext(), 1);
        Context context = this.k.a;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(context, "<this>");
        Drawable drawable = C6333rM.getDrawable(context, R.drawable.vpn_separator);
        if (drawable == null) {
            throw new IllegalStateException("Returned drawable was null due to an internal error.");
        }
        qVar.a = drawable;
        k().h.g(qVar);
        CenteredToolbar toolbar = k().g;
        Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        g gVarRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(gVarRequireActivity, "requireActivity(...)");
        C5421n02.a(toolbar, gVarRequireActivity);
        C2229Vi0 c2229Vi0K = k();
        c2229Vi0K.e.setOnClickListener(new ViewOnClickListenerC0792Cy(this, 4));
    }
}
