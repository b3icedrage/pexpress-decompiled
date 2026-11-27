package com.base.feature.activation.screens.action_button;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.v;
import com.api.feature.navigation.adder.SimpleFragmentInflate;
import com.google.android.material.button.MaterialButton;
import com.pexpress.tool.R;
import defpackage.B5;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2784ak0;
import defpackage.C5;
import defpackage.C5189lv;
import defpackage.C7652xe;
import defpackage.D5;
import defpackage.E5;
import defpackage.EnumC4403iP0;
import defpackage.FP0;
import defpackage.G5;
import defpackage.I5;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC3770fO0;
import defpackage.S2;
import defpackage.Sd2;
import defpackage.T2;
import defpackage.U2;
import defpackage.XO0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/activation/screens/action_button/ActivationActionButtonFragment;", "Lcom/api/feature/navigation/adder/SimpleFragmentInflate;", "LI5;", "LG5;", "FeatureActivationBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ActivationActionButtonFragment extends SimpleFragmentInflate<I5, G5> {

    @NotNull
    public final Sd2 l;

    @NotNull
    public final a m;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, G5> {
        public static final a m = new a(3, G5.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/activation/databinding/ActivationActionButtonPartBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final G5 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.activation_action_button_part, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            if (viewInflate != null) {
                return new G5((MaterialButton) viewInflate);
            }
            throw new NullPointerException("rootView");
        }
    }

    public ActivationActionButtonFragment(@NotNull Sd2 viewModelFactory) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        this.l = viewModelFactory;
        this.m = a.m;
    }

    @Override // defpackage.InterfaceC3092c81
    public final void a() {
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        I5.a aVar = ((I5) obj).g;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new E5(viewLifecycleOwner, aVar, null, this), 3);
        G5 g5 = (G5) k();
        g5.d.setOnClickListener(new C5(this, 0));
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        B5 b5 = new B5(this, 0);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new T2(new S2(this, 1), 1));
        return C2151Ui0.a(this, C2017Sp1.a.b(I5.class), new U2(interfaceC3770fO0A, 1), new D5(interfaceC3770fO0A), b5);
    }

    @Override // defpackage.InterfaceC2311Wi0
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, G5> g() {
        return this.m;
    }
}
