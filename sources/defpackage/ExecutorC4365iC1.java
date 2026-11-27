package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: iC1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC4365iC1 implements Executor {
    public final ExecutorService d;

    /* JADX INFO: renamed from: iC1$a */
    public static class a implements Runnable {
        public final Runnable d;

        public a(Runnable runnable) {
            this.d = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.d.run();
            } catch (Exception e) {
                OS0.b("Executor", "Background execution failure.", e);
            }
        }
    }

    public ExecutorC4365iC1(ExecutorService executorService) {
        this.d = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.d.execute(new a(runnable));
    }
}
