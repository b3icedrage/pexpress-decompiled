package defpackage;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import io.sentry.android.core.b0;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class WO implements SuccessContinuation<C6326rJ1, Void> {
    public final /* synthetic */ ExecutorService d;
    public final /* synthetic */ XO e;

    public WO(XO xo, ExecutorService executorService) {
        this.e = xo;
        this.d = executorService;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    @NonNull
    public final Task<Void> then(C6326rJ1 c6326rJ1) {
        if (c6326rJ1 == null) {
            b0.f("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        YO.a aVar = this.e.e;
        YO.b(YO.this);
        YO yo = YO.this;
        yo.l.d(null, this.d);
        yo.p.trySetResult(null);
        return Tasks.forResult(null);
    }
}
