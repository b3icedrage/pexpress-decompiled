package com.api.feature.bottomsheetdialog.utils;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.AbstractC7066uq;
import defpackage.C6268r22;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/feature/bottomsheetdialog/utils/BindingBottomSheetDialogFragment;", "Luq;", "VM", "Lcom/api/feature/bottomsheetdialog/utils/BaseBottomSheetDialogFragment;", "FeatureBottomSheetDialogApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BindingBottomSheetDialogFragment<VM extends AbstractC7066uq> extends BaseBottomSheetDialogFragment<VM> {

    @NotNull
    public final C6268r22 h;

    public BindingBottomSheetDialogFragment(@NotNull C6268r22 binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.h = binding;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return this.h.V(inflater, viewGroup);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.h.E();
        super.onDestroyView();
    }
}
