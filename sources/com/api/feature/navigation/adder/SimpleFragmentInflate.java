package com.api.feature.navigation.adder;

import android.os.Bundle;
import android.view.View;
import com.api.core.SimpleViewModelFragment;
import defpackage.C1589Ne;
import defpackage.C7576xG;
import defpackage.GP1;
import defpackage.InterfaceC3092c81;
import defpackage.InterfaceC7441wd2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/api/feature/navigation/adder/SimpleFragmentInflate;", "LxG;", "VM", "Lwd2;", "VB", "Lcom/api/core/SimpleViewModelFragment;", "Lc81;", "<init>", "()V", "FeatureNavigationApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SimpleFragmentInflate<VM extends C7576xG, VB extends InterfaceC7441wd2> extends SimpleViewModelFragment<VM, VB> implements InterfaceC3092c81 {

    @NotNull
    public final GP1 j;

    @NotNull
    public final GP1 k;

    public SimpleFragmentInflate() {
        GP1 gp1I = C1589Ne.i(Boolean.FALSE);
        this.j = gp1I;
        this.k = gp1I;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        a();
        Boolean bool = Boolean.TRUE;
        GP1 gp1 = this.j;
        gp1.getClass();
        gp1.m(null, bool);
    }
}
