package defpackage;

import io.sentry.instrumentation.file.f;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Qc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1821Qc0 {

    @NotNull
    public final C1563Mv0 a;

    @NotNull
    public final C5784oj1 b;

    public C1821Qc0(@NotNull C1563Mv0 configuration) throws IOException {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.a = configuration;
        File file = configuration.c;
        U0.g(file);
        C5784oj1 c5784oj1 = new C5784oj1(file, configuration.d, configuration.e);
        this.b = c5784oj1;
        File file2 = c5784oj1.c;
        if (file2.exists()) {
            try {
                FileInputStream fileInputStreamA = f.a.a(file2, new FileInputStream(file2));
                try {
                    c5784oj1.b.load(fileInputStreamA);
                    Unit unit = Unit.a;
                    fileInputStreamA.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        C6621sj.b(fileInputStreamA, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                file2.delete();
                DS0 ds0 = c5784oj1.a;
                if (ds0 != null) {
                    ds0.error("Failed to load property file with path " + file2.getAbsolutePath() + ", error stacktrace: " + J90.b(th3));
                }
                file2.getParentFile().mkdirs();
                file2.createNewFile();
            }
        } else {
            file2.getParentFile().mkdirs();
            file2.createNewFile();
        }
        this.a.getClass();
        C5784oj1 c5784oj2 = this.b;
        c5784oj2.getClass();
        Intrinsics.checkNotNullParameter("api_key", "key");
        String property = c5784oj2.b.getProperty("api_key", null);
        boolean zEquals = property == null ? true : property.equals("f85374691559c6d41e766cab7118bc7c");
        C5784oj1 c5784oj3 = this.b;
        if (!zEquals) {
            List keys = WE.f("user_id", "device_id", "api_key", "experiment_api_key");
            c5784oj3.getClass();
            Intrinsics.checkNotNullParameter(keys, "keys");
            Iterator it = keys.iterator();
            while (it.hasNext()) {
                c5784oj3.b.remove((String) it.next());
            }
            c5784oj3.b();
        }
        c5784oj3.a("api_key", "f85374691559c6d41e766cab7118bc7c");
    }

    @NotNull
    public final C1252Iv0 a() {
        C5784oj1 c5784oj1 = this.b;
        c5784oj1.getClass();
        Intrinsics.checkNotNullParameter("user_id", "key");
        String property = c5784oj1.b.getProperty("user_id", null);
        Intrinsics.checkNotNullParameter("device_id", "key");
        return new C1252Iv0(property, c5784oj1.b.getProperty("device_id", null));
    }

    public final void b(@Nullable String str) {
        if (str == null) {
            str = "";
        }
        this.b.a("device_id", str);
    }

    public final void c(@Nullable String str) {
        if (str == null) {
            str = "";
        }
        this.b.a("user_id", str);
    }
}
