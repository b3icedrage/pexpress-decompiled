package io.sentry.rrweb;

import defpackage.BH0;
import defpackage.C6319rH0;
import defpackage.W71;
import io.sentry.ILogger;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends b implements BH0 {

    @NotNull
    public final String g;

    @NotNull
    public final HashMap h;

    public h() {
        super(c.Custom);
        this.h = new HashMap();
        this.g = "options";
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        c6319rH0.c("type");
        c6319rH0.g(iLogger, this.d);
        c6319rH0.c("timestamp");
        c6319rH0.f(this.e);
        c6319rH0.c("data");
        c6319rH0.a();
        c6319rH0.c("tag");
        c6319rH0.j(this.g);
        c6319rH0.c("payload");
        c6319rH0.a();
        HashMap map = this.h;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                c6319rH0.c(str);
                c6319rH0.g(iLogger, obj);
            }
        }
        c6319rH0.b();
        c6319rH0.b();
        c6319rH0.b();
    }
}
