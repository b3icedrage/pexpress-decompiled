package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class WF1 {
    public static final void a(@NotNull String category, @NotNull String message, @NotNull NG1 level, @NotNull Map<String, ? extends Object> data) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(data, "data");
        C0702Bu c0702Bu = new C0702Bu();
        c0702Bu.k = category;
        c0702Bu.h = message;
        c0702Bu.m = level;
        for (Map.Entry<String, ? extends Object> entry : data.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                c0702Bu.f(value, key);
            }
        }
        QF1.e().g(c0702Bu);
    }
}
