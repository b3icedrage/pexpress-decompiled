package com.api.core;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.C7576xG;
import defpackage.InterfaceC2311Wi0;
import defpackage.InterfaceC2415Xi0;
import defpackage.InterfaceC7441wd2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u00052\b\u0012\u0004\u0012\u00028\u00000\u00062\b\u0012\u0004\u0012\u00028\u00010\u0007B\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/api/core/SimpleViewModelFragment;", "LxG;", "VM", "Lwd2;", "VB", "Lcom/api/core/BaseFragment;", "LXi0;", "LWi0;", "<init>", "()V", "Core_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SimpleViewModelFragment<VM extends C7576xG, VB extends InterfaceC7441wd2> extends BaseFragment implements InterfaceC2415Xi0<VM>, InterfaceC2311Wi0<VB> {

    @Nullable
    public InterfaceC7441wd2 h;

    @Nullable
    public VM i;

    @NotNull
    public final VB k() {
        VB vb = (VB) this.h;
        Intrinsics.c(vb, "null cannot be cast to non-null type VB of com.api.core.SimpleViewModelFragment");
        return vb;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        VM vm = (VM) c().getValue();
        this.i = vm;
        Intrinsics.checkNotNull(vm);
        vm.j();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.h = g().k(inflater, viewGroup, Boolean.FALSE);
        View viewA = k().a();
        Intrinsics.checkNotNullExpressionValue(viewA, "getRoot(...)");
        return viewA;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.h = null;
        super.onDestroyView();
    }
}
