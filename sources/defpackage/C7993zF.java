package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: zF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7993zF extends C2099Tr {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7993zF(@NotNull String status) {
        super("Can't get response", status);
        Intrinsics.checkNotNullParameter(status, "status");
    }
}
