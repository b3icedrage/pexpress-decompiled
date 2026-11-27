package com.base.app.services;

import android.annotation.SuppressLint;
import android.content.Context;
import com.appsflyer.AppsFlyerLib;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.jivosite.sdk.model.pojo.push.U;
import defpackage.C0957Fb;
import defpackage.C1007Fr1;
import defpackage.C2703aM1;
import defpackage.C3362dS;
import defpackage.C3382dY1;
import defpackage.C3641el1;
import defpackage.C3903g11;
import defpackage.C4201hS;
import defpackage.C4923kf;
import defpackage.C5207m;
import defpackage.C6102qE1;
import defpackage.C6104qF0;
import defpackage.C7279vr;
import defpackage.C7492wr1;
import defpackage.C7700xr;
import defpackage.GP1;
import defpackage.HV;
import defpackage.InterfaceC1153Ho0;
import defpackage.InterfaceC3432dl1;
import defpackage.InterfaceC5570ni1;
import defpackage.InterfaceC5889pD1;
import defpackage.U0;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/base/app/services/SupportChatFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "AppBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"MissingFirebaseInstanceTokenRefresh"})
public class SupportChatFirebaseMessagingService extends FirebaseMessagingService {
    public C4923kf d;

    @Override // android.app.Service
    public final void onCreate() {
        Context context = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        if (C7279vr.d == null) {
            C7279vr.d = new C3362dS(new C7700xr(context), new C0957Fb(), new U0(10), new C7279vr(), new C5207m());
        }
        C3362dS c3362dS = C7279vr.d;
        Intrinsics.checkNotNull(c3362dS);
        this.d = c3362dS.j.get();
        super.onCreate();
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onMessageReceived(@NotNull C7492wr1 message) {
        Intrinsics.checkNotNullParameter(message, "message");
        super.onMessageReceived(message);
        if (((C2703aM1) message.getData()).containsKey("af-uinstall-tracking")) {
            return;
        }
        C4201hS c4201hS = C6104qF0.a;
        Intrinsics.checkNotNullParameter(message, "message");
        if (C6104qF0.a != null) {
            C4201hS c4201hS2 = (C4201hS) C6104qF0.d();
            C3903g11 moshi = (C3903g11) c4201hS2.e.get();
            Map delegates = Collections.singletonMap("JV_MESSAGE", new C3382dY1((C6102qE1) c4201hS2.b.get(), (InterfaceC5889pD1) c4201hS2.g.get()));
            Intrinsics.checkNotNullParameter(delegates, "delegates");
            HV pushMessageHandler = new HV(delegates);
            InterfaceC5889pD1 schedulers = (InterfaceC5889pD1) c4201hS2.g.get();
            InterfaceC3432dl1 pushApi = (InterfaceC3432dl1) c4201hS2.j.get();
            InterfaceC5570ni1 profileRepository = (InterfaceC5570ni1) c4201hS2.k.get();
            InterfaceC1153Ho0 historyRepository = (InterfaceC1153Ho0) c4201hS2.n.get();
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(pushMessageHandler, "pushMessageHandler");
            Intrinsics.checkNotNullParameter(schedulers, "schedulers");
            Intrinsics.checkNotNullParameter(pushApi, "pushApi");
            Intrinsics.checkNotNullParameter(profileRepository, "profileRepository");
            Intrinsics.checkNotNullParameter(historyRepository, "historyRepository");
            final C1007Fr1 c1007Fr1 = new C1007Fr1(moshi, pushMessageHandler, schedulers, pushApi, profileRepository, historyRepository);
            Intrinsics.checkNotNullParameter(message, "message");
            C6104qF0.e("Received push message");
            try {
                C3641el1 c3641el1A = c1007Fr1.a(message);
                U u = c3641el1A.a;
                List listSplit$default = StringsKt__StringsKt.split$default(u.b, new String[]{":"}, false, 0, 6, null);
                final String str = (String) listSplit$default.get(0);
                final String str2 = (String) listSplit$default.get(1);
                boolean zL = profileRepository.l(str2);
                final String str3 = u.a;
                if (!zL) {
                    C6104qF0.h("Push for another user, clientId = " + str2 + ", pushId = " + str3);
                    return;
                }
                historyRepository.h();
                schedulers.b().execute(new Runnable() { // from class: yr1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1007Fr1 this$0 = c1007Fr1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String siteId = str;
                        Intrinsics.checkNotNullParameter(siteId, "$siteId");
                        String clientId = str2;
                        Intrinsics.checkNotNullParameter(clientId, "$clientId");
                        String pushId = str3;
                        Intrinsics.checkNotNullParameter(pushId, "$pushId");
                        InterfaceC5889pD1 schedulers2 = this$0.b;
                        Intrinsics.checkNotNullParameter(schedulers2, "schedulers");
                        C8122zr1 supplier = new C8122zr1(this$0, siteId, clientId, pushId);
                        Intrinsics.checkNotNullParameter(supplier, "supplier");
                        C0617Ar1 handler = C0617Ar1.d;
                        Intrinsics.checkNotNullParameter(handler, "handler");
                        if (handler != null) {
                            EY0<C3457dt1<Object>> ey0 = new Z31(supplier, handler, schedulers2).a;
                            ey0.f(new C0929Er1(ey0));
                        } else {
                            C6104qF0.b("You need to declare handle response method");
                            Unit.a.getClass();
                            throw new IllegalArgumentException("kotlin.Unit");
                        }
                    }
                });
                try {
                    pushMessageHandler.a(c3641el1A);
                } catch (Exception e) {
                    C6104qF0.c("Push message handling problem", e);
                }
            } catch (Exception unused) {
                C6104qF0.b("Push message parsing problem");
            }
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onNewToken(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        super.onNewToken(token);
        AppsFlyerLib.getInstance().updateServerUninstallToken(getApplicationContext(), token);
        C6104qF0.g(token);
        C4923kf c4923kf = this.d;
        if (c4923kf == null) {
            Intrinsics.l("appData");
            throw null;
        }
        GP1 gp1 = c4923kf.C;
        gp1.getClass();
        gp1.m(null, token);
    }
}
