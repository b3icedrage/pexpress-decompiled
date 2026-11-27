package com.base.feature.support.support.screens.faq;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.v;
import com.api.feature.navigation.adder.SimpleFragmentInflate;
import com.pexpress.tool.R;
import defpackage.C1426Lb0;
import defpackage.C1591Ne1;
import defpackage.C1699On1;
import defpackage.C1907Rf;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2784ak0;
import defpackage.C3476e;
import defpackage.C5189lv;
import defpackage.C5620nx1;
import defpackage.C5943pV1;
import defpackage.C6153qV1;
import defpackage.C6572sV1;
import defpackage.C7652xe;
import defpackage.EnumC4403iP0;
import defpackage.FP0;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC3770fO0;
import defpackage.JX;
import defpackage.Sd2;
import defpackage.XO0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/support/support/screens/faq/SupportFaqPartBase;", "Lcom/api/feature/navigation/adder/SimpleFragmentInflate;", "LsV1;", "LLb0;", "FeatureSupportBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SupportFaqPartBase extends SimpleFragmentInflate<C6572sV1, C1426Lb0> {

    @NotNull
    public final Sd2 l;

    @NotNull
    public final a m;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C1426Lb0> {
        public static final a m = new a(3, C1426Lb0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/support/databinding/FaqPartBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final C1426Lb0 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.faq_part, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.faq_part_account_icon;
            if (((ImageView) C3476e.h(viewInflate, R.id.faq_part_account_icon)) != null) {
                i = R.id.faq_part_account_item_placeholder;
                LinearLayout linearLayout = (LinearLayout) C3476e.h(viewInflate, R.id.faq_part_account_item_placeholder);
                if (linearLayout != null) {
                    i = R.id.faq_part_account_title;
                    if (((TextView) C3476e.h(viewInflate, R.id.faq_part_account_title)) != null) {
                        i = R.id.faq_part_deposit_withdraw_icon;
                        if (((ImageView) C3476e.h(viewInflate, R.id.faq_part_deposit_withdraw_icon)) != null) {
                            i = R.id.faq_part_deposit_withdraw_item_placeholder;
                            LinearLayout linearLayout2 = (LinearLayout) C3476e.h(viewInflate, R.id.faq_part_deposit_withdraw_item_placeholder);
                            if (linearLayout2 != null) {
                                i = R.id.faq_part_deposit_withdraw_title;
                                if (((TextView) C3476e.h(viewInflate, R.id.faq_part_deposit_withdraw_title)) != null) {
                                    i = R.id.faq_part_robots_icon;
                                    if (((ImageView) C3476e.h(viewInflate, R.id.faq_part_robots_icon)) != null) {
                                        i = R.id.faq_part_robots_item_placeholder;
                                        LinearLayout linearLayout3 = (LinearLayout) C3476e.h(viewInflate, R.id.faq_part_robots_item_placeholder);
                                        if (linearLayout3 != null) {
                                            i = R.id.faq_part_robots_title;
                                            if (((TextView) C3476e.h(viewInflate, R.id.faq_part_robots_title)) != null) {
                                                i = R.id.faq_part_trading_icon;
                                                if (((ImageView) C3476e.h(viewInflate, R.id.faq_part_trading_icon)) != null) {
                                                    i = R.id.faq_part_trading_item_placeholder;
                                                    LinearLayout linearLayout4 = (LinearLayout) C3476e.h(viewInflate, R.id.faq_part_trading_item_placeholder);
                                                    if (linearLayout4 != null) {
                                                        i = R.id.faq_part_trading_title;
                                                        if (((TextView) C3476e.h(viewInflate, R.id.faq_part_trading_title)) != null) {
                                                            i = R.id.faq_title;
                                                            if (((TextView) C3476e.h(viewInflate, R.id.faq_title)) != null) {
                                                                return new C1426Lb0((ConstraintLayout) viewInflate, linearLayout, linearLayout2, linearLayout3, linearLayout4);
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
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
    }

    public SupportFaqPartBase(@NotNull Sd2 viewModelFactory) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        this.l = viewModelFactory;
        this.m = a.m;
    }

    @Override // defpackage.InterfaceC3092c81
    public final void a() {
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        C1699On1 c1699On1 = ((C6572sV1) obj).h;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new C6153qV1(viewLifecycleOwner, c1699On1, null, this), 3);
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        C1907Rf c1907Rf = new C1907Rf(this, 7);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new JX(new C1591Ne1(this, 4), 4));
        return C2151Ui0.a(this, C2017Sp1.a.b(C6572sV1.class), new C5620nx1(interfaceC3770fO0A, 2), new C5943pV1(interfaceC3770fO0A), c1907Rf);
    }

    @Override // defpackage.InterfaceC2311Wi0
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C1426Lb0> g() {
        return this.m;
    }
}
