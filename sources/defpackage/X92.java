package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003BA\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0002\u0010\u000fJ#\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00048F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00048F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR$\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00048F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR$\u0010\t\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b8F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n8F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010\f\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00048F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010\u001c\"\u0004\b,\u0010\u001eR$\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r8F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0014\u00102\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u001cR\u0014\u00104\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u001cR\u0014\u00106\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010(R\u0014\u00108\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u001c¨\u00069"}, d2 = {"LX92;", "LQ91;", "<init>", "()V", "", "appId", "onesignalId", "subscriptionId", "LHU1;", "type", "", "enabled", "address", "LGU1;", "status", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LHU1;ZLjava/lang/String;LGU1;)V", "", "map", "", "translateIds", "(Ljava/util/Map;)V", "LZm0;", "groupComparisonType", "LZm0;", "getGroupComparisonType", "()LZm0;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getAppId", "()Ljava/lang/String;", "setAppId", "(Ljava/lang/String;)V", "getOnesignalId", "setOnesignalId", "getSubscriptionId", "setSubscriptionId", "getType", "()LHU1;", "setType", "(LHU1;)V", "getEnabled", "()Z", "setEnabled", "(Z)V", "getAddress", "setAddress", "getStatus", "()LGU1;", "setStatus", "(LGU1;)V", "getCreateComparisonKey", "createComparisonKey", "getModifyComparisonKey", "modifyComparisonKey", "getCanStartExecute", "canStartExecute", "getApplyToRecordId", "applyToRecordId", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class X92 extends Q91 {

    @NotNull
    private final EnumC2583Zm0 groupComparisonType;

    public X92() {
        super(FU1.UPDATE_SUBSCRIPTION);
        this.groupComparisonType = EnumC2583Zm0.ALTER;
    }

    private final void setAddress(String str) {
        D01.setStringProperty$default(this, "address", str, null, false, 12, null);
    }

    private final void setAppId(String str) {
        D01.setStringProperty$default(this, "appId", str, null, false, 12, null);
    }

    private final void setEnabled(boolean z) {
        D01.setBooleanProperty$default(this, "enabled", z, null, false, 12, null);
    }

    private final void setOnesignalId(String str) {
        D01.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    private final void setStatus(GU1 gu1) {
        setOptAnyProperty("status", gu1 != null ? gu1.toString() : null, "NORMAL", false);
    }

    private final void setSubscriptionId(String str) {
        D01.setStringProperty$default(this, "subscriptionId", str, null, false, 12, null);
    }

    private final void setType(HU1 hu1) {
        setOptAnyProperty("type", hu1 != null ? hu1.toString() : null, "NORMAL", false);
    }

    @NotNull
    public final String getAddress() {
        return D01.getStringProperty$default(this, "address", null, 2, null);
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

    public final boolean getEnabled() {
        return D01.getBooleanProperty$default(this, "enabled", null, 2, null);
    }

    @Override // defpackage.Q91
    @NotNull
    public EnumC2583Zm0 getGroupComparisonType() {
        return this.groupComparisonType;
    }

    @Override // defpackage.Q91
    @NotNull
    public String getModifyComparisonKey() {
        return getAppId() + ".User." + getOnesignalId() + ".Subscription." + getSubscriptionId();
    }

    @NotNull
    public final String getOnesignalId() {
        return D01.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    @NotNull
    public final GU1 getStatus() {
        Enum enumValueOf = null;
        Object optAnyProperty$default = D01.getOptAnyProperty$default(this, "status", null, 2, null);
        if (optAnyProperty$default != null) {
            if (optAnyProperty$default instanceof GU1) {
                enumValueOf = (Enum) optAnyProperty$default;
            } else {
                enumValueOf = optAnyProperty$default instanceof String ? GU1.valueOf((String) optAnyProperty$default) : (GU1) optAnyProperty$default;
            }
        }
        if (enumValueOf != null) {
            return (GU1) enumValueOf;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionStatus");
    }

    @NotNull
    public final String getSubscriptionId() {
        return D01.getStringProperty$default(this, "subscriptionId", null, 2, null);
    }

    @NotNull
    public final HU1 getType() {
        Enum enumValueOf = null;
        Object optAnyProperty$default = D01.getOptAnyProperty$default(this, "type", null, 2, null);
        if (optAnyProperty$default != null) {
            if (optAnyProperty$default instanceof HU1) {
                enumValueOf = (Enum) optAnyProperty$default;
            } else {
                enumValueOf = optAnyProperty$default instanceof String ? HU1.valueOf((String) optAnyProperty$default) : (HU1) optAnyProperty$default;
            }
        }
        if (enumValueOf != null) {
            return (HU1) enumValueOf;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionType");
    }

    @Override // defpackage.Q91
    public void translateIds(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        if (map.containsKey(getOnesignalId())) {
            String str = map.get(getOnesignalId());
            Intrinsics.checkNotNull(str);
            setOnesignalId(str);
        }
        if (map.containsKey(getSubscriptionId())) {
            String str2 = map.get(getSubscriptionId());
            Intrinsics.checkNotNull(str2);
            setSubscriptionId(str2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public X92(@NotNull String appId, @NotNull String onesignalId, @NotNull String subscriptionId, @NotNull HU1 type, boolean z, @NotNull String address, @NotNull GU1 status) {
        this();
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(onesignalId, "onesignalId");
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(status, "status");
        setAppId(appId);
        setOnesignalId(onesignalId);
        setSubscriptionId(subscriptionId);
        setType(type);
        setEnabled(z);
        setAddress(address);
        setStatus(status);
    }
}
