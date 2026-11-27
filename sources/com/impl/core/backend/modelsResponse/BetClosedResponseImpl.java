package com.impl.core.backend.modelsResponse;

import com.impl.core.backend.abstractModels.WebSocketResponseAbstractImpl;
import com.impl.core.backend.modelsRequest.MakeABetRequestImpl;
import defpackage.AbstractC7783yF;
import defpackage.C0849Dr;
import defpackage.C5896pG;
import defpackage.DF;
import defpackage.ID;
import defpackage.InterfaceC1247It1;
import defpackage.InterfaceC2441Xr;
import defpackage.InterfaceC2691aI1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/impl/core/backend/modelsResponse/BetClosedResponseImpl;", "Lcom/impl/core/backend/abstractModels/WebSocketResponseAbstractImpl;", "", "profit", "D", "getProfit", "()D", "", "Lcom/impl/core/backend/modelsResponse/BetClosedResponseImpl$ClosedBetImpl;", "bets", "Ljava/util/List;", "f", "()Ljava/util/List;", "Companion", "ClosedBetImpl", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BetClosedResponseImpl extends WebSocketResponseAbstractImpl {

    @NotNull
    public static final String HISTORY_NAME = "updateClosedDeals";

    @NotNull
    public static final String NAME = "successcloseOrder";

    @InterfaceC2691aI1("deals")
    @Nullable
    private final List<ClosedBetImpl> bets;
    private final double profit;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u000f\u001a\u0004\b \u0010\u0011R\u0019\u0010!\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b!\u0010\u000f\u001a\u0004\b\"\u0010\u0011R\u0019\u0010#\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010\u001aR\u0019\u0010%\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b%\u0010\u0018\u001a\u0004\b&\u0010\u001aR\u0019\u0010'\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b'\u0010\u000f\u001a\u0004\b(\u0010\u0011R\u0019\u0010)\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\bR\u001c\u0010,\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u00100\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b0\u0010\u0006\u001a\u0004\b1\u0010\bR\u0019\u00102\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b2\u0010\u0006\u001a\u0004\b3\u0010\bR\u0019\u00104\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b4\u0010\u0006\u001a\u0004\b5\u0010\bR\u0019\u00106\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b6\u0010\u000f\u001a\u0004\b7\u0010\u0011R\u0019\u00108\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b8\u0010\u000f\u001a\u0004\b9\u0010\u0011R\u0019\u0010;\u001a\u0004\u0018\u00010:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010?\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b?\u0010\u000f\u001a\u0004\b@\u0010\u0011¨\u0006A"}, d2 = {"Lcom/impl/core/backend/modelsResponse/BetClosedResponseImpl$ClosedBetImpl;", "LIt1;", "LyF;", "Lcom/impl/core/backend/abstractModels/WebSocketResponseAbstractImpl;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "openTime", "getOpenTime", "closeTime", "getCloseTime", "", "openTimestamp", "Ljava/lang/Integer;", "getOpenTimestamp", "()Ljava/lang/Integer;", "closeTimestamp", "getCloseTimestamp", "uid", "getUid", "", "amount", "Ljava/lang/Double;", "getAmount", "()Ljava/lang/Double;", "profit", "D", "getProfit", "()D", "percentProfit", "getPercentProfit", "percentLoss", "getPercentLoss", "openPrice", "getOpenPrice", "closePrice", "getClosePrice", "command", "getCommand", "asset", "getAsset", "Lcom/impl/core/backend/modelsRequest/MakeABetRequestImpl$AccountTypeImpl;", "accountType", "Lcom/impl/core/backend/modelsRequest/MakeABetRequestImpl$AccountTypeImpl;", "getAccountType", "()Lcom/impl/core/backend/modelsRequest/MakeABetRequestImpl$AccountTypeImpl;", "copyTicket", "getCopyTicket", "avatarUser", "getAvatarUser", "nickname", "getNickname", "percentProfitable", "getPercentProfitable", "closeMs", "getCloseMs", "Lcom/impl/core/backend/modelsRequest/MakeABetRequestImpl$OptionTypeImpl;", "optionType", "Lcom/impl/core/backend/modelsRequest/MakeABetRequestImpl$OptionTypeImpl;", "getOptionType", "()Lcom/impl/core/backend/modelsRequest/MakeABetRequestImpl$OptionTypeImpl;", "openMs", "getOpenMs", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ClosedBetImpl extends WebSocketResponseAbstractImpl implements InterfaceC1247It1<AbstractC7783yF> {

        @InterfaceC2691aI1("isDemo")
        @Nullable
        private final MakeABetRequestImpl.AccountTypeImpl accountType;

        @Nullable
        private final Double amount;

        @Nullable
        private final String asset;

        @Nullable
        private final String avatarUser;

        @Nullable
        private final Integer closeMs;

        @Nullable
        private final Double closePrice;

        @Nullable
        private final String closeTime;

        @Nullable
        private final Integer closeTimestamp;

        @Nullable
        private final Integer command;

        @Nullable
        private final String copyTicket;

        @Nullable
        private final String id;

        @Nullable
        private final String nickname;

        @Nullable
        private final Integer openMs;

        @Nullable
        private final Double openPrice;

        @Nullable
        private final String openTime;

        @Nullable
        private final Integer openTimestamp;

        @Nullable
        private final MakeABetRequestImpl.OptionTypeImpl optionType;

        @Nullable
        private final Integer percentLoss;

        @Nullable
        private final Integer percentProfit;

        @Nullable
        private final Integer percentProfitable;
        private final double profit;

        @Nullable
        private final Integer uid;

        @Override // defpackage.InterfaceC1247It1
        public final AbstractC7783yF a() {
            InterfaceC2441Xr eVar;
            String str = this.id;
            long jHashCode = str != null ? str.hashCode() : -1L;
            double d = this.profit;
            if (d < 0.0d) {
                eVar = new InterfaceC2441Xr.b(d);
            } else {
                eVar = d == 0.0d ? InterfaceC2441Xr.a.a : new InterfaceC2441Xr.e(d);
            }
            Double d2 = this.openPrice;
            Double d3 = this.closePrice;
            Double d4 = this.amount;
            MakeABetRequestImpl.AccountTypeImpl accountTypeImpl = this.accountType;
            return new C0849Dr(jHashCode, eVar, d, d2, d3, d4, accountTypeImpl != null ? accountTypeImpl.e() : null);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClosedBetImpl)) {
                return false;
            }
            ClosedBetImpl closedBetImpl = (ClosedBetImpl) obj;
            return Intrinsics.a(this.id, closedBetImpl.id) && Intrinsics.a(this.openTime, closedBetImpl.openTime) && Intrinsics.a(this.closeTime, closedBetImpl.closeTime) && Intrinsics.a(this.openTimestamp, closedBetImpl.openTimestamp) && Intrinsics.a(this.closeTimestamp, closedBetImpl.closeTimestamp) && Intrinsics.a(this.uid, closedBetImpl.uid) && Intrinsics.a(this.amount, closedBetImpl.amount) && Double.compare(this.profit, closedBetImpl.profit) == 0 && Intrinsics.a(this.percentProfit, closedBetImpl.percentProfit) && Intrinsics.a(this.percentLoss, closedBetImpl.percentLoss) && Intrinsics.a(this.openPrice, closedBetImpl.openPrice) && Intrinsics.a(this.closePrice, closedBetImpl.closePrice) && Intrinsics.a(this.command, closedBetImpl.command) && Intrinsics.a(this.asset, closedBetImpl.asset) && this.accountType == closedBetImpl.accountType && Intrinsics.a(this.copyTicket, closedBetImpl.copyTicket) && Intrinsics.a(this.avatarUser, closedBetImpl.avatarUser) && Intrinsics.a(this.nickname, closedBetImpl.nickname) && Intrinsics.a(this.percentProfitable, closedBetImpl.percentProfitable) && Intrinsics.a(this.closeMs, closedBetImpl.closeMs) && this.optionType == closedBetImpl.optionType && Intrinsics.a(this.openMs, closedBetImpl.openMs);
        }

        @Nullable
        public final DF f() {
            String str;
            Integer num;
            if (this.accountType != MakeABetRequestImpl.AccountTypeImpl.DEMO || (str = this.id) == null || (num = this.uid) == null) {
                return null;
            }
            return new DF(str, num.intValue());
        }

        public final int hashCode() {
            String str = this.id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.openTime;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.closeTime;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.openTimestamp;
            int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.closeTimestamp;
            int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.uid;
            int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Double d = this.amount;
            int iA = ID.a(this.profit, (iHashCode6 + (d == null ? 0 : d.hashCode())) * 31, 31);
            Integer num4 = this.percentProfit;
            int iHashCode7 = (iA + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.percentLoss;
            int iHashCode8 = (iHashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Double d2 = this.openPrice;
            int iHashCode9 = (iHashCode8 + (d2 == null ? 0 : d2.hashCode())) * 31;
            Double d3 = this.closePrice;
            int iHashCode10 = (iHashCode9 + (d3 == null ? 0 : d3.hashCode())) * 31;
            Integer num6 = this.command;
            int iHashCode11 = (iHashCode10 + (num6 == null ? 0 : num6.hashCode())) * 31;
            String str4 = this.asset;
            int iHashCode12 = (iHashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
            MakeABetRequestImpl.AccountTypeImpl accountTypeImpl = this.accountType;
            int iHashCode13 = (iHashCode12 + (accountTypeImpl == null ? 0 : accountTypeImpl.hashCode())) * 31;
            String str5 = this.copyTicket;
            int iHashCode14 = (iHashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.avatarUser;
            int iHashCode15 = (iHashCode14 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.nickname;
            int iHashCode16 = (iHashCode15 + (str7 == null ? 0 : str7.hashCode())) * 31;
            Integer num7 = this.percentProfitable;
            int iHashCode17 = (iHashCode16 + (num7 == null ? 0 : num7.hashCode())) * 31;
            Integer num8 = this.closeMs;
            int iHashCode18 = (iHashCode17 + (num8 == null ? 0 : num8.hashCode())) * 31;
            MakeABetRequestImpl.OptionTypeImpl optionTypeImpl = this.optionType;
            int iHashCode19 = (iHashCode18 + (optionTypeImpl == null ? 0 : optionTypeImpl.hashCode())) * 31;
            Integer num9 = this.openMs;
            return iHashCode19 + (num9 != null ? num9.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            String str = this.id;
            String str2 = this.openTime;
            String str3 = this.closeTime;
            Integer num = this.openTimestamp;
            Integer num2 = this.closeTimestamp;
            Integer num3 = this.uid;
            Double d = this.amount;
            double d2 = this.profit;
            Integer num4 = this.percentProfit;
            Integer num5 = this.percentLoss;
            Double d3 = this.openPrice;
            Double d4 = this.closePrice;
            Integer num6 = this.command;
            String str4 = this.asset;
            MakeABetRequestImpl.AccountTypeImpl accountTypeImpl = this.accountType;
            String str5 = this.copyTicket;
            String str6 = this.avatarUser;
            String str7 = this.nickname;
            Integer num7 = this.percentProfitable;
            Integer num8 = this.closeMs;
            MakeABetRequestImpl.OptionTypeImpl optionTypeImpl = this.optionType;
            Integer num9 = this.openMs;
            StringBuilder sbA = C5896pG.a("ClosedBetImpl(id=", str, ", openTime=", str2, ", closeTime=");
            sbA.append(str3);
            sbA.append(", openTimestamp=");
            sbA.append(num);
            sbA.append(", closeTimestamp=");
            sbA.append(num2);
            sbA.append(", uid=");
            sbA.append(num3);
            sbA.append(", amount=");
            sbA.append(d);
            sbA.append(", profit=");
            sbA.append(d2);
            sbA.append(", percentProfit=");
            sbA.append(num4);
            sbA.append(", percentLoss=");
            sbA.append(num5);
            sbA.append(", openPrice=");
            sbA.append(d3);
            sbA.append(", closePrice=");
            sbA.append(d4);
            sbA.append(", command=");
            sbA.append(num6);
            sbA.append(", asset=");
            sbA.append(str4);
            sbA.append(", accountType=");
            sbA.append(accountTypeImpl);
            sbA.append(", copyTicket=");
            sbA.append(str5);
            C5896pG.b(sbA, ", avatarUser=", str6, ", nickname=", str7);
            sbA.append(", percentProfitable=");
            sbA.append(num7);
            sbA.append(", closeMs=");
            sbA.append(num8);
            sbA.append(", optionType=");
            sbA.append(optionTypeImpl);
            sbA.append(", openMs=");
            sbA.append(num9);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BetClosedResponseImpl)) {
            return false;
        }
        BetClosedResponseImpl betClosedResponseImpl = (BetClosedResponseImpl) obj;
        return Double.compare(this.profit, betClosedResponseImpl.profit) == 0 && Intrinsics.a(this.bets, betClosedResponseImpl.bets);
    }

    @Nullable
    public final List<ClosedBetImpl> f() {
        return this.bets;
    }

    public final int hashCode() {
        int iHashCode = Double.hashCode(this.profit) * 31;
        List<ClosedBetImpl> list = this.bets;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public final String toString() {
        return "BetClosedResponseImpl(profit=" + this.profit + ", bets=" + this.bets + ")";
    }
}
