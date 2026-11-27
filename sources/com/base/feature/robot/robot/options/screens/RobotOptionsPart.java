package com.base.feature.robot.robot.options.screens;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.v;
import com.api.feature.navigation.adder.SimpleFragmentInflate;
import com.base.feature.robot.robot.options.screens.RobotOptionsPart;
import com.google.android.material.card.MaterialCardView;
import com.pexpress.tool.R;
import defpackage.C1334Jw1;
import defpackage.C1591Ne1;
import defpackage.C1621Nn1;
import defpackage.C1699On1;
import defpackage.C2017Sp1;
import defpackage.C2038Sw1;
import defpackage.C2151Ui0;
import defpackage.C2539Yx1;
import defpackage.C2784ak0;
import defpackage.C2844ay1;
import defpackage.C3053by1;
import defpackage.C3263cy1;
import defpackage.C3472dy1;
import defpackage.C3476e;
import defpackage.C3682ey1;
import defpackage.C3892fy1;
import defpackage.C4102gy1;
import defpackage.C4312hy1;
import defpackage.C4990ky1;
import defpackage.C5;
import defpackage.C5189lv;
import defpackage.C5561ng0;
import defpackage.C5620nx1;
import defpackage.C5623ny1;
import defpackage.C6253qy1;
import defpackage.C6399rg;
import defpackage.C6561sS;
import defpackage.C7652xe;
import defpackage.EnumC4403iP0;
import defpackage.FP0;
import defpackage.GP1;
import defpackage.HB0;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC3770fO0;
import defpackage.InterfaceC6396rf0;
import defpackage.InterfaceC8143zy1;
import defpackage.JX;
import defpackage.Sd2;
import defpackage.ViewOnClickListenerC0792Cy;
import defpackage.ViewOnClickListenerC3257cw1;
import defpackage.ViewOnClickListenerC6733tF0;
import defpackage.XO0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/robot/robot/options/screens/RobotOptionsPart;", "Lcom/api/feature/navigation/adder/SimpleFragmentInflate;", "Lny1;", "LJw1;", "FeatureRobotBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RobotOptionsPart extends SimpleFragmentInflate<C5623ny1, C1334Jw1> {

    @NotNull
    public final InterfaceC8143zy1 l;

    @NotNull
    public final Sd2 m;

    @NotNull
    public final C2038Sw1 n;

    @NotNull
    public final a o;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C1334Jw1> {
        public static final a m = new a(3, C1334Jw1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/robot/databinding/RobotFragmentTradingOptionsBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final C1334Jw1 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.robot_fragment_trading_options, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.amount_currency_sign;
            TextView textView = (TextView) C3476e.h(viewInflate, R.id.amount_currency_sign);
            if (textView != null) {
                i = R.id.amount_title;
                if (((TextView) C3476e.h(viewInflate, R.id.amount_title)) != null) {
                    i = R.id.amount_value_container;
                    MaterialCardView materialCardView = (MaterialCardView) C3476e.h(viewInflate, R.id.amount_value_container);
                    if (materialCardView != null) {
                        i = R.id.amount_value_edit_text;
                        EditText editText = (EditText) C3476e.h(viewInflate, R.id.amount_value_edit_text);
                        if (editText != null) {
                            i = R.id.time_icon_next;
                            if (((AppCompatImageView) C3476e.h(viewInflate, R.id.time_icon_next)) != null) {
                                i = R.id.time_title;
                                if (((TextView) C3476e.h(viewInflate, R.id.time_title)) != null) {
                                    i = R.id.time_value;
                                    TextView textView2 = (TextView) C3476e.h(viewInflate, R.id.time_value);
                                    if (textView2 != null) {
                                        i = R.id.time_value_container;
                                        MaterialCardView materialCardView2 = (MaterialCardView) C3476e.h(viewInflate, R.id.time_value_container);
                                        if (materialCardView2 != null) {
                                            i = R.id.title;
                                            if (((TextView) C3476e.h(viewInflate, R.id.title)) != null) {
                                                i = R.id.trading_help_icon;
                                                ImageView imageView = (ImageView) C3476e.h(viewInflate, R.id.trading_help_icon);
                                                if (imageView != null) {
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                    i = R.id.tutorial_view;
                                                    View viewH = C3476e.h(viewInflate, R.id.tutorial_view);
                                                    if (viewH != null) {
                                                        return new C1334Jw1(constraintLayout, textView, materialCardView, editText, textView2, materialCardView2, imageView, viewH);
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

    public RobotOptionsPart(@NotNull InterfaceC8143zy1 resourceProvider, @NotNull Sd2 viewModelFactory, @NotNull C2038Sw1 inAppTutorialViews) {
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(inAppTutorialViews, "inAppTutorialViews");
        this.l = resourceProvider;
        this.m = viewModelFactory;
        this.n = inAppTutorialViews;
        this.o = a.m;
    }

    @Override // defpackage.InterfaceC3092c81
    public final void a() {
        C1334Jw1 c1334Jw1 = (C1334Jw1) k();
        c1334Jw1.h.setFilters(new HB0[]{new HB0()});
        C1334Jw1 c1334Jw2 = (C1334Jw1) k();
        c1334Jw2.k.setOnClickListener(new ViewOnClickListenerC6733tF0(this, 4));
        c1334Jw2.g.setOnClickListener(new ViewOnClickListenerC0792Cy(this, 2));
        c1334Jw2.h.setOnClickListener(new ViewOnClickListenerC3257cw1(c1334Jw2, 2));
        c1334Jw2.j.setOnClickListener(new C5(this, 3));
        C1334Jw1 c1334Jw3 = (C1334Jw1) k();
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        InterfaceC6396rf0<String> interfaceC6396rf0 = ((C5623ny1) obj).l;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new C3053by1(viewLifecycleOwner, interfaceC6396rf0, null, c1334Jw3), 3);
        Object obj2 = this.i;
        Intrinsics.checkNotNull(obj2);
        C1621Nn1 c1621Nn1C = ((C5623ny1) obj2).j.c();
        FP0 viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner2), null, new C3263cy1(viewLifecycleOwner2, c1621Nn1C, null, c1334Jw3), 3);
        Object obj3 = this.i;
        Intrinsics.checkNotNull(obj3);
        InterfaceC6396rf0<Boolean> interfaceC6396rf1 = ((C5623ny1) obj3).m;
        FP0 viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner3), null, new C3472dy1(viewLifecycleOwner3, interfaceC6396rf1, null, c1334Jw3, this), 3);
        Object obj4 = this.i;
        Intrinsics.checkNotNull(obj4);
        C1699On1 c1699On1 = ((C5623ny1) obj4).o;
        FP0 viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner4), null, new C3682ey1(viewLifecycleOwner4, c1699On1, null, c1334Jw3, this), 3);
        Object obj5 = this.i;
        Intrinsics.checkNotNull(obj5);
        C2844ay1 c2844ay1 = new C2844ay1(((C5623ny1) obj5).p, 0);
        FP0 viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner5), null, new C3892fy1(viewLifecycleOwner5, c2844ay1, null, c1334Jw3), 3);
        Object obj6 = this.i;
        Intrinsics.checkNotNull(obj6);
        C5561ng0 c5561ng0 = ((C5623ny1) obj6).r;
        FP0 viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner6), null, new C4102gy1(viewLifecycleOwner6, c5561ng0, null, c1334Jw3, this), 3);
        C1334Jw1 c1334Jw4 = (C1334Jw1) k();
        TextView.OnEditorActionListener onEditorActionListener = new TextView.OnEditorActionListener() { // from class: Wx1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                RobotOptionsPart robotOptionsPart = this.a;
                robotOptionsPart.getClass();
                if ((keyEvent == null || keyEvent.getKeyCode() != 66) && i != 6 && i != 5) {
                    return false;
                }
                Object obj7 = robotOptionsPart.i;
                Intrinsics.checkNotNull(obj7);
                C5623ny1 c5623ny1 = (C5623ny1) obj7;
                c5623ny1.getClass();
                C6561sS.g(c5623ny1, new C5413my1(c5623ny1, null));
                return false;
            }
        };
        EditText editText = c1334Jw4.h;
        editText.setOnEditorActionListener(onEditorActionListener);
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: Xx1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                if (z) {
                    return;
                }
                Object obj7 = this.a.i;
                Intrinsics.checkNotNull(obj7);
                C5623ny1 c5623ny1 = (C5623ny1) obj7;
                c5623ny1.getClass();
                C6561sS.g(c5623ny1, new C5203ly1(c5623ny1, null));
            }
        });
        C7652xe.f(this).d(new C4312hy1(c1334Jw4, this, null));
        C1334Jw1 c1334Jw5 = (C1334Jw1) k();
        Object obj7 = this.i;
        Intrinsics.checkNotNull(obj7);
        C5623ny1 c5623ny1 = (C5623ny1) obj7;
        String newValue = c1334Jw5.h.getText().toString();
        c5623ny1.getClass();
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        if (newValue.length() != 0) {
            C6561sS.g(c5623ny1, new C4990ky1(c5623ny1, newValue, null));
        }
        EditText amountValueEditText = ((C1334Jw1) k()).h;
        Intrinsics.checkNotNullExpressionValue(amountValueEditText, "amountValueEditText");
        Intrinsics.checkNotNullParameter(amountValueEditText, "<this>");
        amountValueEditText.clearFocus();
        amountValueEditText.setClickable(true);
        amountValueEditText.setFocusable(false);
        amountValueEditText.setFocusableInTouchMode(false);
        GP1 gp1 = this.n.a;
        View view = ((C1334Jw1) k()).l;
        gp1.getClass();
        gp1.m(null, view);
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        C6399rg c6399rg = new C6399rg(this, 7);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new JX(new C1591Ne1(this, 3), 2));
        return C2151Ui0.a(this, C2017Sp1.a.b(C5623ny1.class), new C5620nx1(interfaceC3770fO0A, 1), new C2539Yx1(interfaceC3770fO0A), c6399rg);
    }

    @Override // defpackage.InterfaceC2311Wi0
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C1334Jw1> g() {
        return this.o;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        C5623ny1 c5623ny1 = (C5623ny1) obj;
        c5623ny1.getClass();
        C6561sS.g(c5623ny1, new C6253qy1(c5623ny1, null));
    }
}
