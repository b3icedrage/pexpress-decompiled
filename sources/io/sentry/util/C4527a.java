package io.sentry.util;

import defpackage.InterfaceC1482Lu0;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.sentry.util.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4527a extends ReentrantLock {

    /* JADX INFO: renamed from: io.sentry.util.a$a, reason: collision with other inner class name */
    public static final class C0404a implements InterfaceC1482Lu0 {

        @NotNull
        public final C4527a d;

        public C0404a(@NotNull C4527a c4527a) {
            this.d = c4527a;
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            this.d.unlock();
        }
    }

    public final C0404a a() {
        lock();
        return new C0404a(this);
    }
}
