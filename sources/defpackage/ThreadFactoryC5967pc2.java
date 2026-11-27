package defpackage;

import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: pc2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ThreadFactoryC5967pc2 implements ThreadFactory {
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ ThreadFactoryC5967pc2(String str, boolean z) {
        this.d = str;
        this.e = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String name = this.d;
        Intrinsics.checkNotNullParameter(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(this.e);
        return thread;
    }
}
