package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: pj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\b\u0010\tR$\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR$\u0010\u0015\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR(\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR(\u0010\"\u001a\u0004\u0018\u00010\u001d2\b\u0010\n\u001a\u0004\u0018\u00010\u001d8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010%\u001a\u0004\u0018\u00010\u001d2\b\u0010\n\u001a\u0004\u0018\u00010\u001d8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R(\u0010+\u001a\u0004\u0018\u00010&2\b\u0010\n\u001a\u0004\u0018\u00010&8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R(\u00101\u001a\u0004\u0018\u00010,2\b\u0010\n\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R(\u00107\u001a\u0004\u0018\u0001022\b\u0010\n\u001a\u0004\u0018\u0001028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u00104\"\u0004\b5\u00106R(\u0010=\u001a\u0004\u0018\u0001082\b\u0010\n\u001a\u0004\u0018\u0001088F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lpj1;", "LD01;", "<init>", "()V", "", "property", "Lorg/json/JSONObject;", "jsonObject", "createModelForProperty", "(Ljava/lang/String;Lorg/json/JSONObject;)LD01;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getOnesignalId", "()Ljava/lang/String;", "setOnesignalId", "(Ljava/lang/String;)V", "onesignalId", "getLanguage", "setLanguage", "language", "getCountry", "setCountry", "country", "getTimezone", "setTimezone", "timezone", "LHW0;", "getTags", "()LHW0;", "tags", "", "getLocationLatitude", "()Ljava/lang/Double;", "setLocationLatitude", "(Ljava/lang/Double;)V", "locationLatitude", "getLocationLongitude", "setLocationLongitude", "locationLongitude", "", "getLocationAccuracy", "()Ljava/lang/Float;", "setLocationAccuracy", "(Ljava/lang/Float;)V", "locationAccuracy", "", "getLocationType", "()Ljava/lang/Integer;", "setLocationType", "(Ljava/lang/Integer;)V", "locationType", "", "getLocationBackground", "()Ljava/lang/Boolean;", "setLocationBackground", "(Ljava/lang/Boolean;)V", "locationBackground", "", "getLocationTimestamp", "()Ljava/lang/Long;", "setLocationTimestamp", "(Ljava/lang/Long;)V", "locationTimestamp", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C5994pj1 extends D01 {

    /* JADX INFO: renamed from: pj1$a */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a extends ML0 implements Function0<String> {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "US";
        }
    }

    /* JADX INFO: renamed from: pj1$b */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LHW0;", "", "invoke", "()LHW0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class b extends ML0 implements Function0<HW0<String>> {
        public b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final HW0<String> invoke() {
            return new HW0<>(C5994pj1.this, "tags");
        }
    }

    public C5994pj1() {
        super(null, null, 3, null);
    }

    @Override // defpackage.D01
    @Nullable
    public D01 createModelForProperty(@NotNull String property, @NotNull JSONObject jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        if (!Intrinsics.a(property, "tags")) {
            return null;
        }
        HW0 hw0 = new HW0(this, "tags");
        Iterator<String> itKeys = jsonObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "jsonObject.keys()");
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            Intrinsics.checkNotNullExpressionValue(key, "key");
            String string = jsonObject.getString(key);
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(key)");
            D01.setStringProperty$default(hw0, key, string, null, false, 12, null);
        }
        return hw0;
    }

    @NotNull
    public final String getCountry() {
        return getStringProperty("country", a.INSTANCE);
    }

    @Nullable
    public final String getLanguage() {
        return D01.getOptStringProperty$default(this, "language", null, 2, null);
    }

    @Nullable
    public final Float getLocationAccuracy() {
        return D01.getOptFloatProperty$default(this, "locationAccuracy", null, 2, null);
    }

    @Nullable
    public final Boolean getLocationBackground() {
        return D01.getOptBooleanProperty$default(this, "locationBackground", null, 2, null);
    }

    @Nullable
    public final Double getLocationLatitude() {
        return D01.getOptDoubleProperty$default(this, "locationLatitude", null, 2, null);
    }

    @Nullable
    public final Double getLocationLongitude() {
        return D01.getOptDoubleProperty$default(this, "locationLongitude", null, 2, null);
    }

    @Nullable
    public final Long getLocationTimestamp() {
        return D01.getOptLongProperty$default(this, "locationTimestamp", null, 2, null);
    }

    @Nullable
    public final Integer getLocationType() {
        return D01.getOptIntProperty$default(this, "locationType", null, 2, null);
    }

    @NotNull
    public final String getOnesignalId() {
        return D01.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    @NotNull
    public final HW0<String> getTags() {
        return getMapModelProperty("tags", new b());
    }

    @Nullable
    public final String getTimezone() {
        return D01.getOptStringProperty$default(this, "timezone", null, 2, null);
    }

    public final void setCountry(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        D01.setStringProperty$default(this, "country", value, null, false, 12, null);
    }

    public final void setLanguage(@Nullable String str) {
        D01.setOptStringProperty$default(this, "language", str, null, false, 12, null);
    }

    public final void setLocationAccuracy(@Nullable Float f) {
        D01.setOptFloatProperty$default(this, "locationAccuracy", f, null, false, 12, null);
    }

    public final void setLocationBackground(@Nullable Boolean bool) {
        D01.setOptBooleanProperty$default(this, "locationBackground", bool, null, false, 12, null);
    }

    public final void setLocationLatitude(@Nullable Double d) {
        D01.setOptDoubleProperty$default(this, "locationLatitude", d, null, false, 12, null);
    }

    public final void setLocationLongitude(@Nullable Double d) {
        D01.setOptDoubleProperty$default(this, "locationLongitude", d, null, false, 12, null);
    }

    public final void setLocationTimestamp(@Nullable Long l) {
        D01.setOptLongProperty$default(this, "locationTimestamp", l, null, false, 12, null);
    }

    public final void setLocationType(@Nullable Integer num) {
        D01.setOptIntProperty$default(this, "locationType", num, null, false, 12, null);
    }

    public final void setOnesignalId(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        D01.setStringProperty$default(this, "onesignalId", value, null, false, 12, null);
    }

    public final void setTimezone(@Nullable String str) {
        D01.setOptStringProperty$default(this, "timezone", str, null, false, 12, null);
    }
}
