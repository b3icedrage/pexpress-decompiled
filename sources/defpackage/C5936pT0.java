package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: pT0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B/\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0002\u0010\tJ#\u0010\r\u001a\u00020\f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00048F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u001bR$\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00048F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u001bR(\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00048F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b\u001f\u0010\u001bR(\u0010\"\u001a\u0004\u0018\u00010\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00048F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010\u0012\"\u0004\b!\u0010\u001bR\u0014\u0010$\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0012R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0012¨\u0006+"}, d2 = {"LpT0;", "LQ91;", "<init>", "()V", "", "appId", "onesignalId", "externalId", "existingOneSignalId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "map", "", "translateIds", "(Ljava/util/Map;)V", "modifyComparisonKey", "Ljava/lang/String;", "getModifyComparisonKey", "()Ljava/lang/String;", "LZm0;", "groupComparisonType", "LZm0;", "getGroupComparisonType", "()LZm0;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getAppId", "setAppId", "(Ljava/lang/String;)V", "getOnesignalId", "setOnesignalId", "getExternalId", "setExternalId", "getExistingOnesignalId", "setExistingOnesignalId", "existingOnesignalId", "getCreateComparisonKey", "createComparisonKey", "", "getCanStartExecute", "()Z", "canStartExecute", "getApplyToRecordId", "applyToRecordId", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C5936pT0 extends Q91 {

    @NotNull
    private final EnumC2583Zm0 groupComparisonType;

    @NotNull
    private final String modifyComparisonKey;

    public C5936pT0() {
        super(C6146qT0.LOGIN_USER);
        this.modifyComparisonKey = "";
        this.groupComparisonType = EnumC2583Zm0.CREATE;
    }

    private final void setAppId(String str) {
        D01.setStringProperty$default(this, "appId", str, null, false, 12, null);
    }

    private final void setExistingOnesignalId(String str) {
        D01.setOptStringProperty$default(this, "existingOnesignalId", str, null, false, 12, null);
    }

    private final void setExternalId(String str) {
        D01.setOptStringProperty$default(this, "externalId", str, null, false, 12, null);
    }

    private final void setOnesignalId(String str) {
        D01.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    @NotNull
    public final String getAppId() {
        return D01.getStringProperty$default(this, "appId", null, 2, null);
    }

    @Override // defpackage.Q91
    @NotNull
    public String getApplyToRecordId() {
        String existingOnesignalId = getExistingOnesignalId();
        return existingOnesignalId == null ? getOnesignalId() : existingOnesignalId;
    }

    @Override // defpackage.Q91
    public boolean getCanStartExecute() {
        if (getExistingOnesignalId() == null) {
            return true;
        }
        C6443rs0 c6443rs0 = C6443rs0.INSTANCE;
        String existingOnesignalId = getExistingOnesignalId();
        Intrinsics.checkNotNull(existingOnesignalId);
        return !c6443rs0.isLocalId(existingOnesignalId);
    }

    @Override // defpackage.Q91
    @NotNull
    public String getCreateComparisonKey() {
        return getAppId() + ".User." + getOnesignalId();
    }

    @Nullable
    public final String getExistingOnesignalId() {
        return D01.getOptStringProperty$default(this, "existingOnesignalId", null, 2, null);
    }

    @Nullable
    public final String getExternalId() {
        return D01.getOptStringProperty$default(this, "externalId", null, 2, null);
    }

    @Override // defpackage.Q91
    @NotNull
    public EnumC2583Zm0 getGroupComparisonType() {
        return this.groupComparisonType;
    }

    @Override // defpackage.Q91
    @NotNull
    public String getModifyComparisonKey() {
        return this.modifyComparisonKey;
    }

    @NotNull
    public final String getOnesignalId() {
        return D01.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    @Override // defpackage.Q91
    public void translateIds(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        if (map.containsKey(getExistingOnesignalId())) {
            String str = map.get(getExistingOnesignalId());
            Intrinsics.checkNotNull(str);
            setExistingOnesignalId(str);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5936pT0(@NotNull String appId, @NotNull String onesignalId, @Nullable String str, @Nullable String str2) {
        this();
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(onesignalId, "onesignalId");
        setAppId(appId);
        setOnesignalId(onesignalId);
        setExternalId(str);
        setExistingOnesignalId(str2);
    }

    public /* synthetic */ C5936pT0(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4);
    }
}
