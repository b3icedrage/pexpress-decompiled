package com.api.core.backend.domain.models.responseModels;

import defpackage.EF;
import defpackage.EF0;
import defpackage.SK;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/api/core/backend/domain/models/responseModels/CommonCommissionChanged;", "", "LEF;", "instrumentType", "LEF;", "getInstrumentType", "()LEF;", "", "activeId", "I", "getActiveId", "()I", "commission", "getCommission", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CommonCommissionChanged {
    private final int activeId;
    private final int commission;

    @NotNull
    private final EF instrumentType;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonCommissionChanged)) {
            return false;
        }
        CommonCommissionChanged commonCommissionChanged = (CommonCommissionChanged) obj;
        return this.instrumentType == commonCommissionChanged.instrumentType && this.activeId == commonCommissionChanged.activeId && this.commission == commonCommissionChanged.commission;
    }

    public final int hashCode() {
        return Integer.hashCode(this.commission) + EF0.a(this.activeId, this.instrumentType.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        EF ef = this.instrumentType;
        int i = this.activeId;
        int i2 = this.commission;
        StringBuilder sb = new StringBuilder("CommonCommissionChanged(instrumentType=");
        sb.append(ef);
        sb.append(", activeId=");
        sb.append(i);
        sb.append(", commission=");
        return SK.b(sb, i2, ")");
    }
}
