package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class Jj2 extends AbstractC3745fG {

    @NotNull
    public final ReporterApi o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jj2(@NotNull C4923kf appData, @NotNull InterfaceC8087zh2 webViewCallbacks, @NotNull Q21 navigateToVerificationCallback, @NotNull ReporterApi reporter) {
        super(appData, webViewCallbacks, navigateToVerificationCallback);
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(webViewCallbacks, "webViewCallbacks");
        Intrinsics.checkNotNullParameter(navigateToVerificationCallback, "navigateToVerificationCallback");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.o = reporter;
    }

    @Override // defpackage.AbstractC4260hi2
    public final void l() {
        super.l();
        ReporterApi.a.b(this.o, EnumC5028l80.F0, new C5148li2("Withdraw"), null, 12);
    }
}
