package io.sentry.config;

import defpackage.C6561sS;
import defpackage.NG1;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    @NotNull
    public final String a;

    @NotNull
    public final C6561sS b;
    public final boolean c;

    public e(@NotNull String str, @NotNull C6561sS c6561sS, boolean z) {
        this.a = str;
        this.b = c6561sS;
        this.c = z;
    }

    @Nullable
    public final Properties a() {
        C6561sS c6561sS = this.b;
        String str = this.a;
        try {
            File file = new File(str.trim());
            if (!file.isFile() || !file.canRead()) {
                if (file.isFile()) {
                    if (!file.canRead()) {
                        c6561sS.a(NG1.ERROR, "Failed to load Sentry configuration since it is not readable: %s", str);
                    }
                } else if (this.c) {
                    c6561sS.a(NG1.ERROR, "Failed to load Sentry configuration since it is not a file or does not exist: %s", str);
                    return null;
                }
                return null;
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                bufferedInputStream.close();
                return properties;
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            c6561sS.c(NG1.ERROR, th3, "Failed to load Sentry configuration from file: %s", str);
            return null;
        }
    }
}
