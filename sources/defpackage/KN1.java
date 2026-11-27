package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class KN1 {

    @NotNull
    public final Map<String, JN1> a;

    @NotNull
    public final C0802Db0 b;

    @NotNull
    public final C3903g11 c;

    @NotNull
    public final OZ0 d;

    /* JADX WARN: Multi-variable type inference failed */
    public KN1(@NotNull Map<String, ? extends JN1> delegates, @NotNull C0802Db0 fallbackDelegate, @NotNull C3903g11 parser, @NotNull OZ0 obfuscator) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(fallbackDelegate, "fallbackDelegate");
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(obfuscator, "obfuscator");
        this.a = delegates;
        this.b = fallbackDelegate;
        this.c = parser;
        this.d = obfuscator;
    }
}
