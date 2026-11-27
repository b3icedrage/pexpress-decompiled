package defpackage;

import io.sentry.ILogger;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public enum SG1 implements BH0 {
    TRACE(1),
    DEBUG(5),
    INFO(9),
    WARN(13),
    ERROR(17),
    FATAL(21);

    private final int severityNumber;

    public static final class a implements KG0<SG1> {
        @Override // defpackage.KG0
        @NotNull
        public final SG1 a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            return SG1.valueOf(q71.B().toUpperCase(Locale.ROOT));
        }
    }

    SG1(int i) {
        this.severityNumber = i;
    }

    public int getSeverityNumber() {
        return this.severityNumber;
    }

    @Override // defpackage.BH0
    public void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        ((C6319rH0) w71).j(name().toLowerCase(Locale.ROOT));
    }
}
