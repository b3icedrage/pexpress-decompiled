package defpackage;

import io.sentry.cache.e;
import io.sentry.cache.f;
import java.io.File;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: w11, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC7313w11 implements Runnable {

    @NotNull
    public final C2688aH1 d;

    public RunnableC7313w11(@NotNull C2688aH1 c2688aH1) {
        this.d = c2688aH1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2688aH1 c2688aH1 = this.d;
        String cacheDirPath = c2688aH1.getCacheDirPath();
        if (cacheDirPath == null) {
            c2688aH1.getLogger().a(NG1.INFO, "Cache dir is not set, not moving the previous session.", new Object[0]);
            return;
        }
        f envelopeDiskCache = c2688aH1.getEnvelopeDiskCache();
        if (envelopeDiskCache instanceof e) {
            int i = e.n;
            e eVar = (e) envelopeDiskCache;
            eVar.e(new File(cacheDirPath, "session.json"), new File(cacheDirPath, "previous_session.json"));
            eVar.j.countDown();
        }
    }
}
