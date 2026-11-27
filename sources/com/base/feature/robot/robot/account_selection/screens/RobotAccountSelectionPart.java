package com.base.feature.robot.robot.account_selection.screens;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.v;
import com.api.feature.navigation.adder.SimpleFragmentInflate;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.pexpress.tool.R;
import defpackage.C0738Cg;
import defpackage.C0938Eu1;
import defpackage.C1016Fu1;
import defpackage.C1094Gu1;
import defpackage.C1172Hu1;
import defpackage.C1250Iu1;
import defpackage.C1328Ju1;
import defpackage.C1406Ku1;
import defpackage.C1483Lu1;
import defpackage.C1561Mu1;
import defpackage.C1699On1;
import defpackage.C1798Pu1;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2354Ww1;
import defpackage.C2784ak0;
import defpackage.C3476e;
import defpackage.C5189lv;
import defpackage.C5491nL;
import defpackage.C6133qP;
import defpackage.C7396wQ;
import defpackage.C7652xe;
import defpackage.C7717xw1;
import defpackage.C7927yw1;
import defpackage.C7955z40;
import defpackage.C8056za;
import defpackage.EnumC4403iP0;
import defpackage.FP0;
import defpackage.FP1;
import defpackage.I9;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC3770fO0;
import defpackage.InterfaceC8143zy1;
import defpackage.QO;
import defpackage.R3;
import defpackage.Sd2;
import defpackage.ViewOnClickListenerC0717Bz;
import defpackage.ViewOnClickListenerC3063c10;
import defpackage.ViewOnClickListenerC3273d10;
import defpackage.XO0;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/robot/robot/account_selection/screens/RobotAccountSelectionPart;", "Lcom/api/feature/navigation/adder/SimpleFragmentInflate;", "LPu1;", "Lxw1;", "FeatureRobotBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RobotAccountSelectionPart extends SimpleFragmentInflate<C1798Pu1, C7717xw1> {

    @NotNull
    public final InterfaceC8143zy1 l;

    @NotNull
    public final Sd2 m;

    @NotNull
    public final a n;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C7717xw1> {
        public static final a m = new a(3, C7717xw1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/robot/databinding/RobotFragmentAccountSelectionBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final C7717xw1 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.robot_fragment_account_selection, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.account_balance;
            TextView textView = (TextView) C3476e.h(viewInflate, R.id.account_balance);
            if (textView != null) {
                i = R.id.account_icon;
                AppCompatImageView appCompatImageView = (AppCompatImageView) C3476e.h(viewInflate, R.id.account_icon);
                if (appCompatImageView != null) {
                    i = R.id.account_name;
                    TextView textView2 = (TextView) C3476e.h(viewInflate, R.id.account_name);
                    if (textView2 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        i = R.id.account_selection_title;
                        if (((TextView) C3476e.h(viewInflate, R.id.account_selection_title)) != null) {
                            i = R.id.account_switcher_barrier;
                            if (((Barrier) C3476e.h(viewInflate, R.id.account_switcher_barrier)) != null) {
                                i = R.id.demo_account_card;
                                View viewH = C3476e.h(viewInflate, R.id.demo_account_card);
                                if (viewH != null) {
                                    C7927yw1 c7927yw1B = C7927yw1.b(viewH);
                                    i = R.id.deposit_btn;
                                    TextView textView3 = (TextView) C3476e.h(viewInflate, R.id.deposit_btn);
                                    if (textView3 != null) {
                                        i = R.id.multiple_account_selection_switcher_container;
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) C3476e.h(viewInflate, R.id.multiple_account_selection_switcher_container);
                                        if (constraintLayout2 != null) {
                                            i = R.id.multiple_account_value_shimmer;
                                            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C3476e.h(viewInflate, R.id.multiple_account_value_shimmer);
                                            if (shimmerFrameLayout != null) {
                                                i = R.id.real_account_card;
                                                View viewH2 = C3476e.h(viewInflate, R.id.real_account_card);
                                                if (viewH2 != null) {
                                                    return new C7717xw1(constraintLayout, textView, appCompatImageView, textView2, c7927yw1B, textView3, constraintLayout2, shimmerFrameLayout, C7927yw1.b(viewH2));
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

    public RobotAccountSelectionPart(@NotNull InterfaceC8143zy1 resourceProvider, @NotNull Sd2 viewModelFactory) {
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        this.l = resourceProvider;
        this.m = viewModelFactory;
        this.n = a.m;
    }

    public static final void l(RobotAccountSelectionPart robotAccountSelectionPart, C7927yw1 c7927yw1, R3 r3) {
        String strE;
        NumberFormat currencyInstance;
        robotAccountSelectionPart.getClass();
        c7927yw1.e.setCardBackgroundColor(C8056za.i(robotAccountSelectionPart, robotAccountSelectionPart.l.c(r3.c)));
        c7927yw1.g.setChecked(r3.c);
        C7396wQ c7396wQ = r3.b;
        Double dValueOf = Double.valueOf(c7396wQ.b);
        String upperCase = c7396wQ.a.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        try {
            if (Intrinsics.a(upperCase, "DEMO")) {
                currencyInstance = NumberFormat.getCurrencyInstance();
                DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
                decimalFormatSymbols.setCurrencySymbol("Đ");
                Intrinsics.c(currencyInstance, "null cannot be cast to non-null type java.text.DecimalFormat");
                ((DecimalFormat) currencyInstance).setDecimalFormatSymbols(decimalFormatSymbols);
            } else {
                currencyInstance = NumberFormat.getCurrencyInstance();
                currencyInstance.setCurrency(Currency.getInstance(upperCase));
            }
            strE = currencyInstance.format(dValueOf);
            Intrinsics.checkNotNullExpressionValue(strE, "format(...)");
        } catch (IllegalArgumentException unused) {
            String str = new DecimalFormat("###,###,##0.00").format(dValueOf);
            String upperCase2 = C5491nL.c(" ", upperCase).toUpperCase(Locale.ROOT);
            strE = C6133qP.e(upperCase2, "toUpperCase(...)", str, upperCase2);
        }
        String strC = C5491nL.c("\u202a", QO.o(strE));
        TextView accountValue = c7927yw1.i;
        accountValue.setText(strC);
        Intrinsics.checkNotNullExpressionValue(accountValue, "accountValue");
        accountValue.setSelected(true);
        c7927yw1.h.setText(robotAccountSelectionPart.getString(r3.a));
    }

    @Override // defpackage.InterfaceC3092c81
    public final void a() {
        C7717xw1 c7717xw1 = (C7717xw1) k();
        int i = 1;
        c7717xw1.m.e.setOnClickListener(new ViewOnClickListenerC0717Bz(this, i));
        c7717xw1.i.e.setOnClickListener(new ViewOnClickListenerC3063c10(this, i));
        c7717xw1.j.setOnClickListener(new ViewOnClickListenerC3273d10(this, 4));
        c7717xw1.k.setOnClickListener(new I9(this, 4));
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        C1699On1 c1699On1 = ((C1798Pu1) obj).m;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new C1094Gu1(null, viewLifecycleOwner, c7717xw1, c1699On1, this), 3);
        Object obj2 = this.i;
        Intrinsics.checkNotNull(obj2);
        C1699On1 c1699On2 = ((C1798Pu1) obj2).k;
        FP0 viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner2), null, new C1172Hu1(null, viewLifecycleOwner2, c7717xw1, c1699On2, this), 3);
        Object obj3 = this.i;
        Intrinsics.checkNotNull(obj3);
        C1699On1 c1699On3 = ((C1798Pu1) obj3).p;
        FP0 viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner3), null, new C1250Iu1(viewLifecycleOwner3, c1699On3, null, c7717xw1), 3);
        Object obj4 = this.i;
        Intrinsics.checkNotNull(obj4);
        FP1<Boolean> fp1 = ((C1798Pu1) obj4).r;
        FP0 viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner4), null, new C1328Ju1(viewLifecycleOwner4, fp1, null, c7717xw1), 3);
        Object obj5 = this.i;
        Intrinsics.checkNotNull(obj5);
        C1798Pu1.e eVar = ((C1798Pu1) obj5).q;
        FP0 viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner5), null, new C1406Ku1(viewLifecycleOwner5, eVar, null, c7717xw1), 3);
        Object obj6 = this.i;
        Intrinsics.checkNotNull(obj6);
        C1699On1 c1699On4 = ((C1798Pu1) obj6).o;
        FP0 viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner6), null, new C1483Lu1(null, viewLifecycleOwner6, c7717xw1, c1699On4, this), 3);
        Object obj7 = this.i;
        Intrinsics.checkNotNull(obj7);
        C1699On1 c1699On5 = ((C1798Pu1) obj7).t;
        FP0 viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner7), null, new C1561Mu1(viewLifecycleOwner7, c1699On5, null, c7717xw1), 3);
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        C0738Cg c0738Cg = new C0738Cg(this, 7);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new C2354Ww1(new C0938Eu1(this, 0), 2));
        return C2151Ui0.a(this, C2017Sp1.a.b(C1798Pu1.class), new C7955z40(interfaceC3770fO0A, 2), new C1016Fu1(interfaceC3770fO0A), c0738Cg);
    }

    @Override // defpackage.InterfaceC2311Wi0
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C7717xw1> g() {
        return this.n;
    }
}
