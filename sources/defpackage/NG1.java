package defpackage;

import io.sentry.ILogger;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public enum NG1 implements BH0 {
    DEBUG,
    INFO,
    WARNING,
    ERROR,
    FATAL;

    public static final class a implements KG0<NG1> {
        @Override // defpackage.KG0
        @NotNull
        public final NG1 a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            return NG1.valueOf(q71.B().toUpperCase(Locale.ROOT));
        }
    }

    @Override // defpackage.BH0
    public void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        ((C6319rH0) w71).j(name().toLowerCase(Locale.ROOT));
    }
}
