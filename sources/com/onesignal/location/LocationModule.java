package com.onesignal.location;

import defpackage.C2816ap0;
import defpackage.C3507e71;
import defpackage.C4266hk0;
import defpackage.C5274mI1;
import defpackage.C6424rm0;
import defpackage.InterfaceC0853Ds0;
import defpackage.InterfaceC1719Ou0;
import defpackage.InterfaceC2338Wr0;
import defpackage.InterfaceC2520Yr0;
import defpackage.InterfaceC2529Yu0;
import defpackage.InterfaceC4544it0;
import defpackage.InterfaceC4764jt0;
import defpackage.InterfaceC4974kt0;
import defpackage.InterfaceC5397mt0;
import defpackage.InterfaceC7494ws0;
import defpackage.InterfaceC7497wt0;
import defpackage.ML0;
import defpackage.SK;
import defpackage.SR0;
import defpackage.TR0;
import defpackage.VR0;
import defpackage.WR0;
import defpackage.YR0;
import defpackage.ZR0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/onesignal/location/LocationModule;", "Lwt0;", "<init>", "()V", "LmI1;", "builder", "", "register", "(LmI1;)V", "com.onesignal.location"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class LocationModule implements InterfaceC7497wt0 {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LOu0;", "it", "Ljt0;", "invoke", "(LOu0;)Ljt0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class a extends ML0 implements Function1<InterfaceC1719Ou0, InterfaceC4764jt0> {
        public static final a INSTANCE = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final InterfaceC4764jt0 invoke(@NotNull InterfaceC1719Ou0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            InterfaceC7494ws0 interfaceC7494ws0 = (InterfaceC7494ws0) it.getService(InterfaceC7494ws0.class);
            if (interfaceC7494ws0.isAndroidDeviceType() && ZR0.INSTANCE.hasGMSLocationLibrary()) {
                return new C6424rm0((InterfaceC2338Wr0) it.getService(InterfaceC2338Wr0.class), (InterfaceC0853Ds0) it.getService(InterfaceC0853Ds0.class));
            }
            return (interfaceC7494ws0.isHuaweiDeviceType() && ZR0.INSTANCE.hasHMSLocationLibrary()) ? new C2816ap0((InterfaceC2338Wr0) it.getService(InterfaceC2338Wr0.class)) : new C3507e71();
        }
    }

    @Override // defpackage.InterfaceC7497wt0
    public void register(@NotNull C5274mI1 builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.register(WR0.class).provides(WR0.class).provides(InterfaceC2529Yu0.class);
        builder.register(C4266hk0.class).provides(InterfaceC0853Ds0.class);
        builder.register((Function1) a.INSTANCE).provides(InterfaceC4764jt0.class);
        builder.register(YR0.class).provides(InterfaceC5397mt0.class);
        SK.c(builder, TR0.class, InterfaceC4544it0.class, SR0.class, InterfaceC2520Yr0.class);
        builder.register(VR0.class).provides(InterfaceC4974kt0.class).provides(InterfaceC2529Yu0.class);
    }
}
