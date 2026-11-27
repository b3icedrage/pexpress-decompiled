package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: je0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4710je0 {
    public static final C6170qb e = C6170qb.d();
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final InterfaceC1612Nk1<C6651sr1> b;
    public final InterfaceC2400Xd0 c;
    public final InterfaceC1612Nk1<W42> d;

    public C4710je0(C1198Id0 c1198Id0, InterfaceC1612Nk1<C6651sr1> interfaceC1612Nk1, InterfaceC2400Xd0 interfaceC2400Xd0, InterfaceC1612Nk1<W42> interfaceC1612Nk2, RemoteConfigManager remoteConfigManager, C8002zI c8002zI, SessionManager sessionManager) {
        Bundle bundle;
        this.b = interfaceC1612Nk1;
        this.c = interfaceC2400Xd0;
        this.d = interfaceC1612Nk2;
        if (c1198Id0 == null) {
            new C1099Gw0(new Bundle());
            return;
        }
        C2872b52 c2872b52 = C2872b52.w;
        c2872b52.h = c1198Id0;
        c1198Id0.a();
        C3193ce0 c3193ce0 = c1198Id0.c;
        c2872b52.t = c3193ce0.g;
        c2872b52.j = interfaceC2400Xd0;
        c2872b52.k = interfaceC1612Nk2;
        c2872b52.m.execute(new RunnableC2555Zd(c2872b52, 8));
        c1198Id0.a();
        Context context = c1198Id0.a;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e2) {
            e2.getMessage();
            bundle = null;
        }
        C1099Gw0 c1099Gw0 = bundle != null ? new C1099Gw0(bundle) : new C1099Gw0();
        remoteConfigManager.setFirebaseRemoteConfigProvider(interfaceC1612Nk1);
        c8002zI.b = c1099Gw0;
        C8002zI.d.b = Cc2.a(context);
        c8002zI.c.c(context);
        sessionManager.setApplicationContext(context);
        Boolean boolG = c8002zI.g();
        C6170qb c6170qb = e;
        if (c6170qb.b) {
            if (boolG != null ? boolG.booleanValue() : C1198Id0.c().h()) {
                c1198Id0.a();
                "Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: ".concat(LE.h(c3193ce0.g, context.getPackageName()).concat("/trends?utm_source=perf-android-sdk&utm_medium=android-ide"));
                if (c6170qb.b) {
                    c6170qb.a.getClass();
                }
            }
        }
    }
}
