package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.a;
import com.onesignal.common.AndroidUtils;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: n00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\bR\u0014\u0010\u0015\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\bR\u0014\u0010\u0016\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\bR\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\bR\u0014\u0010!\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\bR\u0014\u0010#\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\bR\u0014\u0010%\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\b¨\u0006("}, d2 = {"Ln00;", "Lws0;", "LWr0;", "_applicationService", "<init>", "(LWr0;)V", "", "isHMSCoreInstalledAndEnabledFallback", "()Z", "", "packageName", "packageInstalledAndEnabled", "(Ljava/lang/String;)Z", "isHMSCoreInstalledAndEnabled", "hasHMSAGConnectLibrary", "hasHMSPushKitLibrary", "hasHMSAvailabilityLibrary", "supportsADM", "supportsGooglePush", "LWr0;", "isAndroidDeviceType", "isFireOSDeviceType", "isHuaweiDeviceType", "Lws0$a;", "getDeviceType", "()Lws0$a;", "deviceType", "Lws0$b;", "getJetpackLibraryStatus", "()Lws0$b;", "jetpackLibraryStatus", "isGMSInstalledAndEnabled", "getHasFCMLibrary", "hasFCMLibrary", "getSupportsHMS", "supportsHMS", "getHasAllHMSLibrariesForPushKit", "hasAllHMSLibrariesForPushKit", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C5419n00 implements InterfaceC7494ws0 {

    @NotNull
    private static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    private static final int HMS_AVAILABLE_SUCCESSFUL = 0;

    @NotNull
    private static final String HMS_CORE_SERVICES_PACKAGE = "com.huawei.hwid";

    @NotNull
    private static final String PREFER_HMS_METADATA_NAME = "com.onesignal.preferHMS";

    @NotNull
    private final InterfaceC2338Wr0 _applicationService;

    public C5419n00(@NotNull InterfaceC2338Wr0 _applicationService) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        this._applicationService = _applicationService;
    }

    private final boolean hasHMSAGConnectLibrary() {
        try {
            Class.forName("com.huawei.agconnect.config.AGConnectServicesConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private final boolean hasHMSAvailabilityLibrary() {
        try {
            Class.forName("com.huawei.hms.api.HuaweiApiAvailability");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private final boolean hasHMSPushKitLibrary() {
        try {
            Class.forName("com.huawei.hms.aaid.HmsInstanceId");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private final boolean isHMSCoreInstalledAndEnabled() throws IllegalAccessException, InvocationTargetException {
        try {
            Class<?> cls = Class.forName("com.huawei.hms.api.HuaweiApiAvailability");
            Object objInvoke = cls.getMethod("isHuaweiMobileServicesAvailable", Context.class).invoke(cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), this._applicationService.getAppContext());
            Intrinsics.c(objInvoke, "null cannot be cast to non-null type kotlin.Int");
            return ((Integer) objInvoke).intValue() == 0;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private final boolean isHMSCoreInstalledAndEnabledFallback() {
        return packageInstalledAndEnabled(HMS_CORE_SERVICES_PACKAGE);
    }

    private final boolean packageInstalledAndEnabled(String packageName) {
        try {
            return this._applicationService.getAppContext().getPackageManager().getPackageInfo(packageName, UserVerificationMethods.USER_VERIFY_PATTERN).applicationInfo.enabled;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    private final boolean supportsADM() {
        try {
            Class.forName("com.amazon.device.messaging.ADM");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @Override // defpackage.InterfaceC7494ws0
    @NotNull
    public InterfaceC7494ws0.a getDeviceType() {
        if (supportsADM()) {
            return InterfaceC7494ws0.a.Fire;
        }
        boolean supportsHMS = getSupportsHMS();
        boolean zSupportsGooglePush = supportsGooglePush();
        if (zSupportsGooglePush && supportsHMS) {
            return AndroidUtils.INSTANCE.getManifestMetaBoolean(this._applicationService.getAppContext(), PREFER_HMS_METADATA_NAME) ? InterfaceC7494ws0.a.Huawei : InterfaceC7494ws0.a.Android;
        }
        if (zSupportsGooglePush) {
            return InterfaceC7494ws0.a.Android;
        }
        if (supportsHMS) {
            return InterfaceC7494ws0.a.Huawei;
        }
        if (isGMSInstalledAndEnabled()) {
            return InterfaceC7494ws0.a.Android;
        }
        return isHMSCoreInstalledAndEnabledFallback() ? InterfaceC7494ws0.a.Huawei : InterfaceC7494ws0.a.Android;
    }

    @Override // defpackage.InterfaceC7494ws0
    public boolean getHasAllHMSLibrariesForPushKit() {
        return hasHMSAGConnectLibrary() && hasHMSPushKitLibrary();
    }

    @Override // defpackage.InterfaceC7494ws0
    public boolean getHasFCMLibrary() {
        try {
            a aVar = FirebaseMessaging.n;
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @Override // defpackage.InterfaceC7494ws0
    @NotNull
    public InterfaceC7494ws0.b getJetpackLibraryStatus() {
        return !AndroidUtils.INSTANCE.hasNotificationManagerCompat() ? InterfaceC7494ws0.b.MISSING : InterfaceC7494ws0.b.OK;
    }

    @Override // defpackage.InterfaceC7494ws0
    public boolean getSupportsHMS() {
        if (hasHMSAvailabilityLibrary() && getHasAllHMSLibrariesForPushKit()) {
            return isHMSCoreInstalledAndEnabled();
        }
        return false;
    }

    @Override // defpackage.InterfaceC7494ws0
    public boolean isAndroidDeviceType() {
        return getDeviceType() == InterfaceC7494ws0.a.Android;
    }

    @Override // defpackage.InterfaceC7494ws0
    public boolean isFireOSDeviceType() {
        return getDeviceType() == InterfaceC7494ws0.a.Fire;
    }

    @Override // defpackage.InterfaceC7494ws0
    public boolean isGMSInstalledAndEnabled() {
        return packageInstalledAndEnabled("com.google.android.gms");
    }

    @Override // defpackage.InterfaceC7494ws0
    public boolean isHuaweiDeviceType() {
        return getDeviceType() == InterfaceC7494ws0.a.Huawei;
    }

    @Override // defpackage.InterfaceC7494ws0
    public boolean supportsGooglePush() {
        if (getHasFCMLibrary()) {
            return isGMSInstalledAndEnabled();
        }
        return false;
    }
}
