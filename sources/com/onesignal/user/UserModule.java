package com.onesignal.user;

import defpackage.BU1;
import defpackage.C1408Kv0;
import defpackage.C1624No1;
import defpackage.C1702Oo1;
import defpackage.C2112Tv0;
import defpackage.C2190Uv0;
import defpackage.C2268Vv0;
import defpackage.C3868fq1;
import defpackage.C5274mI1;
import defpackage.C5726oT0;
import defpackage.C5963pb2;
import defpackage.C6146qT0;
import defpackage.C6204qj1;
import defpackage.C6413rj1;
import defpackage.C6802tb2;
import defpackage.C6957uK;
import defpackage.C7199vU1;
import defpackage.C7536x41;
import defpackage.C8040zU1;
import defpackage.C8113zo1;
import defpackage.CU1;
import defpackage.FU1;
import defpackage.InterfaceC1321Js0;
import defpackage.InterfaceC2529Yu0;
import defpackage.InterfaceC2834av0;
import defpackage.InterfaceC3244cs0;
import defpackage.InterfaceC3253cv0;
import defpackage.InterfaceC3669eu0;
import defpackage.InterfaceC5181ls0;
import defpackage.InterfaceC5403mv0;
import defpackage.InterfaceC5613nv0;
import defpackage.InterfaceC7497wt0;
import defpackage.InterfaceC8130zu0;
import defpackage.SK;
import defpackage.Ua2;
import defpackage.Y92;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/onesignal/user/UserModule;", "Lwt0;", "<init>", "()V", "LmI1;", "builder", "", "register", "(LmI1;)V", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class UserModule implements InterfaceC7497wt0 {
    @Override // defpackage.InterfaceC7497wt0
    public void register(@NotNull C5274mI1 builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.register(C6957uK.class).provides(InterfaceC5181ls0.class);
        builder.register(C6204qj1.class).provides(C6204qj1.class);
        builder.register(C6413rj1.class).provides(InterfaceC3244cs0.class);
        SK.c(builder, C2112Tv0.class, C2112Tv0.class, C2190Uv0.class, InterfaceC3244cs0.class);
        builder.register(C1408Kv0.class).provides(InterfaceC1321Js0.class);
        builder.register(C2268Vv0.class).provides(C2268Vv0.class).provides(InterfaceC3669eu0.class);
        builder.register(BU1.class).provides(BU1.class);
        SK.c(builder, CU1.class, InterfaceC3244cs0.class, C7199vU1.class, InterfaceC2834av0.class);
        builder.register(FU1.class).provides(FU1.class).provides(InterfaceC3669eu0.class);
        builder.register(C8040zU1.class).provides(InterfaceC3253cv0.class);
        builder.register(C8113zo1.class).provides(InterfaceC8130zu0.class);
        builder.register(Ua2.class).provides(InterfaceC5403mv0.class);
        builder.register(Y92.class).provides(Y92.class).provides(InterfaceC3669eu0.class);
        builder.register(C6146qT0.class).provides(InterfaceC3669eu0.class);
        SK.c(builder, C5726oT0.class, InterfaceC3669eu0.class, C3868fq1.class, InterfaceC3669eu0.class);
        SK.c(builder, C5963pb2.class, InterfaceC5613nv0.class, C6802tb2.class, InterfaceC2529Yu0.class);
        SK.c(builder, C1702Oo1.class, InterfaceC2529Yu0.class, C1624No1.class, InterfaceC2529Yu0.class);
        builder.register(C7536x41.class).provides(C7536x41.class);
    }
}
