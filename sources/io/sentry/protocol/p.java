package io.sentry.protocol;

import defpackage.BH0;
import defpackage.C4564j;
import defpackage.C6319rH0;
import defpackage.KG0;
import defpackage.W71;
import io.sentry.ILogger;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements BH0 {

    @Nullable
    public String d;

    @Nullable
    public ConcurrentHashMap e;

    @Nullable
    public Integer g;

    @Nullable
    public Long h;

    @Nullable
    public Object i;

    @Nullable
    public ConcurrentHashMap j;

    public static final class a implements KG0<p> {
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        if (this.d != null) {
            c6319rH0.c("cookies");
            c6319rH0.j(this.d);
        }
        if (this.e != null) {
            c6319rH0.c("headers");
            c6319rH0.g(iLogger, this.e);
        }
        if (this.g != null) {
            c6319rH0.c("status_code");
            c6319rH0.g(iLogger, this.g);
        }
        if (this.h != null) {
            c6319rH0.c("body_size");
            c6319rH0.g(iLogger, this.h);
        }
        if (this.i != null) {
            c6319rH0.c("data");
            c6319rH0.g(iLogger, this.i);
        }
        ConcurrentHashMap concurrentHashMap = this.j;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C4564j.h(this.j, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
    }
}
