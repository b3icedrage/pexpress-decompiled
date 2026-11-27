package com.api.core.backend.domain.models.requestModels;

import defpackage.C5807oq;
import defpackage.InterfaceC2691aI1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001!R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/api/core/backend/domain/models/requestModels/AddDealRequest;", "", "", "userId", "Ljava/lang/Long;", "getUserId", "()Ljava/lang/Long;", "setUserId", "(Ljava/lang/Long;)V", "", "profit", "Ljava/lang/Double;", "getProfit", "()Ljava/lang/Double;", "setProfit", "(Ljava/lang/Double;)V", "", "startAmount", "Ljava/lang/Integer;", "getStartAmount", "()Ljava/lang/Integer;", "setStartAmount", "(Ljava/lang/Integer;)V", "balance", "getBalance", "setBalance", "", "currency", "Ljava/lang/String;", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "Companion", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AddDealRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @Nullable
    private Double balance;

    @Nullable
    private String currency;

    @Nullable
    private Double profit;

    @InterfaceC2691aI1("start_amount")
    @Nullable
    private Integer startAmount;

    @InterfaceC2691aI1("user_id")
    @Nullable
    private Long userId;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/core/backend/domain/models/requestModels/AddDealRequest$Companion;", "", "<init>", "()V", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public AddDealRequest(@Nullable Long l, @Nullable Double d, @Nullable Integer num, @Nullable Double d2, @Nullable String str) {
        this.userId = l;
        this.profit = d;
        this.startAmount = num;
        this.balance = d2;
        this.currency = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddDealRequest)) {
            return false;
        }
        AddDealRequest addDealRequest = (AddDealRequest) obj;
        return Intrinsics.a(this.userId, addDealRequest.userId) && Intrinsics.a(this.profit, addDealRequest.profit) && Intrinsics.a(this.startAmount, addDealRequest.startAmount) && Intrinsics.a(this.balance, addDealRequest.balance) && Intrinsics.a(this.currency, addDealRequest.currency);
    }

    public final int hashCode() {
        Long l = this.userId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Double d = this.profit;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.startAmount;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Double d2 = this.balance;
        int iHashCode4 = (iHashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str = this.currency;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        Long l = this.userId;
        Double d = this.profit;
        Integer num = this.startAmount;
        Double d2 = this.balance;
        String str = this.currency;
        StringBuilder sb = new StringBuilder("AddDealRequest(userId=");
        sb.append(l);
        sb.append(", profit=");
        sb.append(d);
        sb.append(", startAmount=");
        sb.append(num);
        sb.append(", balance=");
        sb.append(d2);
        sb.append(", currency=");
        return C5807oq.b(sb, str, ")");
    }

    public AddDealRequest() {
        this(0L, Double.valueOf(0.0d), 0, Double.valueOf(0.0d), "");
    }
}
