package com.api.feature.alertdialog.screens;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import com.pexpress.tool.R;
import defpackage.C7530x3;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC6923u9;
import defpackage.InterfaceC7441wd2;
import defpackage.KW1;
import defpackage.XO0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/api/feature/alertdialog/screens/AlertDialogWithBinding;", "Lwd2;", "VB", "Landroidx/fragment/app/DialogFragment;", "Lu9;", "<init>", "()V", "FeatureAlertDialogApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AlertDialogWithBinding<VB extends InterfaceC7441wd2> extends DialogFragment implements InterfaceC6923u9 {

    @Nullable
    public VB d;

    @NotNull
    public final KW1 e = XO0.b(new C7530x3(this, 1));

    @NotNull
    public abstract InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, VB> g();

    @Override // androidx.fragment.app.DialogFragment
    public final int getTheme() {
        return R.style.Theme_Dialog;
    }

    @NotNull
    public final VB i() {
        return (VB) this.e.getValue();
    }

    public abstract void j(@Nullable Dialog dialog);

    public abstract void k(@NotNull Dialog dialog);

    @Override // androidx.fragment.app.DialogFragment
    @NotNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.checkNotNullExpressionValue(dialogOnCreateDialog, "onCreateDialog(...)");
        k(dialogOnCreateDialog);
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        VB vbK = g().k(inflater, viewGroup, Boolean.FALSE);
        this.d = vbK;
        Intrinsics.checkNotNull(vbK);
        return vbK.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        j(getDialog());
    }
}
