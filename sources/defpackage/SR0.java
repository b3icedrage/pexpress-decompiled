package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"LSR0;", "LYr0;", "LWr0;", "_applicationService", "Lkt0;", "_locationManager", "Lmt0;", "_prefs", "Lit0;", "_capturer", "Lgv0;", "_time", "<init>", "(LWr0;Lkt0;Lmt0;Lit0;Lgv0;)V", "", "backgroundRun", "(LJM;)Ljava/lang/Object;", "LWr0;", "Lkt0;", "Lmt0;", "Lit0;", "Lgv0;", "", "getScheduleBackgroundRunIn", "()Ljava/lang/Long;", "scheduleBackgroundRunIn", "com.onesignal.location"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SR0 implements InterfaceC2520Yr0 {

    @NotNull
    private final InterfaceC2338Wr0 _applicationService;

    @NotNull
    private final InterfaceC4544it0 _capturer;

    @NotNull
    private final InterfaceC4974kt0 _locationManager;

    @NotNull
    private final InterfaceC5397mt0 _prefs;

    @NotNull
    private final InterfaceC4092gv0 _time;

    public SR0(@NotNull InterfaceC2338Wr0 _applicationService, @NotNull InterfaceC4974kt0 _locationManager, @NotNull InterfaceC5397mt0 _prefs, @NotNull InterfaceC4544it0 _capturer, @NotNull InterfaceC4092gv0 _time) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_locationManager, "_locationManager");
        Intrinsics.checkNotNullParameter(_prefs, "_prefs");
        Intrinsics.checkNotNullParameter(_capturer, "_capturer");
        Intrinsics.checkNotNullParameter(_time, "_time");
        this._applicationService = _applicationService;
        this._locationManager = _locationManager;
        this._prefs = _prefs;
        this._capturer = _capturer;
        this._time = _time;
    }

    @Override // defpackage.InterfaceC2520Yr0
    @Nullable
    public Object backgroundRun(@NotNull JM<? super Unit> jm) {
        this._capturer.captureLastLocation();
        return Unit.a;
    }

    @Override // defpackage.InterfaceC2520Yr0
    @Nullable
    public Long getScheduleBackgroundRunIn() {
        if (!this._locationManager.isShared()) {
            NS0.debug$default("LocationController scheduleUpdate not possible, location shared not enabled", null, 2, null);
            return null;
        }
        if (ZR0.INSTANCE.hasLocationPermission(this._applicationService.getAppContext())) {
            return Long.valueOf(600000 - (this._time.getCurrentTimeMillis() - this._prefs.getLastLocationTime()));
        }
        NS0.debug$default("LocationController scheduleUpdate not possible, location permission not enabled", null, 2, null);
        return null;
    }
}
