package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class S90 implements InterfaceC5541nb0<Executor> {

    public static final class a {
        public static final S90 a = new S90();
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new ExecutorC4365iC1(Executors.newSingleThreadExecutor());
    }
}
