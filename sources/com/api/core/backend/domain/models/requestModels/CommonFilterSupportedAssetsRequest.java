package com.api.core.backend.domain.models.requestModels;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/api/core/backend/domain/models/requestModels/CommonFilterSupportedAssetsRequest;", "", "", "", "assetSymbols", "Ljava/util/List;", "getAssetSymbols", "()Ljava/util/List;", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CommonFilterSupportedAssetsRequest {

    @NotNull
    private final List<String> assetSymbols;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonFilterSupportedAssetsRequest) && Intrinsics.a(this.assetSymbols, ((CommonFilterSupportedAssetsRequest) obj).assetSymbols);
    }

    public final int hashCode() {
        return this.assetSymbols.hashCode();
    }

    @NotNull
    public final String toString() {
        return "CommonFilterSupportedAssetsRequest(assetSymbols=" + this.assetSymbols + ")";
    }
}
