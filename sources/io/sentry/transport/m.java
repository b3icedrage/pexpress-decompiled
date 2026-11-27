package io.sentry.transport;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    @NotNull
    public final a a = new a();

    public static final class a extends AbstractQueuedSynchronizer {
        public static final /* synthetic */ int d = 0;

        public a() {
            setState(0);
        }

        public static int a(a aVar) {
            return aVar.getState();
        }

        public static void b(a aVar) {
            int state;
            do {
                state = aVar.getState();
            } while (!aVar.compareAndSetState(state, state + 1));
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public final int tryAcquireShared(int i) {
            return getState() == 0 ? 1 : -1;
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public final boolean tryReleaseShared(int i) {
            int state;
            int i2;
            do {
                state = getState();
                if (state == 0) {
                    return false;
                }
                i2 = state - 1;
            } while (!compareAndSetState(state, i2));
            return i2 == 0;
        }
    }
}
