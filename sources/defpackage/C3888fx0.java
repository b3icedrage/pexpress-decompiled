package defpackage;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: fx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0000\u0018\u0000 22\u00020\u0001:\u00013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010(\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R\"\u0010+\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u001e\u001a\u0004\b,\u0010 \"\u0004\b-\u0010\"R$\u0010/\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u00158\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b/\u0010\u0017R\u0011\u00101\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b1\u0010\u0017¨\u00064"}, d2 = {"Lfx0;", "", "Lgv0;", "_time", "<init>", "(Lgv0;)V", "", "displayQuantity", "", "lastDisplayTime", C1575Mz0.TIME, "(IJLgv0;)V", "Lorg/json/JSONObject;", "json", "(Lorg/json/JSONObject;Lgv0;)V", "displayStats", "", "setDisplayStats", "(Lfx0;)V", "incrementDisplayQuantity", "()V", "", "shouldDisplayAgain", "()Z", "toJSONObject", "()Lorg/json/JSONObject;", "", "toString", "()Ljava/lang/String;", "Lgv0;", "J", "getLastDisplayTime", "()J", "setLastDisplayTime", "(J)V", "I", "getDisplayQuantity", "()I", "setDisplayQuantity", "(I)V", "displayLimit", "getDisplayLimit", "setDisplayLimit", "displayDelay", "getDisplayDelay", "setDisplayDelay", "<set-?>", "isRedisplayEnabled", "Z", "isDelayTimeSatisfied", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "com.onesignal.inAppMessages"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C3888fx0 {

    @NotNull
    private static final String DISPLAY_DELAY = "delay";

    @NotNull
    private static final String DISPLAY_LIMIT = "limit";

    @NotNull
    private final InterfaceC4092gv0 _time;
    private long displayDelay;
    private int displayLimit;
    private int displayQuantity;
    private boolean isRedisplayEnabled;
    private long lastDisplayTime;

    public C3888fx0(@NotNull InterfaceC4092gv0 _time) {
        Intrinsics.checkNotNullParameter(_time, "_time");
        this._time = _time;
        this.lastDisplayTime = -1L;
        this.displayLimit = 1;
    }

    public final long getDisplayDelay() {
        return this.displayDelay;
    }

    public final int getDisplayLimit() {
        return this.displayLimit;
    }

    public final int getDisplayQuantity() {
        return this.displayQuantity;
    }

    public final long getLastDisplayTime() {
        return this.lastDisplayTime;
    }

    public final void incrementDisplayQuantity() {
        this.displayQuantity++;
    }

    public final boolean isDelayTimeSatisfied() {
        if (this.lastDisplayTime < 0) {
            return true;
        }
        long currentTimeMillis = this._time.getCurrentTimeMillis() / ((long) CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
        long j = currentTimeMillis - this.lastDisplayTime;
        NS0.debug$default("OSInAppMessage lastDisplayTime: " + this.lastDisplayTime + " currentTimeInSeconds: " + currentTimeMillis + " diffInSeconds: " + j + " displayDelay: " + this.displayDelay, null, 2, null);
        return j >= this.displayDelay;
    }

    /* JADX INFO: renamed from: isRedisplayEnabled, reason: from getter */
    public final boolean getIsRedisplayEnabled() {
        return this.isRedisplayEnabled;
    }

    public final void setDisplayDelay(long j) {
        this.displayDelay = j;
    }

    public final void setDisplayLimit(int i) {
        this.displayLimit = i;
    }

    public final void setDisplayQuantity(int i) {
        this.displayQuantity = i;
    }

    public final void setDisplayStats(@NotNull C3888fx0 displayStats) {
        Intrinsics.checkNotNullParameter(displayStats, "displayStats");
        this.lastDisplayTime = displayStats.lastDisplayTime;
        this.displayQuantity = displayStats.displayQuantity;
    }

    public final void setLastDisplayTime(long j) {
        this.lastDisplayTime = j;
    }

    public final boolean shouldDisplayAgain() {
        boolean z = this.displayQuantity < this.displayLimit;
        NS0.debug$default("OSInAppMessage shouldDisplayAgain: " + z, null, 2, null);
        return z;
    }

    @NotNull
    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(DISPLAY_LIMIT, this.displayLimit);
            jSONObject.put(DISPLAY_DELAY, this.displayDelay);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    @NotNull
    public String toString() {
        return "OSInAppMessageDisplayStats{lastDisplayTime=" + this.lastDisplayTime + ", displayQuantity=" + this.displayQuantity + ", displayLimit=" + this.displayLimit + ", displayDelay=" + this.displayDelay + '}';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3888fx0(int i, long j, @NotNull InterfaceC4092gv0 time) {
        this(time);
        Intrinsics.checkNotNullParameter(time, "time");
        this.displayQuantity = i;
        this.lastDisplayTime = j;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3888fx0(@NotNull JSONObject json, @NotNull InterfaceC4092gv0 time) throws JSONException {
        this(time);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(time, "time");
        this.isRedisplayEnabled = true;
        Object obj = json.get(DISPLAY_LIMIT);
        Object obj2 = json.get(DISPLAY_DELAY);
        if (obj instanceof Integer) {
            this.displayLimit = ((Number) obj).intValue();
        }
        if (obj2 instanceof Long) {
            this.displayDelay = ((Number) obj2).longValue();
        } else if (obj2 instanceof Integer) {
            this.displayDelay = ((Number) obj2).intValue();
        }
    }
}
