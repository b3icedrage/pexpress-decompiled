package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: An1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0605An1<T> extends EP1<T> {

    @NotNull
    public final Throwable b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0605An1(@NotNull Throwable readException, int i) {
        super(i);
        Intrinsics.checkNotNullParameter(readException, "readException");
        this.b = readException;
    }
}
