package defpackage;

import io.sentry.instrumentation.file.j;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: oj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5784oj1 {

    @Nullable
    public final DS0 a;

    @NotNull
    public final Properties b;

    @NotNull
    public final File c;

    public C5784oj1(@NotNull File directory, @NotNull String fileNameWithoutExtension, @Nullable DS0 ds0) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(fileNameWithoutExtension, "fileNameWithoutExtension");
        this.a = ds0;
        this.b = new Properties();
        this.c = new File(directory, Z0.c(fileNameWithoutExtension, ".properties"));
    }

    public final void a(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.b.setProperty(key, value);
        b();
    }

    public final void b() {
        File file = this.c;
        try {
            FileOutputStream fileOutputStreamB = j.a.b(new FileOutputStream(file), file);
            try {
                this.b.store(fileOutputStreamB, (String) null);
                Unit unit = Unit.a;
                fileOutputStreamB.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    C6621sj.b(fileOutputStreamB, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            DS0 ds0 = this.a;
            if (ds0 != null) {
                ds0.error("Failed to save property file with path " + file.getAbsolutePath() + ", error stacktrace: " + J90.b(th3));
            }
        }
    }
}
