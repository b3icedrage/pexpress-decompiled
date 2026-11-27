package com.base.feature.robot.robot.risk_management.screens;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.v;
import com.api.feature.navigation.adder.SimpleFragmentInflate;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.pexpress.tool.R;
import defpackage.C1100Gw1;
import defpackage.C1184Hy1;
import defpackage.C1262Iy1;
import defpackage.C1340Jy1;
import defpackage.C1418Ky1;
import defpackage.C1495Ly1;
import defpackage.C1573My1;
import defpackage.C1621Nn1;
import defpackage.C1654Ny1;
import defpackage.C1699On1;
import defpackage.C1732Oy1;
import defpackage.C1810Py1;
import defpackage.C1888Qy1;
import defpackage.C1966Ry1;
import defpackage.C2017Sp1;
import defpackage.C2044Sy1;
import defpackage.C2122Ty1;
import defpackage.C2151Ui0;
import defpackage.C2278Vy1;
import defpackage.C2360Wy1;
import defpackage.C2784ak0;
import defpackage.C2835av1;
import defpackage.C3476e;
import defpackage.C3481e1;
import defpackage.C5189lv;
import defpackage.C6333rM;
import defpackage.C6561sS;
import defpackage.C7185vQ;
import defpackage.C7501wu1;
import defpackage.C7652xe;
import defpackage.EnumC4403iP0;
import defpackage.FP0;
import defpackage.H6;
import defpackage.I6;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC1292Ji1;
import defpackage.InterfaceC1918Ri1;
import defpackage.InterfaceC3770fO0;
import defpackage.L9;
import defpackage.Sd2;
import defpackage.ViewOnClickListenerC3273d10;
import defpackage.ViewOnClickListenerC3434dm;
import defpackage.ViewOnClickListenerC3643em;
import defpackage.ViewOnClickListenerC7526x2;
import defpackage.ViewOnClickListenerC7736y2;
import defpackage.WP;
import defpackage.XO0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/robot/robot/risk_management/screens/RobotRiskManagementPart;", "Lcom/api/feature/navigation/adder/SimpleFragmentInflate;", "LWy1;", "LGw1;", "FeatureRobotBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RobotRiskManagementPart extends SimpleFragmentInflate<C2360Wy1, C1100Gw1> {

    @NotNull
    public final Sd2 l;

    @NotNull
    public final C3481e1 m;

    @NotNull
    public final InterfaceC1292Ji1 n;

    @NotNull
    public final InterfaceC1918Ri1 o;

    @NotNull
    public final a p;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C1100Gw1> {
        public static final a m = new a(3, C1100Gw1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/robot/databinding/RobotFragmentRiskManagementBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final C1100Gw1 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.robot_fragment_risk_management, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.loss_limit_bottom_sub_title;
            TextView textView = (TextView) C3476e.h(viewInflate, R.id.loss_limit_bottom_sub_title);
            if (textView != null) {
                i = R.id.loss_limit_currency_value;
                TextView textView2 = (TextView) C3476e.h(viewInflate, R.id.loss_limit_currency_value);
                if (textView2 != null) {
                    i = R.id.loss_limit_group;
                    Group group = (Group) C3476e.h(viewInflate, R.id.loss_limit_group);
                    if (group != null) {
                        i = R.id.loss_limit_not_activated_blocking_view;
                        View viewH = C3476e.h(viewInflate, R.id.loss_limit_not_activated_blocking_view);
                        if (viewH != null) {
                            i = R.id.loss_limit_sub_title;
                            if (((TextView) C3476e.h(viewInflate, R.id.loss_limit_sub_title)) != null) {
                                i = R.id.loss_limit_switch;
                                SwitchMaterial switchMaterial = (SwitchMaterial) C3476e.h(viewInflate, R.id.loss_limit_switch);
                                if (switchMaterial != null) {
                                    i = R.id.loss_limit_value;
                                    EditText editText = (EditText) C3476e.h(viewInflate, R.id.loss_limit_value);
                                    if (editText != null) {
                                        i = R.id.loss_limit_value_holder;
                                        MaterialCardView materialCardView = (MaterialCardView) C3476e.h(viewInflate, R.id.loss_limit_value_holder);
                                        if (materialCardView != null) {
                                            i = R.id.maximum_profit_bottom_sub_title;
                                            TextView textView3 = (TextView) C3476e.h(viewInflate, R.id.maximum_profit_bottom_sub_title);
                                            if (textView3 != null) {
                                                i = R.id.maximum_profit_currency_value;
                                                TextView textView4 = (TextView) C3476e.h(viewInflate, R.id.maximum_profit_currency_value);
                                                if (textView4 != null) {
                                                    i = R.id.maximum_profit_sub_title;
                                                    if (((TextView) C3476e.h(viewInflate, R.id.maximum_profit_sub_title)) != null) {
                                                        i = R.id.maximum_profit_switch;
                                                        SwitchMaterial switchMaterial2 = (SwitchMaterial) C3476e.h(viewInflate, R.id.maximum_profit_switch);
                                                        if (switchMaterial2 != null) {
                                                            i = R.id.maximum_profit_value;
                                                            EditText editText2 = (EditText) C3476e.h(viewInflate, R.id.maximum_profit_value);
                                                            if (editText2 != null) {
                                                                i = R.id.maximum_profit_value_holder;
                                                                MaterialCardView materialCardView2 = (MaterialCardView) C3476e.h(viewInflate, R.id.maximum_profit_value_holder);
                                                                if (materialCardView2 != null) {
                                                                    i = R.id.profit_limit_not_activated_blocking_view;
                                                                    View viewH2 = C3476e.h(viewInflate, R.id.profit_limit_not_activated_blocking_view);
                                                                    if (viewH2 != null) {
                                                                        i = R.id.profit_limit_shimmer_bottom_sub_title;
                                                                        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C3476e.h(viewInflate, R.id.profit_limit_shimmer_bottom_sub_title);
                                                                        if (shimmerFrameLayout != null) {
                                                                            i = R.id.profit_limit_shimmer_layout;
                                                                            ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) C3476e.h(viewInflate, R.id.profit_limit_shimmer_layout);
                                                                            if (shimmerFrameLayout2 != null) {
                                                                                i = R.id.robot_loss_limit_card_separator;
                                                                                if (C3476e.h(viewInflate, R.id.robot_loss_limit_card_separator) != null) {
                                                                                    i = R.id.robot_profit_limit_card_separator;
                                                                                    View viewH3 = C3476e.h(viewInflate, R.id.robot_profit_limit_card_separator);
                                                                                    if (viewH3 != null) {
                                                                                        return new C1100Gw1((ConstraintLayout) viewInflate, textView, textView2, group, viewH, switchMaterial, editText, materialCardView, textView3, textView4, switchMaterial2, editText2, materialCardView2, viewH2, shimmerFrameLayout, shimmerFrameLayout2, viewH3);
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
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
    }

    public RobotRiskManagementPart(@NotNull Sd2 viewModelFactory, @NotNull C3481e1 bottomSheetDialogCreator, @NotNull InterfaceC1292Ji1 profitLimitBindingProvider, @NotNull InterfaceC1918Ri1 profitLimitShimmerUseCase) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(bottomSheetDialogCreator, "bottomSheetDialogCreator");
        Intrinsics.checkNotNullParameter(profitLimitBindingProvider, "profitLimitBindingProvider");
        Intrinsics.checkNotNullParameter(profitLimitShimmerUseCase, "profitLimitShimmerUseCase");
        this.l = viewModelFactory;
        this.m = bottomSheetDialogCreator;
        this.n = profitLimitBindingProvider;
        this.o = profitLimitShimmerUseCase;
        this.p = a.m;
    }

    public static final void l(RobotRiskManagementPart robotRiskManagementPart, EditText editText) {
        robotRiskManagementPart.getClass();
        editText.setClickable(false);
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        if (editText.requestFocus()) {
            Context contextRequireContext = robotRiskManagementPart.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Object systemService = C6333rM.getSystemService(contextRequireContext, InputMethodManager.class);
            if (systemService == null) {
                throw new IllegalStateException("The class is not a supported system service.");
            }
            ((InputMethodManager) systemService).showSoftInput(editText, 1);
        }
    }

    public static final void m(RobotRiskManagementPart robotRiskManagementPart, SwitchMaterial switchMaterial, boolean z) {
        robotRiskManagementPart.getClass();
        switchMaterial.setEnabled(z);
        Intrinsics.checkNotNullParameter(switchMaterial, "<this>");
        switchMaterial.setEnabled(z);
        switchMaterial.setAlpha(z ? 1.0f : 0.4f);
        switchMaterial.setClickable(z);
        switchMaterial.setFocusable(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [wd2] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.InterfaceC3092c81
    public final void a() {
        int i = 1;
        int i2 = 2;
        Group lossLimitGroup = ((C1100Gw1) k()).h;
        Intrinsics.checkNotNullExpressionValue(lossLimitGroup, "lossLimitGroup");
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        lossLimitGroup.setVisibility(!((C2360Wy1) obj).I ? 0 : 8);
        this.n.a(k());
        C7652xe.f(this).d(new C2122Ty1(this, null));
        C1100Gw1 c1100Gw1 = (C1100Gw1) k();
        c1100Gw1.p.setFilters(new InputFilter[]{new C7185vQ(), new C7501wu1(3, 0L)});
        Object obj2 = this.i;
        Intrinsics.checkNotNull(obj2);
        C2360Wy1.o oVar = ((C2360Wy1) obj2).q;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new C1262Iy1(viewLifecycleOwner, oVar, null, c1100Gw1), 3);
        C1100Gw1 c1100Gw2 = (C1100Gw1) k();
        c1100Gw2.p.setOnClickListener(new ViewOnClickListenerC3273d10(this, 6));
        c1100Gw2.q.setOnClickListener(new L9(this, i));
        c1100Gw2.k.setOnClickListener(new ViewOnClickListenerC7526x2(this, i2));
        c1100Gw2.l.setOnClickListener(new ViewOnClickListenerC7736y2(this, i2));
        c1100Gw2.r.setOnClickListener(new ViewOnClickListenerC3434dm(this, i));
        c1100Gw2.i.setOnClickListener(new ViewOnClickListenerC3643em(this, i2));
        C1100Gw1 c1100Gw3 = (C1100Gw1) k();
        Object obj3 = this.i;
        Intrinsics.checkNotNull(obj3);
        C1699On1 c1699On1 = ((C2360Wy1) obj3).s;
        FP0 viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner2), null, new C1340Jy1(null, viewLifecycleOwner2, c1100Gw3, c1699On1, this), 3);
        Object obj4 = this.i;
        Intrinsics.checkNotNull(obj4);
        C1699On1 c1699On2 = ((C2360Wy1) obj4).w;
        FP0 viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner3), null, new C1418Ky1(null, viewLifecycleOwner3, c1100Gw3, c1699On2, this), 3);
        Object obj5 = this.i;
        Intrinsics.checkNotNull(obj5);
        C1699On1 c1699On3 = ((C2360Wy1) obj5).u;
        FP0 viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner4), null, new C1495Ly1(null, viewLifecycleOwner4, c1100Gw3, c1699On3, this), 3);
        Object obj6 = this.i;
        Intrinsics.checkNotNull(obj6);
        C1699On1 c1699On4 = ((C2360Wy1) obj6).y;
        FP0 viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner5), null, new C1573My1(null, viewLifecycleOwner5, c1100Gw3, c1699On4, this), 3);
        Object obj7 = this.i;
        Intrinsics.checkNotNull(obj7);
        C1699On1 c1699On5 = ((C2360Wy1) obj7).C;
        FP0 viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner6), null, new C1654Ny1(null, viewLifecycleOwner6, c1100Gw3, c1699On5, this), 3);
        Object obj8 = this.i;
        Intrinsics.checkNotNull(obj8);
        C1699On1 c1699On6 = ((C2360Wy1) obj8).A;
        FP0 viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner7), null, new C1732Oy1(null, viewLifecycleOwner7, c1100Gw3, c1699On6, this), 3);
        Object obj9 = this.i;
        Intrinsics.checkNotNull(obj9);
        C1621Nn1 c1621Nn1 = ((C2360Wy1) obj9).E;
        FP0 viewLifecycleOwner8 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner8, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner8), null, new C1810Py1(viewLifecycleOwner8, c1621Nn1, null, this, c1100Gw3), 3);
        Object obj10 = this.i;
        Intrinsics.checkNotNull(obj10);
        C1621Nn1 c1621Nn2 = ((C2360Wy1) obj10).F;
        FP0 viewLifecycleOwner9 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner9, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner9), null, new C1888Qy1(viewLifecycleOwner9, c1621Nn2, null, this), 3);
        C1100Gw1 c1100Gw4 = (C1100Gw1) k();
        c1100Gw4.o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: By1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                Object obj11 = this.a.i;
                Intrinsics.checkNotNull(obj11);
                C2360Wy1 c2360Wy1 = (C2360Wy1) obj11;
                c2360Wy1.getClass();
                C6561sS.g(c2360Wy1, new C3056bz1(c2360Wy1, z, null));
            }
        });
        c1100Gw4.j.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: Cy1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                Object obj11 = this.a.i;
                Intrinsics.checkNotNull(obj11);
                C2360Wy1 c2360Wy1 = (C2360Wy1) obj11;
                c2360Wy1.getClass();
                C6561sS.g(c2360Wy1, new C2620Zy1(c2360Wy1, z, null));
            }
        });
        final C1100Gw1 c1100Gw5 = (C1100Gw1) k();
        TextView.OnEditorActionListener onEditorActionListener = new TextView.OnEditorActionListener() { // from class: Dy1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
                this.a.n(i3, keyEvent);
                return false;
            }
        };
        EditText editText = c1100Gw5.p;
        editText.setOnEditorActionListener(onEditorActionListener);
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: Ey1
            /* JADX WARN: Code duplicated, block: B:8:0x0025  */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                if (z) {
                    return;
                }
                EditText editText2 = c1100Gw5.p;
                Editable text = editText2.getText();
                Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                if (text.length() == 0) {
                    editText2.setText("1");
                } else {
                    Editable text2 = editText2.getText();
                    Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    if (KS1.z(text2) == '0') {
                        editText2.setText("1");
                    }
                }
                Object obj11 = this.i;
                Intrinsics.checkNotNull(obj11);
                C2360Wy1 c2360Wy1 = (C2360Wy1) obj11;
                String newValue = String.valueOf(((C7753y60) c2360Wy1.t.getValue()).c);
                Intrinsics.checkNotNullParameter(newValue, "newValue");
                if (newValue.length() == 0) {
                    return;
                }
                C6561sS.g(c2360Wy1, new C3475dz1(c2360Wy1, newValue, null));
            }
        });
        C7652xe.f(this).d(new C1966Ry1(c1100Gw5, this, null));
        TextView.OnEditorActionListener onEditorActionListener2 = new TextView.OnEditorActionListener() { // from class: Fy1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
                this.a.n(i3, keyEvent);
                return false;
            }
        };
        EditText editText2 = c1100Gw5.k;
        editText2.setOnEditorActionListener(onEditorActionListener2);
        editText2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: Gy1
            /* JADX WARN: Code duplicated, block: B:8:0x0025  */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                if (z) {
                    return;
                }
                EditText editText3 = c1100Gw5.k;
                Editable text = editText3.getText();
                Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                if (text.length() == 0) {
                    editText3.setText("1");
                } else {
                    Editable text2 = editText3.getText();
                    Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    if (KS1.z(text2) == '0') {
                        editText3.setText("1");
                    }
                }
                Object obj11 = this.i;
                Intrinsics.checkNotNull(obj11);
                C2360Wy1 c2360Wy1 = (C2360Wy1) obj11;
                c2360Wy1.d(String.valueOf(((C7753y60) c2360Wy1.z.getValue()).c), true);
            }
        });
        C7652xe.f(this).d(new C2044Sy1(c1100Gw5, this, null));
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        WP wp = new WP(this, 1);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new I6(new H6(this, 3), 3));
        return C2151Ui0.a(this, C2017Sp1.a.b(C2360Wy1.class), new C2835av1(interfaceC3770fO0A, 1), new C1184Hy1(interfaceC3770fO0A), wp);
    }

    @Override // defpackage.InterfaceC2311Wi0
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C1100Gw1> g() {
        return this.p;
    }

    public final void n(int i, KeyEvent keyEvent) {
        if ((keyEvent != null && keyEvent.getKeyCode() == 66) || i == 6 || i == 5) {
            Object obj = this.i;
            Intrinsics.checkNotNull(obj);
            C2360Wy1 c2360Wy1 = (C2360Wy1) obj;
            c2360Wy1.getClass();
            C6561sS.g(c2360Wy1, new C2278Vy1(c2360Wy1, null));
        }
    }
}
