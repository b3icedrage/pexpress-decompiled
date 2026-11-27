package defpackage;

import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: gY0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC4010gY0 {

    /* JADX INFO: renamed from: gY0$a */
    public enum a implements InterfaceC4010gY0 {
        NANOSECOND,
        MICROSECOND,
        MILLISECOND,
        SECOND,
        MINUTE,
        HOUR,
        DAY,
        WEEK;

        @Override // defpackage.InterfaceC4010gY0
        @NotNull
        public String apiName() {
            return name().toLowerCase(Locale.ROOT);
        }
    }

    @NotNull
    String apiName();
}
