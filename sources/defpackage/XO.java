package defpackage;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class XO implements Callable<Task<Void>> {
    public final /* synthetic */ Boolean d;
    public final /* synthetic */ YO.a e;

    public XO(YO.a aVar, Boolean bool) {
        this.e = aVar;
        this.d = bool;
    }

    @Override // java.util.concurrent.Callable
    public final Task<Void> call() {
        Boolean bool = this.d;
        boolean zBooleanValue = bool.booleanValue();
        YO.a aVar = this.e;
        YO yo = YO.this;
        if (zBooleanValue) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            boolean zBooleanValue2 = bool.booleanValue();
            C6142qS c6142qS = yo.b;
            if (!zBooleanValue2) {
                c6142qS.getClass();
                throw new IllegalStateException("An invalid data collection token was used.");
            }
            c6142qS.e.trySetResult(null);
            ExecutorService executorService = (ExecutorService) yo.e.a;
            return aVar.d.onSuccessTask(executorService, new WO(this, executorService));
        }
        Log.isLoggable("FirebaseCrashlytics", 2);
        Iterator it = C4448id0.e(yo.g.b.listFiles(YO.q)).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
        C4448id0 c4448id0 = yo.l.b.b;
        C7393wP.a(C4448id0.e(c4448id0.d.listFiles()));
        C7393wP.a(C4448id0.e(c4448id0.e.listFiles()));
        C7393wP.a(C4448id0.e(c4448id0.f.listFiles()));
        yo.p.trySetResult(null);
        return Tasks.forResult(null);
    }
}
