package defpackage;

import io.sentry.util.p;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: xs1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7705xs1 {

    @NotNull
    public final URL a;

    @NotNull
    public final HashMap b;

    public C7705xs1(@NotNull String str, @NotNull HashMap map) {
        p.b(str, "url is required");
        try {
            this.a = URI.create(str).toURL();
            this.b = map;
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Failed to compose the Sentry's server URL.", e);
        }
    }
}
