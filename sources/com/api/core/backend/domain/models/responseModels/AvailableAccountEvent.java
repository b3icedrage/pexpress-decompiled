package com.api.core.backend.domain.models.responseModels;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.C7362wF;
import defpackage.InterfaceC2691aI1;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/api/core/backend/domain/models/responseModels/AvailableAccountEvent;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Z", "getValue", "()Z", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AvailableAccountEvent {

    @InterfaceC2691aI1("Transition - Account")
    private final boolean value;

    @NotNull
    public final C7362wF a() {
        return new C7362wF(this.value);
    }
}
