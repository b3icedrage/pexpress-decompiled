package com.base.feature.stub.screens.stub_results;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.v;
import com.api.core.SimpleViewModelFragment;
import com.google.android.material.button.MaterialButton;
import com.pexpress.tool.R;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2784ak0;
import defpackage.C3476e;
import defpackage.C5189lv;
import defpackage.C6693t4;
import defpackage.C7113v4;
import defpackage.C7652xe;
import defpackage.EnumC4403iP0;
import defpackage.FP0;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC3770fO0;
import defpackage.JX;
import defpackage.KX;
import defpackage.NT1;
import defpackage.OT1;
import defpackage.PT1;
import defpackage.Sd2;
import defpackage.VT1;
import defpackage.ViewOnClickListenerC6273r4;
import defpackage.ViewOnClickListenerC6483s4;
import defpackage.XO0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/stub/screens/stub_results/StubResultsFragment;", "Lcom/api/core/SimpleViewModelFragment;", "LVT1;", "LPT1;", "FeatureStubBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StubResultsFragment extends SimpleViewModelFragment<VT1, PT1> {

    @NotNull
    public final Sd2 j;

    @Nullable
    public final Integer k;

    @NotNull
    public final a l;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, PT1> {
        public static final a m = new a(3, PT1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/stub/databinding/StubResultsFragmentBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final PT1 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.stub_results_fragment, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.stub_results_image;
            ImageView imageView = (ImageView) C3476e.h(viewInflate, R.id.stub_results_image);
            if (imageView != null) {
                i = R.id.stub_results_learn_more_button;
                MaterialButton materialButton = (MaterialButton) C3476e.h(viewInflate, R.id.stub_results_learn_more_button);
                if (materialButton != null) {
                    i = R.id.stub_results_subtitle_text;
                    TextView textView = (TextView) C3476e.h(viewInflate, R.id.stub_results_subtitle_text);
                    if (textView != null) {
                        i = R.id.stub_results_title_text;
                        TextView textView2 = (TextView) C3476e.h(viewInflate, R.id.stub_results_title_text);
                        if (textView2 != null) {
                            i = R.id.stub_results_try_again_button;
                            MaterialButton materialButton2 = (MaterialButton) C3476e.h(viewInflate, R.id.stub_results_try_again_button);
                            if (materialButton2 != null) {
                                return new PT1((ConstraintLayout) viewInflate, imageView, materialButton, textView, textView2, materialButton2);
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
    }

    public StubResultsFragment(@NotNull Sd2 viewModelFactory) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        this.j = viewModelFactory;
        this.k = Integer.valueOf(R.color.background);
        this.l = a.m;
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        C6693t4 c6693t4 = new C6693t4(this, 5);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new C7113v4(new JX(this, 3), 4));
        return C2151Ui0.a(this, C2017Sp1.a.b(VT1.class), new KX(interfaceC3770fO0A, 1), new NT1(interfaceC3770fO0A), c6693t4);
    }

    @Override // defpackage.InterfaceC2311Wi0
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, PT1> g() {
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
        super.onViewCreated(view, bundle);
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        VT1.a aVar = ((VT1) obj).e;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new OT1(viewLifecycleOwner, aVar, null, this), 3);
        PT1 pt1K = k();
        pt1K.g.setOnClickListener(new ViewOnClickListenerC6273r4(this, 1));
        PT1 pt1K2 = k();
        pt1K2.j.setOnClickListener(new ViewOnClickListenerC6483s4(this, 1));
    }
}
