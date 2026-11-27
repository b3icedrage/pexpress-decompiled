package com.api.core.backend.repositories.user.models.responses;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/api/core/backend/repositories/user/models/responses/CommonHistoryResponse;", "", "", "rank", "Ljava/lang/Integer;", "getRank", "()Ljava/lang/Integer;", "setRank", "(Ljava/lang/Integer;)V", "deals", "getDeals", "setDeals", "", "profit", "Ljava/lang/Double;", "getProfit", "()Ljava/lang/Double;", "setProfit", "(Ljava/lang/Double;)V", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CommonHistoryResponse {

    @Nullable
    private Integer deals;

    @Nullable
    private Double profit;

    @Nullable
    private Integer rank;

    public CommonHistoryResponse() {
        this(0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonHistoryResponse)) {
            return false;
        }
        CommonHistoryResponse commonHistoryResponse = (CommonHistoryResponse) obj;
        return Intrinsics.a(this.rank, commonHistoryResponse.rank) && Intrinsics.a(this.deals, commonHistoryResponse.deals) && Intrinsics.a(this.profit, commonHistoryResponse.profit);
    }

    public final int hashCode() {
        Integer num = this.rank;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.deals;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d = this.profit;
        return iHashCode2 + (d != null ? d.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "CommonHistoryResponse(rank=" + this.rank + ", deals=" + this.deals + ", profit=" + this.profit + ")";
    }

    public CommonHistoryResponse(int i) {
        Double dValueOf = Double.valueOf(0.0d);
        this.rank = 0;
        this.deals = 0;
        this.profit = dValueOf;
    }
}
