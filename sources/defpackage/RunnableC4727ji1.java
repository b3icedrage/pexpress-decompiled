package defpackage;

import android.content.Context;
import androidx.profileinstaller.c;
import com.appsflyer.AFLogger;
import com.appsflyer.b;
import io.sentry.android.core.internal.util.a;

/* JADX INFO: renamed from: ji1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC4727ji1 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC4727ji1(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                c.b((Context) this.e, new ExecutorC4468ii1(), c.a, false);
                break;
            case 1:
                AFLogger.unregisterClient((b) this.e);
                break;
            default:
                ((a) this.e).k();
                break;
        }
    }
}
