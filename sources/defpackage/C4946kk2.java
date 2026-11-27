package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: kk2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4946kk2 implements InterfaceC7208vX1 {
    public final TH1 a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final a c = new a();

    /* JADX INFO: renamed from: kk2$a */
    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(@NonNull Runnable runnable) {
            C4946kk2.this.b.post(runnable);
        }
    }

    public C4946kk2(@NonNull ExecutorService executorService) {
        this.a = new TH1(executorService);
    }
}
