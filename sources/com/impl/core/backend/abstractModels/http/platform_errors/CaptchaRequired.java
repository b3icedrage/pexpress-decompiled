package com.impl.core.backend.abstractModels.http.platform_errors;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.PlatformErrorApi;
import com.impl.core.backend.abstractModels.http.PlatformErrorCodes;
import defpackage.R51;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/impl/core/backend/abstractModels/http/platform_errors/CaptchaRequired;", "Lcom/api/core/backend/domain/models/resultModels/PlatformErrorApi;", "<init>", "()V", "", "code", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/api/core/backend/domain/models/resultModels/CommonError;", "commonErrorForPlatformError", "Lcom/api/core/backend/domain/models/resultModels/CommonError;", R51.PUSH_ADDITIONAL_DATA_KEY, "()Lcom/api/core/backend/domain/models/resultModels/CommonError;", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CaptchaRequired implements PlatformErrorApi {

    @NotNull
    private final String code = PlatformErrorCodes.CaptchaRequired.getCode();

    @NotNull
    private final CommonError commonErrorForPlatformError = new CommonError.WrongCaptcha();

    @Override // com.api.core.backend.domain.models.resultModels.PlatformErrorApi
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final CommonError getCommonErrorForPlatformError() {
        return this.commonErrorForPlatformError;
    }

    @Override // com.api.core.backend.domain.models.resultModels.PlatformErrorApi
    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCode() {
        return this.code;
    }
}
