package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.sentry.android.core.b0;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: xJ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7587xJ1 implements EJ1 {
    public final Context a;
    public final FJ1 b;
    public final ZB0 c;
    public final C3481e1 d;
    public final C7087ux e;
    public final YK f;
    public final C6142qS g;
    public final AtomicReference<C6326rJ1> h;
    public final AtomicReference<TaskCompletionSource<C6326rJ1>> i;

    public C7587xJ1(Context context, FJ1 fj1, C3481e1 c3481e1, ZB0 zb0, C7087ux c7087ux, YK yk, C6142qS c6142qS) {
        AtomicReference<C6326rJ1> atomicReference = new AtomicReference<>();
        this.h = atomicReference;
        this.i = new AtomicReference<>(new TaskCompletionSource());
        this.a = context;
        this.b = fj1;
        this.d = c3481e1;
        this.c = zb0;
        this.e = c7087ux;
        this.f = yk;
        this.g = c6142qS;
        atomicReference.set(VV.b(c3481e1));
    }

    public final C6326rJ1 a(EnumC6746tJ1 enumC6746tJ1) {
        C6326rJ1 c6326rJ1 = null;
        try {
            if (!EnumC6746tJ1.e.equals(enumC6746tJ1)) {
                JSONObject jSONObjectB = this.e.b();
                if (jSONObjectB != null) {
                    C6326rJ1 c6326rJ1A = this.c.a(jSONObjectB);
                    jSONObjectB.toString();
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    this.d.getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (!EnumC6746tJ1.g.equals(enumC6746tJ1) && c6326rJ1A.c < jCurrentTimeMillis) {
                        Log.isLoggable("FirebaseCrashlytics", 2);
                        return null;
                    }
                    try {
                        Log.isLoggable("FirebaseCrashlytics", 2);
                        return c6326rJ1A;
                    } catch (Exception e) {
                        e = e;
                        c6326rJ1 = c6326rJ1A;
                        b0.d("FirebaseCrashlytics", "Failed to get cached settings", e);
                        return c6326rJ1;
                    }
                }
                Log.isLoggable("FirebaseCrashlytics", 3);
            }
            return null;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final C6326rJ1 b() {
        return this.h.get();
    }
}
