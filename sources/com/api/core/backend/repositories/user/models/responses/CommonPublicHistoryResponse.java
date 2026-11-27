package com.api.core.backend.repositories.user.models.responses;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R$\u0010\u001d\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019¨\u0006 "}, d2 = {"Lcom/api/core/backend/repositories/user/models/responses/CommonPublicHistoryResponse;", "", "", "rank", "Ljava/lang/Integer;", "getRank", "()Ljava/lang/Integer;", "setRank", "(Ljava/lang/Integer;)V", "deals", "getDeals", "setDeals", "", "profit", "Ljava/lang/Double;", "getProfit", "()Ljava/lang/Double;", "setProfit", "(Ljava/lang/Double;)V", "", "country", "Ljava/lang/String;", "getCountry", "()Ljava/lang/String;", "setCountry", "(Ljava/lang/String;)V", "nickname", "getNickname", "setNickname", "flag", "getFlag", "setFlag", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CommonPublicHistoryResponse {

    @Nullable
    private String country;

    @Nullable
    private Integer deals;

    @Nullable
    private String flag;

    @Nullable
    private String nickname;

    @Nullable
    private Double profit;

    @Nullable
    private Integer rank;

    public CommonPublicHistoryResponse() {
        Double dValueOf = Double.valueOf(0.0d);
        this.rank = 0;
        this.deals = 0;
        this.profit = dValueOf;
        this.country = "";
        this.nickname = "";
        this.flag = "";
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonPublicHistoryResponse)) {
            return false;
        }
        CommonPublicHistoryResponse commonPublicHistoryResponse = (CommonPublicHistoryResponse) obj;
        return Intrinsics.a(this.rank, commonPublicHistoryResponse.rank) && Intrinsics.a(this.deals, commonPublicHistoryResponse.deals) && Intrinsics.a(this.profit, commonPublicHistoryResponse.profit) && Intrinsics.a(this.country, commonPublicHistoryResponse.country) && Intrinsics.a(this.nickname, commonPublicHistoryResponse.nickname) && Intrinsics.a(this.flag, commonPublicHistoryResponse.flag);
    }

    public final int hashCode() {
        Integer num = this.rank;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.deals;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d = this.profit;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.country;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nickname;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.flag;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "CommonPublicHistoryResponse(rank=" + this.rank + ", deals=" + this.deals + ", profit=" + this.profit + ", country=" + this.country + ", nickname=" + this.nickname + ", flag=" + this.flag + ")";
    }
}
