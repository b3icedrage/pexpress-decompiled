package com.api.core.backend.domain.models.responseModels;

import defpackage.C1039Gc0;
import defpackage.EnumC4164hF1;
import defpackage.R51;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/api/core/backend/domain/models/responseModels/CommonAccount;", "", "", "id", "J", "c", "()J", "", "currency", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/api/core/backend/domain/models/responseModels/AccountType;", "type", "Lcom/api/core/backend/domain/models/responseModels/AccountType;", "d", "()Lcom/api/core/backend/domain/models/responseModels/AccountType;", "", "amount", "D", R51.PUSH_ADDITIONAL_DATA_KEY, "()D", "setAmount", "(D)V", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CommonAccount {
    private double amount;

    @NotNull
    private final String currency;
    private final long id;

    @NotNull
    private final AccountType type;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final AccountType getType() {
        return this.type;
    }

    public final boolean e(@NotNull EnumC4164hF1 accountModeSelection, @Nullable Long l) {
        Intrinsics.checkNotNullParameter(accountModeSelection, "accountModeSelection");
        if (accountModeSelection == EnumC4164hF1.g) {
            return this.type == AccountType.DEMO;
        }
        return l != null && l.longValue() == this.id;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAccount)) {
            return false;
        }
        CommonAccount commonAccount = (CommonAccount) obj;
        return this.id == commonAccount.id && Intrinsics.a(this.currency, commonAccount.currency) && this.type == commonAccount.type && Double.compare(this.amount, commonAccount.amount) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.amount) + ((this.type.hashCode() + C1039Gc0.b(Long.hashCode(this.id) * 31, 31, this.currency)) * 31);
    }

    @NotNull
    public final String toString() {
        return "CommonAccount(id=" + this.id + ", currency=" + this.currency + ", type=" + this.type + ", amount=" + this.amount + ")";
    }
}
