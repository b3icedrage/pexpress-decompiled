package com.base.feature.registration.screens.selecthaveaccount;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.v;
import com.api.core.BaseFragment;
import com.api.core.SimpleViewModelFragment;
import com.google.android.material.button.MaterialButton;
import com.pexpress.tool.R;
import defpackage.C1449Lj;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2784ak0;
import defpackage.C3476e;
import defpackage.C5189lv;
import defpackage.C5220m3;
import defpackage.C7323w4;
import defpackage.C7652xe;
import defpackage.EnumC4403iP0;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC3770fO0;
import defpackage.N5;
import defpackage.OE1;
import defpackage.PE1;
import defpackage.QE1;
import defpackage.Sd2;
import defpackage.UE1;
import defpackage.VE;
import defpackage.ViewOnClickListenerC6214qm;
import defpackage.ViewOnClickListenerC6903u4;
import defpackage.XO0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/registration/screens/selecthaveaccount/SelectHaveAccountFragmentBase;", "Lcom/api/core/SimpleViewModelFragment;", "LUE1;", "LQE1;", "FeatureRegistrationBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SelectHaveAccountFragmentBase extends SimpleViewModelFragment<UE1, QE1> {

    @NotNull
    public final Sd2 j;

    @NotNull
    public final List<BaseFragment.a.b> k;

    @Nullable
    public final Integer l;

    @NotNull
    public final a m;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, QE1> {
        public static final a m = new a(3, QE1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/registration/databinding/SelectHaveAccountFragmentBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final QE1 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.select_have_account_fragment, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.select_have_account_inner_image;
            ImageView imageView = (ImageView) C3476e.h(viewInflate, R.id.select_have_account_inner_image);
            if (imageView != null) {
                i = R.id.select_have_account_outer_image;
                ImageView imageView2 = (ImageView) C3476e.h(viewInflate, R.id.select_have_account_outer_image);
                if (imageView2 != null) {
                    i = R.id.select_have_account_register_button;
                    MaterialButton materialButton = (MaterialButton) C3476e.h(viewInflate, R.id.select_have_account_register_button);
                    if (materialButton != null) {
                        i = R.id.select_have_account_sign_in_button;
                        MaterialButton materialButton2 = (MaterialButton) C3476e.h(viewInflate, R.id.select_have_account_sign_in_button);
                        if (materialButton2 != null) {
                            i = R.id.select_have_account_title_text;
                            TextView textView = (TextView) C3476e.h(viewInflate, R.id.select_have_account_title_text);
                            if (textView != null) {
                                return new QE1((ConstraintLayout) viewInflate, imageView, imageView2, materialButton, materialButton2, textView);
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
    }

    public SelectHaveAccountFragmentBase(@NotNull Sd2 viewModelFactory) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        this.j = viewModelFactory;
        this.k = VE.c(BaseFragment.a.b.a);
        this.l = Integer.valueOf(R.color.background);
        this.m = a.m;
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        C1449Lj c1449Lj = new C1449Lj(this, 3);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new N5(new C7323w4(this, 3), 1));
        return C2151Ui0.a(this, C2017Sp1.a.b(UE1.class), new C5220m3(interfaceC3770fO0A, 4), new OE1(interfaceC3770fO0A), c1449Lj);
    }

    @Override // defpackage.InterfaceC2311Wi0
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, QE1> g() {
        return this.m;
    }

    @Override // com.api.core.BaseFragment
    @NotNull
    public final List<BaseFragment.a.b> i() {
        return this.k;
    }

    @Override // com.api.core.BaseFragment
    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final Integer getL() {
        return this.l;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        C5189lv.k(C7652xe.f(this), null, new PE1(this, k(), null), 3);
        QE1 qe1K = k();
        qe1K.j.setText(getString(R.string.label_have_platform_account, getString(R.string.platform_name)));
        QE1 qe1K2 = k();
        qe1K2.h.setOnClickListener(new ViewOnClickListenerC6214qm(this, 1));
        QE1 qe1K3 = k();
        qe1K3.i.setOnClickListener(new ViewOnClickListenerC6903u4(this, 4));
    }
}
