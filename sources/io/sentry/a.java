package io.sentry;

import defpackage.C0841Do0;
import defpackage.EG1;
import defpackage.N80;
import defpackage.NG1;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.hints.h;
import io.sentry.protocol.s;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements N80 {

    @NotNull
    public final Map<String, Long> d = Collections.synchronizedMap(new HashMap());

    @NotNull
    public final SentryAndroidOptions e;

    public a(@NotNull SentryAndroidOptions sentryAndroidOptions) {
        this.e = sentryAndroidOptions;
    }

    @Override // defpackage.N80
    @Nullable
    public final EG1 f(@NotNull EG1 eg1, @NotNull C0841Do0 c0841Do0) {
        s sVarE;
        String str;
        Long l;
        if (!UncaughtExceptionHandlerIntegration.a.class.isInstance(c0841Do0.b("sentry:typeCheckHint")) || (sVarE = eg1.e()) == null || (str = sVarE.d) == null || (l = sVarE.h) == null) {
            return eg1;
        }
        Map<String, Long> map = this.d;
        Long l2 = map.get(str);
        if (l2 == null || l2.equals(l)) {
            map.put(str, l);
            return eg1;
        }
        this.e.getLogger().a(NG1.INFO, "Event %s has been dropped due to multi-threaded deduplication", eg1.d);
        c0841Do0.d(h.MULTITHREADED_DEDUPLICATION, "sentry:eventDropReason");
        return null;
    }
}
