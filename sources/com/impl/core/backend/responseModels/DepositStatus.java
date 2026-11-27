package com.impl.core.backend.responseModels;

import defpackage.C1952Ru;
import defpackage.InterfaceC4346i70;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/impl/core/backend/responseModels/DepositStatus;", "", "Expired", "Pending", "Success", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DepositStatus {
    private static final /* synthetic */ InterfaceC4346i70 $ENTRIES;
    private static final /* synthetic */ DepositStatus[] $VALUES;
    public static final DepositStatus Expired;
    public static final DepositStatus Pending;
    public static final DepositStatus Success;

    static {
        DepositStatus depositStatus = new DepositStatus("Expired", 0);
        Expired = depositStatus;
        DepositStatus depositStatus2 = new DepositStatus("Pending", 1);
        Pending = depositStatus2;
        DepositStatus depositStatus3 = new DepositStatus("Success", 2);
        Success = depositStatus3;
        DepositStatus[] depositStatusArr = {depositStatus, depositStatus2, depositStatus3};
        $VALUES = depositStatusArr;
        $ENTRIES = C1952Ru.i(depositStatusArr);
    }

    public DepositStatus() {
        throw null;
    }

    public static DepositStatus valueOf(String str) {
        return (DepositStatus) Enum.valueOf(DepositStatus.class, str);
    }

    public static DepositStatus[] values() {
        return (DepositStatus[]) $VALUES.clone();
    }
}
