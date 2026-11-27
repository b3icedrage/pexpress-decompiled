package com.api.feature.bottomsheetdialog.utils;

import android.content.DialogInterface;
import android.os.Bundle;
import com.api.core.bottomsheetdialogfragment.AbstractBottomSheetDialogFragment;
import com.pexpress.tool.R;
import defpackage.AbstractC7066uq;
import defpackage.InterfaceC2415Xi0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/api/feature/bottomsheetdialog/utils/BaseBottomSheetDialogFragment;", "Luq;", "VM", "Lcom/api/core/bottomsheetdialogfragment/AbstractBottomSheetDialogFragment;", "LXi0;", "<init>", "()V", "FeatureBottomSheetDialogApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseBottomSheetDialogFragment<VM extends AbstractC7066uq> extends AbstractBottomSheetDialogFragment implements InterfaceC2415Xi0<VM> {

    @Nullable
    public VM g;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, R.style.CustomBottomSheetDialogTheme);
        VM vm = (VM) c().getValue();
        this.g = vm;
        Intrinsics.checkNotNull(vm);
        vm.j();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        VM vm = this.g;
        Intrinsics.checkNotNull(vm);
        vm.m();
    }
}
