package defpackage;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public enum TF1 {
    STRING,
    BOOLEAN,
    INTEGER,
    DOUBLE,
    ARRAY;

    @NotNull
    public static TF1 inferFrom(@Nullable Object obj) {
        if (obj instanceof Boolean) {
            return BOOLEAN;
        }
        if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof Byte) || (obj instanceof BigInteger) || (obj instanceof AtomicInteger) || (obj instanceof AtomicLong)) {
            return INTEGER;
        }
        if (obj instanceof Number) {
            return DOUBLE;
        }
        return ((obj instanceof Collection) || (obj != null && obj.getClass().isArray())) ? ARRAY : STRING;
    }

    @NotNull
    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }
}
