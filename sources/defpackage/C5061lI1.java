package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: lI1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5061lI1 {
    public final C6533sI1 a;

    /* JADX INFO: renamed from: lI1$a */
    public static final class a {
        public final C2695aK.a a;
        public final C6533sI1.a b;

        public a(@NotNull C2695aK.a connectionFactory, @NotNull C6533sI1.a serviceMethodExecutorFactory) {
            Intrinsics.checkNotNullParameter(connectionFactory, "connectionFactory");
            Intrinsics.checkNotNullParameter(serviceMethodExecutorFactory, "serviceMethodExecutorFactory");
            this.a = connectionFactory;
            this.b = serviceMethodExecutorFactory;
        }
    }

    public C5061lI1(@NotNull C2695aK connection, @NotNull C6533sI1 serviceMethodExecutor) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(serviceMethodExecutor, "serviceMethodExecutor");
        this.a = serviceMethodExecutor;
    }
}
