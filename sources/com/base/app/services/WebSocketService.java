package com.base.app.services;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import defpackage.AbstractServiceC7597xN;
import defpackage.C0957Fb;
import defpackage.C2119Tx1;
import defpackage.C3362dS;
import defpackage.C5207m;
import defpackage.C7279vr;
import defpackage.C7700xr;
import defpackage.FV0;
import defpackage.InterfaceC4358iA0;
import defpackage.InterfaceC8042zV0;
import defpackage.U0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/base/app/services/WebSocketService;", "LxN;", "<init>", "()V", "AppBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class WebSocketService extends AbstractServiceC7597xN {
    public C2119Tx1 d;
    public FV0 e;
    public InterfaceC4358iA0 g;

    @NotNull
    public final AbstractServiceC7597xN.a h = new AbstractServiceC7597xN.a(this);

    public final void a() {
        FV0 fv0 = this.e;
        if (fv0 == null) {
            Intrinsics.l("mainActivityProvider");
            throw null;
        }
        ComponentCallbacks2 componentCallbacks2A = fv0.a();
        InterfaceC8042zV0 interfaceC8042zV0 = componentCallbacks2A instanceof InterfaceC8042zV0 ? (InterfaceC8042zV0) componentCallbacks2A : null;
        if (interfaceC8042zV0 != null) {
            interfaceC8042zV0.a();
        }
    }

    @Override // android.app.Service
    @NotNull
    public final IBinder onBind(@Nullable Intent intent) {
        Context context = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        if (C7279vr.d == null) {
            C7279vr.d = new C3362dS(new C7700xr(context), new C0957Fb(), new U0(10), new C7279vr(), new C5207m());
        }
        C3362dS c3362dS = C7279vr.d;
        Intrinsics.checkNotNull(c3362dS);
        this.d = c3362dS.h.get();
        this.e = c3362dS.g.get();
        this.g = c3362dS.J.get();
        return this.h;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Context context = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        if (C7279vr.d == null) {
            C7279vr.d = new C3362dS(new C7700xr(context), new C0957Fb(), new U0(10), new C7279vr(), new C5207m());
        }
        C3362dS c3362dS = C7279vr.d;
        Intrinsics.checkNotNull(c3362dS);
        this.d = c3362dS.h.get();
        this.e = c3362dS.g.get();
        this.g = c3362dS.J.get();
        C2119Tx1 c2119Tx1 = this.d;
        if (c2119Tx1 != null) {
            c2119Tx1.m(this);
        } else {
            Intrinsics.l("robotNotificationManager");
            throw null;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        a();
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    @Override // android.app.Service
    public final int onStartCommand(@Nullable Intent intent, int i, int i2) {
        if (Build.VERSION.SDK_INT < 29 || getForegroundServiceType() != 0) {
            return 1;
        }
        C2119Tx1 c2119Tx1 = this.d;
        if (c2119Tx1 != null) {
            c2119Tx1.m(this);
            return 1;
        }
        Intrinsics.l("robotNotificationManager");
        throw null;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(@Nullable Intent intent) {
        super.onTaskRemoved(intent);
        a();
    }

    public final void onTimeout(int i, int i2) {
        super.onTimeout(i, i2);
        a();
        stopSelf();
    }
}
