package io.sentry.util;

import defpackage.C1039Gc0;
import java.net.URI;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class C {

    public static final class a {

        @Nullable
        public final String a;

        @Nullable
        public final String b;

        @Nullable
        public final String c;

        public a(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }
    }

    @NotNull
    public static String a(@NotNull String str) {
        if (!str.contains("@")) {
            return str;
        }
        if (str.startsWith("@")) {
            return "[Filtered]".concat(str);
        }
        StringBuilder sbF = C1039Gc0.f(str.substring(0, str.indexOf(64)).contains(":") ? "[Filtered]:[Filtered]" : "[Filtered]");
        sbF.append(str.substring(str.indexOf(64)));
        return sbF.toString();
    }

    @NotNull
    public static a b(@NotNull String str) {
        String str2;
        try {
            URI uri = new URI(str);
            if (uri.isAbsolute()) {
                try {
                    uri.toURL();
                } catch (Exception unused) {
                    return new a(null, null, null);
                }
            }
            String rawPath = "";
            if (uri.getScheme() == null) {
                str2 = "";
            } else {
                str2 = uri.getScheme() + "://";
            }
            String rawAuthority = uri.getRawAuthority() == null ? "" : uri.getRawAuthority();
            if (uri.getRawPath() != null) {
                rawPath = uri.getRawPath();
            }
            return new a(str2 + a(rawAuthority) + rawPath, uri.getRawQuery(), uri.getRawFragment());
        } catch (Exception unused2) {
            return new a(null, null, null);
        }
    }
}
