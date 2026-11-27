package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: fh2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3836fh2 extends Vg2 {

    @NotNull
    public final C4612j90 O;

    @NotNull
    public final String P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3836fh2(@NotNull C4923kf appDataRepository, @NotNull IP0 lifecycleRegistry, @NotNull Tf2 webSocketBestSelector, @NotNull C6197qh2 webSocketUrlProvider, @NotNull C7238vf2 scarletClientProvider, @NotNull C1933Rn1 readyToStartUpdatersProvider, @NotNull C7242vg2 webSocketListener, @NotNull InterfaceC4930kg2 webSocketConnectionRepository, @NotNull AbstractC3104cC ciSessionProvider, @NotNull CZ1 timeZoneOffsetProviderApi, @NotNull O3 accountModeSelectionUseCase, @NotNull C4612j90 events) {
        super(appDataRepository, lifecycleRegistry, webSocketBestSelector, webSocketUrlProvider, scarletClientProvider, readyToStartUpdatersProvider, webSocketListener, webSocketConnectionRepository, ciSessionProvider, timeZoneOffsetProviderApi, accountModeSelectionUseCase);
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(lifecycleRegistry, "lifecycleRegistry");
        Intrinsics.checkNotNullParameter(webSocketBestSelector, "webSocketBestSelector");
        Intrinsics.checkNotNullParameter(webSocketUrlProvider, "webSocketUrlProvider");
        Intrinsics.checkNotNullParameter(scarletClientProvider, "scarletClientProvider");
        Intrinsics.checkNotNullParameter(readyToStartUpdatersProvider, "readyToStartUpdatersProvider");
        Intrinsics.checkNotNullParameter(webSocketListener, "webSocketListener");
        Intrinsics.checkNotNullParameter(webSocketConnectionRepository, "webSocketConnectionRepository");
        Intrinsics.checkNotNullParameter(ciSessionProvider, "ciSessionProvider");
        Intrinsics.checkNotNullParameter(timeZoneOffsetProviderApi, "timeZoneOffsetProviderApi");
        Intrinsics.checkNotNullParameter(accountModeSelectionUseCase, "accountModeSelectionUseCase");
        Intrinsics.checkNotNullParameter(events, "events");
        this.O = events;
        this.P = "WebSocketReal";
    }

    @Override // defpackage.Fg2
    public final boolean e() {
        return !((Boolean) this.O.q.d.getValue()).booleanValue();
    }

    @Override // defpackage.Vg2, defpackage.Fg2
    @NotNull
    public final String k() {
        return this.P;
    }
}
