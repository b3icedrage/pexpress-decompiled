package com.jivosite.sdk.lifecycle;

import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.jivosite.sdk.socket.JivoWebSocketService;
import defpackage.C0957Fb;
import defpackage.C2511Yo0;
import defpackage.C4201hS;
import defpackage.C6102qE1;
import defpackage.C6104qF0;
import defpackage.EK1;
import defpackage.FP0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jivosite/sdk/lifecycle/JivoLifecycleObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class JivoLifecycleObserver implements DefaultLifecycleObserver {

    @NotNull
    public final C6102qE1 d;

    @NotNull
    public final EK1 e;

    @NotNull
    public final C2511Yo0 g;
    public boolean h;

    public JivoLifecycleObserver(@NotNull C6102qE1 sdkContext, @NotNull EK1 storage, @NotNull C2511Yo0 historyUseCase) {
        Intrinsics.checkNotNullParameter(sdkContext, "sdkContext");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(historyUseCase, "historyUseCase");
        this.d = sdkContext;
        this.e = storage;
        this.g = historyUseCase;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(@NotNull FP0 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        final C2511Yo0 c2511Yo0 = this.g;
        EK1 ek1 = c2511Yo0.d;
        ek1.getClass();
        final String str = (String) ek1.b.a(EK1.z[1], ek1);
        if (StringsKt.I(str)) {
            return;
        }
        final String strE = ek1.e();
        if (StringsKt.I(strE)) {
            strE = c2511Yo0.a.b;
        }
        c2511Yo0.b.b().execute(new Runnable() { // from class: To0
            @Override // java.lang.Runnable
            public final void run() {
                C2511Yo0 this$0 = c2511Yo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                String clientId = str;
                Intrinsics.checkNotNullParameter(clientId, "$clientId");
                String widgetId = strE;
                Intrinsics.checkNotNullParameter(widgetId, "$widgetId");
                long j = Long.parseLong(this$0.d.d());
                InterfaceC5889pD1 schedulers = this$0.b;
                Intrinsics.checkNotNullParameter(schedulers, "schedulers");
                C2169Uo0 supplier = new C2169Uo0(this$0, clientId, j, widgetId);
                Intrinsics.checkNotNullParameter(supplier, "supplier");
                C2247Vo0 handler = C2247Vo0.d;
                Intrinsics.checkNotNullParameter(handler, "handler");
                if (handler != null) {
                    C0957Fb.s(new Z31(supplier, handler, schedulers).a, new C2433Xo0(this$0, 0));
                } else {
                    C6104qF0.b("You need to declare handle response method");
                    Unit.a.getClass();
                    throw new IllegalArgumentException("kotlin.Unit");
                }
            }
        });
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(@NotNull FP0 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        C6102qE1 c6102qE1 = this.d;
        if (StringsKt.I(c6102qE1.b)) {
            C6104qF0.a("WidgetId is empty, service is turned off");
        } else {
            EK1 ek1 = this.e;
            if (C0957Fb.e(ek1.a())) {
                C4201hS c4201hS = C6104qF0.a;
                C6104qF0.a("Application moved to background. Blacklisted until " + C0957Fb.k(ek1.a()) + ", service is turned off");
            } else if (C0957Fb.e(ek1.c())) {
                C4201hS c4201hS2 = C6104qF0.a;
                C6104qF0.a("Application moved to background. Sanctioned until " + C0957Fb.k(ek1.c()) + ", service is turned off");
            } else {
                if (((Boolean) ek1.d.a(EK1.z[3], ek1)).booleanValue() && this.h) {
                    C6104qF0.a("Application moved to background, stop service");
                    int i = JivoWebSocketService.q;
                    Context appContext = c6102qE1.a;
                    Intrinsics.checkNotNullParameter(appContext, "appContext");
                    Intent intent = new Intent(appContext, (Class<?>) JivoWebSocketService.class);
                    intent.setAction("com.jivosite.sdk.socket.JivoWebSocketService.ACTION_STOP");
                    try {
                        appContext.startService(intent);
                    } catch (IllegalStateException e) {
                        C4201hS c4201hS3 = C6104qF0.a;
                        C6104qF0.c("Can not stop jivo sdk service from background", e);
                    }
                    this.h = false;
                }
            }
        }
        C6104qF0.a("JivoLifecycle: Stop SDK");
    }
}
