package defpackage;

import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.util.p;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: zF1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7995zF1 implements InterfaceC7154vF1 {

    @NotNull
    public final VI1 a;

    public C7995zF1(@NotNull VI1 vi1) {
        this.a = vi1;
    }

    @Override // defpackage.InterfaceC7154vF1
    @Nullable
    public final C6944uF1 a(@NotNull SD1 sd1, @NotNull C2688aH1 c2688aH1) {
        p.b(sd1, "Scopes are required");
        p.b(c2688aH1, "SentryOptions is required");
        String outboxPath = ((SentryAndroidOptions) this.a.d).getOutboxPath();
        if (outboxPath == null || !InterfaceC7154vF1.b(outboxPath, c2688aH1.getLogger())) {
            c2688aH1.getLogger().a(NG1.ERROR, "No outbox dir path is defined in options.", new Object[0]);
            return null;
        }
        return new C6944uF1(c2688aH1.getLogger(), outboxPath, new C7638xa1(sd1, c2688aH1.getEnvelopeReader(), c2688aH1.getSerializer(), c2688aH1.getLogger(), c2688aH1.getFlushTimeoutMillis(), c2688aH1.getMaxQueueSize()), new File(outboxPath));
    }
}
