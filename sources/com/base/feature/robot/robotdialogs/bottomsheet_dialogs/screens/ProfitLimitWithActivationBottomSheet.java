package com.base.feature.robot.robotdialogs.bottomsheet_dialogs.screens;

import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Guideline;
import com.api.feature.bottomsheetdialog.utils.SimpleBottomSheetWithDataFragment;
import com.google.android.material.button.MaterialButton;
import com.onesignal.core.activities.PermissionsActivity;
import com.pexpress.tool.R;
import defpackage.C1762Pi1;
import defpackage.C2784ak0;
import defpackage.C3424dj1;
import defpackage.C3435dm0;
import defpackage.C3476e;
import defpackage.C3633ej1;
import defpackage.C4053gj1;
import defpackage.C5;
import defpackage.C5189lv;
import defpackage.EnumC7035uh1;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC3371dV;
import defpackage.R40;
import defpackage.ViewOnClickListenerC0927Er;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/robot/robotdialogs/bottomsheet_dialogs/screens/ProfitLimitWithActivationBottomSheet;", "Lcom/api/feature/bottomsheetdialog/utils/SimpleBottomSheetWithDataFragment;", "LPi1;", "Lgj1;", "FeatureRobotBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProfitLimitWithActivationBottomSheet extends SimpleBottomSheetWithDataFragment<C1762Pi1, C4053gj1> {
    public static final long k;
    public static final long l;
    public static final /* synthetic */ int m = 0;

    @NotNull
    public final a j;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C1762Pi1> {
        public static final a m = new a(3, C1762Pi1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/robot/databinding/ProfitLimitDialogWithActivationBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final C1762Pi1 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.profit_limit_dialog_with_activation, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.profit_limit_with_activation_dialog_active_button;
            MaterialButton materialButton = (MaterialButton) C3476e.h(viewInflate, R.id.profit_limit_with_activation_dialog_active_button);
            if (materialButton != null) {
                i = R.id.profit_limit_with_activation_dialog_amount;
                TextView textView = (TextView) C3476e.h(viewInflate, R.id.profit_limit_with_activation_dialog_amount);
                if (textView != null) {
                    i = R.id.profit_limit_with_activation_dialog_bet_warning;
                    if (((ImageView) C3476e.h(viewInflate, R.id.profit_limit_with_activation_dialog_bet_warning)) != null) {
                        i = R.id.profit_limit_with_activation_dialog_cup;
                        ImageView imageView = (ImageView) C3476e.h(viewInflate, R.id.profit_limit_with_activation_dialog_cup);
                        if (imageView != null) {
                            i = R.id.profit_limit_with_activation_dialog_description;
                            TextView textView2 = (TextView) C3476e.h(viewInflate, R.id.profit_limit_with_activation_dialog_description);
                            if (textView2 != null) {
                                i = R.id.profit_limit_with_activation_dialog_guideline;
                                if (((Guideline) C3476e.h(viewInflate, R.id.profit_limit_with_activation_dialog_guideline)) != null) {
                                    i = R.id.profit_limit_with_activation_dialog_infinity;
                                    if (((TextView) C3476e.h(viewInflate, R.id.profit_limit_with_activation_dialog_infinity)) != null) {
                                        MotionLayout motionLayout = (MotionLayout) viewInflate;
                                        i = R.id.profit_limit_with_activation_dialog_moving_cup;
                                        ImageView imageView2 = (ImageView) C3476e.h(viewInflate, R.id.profit_limit_with_activation_dialog_moving_cup);
                                        if (imageView2 != null) {
                                            i = R.id.profit_limit_with_activation_dialog_passive_button;
                                            MaterialButton materialButton2 = (MaterialButton) C3476e.h(viewInflate, R.id.profit_limit_with_activation_dialog_passive_button);
                                            if (materialButton2 != null) {
                                                i = R.id.profit_limit_with_activation_dialog_progress_bar;
                                                if (((ProgressBar) C3476e.h(viewInflate, R.id.profit_limit_with_activation_dialog_progress_bar)) != null) {
                                                    i = R.id.profit_limit_with_activation_dialog_title;
                                                    if (((TextView) C3476e.h(viewInflate, R.id.profit_limit_with_activation_dialog_title)) != null) {
                                                        return new C1762Pi1(motionLayout, materialButton, textView, imageView, textView2, motionLayout, imageView2, materialButton2);
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

    static {
        b.a aVar = b.e;
        R40 r40 = R40.MILLISECONDS;
        k = c.g(PermissionsActivity.DELAY_TIME_CALLBACK_CALL, r40);
        l = c.g(150, r40);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfitLimitWithActivationBottomSheet(@NotNull InterfaceC3371dV defaultDialogCallbacks, @NotNull C3633ej1 profitLimitWithActivationBottomSheetDataProvider) {
        super(profitLimitWithActivationBottomSheetDataProvider, defaultDialogCallbacks);
        Intrinsics.checkNotNullParameter(defaultDialogCallbacks, "defaultDialogCallbacks");
        Intrinsics.checkNotNullParameter(profitLimitWithActivationBottomSheetDataProvider, "profitLimitWithActivationBottomSheetDataProvider");
        this.j = a.m;
    }

    @Override // com.api.feature.bottomsheetdialog.utils.SimpleBottomSheetWithDataFragment
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C1762Pi1> g() {
        return this.j;
    }

    @Override // com.api.feature.bottomsheetdialog.utils.SimpleBottomSheetWithDataFragment
    public final void i(C4053gj1 c4053gj1) {
        C4053gj1 data = c4053gj1;
        Intrinsics.checkNotNullParameter(data, "data");
        C1762Pi1 c1762Pi1J = j();
        setCancelable(false);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
        ImageView profitLimitWithActivationDialogMovingCup = c1762Pi1J.k;
        Intrinsics.checkNotNullExpressionValue(profitLimitWithActivationDialogMovingCup, "profitLimitWithActivationDialogMovingCup");
        EnumC7035uh1 enumC7035uh1 = EnumC7035uh1.g;
        C3435dm0.e(profitLimitWithActivationDialogMovingCup, R.drawable.ic_profit_limit_with_activation_moving_cup, enumC7035uh1);
        ImageView profitLimitWithActivationDialogCup = c1762Pi1J.h;
        Intrinsics.checkNotNullExpressionValue(profitLimitWithActivationDialogCup, "profitLimitWithActivationDialogCup");
        C3435dm0.e(profitLimitWithActivationDialogCup, R.drawable.ic_profit_limit_cup, enumC7035uh1);
        c1762Pi1J.i.setText(getString(R.string.you_have_reached_profit_description, data.d));
        c1762Pi1J.g.setText(data.b);
        c1762Pi1J.e.setOnClickListener(new ViewOnClickListenerC0927Er(this, data, 1));
        c1762Pi1J.l.setOnClickListener(new C5(this, data));
        C5189lv.k(data.a, null, new C3424dj1(c1762Pi1J, this, null), 3);
    }
}
