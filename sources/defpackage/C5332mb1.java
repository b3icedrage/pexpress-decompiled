package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: mb1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5332mb1 {

    @NotNull
    public final PZ a;

    @NotNull
    public final C1705Op1 b;

    @NotNull
    public final ConcurrentHashMap<QC, QY0> c;

    public C5332mb1(@NotNull PZ resolver, @NotNull C1705Op1 kotlinClassFinder) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        this.a = resolver;
        this.b = kotlinClassFinder;
        this.c = new ConcurrentHashMap<>();
    }
}
