package com.api.core.backend.domain.models.requestModels;

import defpackage.C1039Gc0;
import defpackage.C2983be;
import defpackage.C5807oq;
import defpackage.C5896pG;
import defpackage.InterfaceC2691aI1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0004\u001a\u0004\b\u0019\u0010\u0006R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006¨\u0006\u001d"}, d2 = {"Lcom/api/core/backend/domain/models/requestModels/ConfigRequest;", "", "", "packageName", "Ljava/lang/String;", "getPackageName", "()Ljava/lang/String;", "appVersion", "getAppVersion", "localeLanguageCode", "getLocaleLanguageCode", "", "isVpnActivate", "Z", "()Z", "isRooted", "simOperatorName", "getSimOperatorName", "simCountryIso", "getSimCountryIso", "networkCountryIso", "getNetworkCountryIso", "androidId", "getAndroidId", "advertisingId", "getAdvertisingId", "email", "getEmail", "Companion", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ConfigRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @InterfaceC2691aI1("adId")
    @NotNull
    private final String advertisingId;

    @InterfaceC2691aI1("deviceId")
    @NotNull
    private final String androidId;

    @InterfaceC2691aI1("app_version")
    @NotNull
    private final String appVersion;

    @InterfaceC2691aI1("email")
    @Nullable
    private final String email;

    @InterfaceC2691aI1("is_rooted")
    private final boolean isRooted;

    @InterfaceC2691aI1("is_vpn_activate")
    private final boolean isVpnActivate;

    @InterfaceC2691aI1("locale_language_code")
    @NotNull
    private final String localeLanguageCode;

    @InterfaceC2691aI1("network_country_iso")
    @NotNull
    private final String networkCountryIso;

    @InterfaceC2691aI1("package_name")
    @NotNull
    private final String packageName;

    @InterfaceC2691aI1("sim_country_iso")
    @NotNull
    private final String simCountryIso;

    @InterfaceC2691aI1("sim_operator_name")
    @NotNull
    private final String simOperatorName;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/core/backend/domain/models/requestModels/ConfigRequest$Companion;", "", "<init>", "()V", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public ConfigRequest(@NotNull String packageName, @NotNull String appVersion, @NotNull String localeLanguageCode, boolean z, boolean z2, @NotNull String simOperatorName, @NotNull String simCountryIso, @NotNull String networkCountryIso, @NotNull String androidId, @NotNull String advertisingId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(localeLanguageCode, "localeLanguageCode");
        Intrinsics.checkNotNullParameter(simOperatorName, "simOperatorName");
        Intrinsics.checkNotNullParameter(simCountryIso, "simCountryIso");
        Intrinsics.checkNotNullParameter(networkCountryIso, "networkCountryIso");
        Intrinsics.checkNotNullParameter(androidId, "androidId");
        Intrinsics.checkNotNullParameter(advertisingId, "advertisingId");
        this.packageName = packageName;
        this.appVersion = appVersion;
        this.localeLanguageCode = localeLanguageCode;
        this.isVpnActivate = z;
        this.isRooted = z2;
        this.simOperatorName = simOperatorName;
        this.simCountryIso = simCountryIso;
        this.networkCountryIso = networkCountryIso;
        this.androidId = androidId;
        this.advertisingId = advertisingId;
        this.email = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfigRequest)) {
            return false;
        }
        ConfigRequest configRequest = (ConfigRequest) obj;
        return Intrinsics.a(this.packageName, configRequest.packageName) && Intrinsics.a(this.appVersion, configRequest.appVersion) && Intrinsics.a(this.localeLanguageCode, configRequest.localeLanguageCode) && this.isVpnActivate == configRequest.isVpnActivate && this.isRooted == configRequest.isRooted && Intrinsics.a(this.simOperatorName, configRequest.simOperatorName) && Intrinsics.a(this.simCountryIso, configRequest.simCountryIso) && Intrinsics.a(this.networkCountryIso, configRequest.networkCountryIso) && Intrinsics.a(this.androidId, configRequest.androidId) && Intrinsics.a(this.advertisingId, configRequest.advertisingId) && Intrinsics.a(this.email, configRequest.email);
    }

    public final int hashCode() {
        int iB = C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(C2983be.a(C2983be.a(C1039Gc0.b(C1039Gc0.b(this.packageName.hashCode() * 31, 31, this.appVersion), 31, this.localeLanguageCode), this.isVpnActivate, 31), this.isRooted, 31), 31, this.simOperatorName), 31, this.simCountryIso), 31, this.networkCountryIso), 31, this.androidId), 31, this.advertisingId);
        String str = this.email;
        return iB + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        String str = this.packageName;
        String str2 = this.appVersion;
        String str3 = this.localeLanguageCode;
        boolean z = this.isVpnActivate;
        boolean z2 = this.isRooted;
        String str4 = this.simOperatorName;
        String str5 = this.simCountryIso;
        String str6 = this.networkCountryIso;
        String str7 = this.androidId;
        String str8 = this.advertisingId;
        String str9 = this.email;
        StringBuilder sbA = C5896pG.a("ConfigRequest(packageName=", str, ", appVersion=", str2, ", localeLanguageCode=");
        sbA.append(str3);
        sbA.append(", isVpnActivate=");
        sbA.append(z);
        sbA.append(", isRooted=");
        sbA.append(z2);
        sbA.append(", simOperatorName=");
        sbA.append(str4);
        sbA.append(", simCountryIso=");
        C5896pG.b(sbA, str5, ", networkCountryIso=", str6, ", androidId=");
        C5896pG.b(sbA, str7, ", advertisingId=", str8, ", email=");
        return C5807oq.b(sbA, str9, ")");
    }
}
