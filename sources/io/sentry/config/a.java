package io.sentry.config;

import defpackage.C5807oq;
import io.sentry.util.p;
import io.sentry.util.x;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements f {

    @NotNull
    public final String a;

    @NotNull
    public final Properties b;

    public a(@NotNull String str, @NotNull Properties properties) {
        this.a = str;
        p.b(properties, "properties are required");
        this.b = properties;
    }

    @Override // io.sentry.config.f
    @Nullable
    public final String a(@NotNull String str) {
        return x.d(this.b.getProperty(C5807oq.b(new StringBuilder(), this.a, str)));
    }

    @Override // io.sentry.config.f
    @NotNull
    public final Map d() {
        String strB = C5807oq.b(new StringBuilder(), this.a, "tags.");
        HashMap map = new HashMap();
        for (Map.Entry entry : this.b.entrySet()) {
            if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                String str = (String) entry.getKey();
                if (str.startsWith(strB)) {
                    map.put(str.substring(strB.length()), x.d((String) entry.getValue()));
                }
            }
        }
        return map;
    }
}
