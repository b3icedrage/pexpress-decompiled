package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Ns0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1635Ns0 extends InterfaceC0775Cs0<InterfaceC1554Ms0> {
    @Override // defpackage.InterfaceC0775Cs0
    /* synthetic */ boolean getHasSubscribers();

    void messageActionOccurredOnMessage(@NotNull C1881Qw0 c1881Qw0, @NotNull C2193Uw0 c2193Uw0);

    void messageActionOccurredOnPreview(@NotNull C1881Qw0 c1881Qw0, @NotNull C2193Uw0 c2193Uw0);

    void messagePageChanged(@NotNull C1881Qw0 c1881Qw0, @NotNull C2840ax0 c2840ax0);

    void messageWasDismissed(@NotNull C1881Qw0 c1881Qw0);

    void messageWasDisplayed(@NotNull C1881Qw0 c1881Qw0);

    void messageWillDismiss(@NotNull C1881Qw0 c1881Qw0);

    void messageWillDisplay(@NotNull C1881Qw0 c1881Qw0);

    @Override // defpackage.InterfaceC0775Cs0
    /* synthetic */ void subscribe(InterfaceC1554Ms0 interfaceC1554Ms0);

    @Override // defpackage.InterfaceC0775Cs0
    /* synthetic */ void unsubscribe(InterfaceC1554Ms0 interfaceC1554Ms0);
}
