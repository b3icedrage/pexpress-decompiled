package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class N60 {

    @NotNull
    public final Function0<Long> a;
    public final long b;

    @NotNull
    public final ConcurrentHashMap<String, Long> c;

    public N60(Function0 now) {
        Intrinsics.checkNotNullParameter(now, "now");
        this.a = now;
        this.b = 600000L;
        this.c = new ConcurrentHashMap<>();
    }
}
