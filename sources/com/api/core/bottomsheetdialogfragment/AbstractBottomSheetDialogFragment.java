package com.api.core.bottomsheetdialogfragment;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import defpackage.InterfaceC7271vo0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/api/core/bottomsheetdialogfragment/AbstractBottomSheetDialogFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Lvo0;", "<init>", "()V", "Core_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AbstractBottomSheetDialogFragment extends BottomSheetDialogFragment implements InterfaceC7271vo0 {
    public final int d = 3;

    @Nullable
    public Integer e;

    public AbstractBottomSheetDialogFragment() {
        Intrinsics.checkNotNullExpressionValue(getClass().getSimpleName(), "getSimpleName(...)");
    }

    @Override // defpackage.InterfaceC7271vo0
    public final void d() {
    }

    @Override // defpackage.InterfaceC7271vo0
    public final void f() {
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        Window window;
        super.onPause();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setWindowAnimations(-1);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        Dialog dialog;
        Window window;
        super.onResume();
        if (this.e == null || (dialog = getDialog()) == null || (window = dialog.getWindow()) == null) {
            return;
        }
        Integer num = this.e;
        Intrinsics.checkNotNull(num);
        window.setWindowAnimations(num.intValue());
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NotNull Bundle outState) {
        Window window;
        WindowManager.LayoutParams attributes;
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        Dialog dialog = getDialog();
        Integer numValueOf = (dialog == null || (window = dialog.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : Integer.valueOf(attributes.windowAnimations);
        if (numValueOf != null) {
            outState.putInt("windowAnimation", numValueOf.intValue());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull final View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: O
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    view.post(new P(0, dialogInterface, this));
                }
            });
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onViewStateRestored(@Nullable Bundle bundle) {
        super.onViewStateRestored(bundle);
        this.e = bundle != null ? Integer.valueOf(bundle.getInt("windowAnimation")) : null;
    }
}
