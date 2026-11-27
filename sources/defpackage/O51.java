package defpackage;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\bA\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0002\u008a\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u0007J\u000f\u0010\u001f\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001f\u0010\u001cJ\u0017\u0010 \u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0002H\u0002¢\u0006\u0004\b \u0010!R$\u0010\"\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\u0012R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00130'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R*\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u0010\f\u001a\u00020\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u00106\u001a\u0004\u0018\u00010\u00188\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u0010\u001a\"\u0004\b9\u0010:R$\u0010;\u001a\u0004\u0018\u00010\u00188\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b;\u00107\u001a\u0004\b<\u0010\u001a\"\u0004\b=\u0010:R$\u0010>\u001a\u0004\u0018\u00010\u00188\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b>\u00107\u001a\u0004\b?\u0010\u001a\"\u0004\b@\u0010:R$\u0010A\u001a\u0004\u0018\u00010\u00188\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bA\u00107\u001a\u0004\bB\u0010\u001a\"\u0004\bC\u0010:R$\u0010D\u001a\u0004\u0018\u00010\u00188\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bD\u00107\u001a\u0004\bE\u0010\u001a\"\u0004\bF\u0010:R$\u0010G\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010\u0017\"\u0004\bJ\u0010!R$\u0010K\u001a\u0004\u0018\u00010\u00188\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bK\u00107\u001a\u0004\bL\u0010\u001a\"\u0004\bM\u0010:R$\u0010N\u001a\u0004\u0018\u00010\u00188\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bN\u00107\u001a\u0004\bO\u0010\u001a\"\u0004\bP\u0010:R$\u0010Q\u001a\u0004\u0018\u00010\u00188\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bQ\u00107\u001a\u0004\bR\u0010\u001a\"\u0004\bS\u0010:R$\u0010T\u001a\u0004\u0018\u00010\u00188\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bT\u00107\u001a\u0004\bU\u0010\u001a\"\u0004\bV\u0010:R$\u0010W\u001a\u0004\u0018\u00010\u00188\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bW\u00107\u001a\u0004\bX\u0010\u001a\"\u0004\bY\u0010:R$\u0010Z\u001a\u0004\u0018\u00010\u00188\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bZ\u00107\u001a\u0004\b[\u0010\u001a\"\u0004\b\\\u0010:R$\u0010]\u001a\u0004\u0018\u00010\u00188\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b]\u00107\u001a\u0004\b^\u0010\u001a\"\u0004\b_\u0010:R\"\u0010`\u001a\u00020\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b`\u00101\u001a\u0004\ba\u00103\"\u0004\bb\u00105R$\u0010c\u001a\u0004\u0018\u00010\u00188\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bc\u00107\u001a\u0004\bd\u0010\u001a\"\u0004\be\u0010:R$\u0010f\u001a\u0004\u0018\u00010\u00188\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bf\u00107\u001a\u0004\bg\u0010\u001a\"\u0004\bh\u0010:R*\u0010j\u001a\n\u0012\u0004\u0012\u00020i\u0018\u00010\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bj\u0010,\u001a\u0004\bk\u0010.\"\u0004\bl\u00100R$\u0010m\u001a\u0004\u0018\u00010\u00188\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bm\u00107\u001a\u0004\bn\u0010\u001a\"\u0004\bo\u0010:R$\u0010q\u001a\u0004\u0018\u00010p8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR$\u0010w\u001a\u0004\u0018\u00010\u00188\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bw\u00107\u001a\u0004\bx\u0010\u001a\"\u0004\by\u0010:R\"\u0010z\u001a\u00020\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bz\u00101\u001a\u0004\b{\u00103\"\u0004\b|\u00105R&\u0010~\u001a\u00020}8\u0016@\u0016X\u0096\u000e¢\u0006\u0016\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R&\u0010\u0084\u0001\u001a\u00020\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\b\u0084\u0001\u00101\u001a\u0005\b\u0085\u0001\u00103\"\u0005\b\u0086\u0001\u00105R&\u0010\u0087\u0001\u001a\u00020\u00188\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\b\u0087\u0001\u00107\u001a\u0005\b\u0088\u0001\u0010\u001a\"\u0005\b\u0089\u0001\u0010:¨\u0006\u008b\u0001"}, d2 = {"LO51;", "Lxs0;", "Lorg/json/JSONObject;", "payload", "Lgv0;", C1575Mz0.TIME, "<init>", "(Lorg/json/JSONObject;Lgv0;)V", "", "groupedNotifications", "jsonPayload", "", "androidNotificationId", "(Ljava/util/List;Lorg/json/JSONObject;ILgv0;)V", "Lj61;", "extender", "", "setExtender", "(Lj61;)V", "", "hasNotificationId", "()Z", "toJSONObject", "()Lorg/json/JSONObject;", "", "toString", "()Ljava/lang/String;", "display", "()V", "currentJsonPayload", "initPayloadData", "setActionButtonsFromData", "setBackgroundImageLayoutFromData", "(Lorg/json/JSONObject;)V", "notificationExtender", "Lj61;", "getNotificationExtender", "()Lj61;", "setNotificationExtender", "Lzf2;", "displayWaiter", "Lzf2;", "getDisplayWaiter", "()Lzf2;", "Ljava/util/List;", "getGroupedNotifications", "()Ljava/util/List;", "setGroupedNotifications", "(Ljava/util/List;)V", "I", "getAndroidNotificationId", "()I", "setAndroidNotificationId", "(I)V", "notificationId", "Ljava/lang/String;", "getNotificationId", "setNotificationId", "(Ljava/lang/String;)V", "templateName", "getTemplateName", "setTemplateName", "templateId", "getTemplateId", "setTemplateId", "title", "getTitle", "setTitle", "body", "getBody", "setBody", "additionalData", "Lorg/json/JSONObject;", "getAdditionalData", "setAdditionalData", "smallIcon", "getSmallIcon", "setSmallIcon", "largeIcon", "getLargeIcon", "setLargeIcon", "bigPicture", "getBigPicture", "setBigPicture", "smallIconAccentColor", "getSmallIconAccentColor", "setSmallIconAccentColor", "launchURL", "getLaunchURL", "setLaunchURL", "sound", "getSound", "setSound", "ledColor", "getLedColor", "setLedColor", "lockScreenVisibility", "getLockScreenVisibility", "setLockScreenVisibility", "groupKey", "getGroupKey", "setGroupKey", "groupMessage", "getGroupMessage", "setGroupMessage", "LSr0;", "actionButtons", "getActionButtons", "setActionButtons", "fromProjectNumber", "getFromProjectNumber", "setFromProjectNumber", "LJp;", "backgroundImageLayout", "LJp;", "getBackgroundImageLayout", "()LJp;", "setBackgroundImageLayout", "(LJp;)V", "collapseId", "getCollapseId", "setCollapseId", "priority", "getPriority", "setPriority", "", "sentTime", "J", "getSentTime", "()J", "setSentTime", "(J)V", "ttl", "getTtl", "setTtl", "rawPayload", "getRawPayload", "setRawPayload", R51.PUSH_ADDITIONAL_DATA_KEY, "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class O51 implements InterfaceC7704xs0 {

    @Nullable
    private List<? extends InterfaceC2022Sr0> actionButtons;

    @Nullable
    private JSONObject additionalData;
    private int androidNotificationId;

    @Nullable
    private C1311Jp backgroundImageLayout;

    @Nullable
    private String bigPicture;

    @Nullable
    private String body;

    @Nullable
    private String collapseId;

    @NotNull
    private final C8079zf2<Boolean> displayWaiter;

    @Nullable
    private String fromProjectNumber;

    @Nullable
    private String groupKey;

    @Nullable
    private String groupMessage;

    @Nullable
    private List<O51> groupedNotifications;

    @Nullable
    private String largeIcon;

    @Nullable
    private String launchURL;

    @Nullable
    private String ledColor;
    private int lockScreenVisibility;

    @Nullable
    private InterfaceC4601j61 notificationExtender;

    @Nullable
    private String notificationId;
    private int priority;

    @NotNull
    private String rawPayload;
    private long sentTime;

    @Nullable
    private String smallIcon;

    @Nullable
    private String smallIconAccentColor;

    @Nullable
    private String sound;

    @Nullable
    private String templateId;

    @Nullable
    private String templateName;

    @Nullable
    private String title;
    private int ttl;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"LO51$a;", "LSr0;", "", "id", "text", "icon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lorg/json/JSONObject;", "toJSONObject", "()Lorg/json/JSONObject;", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getText", "getIcon", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class a implements InterfaceC2022Sr0 {

        @Nullable
        private final String icon;

        @Nullable
        private final String id;

        @Nullable
        private final String text;

        public a() {
            this(null, null, null, 7, null);
        }

        @Override // defpackage.InterfaceC2022Sr0
        @Nullable
        public String getIcon() {
            return this.icon;
        }

        @Override // defpackage.InterfaceC2022Sr0
        @Nullable
        public String getId() {
            return this.id;
        }

        @Override // defpackage.InterfaceC2022Sr0
        @Nullable
        public String getText() {
            return this.text;
        }

        @NotNull
        public final JSONObject toJSONObject() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", getId());
                jSONObject.put("text", getText());
                jSONObject.put("icon", getIcon());
                return jSONObject;
            } catch (Throwable th) {
                th.printStackTrace();
                return jSONObject;
            }
        }

        public a(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            this.id = str;
            this.text = str2;
            this.icon = str3;
        }

        public /* synthetic */ a(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public O51(@NotNull JSONObject payload, @NotNull InterfaceC4092gv0 time) {
        this(null, payload, 0, time);
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(time, "time");
    }

    private final void initPayloadData(JSONObject currentJsonPayload, InterfaceC4092gv0 time) {
        try {
            JSONObject customJSONObject = C6913u61.INSTANCE.getCustomJSONObject(currentJsonPayload);
            long currentTimeMillis = time.getCurrentTimeMillis();
            if (currentJsonPayload.has("google.ttl")) {
                setSentTime(currentJsonPayload.optLong("google.sent_time", currentTimeMillis) / ((long) CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT));
                setTtl(currentJsonPayload.optInt("google.ttl", 259200));
            } else if (currentJsonPayload.has(D91.HMS_TTL_KEY)) {
                setSentTime(currentJsonPayload.optLong(D91.HMS_SENT_TIME_KEY, currentTimeMillis) / ((long) CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT));
                setTtl(currentJsonPayload.optInt(D91.HMS_TTL_KEY, 259200));
            } else {
                setSentTime(currentTimeMillis / ((long) CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT));
                setTtl(259200);
            }
            setNotificationId(JD0.safeString(customJSONObject, "i"));
            setTemplateId(JD0.safeString(customJSONObject, "ti"));
            setTemplateName(JD0.safeString(customJSONObject, "tn"));
            String string = currentJsonPayload.toString();
            Intrinsics.checkNotNullExpressionValue(string, "currentJsonPayload.toString()");
            setRawPayload(string);
            setAdditionalData(JD0.safeJSONObject(customJSONObject, R51.PUSH_ADDITIONAL_DATA_KEY));
            setLaunchURL(JD0.safeString(customJSONObject, "u"));
            setBody(JD0.safeString(currentJsonPayload, "alert"));
            setTitle(JD0.safeString(currentJsonPayload, "title"));
            setSmallIcon(JD0.safeString(currentJsonPayload, "sicon"));
            setBigPicture(JD0.safeString(currentJsonPayload, "bicon"));
            setLargeIcon(JD0.safeString(currentJsonPayload, "licon"));
            setSound(JD0.safeString(currentJsonPayload, "sound"));
            setGroupKey(JD0.safeString(currentJsonPayload, "grp"));
            setGroupMessage(JD0.safeString(currentJsonPayload, "grp_msg"));
            setSmallIconAccentColor(JD0.safeString(currentJsonPayload, "bgac"));
            setLedColor(JD0.safeString(currentJsonPayload, "ledc"));
            String strSafeString = JD0.safeString(currentJsonPayload, "vis");
            if (strSafeString != null) {
                setLockScreenVisibility(Integer.parseInt(strSafeString));
            }
            setFromProjectNumber(JD0.safeString(currentJsonPayload, "from"));
            setPriority(currentJsonPayload.optInt("pri", 0));
            String strSafeString2 = JD0.safeString(currentJsonPayload, "collapse_key");
            if (!"do_not_collapse".equals(strSafeString2)) {
                setCollapseId(strSafeString2);
            }
            try {
                setActionButtonsFromData();
            } catch (Throwable th) {
                NS0.error("Error assigning OSNotificationReceivedEvent.actionButtons values!", th);
            }
            try {
                setBackgroundImageLayoutFromData(currentJsonPayload);
            } catch (Throwable th2) {
                NS0.error("Error assigning OSNotificationReceivedEvent.backgroundImageLayout values!", th2);
            }
        } catch (Throwable th3) {
            NS0.error("Error assigning OSNotificationReceivedEvent payload values!", th3);
        }
    }

    private final void setActionButtonsFromData() throws JSONException {
        if (getAdditionalData() != null) {
            JSONObject additionalData = getAdditionalData();
            Intrinsics.checkNotNull(additionalData);
            if (additionalData.has("actionButtons")) {
                JSONObject additionalData2 = getAdditionalData();
                Intrinsics.checkNotNull(additionalData2);
                JSONArray jSONArray = additionalData2.getJSONArray("actionButtons");
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jsonActionButton = jSONArray.getJSONObject(i);
                    Intrinsics.checkNotNullExpressionValue(jsonActionButton, "jsonActionButton");
                    arrayList.add(new a(JD0.safeString(jsonActionButton, "id"), JD0.safeString(jsonActionButton, "text"), JD0.safeString(jsonActionButton, "icon")));
                }
                setActionButtons(arrayList);
                JSONObject additionalData3 = getAdditionalData();
                Intrinsics.checkNotNull(additionalData3);
                additionalData3.remove("actionId");
                JSONObject additionalData4 = getAdditionalData();
                Intrinsics.checkNotNull(additionalData4);
                additionalData4.remove("actionButtons");
            }
        }
    }

    private final void setBackgroundImageLayoutFromData(JSONObject currentJsonPayload) {
        String strSafeString = JD0.safeString(currentJsonPayload, "bg_img");
        if (strSafeString != null) {
            JSONObject jSONObject = new JSONObject(strSafeString);
            setBackgroundImageLayout(new C1311Jp(JD0.safeString(jSONObject, "img"), JD0.safeString(jSONObject, "tc"), JD0.safeString(jSONObject, "bc")));
        }
    }

    @Override // defpackage.InterfaceC7704xs0, defpackage.InterfaceC7914ys0
    public void display() {
        this.displayWaiter.wake(Boolean.TRUE);
    }

    @Override // defpackage.InterfaceC7704xs0, defpackage.InterfaceC0622At0, defpackage.InterfaceC0700Bt0
    @Nullable
    public List<InterfaceC2022Sr0> getActionButtons() {
        return this.actionButtons;
    }

    @Override // defpackage.InterfaceC7704xs0, defpackage.InterfaceC0622At0, defpackage.InterfaceC0700Bt0
    @Nullable
    public JSONObject getAdditionalData() {
        return this.additionalData;
    }

    @Override // defpackage.InterfaceC7704xs0, defpackage.InterfaceC0622At0, defpackage.InterfaceC0700Bt0
    public int getAndroidNotificationId() {
        return this.androidNotificationId;
    }

    @Override // defpackage.InterfaceC7704xs0, defpackage.InterfaceC0622At0, defpackage.InterfaceC0700Bt0
    @Nullable
    public C1311Jp getBackgroundImageLayout() {
        return this.backgroundImageLayout;
    }

    @Override // defpackage.InterfaceC7704xs0, defpackage.InterfaceC0622At0, defpackage.InterfaceC0700Bt0
    @Nullable
    public String getBigPicture() {
        return this.bigPicture;
    }

    @Override // defpackage.InterfaceC7704xs0, defpackage.InterfaceC0622At0, defpackage.InterfaceC0700Bt0
    @Nullable
    public String getBody() {
        return this.body;
    }

    @Override // defpackage.InterfaceC7704xs0, defpackage.InterfaceC0622At0, defpackage.InterfaceC0700Bt0
    @Nullable
    public String getCollapseId() {
        return this.collapseId;
    }

    @NotNull
    public final C8079zf2<Boolean> getDisplayWaiter() {
        return this.displayWaiter;
    }

    @Override // defpackage.InterfaceC7704xs0, defpackage.InterfaceC0622At0, defpackage.InterfaceC0700Bt0
    @Nullable
    public String getFromProjectNumber() {
        return this.fromProjectNumber;
    }

    @Override // defpackage.InterfaceC7704xs0, defpackage.InterfaceC0622At0, defpackage.InterfaceC0700Bt0
    @Nullable
    public String getGroupKey() {
        return this.groupKey;
    }

    @Override // defpackage.InterfaceC7704xs0, defpackage.InterfaceC0622At0, defpackage.InterfaceC0700Bt0
    @Nullable
    public String getGroupMessage() {
        return this.groupMessage;
    }

    @Override // defpackage.InterfaceC7704xs0, defpackage.InterfaceC0622At0, defpackage.InterfaceC0700Bt0
    @Nullable
    public List<O51> getGroupedNotifications() {
        return this.groupedNotifications;
    }

    @Override // defpackage.InterfaceC7704xs0, defpackage.InterfaceC0622At0, defpackage.InterfaceC0700Bt0
    @Nullable
    public String getLargeIcon() {
        return this.largeIcon;
    }

    @Override // defpackage.InterfaceC7704xs0, defpackage.InterfaceC0622At0, defpackage.InterfaceC0700Bt0
    @Nullable
    public String getLaunchURL() {
        return this.launchURL;
    }

    @Override // defpackage.InterfaceC7704xs0, defpackage.InterfaceC0622At0, defpackage.InterfaceC0700Bt0
    @Nullable
    public String getLedColor() {
        return this.ledColor;
    }

    @Override // defpackage.InterfaceC7704xs0, defpackage.InterfaceC0622At0, defpackage.InterfaceC0700Bt0
    public int getLockScreenVisibility() {
        return this.lockScreenVisibility;
    }

    @Nullable
    public final InterfaceC4601j61 getNotificationExtender() {
        return null;
    }

    @Override // defpackage.InterfaceC7704xs0, defpackage.InterfaceC0622At0, defpackage.InterfaceC0700Bt0
    @Nullable
    public String getNotificationId() {
        return this.notificationId;
    }

    @Override // defpackage.InterfaceC7704xs0, defpackage.InterfaceC0622At0, defpackage.InterfaceC0700Bt0
    public int getPriority() {
        return this.priority;
    }

    @Override // defpackage.InterfaceC7704xs0, defpackage.InterfaceC0622At0, defpackage.InterfaceC0700Bt0
    @NotNull
    public String getRawPayload() {
        return this.rawPayload;
    }

    @Override // defpackage.InterfaceC7704xs0, defpackage.InterfaceC0622At0, defpackage.InterfaceC0700Bt0
    public long getSentTime() {
        return this.sentTime;
    }

    @Override // defpackage.InterfaceC7704xs0, defpackage.InterfaceC0622At0, defpackage.InterfaceC0700Bt0
    @Nullable
    public String getSmallIcon() {
        return this.smallIcon;
    }

    @Override // defpackage.InterfaceC7704xs0, defpackage.InterfaceC0622At0, defpackage.InterfaceC0700Bt0
    @Nullable
    public String getSmallIconAccentColor() {
        return this.smallIconAccentColor;
    }

    @Override // defpackage.InterfaceC7704xs0, defpackage.InterfaceC0622At0, defpackage.InterfaceC0700Bt0
    @Nullable
    public String getSound() {
        return this.sound;
    }

    @Override // defpackage.InterfaceC7704xs0, defpackage.InterfaceC0622At0, defpackage.InterfaceC0700Bt0
    @Nullable
    public String getTemplateId() {
        return this.templateId;
    }

    @Override // defpackage.InterfaceC7704xs0, defpackage.InterfaceC0622At0, defpackage.InterfaceC0700Bt0
    @Nullable
    public String getTemplateName() {
        return this.templateName;
    }

    @Override // defpackage.InterfaceC7704xs0, defpackage.InterfaceC0622At0, defpackage.InterfaceC0700Bt0
    @Nullable
    public String getTitle() {
        return this.title;
    }

    @Override // defpackage.InterfaceC7704xs0, defpackage.InterfaceC0622At0, defpackage.InterfaceC0700Bt0
    public int getTtl() {
        return this.ttl;
    }

    public final boolean hasNotificationId() {
        return getAndroidNotificationId() != 0;
    }

    public void setActionButtons(@Nullable List<? extends InterfaceC2022Sr0> list) {
        this.actionButtons = list;
    }

    public void setAdditionalData(@Nullable JSONObject jSONObject) {
        this.additionalData = jSONObject;
    }

    public void setAndroidNotificationId(int i) {
        this.androidNotificationId = i;
    }

    public void setBackgroundImageLayout(@Nullable C1311Jp c1311Jp) {
        this.backgroundImageLayout = c1311Jp;
    }

    public void setBigPicture(@Nullable String str) {
        this.bigPicture = str;
    }

    public void setBody(@Nullable String str) {
        this.body = str;
    }

    public void setCollapseId(@Nullable String str) {
        this.collapseId = str;
    }

    public void setFromProjectNumber(@Nullable String str) {
        this.fromProjectNumber = str;
    }

    public void setGroupKey(@Nullable String str) {
        this.groupKey = str;
    }

    public void setGroupMessage(@Nullable String str) {
        this.groupMessage = str;
    }

    public void setGroupedNotifications(@Nullable List<O51> list) {
        this.groupedNotifications = list;
    }

    public void setLargeIcon(@Nullable String str) {
        this.largeIcon = str;
    }

    public void setLaunchURL(@Nullable String str) {
        this.launchURL = str;
    }

    public void setLedColor(@Nullable String str) {
        this.ledColor = str;
    }

    public void setLockScreenVisibility(int i) {
        this.lockScreenVisibility = i;
    }

    public void setNotificationId(@Nullable String str) {
        this.notificationId = str;
    }

    public void setPriority(int i) {
        this.priority = i;
    }

    public void setRawPayload(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rawPayload = str;
    }

    public void setSentTime(long j) {
        this.sentTime = j;
    }

    public void setSmallIcon(@Nullable String str) {
        this.smallIcon = str;
    }

    public void setSmallIconAccentColor(@Nullable String str) {
        this.smallIconAccentColor = str;
    }

    public void setSound(@Nullable String str) {
        this.sound = str;
    }

    public void setTemplateId(@Nullable String str) {
        this.templateId = str;
    }

    public void setTemplateName(@Nullable String str) {
        this.templateName = str;
    }

    public void setTitle(@Nullable String str) {
        this.title = str;
    }

    public void setTtl(int i) {
        this.ttl = i;
    }

    @NotNull
    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("androidNotificationId", getAndroidNotificationId());
            JSONArray jSONArray = new JSONArray();
            if (getGroupedNotifications() != null) {
                List<O51> groupedNotifications = getGroupedNotifications();
                Intrinsics.checkNotNull(groupedNotifications);
                Iterator<O51> it = groupedNotifications.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().toJSONObject());
                }
            }
            jSONObject.put("groupedNotifications", jSONArray);
            jSONObject.put("notificationId", getNotificationId());
            jSONObject.put("templateName", getTemplateName());
            jSONObject.put("templateId", getTemplateId());
            jSONObject.put("title", getTitle());
            jSONObject.put("body", getBody());
            jSONObject.put("smallIcon", getSmallIcon());
            jSONObject.put("largeIcon", getLargeIcon());
            jSONObject.put("bigPicture", getBigPicture());
            jSONObject.put("smallIconAccentColor", getSmallIconAccentColor());
            jSONObject.put("launchURL", getLaunchURL());
            jSONObject.put("sound", getSound());
            jSONObject.put("ledColor", getLedColor());
            jSONObject.put("lockScreenVisibility", getLockScreenVisibility());
            jSONObject.put("groupKey", getGroupKey());
            jSONObject.put("groupMessage", getGroupMessage());
            jSONObject.put("fromProjectNumber", getFromProjectNumber());
            jSONObject.put("collapseId", getCollapseId());
            jSONObject.put("priority", getPriority());
            if (getAdditionalData() != null) {
                jSONObject.put("additionalData", getAdditionalData());
            }
            if (getActionButtons() != null) {
                JSONArray jSONArray2 = new JSONArray();
                List<InterfaceC2022Sr0> actionButtons = getActionButtons();
                Intrinsics.checkNotNull(actionButtons);
                for (InterfaceC2022Sr0 interfaceC2022Sr0 : actionButtons) {
                    Intrinsics.c(interfaceC2022Sr0, "null cannot be cast to non-null type com.onesignal.notifications.internal.Notification.ActionButton");
                    jSONArray2.put(((a) interfaceC2022Sr0).toJSONObject());
                }
                jSONObject.put("actionButtons", jSONArray2);
            }
            jSONObject.put("rawPayload", getRawPayload());
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    @NotNull
    public String toString() {
        return "OSNotification{notificationExtender=null, groupedNotifications=" + getGroupedNotifications() + ", androidNotificationId=" + getAndroidNotificationId() + ", notificationId='" + getNotificationId() + "', templateName='" + getTemplateName() + "', templateId='" + getTemplateId() + "', title='" + getTitle() + "', body='" + getBody() + "', additionalData=" + getAdditionalData() + ", smallIcon='" + getSmallIcon() + "', largeIcon='" + getLargeIcon() + "', bigPicture='" + getBigPicture() + "', smallIconAccentColor='" + getSmallIconAccentColor() + "', launchURL='" + getLaunchURL() + "', sound='" + getSound() + "', ledColor='" + getLedColor() + "', lockScreenVisibility=" + getLockScreenVisibility() + ", groupKey='" + getGroupKey() + "', groupMessage='" + getGroupMessage() + "', actionButtons=" + getActionButtons() + ", fromProjectNumber='" + getFromProjectNumber() + "', backgroundImageLayout=" + getBackgroundImageLayout() + ", collapseId='" + getCollapseId() + "', priority=" + getPriority() + ", rawPayload='" + getRawPayload() + "'}";
    }

    public O51(@Nullable List<O51> list, @NotNull JSONObject jsonPayload, int i, @NotNull InterfaceC4092gv0 time) {
        Intrinsics.checkNotNullParameter(jsonPayload, "jsonPayload");
        Intrinsics.checkNotNullParameter(time, "time");
        this.displayWaiter = new C8079zf2<>();
        this.lockScreenVisibility = 1;
        this.rawPayload = "";
        initPayloadData(jsonPayload, time);
        setGroupedNotifications(list);
        setAndroidNotificationId(i);
    }

    @Override // defpackage.InterfaceC7704xs0, defpackage.InterfaceC0622At0
    public void setExtender(@Nullable InterfaceC4601j61 extender) {
    }

    public final void setNotificationExtender(@Nullable InterfaceC4601j61 interfaceC4601j61) {
    }
}
