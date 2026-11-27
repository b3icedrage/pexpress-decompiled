package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: rj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ=\u0010\u0015\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017¨\u0006\u0018"}, d2 = {"Lrj1;", "LJM1;", "Lpj1;", "Lqj1;", Payload.TYPE_STORE, "Lfu0;", "opRepo", "LxI;", "_configModelStore", "<init>", "(Lqj1;Lfu0;LxI;)V", "model", "LQ91;", "getReplaceOperation", "(Lpj1;)LQ91;", "", "path", "property", "", "oldValue", "newValue", "getUpdateOperation", "(Lpj1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)LQ91;", "LxI;", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C6413rj1 extends JM1<C5994pj1> {

    @NotNull
    private final C7582xI _configModelStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6413rj1(@NotNull C6204qj1 store, @NotNull InterfaceC3879fu0 opRepo, @NotNull C7582xI _configModelStore) {
        super(store, opRepo);
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(opRepo, "opRepo");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        this._configModelStore = _configModelStore;
    }

    @Override // defpackage.JM1
    @Nullable
    public Q91 getReplaceOperation(@NotNull C5994pj1 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }

    @Override // defpackage.JM1
    @Nullable
    public Q91 getUpdateOperation(@NotNull C5994pj1 model, @NotNull String path, @NotNull String property, @Nullable Object oldValue, @Nullable Object newValue) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(property, "property");
        if (d.o(path, "locationTimestamp", false) || d.o(path, "locationBackground", false) || d.o(path, "locationType", false) || d.o(path, "locationAccuracy", false)) {
            return null;
        }
        if (d.o(path, "tags", false)) {
            return (newValue == null || !(newValue instanceof String)) ? new C5104lX(this._configModelStore.getModel().getAppId(), model.getOnesignalId(), property) : new C4854kJ1(this._configModelStore.getModel().getAppId(), model.getOnesignalId(), property, (String) newValue);
        }
        return new C4386iJ1(this._configModelStore.getModel().getAppId(), model.getOnesignalId(), property, newValue);
    }
}
