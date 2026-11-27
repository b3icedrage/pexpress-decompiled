package com.base.feature.robot.robot.account_activation.screens;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.v;
import com.api.feature.navigation.adder.SimpleFragmentInflate;
import com.pexpress.tool.R;
import defpackage.C1022Fw1;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2784ak0;
import defpackage.C3238cq0;
import defpackage.C3265cz0;
import defpackage.C3435dm0;
import defpackage.C3474dz0;
import defpackage.C3476e;
import defpackage.C5189lv;
import defpackage.C5500nO;
import defpackage.C6333rM;
import defpackage.C6685t2;
import defpackage.C7092uy1;
import defpackage.C7302vy1;
import defpackage.C7568xD0;
import defpackage.C7652xe;
import defpackage.C7723xy1;
import defpackage.EnumC4403iP0;
import defpackage.EnumC7035uh1;
import defpackage.FP0;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC3770fO0;
import defpackage.InterfaceC8143zy1;
import defpackage.Sd2;
import defpackage.XO0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/robot/robot/account_activation/screens/RobotRealAccountActivationPart;", "Lcom/api/feature/navigation/adder/SimpleFragmentInflate;", "Lxy1;", "LFw1;", "FeatureRobotBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RobotRealAccountActivationPart extends SimpleFragmentInflate<C7723xy1, C1022Fw1> {

    @NotNull
    public final InterfaceC8143zy1 l;

    @NotNull
    public final Sd2 m;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C1022Fw1> {
        public static final a m = new a(3, C1022Fw1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/robot/databinding/RobotFragmentRealAccountActivationBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final C1022Fw1 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.robot_fragment_real_account_activation, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.inclusion_step_first_item;
            View viewH = C3476e.h(viewInflate, R.id.inclusion_step_first_item);
            if (viewH != null) {
                C7568xD0 c7568xD0B = C7568xD0.b(viewH);
                i = R.id.inclusion_step_second_item;
                View viewH2 = C3476e.h(viewInflate, R.id.inclusion_step_second_item);
                if (viewH2 != null) {
                    C7568xD0 c7568xD0B2 = C7568xD0.b(viewH2);
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    i = R.id.robot_activation_status_card_separator;
                    if (C3476e.h(viewInflate, R.id.robot_activation_status_card_separator) != null) {
                        i = R.id.unavailable_trading_description_text;
                        TextView textView = (TextView) C3476e.h(viewInflate, R.id.unavailable_trading_description_text);
                        if (textView != null) {
                            i = R.id.unavailable_trading_image;
                            ImageView imageView = (ImageView) C3476e.h(viewInflate, R.id.unavailable_trading_image);
                            if (imageView != null) {
                                i = R.id.unavailable_trading_text;
                                TextView textView2 = (TextView) C3476e.h(viewInflate, R.id.unavailable_trading_text);
                                if (textView2 != null) {
                                    return new C1022Fw1(constraintLayout, c7568xD0B, c7568xD0B2, textView, imageView, textView2);
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
    }

    public RobotRealAccountActivationPart(@NotNull InterfaceC8143zy1 resourceProvider, @NotNull Sd2 viewModelFactory) {
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        this.l = resourceProvider;
        this.m = viewModelFactory;
    }

    public static final void l(RobotRealAccountActivationPart robotRealAccountActivationPart, C7568xD0 c7568xD0, C6685t2 c6685t2) {
        robotRealAccountActivationPart.getClass();
        TextView textView = c7568xD0.e;
        textView.setText(c6685t2.a.d);
        boolean z = c6685t2.e;
        textView.setEnabled(z);
        String string = robotRealAccountActivationPart.getString(c6685t2.b, robotRealAccountActivationPart.getString(R.string.app_name));
        TextView textView2 = c7568xD0.g;
        textView2.setText(string);
        textView2.setEnabled(z);
        Intrinsics.checkNotNullParameter(robotRealAccountActivationPart, "<this>");
        textView.setBackground(C6333rM.getDrawable(robotRealAccountActivationPart.requireContext(), c6685t2.c));
    }

    @Override // defpackage.InterfaceC3092c81
    public final void a() {
        C1022Fw1 c1022Fw1 = (C1022Fw1) k();
        InterfaceC8143zy1 interfaceC8143zy1 = this.l;
        c1022Fw1.j.setText(interfaceC8143zy1.b());
        c1022Fw1.h.setText(interfaceC8143zy1.a());
        ImageView unavailableTradingImage = c1022Fw1.i;
        Intrinsics.checkNotNullExpressionValue(unavailableTradingImage, "unavailableTradingImage");
        C3435dm0.e(unavailableTradingImage, R.drawable.ic_real_acc_disable, EnumC7035uh1.g);
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        C7723xy1.b bVar = ((C7723xy1) obj).e;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new C7302vy1(viewLifecycleOwner, bVar, null, this, c1022Fw1), 3);
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        C5500nO c5500nO = new C5500nO(this, 6);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new C3238cq0(new C3265cz0(this, 7), 6));
        return C2151Ui0.a(this, C2017Sp1.a.b(C7723xy1.class), new C3474dz0(interfaceC3770fO0A, 4), new C7092uy1(interfaceC3770fO0A), c5500nO);
    }

    @Override // defpackage.InterfaceC2311Wi0
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C1022Fw1> g() {
        return a.m;
    }
}
