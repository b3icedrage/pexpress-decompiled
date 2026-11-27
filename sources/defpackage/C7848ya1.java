package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: ya1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0000\u0018\u0000 +2\u00020\u0001:\u0001,B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u001bR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\n\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b'\u0010&R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lya1;", "Lhu0;", "LQz0;", C7848ya1.SESSION, "Lorg/json/JSONArray;", "notificationIds", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", C7848ya1.TIMESTAMP, "sessionTime", "", C7848ya1.WEIGHT, "<init>", "(LQz0;Lorg/json/JSONArray;Ljava/lang/String;JJF)V", "Lorg/json/JSONObject;", "toJSONObject", "()Lorg/json/JSONObject;", "", R51.PUSH_MINIFIED_BUTTONS_LIST, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "LQz0;", "getSession", "()LQz0;", "Lorg/json/JSONArray;", "getNotificationIds", "()Lorg/json/JSONArray;", "Ljava/lang/String;", "getName", "J", "getTimestamp", "()J", "getSessionTime", "F", "getWeight", "()F", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C7848ya1 implements InterfaceC4299hu0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String NOTIFICATION_IDS = "notification_ids";

    @NotNull
    private static final String OUTCOME_ID = "id";

    @NotNull
    private static final String SESSION = "session";

    @NotNull
    private static final String SESSION_TIME = "session_time";

    @NotNull
    private static final String TIMESTAMP = "timestamp";

    @NotNull
    private static final String WEIGHT = "weight";

    @NotNull
    private final String name;

    @Nullable
    private final JSONArray notificationIds;

    @NotNull
    private final EnumC1890Qz0 session;
    private final long sessionTime;
    private final long timestamp;
    private final float weight;

    /* JADX INFO: renamed from: ya1$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000b¨\u0006\u0011"}, d2 = {"Lya1$a;", "", "<init>", "()V", "Lza1;", "outcomeEventParams", "Lya1;", "fromOutcomeEventParamstoOutcomeEvent", "(Lza1;)Lya1;", "", "NOTIFICATION_IDS", "Ljava/lang/String;", "OUTCOME_ID", "SESSION", "SESSION_TIME", "TIMESTAMP", "WEIGHT", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0048  */
        /* JADX WARN: Code duplicated, block: B:14:0x004e  */
        /* JADX WARN: Code duplicated, block: B:16:0x005b  */
        /* JADX WARN: Code duplicated, block: B:18:0x006f  */
        /* JADX WARN: Code duplicated, block: B:19:0x007d  */
        @NotNull
        public final C7848ya1 fromOutcomeEventParamstoOutcomeEvent(@NotNull C8058za1 outcomeEventParams) {
            JSONArray notificationIds;
            C0956Fa1 indirectBody;
            JSONArray notificationIds2;
            Intrinsics.checkNotNullParameter(outcomeEventParams, "outcomeEventParams");
            EnumC1890Qz0 enumC1890Qz0 = EnumC1890Qz0.UNATTRIBUTED;
            if (outcomeEventParams.getOutcomeSource() != null) {
                C0878Ea1 outcomeSource = outcomeEventParams.getOutcomeSource();
                if (outcomeSource.getDirectBody() != null) {
                    C0956Fa1 directBody = outcomeSource.getDirectBody();
                    Intrinsics.checkNotNull(directBody);
                    if (directBody.getNotificationIds() != null) {
                        C0956Fa1 directBody2 = outcomeSource.getDirectBody();
                        Intrinsics.checkNotNull(directBody2);
                        JSONArray notificationIds3 = directBody2.getNotificationIds();
                        Intrinsics.checkNotNull(notificationIds3);
                        if (notificationIds3.length() > 0) {
                            enumC1890Qz0 = EnumC1890Qz0.DIRECT;
                            C0956Fa1 directBody3 = outcomeSource.getDirectBody();
                            Intrinsics.checkNotNull(directBody3);
                            notificationIds = directBody3.getNotificationIds();
                        } else if (outcomeSource.getIndirectBody() != null) {
                            indirectBody = outcomeSource.getIndirectBody();
                            Intrinsics.checkNotNull(indirectBody);
                            if (indirectBody.getNotificationIds() != null) {
                                C0956Fa1 indirectBody2 = outcomeSource.getIndirectBody();
                                Intrinsics.checkNotNull(indirectBody2);
                                notificationIds2 = indirectBody2.getNotificationIds();
                                Intrinsics.checkNotNull(notificationIds2);
                                if (notificationIds2.length() > 0) {
                                    enumC1890Qz0 = EnumC1890Qz0.INDIRECT;
                                    C0956Fa1 indirectBody3 = outcomeSource.getIndirectBody();
                                    Intrinsics.checkNotNull(indirectBody3);
                                    notificationIds = indirectBody3.getNotificationIds();
                                } else {
                                    notificationIds = null;
                                }
                            } else {
                                notificationIds = null;
                            }
                        } else {
                            notificationIds = null;
                        }
                    } else if (outcomeSource.getIndirectBody() != null) {
                        indirectBody = outcomeSource.getIndirectBody();
                        Intrinsics.checkNotNull(indirectBody);
                        if (indirectBody.getNotificationIds() != null) {
                            C0956Fa1 indirectBody4 = outcomeSource.getIndirectBody();
                            Intrinsics.checkNotNull(indirectBody4);
                            notificationIds2 = indirectBody4.getNotificationIds();
                            Intrinsics.checkNotNull(notificationIds2);
                            if (notificationIds2.length() > 0) {
                                enumC1890Qz0 = EnumC1890Qz0.INDIRECT;
                                C0956Fa1 indirectBody5 = outcomeSource.getIndirectBody();
                                Intrinsics.checkNotNull(indirectBody5);
                                notificationIds = indirectBody5.getNotificationIds();
                            } else {
                                notificationIds = null;
                            }
                        } else {
                            notificationIds = null;
                        }
                    } else {
                        notificationIds = null;
                    }
                } else if (outcomeSource.getIndirectBody() != null) {
                    indirectBody = outcomeSource.getIndirectBody();
                    Intrinsics.checkNotNull(indirectBody);
                    if (indirectBody.getNotificationIds() != null) {
                        C0956Fa1 indirectBody6 = outcomeSource.getIndirectBody();
                        Intrinsics.checkNotNull(indirectBody6);
                        notificationIds2 = indirectBody6.getNotificationIds();
                        Intrinsics.checkNotNull(notificationIds2);
                        if (notificationIds2.length() > 0) {
                            enumC1890Qz0 = EnumC1890Qz0.INDIRECT;
                            C0956Fa1 indirectBody7 = outcomeSource.getIndirectBody();
                            Intrinsics.checkNotNull(indirectBody7);
                            notificationIds = indirectBody7.getNotificationIds();
                        } else {
                            notificationIds = null;
                        }
                    } else {
                        notificationIds = null;
                    }
                } else {
                    notificationIds = null;
                }
            } else {
                notificationIds = null;
            }
            return new C7848ya1(enumC1890Qz0, notificationIds, outcomeEventParams.getOutcomeId(), outcomeEventParams.getTimestamp(), outcomeEventParams.getSessionTime(), outcomeEventParams.getWeight());
        }

        private Companion() {
        }
    }

    public C7848ya1(@NotNull EnumC1890Qz0 session, @Nullable JSONArray jSONArray, @NotNull String name, long j, long j2, float f) {
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(name, "name");
        this.session = session;
        this.notificationIds = jSONArray;
        this.name = name;
        this.timestamp = j;
        this.sessionTime = j2;
        this.weight = f;
    }

    public boolean equals(@Nullable Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && C7848ya1.class.equals(o.getClass())) {
            C7848ya1 c7848ya1 = (C7848ya1) o;
            if (getSession() == c7848ya1.getSession() && Intrinsics.a(getNotificationIds(), c7848ya1.getNotificationIds()) && Intrinsics.a(getName(), c7848ya1.getName()) && getTimestamp() == c7848ya1.getTimestamp() && getSessionTime() == c7848ya1.getSessionTime() && getWeight() == c7848ya1.getWeight()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC4299hu0
    @NotNull
    public String getName() {
        return this.name;
    }

    @Override // defpackage.InterfaceC4299hu0
    @Nullable
    public JSONArray getNotificationIds() {
        return this.notificationIds;
    }

    @Override // defpackage.InterfaceC4299hu0
    @NotNull
    public EnumC1890Qz0 getSession() {
        return this.session;
    }

    @Override // defpackage.InterfaceC4299hu0
    public long getSessionTime() {
        return this.sessionTime;
    }

    @Override // defpackage.InterfaceC4299hu0
    public long getTimestamp() {
        return this.timestamp;
    }

    @Override // defpackage.InterfaceC4299hu0
    public float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        Object[] objArr = {getSession(), getNotificationIds(), getName(), Long.valueOf(getTimestamp()), Long.valueOf(getSessionTime()), Float.valueOf(getWeight())};
        int iHashCode = 1;
        for (int i = 0; i < 6; i++) {
            Object obj = objArr[i];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @NotNull
    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(SESSION, getSession());
        jSONObject.put("notification_ids", getNotificationIds());
        jSONObject.put(OUTCOME_ID, getName());
        jSONObject.put(TIMESTAMP, getTimestamp());
        jSONObject.put(SESSION_TIME, getSessionTime());
        jSONObject.put(WEIGHT, Float.valueOf(getWeight()));
        return jSONObject;
    }

    @NotNull
    public String toString() {
        return "OutcomeEvent{session=" + getSession() + ", notificationIds=" + getNotificationIds() + ", name='" + getName() + "', timestamp=" + getTimestamp() + ", sessionTime=" + getSessionTime() + ", weight=" + getWeight() + '}';
    }
}
