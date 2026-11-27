package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B!\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0002\u0010\tJ#\u0010\r\u001a\u00020\f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00048F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00048F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00078F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0016R\u0014\u0010\"\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0016R\u0014\u0010&\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0016¨\u0006)"}, d2 = {"LO02;", "LQ91;", "<init>", "()V", "", "appId", "onesignalId", "", "sessionTime", "(Ljava/lang/String;Ljava/lang/String;J)V", "", "map", "", "translateIds", "(Ljava/util/Map;)V", "LZm0;", "groupComparisonType", "LZm0;", "getGroupComparisonType", "()LZm0;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getAppId", "()Ljava/lang/String;", "setAppId", "(Ljava/lang/String;)V", "getOnesignalId", "setOnesignalId", "getSessionTime", "()J", "setSessionTime", "(J)V", "getCreateComparisonKey", "createComparisonKey", "getModifyComparisonKey", "modifyComparisonKey", "", "getCanStartExecute", "()Z", "canStartExecute", "getApplyToRecordId", "applyToRecordId", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class O02 extends Q91 {

    @NotNull
    private final EnumC2583Zm0 groupComparisonType;

    public O02() {
        super(Y92.TRACK_SESSION_END);
        this.groupComparisonType = EnumC2583Zm0.ALTER;
    }

    private final void setAppId(String str) {
        D01.setStringProperty$default(this, "appId", str, null, false, 12, null);
    }

    private final void setOnesignalId(String str) {
        D01.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    private final void setSessionTime(long j) {
        D01.setLongProperty$default(this, "sessionTime", j, null, false, 12, null);
    }

    @NotNull
    public final String getAppId() {
        return D01.getStringProperty$default(this, "appId", null, 2, null);
    }

    @Override // defpackage.Q91
    @NotNull
    public String getApplyToRecordId() {
        return getOnesignalId();
    }

    @Override // defpackage.Q91
    public boolean getCanStartExecute() {
        return !C6443rs0.INSTANCE.isLocalId(getOnesignalId());
    }

    @Override // defpackage.Q91
    @NotNull
    public String getCreateComparisonKey() {
        return "";
    }

    @Override // defpackage.Q91
    @NotNull
    public EnumC2583Zm0 getGroupComparisonType() {
        return this.groupComparisonType;
    }

    @Override // defpackage.Q91
    @NotNull
    public String getModifyComparisonKey() {
        return getAppId() + ".User." + getOnesignalId();
    }

    @NotNull
    public final String getOnesignalId() {
        return D01.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    public final long getSessionTime() {
        return D01.getLongProperty$default(this, "sessionTime", null, 2, null);
    }

    @Override // defpackage.Q91
    public void translateIds(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        if (map.containsKey(getOnesignalId())) {
            String str = map.get(getOnesignalId());
            Intrinsics.checkNotNull(str);
            setOnesignalId(str);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public O02(@NotNull String appId, @NotNull String onesignalId, long j) {
        this();
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(onesignalId, "onesignalId");
        setAppId(appId);
        setOnesignalId(onesignalId);
        setSessionTime(j);
    }
}
