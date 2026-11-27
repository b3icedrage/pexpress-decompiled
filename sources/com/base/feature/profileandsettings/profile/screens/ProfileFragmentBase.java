package com.base.feature.profileandsettings.profile.screens;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.g;
import androidx.lifecycle.v;
import com.api.core.SimpleViewModelFragment;
import com.api.resources.CenteredToolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.pexpress.tool.R;
import defpackage.AbstractC8090zi1;
import defpackage.C0668Bi1;
import defpackage.C1621Nn1;
import defpackage.C1699On1;
import defpackage.C1759Ph1;
import defpackage.C1915Rh1;
import defpackage.C1993Sh1;
import defpackage.C2017Sp1;
import defpackage.C2071Th1;
import defpackage.C2149Uh1;
import defpackage.C2151Ui0;
import defpackage.C2227Vh1;
import defpackage.C2309Wh1;
import defpackage.C2413Xh1;
import defpackage.C2491Yh1;
import defpackage.C2569Zh1;
import defpackage.C2777ai1;
import defpackage.C2784ak0;
import defpackage.C3001bi1;
import defpackage.C3110cE;
import defpackage.C3210ci1;
import defpackage.C3238cq0;
import defpackage.C3265cz0;
import defpackage.C3420di1;
import defpackage.C3474dz0;
import defpackage.C3476e;
import defpackage.C4049gi1;
import defpackage.C4259hi1;
import defpackage.C4797k3;
import defpackage.C5189lv;
import defpackage.C5360mi1;
import defpackage.C5421n02;
import defpackage.C6561sS;
import defpackage.C6610sg0;
import defpackage.C7652xe;
import defpackage.EnumC4403iP0;
import defpackage.EnumC6804tc0;
import defpackage.FP0;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC3770fO0;
import defpackage.InterfaceC5910pK1;
import defpackage.InterfaceC6396rf0;
import defpackage.Sd2;
import defpackage.ViewOnClickListenerC3055bz0;
import defpackage.ViewOnClickListenerC5622ny0;
import defpackage.ViewOnClickListenerC6713t9;
import defpackage.XO0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/profileandsettings/profile/screens/ProfileFragmentBase;", "Lcom/api/core/SimpleViewModelFragment;", "Lzi1;", "Ldi1;", "FeatureProfileAndSettingsBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class ProfileFragmentBase extends SimpleViewModelFragment<AbstractC8090zi1, C3420di1> {

    @NotNull
    public final Sd2 j;

    @NotNull
    public final C3110cE k;

    @Nullable
    public final Integer l;
    public boolean m;

    @NotNull
    public final a n;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C3420di1> {
        public static final a m = new a(3, C3420di1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/account/setting/databinding/ProfileFragmentBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final C3420di1 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.profile_fragment, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.profile_app_bar;
            if (((AppBarLayout) C3476e.h(viewInflate, R.id.profile_app_bar)) != null) {
                i = R.id.profile_info_country;
                View viewH = C3476e.h(viewInflate, R.id.profile_info_country);
                if (viewH != null) {
                    C4049gi1 c4049gi1B = C4049gi1.b(viewH);
                    i = R.id.profile_info_email;
                    View viewH2 = C3476e.h(viewInflate, R.id.profile_info_email);
                    if (viewH2 != null) {
                        C4049gi1 c4049gi1B2 = C4049gi1.b(viewH2);
                        i = R.id.profile_info_id;
                        View viewH3 = C3476e.h(viewInflate, R.id.profile_info_id);
                        if (viewH3 != null) {
                            C4049gi1 c4049gi1B3 = C4049gi1.b(viewH3);
                            i = R.id.profile_input_error_label;
                            View viewH4 = C3476e.h(viewInflate, R.id.profile_input_error_label);
                            if (viewH4 != null) {
                                int i2 = R.id.profile_input_error_description_text;
                                TextView textView = (TextView) C3476e.h(viewH4, R.id.profile_input_error_description_text);
                                if (textView != null) {
                                    i2 = R.id.profile_input_error_label_icon;
                                    if (((ImageView) C3476e.h(viewH4, R.id.profile_input_error_label_icon)) != null) {
                                        C4259hi1 c4259hi1 = new C4259hi1((ConstraintLayout) viewH4, textView);
                                        i = R.id.profile_nickname_input;
                                        View viewH5 = C3476e.h(viewInflate, R.id.profile_nickname_input);
                                        if (viewH5 != null) {
                                            int i3 = R.id.profile_nickname_input_char_counter_text;
                                            TextView textView2 = (TextView) C3476e.h(viewH5, R.id.profile_nickname_input_char_counter_text);
                                            if (textView2 != null) {
                                                i3 = R.id.profile_nickname_input_edit_text;
                                                EditText editText = (EditText) C3476e.h(viewH5, R.id.profile_nickname_input_edit_text);
                                                if (editText != null) {
                                                    i3 = R.id.profile_nickname_input_lock_image;
                                                    ImageView imageView = (ImageView) C3476e.h(viewH5, R.id.profile_nickname_input_lock_image);
                                                    if (imageView != null) {
                                                        C5360mi1 c5360mi1 = new C5360mi1((ConstraintLayout) viewH5, textView2, editText, imageView);
                                                        i = R.id.profile_nickname_label;
                                                        TextView textView3 = (TextView) C3476e.h(viewInflate, R.id.profile_nickname_label);
                                                        if (textView3 != null) {
                                                            i = R.id.profile_toolbar;
                                                            CenteredToolbar centeredToolbar = (CenteredToolbar) C3476e.h(viewInflate, R.id.profile_toolbar);
                                                            if (centeredToolbar != null) {
                                                                i = R.id.profile_verification_text;
                                                                TextView textView4 = (TextView) C3476e.h(viewInflate, R.id.profile_verification_text);
                                                                if (textView4 != null) {
                                                                    return new C3420di1((ConstraintLayout) viewInflate, c4049gi1B, c4049gi1B2, c4049gi1B3, c4259hi1, c5360mi1, textView3, centeredToolbar, textView4);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            throw new NullPointerException("Missing required view with ID: ".concat(viewH5.getResources().getResourceName(i3)));
                                        }
                                    }
                                }
                                throw new NullPointerException("Missing required view with ID: ".concat(viewH4.getResources().getResourceName(i2)));
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
    }

    public ProfileFragmentBase(@NotNull Sd2 viewModelFactory, @NotNull C3110cE clipboardService) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(clipboardService, "clipboardService");
        this.j = viewModelFactory;
        this.k = clipboardService;
        this.l = Integer.valueOf(R.color.toolbarBackground);
        this.m = true;
        this.n = a.m;
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        C4797k3 c4797k3 = new C4797k3(this, 5);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new C3238cq0(new C3265cz0(this, 5), 5));
        return C2151Ui0.a(this, C2017Sp1.a.b(AbstractC8090zi1.class), new C3474dz0(interfaceC3770fO0A, 3), new C1759Ph1(interfaceC3770fO0A), c4797k3);
    }

    @Override // com.api.core.BaseFragment, defpackage.InterfaceC7271vo0
    public final void d() {
        this.m = true;
    }

    @Override // defpackage.InterfaceC2311Wi0
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C3420di1> g() {
        return this.n;
    }

    @Override // com.api.core.BaseFragment
    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final Integer getL() {
        return this.l;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        AbstractC8090zi1 abstractC8090zi1 = (AbstractC8090zi1) obj;
        abstractC8090zi1.getClass();
        C6561sS.g(abstractC8090zi1, new C0668Bi1(abstractC8090zi1, null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        C1621Nn1 c1621Nn1 = ((AbstractC8090zi1) obj).w;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new C2071Th1(viewLifecycleOwner, c1621Nn1, null, this), 3);
        Object obj2 = this.i;
        Intrinsics.checkNotNull(obj2);
        C1699On1 c1699On1 = ((AbstractC8090zi1) obj2).k;
        FP0 viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner2), null, new C2149Uh1(viewLifecycleOwner2, c1699On1, null, this), 3);
        Object obj3 = this.i;
        Intrinsics.checkNotNull(obj3);
        C1621Nn1 c1621Nn2 = ((AbstractC8090zi1) obj3).o;
        FP0 viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner3), null, new C1993Sh1(viewLifecycleOwner3, c1621Nn2, null, this), 3);
        Object obj4 = this.i;
        Intrinsics.checkNotNull(obj4);
        C6610sg0 c6610sg0 = ((AbstractC8090zi1) obj4).q;
        FP0 viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner4), null, new C2227Vh1(viewLifecycleOwner4, c6610sg0, null, this), 3);
        Object obj5 = this.i;
        Intrinsics.checkNotNull(obj5);
        InterfaceC5910pK1<EnumC6804tc0> interfaceC5910pK1 = ((AbstractC8090zi1) obj5).l;
        FP0 viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner5), null, new C2309Wh1(viewLifecycleOwner5, interfaceC5910pK1, null, this), 3);
        Object obj6 = this.i;
        Intrinsics.checkNotNull(obj6);
        AbstractC8090zi1.e eVar = ((AbstractC8090zi1) obj6).m;
        FP0 viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner6), null, new C2413Xh1(viewLifecycleOwner6, eVar, null, this), 3);
        Object obj7 = this.i;
        Intrinsics.checkNotNull(obj7);
        AbstractC8090zi1.f fVar = ((AbstractC8090zi1) obj7).r;
        FP0 viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner7), null, new C2491Yh1(viewLifecycleOwner7, fVar, null, this), 3);
        Object obj8 = this.i;
        Intrinsics.checkNotNull(obj8);
        AbstractC8090zi1.g gVar = ((AbstractC8090zi1) obj8).s;
        FP0 viewLifecycleOwner8 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner8, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner8), null, new C2569Zh1(viewLifecycleOwner8, gVar, null, this), 3);
        Object obj9 = this.i;
        Intrinsics.checkNotNull(obj9);
        C6610sg0 c6610sg1 = ((AbstractC8090zi1) obj9).t;
        FP0 viewLifecycleOwner9 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner9, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner9), null, new C2777ai1(viewLifecycleOwner9, c6610sg1, null, this), 3);
        Object obj10 = this.i;
        Intrinsics.checkNotNull(obj10);
        AbstractC8090zi1.i iVar = ((AbstractC8090zi1) obj10).u;
        FP0 viewLifecycleOwner10 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner10, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner10), null, new C3001bi1(viewLifecycleOwner10, iVar, null, this), 3);
        Object obj11 = this.i;
        Intrinsics.checkNotNull(obj11);
        InterfaceC6396rf0<Boolean> interfaceC6396rf0L = ((AbstractC8090zi1) obj11).l();
        FP0 viewLifecycleOwner11 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner11, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner11), null, new C3210ci1(viewLifecycleOwner11, interfaceC6396rf0L, null, this), 3);
        C3420di1 c3420di1K = k();
        EditText profileNicknameInputEditText = c3420di1K.j.g;
        Intrinsics.checkNotNullExpressionValue(profileNicknameInputEditText, "profileNicknameInputEditText");
        profileNicknameInputEditText.addTextChangedListener(new C1915Rh1(this));
        profileNicknameInputEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: Oh1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                Intrinsics.checkNotNullParameter(textView, "<unused var>");
                if (i != 6) {
                    return false;
                }
                Object obj12 = this.a.i;
                Intrinsics.checkNotNull(obj12);
                GP1 gp1 = ((AbstractC8090zi1) obj12).j;
                Boolean bool = Boolean.FALSE;
                gp1.getClass();
                gp1.m(null, bool);
                return false;
            }
        });
        c3420di1K.h.d.setOnClickListener(new ViewOnClickListenerC6713t9(this, 3));
        c3420di1K.m.setOnClickListener(new ViewOnClickListenerC3055bz0(this, 1));
        profileNicknameInputEditText.setOnClickListener(new ViewOnClickListenerC5622ny0(this, 1));
        C3420di1 c3420di1K2 = k();
        c3420di1K2.h.e.setText(getText(R.string.account_id));
        c3420di1K2.g.e.setText(getText(R.string.email_text));
        c3420di1K2.e.e.setText(getText(R.string.country_text));
        CenteredToolbar profileToolbar = k().l;
        Intrinsics.checkNotNullExpressionValue(profileToolbar, "profileToolbar");
        g gVarRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(gVarRequireActivity, "requireActivity(...)");
        C5421n02.a(profileToolbar, gVarRequireActivity);
    }
}
