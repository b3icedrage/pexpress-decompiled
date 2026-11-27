package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import io.sentry.android.core.b0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class OV implements Jm2 {
    public final Object d;

    public OV(C2698aL c2698aL) {
        this.d = c2698aL;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ak0, kotlin.jvm.functions.Function2] */
    public /* synthetic */ boolean a(Object obj, Object obj2) {
        Object objInvoke = ((C2784ak0) this.d).invoke(obj, obj2);
        Intrinsics.checkNotNullExpressionValue(objInvoke, "invoke(...)");
        return ((Boolean) objInvoke).booleanValue();
    }

    @Override // defpackage.Jm2
    public Object zza() {
        return new Qm2(new fn2("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), (Context) ((C1602Nh0) ((C2698aL) this.d).d).d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OV(Function2 function2) {
        this.d = (C2784ak0) function2;
    }

    public OV(ArrayList arrayList) {
        this.d = Collections.unmodifiableList(arrayList);
    }

    public OV() {
        Handler handler;
        Handler handlerA;
        Looper mainLooper = Looper.getMainLooper();
        if (Build.VERSION.SDK_INT >= 28) {
            handlerA = C7058un0.a(mainLooper);
        } else {
            try {
                handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
            } catch (IllegalAccessException e) {
                e = e;
                b0.f("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                handler = new Handler(mainLooper);
            } catch (InstantiationException e2) {
                e = e2;
                b0.f("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                handler = new Handler(mainLooper);
            } catch (NoSuchMethodException e3) {
                e = e3;
                b0.f("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                handler = new Handler(mainLooper);
            } catch (InvocationTargetException e4) {
                Throwable cause = e4.getCause();
                if (!(cause instanceof RuntimeException)) {
                    if (cause instanceof Error) {
                        throw ((Error) cause);
                    }
                    throw new RuntimeException(cause);
                }
                throw ((RuntimeException) cause);
            }
            handlerA = handler;
        }
        this.d = handlerA;
    }
}
