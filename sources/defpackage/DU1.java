package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001f\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b!\u0010\u0016R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\"\u0010\u0016R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b#\u0010\u0016R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b$\u0010\u001dR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b%\u0010 R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b&\u0010\u0016R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b'\u0010\u0016¨\u0006("}, d2 = {"LDU1;", "", "", "id", "LEU1;", "type", "token", "", "enabled", "", "notificationTypes", "sdk", "deviceModel", "deviceOS", "rooted", "netType", "carrier", "appVersion", "<init>", "(Ljava/lang/String;LEU1;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "LEU1;", "getType", "()LEU1;", "getToken", "Ljava/lang/Boolean;", "getEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Integer;", "getNotificationTypes", "()Ljava/lang/Integer;", "getSdk", "getDeviceModel", "getDeviceOS", "getRooted", "getNetType", "getCarrier", "getAppVersion", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DU1 {

    @Nullable
    private final String appVersion;

    @Nullable
    private final String carrier;

    @Nullable
    private final String deviceModel;

    @Nullable
    private final String deviceOS;

    @Nullable
    private final Boolean enabled;

    @Nullable
    private final String id;

    @Nullable
    private final Integer netType;

    @Nullable
    private final Integer notificationTypes;

    @Nullable
    private final Boolean rooted;

    @Nullable
    private final String sdk;

    @Nullable
    private final String token;

    @Nullable
    private final EU1 type;

    public DU1() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    @Nullable
    public final String getAppVersion() {
        return this.appVersion;
    }

    @Nullable
    public final String getCarrier() {
        return this.carrier;
    }

    @Nullable
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    @Nullable
    public final String getDeviceOS() {
        return this.deviceOS;
    }

    @Nullable
    public final Boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Integer getNetType() {
        return this.netType;
    }

    @Nullable
    public final Integer getNotificationTypes() {
        return this.notificationTypes;
    }

    @Nullable
    public final Boolean getRooted() {
        return this.rooted;
    }

    @Nullable
    public final String getSdk() {
        return this.sdk;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }

    @Nullable
    public final EU1 getType() {
        return this.type;
    }

    public DU1(@Nullable String str, @Nullable EU1 eu1, @Nullable String str2, @Nullable Boolean bool, @Nullable Integer num, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Boolean bool2, @Nullable Integer num2, @Nullable String str6, @Nullable String str7) {
        this.id = str;
        this.type = eu1;
        this.token = str2;
        this.enabled = bool;
        this.notificationTypes = num;
        this.sdk = str3;
        this.deviceModel = str4;
        this.deviceOS = str5;
        this.rooted = bool2;
        this.netType = num2;
        this.carrier = str6;
        this.appVersion = str7;
    }

    public /* synthetic */ DU1(String str, EU1 eu1, String str2, Boolean bool, Integer num, String str3, String str4, String str5, Boolean bool2, Integer num2, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : eu1, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str5, (i & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : bool2, (i & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : num2, (i & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : str6, (i & 2048) != 0 ? null : str7);
    }
}
