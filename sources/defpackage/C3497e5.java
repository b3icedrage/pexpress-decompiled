package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: e5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3497e5 extends AbstractC3288d5 {

    @NotNull
    public final K4 o;

    @NotNull
    public final InterfaceC5862p6 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3497e5(@NotNull C4923kf appData, @NotNull K4 accountVerificationCallbacks, @NotNull InterfaceC5862p6 activationStateProviderApi, @NotNull ReporterApi reporter) {
        super(appData, accountVerificationCallbacks, reporter);
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(accountVerificationCallbacks, "accountVerificationCallbacks");
        Intrinsics.checkNotNullParameter(activationStateProviderApi, "activationStateProviderApi");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.o = accountVerificationCallbacks;
        this.p = activationStateProviderApi;
    }
}
