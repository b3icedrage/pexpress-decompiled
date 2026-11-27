package com.base.core.backend.modelsRequest;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001R,\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR,\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/base/core/backend/modelsRequest/CommonSubscribeAssetRateRequest;", "", "", "", "mode", "Ljava/util/List;", "getMode", "()Ljava/util/List;", "setMode", "(Ljava/util/List;)V", "", "assetId", "getAssetId", "setAssetId", "CoreBackendBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CommonSubscribeAssetRateRequest {

    @Nullable
    private List<Integer> assetId;

    @Nullable
    private List<String> mode;

    public CommonSubscribeAssetRateRequest() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.mode = arrayList;
        this.assetId = arrayList2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonSubscribeAssetRateRequest)) {
            return false;
        }
        CommonSubscribeAssetRateRequest commonSubscribeAssetRateRequest = (CommonSubscribeAssetRateRequest) obj;
        return Intrinsics.a(this.mode, commonSubscribeAssetRateRequest.mode) && Intrinsics.a(this.assetId, commonSubscribeAssetRateRequest.assetId);
    }

    public final int hashCode() {
        List<String> list = this.mode;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<Integer> list2 = this.assetId;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "CommonSubscribeAssetRateRequest(mode=" + this.mode + ", assetId=" + this.assetId + ")";
    }
}
