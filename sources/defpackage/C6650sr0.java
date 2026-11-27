package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: sr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6650sr0 {

    @NotNull
    public static final Regex a;

    @NotNull
    public static final Regex b;

    @NotNull
    public static final Regex c;

    @NotNull
    public static final List<a> d;

    /* JADX INFO: renamed from: sr0$a */
    public static final class a {
        public final int a;
        public final int b;

        @NotNull
        public final Regex c;

        public a(@NotNull String pattern, int i, int i2) {
            Intrinsics.checkNotNullParameter(pattern, "pattern");
            this.a = i;
            this.b = i2;
            this.c = new Regex(pattern, EnumC4537iq1.IGNORE_CASE);
        }
    }

    static {
        EnumC4537iq1 enumC4537iq1 = EnumC4537iq1.IGNORE_CASE;
        a = new Regex("passw(?:or)?d", enumC4537iq1);
        b = new Regex("\\S\\s+\\S");
        c = new Regex("session_id|\\ba:\\d+:\\{|\\bs:\\d+:\\\\?\"|a%3A\\d|(?<![0-9a-f])[0-9a-f]{32,}(?![0-9a-f])", enumC4537iq1);
        d = WE.f(new a("[\"']?((?<![\\w-])(?![\\w-]*captcha)[\\w-]*(?:passw(?:or)?d|token|ssid|session)[\\w-]*)[\"']?\\s*:\\s*\"((?:[^\"\\\\]|\\\\.)*)", 1, 2), new a("[\"']?((?<![\\w-])(?![\\w-]*captcha)[\\w-]*(?:passw(?:or)?d|token|ssid|session)[\\w-]*)[\"']?\\s*:\\s*'((?:[^'\\\\]|\\\\.)*)", 1, 2), new a("((?<![\\w-])(?![\\w-]*captcha)[\\w-]*(?:passw(?:or)?d|token|ssid|session)[\\w-]*)=(a:\\d+:\\{(?:.*?\\}[0-9a-f]{32,}(?![0-9a-f])|.*\\}))", 1, 2), new a("((?<![\\w-])(?![\\w-]*captcha)[\\w-]*(?:passw(?:or)?d|token|ssid|session)[\\w-]*)=([^&;\\s\"']+)", 1, 2), new a("<(?:input|meta)\\b[^>]*?\\b(?:name|id)\\s*=\\s*[\"']((?<![\\w-])(?![\\w-]*captcha)[\\w-]*(?:passw(?:or)?d|token|ssid|session)[\\w-]*)[\"'][^>]*?\\b(?:value|content)\\s*=\\s*([\"'])((?:(?!\\2)[^>])*)\\2", 1, 3), new a("<(?:input|meta)\\b[^>]*?\\b(?:value|content)\\s*=\\s*([\"'])((?:(?!\\1)[^>])*)\\1(?=[^>]*?\\b(?:name|id)\\s*=\\s*[\"']((?<![\\w-])(?![\\w-]*captcha)[\\w-]*(?:passw(?:or)?d|token|ssid|session)[\\w-]*)[\"'])", 3, 2));
    }

    @NotNull
    public static String a(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        for (a aVar : d) {
            text = aVar.c.e(text, new KA(aVar, 1));
        }
        return text;
    }
}
