package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface M80 extends InterfaceC5978pf1 {
    @Nullable
    default C0612Aq b(@NotNull C0612Aq payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        return payload;
    }

    @Nullable
    default C8133zv0 c(@NotNull C8133zv0 payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        return payload;
    }

    @Nullable
    default C2605Zt1 d(@NotNull C2605Zt1 payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        return payload;
    }

    @Nullable
    default C2796an0 f(@NotNull C2796an0 payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        return payload;
    }

    default void flush() {
    }
}
