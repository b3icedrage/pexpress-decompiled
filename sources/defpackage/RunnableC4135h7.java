package defpackage;

import io.sentry.android.core.b0;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: h7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4135h7 implements Runnable {
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public RunnableC4135h7(Object obj, Object obj2) {
        this.d = obj;
        this.e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Method method = C4345i7.d;
            Object obj = this.e;
            Object obj2 = this.d;
            if (method != null) {
                method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
            } else {
                C4345i7.e.invoke(obj2, obj, Boolean.FALSE);
            }
        } catch (RuntimeException e) {
            if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                throw e;
            }
        } catch (Throwable th) {
            b0.d("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}
