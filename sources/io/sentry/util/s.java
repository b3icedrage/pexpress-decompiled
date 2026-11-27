package io.sentry.util;

import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class s {
    public static boolean a(@NotNull String str, @NotNull List list) {
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str.contains(str2)) {
                return true;
            }
            try {
                if (str.matches(str2)) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
