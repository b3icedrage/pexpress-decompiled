package com.api.core.backend.domain.models.responseModels;

import defpackage.R51;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/api/core/backend/domain/models/responseModels/CommonAccounts;", "", "", "Lcom/api/core/backend/domain/models/responseModels/CommonAccount;", "accounts", "Ljava/util/List;", R51.PUSH_ADDITIONAL_DATA_KEY, "()Ljava/util/List;", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CommonAccounts {

    @NotNull
    private final List<CommonAccount> accounts;

    @NotNull
    public final List<CommonAccount> a() {
        return this.accounts;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonAccounts) && Intrinsics.a(this.accounts, ((CommonAccounts) obj).accounts);
    }

    public final int hashCode() {
        return this.accounts.hashCode();
    }

    @NotNull
    public final String toString() {
        return "CommonAccounts(accounts=" + this.accounts + ")";
    }
}
