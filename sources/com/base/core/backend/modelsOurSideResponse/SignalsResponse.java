package com.base.core.backend.modelsOurSideResponse;

import com.api.core.backend.domain.models.resultModels.HttpResponse;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001R(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/base/core/backend/modelsOurSideResponse/SignalsResponse;", "Lcom/api/core/backend/domain/models/resultModels/HttpResponse;", "", "", "Lcom/base/core/backend/modelsOurSideResponse/SignalResponse;", "result", "Ljava/util/Map;", "getResult", "()Ljava/util/Map;", "CoreBackendBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SignalsResponse extends HttpResponse<Map<String, ? extends SignalResponse>> {

    @Nullable
    private final Map<String, SignalResponse> result;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SignalsResponse) && Intrinsics.a(this.result, ((SignalsResponse) obj).result);
    }

    public final int hashCode() {
        Map<String, SignalResponse> map = this.result;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    @NotNull
    public final String toString() {
        return "SignalsResponse(result=" + this.result + ")";
    }
}
