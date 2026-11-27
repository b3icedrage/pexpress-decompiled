package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Tr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2099Tr extends AbstractC7783yF {

    @NotNull
    public final String a;

    @Nullable
    public final String b;

    public C2099Tr(@NotNull String message, @Nullable String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.a = message;
        this.b = str;
    }
}
