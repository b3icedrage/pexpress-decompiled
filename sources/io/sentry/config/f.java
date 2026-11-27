package io.sentry.config;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface f {
    @Nullable
    String a(@NotNull String str);

    @Nullable
    default Boolean b(@NotNull String str) {
        String strA = a(str);
        if (strA != null) {
            return Boolean.valueOf(strA);
        }
        return null;
    }

    @Nullable
    default Long c(@NotNull String str) {
        String strA = a(str);
        if (strA == null) {
            return null;
        }
        try {
            return Long.valueOf(strA);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @NotNull
    Map d();

    @NotNull
    default List<String> e(@NotNull String str) {
        String strA = a(str);
        return strA != null ? Arrays.asList(strA.split(",")) : Collections.EMPTY_LIST;
    }
}
