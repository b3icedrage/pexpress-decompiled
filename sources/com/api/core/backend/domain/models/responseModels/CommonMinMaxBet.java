package com.api.core.backend.domain.models.responseModels;

import defpackage.InterfaceC2691aI1;
import defpackage.R51;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/api/core/backend/domain/models/responseModels/CommonMinMaxBet;", "", "", "min", "D", "b", "()D", "max", R51.PUSH_ADDITIONAL_DATA_KEY, "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CommonMinMaxBet {

    @InterfaceC2691aI1("max")
    private final double max;

    @InterfaceC2691aI1("min")
    private final double min;

    public CommonMinMaxBet(double d, double d2) {
        this.min = d;
        this.max = d2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getMax() {
        return this.max;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getMin() {
        return this.min;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonMinMaxBet)) {
            return false;
        }
        CommonMinMaxBet commonMinMaxBet = (CommonMinMaxBet) obj;
        return Double.compare(this.min, commonMinMaxBet.min) == 0 && Double.compare(this.max, commonMinMaxBet.max) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.max) + (Double.hashCode(this.min) * 31);
    }

    @NotNull
    public final String toString() {
        return "CommonMinMaxBet(min=" + this.min + ", max=" + this.max + ")";
    }
}
