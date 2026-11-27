package com.base.feature.account.screens.maininfo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.c;
import androidx.lifecycle.g;
import androidx.lifecycle.v;
import com.api.feature.account.screens.maininfo.AccountMainInfoPartApi;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.pexpress.tool.R;
import defpackage.A3;
import defpackage.AbstractC5652o6;
import defpackage.B3;
import defpackage.C1621Nn1;
import defpackage.C1883Qx;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2784ak0;
import defpackage.C3;
import defpackage.C3110cE;
import defpackage.C3435dm0;
import defpackage.C3476e;
import defpackage.C4466ii;
import defpackage.C5189lv;
import defpackage.C6610sg0;
import defpackage.C6911u6;
import defpackage.C7530x3;
import defpackage.C7652xe;
import defpackage.D3;
import defpackage.E3;
import defpackage.EnumC1796Pu;
import defpackage.EnumC4403iP0;
import defpackage.EnumC7035uh1;
import defpackage.F3;
import defpackage.FP0;
import defpackage.G3;
import defpackage.GP1;
import defpackage.H3;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC3770fO0;
import defpackage.InterfaceC6396rf0;
import defpackage.J3;
import defpackage.K3;
import defpackage.L3;
import defpackage.SV0;
import defpackage.Sd2;
import defpackage.ViewOnClickListenerC7740y3;
import defpackage.ViewOnClickListenerC7950z3;
import defpackage.XO0;
import kotlin.Metadata;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/base/feature/account/screens/maininfo/AccountMainInfoPartBase;", "Lcom/api/feature/account/screens/maininfo/AccountMainInfoPartApi;", "LJ3;", "FeatureAccountBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AccountMainInfoPartBase extends AccountMainInfoPartApi<J3> {

    @NotNull
    public final Sd2 l;

    @NotNull
    public final C3110cE m;

    @NotNull
    public final a n;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, J3> {
        public static final a m = new a(3, J3.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/account/databinding/AccountMainInfoPartBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final J3 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.account_main_info_part, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.account_main_info_activation;
            View viewH = C3476e.h(viewInflate, R.id.account_main_info_activation);
            if (viewH != null) {
                int i2 = R.id.main_info_activation_step_action_text;
                TextView textView = (TextView) C3476e.h(viewH, R.id.main_info_activation_step_action_text);
                if (textView != null) {
                    i2 = R.id.main_info_activation_step_counter;
                    TextView textView2 = (TextView) C3476e.h(viewH, R.id.main_info_activation_step_counter);
                    if (textView2 != null) {
                        i2 = R.id.main_info_activation_step_duration_text;
                        TextView textView3 = (TextView) C3476e.h(viewH, R.id.main_info_activation_step_duration_text);
                        if (textView3 != null) {
                            i2 = R.id.main_info_activation_step_image;
                            ImageView imageView = (ImageView) C3476e.h(viewH, R.id.main_info_activation_step_image);
                            if (imageView != null) {
                                i2 = R.id.main_info_activation_step_progress;
                                ProgressBar progressBar = (ProgressBar) C3476e.h(viewH, R.id.main_info_activation_step_progress);
                                if (progressBar != null) {
                                    i2 = R.id.main_info_activation_step_title;
                                    if (((TextView) C3476e.h(viewH, R.id.main_info_activation_step_title)) != null) {
                                        SV0 sv0 = new SV0((MaterialCardView) viewH, textView, textView2, textView3, imageView, progressBar);
                                        i = R.id.account_main_info_avatar_image;
                                        ShapeableImageView shapeableImageView = (ShapeableImageView) C3476e.h(viewInflate, R.id.account_main_info_avatar_image);
                                        if (shapeableImageView != null) {
                                            i = R.id.account_main_info_header_clickable_area;
                                            View viewH2 = C3476e.h(viewInflate, R.id.account_main_info_header_clickable_area);
                                            if (viewH2 != null) {
                                                i = R.id.account_main_info_id_text;
                                                if (((TextView) C3476e.h(viewInflate, R.id.account_main_info_id_text)) != null) {
                                                    i = R.id.account_main_info_id_value;
                                                    TextView textView4 = (TextView) C3476e.h(viewInflate, R.id.account_main_info_id_value);
                                                    if (textView4 != null) {
                                                        i = R.id.account_main_info_indicator_icon;
                                                        ImageView imageView2 = (ImageView) C3476e.h(viewInflate, R.id.account_main_info_indicator_icon);
                                                        if (imageView2 != null) {
                                                            i = R.id.account_main_info_nickname_text;
                                                            TextView textView5 = (TextView) C3476e.h(viewInflate, R.id.account_main_info_nickname_text);
                                                            if (textView5 != null) {
                                                                return new J3((ConstraintLayout) viewInflate, sv0, shapeableImageView, viewH2, textView4, imageView2, textView5);
                                                            }
                                                        }
                                                    }
                                                }
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
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
    }

    public AccountMainInfoPartBase(@NotNull Sd2 viewModelFactory, @NotNull C3110cE clipboardService) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(clipboardService, "clipboardService");
        this.l = viewModelFactory;
        this.m = clipboardService;
        this.n = a.m;
    }

    public static final void l(AccountMainInfoPartBase accountMainInfoPartBase, C6911u6 c6911u6) {
        ImageView accountMainInfoIndicatorIcon = ((J3) accountMainInfoPartBase.k()).j;
        Intrinsics.checkNotNullExpressionValue(accountMainInfoIndicatorIcon, "accountMainInfoIndicatorIcon");
        C3435dm0.e(accountMainInfoIndicatorIcon, R.drawable.ic_warning_small, EnumC7035uh1.g);
        SV0 sv0 = ((J3) accountMainInfoPartBase.k()).e;
        sv0.e.setText(c6911u6.h);
        sv0.g.setText(c6911u6.d);
        sv0.h.setText(c6911u6.f);
        ImageView mainInfoActivationStepImage = sv0.i;
        Intrinsics.checkNotNullExpressionValue(mainInfoActivationStepImage, "mainInfoActivationStepImage");
        C3435dm0.f(mainInfoActivationStepImage, c6911u6.g);
        ProgressBar setProgress = sv0.j;
        Intrinsics.checkNotNullExpressionValue(setProgress, "mainInfoActivationStepProgress");
        Intrinsics.checkNotNullParameter(setProgress, "$this$setProgress");
        setProgress.setProgress((int) ((c6911u6.e / 100.0d) * ((double) setProgress.getMax())));
    }

    @Override // defpackage.InterfaceC3092c81
    public final void a() {
        J3 j3 = (J3) k();
        j3.e.d.setOnClickListener(new ViewOnClickListenerC7740y3(this, 0));
        j3.h.setOnClickListener(new ViewOnClickListenerC7950z3(this, 0));
        J3 j4 = (J3) k();
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        L3.c cVarP = ((K3) obj).p();
        g.b minActiveState = g.b.h;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new F3(viewLifecycleOwner, cVarP, null, j4), 3);
        Object obj2 = this.i;
        Intrinsics.checkNotNull(obj2);
        C1621Nn1 c1621Nn1N = ((K3) obj2).n();
        FP0 viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner2), null, new G3(viewLifecycleOwner2, c1621Nn1N, null, this), 3);
        Object obj3 = this.i;
        Intrinsics.checkNotNull(obj3);
        GP1 gp1O = ((K3) obj3).o();
        FP0 viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner3), null, new H3(viewLifecycleOwner3, gp1O, null, this), 3);
        Object obj4 = this.i;
        Intrinsics.checkNotNull(obj4);
        InterfaceC6396rf0<AbstractC5652o6> interfaceC6396rf0M = ((K3) obj4).m();
        Object obj5 = this.i;
        Intrinsics.checkNotNull(obj5);
        C6610sg0 c6610sg0 = new C6610sg0(interfaceC6396rf0M, ((K3) obj5).l(), new E3(this, j4, null));
        g lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        Intrinsics.checkNotNullParameter(c6610sg0, "<this>");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(minActiveState, "minActiveState");
        C4466ii.v(C7652xe.f(this), new C1883Qx(new c(lifecycle, minActiveState, c6610sg0, null), e.d, -2, EnumC1796Pu.d));
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        C7530x3 c7530x3 = new C7530x3(this, 0);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new B3(new A3(this, 0), 0));
        return C2151Ui0.a(this, C2017Sp1.a.b(L3.class), new C3(interfaceC3770fO0A, 0), new D3(interfaceC3770fO0A), c7530x3);
    }

    @Override // defpackage.InterfaceC2311Wi0
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, J3> g() {
        return this.n;
    }
}
