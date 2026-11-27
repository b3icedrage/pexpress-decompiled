package defpackage;

import io.sentry.ILogger;
import io.sentry.util.l;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: iO1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4401iO1 implements BH0 {
    public static final C4401iO1 e = new C4401iO1("00000000-0000-0000-0000-000000000000".replace("-", "").substring(0, 16));

    @NotNull
    public final l<String> d;

    /* JADX INFO: renamed from: iO1$a */
    public static final class a implements KG0<C4401iO1> {
        @Override // defpackage.KG0
        @NotNull
        public final C4401iO1 a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            return new C4401iO1(q71.B());
        }
    }

    public C4401iO1(@NotNull String str) {
        Objects.requireNonNull(str, "value is required");
        this.d = new l<>(new C4191hO1(str, 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4401iO1.class != obj.getClass()) {
            return false;
        }
        return this.d.a().equals(((C4401iO1) obj).d.a());
    }

    public final int hashCode() {
        return this.d.a().hashCode();
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        ((C6319rH0) w71).j(this.d.a());
    }

    public final String toString() {
        return this.d.a();
    }

    public C4401iO1() {
        this.d = new l<>(new C4790k10(3));
    }
}
