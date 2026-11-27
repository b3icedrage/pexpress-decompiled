package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: pY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5950pY extends AbstractC3745fG {

    @NotNull
    public final ReporterApi o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5950pY(@NotNull C4923kf appDataRepository, @NotNull InterfaceC8087zh2 webViewCallbacks, @NotNull Q21 navigationToVerificationCallback, @NotNull ReporterApi reporter) {
        super(appDataRepository, webViewCallbacks, navigationToVerificationCallback);
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(webViewCallbacks, "webViewCallbacks");
        Intrinsics.checkNotNullParameter(navigationToVerificationCallback, "navigationToVerificationCallback");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.o = reporter;
    }

    @Override // defpackage.AbstractC4260hi2
    public final void l() {
        super.l();
        ReporterApi.a.b(this.o, EnumC5028l80.F0, new C5148li2("Deposit"), null, 12);
    }
}
