package defpackage;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: da0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3387da0 {
    public static final a a = new a();
    public static final b b = new b();

    /* JADX INFO: renamed from: da0$a */
    public class a implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(@NonNull Runnable runnable) {
            C6177qc2.f().post(runnable);
        }
    }

    /* JADX INFO: renamed from: da0$b */
    public class b implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(@NonNull Runnable runnable) {
            runnable.run();
        }
    }
}
