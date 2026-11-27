package io.sentry.util.network;

import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    @Nullable
    public final Long a;

    @Nullable
    public final a b;

    @NotNull
    public final LinkedHashMap c;

    public e(@Nullable Long l, @Nullable a aVar, @NotNull LinkedHashMap linkedHashMap) {
        this.a = l;
        this.b = aVar;
        this.c = linkedHashMap;
    }

    public final String toString() {
        return "ReplayNetworkRequestOrResponse{size=" + this.a + ", body=" + this.b + ", headers=" + this.c + '}';
    }
}
