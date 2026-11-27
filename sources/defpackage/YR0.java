package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006R$\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"LYR0;", "Lmt0;", "Lsu0;", "_prefs", "<init>", "(Lsu0;)V", "Lsu0;", "", C1575Mz0.TIME, "getLastLocationTime", "()J", "setLastLocationTime", "(J)V", "lastLocationTime", "com.onesignal.location"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class YR0 implements InterfaceC5397mt0 {

    @NotNull
    private final InterfaceC6659su0 _prefs;

    public YR0(@NotNull InterfaceC6659su0 _prefs) {
        Intrinsics.checkNotNullParameter(_prefs, "_prefs");
        this._prefs = _prefs;
    }

    @Override // defpackage.InterfaceC5397mt0
    public long getLastLocationTime() {
        Long l = this._prefs.getLong("OneSignal", "OS_LAST_LOCATION_TIME", -600000L);
        Intrinsics.checkNotNull(l);
        return l.longValue();
    }

    @Override // defpackage.InterfaceC5397mt0
    public void setLastLocationTime(long j) {
        this._prefs.saveLong("OneSignal", "OS_LAST_LOCATION_TIME", Long.valueOf(j));
    }
}
