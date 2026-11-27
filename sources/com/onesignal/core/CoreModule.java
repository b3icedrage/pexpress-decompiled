package com.onesignal.core;

import defpackage.C1389Kp;
import defpackage.C1477Ls1;
import defpackage.C1938Rp0;
import defpackage.C2306Wg1;
import defpackage.C2753ac1;
import defpackage.C5175lq0;
import defpackage.C5274mI1;
import defpackage.C5305mT;
import defpackage.C5419n00;
import defpackage.C7309w01;
import defpackage.C7520x01;
import defpackage.C7582xI;
import defpackage.C7730y01;
import defpackage.C7792yI;
import defpackage.InterfaceC0781Cu0;
import defpackage.InterfaceC1087Gs0;
import defpackage.InterfaceC1165Hs0;
import defpackage.InterfaceC2338Wr0;
import defpackage.InterfaceC2442Xr0;
import defpackage.InterfaceC2523Ys0;
import defpackage.InterfaceC2529Yu0;
import defpackage.InterfaceC3250cu0;
import defpackage.InterfaceC3456dt0;
import defpackage.InterfaceC3666et0;
import defpackage.InterfaceC3879fu0;
import defpackage.InterfaceC4092gv0;
import defpackage.InterfaceC4974kt0;
import defpackage.InterfaceC5400mu0;
import defpackage.InterfaceC6659su0;
import defpackage.InterfaceC7073us0;
import defpackage.InterfaceC7494ws0;
import defpackage.InterfaceC7497wt0;
import defpackage.M02;
import defpackage.NL0;
import defpackage.OA0;
import defpackage.S91;
import defpackage.SK;
import defpackage.T91;
import defpackage.ViewTreeObserverOnGlobalLayoutListenerC1368Ki;
import defpackage.ZY1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/onesignal/core/CoreModule;", "Lwt0;", "<init>", "()V", "LmI1;", "builder", "", "register", "(LmI1;)V", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CoreModule implements InterfaceC7497wt0 {
    @Override // defpackage.InterfaceC7497wt0
    public void register(@NotNull C5274mI1 builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.register(C2306Wg1.class).provides(InterfaceC6659su0.class).provides(InterfaceC2529Yu0.class);
        SK.c(builder, C5175lq0.class, InterfaceC1165Hs0.class, C1938Rp0.class, InterfaceC1087Gs0.class);
        SK.c(builder, ViewTreeObserverOnGlobalLayoutListenerC1368Ki.class, InterfaceC2338Wr0.class, C5419n00.class, InterfaceC7494ws0.class);
        SK.c(builder, ZY1.class, InterfaceC4092gv0.class, C5305mT.class, InterfaceC7073us0.class);
        SK.c(builder, OA0.class, InterfaceC3456dt0.class, C7582xI.class, C7582xI.class);
        SK.c(builder, C2753ac1.class, InterfaceC5400mu0.class, C7792yI.class, InterfaceC2529Yu0.class);
        builder.register(S91.class).provides(S91.class);
        builder.register(T91.class).provides(InterfaceC3879fu0.class).provides(InterfaceC2529Yu0.class);
        builder.register(C1477Ls1.class).provides(C1477Ls1.class).provides(InterfaceC0781Cu0.class);
        builder.register(NL0.class).provides(InterfaceC3666et0.class);
        builder.register(C1389Kp.class).provides(InterfaceC2442Xr0.class).provides(InterfaceC2529Yu0.class);
        builder.register(M02.class).provides(InterfaceC2529Yu0.class);
        builder.register(C7730y01.class).provides(InterfaceC3250cu0.class);
        SK.c(builder, C7309w01.class, InterfaceC2523Ys0.class, C7520x01.class, InterfaceC4974kt0.class);
    }
}
