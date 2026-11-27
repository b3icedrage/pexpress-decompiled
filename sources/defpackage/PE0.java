package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class PE0 {

    @NotNull
    public final C7137vA a;

    public PE0(@NotNull AA0 stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        this.a = new C7137vA(stream, Charsets.UTF_8);
    }
}
