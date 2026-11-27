package com.base.feature.robot.robot.double_strategies.screens;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.v;
import com.api.feature.navigation.adder.SimpleFragmentInflate;
import com.pexpress.tool.R;
import defpackage.C0690Bq;
import defpackage.C0866Dw1;
import defpackage.C1412Kw1;
import defpackage.C1591Ne1;
import defpackage.C1621Nn1;
import defpackage.C1672Oe1;
import defpackage.C1699On1;
import defpackage.C1907Rf;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2784ak0;
import defpackage.C3287d42;
import defpackage.C3476e;
import defpackage.C3481e1;
import defpackage.C3676ew1;
import defpackage.C3886fw1;
import defpackage.C4096gw1;
import defpackage.C4306hw1;
import defpackage.C4554iw1;
import defpackage.C4774jw1;
import defpackage.C4984kw1;
import defpackage.C5;
import defpackage.C5189lv;
import defpackage.C7652xe;
import defpackage.EnumC4403iP0;
import defpackage.FP0;
import defpackage.GP1;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC3770fO0;
import defpackage.InterfaceC8143zy1;
import defpackage.Sd2;
import defpackage.ViewOnClickListenerC3257cw1;
import defpackage.ViewOnClickListenerC3466dw1;
import defpackage.XO0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/robot/robot/double_strategies/screens/RobotDoubleStrategiesPart;", "Lcom/api/feature/navigation/adder/SimpleFragmentInflate;", "Lkw1;", "LDw1;", "FeatureRobotBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RobotDoubleStrategiesPart extends SimpleFragmentInflate<C4984kw1, C0866Dw1> {

    @NotNull
    public final InterfaceC8143zy1 l;

    @NotNull
    public final Sd2 m;

    @NotNull
    public final C3481e1 n;

    @NotNull
    public final a o;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C0866Dw1> {
        public static final a m = new a(3, C0866Dw1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/robot/databinding/RobotFragmentDoubleStrategiesBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final C0866Dw1 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.robot_fragment_double_strategies, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.aggressive_strategy_card;
            View viewH = C3476e.h(viewInflate, R.id.aggressive_strategy_card);
            if (viewH != null) {
                C1412Kw1 c1412Kw1B = C1412Kw1.b(viewH);
                View viewH2 = C3476e.h(viewInflate, R.id.optimal_strategy_card);
                if (viewH2 != null) {
                    C1412Kw1 c1412Kw1B2 = C1412Kw1.b(viewH2);
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    int i2 = R.id.trading_strategies_help_icon;
                    ImageView imageView = (ImageView) C3476e.h(viewInflate, R.id.trading_strategies_help_icon);
                    if (imageView != null) {
                        i2 = R.id.trading_strategies_title;
                        if (((TextView) C3476e.h(viewInflate, R.id.trading_strategies_title)) != null) {
                            return new C0866Dw1(constraintLayout, c1412Kw1B, c1412Kw1B2, imageView);
                        }
                    }
                    i = i2;
                } else {
                    i = R.id.optimal_strategy_card;
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
    }

    public RobotDoubleStrategiesPart(@NotNull InterfaceC8143zy1 resourceProvider, @NotNull Sd2 viewModelFactory, @NotNull C3481e1 bottomSheetDialogCreator) {
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(bottomSheetDialogCreator, "bottomSheetDialogCreator");
        this.l = resourceProvider;
        this.m = viewModelFactory;
        this.n = bottomSheetDialogCreator;
        this.o = a.m;
    }

    public static final void l(RobotDoubleStrategiesPart robotDoubleStrategiesPart, C1412Kw1 c1412Kw1, C3287d42 c3287d42) {
        robotDoubleStrategiesPart.getClass();
        c1412Kw1.i.setText(robotDoubleStrategiesPart.getString(c3287d42.b));
        String[] strArr = (String[]) c3287d42.d.toArray(new String[0]);
        c1412Kw1.h.setText(robotDoubleStrategiesPart.getString(c3287d42.c, Arrays.copyOf(strArr, strArr.length)));
    }

    @Override // defpackage.InterfaceC3092c81
    public final void a() {
        C0866Dw1 c0866Dw1 = (C0866Dw1) k();
        c0866Dw1.e.e.setOnClickListener(new ViewOnClickListenerC3257cw1(this, 0));
        c0866Dw1.g.e.setOnClickListener(new C5(this, 2));
        c0866Dw1.h.setOnClickListener(new ViewOnClickListenerC3466dw1(this));
        C0866Dw1 c0866Dw2 = (C0866Dw1) k();
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        C1699On1 c1699On1 = ((C4984kw1) obj).r;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new C4096gw1(viewLifecycleOwner, c1699On1, null, this, c0866Dw2), 3);
        Object obj2 = this.i;
        Intrinsics.checkNotNull(obj2);
        GP1 gp1 = ((C4984kw1) obj2).p;
        FP0 viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner2), null, new C4306hw1(viewLifecycleOwner2, gp1, null, this, c0866Dw2), 3);
        Object obj3 = this.i;
        Intrinsics.checkNotNull(obj3);
        C1699On1 c1699On2 = ((C4984kw1) obj3).m;
        FP0 viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner3), null, new C4554iw1(viewLifecycleOwner3, c1699On2, null, this, c0866Dw2), 3);
        Object obj4 = this.i;
        Intrinsics.checkNotNull(obj4);
        C1699On1 c1699On3 = ((C4984kw1) obj4).k;
        FP0 viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner4), null, new C4774jw1(viewLifecycleOwner4, c1699On3, null, this, c0866Dw2), 3);
        Object obj5 = this.i;
        Intrinsics.checkNotNull(obj5);
        C1621Nn1 c1621Nn1 = ((C4984kw1) obj5).o;
        FP0 viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner5), null, new C3886fw1(viewLifecycleOwner5, c1621Nn1, null, this), 3);
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        C1907Rf c1907Rf = new C1907Rf(this, 5);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new C1591Ne1(new C0690Bq(this, 4), 1));
        return C2151Ui0.a(this, C2017Sp1.a.b(C4984kw1.class), new C1672Oe1(interfaceC3770fO0A, 1), new C3676ew1(interfaceC3770fO0A), c1907Rf);
    }

    @Override // defpackage.InterfaceC2311Wi0
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C0866Dw1> g() {
        return this.o;
    }
}
