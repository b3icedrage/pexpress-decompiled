package com.base.core.backend.modelsOurSideRequest.events;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.C1039Gc0;
import defpackage.C1952Ru;
import defpackage.C5896pG;
import defpackage.InterfaceC2691aI1;
import defpackage.InterfaceC4346i70;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\f\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/base/core/backend/modelsOurSideRequest/events/EventBetRequest;", "", "", "balanceType", "Ljava/lang/String;", "getBalanceType", "()Ljava/lang/String;", "Lcom/base/core/backend/modelsOurSideRequest/events/EventBetRequest$Properties;", "properties", "Lcom/base/core/backend/modelsOurSideRequest/events/EventBetRequest$Properties;", "getProperties", "()Lcom/base/core/backend/modelsOurSideRequest/events/EventBetRequest$Properties;", "Properties", "BetType", "CoreBackendBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EventBetRequest {

    @InterfaceC2691aI1("type")
    @NotNull
    private final String balanceType;

    @InterfaceC2691aI1("event_properties")
    @NotNull
    private final Properties properties;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.base.core.backend.modelsOurSideRequest.events.EventBetRequest$BetType[], still in use, count: 1, list:
      (r0v1 com.base.core.backend.modelsOurSideRequest.events.EventBetRequest$BetType[]) from 0x001e: INVOKE (r0v1 com.base.core.backend.modelsOurSideRequest.events.EventBetRequest$BetType[]) STATIC call: Ru.i(java.lang.Enum[]):k70 A[MD:(java.lang.Enum[]):k70 (m), WRAPPED] (LINE:31)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/base/core/backend/modelsOurSideRequest/events/EventBetRequest$BetType;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Ljava/lang/String;", "b", "()Ljava/lang/String;", "REAL", "DEMO", "CoreBackendBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BetType {
        REAL("real_deal_done"),
        DEMO("demo_deal_done");

        private static final /* synthetic */ InterfaceC4346i70 $ENTRIES;

        @NotNull
        private final String value;

        static {
            $ENTRIES = C1952Ru.i(betTypeArr);
        }

        public BetType(String str) {
            super(str, i);
            this.value = str;
        }

        public static BetType valueOf(String str) {
            return (BetType) Enum.valueOf(BetType.class, str);
        }

        public static BetType[] values() {
            return (BetType[]) $VALUES.clone();
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001:\u0001'R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0013\u0010\u000bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\t\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u001b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\t\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u001d\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\t\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u001f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\t\u001a\u0004\b \u0010\u000bR\u001a\u0010!\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\t\u001a\u0004\b\"\u0010\u000bR\u001a\u0010#\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\t\u001a\u0004\b$\u0010\u000bR\u001a\u0010%\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\t\u001a\u0004\b&\u0010\u000b¨\u0006("}, d2 = {"Lcom/base/core/backend/modelsOurSideRequest/events/EventBetRequest$Properties;", "", "", "usdQuantity", "Ljava/lang/Integer;", "getUsdQuantity", "()Ljava/lang/Integer;", "", "result", "Ljava/lang/String;", "getResult", "()Ljava/lang/String;", "startDealId", "getStartDealId", "tradingStrategy", "getTradingStrategy", "technicalIndicator", "getTechnicalIndicator", "directionSource", "getDirectionSource", "", "usdRateMissing", "Ljava/lang/Boolean;", "getUsdRateMissing", "()Ljava/lang/Boolean;", "startBalance", "getStartBalance", "startBalanceUsd", "getStartBalanceUsd", "finishBalance", "getFinishBalance", "finishBalanceUsd", "getFinishBalanceUsd", "balanceChange", "getBalanceChange", "balanceChangeUsd", "getBalanceChangeUsd", "currency", "getCurrency", "BetResult", "CoreBackendBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Properties {

        @InterfaceC2691aI1("result_amount")
        @NotNull
        private final String balanceChange;

        @InterfaceC2691aI1("result_amount_usd")
        @NotNull
        private final String balanceChangeUsd;

        @InterfaceC2691aI1("currency")
        @NotNull
        private final String currency;

        @InterfaceC2691aI1("direction_source")
        @NotNull
        private final String directionSource;

        @InterfaceC2691aI1("finish_balance")
        @NotNull
        private final String finishBalance;

        @InterfaceC2691aI1("finish_balance_usd")
        @NotNull
        private final String finishBalanceUsd;

        @NotNull
        private final String result;

        @InterfaceC2691aI1("start_balance")
        @NotNull
        private final String startBalance;

        @InterfaceC2691aI1("start_balance_usd")
        @NotNull
        private final String startBalanceUsd;

        @InterfaceC2691aI1("start_deal_id")
        @NotNull
        private final String startDealId;

        @InterfaceC2691aI1("technical_indicator")
        @NotNull
        private final String technicalIndicator;

        @InterfaceC2691aI1("trading_strategy")
        @NotNull
        private final String tradingStrategy;

        @InterfaceC2691aI1("qty_usd")
        @Nullable
        private final Integer usdQuantity;

        @InterfaceC2691aI1("usd_rate_missing")
        @Nullable
        private final Boolean usdRateMissing;

        /* JADX WARN: Enum visitor error
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.base.core.backend.modelsOurSideRequest.events.EventBetRequest$Properties$BetResult[], still in use, count: 1, list:
          (r0v1 com.base.core.backend.modelsOurSideRequest.events.EventBetRequest$Properties$BetResult[]) from 0x002a: INVOKE (r0v1 com.base.core.backend.modelsOurSideRequest.events.EventBetRequest$Properties$BetResult[]) STATIC call: Ru.i(java.lang.Enum[]):k70 A[MD:(java.lang.Enum[]):k70 (m), WRAPPED] (LINE:43)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
        	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
        	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
         */
        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/base/core/backend/modelsOurSideRequest/events/EventBetRequest$Properties$BetResult;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Ljava/lang/String;", "b", "()Ljava/lang/String;", "WIN", "LOSE", "STANDOFF", "CoreBackendBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class BetResult {
            WIN("win"),
            LOSE("lose"),
            STANDOFF("standoff");

            private static final /* synthetic */ InterfaceC4346i70 $ENTRIES;

            @NotNull
            private final String value;

            static {
                $ENTRIES = C1952Ru.i(betResultArr);
            }

            public BetResult(String str) {
                super(str, i);
                this.value = str;
            }

            public static BetResult valueOf(String str) {
                return (BetResult) Enum.valueOf(BetResult.class, str);
            }

            public static BetResult[] values() {
                return (BetResult[]) $VALUES.clone();
            }

            @NotNull
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getValue() {
                return this.value;
            }
        }

        public Properties(@Nullable Integer num, @NotNull String result, @NotNull String startDealId, @NotNull String tradingStrategy, @NotNull String technicalIndicator, @NotNull String directionSource, @Nullable Boolean bool, @NotNull String startBalance, @NotNull String startBalanceUsd, @NotNull String finishBalance, @NotNull String finishBalanceUsd, @NotNull String balanceChange, @NotNull String balanceChangeUsd, @NotNull String currency) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(startDealId, "startDealId");
            Intrinsics.checkNotNullParameter(tradingStrategy, "tradingStrategy");
            Intrinsics.checkNotNullParameter(technicalIndicator, "technicalIndicator");
            Intrinsics.checkNotNullParameter(directionSource, "directionSource");
            Intrinsics.checkNotNullParameter(startBalance, "startBalance");
            Intrinsics.checkNotNullParameter(startBalanceUsd, "startBalanceUsd");
            Intrinsics.checkNotNullParameter(finishBalance, "finishBalance");
            Intrinsics.checkNotNullParameter(finishBalanceUsd, "finishBalanceUsd");
            Intrinsics.checkNotNullParameter(balanceChange, "balanceChange");
            Intrinsics.checkNotNullParameter(balanceChangeUsd, "balanceChangeUsd");
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.usdQuantity = num;
            this.result = result;
            this.startDealId = startDealId;
            this.tradingStrategy = tradingStrategy;
            this.technicalIndicator = technicalIndicator;
            this.directionSource = directionSource;
            this.usdRateMissing = bool;
            this.startBalance = startBalance;
            this.startBalanceUsd = startBalanceUsd;
            this.finishBalance = finishBalance;
            this.finishBalanceUsd = finishBalanceUsd;
            this.balanceChange = balanceChange;
            this.balanceChangeUsd = balanceChangeUsd;
            this.currency = currency;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Properties)) {
                return false;
            }
            Properties properties = (Properties) obj;
            return Intrinsics.a(this.usdQuantity, properties.usdQuantity) && Intrinsics.a(this.result, properties.result) && Intrinsics.a(this.startDealId, properties.startDealId) && Intrinsics.a(this.tradingStrategy, properties.tradingStrategy) && Intrinsics.a(this.technicalIndicator, properties.technicalIndicator) && Intrinsics.a(this.directionSource, properties.directionSource) && Intrinsics.a(this.usdRateMissing, properties.usdRateMissing) && Intrinsics.a(this.startBalance, properties.startBalance) && Intrinsics.a(this.startBalanceUsd, properties.startBalanceUsd) && Intrinsics.a(this.finishBalance, properties.finishBalance) && Intrinsics.a(this.finishBalanceUsd, properties.finishBalanceUsd) && Intrinsics.a(this.balanceChange, properties.balanceChange) && Intrinsics.a(this.balanceChangeUsd, properties.balanceChangeUsd) && Intrinsics.a(this.currency, properties.currency);
        }

        public final int hashCode() {
            Integer num = this.usdQuantity;
            int iB = C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(C1039Gc0.b((num == null ? 0 : num.hashCode()) * 31, 31, this.result), 31, this.startDealId), 31, this.tradingStrategy), 31, this.technicalIndicator), 31, this.directionSource);
            Boolean bool = this.usdRateMissing;
            return this.currency.hashCode() + C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(C1039Gc0.b((iB + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.startBalance), 31, this.startBalanceUsd), 31, this.finishBalance), 31, this.finishBalanceUsd), 31, this.balanceChange), 31, this.balanceChangeUsd);
        }

        @NotNull
        public final String toString() {
            Integer num = this.usdQuantity;
            String str = this.result;
            String str2 = this.startDealId;
            String str3 = this.tradingStrategy;
            String str4 = this.technicalIndicator;
            String str5 = this.directionSource;
            Boolean bool = this.usdRateMissing;
            String str6 = this.startBalance;
            String str7 = this.startBalanceUsd;
            String str8 = this.finishBalance;
            String str9 = this.finishBalanceUsd;
            String str10 = this.balanceChange;
            String str11 = this.balanceChangeUsd;
            String str12 = this.currency;
            StringBuilder sb = new StringBuilder("Properties(usdQuantity=");
            sb.append(num);
            sb.append(", result=");
            sb.append(str);
            sb.append(", startDealId=");
            C5896pG.b(sb, str2, ", tradingStrategy=", str3, ", technicalIndicator=");
            C5896pG.b(sb, str4, ", directionSource=", str5, ", usdRateMissing=");
            sb.append(bool);
            sb.append(", startBalance=");
            sb.append(str6);
            sb.append(", startBalanceUsd=");
            C5896pG.b(sb, str7, ", finishBalance=", str8, ", finishBalanceUsd=");
            C5896pG.b(sb, str9, ", balanceChange=", str10, ", balanceChangeUsd=");
            sb.append(str11);
            sb.append(", currency=");
            sb.append(str12);
            sb.append(")");
            return sb.toString();
        }
    }

    public EventBetRequest(@NotNull String balanceType, @NotNull Properties properties) {
        Intrinsics.checkNotNullParameter(balanceType, "balanceType");
        Intrinsics.checkNotNullParameter(properties, "properties");
        this.balanceType = balanceType;
        this.properties = properties;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventBetRequest)) {
            return false;
        }
        EventBetRequest eventBetRequest = (EventBetRequest) obj;
        return Intrinsics.a(this.balanceType, eventBetRequest.balanceType) && Intrinsics.a(this.properties, eventBetRequest.properties);
    }

    public final int hashCode() {
        return this.properties.hashCode() + (this.balanceType.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "EventBetRequest(balanceType=" + this.balanceType + ", properties=" + this.properties + ")";
    }
}
