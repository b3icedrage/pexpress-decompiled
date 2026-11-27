package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* JADX INFO: renamed from: bc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b4\u0018\u00002\u00020\u0001B³\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001e\u001a\u0004\b*\u0010 \"\u0004\b+\u0010\"R$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001e\u001a\u0004\b,\u0010 \"\u0004\b-\u0010\"R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b.\u0010 \"\u0004\b/\u0010\"R$\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001e\u001a\u0004\b0\u0010 \"\u0004\b1\u0010\"R$\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001e\u001a\u0004\b2\u0010 \"\u0004\b3\u0010\"R$\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b4\u0010 \"\u0004\b5\u0010\"R$\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b6\u0010 \"\u0004\b7\u0010\"R$\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b8\u0010 \"\u0004\b9\u0010\"R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H¨\u0006I"}, d2 = {"Lbc1;", "", "", "googleProjectNumber", "", "enterprise", "useIdentityVerification", "Lorg/json/JSONArray;", "notificationChannels", "firebaseAnalytics", "restoreTTLFilter", "clearGroupOnSummaryClick", "receiveReceiptEnabled", "disableGMSMissingPrompt", "unsubscribeWhenNotificationsDisabled", "locationShared", "requiresUserPrivacyConsent", "", "opRepoExecutionInterval", "LPz0;", "influenceParams", "Lab0;", "fcmParams", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lorg/json/JSONArray;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;LPz0;Lab0;)V", "Ljava/lang/String;", "getGoogleProjectNumber", "()Ljava/lang/String;", "setGoogleProjectNumber", "(Ljava/lang/String;)V", "Ljava/lang/Boolean;", "getEnterprise", "()Ljava/lang/Boolean;", "setEnterprise", "(Ljava/lang/Boolean;)V", "getUseIdentityVerification", "setUseIdentityVerification", "Lorg/json/JSONArray;", "getNotificationChannels", "()Lorg/json/JSONArray;", "setNotificationChannels", "(Lorg/json/JSONArray;)V", "getFirebaseAnalytics", "setFirebaseAnalytics", "getRestoreTTLFilter", "setRestoreTTLFilter", "getClearGroupOnSummaryClick", "setClearGroupOnSummaryClick", "getReceiveReceiptEnabled", "setReceiveReceiptEnabled", "getDisableGMSMissingPrompt", "setDisableGMSMissingPrompt", "getUnsubscribeWhenNotificationsDisabled", "setUnsubscribeWhenNotificationsDisabled", "getLocationShared", "setLocationShared", "getRequiresUserPrivacyConsent", "setRequiresUserPrivacyConsent", "Ljava/lang/Long;", "getOpRepoExecutionInterval", "()Ljava/lang/Long;", "setOpRepoExecutionInterval", "(Ljava/lang/Long;)V", "LPz0;", "getInfluenceParams", "()LPz0;", "setInfluenceParams", "(LPz0;)V", "Lab0;", "getFcmParams", "()Lab0;", "setFcmParams", "(Lab0;)V", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C2977bc1 {

    @Nullable
    private Boolean clearGroupOnSummaryClick;

    @Nullable
    private Boolean disableGMSMissingPrompt;

    @Nullable
    private Boolean enterprise;

    @NotNull
    private C2748ab0 fcmParams;

    @Nullable
    private Boolean firebaseAnalytics;

    @Nullable
    private String googleProjectNumber;

    @NotNull
    private C1812Pz0 influenceParams;

    @Nullable
    private Boolean locationShared;

    @Nullable
    private JSONArray notificationChannels;

    @Nullable
    private Long opRepoExecutionInterval;

    @Nullable
    private Boolean receiveReceiptEnabled;

    @Nullable
    private Boolean requiresUserPrivacyConsent;

    @Nullable
    private Boolean restoreTTLFilter;

    @Nullable
    private Boolean unsubscribeWhenNotificationsDisabled;

    @Nullable
    private Boolean useIdentityVerification;

    public C2977bc1(@Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable JSONArray jSONArray, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable Boolean bool6, @Nullable Boolean bool7, @Nullable Boolean bool8, @Nullable Boolean bool9, @Nullable Boolean bool10, @Nullable Long l, @NotNull C1812Pz0 influenceParams, @NotNull C2748ab0 fcmParams) {
        Intrinsics.checkNotNullParameter(influenceParams, "influenceParams");
        Intrinsics.checkNotNullParameter(fcmParams, "fcmParams");
        this.googleProjectNumber = str;
        this.enterprise = bool;
        this.useIdentityVerification = bool2;
        this.notificationChannels = jSONArray;
        this.firebaseAnalytics = bool3;
        this.restoreTTLFilter = bool4;
        this.clearGroupOnSummaryClick = bool5;
        this.receiveReceiptEnabled = bool6;
        this.disableGMSMissingPrompt = bool7;
        this.unsubscribeWhenNotificationsDisabled = bool8;
        this.locationShared = bool9;
        this.requiresUserPrivacyConsent = bool10;
        this.opRepoExecutionInterval = l;
        this.influenceParams = influenceParams;
        this.fcmParams = fcmParams;
    }

    @Nullable
    public final Boolean getClearGroupOnSummaryClick() {
        return this.clearGroupOnSummaryClick;
    }

    @Nullable
    public final Boolean getDisableGMSMissingPrompt() {
        return this.disableGMSMissingPrompt;
    }

    @Nullable
    public final Boolean getEnterprise() {
        return this.enterprise;
    }

    @NotNull
    public final C2748ab0 getFcmParams() {
        return this.fcmParams;
    }

    @Nullable
    public final Boolean getFirebaseAnalytics() {
        return this.firebaseAnalytics;
    }

    @Nullable
    public final String getGoogleProjectNumber() {
        return this.googleProjectNumber;
    }

    @NotNull
    public final C1812Pz0 getInfluenceParams() {
        return this.influenceParams;
    }

    @Nullable
    public final Boolean getLocationShared() {
        return this.locationShared;
    }

    @Nullable
    public final JSONArray getNotificationChannels() {
        return this.notificationChannels;
    }

    @Nullable
    public final Long getOpRepoExecutionInterval() {
        return this.opRepoExecutionInterval;
    }

    @Nullable
    public final Boolean getReceiveReceiptEnabled() {
        return this.receiveReceiptEnabled;
    }

    @Nullable
    public final Boolean getRequiresUserPrivacyConsent() {
        return this.requiresUserPrivacyConsent;
    }

    @Nullable
    public final Boolean getRestoreTTLFilter() {
        return this.restoreTTLFilter;
    }

    @Nullable
    public final Boolean getUnsubscribeWhenNotificationsDisabled() {
        return this.unsubscribeWhenNotificationsDisabled;
    }

    @Nullable
    public final Boolean getUseIdentityVerification() {
        return this.useIdentityVerification;
    }

    public final void setClearGroupOnSummaryClick(@Nullable Boolean bool) {
        this.clearGroupOnSummaryClick = bool;
    }

    public final void setDisableGMSMissingPrompt(@Nullable Boolean bool) {
        this.disableGMSMissingPrompt = bool;
    }

    public final void setEnterprise(@Nullable Boolean bool) {
        this.enterprise = bool;
    }

    public final void setFcmParams(@NotNull C2748ab0 c2748ab0) {
        Intrinsics.checkNotNullParameter(c2748ab0, "<set-?>");
        this.fcmParams = c2748ab0;
    }

    public final void setFirebaseAnalytics(@Nullable Boolean bool) {
        this.firebaseAnalytics = bool;
    }

    public final void setGoogleProjectNumber(@Nullable String str) {
        this.googleProjectNumber = str;
    }

    public final void setInfluenceParams(@NotNull C1812Pz0 c1812Pz0) {
        Intrinsics.checkNotNullParameter(c1812Pz0, "<set-?>");
        this.influenceParams = c1812Pz0;
    }

    public final void setLocationShared(@Nullable Boolean bool) {
        this.locationShared = bool;
    }

    public final void setNotificationChannels(@Nullable JSONArray jSONArray) {
        this.notificationChannels = jSONArray;
    }

    public final void setOpRepoExecutionInterval(@Nullable Long l) {
        this.opRepoExecutionInterval = l;
    }

    public final void setReceiveReceiptEnabled(@Nullable Boolean bool) {
        this.receiveReceiptEnabled = bool;
    }

    public final void setRequiresUserPrivacyConsent(@Nullable Boolean bool) {
        this.requiresUserPrivacyConsent = bool;
    }

    public final void setRestoreTTLFilter(@Nullable Boolean bool) {
        this.restoreTTLFilter = bool;
    }

    public final void setUnsubscribeWhenNotificationsDisabled(@Nullable Boolean bool) {
        this.unsubscribeWhenNotificationsDisabled = bool;
    }

    public final void setUseIdentityVerification(@Nullable Boolean bool) {
        this.useIdentityVerification = bool;
    }

    public /* synthetic */ C2977bc1(String str, Boolean bool, Boolean bool2, JSONArray jSONArray, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Long l, C1812Pz0 c1812Pz0, C2748ab0 c2748ab0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : jSONArray, (i & 16) != 0 ? null : bool3, (i & 32) != 0 ? null : bool4, (i & 64) != 0 ? null : bool5, (i & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : bool6, (i & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : bool7, (i & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : bool8, (i & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : bool9, (i & 2048) != 0 ? null : bool10, (i & 4096) != 0 ? null : l, c1812Pz0, c2748ab0);
    }
}
