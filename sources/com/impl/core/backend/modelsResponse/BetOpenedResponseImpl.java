package com.impl.core.backend.modelsResponse;

import com.impl.core.backend.abstractModels.WebSocketResponseAbstractImpl;
import com.impl.core.backend.modelsRequest.MakeABetRequestImpl;
import defpackage.AbstractC7783yF;
import defpackage.C1039Gc0;
import defpackage.C2337Wr;
import defpackage.C5491nL;
import defpackage.C5896pG;
import defpackage.EF0;
import defpackage.ID;
import defpackage.InterfaceC1247It1;
import defpackage.InterfaceC2691aI1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 >2\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002:\u0001>R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010'\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0017\u0010)\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b)\u0010\u001d\u001a\u0004\b*\u0010\u001fR\u0017\u0010+\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR\u0017\u0010-\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b-\u0010$\u001a\u0004\b.\u0010&R\u0017\u0010/\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b/\u0010$\u001a\u0004\b0\u0010&R\u0019\u00101\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\bR$\u00103\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b3\u0010\u0006\u001a\u0004\b4\u0010\b\"\u0004\b5\u00106R\u0017\u00107\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b7\u0010$\u001a\u0004\b8\u0010&R\u0017\u0010:\u001a\u0002098\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lcom/impl/core/backend/modelsResponse/BetOpenedResponseImpl;", "Lcom/impl/core/backend/abstractModels/WebSocketResponseAbstractImpl;", "LIt1;", "LyF;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "openTime", "getOpenTime", "closeTime", "getCloseTime", "", "openTimestampSeconds", "J", "getOpenTimestampSeconds", "()J", "closeTimestampSeconds", "getCloseTimestampSeconds", "uid", "getUid", "Lcom/impl/core/backend/modelsRequest/MakeABetRequestImpl$AccountTypeImpl;", "accountType", "Lcom/impl/core/backend/modelsRequest/MakeABetRequestImpl$AccountTypeImpl;", "getAccountType", "()Lcom/impl/core/backend/modelsRequest/MakeABetRequestImpl$AccountTypeImpl;", "", "amount", "D", "getAmount", "()D", "profit", "getProfit", "", "percentProfit", "I", "getPercentProfit", "()I", "percentLoss", "getPercentLoss", "openPrice", "getOpenPrice", "copyTicket", "getCopyTicket", "closePrice", "getClosePrice", "command", "getCommand", "asset", "getAsset", "requestId", "d", "setRequestId", "(Ljava/lang/String;)V", "openMs", "getOpenMs", "Lcom/impl/core/backend/modelsRequest/MakeABetRequestImpl$OptionTypeImpl;", "optionType", "Lcom/impl/core/backend/modelsRequest/MakeABetRequestImpl$OptionTypeImpl;", "getOptionType", "()Lcom/impl/core/backend/modelsRequest/MakeABetRequestImpl$OptionTypeImpl;", "Companion", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BetOpenedResponseImpl extends WebSocketResponseAbstractImpl implements InterfaceC1247It1<AbstractC7783yF> {

    @NotNull
    public static final String NAME = "successopenOrder";

    @InterfaceC2691aI1("isDemo")
    @NotNull
    private final MakeABetRequestImpl.AccountTypeImpl accountType;
    private final double amount;

    @Nullable
    private final String asset;
    private final int closePrice;

    @NotNull
    private final String closeTime;

    @InterfaceC2691aI1("closeTimestamp")
    private final long closeTimestampSeconds;
    private final int command;

    @NotNull
    private final String copyTicket;

    @Nullable
    private final String id;
    private final int openMs;
    private final double openPrice;

    @NotNull
    private final String openTime;

    @InterfaceC2691aI1("openTimestamp")
    private final long openTimestampSeconds;

    @NotNull
    private final MakeABetRequestImpl.OptionTypeImpl optionType;
    private final int percentLoss;
    private final int percentProfit;
    private final double profit;

    @Nullable
    private String requestId;
    private final long uid;

    @Override // defpackage.InterfaceC1247It1
    public final AbstractC7783yF a() {
        String str = this.id;
        long jHashCode = str != null ? str.hashCode() : -1L;
        long j = this.openTimestampSeconds;
        long j2 = this.closeTimestampSeconds;
        double d = this.amount;
        String str2 = this.asset;
        if (str2 == null) {
            str2 = "";
        }
        return new C2337Wr(jHashCode, j, j2, d, str2, this.openPrice);
    }

    @Override // com.api.core.backend.domain.models.abstractModels.WebSocketResponseAbstract
    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BetOpenedResponseImpl)) {
            return false;
        }
        BetOpenedResponseImpl betOpenedResponseImpl = (BetOpenedResponseImpl) obj;
        return Intrinsics.a(this.id, betOpenedResponseImpl.id) && Intrinsics.a(this.openTime, betOpenedResponseImpl.openTime) && Intrinsics.a(this.closeTime, betOpenedResponseImpl.closeTime) && this.openTimestampSeconds == betOpenedResponseImpl.openTimestampSeconds && this.closeTimestampSeconds == betOpenedResponseImpl.closeTimestampSeconds && this.uid == betOpenedResponseImpl.uid && this.accountType == betOpenedResponseImpl.accountType && Double.compare(this.amount, betOpenedResponseImpl.amount) == 0 && Double.compare(this.profit, betOpenedResponseImpl.profit) == 0 && this.percentProfit == betOpenedResponseImpl.percentProfit && this.percentLoss == betOpenedResponseImpl.percentLoss && Double.compare(this.openPrice, betOpenedResponseImpl.openPrice) == 0 && Intrinsics.a(this.copyTicket, betOpenedResponseImpl.copyTicket) && this.closePrice == betOpenedResponseImpl.closePrice && this.command == betOpenedResponseImpl.command && Intrinsics.a(this.asset, betOpenedResponseImpl.asset) && Intrinsics.a(this.requestId, betOpenedResponseImpl.requestId) && this.openMs == betOpenedResponseImpl.openMs && this.optionType == betOpenedResponseImpl.optionType;
    }

    public final int hashCode() {
        String str = this.id;
        int iA = EF0.a(this.command, EF0.a(this.closePrice, C1039Gc0.b(ID.a(this.openPrice, EF0.a(this.percentLoss, EF0.a(this.percentProfit, ID.a(this.profit, ID.a(this.amount, (this.accountType.hashCode() + C5491nL.a(C5491nL.a(C5491nL.a(C1039Gc0.b(C1039Gc0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.openTime), 31, this.closeTime), 31, this.openTimestampSeconds), 31, this.closeTimestampSeconds), 31, this.uid)) * 31, 31), 31), 31), 31), 31), 31, this.copyTicket), 31), 31);
        String str2 = this.asset;
        int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.requestId;
        return this.optionType.hashCode() + EF0.a(this.openMs, (iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31, 31);
    }

    @NotNull
    public final String toString() {
        String str = this.id;
        String str2 = this.openTime;
        String str3 = this.closeTime;
        long j = this.openTimestampSeconds;
        long j2 = this.closeTimestampSeconds;
        long j3 = this.uid;
        MakeABetRequestImpl.AccountTypeImpl accountTypeImpl = this.accountType;
        double d = this.amount;
        double d2 = this.profit;
        int i = this.percentProfit;
        int i2 = this.percentLoss;
        double d3 = this.openPrice;
        String str4 = this.copyTicket;
        int i3 = this.closePrice;
        int i4 = this.command;
        String str5 = this.asset;
        String str6 = this.requestId;
        int i5 = this.openMs;
        MakeABetRequestImpl.OptionTypeImpl optionTypeImpl = this.optionType;
        StringBuilder sbA = C5896pG.a("BetOpenedResponseImpl(id=", str, ", openTime=", str2, ", closeTime=");
        sbA.append(str3);
        sbA.append(", openTimestampSeconds=");
        sbA.append(j);
        sbA.append(", closeTimestampSeconds=");
        sbA.append(j2);
        sbA.append(", uid=");
        sbA.append(j3);
        sbA.append(", accountType=");
        sbA.append(accountTypeImpl);
        sbA.append(", amount=");
        sbA.append(d);
        sbA.append(", profit=");
        sbA.append(d2);
        sbA.append(", percentProfit=");
        sbA.append(i);
        sbA.append(", percentLoss=");
        sbA.append(i2);
        sbA.append(", openPrice=");
        sbA.append(d3);
        sbA.append(", copyTicket=");
        sbA.append(str4);
        sbA.append(", closePrice=");
        sbA.append(i3);
        sbA.append(", command=");
        sbA.append(i4);
        C5896pG.b(sbA, ", asset=", str5, ", requestId=", str6);
        sbA.append(", openMs=");
        sbA.append(i5);
        sbA.append(", optionType=");
        sbA.append(optionTypeImpl);
        sbA.append(")");
        return sbA.toString();
    }
}
