package io.sentry.instrumentation.file;

import java.io.File;
import java.io.InputStreamReader;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends InputStreamReader {
    public k(@NotNull String str) {
        super(new f(str != null ? new File(str) : null));
    }
}
