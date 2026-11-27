package com.api.feature.bottomsheetdialog.utils;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.api.core.bottomsheetdialogfragment.AbstractBottomSheetDialogFragment;
import com.pexpress.tool.R;
import defpackage.AbstractC3878fu;
import defpackage.C2927bM1;
import defpackage.C5189lv;
import defpackage.C7652xe;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC3371dV;
import defpackage.InterfaceC7441wd2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/api/feature/bottomsheetdialog/utils/SimpleBottomSheetWithDataFragment;", "Lwd2;", "VB", "T", "Lcom/api/core/bottomsheetdialogfragment/AbstractBottomSheetDialogFragment;", "Lvo0;", "FeatureBottomSheetDialogApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SimpleBottomSheetWithDataFragment<VB extends InterfaceC7441wd2, T> extends AbstractBottomSheetDialogFragment {

    @NotNull
    public final AbstractC3878fu<T> g;

    @NotNull
    public final InterfaceC3371dV h;

    @Nullable
    public InterfaceC7441wd2 i;

    public SimpleBottomSheetWithDataFragment(@NotNull AbstractC3878fu provider, @NotNull InterfaceC3371dV callbacks) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.g = provider;
        this.h = callbacks;
    }

    @NotNull
    public abstract InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, VB> g();

    public abstract void i(T t);

    @NotNull
    public final VB j() {
        VB vb = (VB) this.i;
        Intrinsics.c(vb, "null cannot be cast to non-null type VB of com.api.feature.bottomsheetdialog.utils.SimpleBottomSheetWithDataFragment");
        return vb;
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
        this.i = g().k(inflater, viewGroup, Boolean.FALSE);
        View viewA = j().a();
        Intrinsics.checkNotNullExpressionValue(viewA, "getRoot(...)");
        return viewA;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.i = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        this.h.onDismiss();
    }

    @Override // com.api.core.bottomsheetdialogfragment.AbstractBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        C5189lv.k(C7652xe.f(this), null, new C2927bM1(this, null), 3);
    }
}
