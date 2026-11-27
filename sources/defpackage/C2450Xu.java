package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Xu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2450Xu {

    @NotNull
    public static final C3727fA<Object> a = new C3727fA<>(-1, null, null, 0);
    public static final int b = C8056za.v(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");
    public static final int c = C8056za.v(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");

    @NotNull
    public static final GW1 d = new GW1("BUFFERED");

    @NotNull
    public static final GW1 e = new GW1("SHOULD_BUFFER");

    @NotNull
    public static final GW1 f = new GW1("S_RESUMING_BY_RCV");

    @NotNull
    public static final GW1 g = new GW1("RESUMING_BY_EB");

    @NotNull
    public static final GW1 h = new GW1("POISONED");

    @NotNull
    public static final GW1 i = new GW1("DONE_RCV");

    @NotNull
    public static final GW1 j = new GW1("INTERRUPTED_SEND");

    @NotNull
    public static final GW1 k = new GW1("INTERRUPTED_RCV");

    @NotNull
    public static final GW1 l = new GW1("CHANNEL_CLOSED");

    @NotNull
    public static final GW1 m = new GW1("SUSPEND");

    @NotNull
    public static final GW1 n = new GW1("SUSPEND_NO_WAITER");

    @NotNull
    public static final GW1 o = new GW1("FAILED");

    @NotNull
    public static final GW1 p = new GW1("NO_RECEIVE_RESULT");

    @NotNull
    public static final GW1 q = new GW1("CLOSE_HANDLER_CLOSED");

    @NotNull
    public static final GW1 r = new GW1("CLOSE_HANDLER_INVOKED");

    @NotNull
    public static final GW1 s = new GW1("NO_CLOSE_CAUSE");

    public static final boolean a(InterfaceC6041py interfaceC6041py, Object obj, C1935Ro0 c1935Ro0) {
        GW1 gw1B = interfaceC6041py.b(obj, c1935Ro0);
        if (gw1B == null) {
            return false;
        }
        interfaceC6041py.s(gw1B);
        return true;
    }
}
