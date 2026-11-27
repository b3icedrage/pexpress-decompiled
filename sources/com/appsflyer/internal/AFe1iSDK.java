package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailability;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevCallback;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk;
import defpackage.C2629a1;
import defpackage.C2983be;
import defpackage.C5491nL;
import defpackage.C6399rg;
import defpackage.InterfaceC3770fO0;
import defpackage.Q2;
import defpackage.VE;
import defpackage.WE;
import defpackage.XO0;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002)*B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\t\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\t\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\t\u001a\u00020\u0013*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\t\u0010\u0014J\u000f\u0010\u0010\u001a\u00020\rH\u0010¢\u0006\u0004\b\u0010\u0010\u0015J\u000f\u0010\u000f\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u000f\u0010\u0017R\u0014\u0010\u000f\u001a\u00020\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0010\u001a\u00020\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0015\u0010'\u001a\u00020$8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b%\u0010&R\u0015\u0010\u0019\u001a\u00020\r8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b(\u0010&R\u0014\u0010\u001c\u001a\u00020\r8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0015"}, d2 = {"Lcom/appsflyer/internal/AFe1iSDK;", "Lcom/appsflyer/internal/AFe1ySDK;", "Lcom/appsflyer/internal/AFh1qSDK;", "Lcom/appsflyer/internal/AFc1bSDK;", "p0", "<init>", "(Lcom/appsflyer/internal/AFc1bSDK;)V", "Landroid/content/Context;", "", "d", "(Landroid/content/Context;)I", "Lcom/appsflyer/internal/AFe1iSDK$AFa1tSDK;", "p1", "", "(Landroid/content/Context;Lcom/appsflyer/internal/AFe1iSDK$AFa1tSDK;)Z", "registerClient", "AFLogger", "(I)Z", "", "", "(Lcom/appsflyer/internal/AFh1qSDK;Ljava/lang/String;)V", "()Z", "Lcom/appsflyer/internal/AFd1cSDK;", "()Lcom/appsflyer/internal/AFd1cSDK;", "Lcom/appsflyer/internal/AFd1zSDK;", "i", "Lcom/appsflyer/internal/AFd1zSDK;", "Lcom/appsflyer/internal/AFc1iSDK;", "v", "Lcom/appsflyer/internal/AFc1iSDK;", "Lcom/appsflyer/internal/AFc1eSDK;", "e", "Lcom/appsflyer/internal/AFc1eSDK;", "force", "Lcom/appsflyer/internal/AFh1qSDK;", "unregisterClient", "", "afErrorLog", "LfO0;", "AFKeystoreWrapper", "afInfoLog", "AFa1vSDK", "AFa1tSDK"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AFe1iSDK extends AFe1ySDK<AFh1qSDK> {

    /* JADX INFO: renamed from: afErrorLog, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC3770fO0 AFKeystoreWrapper;

    /* JADX INFO: renamed from: afInfoLog, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC3770fO0 i;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final AFc1eSDK d;

    /* JADX INFO: renamed from: force, reason: from kotlin metadata */
    @NotNull
    private final AFh1qSDK unregisterClient;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final AFd1zSDK registerClient;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    private final AFc1iSDK AFLogger;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0012\u001a\u00060\u0007j\u0002`\bHÇ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\bHÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001c\u0010\rR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010 R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010!\u001a\u0004\b\u0005\u0010\u000f\"\u0004\b\"\u0010#R\"\u0010\u0006\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u0011\"\u0004\b&\u0010'R\u001e\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010\u0013"}, d2 = {"Lcom/appsflyer/internal/AFe1iSDK$AFa1tSDK;", "", "", "advertisingId", "", "isLimitAdTrackingEnabled", "advertisingIdWithGps", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "gaidError", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "()Z", "component4", "()Ljava/lang/StringBuilder;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)Lcom/appsflyer/internal/AFe1iSDK$AFa1tSDK;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAdvertisingId", "setAdvertisingId", "(Ljava/lang/String;)V", "Ljava/lang/Boolean;", "setLimitAdTrackingEnabled", "(Ljava/lang/Boolean;)V", "Z", "getAdvertisingIdWithGps", "setAdvertisingIdWithGps", "(Z)V", "Ljava/lang/StringBuilder;", "getGaidError"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AFa1tSDK {

        @Nullable
        private String advertisingId;
        private boolean advertisingIdWithGps;

        @NotNull
        private final StringBuilder gaidError;

        @Nullable
        private Boolean isLimitAdTrackingEnabled;

        public AFa1tSDK() {
            this(null, null, false, null, 15, null);
        }

        public static /* synthetic */ AFa1tSDK copy$default(AFa1tSDK aFa1tSDK, String str, Boolean bool, boolean z, StringBuilder sb, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aFa1tSDK.advertisingId;
            }
            if ((i & 2) != 0) {
                bool = aFa1tSDK.isLimitAdTrackingEnabled;
            }
            if ((i & 4) != 0) {
                z = aFa1tSDK.advertisingIdWithGps;
            }
            if ((i & 8) != 0) {
                sb = aFa1tSDK.gaidError;
            }
            return aFa1tSDK.copy(str, bool, z, sb);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getIsLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getAdvertisingIdWithGps() {
            return this.advertisingIdWithGps;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final StringBuilder getGaidError() {
            return this.gaidError;
        }

        @NotNull
        public final AFa1tSDK copy(@Nullable String advertisingId, @Nullable Boolean isLimitAdTrackingEnabled, boolean advertisingIdWithGps, @NotNull StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            return new AFa1tSDK(advertisingId, isLimitAdTrackingEnabled, advertisingIdWithGps, gaidError);
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AFa1tSDK)) {
                return false;
            }
            AFa1tSDK aFa1tSDK = (AFa1tSDK) other;
            return Intrinsics.a(this.advertisingId, aFa1tSDK.advertisingId) && Intrinsics.a(this.isLimitAdTrackingEnabled, aFa1tSDK.isLimitAdTrackingEnabled) && this.advertisingIdWithGps == aFa1tSDK.advertisingIdWithGps && Intrinsics.a(this.gaidError, aFa1tSDK.gaidError);
        }

        @Nullable
        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        public final boolean getAdvertisingIdWithGps() {
            return this.advertisingIdWithGps;
        }

        @NotNull
        public final StringBuilder getGaidError() {
            return this.gaidError;
        }

        public final int hashCode() {
            String str = this.advertisingId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.isLimitAdTrackingEnabled;
            return this.gaidError.hashCode() + C2983be.a((iHashCode + (bool != null ? bool.hashCode() : 0)) * 31, this.advertisingIdWithGps, 31);
        }

        @Nullable
        public final Boolean isLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        public final void setAdvertisingId(@Nullable String str) {
            this.advertisingId = str;
        }

        public final void setAdvertisingIdWithGps(boolean z) {
            this.advertisingIdWithGps = z;
        }

        public final void setLimitAdTrackingEnabled(@Nullable Boolean bool) {
            this.isLimitAdTrackingEnabled = bool;
        }

        @NotNull
        public final String toString() {
            return "FetchGaidData(advertisingId=" + this.advertisingId + ", isLimitAdTrackingEnabled=" + this.isLimitAdTrackingEnabled + ", advertisingIdWithGps=" + this.advertisingIdWithGps + ", gaidError=" + ((Object) this.gaidError) + ")";
        }

        public AFa1tSDK(@Nullable String str, @Nullable Boolean bool, boolean z, @NotNull StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            this.advertisingId = str;
            this.isLimitAdTrackingEnabled = bool;
            this.advertisingIdWithGps = z;
            this.gaidError = gaidError;
        }

        public /* synthetic */ AFa1tSDK(String str, Boolean bool, boolean z, StringBuilder sb, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? false : z, (i & 8) != 0 ? new StringBuilder() : sb);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bH\u0016¨\u0006\t"}, d2 = {"com/appsflyer/internal/components/queue/tasks/FetchAdvertisingIdTask$fetchGaidUsingSamsungSdk$1", "Lcom/samsung/android/game/cloudgame/dev/sdk/CloudDevCallback;", "onError", "", "reason", "", "onSuccess", "kinds", "", "sdk_main_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AFa1zSDK implements CloudDevCallback {
        final /* synthetic */ AFa1tSDK $fetchGaidData;
        final /* synthetic */ CountDownLatch $latch;

        public AFa1zSDK(AFa1tSDK aFa1tSDK, CountDownLatch countDownLatch) {
            this.$fetchGaidData = aFa1tSDK;
            this.$latch = countDownLatch;
        }

        public final void onError(String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            AFLoggerBase.w$default(AFLogger.INSTANCE, LogTag.ADVERTISING_ID, C5491nL.c("Could not fetch GAID using CloudDevSdk: ", reason), false, 4, null);
            StringBuilder gaidError = this.$fetchGaidData.getGaidError();
            gaidError.append(reason);
            gaidError.append(" |");
            this.$latch.countDown();
        }

        public final void onSuccess(Map<String, String> kinds) {
            Intrinsics.checkNotNullParameter(kinds, "kinds");
            AFLoggerBase.v$default(AFLogger.INSTANCE, LogTag.ADVERTISING_ID, "CloudDevCallback received onSuccess", false, 4, null);
            this.$fetchGaidData.setAdvertisingId(kinds.get("gaid"));
            this.$latch.countDown();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1iSDK(@NotNull AFc1bSDK aFc1bSDK) {
        super(AFd1bSDK.FETCH_ADVERTISING_ID, new AFe1zSDK[0], "FetchAdvertisingIdTask");
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        AFd1zSDK aFd1zSDKValueOf = aFc1bSDK.valueOf();
        Intrinsics.checkNotNullExpressionValue(aFd1zSDKValueOf, "");
        this.registerClient = aFd1zSDKValueOf;
        AFc1iSDK aFc1iSDKAFLogger = aFc1bSDK.AFLogger();
        Intrinsics.checkNotNullExpressionValue(aFc1iSDKAFLogger, "");
        this.AFLogger = aFc1iSDKAFLogger;
        AFc1eSDK androidIdData = aFc1bSDK.setAndroidIdData();
        Intrinsics.checkNotNullExpressionValue(androidIdData, "");
        this.d = androidIdData;
        this.unregisterClient = new AFh1qSDK(null, null, null, null, null, null, null, null, 255, null);
        this.AFKeystoreWrapper = XO0.b(new Q2(this, 11));
        this.i = XO0.b(new C6399rg(this, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(AFe1iSDK aFe1iSDK) {
        return Boolean.parseBoolean(aFe1iSDK.AFLogger.AFLogger("com.appsflyer.enable_instant_plays"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long registerClient(AFe1iSDK aFe1iSDK) {
        Long lC0;
        String strAFLogger = aFe1iSDK.AFLogger.AFLogger("com.appsflyer.fetch_ids.timeout");
        if (strAFLogger == null || (lC0 = StringsKt.c0(strAFLogger)) == null) {
            return 1000L;
        }
        return lC0.longValue();
    }

    @Override // com.appsflyer.internal.AFe1ySDK
    public final boolean AFLogger() {
        return false;
    }

    private final boolean AFLogger(int p0) {
        String str;
        AFLogger aFLogger = AFLogger.INSTANCE;
        LogTag logTag = LogTag.ADVERTISING_ID;
        AFLoggerBase.i$default(aFLogger, logTag, "Trying to fetch GAID using Samsung Cloud Dev...", false, 4, null);
        if (e()) {
            CloudDevSdk cloudDevSdk = CloudDevSdk.INSTANCE;
            Context context = this.registerClient.d;
            Intrinsics.checkNotNull(context);
            if (cloudDevSdk.isCloudEnvironment(context)) {
                AFa1tSDK aFa1tSDK = new AFa1tSDK(null, null, false, null, 15, null);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                try {
                    CloudDevSdk cloudDevSdk2 = CloudDevSdk.INSTANCE;
                    Context context2 = this.registerClient.d;
                    Intrinsics.checkNotNull(context2);
                    cloudDevSdk2.request(context2, VE.c("gaid"), new AFa1zSDK(aFa1tSDK, countDownLatch));
                    countDownLatch.await(((Number) this.AFKeystoreWrapper.getValue()).longValue(), TimeUnit.MILLISECONDS);
                    if (aFa1tSDK.getGaidError().length() > 0) {
                        d(this.unregisterClient, aFa1tSDK.getGaidError().toString());
                    }
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            str = "Fetch GAID using Samsung Cloud Dev interrupted or reached to timeout";
                        } else if (th instanceof ClassNotFoundException) {
                            str = "CloudDevSdk not found";
                        } else {
                            str = "Unexpected exception while fetching GAID using Samsung Cloud Dev " + th.getMessage();
                        }
                        AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.ADVERTISING_ID, str, th, true, false, false, false, 112, null);
                        StringBuilder gaidError = aFa1tSDK.getGaidError();
                        gaidError.append(th.getClass().getSimpleName());
                        gaidError.append(" |");
                        if (aFa1tSDK.getGaidError().length() > 0) {
                        }
                    } catch (Throwable th2) {
                        if (aFa1tSDK.getGaidError().length() > 0) {
                            d(this.unregisterClient, aFa1tSDK.getGaidError().toString());
                        }
                        throw th2;
                    }
                }
                String advertisingId = aFa1tSDK.getAdvertisingId();
                if (advertisingId == null || advertisingId.length() == 0) {
                    return false;
                }
                AFh1qSDK aFh1qSDK = this.unregisterClient;
                aFh1qSDK.d = aFa1tSDK.getAdvertisingId();
                Boolean bool = Boolean.FALSE;
                aFh1qSDK.registerClient = bool;
                Boolean bool2 = Boolean.TRUE;
                aFh1qSDK.unregisterClient = bool2;
                aFh1qSDK.AFLogger = bool;
                aFh1qSDK.AFKeystoreWrapper = bool2;
                aFh1qSDK.i = Boolean.valueOf(p0 != 2);
                return true;
            }
        }
        AFLoggerBase.i$default(aFLogger, logTag, "Not running in Samsung Cloud Environment. Try using GMS...", false, 4, null);
        return false;
    }

    private static int d(Context p0) {
        try {
            return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(p0);
        } catch (Throwable th) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.ADVERTISING_ID, "isGooglePlayServicesAvailable error", th, false, false, false, false, 96, null);
            return -1;
        }
    }

    private static boolean e() {
        try {
            Class.forName("com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk");
            return true;
        } catch (Throwable th) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.ADVERTISING_ID, th instanceof ClassNotFoundException ? "CloudDevSdk not found" : C5491nL.c("Unexpected exception while checking if running in cloud environment: ", th.getMessage()), th, true, false, false, false, 112, null);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:43:0x010d  */
    /* JADX WARN: Code duplicated, block: B:44:0x010f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0134 A[LOOP:0: B:7:0x001f->B:50:0x0134, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0138 A[EDGE_INSN: B:58:0x0138->B:51:0x0138 BREAK  A[LOOP:0: B:7:0x001f->B:50:0x0134], SYNTHETIC] */
    @Override // com.appsflyer.internal.AFe1ySDK
    @NotNull
    public final AFd1cSDK registerClient() {
        Boolean boolIsLimitAdTrackingEnabled;
        Boolean boolValueOf;
        boolean z;
        boolean z2;
        boolean z3;
        if (this.d.setAndroidIdData) {
            AFLoggerBase.v$default(AFLogger.INSTANCE, LogTag.ADVERTISING_ID, "QUEUE: Advertising ID collection is disabled. Skipping fetching... ", false, 4, null);
            return AFd1cSDK.FAILURE;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z4 = false;
        for (int i = 2; i > 0; i--) {
            if (((Boolean) this.i.getValue()).booleanValue() && AFLogger(i)) {
                AFLoggerBase.v$default(AFLogger.INSTANCE, LogTag.ADVERTISING_ID, "GAID fetched using Samsung Cloud dev SDK", false, 4, null);
            } else {
                AFLogger aFLogger = AFLogger.INSTANCE;
                LogTag logTag = LogTag.ADVERTISING_ID;
                AFLoggerBase.i$default(aFLogger, logTag, "Trying to fetch GAID...", false, 4, null);
                AFa1tSDK aFa1tSDK = new AFa1tSDK(null, null, false, null, 15, null);
                Context context = this.registerClient.d;
                Intrinsics.checkNotNull(context);
                int iD = d(context);
                Context context2 = this.registerClient.d;
                Intrinsics.checkNotNull(context2);
                if (registerClient(context2, aFa1tSDK)) {
                    AFh1qSDK aFh1qSDK = this.unregisterClient;
                    aFh1qSDK.d = aFa1tSDK.getAdvertisingId();
                    aFh1qSDK.registerClient = aFa1tSDK.isLimitAdTrackingEnabled();
                    boolIsLimitAdTrackingEnabled = aFa1tSDK.isLimitAdTrackingEnabled();
                    if (boolIsLimitAdTrackingEnabled != null) {
                        boolValueOf = Boolean.valueOf(!boolIsLimitAdTrackingEnabled.booleanValue());
                    } else {
                        boolValueOf = null;
                    }
                    aFh1qSDK.unregisterClient = boolValueOf;
                    aFh1qSDK.AFLogger = Boolean.valueOf(aFa1tSDK.getAdvertisingIdWithGps());
                    aFh1qSDK.AFKeystoreWrapper = Boolean.FALSE;
                    if (i != 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aFh1qSDK.i = Boolean.valueOf(z);
                    z2 = true;
                } else {
                    String strAFLogger = this.AFLogger.AFLogger("AF_ENABLE_GP_SERVICE_FALLBACK");
                    if (strAFLogger != null ? Boolean.parseBoolean(strAFLogger) : true) {
                        Context context3 = this.registerClient.d;
                        Intrinsics.checkNotNull(context3);
                        if (d(context3, aFa1tSDK)) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    } else {
                        z3 = false;
                    }
                    String string = aFa1tSDK.getGaidError().toString();
                    if (!(string == null || StringsKt.I(string))) {
                        string = iD + ": " + StringsKt.d0(string).toString();
                    }
                    d(this.unregisterClient, string);
                    if (z3) {
                        AFh1qSDK aFh1qSDK2 = this.unregisterClient;
                        aFh1qSDK2.d = aFa1tSDK.getAdvertisingId();
                        aFh1qSDK2.registerClient = aFa1tSDK.isLimitAdTrackingEnabled();
                        boolIsLimitAdTrackingEnabled = aFa1tSDK.isLimitAdTrackingEnabled();
                        if (boolIsLimitAdTrackingEnabled != null) {
                            boolValueOf = Boolean.valueOf(!boolIsLimitAdTrackingEnabled.booleanValue());
                        } else {
                            boolValueOf = null;
                        }
                        aFh1qSDK2.unregisterClient = boolValueOf;
                        aFh1qSDK2.AFLogger = Boolean.valueOf(aFa1tSDK.getAdvertisingIdWithGps());
                        aFh1qSDK2.AFKeystoreWrapper = Boolean.FALSE;
                        if (i != 2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        aFh1qSDK2.i = Boolean.valueOf(z);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    AFLoggerBase.v$default(aFLogger, logTag, "GAID fetched using GMS", false, 4, null);
                } else {
                    AFLoggerBase.v$default(aFLogger, logTag, "Failed to fetch GAID", false, 4, null);
                    z4 = false;
                }
                if (!z4) {
                    break;
                }
            }
            z4 = true;
            if (!z4) {
                break;
                break;
            }
        }
        this.d.updateServerUninstallToken = this.unregisterClient;
        Boolean boolValueOf2 = Boolean.valueOf(z4);
        Boolean bool = Boolean.FALSE;
        AFd1cSDK aFd1cSDK = WE.f(boolValueOf2, bool, bool).contains(Boolean.TRUE) ? AFd1cSDK.SUCCESS : AFd1cSDK.FAILURE;
        AFc1eSDK aFc1eSDK = this.d;
        AFd1nSDK aFd1nSDK = new AFd1nSDK(System.currentTimeMillis() - jCurrentTimeMillis);
        AFLoggerBase.v$default(AFLogger.INSTANCE, LogTag.ADVERTISING_ID, "QUEUE: FetchAdvertisingIdTask: took " + aFd1nSDK.registerClient + "ms", false, 4, null);
        aFc1eSDK.registerClient(aFd1nSDK);
        return aFd1cSDK;
    }

    private static boolean d(Context p0, AFa1tSDK p1) {
        try {
            AFb1kSDK.AFa1tSDK aFa1tSDKRegisterClient = AFb1kSDK.registerClient(p0);
            p1.setAdvertisingId(aFa1tSDKRegisterClient.d);
            p1.setLimitAdTrackingEnabled(Boolean.valueOf(aFa1tSDKRegisterClient.AFLogger));
            String advertisingId = p1.getAdvertisingId();
            if (advertisingId != null && advertisingId.length() != 0) {
                return true;
            }
            p1.getGaidError().append("emptyOrNull (bypass) |");
            return true;
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.ADVERTISING_ID;
            AFLoggerBase.e$default(aFLogger, logTag, C5491nL.c("Failed to fetch GAID: ", th.getMessage()), th, true, false, false, false, 64, null);
            StringBuilder gaidError = p1.getGaidError();
            gaidError.append(th.getClass().getSimpleName());
            gaidError.append(" |");
            String localizedMessage = th.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = th.toString();
            }
            AFLoggerBase.i$default(aFLogger, logTag, localizedMessage, false, 4, null);
            return false;
        }
    }

    private static void d(AFh1qSDK aFh1qSDK, String str) {
        String strB;
        if (str == null) {
            return;
        }
        String str2 = aFh1qSDK.v;
        if (str2 != null && (strB = C2629a1.b(str2, " | ", str)) != null) {
            str = strB;
        }
        aFh1qSDK.v = str;
    }

    @Override // com.appsflyer.internal.AFe1ySDK
    public final /* synthetic */ long d() {
        return ((Number) this.AFKeystoreWrapper.getValue()).longValue();
    }

    private final boolean registerClient(Context p0, AFa1tSDK p1) {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(p0);
            if (advertisingIdInfo != null) {
                p1.setAdvertisingId(advertisingIdInfo.getId());
                p1.setLimitAdTrackingEnabled(Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled()));
                p1.setAdvertisingIdWithGps(true);
                String advertisingId = p1.getAdvertisingId();
                if (advertisingId == null || advertisingId.length() == 0) {
                    p1.getGaidError().append("emptyOrNull |");
                }
                return true;
            }
            p1.getGaidError().append("gpsAdInfo-null |");
            throw new IllegalStateException("GpsAdIndo is null");
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.ADVERTISING_ID;
            AFLoggerBase.e$default(aFLogger, logTag, C5491nL.c("Google Play Services is missing ", th.getMessage()), th, false, false, false, false, 88, null);
            StringBuilder gaidError = p1.getGaidError();
            gaidError.append(th.getClass().getSimpleName());
            gaidError.append(" |");
            AFLoggerBase.i$default(aFLogger, logTag, "WARNING: Google Play Services is missing.", false, 4, null);
            return false;
        }
    }
}
