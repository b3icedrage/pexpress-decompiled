package com.api.core;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.InterfaceC6856tq;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/api/core/BindingFragment;", "Lcom/api/core/BaseFragment;", "Core_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BindingFragment extends BaseFragment {

    @NotNull
    public final InterfaceC6856tq h;

    public BindingFragment(@NotNull InterfaceC6856tq binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.h = binding;
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public InterfaceC6856tq getH() {
        return this.h;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return getH().V(inflater, viewGroup);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        getH().E();
        super.onDestroyView();
    }
}
