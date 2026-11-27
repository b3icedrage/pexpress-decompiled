package com.base.feature.robot.robot.indicators;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.v;
import com.api.feature.navigation.adder.SimpleFragmentInflate;
import com.pexpress.tool.R;
import defpackage.C0938Eu1;
import defpackage.C1256Iw1;
import defpackage.C1699On1;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2354Ww1;
import defpackage.C2458Xw1;
import defpackage.C2536Yw1;
import defpackage.C2614Zw1;
import defpackage.C2784ak0;
import defpackage.C2841ax1;
import defpackage.C3476e;
import defpackage.C3702f32;
import defpackage.C3889fx1;
import defpackage.C5189lv;
import defpackage.C7652xe;
import defpackage.EnumC4403iP0;
import defpackage.FP0;
import defpackage.I9;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC3770fO0;
import defpackage.P4;
import defpackage.Sd2;
import defpackage.T4;
import defpackage.ViewOnClickListenerC3273d10;
import defpackage.XO0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/robot/robot/indicators/RobotIndicatorPart;", "Lcom/api/feature/navigation/adder/SimpleFragmentInflate;", "Lfx1;", "LIw1;", "FeatureRobotBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RobotIndicatorPart extends SimpleFragmentInflate<C3889fx1, C1256Iw1> {

    @NotNull
    public final Sd2 l;

    @NotNull
    public final a m;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C1256Iw1> {
        public static final a m = new a(3, C1256Iw1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/robot/databinding/RobotFragmentTradingIndicatorBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final C1256Iw1 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.robot_fragment_trading_indicator, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.maximum_profit_sub_title;
            if (((TextView) C3476e.h(viewInflate, R.id.maximum_profit_sub_title)) != null) {
                i = R.id.robot_trading_indicator_selection_info_container;
                View viewH = C3476e.h(viewInflate, R.id.robot_trading_indicator_selection_info_container);
                if (viewH != null) {
                    return new C1256Iw1((ConstraintLayout) viewInflate, C3702f32.b(viewH));
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
    }

    public RobotIndicatorPart(@NotNull Sd2 viewModelFactory) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        this.l = viewModelFactory;
        this.m = a.m;
    }

    @Override // defpackage.InterfaceC3092c81
    public final void a() {
        int i = 5;
        ((C1256Iw1) k()).e.j.setOnClickListener(new ViewOnClickListenerC3273d10(this, i));
        ((C1256Iw1) k()).e.s.setOnClickListener(new I9(this, i));
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        C3889fx1.a aVar = ((C3889fx1) obj).g;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new C2536Yw1(viewLifecycleOwner, aVar, null, this), 3);
        Object obj2 = this.i;
        Intrinsics.checkNotNull(obj2);
        C1699On1 c1699On1 = ((C3889fx1) obj2).k;
        FP0 viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner2), null, new C2614Zw1(viewLifecycleOwner2, c1699On1, null, this), 3);
        Object obj3 = this.i;
        Intrinsics.checkNotNull(obj3);
        C1699On1 c1699On2 = ((C3889fx1) obj3).j;
        FP0 viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner3), null, new C2841ax1(viewLifecycleOwner3, c1699On2, null, this), 3);
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        P4 p4 = new P4(this, 9);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new C0938Eu1(new T4(this, 3), 1));
        return C2151Ui0.a(this, C2017Sp1.a.b(C3889fx1.class), new C2354Ww1(interfaceC3770fO0A, 0), new C2458Xw1(interfaceC3770fO0A), p4);
    }

    @Override // defpackage.InterfaceC2311Wi0
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C1256Iw1> g() {
        return this.m;
    }
}
