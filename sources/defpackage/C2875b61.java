package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: b61, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001(B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u001c\u0010%\u001a\n $*\u0004\u0018\u00010#0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lb61;", "LFt0;", "LWr0;", "_applicationService", "Let0;", "_languageContext", "<init>", "(LWr0;Let0;)V", "Landroid/content/Context;", "context", "Landroid/app/NotificationManager;", "notificationManager", "Lorg/json/JSONObject;", "payload", "", "createChannel", "(Landroid/content/Context;Landroid/app/NotificationManager;Lorg/json/JSONObject;)Ljava/lang/String;", "createDefaultChannel", "(Landroid/app/NotificationManager;)Ljava/lang/String;", "createRestoreChannel", "", "priority", "priorityToImportance", "(I)I", "Lr61;", "notificationJob", "createNotificationChannel", "(Lr61;)Ljava/lang/String;", "Lorg/json/JSONArray;", "list", "", "processChannelList", "(Lorg/json/JSONArray;)V", "LWr0;", "Let0;", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "hexPattern", "Ljava/util/regex/Pattern;", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C2875b61 implements InterfaceC1012Ft0 {

    @NotNull
    private static final String CHANNEL_PREFIX = "OS_";

    @NotNull
    private static final String DEFAULT_CHANNEL_ID = "fcm_fallback_notification_channel";

    @NotNull
    private static final String RESTORE_CHANNEL_ID = "restored_OS_notifications";

    @NotNull
    private final InterfaceC2338Wr0 _applicationService;

    @NotNull
    private final InterfaceC3666et0 _languageContext;
    private final Pattern hexPattern;

    public C2875b61(@NotNull InterfaceC2338Wr0 _applicationService, @NotNull InterfaceC3666et0 _languageContext) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_languageContext, "_languageContext");
        this._applicationService = _applicationService;
        this._languageContext = _languageContext;
        this.hexPattern = Pattern.compile("^([A-Fa-f0-9]{8})$");
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0049  */
    private final String createChannel(Context context, NotificationManager notificationManager, JSONObject payload) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObjectOptJSONObject;
        long[] vibrationPattern;
        Object objOpt = payload.opt("chnl");
        if (objOpt instanceof String) {
            jSONObject = new JSONObject((String) objOpt);
        } else {
            Intrinsics.c(objOpt, "null cannot be cast to non-null type org.json.JSONObject");
            jSONObject = (JSONObject) objOpt;
        }
        String channelId = DEFAULT_CHANNEL_ID;
        String strOptString = jSONObject.optString("id", DEFAULT_CHANNEL_ID);
        if (!Intrinsics.a(strOptString, "miscellaneous")) {
            channelId = strOptString;
        }
        if (jSONObject.has("langs")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("langs");
            String language = this._languageContext.getLanguage();
            if (jSONObject2.has(language)) {
                jSONObjectOptJSONObject = jSONObject2.optJSONObject(language);
            } else {
                jSONObjectOptJSONObject = jSONObject;
            }
        } else {
            jSONObjectOptJSONObject = jSONObject;
        }
        Intrinsics.checkNotNull(jSONObjectOptJSONObject);
        String strOptString2 = jSONObjectOptJSONObject.optString("nm", "Miscellaneous");
        int iPriorityToImportance = priorityToImportance(payload.optInt("pri", 6));
        C7282vs.b();
        NotificationChannel notificationChannelA = C4375iG.a(iPriorityToImportance, channelId, strOptString2);
        notificationChannelA.setDescription(jSONObjectOptJSONObject.optString("dscr", null));
        if (jSONObject.has("grp_id")) {
            String strOptString3 = jSONObject.optString("grp_id");
            String strOptString4 = jSONObjectOptJSONObject.optString("grp_nm");
            Intrinsics.checkNotNullExpressionValue(strOptString4, "payloadWithText.optString(\"grp_nm\")");
            notificationManager.createNotificationChannelGroup(C1119Hd.a(strOptString3, strOptString4));
            notificationChannelA.setGroup(strOptString3);
        }
        if (payload.has("ledc")) {
            String strOptString5 = payload.optString("ledc");
            if (!this.hexPattern.matcher(strOptString5).matches()) {
                NS0.warn$default("OneSignal LED Color Settings: ARGB Hex value incorrect format (E.g: FF9900FF)", null, 2, null);
                strOptString5 = "FFFFFFFF";
            }
            try {
                notificationChannelA.setLightColor(new BigInteger(strOptString5, 16).intValue());
            } catch (Throwable th) {
                NS0.error("Couldn't convert ARGB Hex value to BigInteger:", th);
            }
        }
        notificationChannelA.enableLights(payload.optInt("led", 1) == 1);
        if (payload.has("vib_pt") && (vibrationPattern = C6913u61.INSTANCE.parseVibrationPattern(payload)) != null) {
            notificationChannelA.setVibrationPattern(vibrationPattern);
        }
        notificationChannelA.enableVibration(payload.optInt("vib", 1) == 1);
        if (payload.has("sound")) {
            String strOptString6 = payload.optString("sound", null);
            Uri soundUri = C6913u61.INSTANCE.getSoundUri(context, strOptString6);
            if (soundUri != null) {
                notificationChannelA.setSound(soundUri, null);
            } else if ("null".equals(strOptString6) || "nil".equals(strOptString6)) {
                notificationChannelA.setSound(null, null);
            }
        }
        notificationChannelA.setLockscreenVisibility(payload.optInt("vis", 0));
        notificationChannelA.setShowBadge(payload.optInt("bdg", 1) == 1);
        notificationChannelA.setBypassDnd(payload.optInt("bdnd", 0) == 1);
        NS0.verbose$default("Creating notification channel with channel:\n" + notificationChannelA, null, 2, null);
        try {
            notificationManager.createNotificationChannel(notificationChannelA);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        Intrinsics.checkNotNullExpressionValue(channelId, "channelId");
        return channelId;
    }

    private final String createDefaultChannel(NotificationManager notificationManager) {
        C7282vs.b();
        NotificationChannel notificationChannelA = Z51.a();
        notificationChannelA.enableLights(true);
        notificationChannelA.enableVibration(true);
        notificationManager.createNotificationChannel(notificationChannelA);
        return DEFAULT_CHANNEL_ID;
    }

    private final String createRestoreChannel(NotificationManager notificationManager) {
        C7282vs.b();
        notificationManager.createNotificationChannel(Y51.a());
        return RESTORE_CHANNEL_ID;
    }

    private final int priorityToImportance(int priority) {
        if (priority > 9) {
            return 5;
        }
        if (priority > 7) {
            return 4;
        }
        if (priority > 5) {
            return 3;
        }
        if (priority > 3) {
            return 2;
        }
        return priority > 1 ? 1 : 0;
    }

    @Override // defpackage.InterfaceC1012Ft0
    @NotNull
    public String createNotificationChannel(@NotNull C6283r61 notificationJob) {
        Intrinsics.checkNotNullParameter(notificationJob, "notificationJob");
        if (Build.VERSION.SDK_INT < 26) {
            return DEFAULT_CHANNEL_ID;
        }
        Context appContext = this._applicationService.getAppContext();
        JSONObject jsonPayload = notificationJob.getJsonPayload();
        Intrinsics.checkNotNull(jsonPayload);
        NotificationManager notificationManager = C6913u61.INSTANCE.getNotificationManager(appContext);
        if (notificationJob.getIsRestoring()) {
            return createRestoreChannel(notificationManager);
        }
        if (jsonPayload.has("oth_chnl")) {
            String otherChannel = jsonPayload.optString("oth_chnl");
            if (notificationManager.getNotificationChannel(otherChannel) != null) {
                Intrinsics.checkNotNullExpressionValue(otherChannel, "otherChannel");
                return otherChannel;
            }
        }
        if (!jsonPayload.has("chnl")) {
            return createDefaultChannel(notificationManager);
        }
        try {
            return createChannel(appContext, notificationManager, jsonPayload);
        } catch (JSONException e) {
            NS0.error("Could not create notification channel due to JSON payload error!", e);
            return DEFAULT_CHANNEL_ID;
        }
    }

    @Override // defpackage.InterfaceC1012Ft0
    public void processChannelList(@Nullable JSONArray list) {
        if (Build.VERSION.SDK_INT < 26 || list == null || list.length() == 0) {
            return;
        }
        NotificationManager notificationManager = C6913u61.INSTANCE.getNotificationManager(this._applicationService.getAppContext());
        HashSet hashSet = new HashSet();
        int length = list.length();
        for (int i = 0; i < length; i++) {
            try {
                Context appContext = this._applicationService.getAppContext();
                JSONObject jSONObject = list.getJSONObject(i);
                Intrinsics.checkNotNullExpressionValue(jSONObject, "list.getJSONObject(i)");
                hashSet.add(createChannel(appContext, notificationManager, jSONObject));
            } catch (JSONException e) {
                NS0.error("Could not create notification channel due to JSON payload error!", e);
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        List arrayList = new ArrayList();
        try {
            List notificationChannels = notificationManager.getNotificationChannels();
            Intrinsics.checkNotNullExpressionValue(notificationChannels, "notificationManager.notificationChannels");
            arrayList = notificationChannels;
        } catch (NullPointerException e2) {
            NS0.error$default("Error when trying to delete notification channel: " + e2.getMessage(), null, 2, null);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String id = A61.a(it.next()).getId();
            Intrinsics.checkNotNullExpressionValue(id, "id");
            if (d.o(id, CHANNEL_PREFIX, false) && !hashSet.contains(id)) {
                notificationManager.deleteNotificationChannel(id);
            }
        }
    }
}
