package io.sentry.android.replay;

import java.io.Closeable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface g extends Closeable {
    void b();

    void e();

    void m(@NotNull u uVar);

    void reset();

    void start();

    void stop();
}
