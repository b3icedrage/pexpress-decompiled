package defpackage;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class GR implements ThreadFactory {
    public static final ThreadFactory i = Executors.defaultThreadFactory();
    public final AtomicLong d = new AtomicLong();
    public final String e;
    public final int g;
    public final StrictMode.ThreadPolicy h;

    public GR(String str, int i2, @Nullable StrictMode.ThreadPolicy threadPolicy) {
        this.e = str;
        this.g = i2;
        this.h = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = i.newThread(new FR(0, this, runnable));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.e + " Thread #" + this.d.getAndIncrement());
        return threadNewThread;
    }
}
