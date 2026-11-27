package com.onesignal.notifications;

import com.onesignal.notifications.internal.generation.impl.NotificationGenerationWorkManager;
import com.onesignal.notifications.internal.listeners.DeviceRegistrationListener;
import com.onesignal.notifications.internal.receivereceipt.impl.ReceiveReceiptWorkManager;
import com.onesignal.notifications.internal.restoration.impl.NotificationRestoreWorkManager;
import defpackage.C0842Do1;
import defpackage.C0913Em0;
import defpackage.C0964Fd0;
import defpackage.C1859Qp;
import defpackage.C2655a71;
import defpackage.C2875b61;
import defpackage.C2954bV1;
import defpackage.C4271hl1;
import defpackage.C4739jl1;
import defpackage.C4949kl1;
import defpackage.C5159ll1;
import defpackage.C5274mI1;
import defpackage.C5444n61;
import defpackage.C5864p61;
import defpackage.C6002pl1;
import defpackage.C6493s61;
import defpackage.C7333w61;
import defpackage.C7544x61;
import defpackage.C7582xI;
import defpackage.E61;
import defpackage.F61;
import defpackage.InterfaceC0625Au0;
import defpackage.InterfaceC0703Bu0;
import defpackage.InterfaceC0778Ct0;
import defpackage.InterfaceC0856Dt0;
import defpackage.InterfaceC0934Et0;
import defpackage.InterfaceC1012Ft0;
import defpackage.InterfaceC1246It0;
import defpackage.InterfaceC1324Jt0;
import defpackage.InterfaceC1402Kt0;
import defpackage.InterfaceC1479Lt0;
import defpackage.InterfaceC1716Ot0;
import defpackage.InterfaceC1719Ou0;
import defpackage.InterfaceC1794Pt0;
import defpackage.InterfaceC1872Qt0;
import defpackage.InterfaceC1950Rt0;
import defpackage.InterfaceC2106Tt0;
import defpackage.InterfaceC2178Ur0;
import defpackage.InterfaceC2184Ut0;
import defpackage.InterfaceC2262Vt0;
import defpackage.InterfaceC2338Wr0;
import defpackage.InterfaceC2344Wt0;
import defpackage.InterfaceC2448Xt0;
import defpackage.InterfaceC2529Yu0;
import defpackage.InterfaceC2598Zr0;
import defpackage.InterfaceC2831au0;
import defpackage.InterfaceC3250cu0;
import defpackage.InterfaceC3462dv0;
import defpackage.InterfaceC4092gv0;
import defpackage.InterfaceC7079uu0;
import defpackage.InterfaceC7289vu0;
import defpackage.InterfaceC7494ws0;
import defpackage.InterfaceC7497wt0;
import defpackage.InterfaceC7920yu0;
import defpackage.ML0;
import defpackage.N41;
import defpackage.N61;
import defpackage.P61;
import defpackage.Q51;
import defpackage.R51;
import defpackage.R61;
import defpackage.S61;
import defpackage.SK;
import defpackage.T61;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/onesignal/notifications/NotificationsModule;", "Lwt0;", "<init>", "()V", "LmI1;", "builder", "", "register", "(LmI1;)V", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class NotificationsModule implements InterfaceC7497wt0 {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LOu0;", "it", "LUr0;", "invoke", "(LOu0;)LUr0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class a extends ML0 implements Function1<InterfaceC1719Ou0, InterfaceC2178Ur0> {
        public static final a INSTANCE = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final InterfaceC2178Ur0 invoke(@NotNull InterfaceC1719Ou0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C0964Fd0.INSTANCE.canTrack() ? new C0964Fd0((InterfaceC2338Wr0) it.getService(InterfaceC2338Wr0.class), (C7582xI) it.getService(C7582xI.class), (InterfaceC4092gv0) it.getService(InterfaceC4092gv0.class)) : new N41();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LOu0;", "it", "", "invoke", "(LOu0;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class b extends ML0 implements Function1<InterfaceC1719Ou0, Object> {
        public static final b INSTANCE = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Object invoke(@NotNull InterfaceC1719Ou0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            InterfaceC7494ws0 interfaceC7494ws0 = (InterfaceC7494ws0) it.getService(InterfaceC7494ws0.class);
            if (interfaceC7494ws0.isFireOSDeviceType()) {
                return new C4271hl1((InterfaceC2338Wr0) it.getService(InterfaceC2338Wr0.class));
            }
            if (interfaceC7494ws0.isAndroidDeviceType()) {
                return interfaceC7494ws0.getHasFCMLibrary() ? new C4739jl1((C7582xI) it.getService(C7582xI.class), (InterfaceC2338Wr0) it.getService(InterfaceC2338Wr0.class), (C0913Em0) it.getService(C0913Em0.class), interfaceC7494ws0) : new C5159ll1();
            }
            return new C4949kl1(interfaceC7494ws0, (InterfaceC2338Wr0) it.getService(InterfaceC2338Wr0.class));
        }
    }

    @Override // defpackage.InterfaceC7497wt0
    public void register(@NotNull C5274mI1 builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.register(Q51.class).provides(InterfaceC0856Dt0.class);
        builder.register(NotificationRestoreWorkManager.class).provides(InterfaceC2448Xt0.class);
        builder.register(P61.class).provides(InterfaceC2184Ut0.class);
        SK.c(builder, C1859Qp.class, InterfaceC2598Zr0.class, R61.class, InterfaceC2262Vt0.class);
        SK.c(builder, NotificationGenerationWorkManager.class, InterfaceC1479Lt0.class, R51.class, InterfaceC0934Et0.class);
        SK.c(builder, C2875b61.class, InterfaceC1012Ft0.class, C7544x61.class, InterfaceC1794Pt0.class);
        SK.c(builder, C5864p61.class, InterfaceC1324Jt0.class, C2954bV1.class, InterfaceC3462dv0.class);
        SK.c(builder, C5444n61.class, InterfaceC1246It0.class, C6493s61.class, InterfaceC1402Kt0.class);
        SK.c(builder, S61.class, InterfaceC2344Wt0.class, T61.class, InterfaceC2831au0.class);
        SK.c(builder, E61.class, InterfaceC1872Qt0.class, F61.class, InterfaceC1950Rt0.class);
        builder.register(N61.class).provides(InterfaceC2106Tt0.class);
        builder.register(C7333w61.class).provides(InterfaceC1716Ot0.class).provides(InterfaceC0778Ct0.class);
        builder.register((Function1) a.INSTANCE).provides(InterfaceC2178Ur0.class);
        builder.register((Function1) b.INSTANCE).provides(InterfaceC7079uu0.class).provides(InterfaceC7289vu0.class);
        builder.register(C0913Em0.class).provides(C0913Em0.class);
        builder.register(C6002pl1.class).provides(InterfaceC7920yu0.class);
        SK.c(builder, ReceiveReceiptWorkManager.class, InterfaceC0703Bu0.class, C0842Do1.class, InterfaceC0625Au0.class);
        SK.c(builder, DeviceRegistrationListener.class, InterfaceC2529Yu0.class, C2655a71.class, InterfaceC3250cu0.class);
    }
}
