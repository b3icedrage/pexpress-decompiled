package defpackage;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: x41, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lx41;", "", "Lgv0;", "_time", "LxI;", "_configModelStore", "<init>", "(Lgv0;LxI;)V", "", "key", "", ProductAction.ACTION_ADD, "(Ljava/lang/String;)V", "", "canAccess", "(Ljava/lang/String;)Z", "isInMissingRetryWindow", "Lgv0;", "LxI;", "", "", "records", "Ljava/util/Map;", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C7536x41 {

    @NotNull
    private final C7582xI _configModelStore;

    @NotNull
    private final InterfaceC4092gv0 _time;

    @NotNull
    private final Map<String, Long> records;

    public C7536x41(@NotNull InterfaceC4092gv0 _time, @NotNull C7582xI _configModelStore) {
        Intrinsics.checkNotNullParameter(_time, "_time");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        this._time = _time;
        this._configModelStore = _configModelStore;
        this.records = new LinkedHashMap();
    }

    public final void add(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.records.put(key, Long.valueOf(this._time.getCurrentTimeMillis()));
    }

    public final boolean canAccess(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Long l = this.records.get(key);
        if (l != null) {
            return this._time.getCurrentTimeMillis() - l.longValue() >= this._configModelStore.getModel().getOpRepoPostCreateDelay();
        }
        return true;
    }

    public final boolean isInMissingRetryWindow(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Long l = this.records.get(key);
        if (l != null) {
            if (this._time.getCurrentTimeMillis() - l.longValue() <= this._configModelStore.getModel().getOpRepoPostCreateRetryUpTo()) {
                return true;
            }
        }
        return false;
    }
}
