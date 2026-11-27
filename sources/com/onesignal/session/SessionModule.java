package com.onesignal.session;

import defpackage.C0566Aa1;
import defpackage.C0644Ba1;
import defpackage.C0722Ca1;
import defpackage.C0800Da1;
import defpackage.C1734Oz0;
import defpackage.C5274mI1;
import defpackage.InterfaceC1875Qu0;
import defpackage.InterfaceC1953Ru0;
import defpackage.InterfaceC2520Yr0;
import defpackage.InterfaceC2529Yu0;
import defpackage.InterfaceC3244cs0;
import defpackage.InterfaceC3247ct0;
import defpackage.InterfaceC4547iu0;
import defpackage.InterfaceC4767ju0;
import defpackage.InterfaceC4977ku0;
import defpackage.InterfaceC5187lu0;
import defpackage.InterfaceC7497wt0;
import defpackage.JI1;
import defpackage.KI1;
import defpackage.MI1;
import defpackage.XI1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/onesignal/session/SessionModule;", "Lwt0;", "<init>", "()V", "LmI1;", "builder", "", "register", "(LmI1;)V", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SessionModule implements InterfaceC7497wt0 {
    @Override // defpackage.InterfaceC7497wt0
    public void register(@NotNull C5274mI1 builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.register(C0722Ca1.class).provides(InterfaceC4977ku0.class);
        builder.register(C0800Da1.class).provides(InterfaceC5187lu0.class);
        builder.register(C0566Aa1.class).provides(InterfaceC4547iu0.class);
        builder.register(C0644Ba1.class).provides(InterfaceC4767ju0.class).provides(InterfaceC2529Yu0.class);
        builder.register(C1734Oz0.class).provides(InterfaceC3247ct0.class);
        builder.register(MI1.class).provides(MI1.class);
        builder.register(XI1.class).provides(InterfaceC1953Ru0.class).provides(InterfaceC2529Yu0.class).provides(InterfaceC2520Yr0.class).provides(InterfaceC3244cs0.class);
        builder.register(JI1.class).provides(InterfaceC2529Yu0.class);
        builder.register(KI1.class).provides(InterfaceC1875Qu0.class);
    }
}
