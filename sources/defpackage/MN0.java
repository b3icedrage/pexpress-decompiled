package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class MN0 {
    public static final void a(@NotNull ReporterApi reporterApi, @NotNull CommonError error, @NotNull String description) {
        Intrinsics.checkNotNullParameter(reporterApi, "<this>");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(description, "description");
        EnumC5028l80 enumC5028l80 = EnumC5028l80.j;
        String strValueOf = String.valueOf(error.getCode());
        String text = error.getText();
        String platformCode = error.getPlatformCode();
        if (platformCode == null || platformCode.length() <= 0) {
            platformCode = null;
        }
        ReporterApi.a.b(reporterApi, enumC5028l80, new E70(strValueOf, text, platformCode, null, description, null, null, null, null, null, null, null, null, 8168), null, 12);
    }
}
