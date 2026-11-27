package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kJ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B)\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\tJ#\u0010\r\u001a\u00020\f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00048F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00048F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R$\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00048F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R$\u0010\b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00048F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u0014\u0010\u001f\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0015R\u0014\u0010!\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0015R\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0015¨\u0006("}, d2 = {"LkJ1;", "LQ91;", "<init>", "()V", "", "appId", "onesignalId", "key", AppMeasurementSdk.ConditionalUserProperty.VALUE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "map", "", "translateIds", "(Ljava/util/Map;)V", "LZm0;", "groupComparisonType", "LZm0;", "getGroupComparisonType", "()LZm0;", "getAppId", "()Ljava/lang/String;", "setAppId", "(Ljava/lang/String;)V", "getOnesignalId", "setOnesignalId", "getKey", "setKey", "getValue", "setValue", "getCreateComparisonKey", "createComparisonKey", "getModifyComparisonKey", "modifyComparisonKey", "", "getCanStartExecute", "()Z", "canStartExecute", "getApplyToRecordId", "applyToRecordId", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C4854kJ1 extends Q91 {

    @NotNull
    private final EnumC2583Zm0 groupComparisonType;

    public C4854kJ1() {
        super(Y92.SET_TAG);
        this.groupComparisonType = EnumC2583Zm0.ALTER;
    }

    private final void setAppId(String str) {
        D01.setStringProperty$default(this, "appId", str, null, false, 12, null);
    }

    private final void setKey(String str) {
        D01.setStringProperty$default(this, "key", str, null, false, 12, null);
    }

    private final void setOnesignalId(String str) {
        D01.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    private final void setValue(String str) {
        D01.setStringProperty$default(this, AppMeasurementSdk.ConditionalUserProperty.VALUE, str, null, false, 12, null);
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

    @NotNull
    public final String getKey() {
        return D01.getStringProperty$default(this, "key", null, 2, null);
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

    @NotNull
    public final String getValue() {
        return D01.getStringProperty$default(this, AppMeasurementSdk.ConditionalUserProperty.VALUE, null, 2, null);
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
    public C4854kJ1(@NotNull String appId, @NotNull String onesignalId, @NotNull String key, @NotNull String value) {
        this();
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(onesignalId, "onesignalId");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        setAppId(appId);
        setOnesignalId(onesignalId);
        setKey(key);
        setValue(value);
    }
}
