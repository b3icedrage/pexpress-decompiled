package com.impl.core.backend.modelsResponse;

import com.api.core.backend.domain.models.responseModels.AccountType;
import com.api.core.backend.domain.models.responseModels.CommonBalances;
import com.api.core.backend.domain.models.responseModels.CommonUpdateBalances;
import com.impl.core.backend.abstractModels.WebSocketResponseAbstractImpl;
import defpackage.C1332Jw;
import defpackage.EF0;
import defpackage.InterfaceC1247It1;
import defpackage.InterfaceC2691aI1;
import defpackage.VE;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00122\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/impl/core/backend/modelsResponse/BalancesChangesResponse;", "Lcom/impl/core/backend/abstractModels/WebSocketResponseAbstractImpl;", "LIt1;", "Lcom/api/core/backend/domain/models/responseModels/CommonUpdateBalances;", "", "balance", "D", "getBalance", "()D", "", "isDemo", "I", "()I", "", "login", "Ljava/lang/Long;", "getLogin", "()Ljava/lang/Long;", "Companion", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BalancesChangesResponse extends WebSocketResponseAbstractImpl implements InterfaceC1247It1<CommonUpdateBalances> {

    @NotNull
    public static final String NAME = "successupdateBalance";

    @InterfaceC2691aI1("balance")
    private final double balance;

    @InterfaceC2691aI1("isDemo")
    private final int isDemo;

    @InterfaceC2691aI1("login")
    @Nullable
    private final Long login;

    @Override // defpackage.InterfaceC1247It1
    public final CommonUpdateBalances a() {
        boolean z;
        long jLongValue;
        String upperCase;
        int i = this.isDemo;
        if (i != 0) {
            z = true;
            if (i != 1) {
                throw new IllegalArgumentException(C1332Jw.a(i, "Integer must be 1 or 0, but ", " was found"));
            }
        } else {
            z = false;
        }
        if (z) {
            jLongValue = -1;
        } else {
            Long l = this.login;
            jLongValue = l != null ? l.longValue() : 1L;
        }
        double d = this.balance;
        if (z) {
            upperCase = "usd".toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        } else {
            upperCase = "";
        }
        return new CommonUpdateBalances(VE.c(new CommonBalances.AccountBalance(jLongValue, d, upperCase, z ? "$" : "", z ? AccountType.DEMO : AccountType.REAL)));
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BalancesChangesResponse)) {
            return false;
        }
        BalancesChangesResponse balancesChangesResponse = (BalancesChangesResponse) obj;
        return Double.compare(this.balance, balancesChangesResponse.balance) == 0 && this.isDemo == balancesChangesResponse.isDemo && Intrinsics.a(this.login, balancesChangesResponse.login);
    }

    public final int hashCode() {
        int iA = EF0.a(this.isDemo, Double.hashCode(this.balance) * 31, 31);
        Long l = this.login;
        return iA + (l == null ? 0 : l.hashCode());
    }

    @NotNull
    public final String toString() {
        return "BalancesChangesResponse(balance=" + this.balance + ", isDemo=" + this.isDemo + ", login=" + this.login + ")";
    }
}
