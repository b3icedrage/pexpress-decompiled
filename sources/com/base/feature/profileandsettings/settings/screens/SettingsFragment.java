package com.base.feature.profileandsettings.settings.screens;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.g;
import androidx.lifecycle.v;
import com.api.core.SimpleViewModelFragment;
import com.api.resources.CenteredToolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.card.MaterialCardView;
import com.pexpress.tool.R;
import defpackage.AJ1;
import defpackage.BJ1;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2784ak0;
import defpackage.C3265cz0;
import defpackage.C3399dd0;
import defpackage.C3476e;
import defpackage.C4797k3;
import defpackage.C5189lv;
import defpackage.C5421n02;
import defpackage.C6876tw1;
import defpackage.C7357wD0;
import defpackage.C7652xe;
import defpackage.C7797yJ1;
import defpackage.C8007zJ1;
import defpackage.CJ1;
import defpackage.EnumC4403iP0;
import defpackage.FP0;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC3770fO0;
import defpackage.InterfaceC6396rf0;
import defpackage.JJ1;
import defpackage.Sd2;
import defpackage.ViewOnClickListenerC3055bz0;
import defpackage.ViewOnClickListenerC5007l3;
import defpackage.ViewOnClickListenerC6713t9;
import defpackage.XO0;
import defpackage.YZ1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/profileandsettings/settings/screens/SettingsFragment;", "Lcom/api/core/SimpleViewModelFragment;", "LJJ1;", "LCJ1;", "FeatureProfileAndSettingsBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SettingsFragment extends SimpleViewModelFragment<JJ1, CJ1> {

    @NotNull
    public final Sd2 j;

    @Nullable
    public final Integer k;

    @NotNull
    public final a l;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, CJ1> {
        public static final a m = new a(3, CJ1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/account/setting/databinding/SettingsFragmentBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final CJ1 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.settings_fragment, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.app_bar_layout;
            if (((AppBarLayout) C3476e.h(viewInflate, R.id.app_bar_layout)) != null) {
                i = R.id.background_block_1;
                if (C3476e.h(viewInflate, R.id.background_block_1) != null) {
                    i = R.id.centered_toolbar;
                    CenteredToolbar centeredToolbar = (CenteredToolbar) C3476e.h(viewInflate, R.id.centered_toolbar);
                    if (centeredToolbar != null) {
                        i = R.id.change_language_btn;
                        View viewH = C3476e.h(viewInflate, R.id.change_language_btn);
                        if (viewH != null) {
                            int i2 = R.id.item_title;
                            TextView textView = (TextView) C3476e.h(viewH, R.id.item_title);
                            if (textView != null) {
                                i2 = R.id.lang_icon;
                                AppCompatImageView appCompatImageView = (AppCompatImageView) C3476e.h(viewH, R.id.lang_icon);
                                if (appCompatImageView != null) {
                                    i2 = R.id.next_icon;
                                    if (((AppCompatImageView) C3476e.h(viewH, R.id.next_icon)) != null) {
                                        C7357wD0 c7357wD0 = new C7357wD0((MaterialCardView) viewH, textView, appCompatImageView);
                                        i = R.id.language_header;
                                        if (((TextView) C3476e.h(viewInflate, R.id.language_header)) != null) {
                                            i = R.id.one_click_deal_view;
                                            View viewH2 = C3476e.h(viewInflate, R.id.one_click_deal_view);
                                            if (viewH2 != null) {
                                                YZ1 yz1B = YZ1.b(viewH2);
                                                i = R.id.one_click_stop_robot;
                                                View viewH3 = C3476e.h(viewInflate, R.id.one_click_stop_robot);
                                                if (viewH3 != null) {
                                                    YZ1 yz1B2 = YZ1.b(viewH3);
                                                    i = R.id.root_container;
                                                    if (((ConstraintLayout) C3476e.h(viewInflate, R.id.root_container)) != null) {
                                                        i = R.id.trading_param_header;
                                                        if (((TextView) C3476e.h(viewInflate, R.id.trading_param_header)) != null) {
                                                            return new CJ1((ConstraintLayout) viewInflate, centeredToolbar, c7357wD0, yz1B, yz1B2);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            throw new NullPointerException("Missing required view with ID: ".concat(viewH.getResources().getResourceName(i2)));
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
    }

    public SettingsFragment(@NotNull Sd2 viewModelFactory) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        this.j = viewModelFactory;
        this.k = Integer.valueOf(R.color.toolbarBackground);
        this.l = a.m;
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        C4797k3 c4797k3 = new C4797k3(this, 8);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new C3265cz0(new C3399dd0(this, 3), 8));
        return C2151Ui0.a(this, C2017Sp1.a.b(JJ1.class), new C6876tw1(interfaceC3770fO0A, 1), new C7797yJ1(interfaceC3770fO0A), c4797k3);
    }

    @Override // defpackage.InterfaceC2311Wi0
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, CJ1> g() {
        return this.l;
    }

    @Override // com.api.core.BaseFragment
    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final Integer getK() {
        return this.k;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        InterfaceC6396rf0<Boolean> interfaceC6396rf0 = ((JJ1) obj).i;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new C8007zJ1(viewLifecycleOwner, interfaceC6396rf0, null, this), 3);
        Object obj2 = this.i;
        Intrinsics.checkNotNull(obj2);
        InterfaceC6396rf0<Boolean> interfaceC6396rf1 = ((JJ1) obj2).j;
        FP0 viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner2), null, new AJ1(viewLifecycleOwner2, interfaceC6396rf1, null, this), 3);
        Object obj3 = this.i;
        Intrinsics.checkNotNull(obj3);
        JJ1.a aVar = ((JJ1) obj3).k;
        FP0 viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner3), null, new BJ1(viewLifecycleOwner3, aVar, null, this), 3);
        CJ1 cj1K = k();
        cj1K.g.d.setOnClickListener(new ViewOnClickListenerC5007l3(this, 4));
        cj1K.h.d.setOnClickListener(new ViewOnClickListenerC6713t9(this, 4));
        cj1K.i.d.setOnClickListener(new ViewOnClickListenerC3055bz0(this, 2));
        CJ1 cj1K2 = k();
        YZ1 yz1 = cj1K2.h;
        yz1.h.setText(requireContext().getString(R.string.one_click_deals_text));
        yz1.e.setText(requireContext().getString(R.string.open_deals_without_confirm));
        YZ1 yz2 = cj1K2.i;
        yz2.h.setText(requireContext().getString(R.string.one_click_stop_text));
        yz2.e.setText(requireContext().getString(R.string.one_click_stop_description));
        CenteredToolbar centeredToolbar = cj1K2.e;
        Intrinsics.checkNotNullExpressionValue(centeredToolbar, "centeredToolbar");
        g gVarRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(gVarRequireActivity, "requireActivity(...)");
        C5421n02.a(centeredToolbar, gVarRequireActivity);
    }
}
