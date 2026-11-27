package defpackage;

import android.os.Process;
import androidx.annotation.NonNull;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final class R6 implements ThreadFactory {

    public class a implements Runnable {
        public final /* synthetic */ Runnable d;

        public a(Runnable runnable) {
            this.d = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(10);
            this.d.run();
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(@NonNull Runnable runnable) {
        return new Thread(new a(runnable), "glide-active-resources");
    }
}
