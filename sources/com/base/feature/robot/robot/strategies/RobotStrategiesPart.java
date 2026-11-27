package com.base.feature.robot.robot.strategies;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.v;
import com.api.feature.navigation.adder.SimpleFragmentInflate;
import com.pexpress.tool.R;
import defpackage.A3;
import defpackage.B3;
import defpackage.C1178Hw1;
import defpackage.C1621Nn1;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2784ak0;
import defpackage.C3077c42;
import defpackage.C3476e;
import defpackage.C3481e1;
import defpackage.C3496e42;
import defpackage.C5189lv;
import defpackage.C7127v71;
import defpackage.C7305vz1;
import defpackage.C7516wz1;
import defpackage.C7652xe;
import defpackage.C7726xz1;
import defpackage.C7936yz1;
import defpackage.EnumC4403iP0;
import defpackage.FP0;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC3770fO0;
import defpackage.InterfaceC6396rf0;
import defpackage.InterfaceC8143zy1;
import defpackage.Sd2;
import defpackage.ViewOnClickListenerC7740y3;
import defpackage.X5;
import defpackage.XO0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/robot/robot/strategies/RobotStrategiesPart;", "Lcom/api/feature/navigation/adder/SimpleFragmentInflate;", "Lyz1;", "LHw1;", "FeatureRobotBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RobotStrategiesPart extends SimpleFragmentInflate<C7936yz1, C1178Hw1> {

    @NotNull
    public final InterfaceC8143zy1 l;

    @NotNull
    public final Sd2 m;

    @NotNull
    public final C3481e1 n;

    @NotNull
    public final a o;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C1178Hw1> {
        public static final a m = new a(3, C1178Hw1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/robot/databinding/RobotFragmentStrategiesBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final C1178Hw1 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.robot_fragment_strategies, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.maximum_profit_sub_title;
            if (((TextView) C3476e.h(viewInflate, R.id.maximum_profit_sub_title)) != null) {
                i = R.id.risk_management_help_icon;
                ImageView imageView = (ImageView) C3476e.h(viewInflate, R.id.risk_management_help_icon);
                if (imageView != null) {
                    i = R.id.risk_management_title;
                    if (((TextView) C3476e.h(viewInflate, R.id.risk_management_title)) != null) {
                        i = R.id.robot_trading_strategy_selection_info_container;
                        View viewH = C3476e.h(viewInflate, R.id.robot_trading_strategy_selection_info_container);
                        if (viewH != null) {
                            return new C1178Hw1((ConstraintLayout) viewInflate, imageView, C3077c42.b(viewH));
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
    }

    public RobotStrategiesPart(@NotNull InterfaceC8143zy1 resourceProvider, @NotNull Sd2 viewModelFactory, @NotNull C3481e1 bottomSheetDialogCreator) {
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(bottomSheetDialogCreator, "bottomSheetDialogCreator");
        this.l = resourceProvider;
        this.m = viewModelFactory;
        this.n = bottomSheetDialogCreator;
        this.o = a.m;
    }

    @Override // defpackage.InterfaceC3092c81
    public final void a() {
        C1178Hw1 c1178Hw1 = (C1178Hw1) k();
        c1178Hw1.e.setOnClickListener(new View.OnClickListener() { // from class: uz1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object obj = this.d.i;
                Intrinsics.checkNotNull(obj);
                C7936yz1 c7936yz1 = (C7936yz1) obj;
                c7936yz1.getClass();
                C6561sS.g(c7936yz1, new C8146zz1(c7936yz1, null));
            }
        });
        c1178Hw1.g.h.setOnClickListener(new ViewOnClickListenerC7740y3(this, 4));
        C1178Hw1 c1178Hw2 = (C1178Hw1) k();
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        InterfaceC6396rf0<C3496e42> interfaceC6396rf0 = ((C7936yz1) obj).i;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new C7516wz1(viewLifecycleOwner, interfaceC6396rf0, null, c1178Hw2), 3);
        Object obj2 = this.i;
        Intrinsics.checkNotNull(obj2);
        C1621Nn1 c1621Nn1 = ((C7936yz1) obj2).j;
        FP0 viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner2), null, new C7726xz1(viewLifecycleOwner2, c1621Nn1, null, this), 3);
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        X5 x5 = new X5(this, 8);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new A3(new C7127v71(this, 1), 1));
        return C2151Ui0.a(this, C2017Sp1.a.b(C7936yz1.class), new B3(interfaceC3770fO0A, 2), new C7305vz1(interfaceC3770fO0A), x5);
    }

    @Override // defpackage.InterfaceC2311Wi0
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C1178Hw1> g() {
        return this.o;
    }
}
