package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: a82, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2660a82 extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2660a82(@NotNull String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
