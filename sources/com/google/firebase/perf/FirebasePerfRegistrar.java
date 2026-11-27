package com.google.firebase.perf;

import android.app.Application;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import defpackage.AP1;
import defpackage.C1198Id0;
import defpackage.C1690Ok1;
import defpackage.C2567Zh;
import defpackage.C2872b52;
import defpackage.C3612ee0;
import defpackage.C4242he0;
import defpackage.C4710je0;
import defpackage.C4920ke0;
import defpackage.C5130le0;
import defpackage.C5207m;
import defpackage.C5343me0;
import defpackage.C5553ne0;
import defpackage.C5763oe0;
import defpackage.C5929pR;
import defpackage.C5973pe0;
import defpackage.C6183qe0;
import defpackage.C6495s7;
import defpackage.C6651sr1;
import defpackage.C6973uP0;
import defpackage.C6996uX;
import defpackage.C7851yb0;
import defpackage.C7892yl1;
import defpackage.C7904yp;
import defpackage.C8002zI;
import defpackage.Cc2;
import defpackage.InterfaceC2400Xd0;
import defpackage.InterfaceC3958gH;
import defpackage.InterfaceC5873p82;
import defpackage.UG;
import defpackage.W42;
import defpackage.Y20;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    /* JADX INFO: Access modifiers changed from: private */
    public static C3612ee0 lambda$getComponents$0(C7892yl1 c7892yl1, InterfaceC3958gH interfaceC3958gH) {
        AppStartTrace appStartTrace;
        C1198Id0 c1198Id0 = (C1198Id0) interfaceC3958gH.a(C1198Id0.class);
        AP1 ap1 = (AP1) interfaceC3958gH.c(AP1.class).get();
        Executor executor = (Executor) interfaceC3958gH.g(c7892yl1);
        C3612ee0 c3612ee0 = new C3612ee0();
        c1198Id0.a();
        Context context = c1198Id0.a;
        C8002zI c8002zIE = C8002zI.e();
        c8002zIE.getClass();
        C8002zI.d.b = Cc2.a(context);
        c8002zIE.c.c(context);
        C2567Zh c2567ZhA = C2567Zh.a();
        synchronized (c2567ZhA) {
            if (!c2567ZhA.t) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof Application) {
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(c2567ZhA);
                    c2567ZhA.t = true;
                }
            }
        }
        C4920ke0 c4920ke0 = new C4920ke0();
        synchronized (c2567ZhA.k) {
            c2567ZhA.k.add(c4920ke0);
        }
        if (ap1 != null) {
            if (AppStartTrace.B != null) {
                appStartTrace = AppStartTrace.B;
            } else {
                C2872b52 c2872b52 = C2872b52.w;
                C5207m c5207m = new C5207m();
                if (AppStartTrace.B == null) {
                    synchronized (AppStartTrace.class) {
                        try {
                            if (AppStartTrace.B == null) {
                                AppStartTrace.B = new AppStartTrace(c2872b52, c5207m, C8002zI.e(), new ThreadPoolExecutor(0, 1, 10 + AppStartTrace.A, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                appStartTrace = AppStartTrace.B;
            }
            synchronized (appStartTrace) {
                if (!appStartTrace.d) {
                    ProcessLifecycleOwner.m.j.a(appStartTrace);
                    Context applicationContext2 = context.getApplicationContext();
                    if (applicationContext2 instanceof Application) {
                        ((Application) applicationContext2).registerActivityLifecycleCallbacks(appStartTrace);
                        appStartTrace.y = appStartTrace.y || AppStartTrace.d((Application) applicationContext2);
                        appStartTrace.d = true;
                        appStartTrace.i = (Application) applicationContext2;
                    }
                }
            }
            executor.execute(new AppStartTrace.b(appStartTrace));
        }
        SessionManager.getInstance().initializeGaugeCollection();
        return c3612ee0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C4710je0 providesFirebasePerformance(InterfaceC3958gH interfaceC3958gH) {
        interfaceC3958gH.a(C3612ee0.class);
        C5130le0 c5130le0 = new C5130le0((C1198Id0) interfaceC3958gH.a(C1198Id0.class), (InterfaceC2400Xd0) interfaceC3958gH.a(InterfaceC2400Xd0.class), interfaceC3958gH.c(C6651sr1.class), interfaceC3958gH.c(W42.class));
        return (C4710je0) Y20.b(new C1690Ok1(new C6183qe0(new C5929pR(c5130le0, 1), new C7904yp(c5130le0, 1), new C5553ne0(c5130le0, 0), new C7851yb0(c5130le0, 1), new C5763oe0(), new C5343me0(), new C5973pe0()))).get();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<UG<?>> getComponents() {
        C7892yl1 c7892yl1 = new C7892yl1(InterfaceC5873p82.class, Executor.class);
        UG.a aVarA = UG.a(C4710je0.class);
        aVarA.a = LIBRARY_NAME;
        aVarA.a(C6996uX.b(C1198Id0.class));
        aVarA.a(new C6996uX(1, 1, C6651sr1.class));
        aVarA.a(C6996uX.b(InterfaceC2400Xd0.class));
        aVarA.a(new C6996uX(1, 1, W42.class));
        aVarA.a(C6996uX.b(C3612ee0.class));
        aVarA.f = new C6495s7(3);
        UG ugB = aVarA.b();
        UG.a aVarA2 = UG.a(C3612ee0.class);
        aVarA2.a = EARLY_LIBRARY_NAME;
        aVarA2.a(C6996uX.b(C1198Id0.class));
        aVarA2.a(C6996uX.a(AP1.class));
        aVarA2.a(new C6996uX((C7892yl1<?>) c7892yl1, 1, 0));
        aVarA2.c(2);
        aVarA2.f = new C4242he0(c7892yl1);
        return Arrays.asList(ugB, aVarA2.b(), C6973uP0.a(LIBRARY_NAME, "20.3.1"));
    }
}
