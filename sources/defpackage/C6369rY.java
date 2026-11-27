package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: rY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6369rY extends C5950pY {

    @NotNull
    public final L21 p;

    @NotNull
    public final C4612j90 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6369rY(@NotNull C4923kf appDataRepository, @NotNull InterfaceC8087zh2 webViewCallbacks, @NotNull Q21 navigateToVerificationCallback, @NotNull ReporterApi reporter, @NotNull L21 navigateToPlatformCallback, @NotNull C4612j90 eventsFlowsProvider) {
        super(appDataRepository, webViewCallbacks, navigateToVerificationCallback, reporter);
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(webViewCallbacks, "webViewCallbacks");
        Intrinsics.checkNotNullParameter(navigateToVerificationCallback, "navigateToVerificationCallback");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(navigateToPlatformCallback, "navigateToPlatformCallback");
        Intrinsics.checkNotNullParameter(eventsFlowsProvider, "eventsFlowsProvider");
        this.p = navigateToPlatformCallback;
        this.q = eventsFlowsProvider;
    }
}
