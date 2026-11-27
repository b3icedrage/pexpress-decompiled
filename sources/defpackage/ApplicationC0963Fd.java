package defpackage;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.SystemClock;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.g;
import androidx.lifecycle.k;
import com.api.feature.analytics.reporters.ReporterApi;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.share.SessionReadyListener;
import com.base.app.services.OneSignalNotificationOpenedHandler;
import com.base.app.services.WebSocketService;
import com.jivosite.sdk.lifecycle.JivoLifecycleObserver;
import io.sentry.android.core.b0;
import io.sentry.android.core.performance.h;
import io.sentry.android.core.performance.i;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Fd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LFd;", "Landroid/app/Application;", "LGd;", "<init>", "()V", "AppBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class ApplicationC0963Fd extends Application implements InterfaceC1041Gd {
    public static final /* synthetic */ int F = 0;

    @Nullable
    public WebSocketService A;

    @NotNull
    public final d B;

    @NotNull
    public final KW1 C;

    @NotNull
    public final e D;

    @Nullable
    public C2936bP1 E;
    public C4934kh2 d;
    public ZT1 e;
    public C7054um0 g;
    public ReporterApi h;
    public OneSignalNotificationOpenedHandler i;
    public C4923kf j;
    public InterfaceC6168qa1 k;
    public WA l;
    public InterfaceC0565Aa0 m;
    public IV1 n;
    public C2119Tx1 o;
    public FV0 p;
    public C1435Le0 q;
    public InterfaceC0565Aa0 r;
    public InterfaceC1446Li s;
    public C2594Zq t;
    public K61 u;
    public C4245hf v;
    public InterfaceC2570Zi w;
    public AbstractC3900g02 x;
    public boolean y = true;

    @NotNull
    public String z;

    /* JADX INFO: renamed from: Fd$a */
    @InterfaceC3368dU(c = "com.base.app.app.App$isFirstLaunch$1", f = "App.kt", l = {159}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ boolean g;

        /* JADX INFO: renamed from: Fd$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.base.app.app.App$isFirstLaunch$1$1", f = "App.kt", l = {}, m = "invokeSuspend")
        public static final class C0034a extends AW1 implements Function1<JM<? super Boolean>, Object> {
            public final /* synthetic */ boolean d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0034a(boolean z, JM<? super C0034a> jm) {
                super(1, jm);
                this.d = z;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(JM<?> jm) {
                return new C0034a(this.d, jm);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(JM<? super Boolean> jm) {
                return ((C0034a) create(jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                MN mn = MN.d;
                C1795Pt1.b(obj);
                return Boolean.valueOf(this.d);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, JM<? super a> jm) {
            super(2, jm);
            this.g = z;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return ApplicationC0963Fd.this.new a(this.g, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C1435Le0 c1435Le0 = ApplicationC0963Fd.this.q;
                if (c1435Le0 == null) {
                    Intrinsics.l("firstStartValueUseCase");
                    throw null;
                }
                C0034a c0034a = new C0034a(this.g, null);
                this.d = 1;
                if (c1435Le0.m(c0034a, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: Fd$b */
    @InterfaceC3368dU(c = "com.base.app.app.App$onCreate$3", f = "App.kt", l = {225, 226}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: Fd$b$a */
        @InterfaceC3368dU(c = "com.base.app.app.App$onCreate$3$1", f = "App.kt", l = {229}, m = "invokeSuspend")
        public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public final /* synthetic */ ApplicationC0963Fd e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ApplicationC0963Fd applicationC0963Fd, JM<? super a> jm) {
                super(2, jm);
                this.e = applicationC0963Fd;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                return new a(this.e, jm);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(KN kn, JM<? super Unit> jm) {
                return ((a) create(kn, jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                MN mn = MN.d;
                int i = this.d;
                if (i == 0) {
                    C1795Pt1.b(obj);
                    this.d = 1;
                    int i2 = ApplicationC0963Fd.F;
                    ReporterApi reporterApi = this.e.h;
                    if (reporterApi == null) {
                        Intrinsics.l("reporter");
                        throw null;
                    }
                    Unit unitC = reporterApi.c(H91.PLATFORM, "android", false);
                    if (unitC != mn) {
                        unitC = Unit.a;
                    }
                    if (unitC == mn) {
                        return mn;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C1795Pt1.b(obj);
                }
                return Unit.a;
            }
        }

        public b(JM<? super b> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return ApplicationC0963Fd.this.new b(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((b) create(kn, jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
        
            if (r9 == r1) goto L20;
         */
        @Override // defpackage.AbstractC7487wq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 223
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ApplicationC0963Fd.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: Fd$c */
    @InterfaceC3368dU(c = "com.base.app.app.App$onCreate$4", f = "App.kt", l = {239}, m = "invokeSuspend")
    public static final class c extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: Fd$c$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ ApplicationC0963Fd d;

            public a(ApplicationC0963Fd applicationC0963Fd) {
                this.d = applicationC0963Fd;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                this.d.d(((Boolean) obj).booleanValue());
                return Unit.a;
            }
        }

        public c(JM<? super c> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return ApplicationC0963Fd.this.new c(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((c) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                ApplicationC0963Fd applicationC0963Fd = ApplicationC0963Fd.this;
                C1435Le0 c1435Le0 = applicationC0963Fd.q;
                if (c1435Le0 == null) {
                    Intrinsics.l("firstStartValueUseCase");
                    throw null;
                }
                InterfaceC6396rf0 interfaceC6396rf0M = C4466ii.m(c1435Le0.l());
                a aVar = new a(applicationC0963Fd);
                this.d = 1;
                if (interfaceC6396rf0M.c(aVar, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: Fd$d */
    public static final class d implements ServiceConnection {
        public d() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName name, IBinder service) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(service, "service");
            WebSocketService webSocketService = ((AbstractServiceC7597xN.a) service).b;
            ApplicationC0963Fd applicationC0963Fd = ApplicationC0963Fd.this;
            applicationC0963Fd.A = webSocketService;
            C4934kh2 c4934kh2 = applicationC0963Fd.d;
            if (c4934kh2 == null) {
                Intrinsics.l("webSocketServiceProvider");
                throw null;
            }
            c4934kh2.a = webSocketService;
            C2119Tx1 c2119Tx1 = applicationC0963Fd.o;
            if (c2119Tx1 == null) {
                Intrinsics.l("robotNotificationManager");
                throw null;
            }
            c2119Tx1.m(webSocketService);
            FV0 fv0 = applicationC0963Fd.p;
            if (fv0 == null) {
                Intrinsics.l("mainActivityProvider");
                throw null;
            }
            ComponentCallbacks2 componentCallbacks2A = fv0.a();
            InterfaceC8042zV0 interfaceC8042zV0 = componentCallbacks2A instanceof InterfaceC8042zV0 ? (InterfaceC8042zV0) componentCallbacks2A : null;
            if (interfaceC8042zV0 != null) {
                WebSocketService webSocketService2 = applicationC0963Fd.A;
                Intrinsics.checkNotNull(webSocketService2);
                interfaceC8042zV0.b(webSocketService2);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName name) {
            Intrinsics.checkNotNullParameter(name, "name");
            ApplicationC0963Fd applicationC0963Fd = ApplicationC0963Fd.this;
            applicationC0963Fd.A = null;
            C4934kh2 c4934kh2 = applicationC0963Fd.d;
            if (c4934kh2 != null) {
                c4934kh2.a = null;
            } else {
                Intrinsics.l("webSocketServiceProvider");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: Fd$e */
    public static final class e extends kotlin.coroutines.a implements EN {
        @Override // defpackage.EN
        public final void P(@NotNull Throwable th) {
            b0.f("App", "startup analytics failed", th);
            C1910Rg c1910Rg = U0.v;
            if (c1910Rg != null) {
                c1910Rg.invoke(th, OW0.b(new Pair("phase", "app_start_analytics")));
            }
        }
    }

    public ApplicationC0963Fd() {
        int i = 1;
        XO0.b(new O4(this, i));
        this.z = "";
        this.B = new d();
        this.C = XO0.b(new P4(this, i));
        this.D = new e(EN.a.d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object e(ApplicationC0963Fd applicationC0963Fd, LM lm) {
        C6387rd c6387rd;
        if (lm instanceof C6387rd) {
            c6387rd = (C6387rd) lm;
            int i = c6387rd.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6387rd.h = i - Integer.MIN_VALUE;
            } else {
                c6387rd = new C6387rd(applicationC0963Fd, lm);
            }
        } else {
            c6387rd = new C6387rd(applicationC0963Fd, lm);
        }
        Object objO = c6387rd.e;
        MN mn = MN.d;
        int i2 = c6387rd.h;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            C6945uG c6945uG = (C6945uG) applicationC0963Fd.g().k.getValue();
            if (c6945uG != null) {
                return String.valueOf(c6945uG.a);
            }
            AbstractC3900g02 abstractC3900g02 = applicationC0963Fd.x;
            if (abstractC3900g02 == null) {
                Intrinsics.l("tokenUseCase");
                throw null;
            }
            InterfaceC6396rf0<String> interfaceC6396rf0K = abstractC3900g02.k();
            c6387rd.d = applicationC0963Fd;
            c6387rd.h = 1;
            objO = C4466ii.o(interfaceC6396rf0K, c6387rd);
            if (objO != mn) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objO);
            return objO;
        }
        applicationC0963Fd = c6387rd.d;
        C1795Pt1.b(objO);
        if (objO == null) {
            return null;
        }
        C6597sd c6597sd = new C6597sd(applicationC0963Fd, null);
        c6387rd.d = null;
        c6387rd.h = 2;
        Object objC = OZ1.c(10000L, c6597sd, c6387rd);
        return objC == mn ? mn : objC;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object f(ApplicationC0963Fd applicationC0963Fd, LM lm) {
        C0885Ed c0885Ed;
        if (lm instanceof C0885Ed) {
            c0885Ed = (C0885Ed) lm;
            int i = c0885Ed.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0885Ed.h = i - Integer.MIN_VALUE;
            } else {
                c0885Ed = new C0885Ed(applicationC0963Fd, lm);
            }
        } else {
            c0885Ed = new C0885Ed(applicationC0963Fd, lm);
        }
        Object objA = c0885Ed.e;
        MN mn = MN.d;
        int i2 = c0885Ed.h;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            ZT1 zt1 = applicationC0963Fd.e;
            if (zt1 == null) {
                Intrinsics.l("subIdProvider");
                throw null;
            }
            c0885Ed.d = applicationC0963Fd;
            c0885Ed.h = 1;
            objA = zt1.a(c0885Ed);
            if (objA == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            applicationC0963Fd = c0885Ed.d;
            C1795Pt1.b(objA);
        }
        applicationC0963Fd.z = (String) objA;
        return Unit.a;
    }

    @Override // defpackage.InterfaceC1041Gd
    public final void a() {
        this.A = null;
        C4934kh2 c4934kh2 = this.d;
        if (c4934kh2 != null) {
            c4934kh2.a = null;
        } else {
            Intrinsics.l("webSocketServiceProvider");
            throw null;
        }
    }

    @Override // defpackage.InterfaceC1041Gd
    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final d getB() {
        return this.B;
    }

    @Override // defpackage.InterfaceC1041Gd
    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getY() {
        return this.y;
    }

    @Override // defpackage.InterfaceC1041Gd
    public final void d(boolean z) {
        C5189lv.k(C3784fT.a, null, new a(z, null), 3);
        this.y = z;
    }

    @NotNull
    public final C4923kf g() {
        C4923kf c4923kf = this.j;
        if (c4923kf != null) {
            return c4923kf;
        }
        Intrinsics.l("appDataRepository");
        throw null;
    }

    @Override // android.app.Application
    public void onCreate() {
        Object objA;
        int i = 0;
        h hVar = h.u;
        long jUptimeMillis = SystemClock.uptimeMillis();
        h hVarC = h.c();
        i iVar = hVarC.j;
        if (iVar.g == 0) {
            iVar.f(jUptimeMillis);
            hVarC.h(this);
        }
        C5758od config = new C5758od(i);
        Intrinsics.checkNotNullParameter(config, "config");
        super.onCreate();
        ((InterfaceC1356Ke) this.C.getValue()).a(this);
        androidx.work.a.C0241a c0241a = new androidx.work.a.C0241a();
        C2594Zq c2594Zq = this.t;
        if (c2594Zq == null) {
            Intrinsics.l("baseWorkerFactory");
            throw null;
        }
        c0241a.a = c2594Zq;
        androidx.work.a aVar = new androidx.work.a(c0241a);
        Intrinsics.checkNotNullExpressionValue(aVar, "build(...)");
        C4736jk2.c(this, aVar);
        InterfaceC1446Li interfaceC1446Li = this.s;
        if (interfaceC1446Li == null) {
            Intrinsics.l("applicationVersionProvider");
            throw null;
        }
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        interfaceC1446Li.b(applicationContext);
        InterfaceC6168qa1 interfaceC6168qa1 = this.k;
        if (interfaceC6168qa1 == null) {
            Intrinsics.l("ourAnalyticsReporter");
            throw null;
        }
        interfaceC6168qa1.i(this, C3784fT.a, new C0807Dd(g().k, i));
        String widgetId = AM.c(this, "com.jivosite.sdk.aplKey");
        Context appContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(appContext, "getApplicationContext(...)");
        C4201hS c4201hS = C6104qF0.a;
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter("", "host");
        C4201hS c4201hS2 = new C4201hS(new C6731tE1(appContext, widgetId), new C2432Xo(), new C5208m0(11), new ED(), new C5027l8());
        Intrinsics.checkNotNullExpressionValue(c4201hS2, "builder()\n            .s…Id))\n            .build()");
        Intrinsics.checkNotNullParameter(c4201hS2, "<set-?>");
        C6104qF0.a = c4201hS2;
        C6104qF0.g = (C6102qE1) ((C4201hS) C6104qF0.d()).b.get();
        C6104qF0.h = (EK1) ((C4201hS) C6104qF0.d()).c.get();
        Intrinsics.checkNotNullParameter("", "<this>");
        if (!StringsKt.I("")) {
            Pattern patternCompile = Pattern.compile("^([a-z0-9]+(-[a-z0-9]+)*\\.)+[a-z]{2,}$");
            String lowerCase = "".toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (patternCompile.matcher(lowerCase).matches()) {
                EK1 ek1 = C6104qF0.h;
                if (ek1 == null) {
                    Intrinsics.l("storage");
                    throw null;
                }
                Intrinsics.checkNotNullParameter("", "<set-?>");
                ek1.h.b(EK1.z[7], "");
            }
        }
        C6102qE1 c6102qE1 = C6104qF0.g;
        if (c6102qE1 == null) {
            Intrinsics.l("sdkContext");
            throw null;
        }
        EK1 ek2 = C6104qF0.h;
        if (ek2 == null) {
            Intrinsics.l("storage");
            throw null;
        }
        Object obj = ((C4201hS) C6104qF0.d()).B.get();
        Intrinsics.checkNotNullExpressionValue(obj, "jivoSdkComponent.historyUseCase().get()");
        JivoLifecycleObserver jivoLifecycleObserver = new JivoLifecycleObserver(c6102qE1, ek2, (C2511Yo0) obj);
        ProcessLifecycleOwner.m.j.a(jivoLifecycleObserver);
        C6104qF0.f = jivoLifecycleObserver;
        C5189lv.k(C3286d41.a, C6266r20.a, new C0651Bd(this, null), 2);
        C7766y91.a().getDebug().setLogLevel(C3461dv.a);
        Intrinsics.checkNotNullParameter(this, "context");
        Intrinsics.checkNotNullParameter("beb479d7-2b8b-437e-a135-97a26e9948ad", "appId");
        C7766y91.a().initWithContext(this, "beb479d7-2b8b-437e-a135-97a26e9948ad");
        InterfaceC3250cu0 notifications = C7766y91.a().getNotifications();
        OneSignalNotificationOpenedHandler oneSignalNotificationOpenedHandler = this.i;
        if (oneSignalNotificationOpenedHandler == null) {
            Intrinsics.l("oneSignalNotificationOpenedHandler");
            throw null;
        }
        notifications.mo28addClickListener(oneSignalNotificationOpenedHandler);
        try {
            C1717Ot1.a aVar2 = C1717Ot1.e;
            C4245hf c4245hf = this.v;
            if (c4245hf == null) {
                Intrinsics.l("appDataReadinessProbe");
                throw null;
            }
            c4245hf.f();
            objA = Unit.a;
            Throwable thA = C1717Ot1.a(objA);
            if (thA != null) {
                b0.f("AppDataReadinessProbe", "start failed", thA);
            }
            final AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
            appsFlyerLib.setDebugLog(false);
            ProcessLifecycleOwner.m.j.a(new k() { // from class: md
                @Override // androidx.lifecycle.k
                public final void b(FP0 fp0, g.a event) {
                    C2936bP1 c2936bP1;
                    int i2 = ApplicationC0963Fd.F;
                    Intrinsics.checkNotNullParameter(fp0, "<unused var>");
                    Intrinsics.checkNotNullParameter(event, "event");
                    if (event != g.a.ON_STOP || (c2936bP1 = this.d.E) == null) {
                        return;
                    }
                    c2936bP1.l(null);
                }
            });
            registerActivityLifecycleCallbacks(new C7017ud());
            appsFlyerLib.init(AM.c(this, "com.appsflyer.sdk.aplKey"), new C6807td(this), this);
            appsFlyerLib.registerSessionReadyListener(new SessionReadyListener() { // from class: nd
                @Override // com.appsflyer.share.SessionReadyListener
                public final void onSessionReady() {
                    ApplicationC0963Fd applicationC0963Fd = this.a;
                    C2936bP1 c2936bP1 = applicationC0963Fd.E;
                    if (c2936bP1 != null) {
                        c2936bP1.l(null);
                    }
                    applicationC0963Fd.E = C5189lv.k(C3784fT.a, null, new C7858yd(applicationC0963Fd, null, appsFlyerLib), 3);
                }
            });
            C4718jg0 c4718jg0 = new C4718jg0(C4466ii.m(new C7648xd(new C4250hg0(g().k, 0), i)), new C8068zd(this, null, appsFlyerLib));
            EM em = C3784fT.a;
            C4466ii.v(em, c4718jg0);
            C4466ii.v(em, new C4718jg0(g().v, new C0573Ad(this, null)));
            EM em2 = C3286d41.a;
            RV rv = C6266r20.a;
            rv.getClass();
            C5189lv.k(em2, CoroutineContext.Element.a.c(rv, this.D), new b(null), 2);
            C5189lv.k(em, rv, new c(null), 2);
            h.d(this);
        } catch (Throwable th) {
            C1717Ot1.a aVar3 = C1717Ot1.e;
            objA = C1795Pt1.a(th);
        }
    }
}
