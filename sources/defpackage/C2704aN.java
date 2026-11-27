package defpackage;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: aN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2704aN<K, V> {

    @NotNull
    private volatile /* synthetic */ Object current = PW0.c();

    static {
        AtomicReferenceFieldUpdater.newUpdater(C2704aN.class, Object.class, "current");
    }

    @Nullable
    public final Object a(@NotNull C4466ii key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return ((Map) this.current).get(key);
    }
}
