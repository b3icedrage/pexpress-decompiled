package io.sentry.android.replay.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import io.sentry.rrweb.f;
import io.sentry.transport.c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class b {

    @NotNull
    public final c a;

    @NotNull
    public final LinkedHashMap<Integer, ArrayList<f.b>> b;
    public long c;
    public long d;

    public b(@NotNull c dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.a = dateProvider;
        this.b = new LinkedHashMap<>(10);
    }
}
