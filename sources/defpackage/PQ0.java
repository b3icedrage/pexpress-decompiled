package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public interface PQ0<V> extends Future<V> {
    void f(Runnable runnable, Executor executor);
}
