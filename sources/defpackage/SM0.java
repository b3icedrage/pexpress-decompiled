package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class SM0 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CommonError error = (CommonError) obj;
        ReporterApi reporter = (ReporterApi) obj2;
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        MN0.a(reporter, error, "Error in unique requests for platform");
        return Unit.a;
    }
}
