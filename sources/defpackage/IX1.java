package defpackage;

import android.content.Context;
import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class IX1 extends K0 {

    @NotNull
    public final HX1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IX1(@NotNull Context context, @NotNull ZT1 subIdProvider, @NotNull HX1 telemetryEnabledLocalExperiment, @NotNull InterfaceC0565Aa0 experimentsProvider, @NotNull InterfaceC0799Da0 experimentRepository, @NotNull ReporterApi reporter) {
        super(context, subIdProvider, experimentsProvider, experimentRepository, reporter);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(subIdProvider, "subIdProvider");
        Intrinsics.checkNotNullParameter(telemetryEnabledLocalExperiment, "telemetryEnabledLocalExperiment");
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        Intrinsics.checkNotNullParameter(experimentRepository, "experimentRepository");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.f = telemetryEnabledLocalExperiment;
    }

    @Override // defpackage.K0
    @NotNull
    public final C5718oQ1 e() {
        return new C5718oQ1(EnumC7637xa0.TELEMETRY_ENABLED, this.f.o());
    }
}
