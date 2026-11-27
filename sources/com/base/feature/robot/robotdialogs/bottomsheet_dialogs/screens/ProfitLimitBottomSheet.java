package com.base.feature.robot.robotdialogs.bottomsheet_dialogs.screens;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.button.MaterialButton;
import com.pexpress.tool.R;
import defpackage.C1606Ni1;
import defpackage.C1684Oi1;
import defpackage.C3435dm0;
import defpackage.C3476e;
import defpackage.EnumC7035uh1;
import defpackage.ViewOnClickListenerC6733tF0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/base/feature/robot/robotdialogs/bottomsheet_dialogs/screens/ProfitLimitBottomSheet;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "FeatureRobotBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProfitLimitBottomSheet extends BottomSheetDialogFragment {

    @NotNull
    public final C1606Ni1 d;

    @Nullable
    public C1684Oi1 e;

    public ProfitLimitBottomSheet(@NotNull C1606Ni1 params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.d = params;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, R.style.CustomBottomSheetDialogTheme);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.profit_limit_dialog, viewGroup, false);
        int i = R.id.profit_limit_dialog_bet_warning;
        if (((ImageView) C3476e.h(viewInflate, R.id.profit_limit_dialog_bet_warning)) != null) {
            i = R.id.profit_limit_dialog_button;
            MaterialButton materialButton = (MaterialButton) C3476e.h(viewInflate, R.id.profit_limit_dialog_button);
            if (materialButton != null) {
                i = R.id.profit_limit_dialog_cup;
                ImageView imageView = (ImageView) C3476e.h(viewInflate, R.id.profit_limit_dialog_cup);
                if (imageView != null) {
                    i = R.id.profit_limit_dialog_description;
                    TextView textView = (TextView) C3476e.h(viewInflate, R.id.profit_limit_dialog_description);
                    if (textView != null) {
                        i = R.id.profit_limit_dialog_title;
                        TextView textView2 = (TextView) C3476e.h(viewInflate, R.id.profit_limit_dialog_title);
                        if (textView2 != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                            C1684Oi1 c1684Oi1 = new C1684Oi1(imageView, textView, textView2, constraintLayout, materialButton);
                            this.e = c1684Oi1;
                            Intrinsics.checkNotNull(c1684Oi1);
                            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
                            return constraintLayout;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull final View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: Mi1
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    view.post(new RunnableC3446dq(dialogInterface, 2));
                }
            });
        }
        C1684Oi1 c1684Oi1 = this.e;
        Intrinsics.checkNotNull(c1684Oi1);
        ImageView profitLimitDialogCup = c1684Oi1.g;
        Intrinsics.checkNotNullExpressionValue(profitLimitDialogCup, "profitLimitDialogCup");
        C3435dm0.e(profitLimitDialogCup, R.drawable.ic_profit_limit_cup, EnumC7035uh1.g);
        C1606Ni1 c1606Ni1 = this.d;
        c1606Ni1.getClass();
        c1684Oi1.i.setText(getString(R.string.you_have_earned_text, c1606Ni1.a));
        c1684Oi1.h.setText(getString(R.string.you_have_earned_description, c1606Ni1.b));
        c1684Oi1.e.setOnClickListener(new ViewOnClickListenerC6733tF0(this, 1));
    }
}
