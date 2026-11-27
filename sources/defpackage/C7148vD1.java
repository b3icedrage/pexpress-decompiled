package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: vD1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7148vD1 implements InterfaceC5889pD1 {

    @NotNull
    public static final AtomicInteger e = new AtomicInteger(0);

    @NotNull
    public final ThreadGroup a = new ThreadGroup("Network");

    @NotNull
    public final a b = new a();

    @NotNull
    public final ExecutorService c;

    @NotNull
    public final ExecutorService d;

    /* JADX INFO: renamed from: vD1$a */
    public static final class a implements Executor {

        @NotNull
        public final Handler d = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(@NotNull Runnable command) {
            Intrinsics.checkNotNullParameter(command, "command");
            this.d.post(command);
        }
    }

    public C7148vD1() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC6518sD1());
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor … Thread(r, \"IO-Thread\") }");
        this.c = executorServiceNewSingleThreadExecutor;
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(3, new ThreadFactory() { // from class: tD1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                C7148vD1 this$0 = this.d;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                return new Thread(this$0.a, runnable, EK.e(C7148vD1.e.incrementAndGet(), "NetworkThread-"));
            }
        });
        Intrinsics.checkNotNullExpressionValue(executorServiceNewFixedThreadPool, "newFixedThreadPool(netwo…-$newThreadNumber\")\n    }");
        this.d = executorServiceNewFixedThreadPool;
    }

    @Override // defpackage.InterfaceC5889pD1
    @NotNull
    public final ExecutorService a() {
        return this.d;
    }

    @Override // defpackage.InterfaceC5889pD1
    @NotNull
    public final a b() {
        return this.b;
    }

    @Override // defpackage.InterfaceC5889pD1
    @NotNull
    public final ExecutorService c() {
        return this.c;
    }

    @Override // defpackage.InterfaceC5889pD1
    @NotNull
    public final ExecutorService d(@NotNull final String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: uD1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                String name2 = name;
                Intrinsics.checkNotNullParameter(name2, "$name");
                return new Thread(runnable, C5491nL.c("Repository-Thread-", name2));
            }
        });
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor …pository-Thread-$name\") }");
        return executorServiceNewSingleThreadExecutor;
    }
}
