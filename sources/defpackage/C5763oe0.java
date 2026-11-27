package defpackage;

import com.google.firebase.perf.config.RemoteConfigManager;

/* JADX INFO: renamed from: oe0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5763oe0 implements InterfaceC5331mb0<RemoteConfigManager> {
    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        RemoteConfigManager remoteConfigManager = RemoteConfigManager.getInstance();
        C0957Fb.h(remoteConfigManager, "Cannot return null from a non-@Nullable @Provides method");
        return remoteConfigManager;
    }
}
