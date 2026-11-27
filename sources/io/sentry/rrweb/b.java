package io.sentry.rrweb;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    @NotNull
    public c d;
    public long e;

    public b(@NotNull c cVar) {
        this.d = cVar;
        this.e = System.currentTimeMillis();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.e == bVar.e && this.d == bVar.d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, Long.valueOf(this.e)});
    }

    public b() {
        this(c.Custom);
    }
}
