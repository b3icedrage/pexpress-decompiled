package com.api.core.backend.domain.models.responseModels;

import com.api.core.backend.domain.models.resultModels.HttpResponse;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u0001R(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/api/core/backend/domain/models/responseModels/ConvertToCurrencyResponse;", "Lcom/api/core/backend/domain/models/resultModels/HttpResponse;", "", "", "", "result", "Ljava/util/Map;", "getResult", "()Ljava/util/Map;", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConvertToCurrencyResponse extends HttpResponse<Map<String, ? extends Integer>> {

    @Nullable
    private final Map<String, Integer> result;
}
