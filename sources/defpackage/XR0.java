package defpackage;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010'\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006-"}, d2 = {"LXR0;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "lat", "Ljava/lang/Double;", "getLat", "()Ljava/lang/Double;", "setLat", "(Ljava/lang/Double;)V", "log", "getLog", "setLog", "", "accuracy", "Ljava/lang/Float;", "getAccuracy", "()Ljava/lang/Float;", "setAccuracy", "(Ljava/lang/Float;)V", "", "type", "Ljava/lang/Integer;", "getType", "()Ljava/lang/Integer;", "setType", "(Ljava/lang/Integer;)V", "", "bg", "Ljava/lang/Boolean;", "getBg", "()Ljava/lang/Boolean;", "setBg", "(Ljava/lang/Boolean;)V", "", "timeStamp", "Ljava/lang/Long;", "getTimeStamp", "()Ljava/lang/Long;", "setTimeStamp", "(Ljava/lang/Long;)V", "com.onesignal.location"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class XR0 {

    @Nullable
    private Float accuracy;

    @Nullable
    private Boolean bg;

    @Nullable
    private Double lat;

    @Nullable
    private Double log;

    @Nullable
    private Long timeStamp;

    @Nullable
    private Integer type;

    @Nullable
    public final Float getAccuracy() {
        return this.accuracy;
    }

    @Nullable
    public final Boolean getBg() {
        return this.bg;
    }

    @Nullable
    public final Double getLat() {
        return this.lat;
    }

    @Nullable
    public final Double getLog() {
        return this.log;
    }

    @Nullable
    public final Long getTimeStamp() {
        return this.timeStamp;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public final void setAccuracy(@Nullable Float f) {
        this.accuracy = f;
    }

    public final void setBg(@Nullable Boolean bool) {
        this.bg = bool;
    }

    public final void setLat(@Nullable Double d) {
        this.lat = d;
    }

    public final void setLog(@Nullable Double d) {
        this.log = d;
    }

    public final void setTimeStamp(@Nullable Long l) {
        this.timeStamp = l;
    }

    public final void setType(@Nullable Integer num) {
        this.type = num;
    }

    @NotNull
    public String toString() {
        return "LocationPoint{lat=" + this.lat + ", log=" + this.log + ", accuracy=" + this.accuracy + ", type=" + this.type + ", bg=" + this.bg + ", timeStamp=" + this.timeStamp + '}';
    }
}
