package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import com.appsflyer.internal.AFj1vSDK;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class X6 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ X6(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.os.Handler] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.app.Application] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [i7$a] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.os.Handler] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        ?? r5;
        ?? r4;
        ?? r3;
        Object obj2 = this.e;
        switch (this.d) {
            case 0:
                Activity activity = (Activity) obj2;
                if (activity.isFinishing()) {
                    return;
                }
                Application application = Build.VERSION.SDK_INT;
                if (application >= 28) {
                    Class<?> cls = C4345i7.a;
                    activity.recreate();
                    return;
                }
                Class<?> cls2 = C4345i7.a;
                C4345i7.a aVar = 1;
                aVar = 1;
                ?? r6 = 27;
                boolean z = application == 26 || application == 27;
                Method method = C4345i7.f;
                if ((!z || method != null) && (C4345i7.e != null || C4345i7.d != null)) {
                    try {
                        Object obj3 = C4345i7.c.get(activity);
                        if (obj3 != null && (obj = C4345i7.b.get(activity)) != null) {
                            application = activity.getApplication();
                            aVar = new C4345i7.a(activity);
                            application.registerActivityLifecycleCallbacks(aVar);
                            r6 = C4345i7.g;
                            r6.post(new RunnableC3715f7(aVar, obj3));
                            if (application != 26 && application != 27) {
                                aVar = 0;
                            }
                            try {
                                if (aVar != 0) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        method.invoke(obj, obj3, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th) {
                                        th = th;
                                        r3 = application;
                                        r4 = aVar;
                                        r5 = r6;
                                        r5.post(new RunnableC3925g7(r3, r4));
                                        throw th;
                                    }
                                } else {
                                    activity.recreate();
                                }
                                r6.post(new RunnableC3925g7(application, aVar));
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                r3 = application;
                                r4 = aVar;
                                r5 = r6;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 1:
                ((ViewOnLongClickListenerC6260r02) obj2).c(false);
                return;
            default:
                ((AFj1vSDK) obj2).force();
                return;
        }
    }
}
