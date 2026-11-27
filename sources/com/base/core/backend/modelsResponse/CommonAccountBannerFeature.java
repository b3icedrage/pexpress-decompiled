package com.base.core.backend.modelsResponse;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/base/core/backend/modelsResponse/CommonAccountBannerFeature;", "Lcom/base/core/backend/modelsResponse/CommonTestFeature;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Z", "getValue", "()Ljava/lang/Boolean;", "CoreBackendBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CommonAccountBannerFeature extends CommonTestFeature<Boolean> {
    private final boolean value;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonAccountBannerFeature) && this.value == ((CommonAccountBannerFeature) obj).value;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.value);
    }

    @NotNull
    public final String toString() {
        return "CommonAccountBannerFeature(value=" + this.value + ")";
    }
}
