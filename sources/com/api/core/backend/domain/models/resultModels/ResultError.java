package com.api.core.backend.domain.models.resultModels;

import defpackage.R51;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/api/core/backend/domain/models/resultModels/ResultError;", "Lcom/api/core/backend/domain/models/resultModels/CommonResult;", "", "Lcom/api/core/backend/domain/models/resultModels/CommonError;", "error", "Lcom/api/core/backend/domain/models/resultModels/CommonError;", R51.PUSH_ADDITIONAL_DATA_KEY, "()Lcom/api/core/backend/domain/models/resultModels/CommonError;", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ResultError extends CommonResult {

    @NotNull
    private final CommonError error;

    public ResultError(@NotNull CommonError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.error = error;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final CommonError getError() {
        return this.error;
    }
}
