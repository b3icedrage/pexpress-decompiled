package defpackage;

import android.net.Uri;
import java.security.SecureRandom;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: r61, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0018\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001e\u0010\u001fR\"\u0010 \u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001d\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u001fR$\u0010#\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010*\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00100\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010+\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/R$\u00104\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010;\u001a\u0004\u0018\u00010:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010A\u001a\u0004\u0018\u00010:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010<\u001a\u0004\bB\u0010>\"\u0004\bC\u0010@R$\u0010D\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u00105\u001a\u0004\bE\u00107\"\u0004\bF\u00109R\u0013\u0010H\u001a\u0004\u0018\u00010)8F¢\u0006\u0006\u001a\u0004\bG\u0010-R\u0013\u0010J\u001a\u0004\u0018\u00010)8F¢\u0006\u0006\u001a\u0004\bI\u0010-R\u0011\u0010L\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bK\u0010\u0015R\u0011\u0010N\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bM\u0010\u0010R\u0011\u0010Q\u001a\u00020:8F¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006R"}, d2 = {"Lr61;", "", "LO51;", "inNotification", "Lorg/json/JSONObject;", "jsonPayload", "<init>", "(LO51;Lorg/json/JSONObject;)V", "Lgv0;", C1575Mz0.TIME, "(Lorg/json/JSONObject;Lgv0;)V", "", "hasExtender", "()Z", "", "toString", "()Ljava/lang/String;", "setAndroidNotificationId", "(LO51;)LO51;", "Lorg/json/JSONObject;", "getJsonPayload", "()Lorg/json/JSONObject;", "setJsonPayload", "(Lorg/json/JSONObject;)V", "notification", "LO51;", "getNotification", "()LO51;", "isRestoring", "Z", "setRestoring", "(Z)V", "isNotificationToDisplay", "setNotificationToDisplay", "", "shownTimeStamp", "Ljava/lang/Long;", "getShownTimeStamp", "()Ljava/lang/Long;", "setShownTimeStamp", "(Ljava/lang/Long;)V", "", "overriddenBodyFromExtender", "Ljava/lang/CharSequence;", "getOverriddenBodyFromExtender", "()Ljava/lang/CharSequence;", "setOverriddenBodyFromExtender", "(Ljava/lang/CharSequence;)V", "overriddenTitleFromExtender", "getOverriddenTitleFromExtender", "setOverriddenTitleFromExtender", "Landroid/net/Uri;", "overriddenSound", "Landroid/net/Uri;", "getOverriddenSound", "()Landroid/net/Uri;", "setOverriddenSound", "(Landroid/net/Uri;)V", "", "overriddenFlags", "Ljava/lang/Integer;", "getOverriddenFlags", "()Ljava/lang/Integer;", "setOverriddenFlags", "(Ljava/lang/Integer;)V", "orgFlags", "getOrgFlags", "setOrgFlags", "orgSound", "getOrgSound", "setOrgSound", "getTitle", "title", "getBody", "body", "getAdditionalData", "additionalData", "getApiNotificationId", "apiNotificationId", "getAndroidId", "()I", "androidId", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C6283r61 {
    private boolean isNotificationToDisplay;
    private boolean isRestoring;

    @NotNull
    private JSONObject jsonPayload;

    @NotNull
    private final O51 notification;

    @Nullable
    private Integer orgFlags;

    @Nullable
    private Uri orgSound;

    @Nullable
    private CharSequence overriddenBodyFromExtender;

    @Nullable
    private Integer overriddenFlags;

    @Nullable
    private Uri overriddenSound;

    @Nullable
    private CharSequence overriddenTitleFromExtender;

    @Nullable
    private Long shownTimeStamp;

    public C6283r61(@NotNull O51 inNotification, @NotNull JSONObject jsonPayload) {
        Intrinsics.checkNotNullParameter(inNotification, "inNotification");
        Intrinsics.checkNotNullParameter(jsonPayload, "jsonPayload");
        this.jsonPayload = jsonPayload;
        this.notification = setAndroidNotificationId(inNotification);
    }

    private final O51 setAndroidNotificationId(O51 o51) {
        if (o51 != null && !o51.hasNotificationId()) {
            o51.setAndroidNotificationId(new SecureRandom().nextInt());
        }
        return o51;
    }

    @NotNull
    public final JSONObject getAdditionalData() {
        O51 o51 = this.notification;
        Intrinsics.checkNotNull(o51);
        JSONObject additionalData = o51.getAdditionalData();
        return additionalData == null ? new JSONObject() : additionalData;
    }

    public final int getAndroidId() {
        O51 o51 = this.notification;
        Intrinsics.checkNotNull(o51);
        return o51.getAndroidNotificationId();
    }

    @NotNull
    public final String getApiNotificationId() {
        String notificationIdFromFCMJson = C6913u61.INSTANCE.getNotificationIdFromFCMJson(this.jsonPayload);
        return notificationIdFromFCMJson == null ? "" : notificationIdFromFCMJson;
    }

    @Nullable
    public final CharSequence getBody() {
        CharSequence charSequence = this.overriddenBodyFromExtender;
        if (charSequence != null) {
            return charSequence;
        }
        O51 o51 = this.notification;
        Intrinsics.checkNotNull(o51);
        return o51.getBody();
    }

    @NotNull
    public final JSONObject getJsonPayload() {
        return this.jsonPayload;
    }

    @NotNull
    public final O51 getNotification() {
        return this.notification;
    }

    @Nullable
    public final Integer getOrgFlags() {
        return this.orgFlags;
    }

    @Nullable
    public final Uri getOrgSound() {
        return this.orgSound;
    }

    @Nullable
    public final CharSequence getOverriddenBodyFromExtender() {
        return this.overriddenBodyFromExtender;
    }

    @Nullable
    public final Integer getOverriddenFlags() {
        return this.overriddenFlags;
    }

    @Nullable
    public final Uri getOverriddenSound() {
        return this.overriddenSound;
    }

    @Nullable
    public final CharSequence getOverriddenTitleFromExtender() {
        return this.overriddenTitleFromExtender;
    }

    @Nullable
    public final Long getShownTimeStamp() {
        return this.shownTimeStamp;
    }

    @Nullable
    public final CharSequence getTitle() {
        CharSequence charSequence = this.overriddenTitleFromExtender;
        if (charSequence != null) {
            return charSequence;
        }
        O51 o51 = this.notification;
        Intrinsics.checkNotNull(o51);
        return o51.getTitle();
    }

    public final boolean hasExtender() {
        O51 o51 = this.notification;
        Intrinsics.checkNotNull(o51);
        o51.getNotificationExtender();
        return false;
    }

    /* JADX INFO: renamed from: isNotificationToDisplay, reason: from getter */
    public final boolean getIsNotificationToDisplay() {
        return this.isNotificationToDisplay;
    }

    /* JADX INFO: renamed from: isRestoring, reason: from getter */
    public final boolean getIsRestoring() {
        return this.isRestoring;
    }

    public final void setJsonPayload(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<set-?>");
        this.jsonPayload = jSONObject;
    }

    public final void setNotificationToDisplay(boolean z) {
        this.isNotificationToDisplay = z;
    }

    public final void setOrgFlags(@Nullable Integer num) {
        this.orgFlags = num;
    }

    public final void setOrgSound(@Nullable Uri uri) {
        this.orgSound = uri;
    }

    public final void setOverriddenBodyFromExtender(@Nullable CharSequence charSequence) {
        this.overriddenBodyFromExtender = charSequence;
    }

    public final void setOverriddenFlags(@Nullable Integer num) {
        this.overriddenFlags = num;
    }

    public final void setOverriddenSound(@Nullable Uri uri) {
        this.overriddenSound = uri;
    }

    public final void setOverriddenTitleFromExtender(@Nullable CharSequence charSequence) {
        this.overriddenTitleFromExtender = charSequence;
    }

    public final void setRestoring(boolean z) {
        this.isRestoring = z;
    }

    public final void setShownTimeStamp(@Nullable Long l) {
        this.shownTimeStamp = l;
    }

    @NotNull
    public String toString() {
        return "NotificationGenerationJob{jsonPayload=" + this.jsonPayload + ", isRestoring=" + this.isRestoring + ", isNotificationToDisplay=" + this.isNotificationToDisplay + ", shownTimeStamp=" + this.shownTimeStamp + ", overriddenBodyFromExtender=" + ((Object) this.overriddenBodyFromExtender) + ", overriddenTitleFromExtender=" + ((Object) this.overriddenTitleFromExtender) + ", overriddenSound=" + this.overriddenSound + ", overriddenFlags=" + this.overriddenFlags + ", orgFlags=" + this.orgFlags + ", orgSound=" + this.orgSound + ", notification=" + this.notification + '}';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6283r61(@NotNull JSONObject jsonPayload, @NotNull InterfaceC4092gv0 time) {
        this(new O51(jsonPayload, time), jsonPayload);
        Intrinsics.checkNotNullParameter(jsonPayload, "jsonPayload");
        Intrinsics.checkNotNullParameter(time, "time");
    }
}
