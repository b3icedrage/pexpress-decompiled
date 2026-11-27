package com.api.core.backend.domain.models.responseModels;

import defpackage.C1039Gc0;
import defpackage.ID;
import defpackage.R51;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/api/core/backend/domain/models/responseModels/CommonBalances;", "", "Lcom/api/core/backend/domain/models/responseModels/CommonBalances$AccountBalance;", "realBalance", "Lcom/api/core/backend/domain/models/responseModels/CommonBalances$AccountBalance;", "getRealBalance", "()Lcom/api/core/backend/domain/models/responseModels/CommonBalances$AccountBalance;", "demoBalance", "getDemoBalance", "AccountBalance", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CommonBalances {

    @NotNull
    private final AccountBalance demoBalance;

    @NotNull
    private final AccountBalance realBalance;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/api/core/backend/domain/models/responseModels/CommonBalances$AccountBalance;", "", "", "id", "J", "b", "()J", "", "amount", "D", R51.PUSH_ADDITIONAL_DATA_KEY, "()D", "", "currencyCode", "Ljava/lang/String;", "getCurrencyCode", "()Ljava/lang/String;", "currencySign", "getCurrencySign", "Lcom/api/core/backend/domain/models/responseModels/AccountType;", "type", "Lcom/api/core/backend/domain/models/responseModels/AccountType;", "c", "()Lcom/api/core/backend/domain/models/responseModels/AccountType;", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AccountBalance {
        private final double amount;

        @NotNull
        private final String currencyCode;

        @NotNull
        private final String currencySign;
        private final long id;

        @NotNull
        private final AccountType type;

        public AccountBalance(long j, double d, @NotNull String currencyCode, @NotNull String currencySign, @NotNull AccountType type) {
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(currencySign, "currencySign");
            Intrinsics.checkNotNullParameter(type, "type");
            this.id = j;
            this.amount = d;
            this.currencyCode = currencyCode;
            this.currencySign = currencySign;
            this.type = type;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final double getAmount() {
            return this.amount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final AccountType getType() {
            return this.type;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AccountBalance)) {
                return false;
            }
            AccountBalance accountBalance = (AccountBalance) obj;
            return this.id == accountBalance.id && Double.compare(this.amount, accountBalance.amount) == 0 && Intrinsics.a(this.currencyCode, accountBalance.currencyCode) && Intrinsics.a(this.currencySign, accountBalance.currencySign) && this.type == accountBalance.type;
        }

        public final int hashCode() {
            return this.type.hashCode() + C1039Gc0.b(C1039Gc0.b(ID.a(this.amount, Long.hashCode(this.id) * 31, 31), 31, this.currencyCode), 31, this.currencySign);
        }

        @NotNull
        public final String toString() {
            return "AccountBalance(id=" + this.id + ", amount=" + this.amount + ", currencyCode=" + this.currencyCode + ", currencySign=" + this.currencySign + ", type=" + this.type + ")";
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonBalances)) {
            return false;
        }
        CommonBalances commonBalances = (CommonBalances) obj;
        return Intrinsics.a(this.realBalance, commonBalances.realBalance) && Intrinsics.a(this.demoBalance, commonBalances.demoBalance);
    }

    public final int hashCode() {
        return this.demoBalance.hashCode() + (this.realBalance.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "CommonBalances(realBalance=" + this.realBalance + ", demoBalance=" + this.demoBalance + ")";
    }
}
