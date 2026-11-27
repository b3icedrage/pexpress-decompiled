package io.sentry.protocol;

import defpackage.BH0;
import defpackage.C4191hO1;
import defpackage.C6319rH0;
import defpackage.EK;
import defpackage.KG0;
import defpackage.Q71;
import defpackage.W71;
import io.sentry.ILogger;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements BH0 {
    public static final u e = new u("00000000-0000-0000-0000-000000000000".replace("-", ""));

    @NotNull
    public final io.sentry.util.l<String> d;

    public static final class a implements KG0<u> {
        @Override // defpackage.KG0
        @NotNull
        public final u a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            return new u(q71.B());
        }
    }

    public u() {
        this.d = new io.sentry.util.l<>(new EK(8));
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        return this.d.a().equals(((u) obj).d.a());
    }

    public final int hashCode() {
        return this.d.a().hashCode();
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        ((C6319rH0) w71).j(toString());
    }

    public final String toString() {
        return this.d.a();
    }

    public u(@NotNull String str) {
        final String str2 = str.equals("0000-0000") ? "00000000-0000-0000-0000-000000000000" : str;
        if (str2.length() != 32 && str2.length() != 36) {
            throw new IllegalArgumentException("String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: ".concat(str));
        }
        if (str2.length() == 36) {
            this.d = new io.sentry.util.l<>(new io.sentry.util.l.a() { // from class: io.sentry.protocol.t
                @Override // io.sentry.util.l.a
                public final Object b() {
                    String str3 = str2;
                    this.d.getClass();
                    Charset charset = io.sentry.util.x.a;
                    if (str3.equals("0000-0000")) {
                        str3 = "00000000-0000-0000-0000-000000000000";
                    }
                    return str3.replace("-", "");
                }
            });
        } else {
            this.d = new io.sentry.util.l<>(new C4191hO1(str2, 0));
        }
    }
}
