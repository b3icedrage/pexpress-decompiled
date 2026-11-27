package com.api.core.backend.domain.models.resultModels;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/api/core/backend/domain/models/resultModels/PlatformErrorApi;", "", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface PlatformErrorApi {
    @NotNull
    /* JADX INFO: renamed from: a */
    CommonError getCommonErrorForPlatformError();

    @NotNull
    /* JADX INFO: renamed from: b */
    String getCode();
}
