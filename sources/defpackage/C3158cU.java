package defpackage;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: cU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f¨\u0006\u0014"}, d2 = {"LcU;", "Lvs0;", "<init>", "()V", "Lot0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "addLogListener", "(Lot0;)V", "removeLogListener", "LnS0;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getLogLevel", "()LnS0;", "setLogLevel", "(LnS0;)V", "logLevel", "getAlertLevel", "setAlertLevel", "alertLevel", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C3158cU implements InterfaceC7283vs0 {
    public C3158cU() {
        setLogLevel(EnumC5513nS0.WARN);
        setAlertLevel(EnumC5513nS0.NONE);
    }

    @Override // defpackage.InterfaceC7283vs0
    public void addLogListener(@NotNull InterfaceC5817ot0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        NS0.INSTANCE.addListener(listener);
    }

    @Override // defpackage.InterfaceC7283vs0
    @NotNull
    public EnumC5513nS0 getAlertLevel() {
        return NS0.getVisualLogLevel();
    }

    @Override // defpackage.InterfaceC7283vs0
    @NotNull
    public EnumC5513nS0 getLogLevel() {
        return NS0.getLogLevel();
    }

    @Override // defpackage.InterfaceC7283vs0
    public void removeLogListener(@NotNull InterfaceC5817ot0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        NS0.INSTANCE.removeListener(listener);
    }

    @Override // defpackage.InterfaceC7283vs0
    public void setAlertLevel(@NotNull EnumC5513nS0 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        NS0.setVisualLogLevel(value);
    }

    @Override // defpackage.InterfaceC7283vs0
    public void setLogLevel(@NotNull EnumC5513nS0 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        NS0.setLogLevel(value);
    }
}
