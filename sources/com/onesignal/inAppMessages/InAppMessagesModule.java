package com.onesignal.inAppMessages;

import defpackage.C1566Mw0;
import defpackage.C1647Nw0;
import defpackage.C1803Pw0;
import defpackage.C1944Rr0;
import defpackage.C3050bx0;
import defpackage.C3468dx0;
import defpackage.C4598j52;
import defpackage.C5018l52;
import defpackage.C5196lx0;
import defpackage.C5274mI1;
import defpackage.C5409mx0;
import defpackage.C5619nx0;
import defpackage.C6039px0;
import defpackage.InterfaceC1399Ks0;
import defpackage.InterfaceC1476Ls0;
import defpackage.InterfaceC1635Ns0;
import defpackage.InterfaceC2259Vs0;
import defpackage.InterfaceC2523Ys0;
import defpackage.InterfaceC2529Yu0;
import defpackage.InterfaceC2601Zs0;
import defpackage.InterfaceC2828at0;
import defpackage.InterfaceC3244cs0;
import defpackage.InterfaceC4980kv0;
import defpackage.InterfaceC7497wt0;
import defpackage.SK;
import defpackage.W40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/onesignal/inAppMessages/InAppMessagesModule;", "Lwt0;", "<init>", "()V", "LmI1;", "builder", "", "register", "(LmI1;)V", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class InAppMessagesModule implements InterfaceC7497wt0 {
    @Override // defpackage.InterfaceC7497wt0
    public void register(@NotNull C5274mI1 builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.register(C6039px0.class).provides(C6039px0.class);
        builder.register(C1803Pw0.class).provides(C1803Pw0.class);
        builder.register(C5409mx0.class).provides(InterfaceC2601Zs0.class);
        SK.c(builder, C5619nx0.class, InterfaceC2828at0.class, C1566Mw0.class, InterfaceC1399Ks0.class);
        SK.c(builder, C1944Rr0.class, InterfaceC1635Ns0.class, C5018l52.class, C5018l52.class);
        SK.c(builder, C4598j52.class, InterfaceC4980kv0.class, W40.class, W40.class);
        SK.c(builder, C1647Nw0.class, InterfaceC1476Ls0.class, C3050bx0.class, InterfaceC3244cs0.class);
        builder.register(C3468dx0.class).provides(InterfaceC2259Vs0.class);
        builder.register(C5196lx0.class).provides(InterfaceC2523Ys0.class).provides(InterfaceC2529Yu0.class);
    }
}
