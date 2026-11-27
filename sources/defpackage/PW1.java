package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class PW1 implements ComponentCallbacks2 {

    @NotNull
    public final WeakReference<C4750jo1> d;
    public final S31 e;
    public volatile boolean g;
    public final AtomicBoolean h;
    public final Context i;

    public PW1(@NotNull C4750jo1 imageLoader, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(context, "context");
        this.i = context;
        this.d = new WeakReference<>(imageLoader);
        imageLoader.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(this, "listener");
        ConnectivityManager connectivityManager = (ConnectivityManager) C6333rM.getSystemService(context, ConnectivityManager.class);
        S31 u31 = C5027l8.d;
        if (connectivityManager != null && C6333rM.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            try {
                u31 = new U31(connectivityManager, this);
            } catch (Exception unused) {
            }
        }
        this.e = u31;
        this.g = u31.a();
        this.h = new AtomicBoolean(false);
        this.i.registerComponentCallbacks(this);
    }

    public final void a() {
        if (this.h.getAndSet(true)) {
            return;
        }
        this.i.unregisterComponentCallbacks(this);
        this.e.shutdown();
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        if (this.d.get() != null) {
            return;
        }
        a();
        Unit unit = Unit.a;
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        C4750jo1 c4750jo1 = this.d.get();
        if (c4750jo1 == null) {
            a();
            return;
        }
        c4750jo1.j.a(i);
        c4750jo1.k.a(i);
        C2509Yn1 c2509Yn1 = c4750jo1.h;
        synchronized (c2509Yn1) {
            try {
                if (i >= 40) {
                    c2509Yn1.e(-1);
                } else if (10 <= i && 20 > i) {
                    c2509Yn1.e(c2509Yn1.b / 2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
