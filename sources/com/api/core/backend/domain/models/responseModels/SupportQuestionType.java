package com.api.core.backend.domain.models.responseModels;

import defpackage.C1952Ru;
import defpackage.InterfaceC2691aI1;
import defpackage.InterfaceC4346i70;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/api/core/backend/domain/models/responseModels/SupportQuestionType;", "", "ACCOUNT_ACTIVATION", "TRADING", "DEPOSIT_WITHDRAW", "VERIFICATION", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SupportQuestionType {
    private static final /* synthetic */ InterfaceC4346i70 $ENTRIES;
    private static final /* synthetic */ SupportQuestionType[] $VALUES;

    @InterfaceC2691aI1("Account activation")
    public static final SupportQuestionType ACCOUNT_ACTIVATION;

    @InterfaceC2691aI1("Deposit/Withdraw")
    public static final SupportQuestionType DEPOSIT_WITHDRAW;

    @InterfaceC2691aI1("Trading")
    public static final SupportQuestionType TRADING;

    @InterfaceC2691aI1("Verification")
    public static final SupportQuestionType VERIFICATION;

    static {
        SupportQuestionType supportQuestionType = new SupportQuestionType("ACCOUNT_ACTIVATION", 0);
        ACCOUNT_ACTIVATION = supportQuestionType;
        SupportQuestionType supportQuestionType2 = new SupportQuestionType("TRADING", 1);
        TRADING = supportQuestionType2;
        SupportQuestionType supportQuestionType3 = new SupportQuestionType("DEPOSIT_WITHDRAW", 2);
        DEPOSIT_WITHDRAW = supportQuestionType3;
        SupportQuestionType supportQuestionType4 = new SupportQuestionType("VERIFICATION", 3);
        VERIFICATION = supportQuestionType4;
        SupportQuestionType[] supportQuestionTypeArr = {supportQuestionType, supportQuestionType2, supportQuestionType3, supportQuestionType4};
        $VALUES = supportQuestionTypeArr;
        $ENTRIES = C1952Ru.i(supportQuestionTypeArr);
    }

    public SupportQuestionType() {
        throw null;
    }

    public static SupportQuestionType valueOf(String str) {
        return (SupportQuestionType) Enum.valueOf(SupportQuestionType.class, str);
    }

    public static SupportQuestionType[] values() {
        return (SupportQuestionType[]) $VALUES.clone();
    }
}
