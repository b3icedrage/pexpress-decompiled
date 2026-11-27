package com.api.feature.bottomsheetdialog.utils;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.AbstractC7066uq;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC7441wd2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/api/feature/bottomsheetdialog/utils/SimpleBindingBottomSheetDialogFragment;", "Luq;", "VM", "Lwd2;", "VB", "Lcom/api/feature/bottomsheetdialog/utils/BaseBottomSheetDialogFragment;", "<init>", "()V", "FeatureBottomSheetDialogApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SimpleBindingBottomSheetDialogFragment<VM extends AbstractC7066uq, VB extends InterfaceC7441wd2> extends BaseBottomSheetDialogFragment<VM> {

    @Nullable
    public InterfaceC7441wd2 h;

    @NotNull
    public abstract InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, VB> g();

    @NotNull
    public final VB i() {
        VB vb = (VB) this.h;
        Intrinsics.c(vb, "null cannot be cast to non-null type VB of com.api.feature.bottomsheetdialog.utils.SimpleBindingBottomSheetDialogFragment");
        return vb;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.h = g().k(inflater, viewGroup, Boolean.FALSE);
        View viewA = i().a();
        Intrinsics.checkNotNullExpressionValue(viewA, "getRoot(...)");
        return viewA;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.h = null;
        super.onDestroyView();
    }
}
