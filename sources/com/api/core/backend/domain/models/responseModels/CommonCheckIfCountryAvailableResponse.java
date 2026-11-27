package com.api.core.backend.domain.models.responseModels;

import defpackage.R51;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/api/core/backend/domain/models/responseModels/CommonCheckIfCountryAvailableResponse;", "", "", "isCountryAvailable", "Z", R51.PUSH_ADDITIONAL_DATA_KEY, "()Z", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CommonCheckIfCountryAvailableResponse {
    private final boolean isCountryAvailable;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getIsCountryAvailable() {
        return this.isCountryAvailable;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonCheckIfCountryAvailableResponse) && this.isCountryAvailable == ((CommonCheckIfCountryAvailableResponse) obj).isCountryAvailable;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isCountryAvailable);
    }

    @NotNull
    public final String toString() {
        return "CommonCheckIfCountryAvailableResponse(isCountryAvailable=" + this.isCountryAvailable + ")";
    }
}
