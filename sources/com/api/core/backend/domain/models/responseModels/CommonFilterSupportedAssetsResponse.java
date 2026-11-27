package com.api.core.backend.domain.models.responseModels;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \b2\u00020\u0001:\u0001\bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/api/core/backend/domain/models/responseModels/CommonFilterSupportedAssetsResponse;", "", "", "", "supportedAssetCodes", "Ljava/util/List;", "getSupportedAssetCodes", "()Ljava/util/List;", "Companion", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CommonFilterSupportedAssetsResponse {

    @NotNull
    private final List<String> supportedAssetCodes;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonFilterSupportedAssetsResponse) && Intrinsics.a(this.supportedAssetCodes, ((CommonFilterSupportedAssetsResponse) obj).supportedAssetCodes);
    }

    public final int hashCode() {
        return this.supportedAssetCodes.hashCode();
    }

    @NotNull
    public final String toString() {
        return "CommonFilterSupportedAssetsResponse(supportedAssetCodes=" + this.supportedAssetCodes + ")";
    }
}
