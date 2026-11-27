package com.api.core;

import androidx.lifecycle.g;
import androidx.lifecycle.k;
import defpackage.C1589Ne;
import defpackage.C1699On1;
import defpackage.C4466ii;
import defpackage.FP0;
import defpackage.GP1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/core/ActivityStateProvider;", "Landroidx/lifecycle/k;", "<init>", "()V", "Core_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ActivityStateProvider implements k {

    @NotNull
    public final GP1 d;

    @NotNull
    public final C1699On1 e;

    public ActivityStateProvider() {
        GP1 gp1I = C1589Ne.i(g.b.e);
        this.d = gp1I;
        this.e = C4466ii.f(gp1I);
    }

    @Override // androidx.lifecycle.k
    public final void b(@NotNull FP0 source, @NotNull g.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        this.d.setValue(source.getLifecycle().b());
    }
}
