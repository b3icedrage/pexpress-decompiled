package com.api.core;

import android.os.Bundle;
import defpackage.C7576xG;
import defpackage.InterfaceC2415Xi0;
import defpackage.InterfaceC6856tq;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004¨\u0006\u0005"}, d2 = {"Lcom/api/core/ViewModelFragment;", "LxG;", "VM", "Lcom/api/core/BindingFragment;", "LXi0;", "Core_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ViewModelFragment<VM extends C7576xG> extends BindingFragment implements InterfaceC2415Xi0<VM> {

    @Nullable
    public VM i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelFragment(@NotNull InterfaceC6856tq bindingProvider) {
        super(bindingProvider);
        Intrinsics.checkNotNullParameter(bindingProvider, "bindingProvider");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        VM vm = (VM) c().getValue();
        this.i = vm;
        Intrinsics.checkNotNull(vm);
        vm.j();
    }
}
