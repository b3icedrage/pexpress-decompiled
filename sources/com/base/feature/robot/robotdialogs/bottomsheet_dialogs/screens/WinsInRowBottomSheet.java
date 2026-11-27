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
import com.base.feature.robot.robotdialogs.bottomsheet_dialogs.screens.WinsInRowBottomSheet;
import com.google.android.material.button.MaterialButton;
import com.onesignal.core.activities.PermissionsActivity;
import com.pexpress.tool.R;
import defpackage.C2784ak0;
import defpackage.C3435dm0;
import defpackage.C3476e;
import defpackage.C3633ej1;
import defpackage.C4053gj1;
import defpackage.C5189lv;
import defpackage.C6414rj2;
import defpackage.C6624sj2;
import defpackage.EnumC7035uh1;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC3371dV;
import defpackage.R40;
import defpackage.ViewOnClickListenerC3466dw1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/robot/robotdialogs/bottomsheet_dialogs/screens/WinsInRowBottomSheet;", "Lcom/api/feature/bottomsheetdialog/utils/SimpleBottomSheetWithDataFragment;", "Lsj2;", "Lgj1;", "FeatureRobotBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WinsInRowBottomSheet extends SimpleBottomSheetWithDataFragment<C6624sj2, C4053gj1> {
    public static final long k;
    public static final long l;
    public static final /* synthetic */ int m = 0;

    @NotNull
    public final a j;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C6624sj2> {
        public static final a m = new a(3, C6624sj2.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/robot/databinding/WinsInRowDialogBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final C6624sj2 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.wins_in_row_dialog, viewGroup2, false);
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
                                        i = R.id.profit_limit_with_activation_dialog_passive_button;
                                        MaterialButton materialButton2 = (MaterialButton) C3476e.h(viewInflate, R.id.profit_limit_with_activation_dialog_passive_button);
                                        if (materialButton2 != null) {
                                            i = R.id.profit_limit_with_activation_dialog_progress_bar;
                                            if (((ProgressBar) C3476e.h(viewInflate, R.id.profit_limit_with_activation_dialog_progress_bar)) != null) {
                                                i = R.id.profit_limit_with_activation_dialog_title;
                                                TextView textView3 = (TextView) C3476e.h(viewInflate, R.id.profit_limit_with_activation_dialog_title);
                                                if (textView3 != null) {
                                                    return new C6624sj2(motionLayout, materialButton, textView, imageView, textView2, motionLayout, materialButton2, textView3);
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
    public WinsInRowBottomSheet(@NotNull InterfaceC3371dV defaultDialogCallbacks, @NotNull C3633ej1 profitLimitWithActivationBottomSheetDataProvider) {
        super(profitLimitWithActivationBottomSheetDataProvider, defaultDialogCallbacks);
        Intrinsics.checkNotNullParameter(defaultDialogCallbacks, "defaultDialogCallbacks");
        Intrinsics.checkNotNullParameter(profitLimitWithActivationBottomSheetDataProvider, "profitLimitWithActivationBottomSheetDataProvider");
        this.j = a.m;
    }

    @Override // com.api.feature.bottomsheetdialog.utils.SimpleBottomSheetWithDataFragment
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C6624sj2> g() {
        return this.j;
    }

    @Override // com.api.feature.bottomsheetdialog.utils.SimpleBottomSheetWithDataFragment
    public final void i(C4053gj1 c4053gj1) {
        int i;
        int i2;
        final C4053gj1 data = c4053gj1;
        Intrinsics.checkNotNullParameter(data, "data");
        C6624sj2 c6624sj2J = j();
        setCancelable(false);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
        int i3 = data.e;
        if (i3 == 0) {
            i = R.drawable.ic_profit_limit_cup;
        } else if (i3 != 1) {
            i = i3 != 2 ? R.drawable.ic_profit_limit_other : R.drawable.ic_profit_limit_2;
        } else {
            i = R.drawable.ic_profit_limit_1;
        }
        ImageView profitLimitWithActivationDialogCup = c6624sj2J.h;
        Intrinsics.checkNotNullExpressionValue(profitLimitWithActivationDialogCup, "profitLimitWithActivationDialogCup");
        C3435dm0.e(profitLimitWithActivationDialogCup, i, EnumC7035uh1.g);
        if (i3 == 0) {
            i2 = R.string.profit_limit_popup_one_title;
        } else if (i3 != 1) {
            i2 = i3 != 2 ? R.string.profit_limit_popup_four_title : R.string.profit_limit_popup_three_title;
        } else {
            i2 = R.string.profit_limit_popup_two_title;
        }
        c6624sj2J.l.setText(i2);
        c6624sj2J.i.setText(R.string.profit_limit_popup_text);
        c6624sj2J.g.setText(data.b);
        c6624sj2J.e.setOnClickListener(new View.OnClickListener() { // from class: qj2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = WinsInRowBottomSheet.m;
                this.d.dismiss();
                data.g.invoke();
            }
        });
        c6624sj2J.k.setOnClickListener(new ViewOnClickListenerC3466dw1(this, data));
        C5189lv.k(data.a, null, new C6414rj2(c6624sj2J, this, null), 3);
    }
}
