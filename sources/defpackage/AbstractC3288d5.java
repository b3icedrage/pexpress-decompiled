package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: d5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3288d5 extends C7806yM1 {

    @NotNull
    public final ReporterApi n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3288d5(@NotNull C4923kf appData, @NotNull K4 webViewCallbacks, @NotNull ReporterApi reporter) {
        super(appData, webViewCallbacks);
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(webViewCallbacks, "webViewCallbacks");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.n = reporter;
    }

    @Override // defpackage.AbstractC4260hi2
    public final void l() {
        super.l();
        ReporterApi.a.b(this.n, EnumC5028l80.F0, new C5148li2("Verification"), null, 12);
    }
}
