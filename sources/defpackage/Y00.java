package defpackage;

import com.base.feature.alertdialog.screen.AlertDialog;
import com.base.feature.alertdialog.screen.AlertDialogRotated;
import com.base.feature.alertdialog.screen.AlertDialogWithCheckBox;
import com.base.feature.alertdialog.screen.AlertDialogWithEditText;
import com.base.feature.alertdialog.screen.AlertDialogWithVerticalButtons;
import com.base.feature.alertdialog.screen.AlertDialogWithVerticalButtonsRotated;
import com.base.feature.alertdialog.screen.DialogCoupon;
import com.base.feature.alertdialog.screen.DialogFullScreen;
import com.base.feature.alertdialog.screen.DialogFullScreenCentered;
import com.base.feature.alertdialog.screen.RateAppDialog;
import com.base.feature.alertdialog.screen.SimpleAlertDialogWithBinding;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Y00 implements X00 {

    @NotNull
    public final ZA1 a;

    public Y00(@NotNull ZA1 rotationProvider) {
        Intrinsics.checkNotNullParameter(rotationProvider, "rotationProvider");
        this.a = rotationProvider;
    }

    @Override // defpackage.X00
    @NotNull
    public final SimpleAlertDialogWithBinding a(@NotNull TF dialogParams) {
        Intrinsics.checkNotNullParameter(dialogParams, "dialogParams");
        boolean z = dialogParams instanceof C7133v9;
        ZA1 za1 = this.a;
        if (z) {
            return ((Boolean) za1.a().d.getValue()).booleanValue() ? new AlertDialogRotated((C7133v9) dialogParams) : new AlertDialog((C7133v9) dialogParams);
        }
        if (dialogParams instanceof M9) {
            return ((Boolean) za1.a().d.getValue()).booleanValue() ? new AlertDialogWithVerticalButtonsRotated((M9) dialogParams) : new AlertDialogWithVerticalButtons((M9) dialogParams);
        }
        if (dialogParams instanceof C3692f10) {
            return new DialogFullScreen((C3692f10) dialogParams);
        }
        if (dialogParams instanceof C3482e10) {
            return new DialogFullScreenCentered((C3482e10) dialogParams);
        }
        if (dialogParams instanceof U00) {
            return new DialogCoupon((U00) dialogParams);
        }
        if (dialogParams instanceof H9) {
            return new AlertDialogWithEditText((H9) dialogParams);
        }
        if (dialogParams instanceof D9) {
            return new AlertDialogWithCheckBox((D9) dialogParams);
        }
        if (dialogParams instanceof C6635sm1) {
            return new RateAppDialog((C6635sm1) dialogParams);
        }
        throw new IllegalStateException(("no matching dialog found for params: " + dialogParams).toString());
    }
}
