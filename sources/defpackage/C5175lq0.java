package defpackage;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: lq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Llq0;", "LHs0;", "LxI;", "_configModelStore", "<init>", "(LxI;)V", "", ImagesContract.URL, "Ljava/net/HttpURLConnection;", "newHttpURLConnection", "(Ljava/lang/String;)Ljava/net/HttpURLConnection;", "LxI;", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C5175lq0 implements InterfaceC1165Hs0 {

    @NotNull
    private final C7582xI _configModelStore;

    public C5175lq0(@NotNull C7582xI _configModelStore) {
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        this._configModelStore = _configModelStore;
    }

    @Override // defpackage.InterfaceC1165Hs0
    @NotNull
    public HttpURLConnection newHttpURLConnection(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(this._configModelStore.getModel().getApiUrl() + url).openConnection());
        Intrinsics.c(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        return (HttpURLConnection) uRLConnection;
    }
}
