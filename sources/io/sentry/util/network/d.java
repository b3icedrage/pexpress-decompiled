package io.sentry.util.network;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    @Nullable
    public final String a;

    @Nullable
    public Integer b;

    @Nullable
    public Long c;

    @Nullable
    public Long d;

    @Nullable
    public e e;

    @Nullable
    public e f;

    public d(@Nullable String str) {
        this.a = str;
    }

    public final String toString() {
        return "NetworkRequestData{method='" + this.a + "', statusCode=" + this.b + ", requestBodySize=" + this.c + ", responseBodySize=" + this.d + ", request=" + this.e + ", response=" + this.f + '}';
    }
}
