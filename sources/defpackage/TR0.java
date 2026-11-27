package defpackage;

import android.location.Location;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006#"}, d2 = {"LTR0;", "Lnt0;", "Lit0;", "LWr0;", "_applicationService", "Lgv0;", "_time", "Lmt0;", "_prefs", "Lqj1;", "_propertiesModelStore", "Ljt0;", "_controller", "<init>", "(LWr0;Lgv0;Lmt0;Lqj1;Ljt0;)V", "Landroid/location/Location;", "location", "", "capture", "(Landroid/location/Location;)V", "captureLastLocation", "()V", "onLocationChanged", "LWr0;", "Lgv0;", "Lmt0;", "Lqj1;", "Ljt0;", "", "locationCoarse", "Z", "getLocationCoarse", "()Z", "setLocationCoarse", "(Z)V", "com.onesignal.location"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class TR0 implements InterfaceC5607nt0, InterfaceC4544it0 {

    @NotNull
    private final InterfaceC2338Wr0 _applicationService;

    @NotNull
    private final InterfaceC4764jt0 _controller;

    @NotNull
    private final InterfaceC5397mt0 _prefs;

    @NotNull
    private final C6204qj1 _propertiesModelStore;

    @NotNull
    private final InterfaceC4092gv0 _time;
    private boolean locationCoarse;

    public TR0(@NotNull InterfaceC2338Wr0 _applicationService, @NotNull InterfaceC4092gv0 _time, @NotNull InterfaceC5397mt0 _prefs, @NotNull C6204qj1 _propertiesModelStore, @NotNull InterfaceC4764jt0 _controller) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_time, "_time");
        Intrinsics.checkNotNullParameter(_prefs, "_prefs");
        Intrinsics.checkNotNullParameter(_propertiesModelStore, "_propertiesModelStore");
        Intrinsics.checkNotNullParameter(_controller, "_controller");
        this._applicationService = _applicationService;
        this._time = _time;
        this._prefs = _prefs;
        this._propertiesModelStore = _propertiesModelStore;
        this._controller = _controller;
        _controller.subscribe(this);
    }

    private final void capture(Location location) {
        XR0 xr0 = new XR0();
        xr0.setAccuracy(Float.valueOf(location.getAccuracy()));
        xr0.setBg(Boolean.valueOf(!this._applicationService.isInForeground()));
        xr0.setType(getLocationCoarse() ? 0 : 1);
        xr0.setTimeStamp(Long.valueOf(location.getTime()));
        if (getLocationCoarse()) {
            BigDecimal bigDecimal = new BigDecimal(location.getLatitude());
            RoundingMode roundingMode = RoundingMode.HALF_UP;
            xr0.setLat(Double.valueOf(bigDecimal.setScale(7, roundingMode).doubleValue()));
            xr0.setLog(Double.valueOf(new BigDecimal(location.getLongitude()).setScale(7, roundingMode).doubleValue()));
        } else {
            xr0.setLat(Double.valueOf(location.getLatitude()));
            xr0.setLog(Double.valueOf(location.getLongitude()));
        }
        C5994pj1 model = this._propertiesModelStore.getModel();
        model.setLocationLongitude(xr0.getLog());
        model.setLocationLatitude(xr0.getLat());
        model.setLocationAccuracy(xr0.getAccuracy());
        model.setLocationBackground(xr0.getBg());
        model.setLocationType(xr0.getType());
        model.setLocationTimestamp(xr0.getTimeStamp());
        this._prefs.setLastLocationTime(this._time.getCurrentTimeMillis());
    }

    @Override // defpackage.InterfaceC4544it0
    public void captureLastLocation() {
        Location lastLocation = this._controller.getLastLocation();
        if (lastLocation != null) {
            capture(lastLocation);
        } else {
            this._prefs.setLastLocationTime(this._time.getCurrentTimeMillis());
        }
    }

    @Override // defpackage.InterfaceC4544it0
    public boolean getLocationCoarse() {
        return this.locationCoarse;
    }

    @Override // defpackage.InterfaceC5607nt0
    public void onLocationChanged(@NotNull Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        NS0.debug$default("LocationController fireCompleteForLocation with location: " + location, null, 2, null);
        capture(location);
    }

    @Override // defpackage.InterfaceC4544it0
    public void setLocationCoarse(boolean z) {
        this.locationCoarse = z;
    }
}
