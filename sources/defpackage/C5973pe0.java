package defpackage;

import com.google.firebase.perf.session.SessionManager;

/* JADX INFO: renamed from: pe0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5973pe0 implements InterfaceC5331mb0<SessionManager> {
    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        SessionManager sessionManager = SessionManager.getInstance();
        C0957Fb.h(sessionManager, "Cannot return null from a non-@Nullable @Provides method");
        return sessionManager;
    }
}
