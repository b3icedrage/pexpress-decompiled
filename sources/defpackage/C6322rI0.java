package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: rI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6322rI0 {

    @NotNull
    public static final C5638o21 a;

    @NotNull
    public static final C5638o21 b;

    static {
        C5638o21 c5638o21K = C5638o21.k("getFirst");
        Intrinsics.checkNotNullExpressionValue(c5638o21K, "identifier(...)");
        a = c5638o21K;
        C5638o21 c5638o21K2 = C5638o21.k("getLast");
        Intrinsics.checkNotNullExpressionValue(c5638o21K2, "identifier(...)");
        b = c5638o21K2;
    }
}
