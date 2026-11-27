package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"LNL0;", "Let0;", "Lqj1;", "_propertiesModelStore", "<init>", "(Lqj1;)V", "Lqj1;", "LVL0;", "deviceLanguageProvider", "LVL0;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getLanguage", "()Ljava/lang/String;", "setLanguage", "(Ljava/lang/String;)V", "language", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class NL0 implements InterfaceC3666et0 {

    @NotNull
    private final C6204qj1 _propertiesModelStore;

    @NotNull
    private VL0 deviceLanguageProvider;

    public NL0(@NotNull C6204qj1 _propertiesModelStore) {
        Intrinsics.checkNotNullParameter(_propertiesModelStore, "_propertiesModelStore");
        this._propertiesModelStore = _propertiesModelStore;
        this.deviceLanguageProvider = new VL0();
    }

    @Override // defpackage.InterfaceC3666et0
    @NotNull
    public String getLanguage() {
        String language = this._propertiesModelStore.getModel().getLanguage();
        return language == null ? this.deviceLanguageProvider.getLanguage() : language;
    }

    @Override // defpackage.InterfaceC3666et0
    public void setLanguage(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._propertiesModelStore.getModel().setLanguage(value);
    }
}
