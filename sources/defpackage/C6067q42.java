package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: q42, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B!\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\bJ#\u0010\f\u001a\u00020\u000b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00048F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00048F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R$\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00048F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\u0014\u0010\u001d\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0015R\u0014\u0010\u001f\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0015R\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0015¨\u0006&"}, d2 = {"Lq42;", "LQ91;", "<init>", "()V", "", "appId", "subscriptionId", "onesignalId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "map", "", "translateIds", "(Ljava/util/Map;)V", "LZm0;", "groupComparisonType", "LZm0;", "getGroupComparisonType", "()LZm0;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getAppId", "()Ljava/lang/String;", "setAppId", "(Ljava/lang/String;)V", "getSubscriptionId", "setSubscriptionId", "getOnesignalId", "setOnesignalId", "getCreateComparisonKey", "createComparisonKey", "getModifyComparisonKey", "modifyComparisonKey", "", "getCanStartExecute", "()Z", "canStartExecute", "getApplyToRecordId", "applyToRecordId", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C6067q42 extends Q91 {

    @NotNull
    private final EnumC2583Zm0 groupComparisonType;

    public C6067q42() {
        super(FU1.TRANSFER_SUBSCRIPTION);
        this.groupComparisonType = EnumC2583Zm0.NONE;
    }

    private final void setAppId(String str) {
        D01.setStringProperty$default(this, "appId", str, null, false, 12, null);
    }

    private final void setOnesignalId(String str) {
        D01.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    private final void setSubscriptionId(String str) {
        D01.setStringProperty$default(this, "subscriptionId", str, null, false, 12, null);
    }

    @NotNull
    public final String getAppId() {
        return D01.getStringProperty$default(this, "appId", null, 2, null);
    }

    @Override // defpackage.Q91
    @NotNull
    public String getApplyToRecordId() {
        return getSubscriptionId();
    }

    @Override // defpackage.Q91
    public boolean getCanStartExecute() {
        C6443rs0 c6443rs0 = C6443rs0.INSTANCE;
        return (c6443rs0.isLocalId(getOnesignalId()) || c6443rs0.isLocalId(getSubscriptionId())) ? false : true;
    }

    @Override // defpackage.Q91
    @NotNull
    public String getCreateComparisonKey() {
        return getAppId() + ".User." + getOnesignalId();
    }

    @Override // defpackage.Q91
    @NotNull
    public EnumC2583Zm0 getGroupComparisonType() {
        return this.groupComparisonType;
    }

    @Override // defpackage.Q91
    @NotNull
    public String getModifyComparisonKey() {
        return getAppId() + ".Subscription." + getSubscriptionId() + ".Transfer";
    }

    @NotNull
    public final String getOnesignalId() {
        return D01.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    @NotNull
    public final String getSubscriptionId() {
        return D01.getStringProperty$default(this, "subscriptionId", null, 2, null);
    }

    @Override // defpackage.Q91
    public void translateIds(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        if (map.containsKey(getSubscriptionId())) {
            String str = map.get(getSubscriptionId());
            Intrinsics.checkNotNull(str);
            setSubscriptionId(str);
        }
        if (map.containsKey(getOnesignalId())) {
            String str2 = map.get(getOnesignalId());
            Intrinsics.checkNotNull(str2);
            setOnesignalId(str2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6067q42(@NotNull String appId, @NotNull String subscriptionId, @NotNull String onesignalId) {
        this();
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(onesignalId, "onesignalId");
        setAppId(appId);
        setSubscriptionId(subscriptionId);
        setOnesignalId(onesignalId);
    }
}
