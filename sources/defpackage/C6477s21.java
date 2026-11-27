package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: s21, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6477s21 {

    @NotNull
    public static final Regex a = new Regex("[^\\p{L}\\p{Digit}]");

    @NotNull
    public static final String b = "$context_receiver";

    @NotNull
    public static final C5638o21 a(int i) {
        C5638o21 c5638o21K = C5638o21.k(b + '_' + i);
        Intrinsics.checkNotNullExpressionValue(c5638o21K, "identifier(...)");
        return c5638o21K;
    }
}
