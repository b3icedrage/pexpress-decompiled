package defpackage;

import android.annotation.SuppressLint;
import io.sentry.android.core.b0;
import io.sentry.instrumentation.file.j;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: yh1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7876yh1 {

    @NotNull
    public static final HashMap e = new HashMap();
    public final boolean a;

    @NotNull
    public final File b;

    @SuppressLint({"SyntheticAccessor"})
    @NotNull
    public final Lock c;

    @Nullable
    public FileChannel d;

    public C7876yh1(@NotNull String name, @NotNull File lockDir, boolean z) {
        Lock lock;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(lockDir, "lockDir");
        this.a = z;
        File file = new File(lockDir, Z0.c(name, ".lck"));
        this.b = file;
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "lockFile.absolutePath");
        HashMap map = e;
        synchronized (map) {
            try {
                Object reentrantLock = map.get(absolutePath);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(absolutePath, reentrantLock);
                }
                lock = (Lock) reentrantLock;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.c = lock;
    }

    public final void a(boolean z) {
        this.c.lock();
        if (z) {
            File file = this.b;
            try {
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = j.a.b(new FileOutputStream(file), file).getChannel();
                channel.lock();
                this.d = channel;
            } catch (IOException e2) {
                this.d = null;
                b0.f("SupportSQLiteLock", "Unable to grab file lock.", e2);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.c.unlock();
    }
}
