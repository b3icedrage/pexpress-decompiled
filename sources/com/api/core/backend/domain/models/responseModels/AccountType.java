package com.api.core.backend.domain.models.responseModels;

import defpackage.C1952Ru;
import defpackage.InterfaceC4346i70;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/core/backend/domain/models/responseModels/AccountType;", "", "REAL", "DEMO", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AccountType {
    private static final /* synthetic */ InterfaceC4346i70 $ENTRIES;
    private static final /* synthetic */ AccountType[] $VALUES;
    public static final AccountType DEMO;
    public static final AccountType REAL;

    static {
        AccountType accountType = new AccountType("REAL", 0);
        REAL = accountType;
        AccountType accountType2 = new AccountType("DEMO", 1);
        DEMO = accountType2;
        AccountType[] accountTypeArr = {accountType, accountType2};
        $VALUES = accountTypeArr;
        $ENTRIES = C1952Ru.i(accountTypeArr);
    }

    public AccountType() {
        throw null;
    }

    public static AccountType valueOf(String str) {
        return (AccountType) Enum.valueOf(AccountType.class, str);
    }

    public static AccountType[] values() {
        return (AccountType[]) $VALUES.clone();
    }
}
