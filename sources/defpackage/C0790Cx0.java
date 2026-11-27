package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Cx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0790Cx0 extends C2099Tr {

    @Nullable
    public final Double c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0790Cx0(@NotNull String message, @Nullable String str, @Nullable Double d) {
        super(message, str);
        Intrinsics.checkNotNullParameter(message, "message");
        this.c = d;
    }
}
