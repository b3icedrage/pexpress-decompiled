package com.base.feature.robot.strategyinstructions.screens;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import androidx.lifecycle.v;
import com.api.feature.bottomsheetdialog.utils.SimpleBindingBottomSheetDialogFragment;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.pexpress.tool.R;
import defpackage.AW1;
import defpackage.B5;
import defpackage.BR1;
import defpackage.C1795Pt1;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2784ak0;
import defpackage.C3435dm0;
import defpackage.C3476e;
import defpackage.C3496e42;
import defpackage.C5189lv;
import defpackage.C6770tR1;
import defpackage.C6980uR1;
import defpackage.C7190vR1;
import defpackage.C7652xe;
import defpackage.EnumC2644a42;
import defpackage.EnumC4403iP0;
import defpackage.EnumC7290vu1;
import defpackage.FP0;
import defpackage.I6;
import defpackage.IR1;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC3368dU;
import defpackage.InterfaceC3770fO0;
import defpackage.InterfaceC6396rf0;
import defpackage.InterfaceC6606sf0;
import defpackage.JM;
import defpackage.KN;
import defpackage.MA1;
import defpackage.MN;
import defpackage.S2;
import defpackage.Sd2;
import defpackage.ViewOnClickListenerC0792Cy;
import defpackage.ViewOnClickListenerC6733tF0;
import defpackage.XO0;
import defpackage.Z32;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/robot/strategyinstructions/screens/StrategyInstructionsBottomSheetDialogFragment;", "Lcom/api/feature/bottomsheetdialog/utils/SimpleBindingBottomSheetDialogFragment;", "LBR1;", "LZ32;", "FeatureRobotBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StrategyInstructionsBottomSheetDialogFragment extends SimpleBindingBottomSheetDialogFragment<BR1, Z32> {

    @NotNull
    public final Sd2 i;

    @NotNull
    public final a j;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, Z32> {
        public static final a m = new a(3, Z32.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/robot/databinding/TradingStrategiesSelectionBottomSheetFragmentBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final Z32 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.trading_strategies_selection_bottom_sheet_fragment, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.trading_strategies_activation_button;
            MaterialButton materialButton = (MaterialButton) C3476e.h(viewInflate, R.id.trading_strategies_activation_button);
            if (materialButton != null) {
                i = R.id.trading_strategies_selection_button;
                MaterialButton materialButton2 = (MaterialButton) C3476e.h(viewInflate, R.id.trading_strategies_selection_button);
                if (materialButton2 != null) {
                    i = R.id.trading_strategies_selection_view;
                    View viewH = C3476e.h(viewInflate, R.id.trading_strategies_selection_view);
                    if (viewH != null) {
                        int i2 = R.id.strategy_selection_illustration;
                        ImageView imageView = (ImageView) C3476e.h(viewH, R.id.strategy_selection_illustration);
                        if (imageView != null) {
                            i2 = R.id.strategy_selection_lock_icon;
                            ImageView imageView2 = (ImageView) C3476e.h(viewH, R.id.strategy_selection_lock_icon);
                            if (imageView2 != null) {
                                i2 = R.id.strategy_selection_page_description;
                                TextView textView = (TextView) C3476e.h(viewH, R.id.strategy_selection_page_description);
                                if (textView != null) {
                                    i2 = R.id.strategy_selection_page_illustration;
                                    ShapeableImageView shapeableImageView = (ShapeableImageView) C3476e.h(viewH, R.id.strategy_selection_page_illustration);
                                    if (shapeableImageView != null) {
                                        i2 = R.id.strategy_selection_page_lower_description;
                                        TextView textView2 = (TextView) C3476e.h(viewH, R.id.strategy_selection_page_lower_description);
                                        if (textView2 != null) {
                                            i2 = R.id.strategy_selection_risk_icon;
                                            ImageView imageView3 = (ImageView) C3476e.h(viewH, R.id.strategy_selection_risk_icon);
                                            if (imageView3 != null) {
                                                i2 = R.id.strategy_selection_risk_label;
                                                TextView textView3 = (TextView) C3476e.h(viewH, R.id.strategy_selection_risk_label);
                                                if (textView3 != null) {
                                                    i2 = R.id.strategy_selection_title;
                                                    TextView textView4 = (TextView) C3476e.h(viewH, R.id.strategy_selection_title);
                                                    if (textView4 != null) {
                                                        return new Z32((LinearLayout) viewInflate, materialButton, materialButton2, new IR1((ConstraintLayout) viewH, imageView, imageView2, textView, shapeableImageView, textView2, imageView3, textView3, textView4));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(viewH.getResources().getResourceName(i2)));
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
    }

    @InterfaceC3368dU(c = "com.base.feature.robot.strategyinstructions.screens.StrategyInstructionsBottomSheetDialogFragment$onViewCreated$$inlined$launchAndCollectIn$default$1", f = "StrategyInstructionsBottomSheetDialogFragment.kt", l = {48}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ FP0 e;
        public final /* synthetic */ InterfaceC6396rf0 g;
        public final /* synthetic */ StrategyInstructionsBottomSheetDialogFragment h;

        @InterfaceC3368dU(c = "com.base.feature.robot.strategyinstructions.screens.StrategyInstructionsBottomSheetDialogFragment$onViewCreated$$inlined$launchAndCollectIn$default$1$1", f = "StrategyInstructionsBottomSheetDialogFragment.kt", l = {49}, m = "invokeSuspend")
        public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public /* synthetic */ Object e;
            public final /* synthetic */ InterfaceC6396rf0 g;
            public final /* synthetic */ StrategyInstructionsBottomSheetDialogFragment h;

            /* JADX INFO: renamed from: com.base.feature.robot.strategyinstructions.screens.StrategyInstructionsBottomSheetDialogFragment$b$a$a, reason: collision with other inner class name */
            public static final class C0297a<T> implements InterfaceC6606sf0 {
                public final /* synthetic */ KN d;
                public final /* synthetic */ StrategyInstructionsBottomSheetDialogFragment e;

                public C0297a(KN kn, StrategyInstructionsBottomSheetDialogFragment strategyInstructionsBottomSheetDialogFragment) {
                    this.e = strategyInstructionsBottomSheetDialogFragment;
                    this.d = kn;
                }

                @Override // defpackage.InterfaceC6606sf0
                public final Object a(Object obj, JM jm) {
                    C3496e42 item = (C3496e42) obj;
                    StrategyInstructionsBottomSheetDialogFragment strategyInstructionsBottomSheetDialogFragment = this.e;
                    IR1 tradingStrategiesSelectionView = strategyInstructionsBottomSheetDialogFragment.i().h;
                    Intrinsics.checkNotNullExpressionValue(tradingStrategiesSelectionView, "tradingStrategiesSelectionView");
                    C6770tR1 c6770tR1 = new C6770tR1(tradingStrategiesSelectionView);
                    Intrinsics.checkNotNullParameter(item, "item");
                    Context context = c6770tR1.a.getContext();
                    IR1 ir1 = c6770tR1.u;
                    ir1.m.setText(context.getString(item.b));
                    ShapeableImageView strategySelectionPageIllustration = ir1.i;
                    Intrinsics.checkNotNullExpressionValue(strategySelectionPageIllustration, "strategySelectionPageIllustration");
                    C3435dm0.h(strategySelectionPageIllustration, item.o, R.drawable.strategy_wide_placeholder);
                    Drawable drawableD = C7652xe.d(context, item.k);
                    ImageView strategySelectionIllustration = ir1.e;
                    strategySelectionIllustration.setBackground(drawableD);
                    Intrinsics.checkNotNullExpressionValue(strategySelectionIllustration, "strategySelectionIllustration");
                    MA1.d(strategySelectionIllustration, item.n);
                    ImageView strategySelectionLockIcon = ir1.g;
                    Intrinsics.checkNotNullExpressionValue(strategySelectionLockIcon, "strategySelectionLockIcon");
                    boolean z = item.l;
                    strategySelectionLockIcon.setVisibility(z ? 0 : 8);
                    ir1.h.setText(context.getString(item.e));
                    EnumC7290vu1 enumC7290vu1 = item.f;
                    Integer num = enumC7290vu1.g;
                    ImageView strategySelectionRiskIcon = ir1.k;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        Intrinsics.checkNotNullExpressionValue(strategySelectionRiskIcon, "strategySelectionRiskIcon");
                        C3435dm0.d(strategySelectionRiskIcon, iIntValue);
                    }
                    Intrinsics.checkNotNullExpressionValue(strategySelectionRiskIcon, "strategySelectionRiskIcon");
                    strategySelectionRiskIcon.setVisibility(enumC7290vu1.g != null ? 0 : 8);
                    String string = context.getString(enumC7290vu1.d);
                    TextView textView = ir1.l;
                    textView.setText(string);
                    textView.setTextColor(context.getColor(enumC7290vu1.e));
                    String string2 = context.getString(item.g, item.j);
                    TextView strategySelectionPageLowerDescription = ir1.j;
                    strategySelectionPageLowerDescription.setText(string2);
                    Intrinsics.checkNotNullExpressionValue(strategySelectionPageLowerDescription, "strategySelectionPageLowerDescription");
                    strategySelectionPageLowerDescription.setVisibility(item.a != EnumC2644a42.k ? 0 : 8);
                    MaterialButton tradingStrategiesSelectionButton = strategyInstructionsBottomSheetDialogFragment.i().g;
                    Intrinsics.checkNotNullExpressionValue(tradingStrategiesSelectionButton, "tradingStrategiesSelectionButton");
                    tradingStrategiesSelectionButton.setVisibility(z ? 4 : 0);
                    MaterialButton tradingStrategiesActivationButton = strategyInstructionsBottomSheetDialogFragment.i().e;
                    Intrinsics.checkNotNullExpressionValue(tradingStrategiesActivationButton, "tradingStrategiesActivationButton");
                    tradingStrategiesActivationButton.setVisibility(z ? 0 : 4);
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC6396rf0 interfaceC6396rf0, JM jm, StrategyInstructionsBottomSheetDialogFragment strategyInstructionsBottomSheetDialogFragment) {
                super(2, jm);
                this.g = interfaceC6396rf0;
                this.h = strategyInstructionsBottomSheetDialogFragment;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                a aVar = new a(this.g, jm, this.h);
                aVar.e = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(KN kn, JM<? super Unit> jm) {
                return ((a) create(kn, jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                MN mn = MN.d;
                int i = this.d;
                if (i == 0) {
                    C1795Pt1.b(obj);
                    C0297a c0297a = new C0297a((KN) this.e, this.h);
                    this.d = 1;
                    if (this.g.c(c0297a, this) == mn) {
                        return mn;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C1795Pt1.b(obj);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(FP0 fp0, InterfaceC6396rf0 interfaceC6396rf0, JM jm, StrategyInstructionsBottomSheetDialogFragment strategyInstructionsBottomSheetDialogFragment) {
            super(2, jm);
            this.e = fp0;
            this.g = interfaceC6396rf0;
            this.h = strategyInstructionsBottomSheetDialogFragment;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new b(this.e, this.g, jm, this.h);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((b) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                a aVar = new a(this.g, null, this.h);
                this.d = 1;
                if (RepeatOnLifecycleKt.a(this.e, g.b.h, aVar, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    public StrategyInstructionsBottomSheetDialogFragment(@NotNull Sd2 viewModelFactory) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        this.i = viewModelFactory;
        this.j = a.m;
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        B5 b5 = new B5(this, 5);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new S2(new I6(this, 4), 4));
        return C2151Ui0.a(this, C2017Sp1.a.b(BR1.class), new C6980uR1(interfaceC3770fO0A, 0), new C7190vR1(interfaceC3770fO0A), b5);
    }

    @Override // com.api.feature.bottomsheetdialog.utils.SimpleBindingBottomSheetDialogFragment
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, Z32> g() {
        return this.j;
    }

    @Override // com.api.core.bottomsheetdialogfragment.AbstractBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Object obj = this.g;
        Intrinsics.checkNotNull(obj);
        InterfaceC6396rf0<C3496e42> interfaceC6396rf0 = ((BR1) obj).i;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new b(viewLifecycleOwner, interfaceC6396rf0, null, this), 3);
        Z32 z32I = i();
        z32I.g.setOnClickListener(new ViewOnClickListenerC6733tF0(this, 5));
        Z32 z32I2 = i();
        z32I2.e.setOnClickListener(new ViewOnClickListenerC0792Cy(this, 3));
    }
}
