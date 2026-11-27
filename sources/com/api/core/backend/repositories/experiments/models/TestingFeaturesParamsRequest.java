package com.api.core.backend.repositories.experiments.models;

import defpackage.C1039Gc0;
import defpackage.C5896pG;
import defpackage.InterfaceC2691aI1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/api/core/backend/repositories/experiments/models/TestingFeaturesParamsRequest;", "", "", "adId", "Ljava/lang/String;", "getAdId", "()Ljava/lang/String;", "deviceId", "getDeviceId", "simCountryCode", "getSimCountryCode", "experimentName", "getExperimentName", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TestingFeaturesParamsRequest {

    @InterfaceC2691aI1("adId")
    @NotNull
    private final String adId;

    @InterfaceC2691aI1("deviceId")
    @NotNull
    private final String deviceId;

    @NotNull
    private final String experimentName;

    @InterfaceC2691aI1("countryCode")
    @NotNull
    private final String simCountryCode;

    public TestingFeaturesParamsRequest(@NotNull String adId, @NotNull String deviceId, @NotNull String simCountryCode, @NotNull String experimentName) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(simCountryCode, "simCountryCode");
        Intrinsics.checkNotNullParameter(experimentName, "experimentName");
        this.adId = adId;
        this.deviceId = deviceId;
        this.simCountryCode = simCountryCode;
        this.experimentName = experimentName;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TestingFeaturesParamsRequest)) {
            return false;
        }
        TestingFeaturesParamsRequest testingFeaturesParamsRequest = (TestingFeaturesParamsRequest) obj;
        return Intrinsics.a(this.adId, testingFeaturesParamsRequest.adId) && Intrinsics.a(this.deviceId, testingFeaturesParamsRequest.deviceId) && Intrinsics.a(this.simCountryCode, testingFeaturesParamsRequest.simCountryCode) && Intrinsics.a(this.experimentName, testingFeaturesParamsRequest.experimentName);
    }

    public final int hashCode() {
        return this.experimentName.hashCode() + C1039Gc0.b(C1039Gc0.b(this.adId.hashCode() * 31, 31, this.deviceId), 31, this.simCountryCode);
    }

    @NotNull
    public final String toString() {
        String str = this.adId;
        String str2 = this.deviceId;
        String str3 = this.simCountryCode;
        String str4 = this.experimentName;
        StringBuilder sbA = C5896pG.a("TestingFeaturesParamsRequest(adId=", str, ", deviceId=", str2, ", simCountryCode=");
        sbA.append(str3);
        sbA.append(", experimentName=");
        sbA.append(str4);
        sbA.append(")");
        return sbA.toString();
    }
}
