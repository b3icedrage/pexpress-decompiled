package com.jivosite.sdk.socket;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.jivosite.sdk.model.pojo.socket.SocketMessage;
import defpackage.AI1;
import defpackage.AbstractC8004zI1;
import defpackage.BI1;
import defpackage.C0994Fn0;
import defpackage.C2629a1;
import defpackage.C3309dA0;
import defpackage.C3338dK;
import defpackage.C3476e;
import defpackage.C4201hS;
import defpackage.C4724jh2;
import defpackage.C5660o8;
import defpackage.C6102qE1;
import defpackage.C6104qF0;
import defpackage.C6115qJ;
import defpackage.C6193qg2;
import defpackage.C6534sJ;
import defpackage.C6822tg2;
import defpackage.C6889u01;
import defpackage.EN1;
import defpackage.ES0;
import defpackage.EnumC5225m40;
import defpackage.EnumC5773og2;
import defpackage.FN1;
import defpackage.GN1;
import defpackage.InterfaceC1531Mk1;
import defpackage.InterfaceC3940gB;
import defpackage.InterfaceC7170vL;
import defpackage.JN1;
import defpackage.K8;
import defpackage.KN1;
import defpackage.KQ1;
import defpackage.KY1;
import defpackage.LL;
import defpackage.R42;
import defpackage.RQ0;
import defpackage.Rf2;
import defpackage.RunnableC3128cK;
import defpackage.S42;
import defpackage.Sf2;
import defpackage.V10;
import defpackage.WF0;
import defpackage.X10;
import java.net.URI;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/jivosite/sdk/socket/JivoWebSocketService;", "Landroid/app/Service;", "LAI1;", "LS42;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class JivoWebSocketService extends Service implements AI1, S42 {
    public static final /* synthetic */ int q = 0;
    public K8 d;
    public KN1 e;
    public BI1 g;
    public ES0 h;
    public R42 i;
    public C6102qE1 j;
    public InterfaceC7170vL k;
    public InterfaceC3940gB l;
    public AbstractC8004zI1 m;

    @Nullable
    public Rf2 n;

    @Nullable
    public C3338dK o;

    @NotNull
    public final a p = new a();

    public static final class a extends Sf2 {
        public a() {
        }

        @Override // defpackage.InterfaceC7873yg2
        public final void a() {
            JivoWebSocketService jivoWebSocketService = JivoWebSocketService.this;
            jivoWebSocketService.e().c();
            jivoWebSocketService.getState().h();
        }

        @Override // defpackage.InterfaceC7873yg2
        public final void b(@Nullable C6193qg2 c6193qg2) {
            C4201hS c4201hS = C6104qF0.a;
            C6104qF0.b("onError, " + c6193qg2);
            b builder = new b(c6193qg2, JivoWebSocketService.this);
            Intrinsics.checkNotNullParameter(builder, "builder");
            GN1 gn1 = new GN1();
            builder.invoke(gn1);
            EnumC5773og2 enumC5773og2 = c6193qg2.d;
            if (enumC5773og2 != null) {
                int i = GN1.a.a[enumC5773og2.ordinal()];
            }
            com.jivosite.sdk.socket.a aVar = gn1.a;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        @Override // defpackage.InterfaceC7873yg2
        public final void c(@Nullable String msg) {
            if (msg == null) {
                return;
            }
            JivoWebSocketService jivoWebSocketService = JivoWebSocketService.this;
            C3338dK c3338dK = jivoWebSocketService.o;
            if (c3338dK != null) {
                Handler handler = c3338dK.e;
                RunnableC3128cK runnableC3128cK = c3338dK.g;
                handler.removeCallbacks(runnableC3128cK);
                handler.postDelayed(runnableC3128cK, c3338dK.c);
            }
            if (StringsKt.I(msg)) {
                jivoWebSocketService.e().b(msg);
                C6104qF0.a("PONG");
                return;
            }
            jivoWebSocketService.e().g(msg);
            KN1 kn1 = jivoWebSocketService.e;
            SocketMessage socketMessage = null;
            if (kn1 == null) {
                Intrinsics.l("socketMessageHandler");
                throw null;
            }
            Intrinsics.checkNotNullParameter(msg, "msg");
            if (StringsKt.I(msg)) {
                C6104qF0.h("There is empty message from server, can't handle it");
                C6104qF0.h(" --> ".concat(msg));
                return;
            }
            try {
                socketMessage = (SocketMessage) kn1.c.a(SocketMessage.class).b(msg);
            } catch (Exception e) {
                C6104qF0.c("There is error on parse message", e);
                C6104qF0.b(" --> ".concat(msg));
            }
            if (socketMessage != null) {
                String str = socketMessage.a;
                if (!StringsKt.I(str)) {
                    C4201hS c4201hS = C6104qF0.a;
                    C6104qF0.e("Try to handle socket message \"" + str + '\"');
                    StringBuilder sb = new StringBuilder(" - msg=");
                    sb.append(kn1.d.a(msg, socketMessage));
                    C6104qF0.e(sb.toString());
                    Map<String, JN1> map = kn1.a;
                    JN1 jn1 = map.get(str);
                    if (jn1 == null) {
                        jn1 = map.get(((String) CollectionsKt.F(StringsKt__StringsKt.split$default(str, new String[]{"/"}, false, 0, 6, null))) + "/*");
                    }
                    if (jn1 != null) {
                        jn1.a(socketMessage);
                        C6104qF0.e("Socket message has been successfully handled \"" + str + '\"');
                        return;
                    }
                    kn1.b.a(socketMessage);
                    C6104qF0.h("There is unhandled message \"" + socketMessage + '\"');
                    return;
                }
            }
            C6104qF0.h("There is no necessary type field or message is null, can't handle it");
            C6104qF0.h(" --> ".concat(msg));
        }

        @Override // defpackage.InterfaceC7873yg2
        public final void d(@Nullable C6822tg2 c6822tg2) {
            V10 bVar;
            JivoWebSocketService jivoWebSocketService = JivoWebSocketService.this;
            ES0 es0E = jivoWebSocketService.e();
            int iB = c6822tg2 != null ? c6822tg2.b() : 0;
            String strC = c6822tg2 != null ? c6822tg2.c() : null;
            if (strC == null) {
                strC = "";
            }
            es0E.e(iB, strC);
            C4201hS c4201hS = C6104qF0.a;
            StringBuilder sb = new StringBuilder("Socket disconnected, code=");
            sb.append(c6822tg2 != null ? Integer.valueOf(c6822tg2.b()) : null);
            sb.append(", reason=");
            sb.append(c6822tg2 != null ? c6822tg2.c() : null);
            C6104qF0.e(sb.toString());
            Rf2 rf2 = jivoWebSocketService.n;
            if (rf2 != null) {
                rf2.f(this);
            }
            AbstractC8004zI1 state = jivoWebSocketService.getState();
            if (!(state instanceof C6534sJ)) {
                if (state instanceof X10) {
                    state.i(V10.e.a);
                    return;
                } else {
                    if (state instanceof KQ1) {
                        state.i(V10.d.a);
                        return;
                    }
                    return;
                }
            }
            Integer numValueOf = c6822tg2 != null ? Integer.valueOf(c6822tg2.b()) : null;
            if (numValueOf != null && numValueOf.intValue() == 1000) {
                String strC2 = c6822tg2.c();
                bVar = V10.a.a;
                bVar.getClass();
                if (Intrinsics.a(strC2, "Blacklisted")) {
                    InterfaceC3940gB interfaceC3940gB = jivoWebSocketService.l;
                    if (interfaceC3940gB == null) {
                        Intrinsics.l("chatStateRepository");
                        throw null;
                    }
                    interfaceC3940gB.E();
                } else {
                    String strC3 = c6822tg2.c();
                    Intrinsics.checkNotNullExpressionValue(strC3, "clientCloseFrame.closeReason");
                    bVar = new V10.b(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, strC3);
                }
            } else if (numValueOf != null && numValueOf.intValue() == 1013) {
                String strC4 = c6822tg2.c();
                Intrinsics.checkNotNullExpressionValue(strC4, "clientCloseFrame.closeReason");
                bVar = new V10.b(1013, strC4);
            } else {
                bVar = V10.e.a;
            }
            state.i(bVar);
        }
    }

    @Override // defpackage.S42
    public final void a(@NotNull SocketMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        C4201hS c4201hS = C6104qF0.a;
        C6104qF0.a("Send message through transmitter - " + message);
        getState().f(message);
    }

    @Override // defpackage.S42
    public final void b(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        C4201hS c4201hS = C6104qF0.a;
        C6104qF0.a("Send message through transmitter - " + message);
        getState().g(message);
    }

    @Override // defpackage.AI1
    @NotNull
    public final AbstractC8004zI1 c(@NotNull Class<? extends AbstractC8004zI1> stateClass) {
        Intrinsics.checkNotNullParameter(stateClass, "state");
        BI1 bi1 = this.g;
        if (bi1 == null) {
            Intrinsics.l("serviceStateFactory");
            throw null;
        }
        Intrinsics.checkNotNullParameter(stateClass, "stateClass");
        InterfaceC1531Mk1<AbstractC8004zI1> interfaceC1531Mk1 = bi1.a.get(stateClass);
        if (interfaceC1531Mk1 == null) {
            throw new IllegalArgumentException("Unknown service state class " + stateClass);
        }
        try {
            AbstractC8004zI1 abstractC8004zI1 = interfaceC1531Mk1.get();
            Intrinsics.c(abstractC8004zI1, "null cannot be cast to non-null type T of com.jivosite.sdk.socket.states.ServiceStateFactory.create");
            AbstractC8004zI1 abstractC8004zI2 = abstractC8004zI1;
            C4201hS c4201hS = C6104qF0.a;
            C6104qF0.e("Change state to " + abstractC8004zI2);
            this.m = abstractC8004zI2;
            return abstractC8004zI2;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public final void d() {
        boolean z;
        int i;
        Matcher matcher;
        Matcher matcher2;
        Rf2 rf2 = this.n;
        if (rf2 != null) {
            rf2.f(this.p);
        }
        K8 k8 = this.d;
        if (k8 == null) {
            Intrinsics.l("socketEndpointProvider");
            throw null;
        }
        URI uriA = ((FN1) k8.get()).a();
        new TreeMap(String.CASE_INSENSITIVE_ORDER).clear();
        if (uriA == null) {
            throw new IllegalArgumentException("The given URI is null.");
        }
        String scheme = uriA.getScheme();
        String userInfo = uriA.getUserInfo();
        SecureRandom secureRandom = C6889u01.a;
        String host = uriA.getHost();
        if (host == null) {
            String rawAuthority = uriA.getRawAuthority();
            host = (rawAuthority == null || (matcher = Pattern.compile("^(.*@)?([^:]+)(:\\d+)?$").matcher(rawAuthority)) == null || !matcher.matches()) ? null : matcher.group(2);
            if (host == null) {
                String string = uriA.toString();
                host = (string == null || (matcher2 = Pattern.compile("^\\w+://([^@/]*@)?([^:/]+)(:\\d+)?(/.*)?$").matcher(string)) == null || !matcher2.matches()) ? null : matcher2.group(2);
            }
        }
        int port = uriA.getPort();
        String rawPath = uriA.getRawPath();
        String rawQuery = uriA.getRawQuery();
        if (scheme == null || scheme.length() == 0) {
            throw new IllegalArgumentException("The scheme part is empty.");
        }
        if ("wss".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
            z = true;
        } else {
            if (!"ws".equalsIgnoreCase(scheme) && !"http".equalsIgnoreCase(scheme)) {
                throw new IllegalArgumentException("Bad scheme: ".concat(scheme));
            }
            z = false;
        }
        if (host == null || host.length() == 0) {
            throw new IllegalArgumentException("The host part is empty.");
        }
        if (rawPath == null || rawPath.length() == 0) {
            rawPath = "/";
        } else if (!rawPath.startsWith("/")) {
            rawPath = "/".concat(rawPath);
        }
        if (port >= 0) {
            i = port;
        } else {
            i = z ? 443 : 80;
        }
        EN1 en1 = new EN1(z ? SSLSocketFactory.getDefault() : SocketFactory.getDefault(), new C5660o8(host, i), null, null);
        en1.c = EnumC5225m40.d;
        en1.d = 250;
        en1.e = true;
        if (port >= 0) {
            host = host + ":" + port;
        }
        if (rawQuery != null) {
            rawPath = C2629a1.b(rawPath, "?", rawQuery);
        }
        Rf2 rf3 = new Rf2(z, userInfo, host, rawPath, en1);
        C4201hS c4201hS = C6104qF0.a;
        C6104qF0.e("Try to connect to endpoint: " + uriA);
        StringBuilder sb = new StringBuilder("JivoSDK-Android/2.1.0 (Mobile; Device=");
        sb.append(Build.MANUFACTURER);
        sb.append('/');
        sb.append(Build.MODEL);
        sb.append("; Platform=Android/");
        sb.append(Build.VERSION.RELEASE);
        sb.append(',');
        sb.append(Build.VERSION.SDK_INT);
        sb.append("; Host=");
        C6102qE1 c6102qE1 = this.j;
        if (c6102qE1 == null) {
            Intrinsics.l("sdkContext");
            throw null;
        }
        sb.append(c6102qE1.a.getPackageName());
        sb.append("; WebSocket)");
        String string2 = sb.toString();
        C0994Fn0 c0994Fn0 = rf3.c;
        c0994Fn0.getClass();
        if (string2 == null) {
            string2 = "";
        }
        synchronized (c0994Fn0) {
            try {
                if (c0994Fn0.e == null) {
                    c0994Fn0.e = new ArrayList();
                }
                c0994Fn0.e.add(new String[]{"User-Agent", string2});
            } catch (Throwable th) {
                throw th;
            }
        }
        a aVar = this.p;
        RQ0 rq0 = rf3.d;
        if (aVar == null) {
            rq0.getClass();
        } else {
            synchronized (rq0.b) {
                rq0.b.add(aVar);
                rq0.c = true;
            }
        }
        KY1 ky1 = KY1.g;
        C6115qJ c6115qJ = new C6115qJ("ConnectThread", rf3, ky1);
        RQ0 rq1 = rf3.d;
        if (rq1 != null) {
            rq1.e(ky1, c6115qJ);
        }
        c6115qJ.start();
        e().a();
        this.n = rf3;
    }

    @NotNull
    public final ES0 e() {
        ES0 es0 = this.h;
        if (es0 != null) {
            return es0;
        }
        Intrinsics.l("messageLogger");
        throw null;
    }

    public final void f() {
        C3338dK c3338dK = this.o;
        if (c3338dK != null) {
            C6104qF0.e("Release connection keeper");
            Handler handler = c3338dK.e;
            handler.removeCallbacks(c3338dK.f);
            handler.removeCallbacks(c3338dK.g);
        }
        this.o = null;
    }

    public final void g() {
        C6104qF0.a("Unsubscribe from message transmitter");
        R42 r42 = this.i;
        if (r42 != null) {
            r42.b(this);
        } else {
            Intrinsics.l("messageTransmitter");
            throw null;
        }
    }

    @Override // defpackage.AI1
    @NotNull
    public final AbstractC8004zI1 getState() {
        AbstractC8004zI1 abstractC8004zI1 = this.m;
        if (abstractC8004zI1 != null) {
            return abstractC8004zI1;
        }
        Intrinsics.l("socketState");
        throw null;
    }

    @Override // android.app.Service
    @Nullable
    public final IBinder onBind(@Nullable Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        C4201hS c4201hS = C6104qF0.a;
        Intrinsics.checkNotNullParameter(this, "service");
        C4201hS.b bVar = C6104qF0.b;
        if (bVar == null) {
            WF0 wf0D = C6104qF0.d();
            C4201hS.b bVar2 = new C4201hS.b(((C4201hS) wf0D).a, new C4724jh2(this), new C3476e(), new LL(13));
            C6104qF0.b = bVar2;
            bVar = bVar2;
        }
        this.d = bVar.b;
        this.e = (KN1) bVar.A.get();
        this.g = (BI1) bVar.M.get();
        C4201hS c4201hS2 = bVar.a;
        this.h = (ES0) c4201hS2.G.get();
        this.i = (R42) c4201hS2.x.get();
        this.j = (C6102qE1) c4201hS2.b.get();
        this.k = (InterfaceC7170vL) c4201hS2.z.get();
        this.l = (InterfaceC3940gB) c4201hS2.q.get();
        C6104qF0.e("Service has been created");
        c(C3309dA0.class);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        C6104qF0.b = null;
        C6104qF0.e("Service has been destroyed");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.app.Service
    public final int onStartCommand(@Nullable Intent intent, int i, int i2) {
        String action;
        if (intent != null && (action = intent.getAction()) != null) {
            switch (action) {
                case "com.jivosite.sdk.socket.JivoWebSocketService.ACTION_STOP":
                    C6104qF0.e("Received stop command");
                    getState().k();
                    break;
                case "com.jivosite.sdk.socket.JivoWebSocketService.ACTION_START":
                    C6104qF0.e("Received start command");
                    getState().b();
                    break;
                case "com.jivosite.sdk.socket.JivoWebSocketService.ACTION_RESTART":
                    C6104qF0.e("Received restart command");
                    getState().e();
                    break;
                case "com.jivosite.sdk.socket.JivoWebSocketService.ACTION_LOAD_CONFIG":
                    C6104qF0.e("Received load config command");
                    getState().b();
                    break;
                case "com.jivosite.sdk.socket.JivoWebSocketService.ACTION_RECONNECT":
                    C6104qF0.e("Received reconnect command");
                    getState().d(true);
                    break;
                default:
                    if (action.equals("com.jivosite.sdk.socket.JivoWebSocketService.ACTION_STOP")) {
                        C6104qF0.e("Received stop command");
                        getState().k();
                        break;
                    }
                    C4201hS c4201hS = C6104qF0.a;
                    C6104qF0.h("Unknown command ".concat(action));
                    break;
            }
            return 2;
        }
        return 2;
    }
}
