package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: hZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4222hZ {

    @NotNull
    public final ConcurrentHashMap a = new ConcurrentHashMap(16);

    /* JADX INFO: renamed from: hZ$a */
    public static final class a<T> {
    }

    @Nullable
    public final <T> T a(@NotNull MH1 descriptor, @NotNull a<T> key) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Map map = (Map) this.a.get(descriptor);
        T t = map != null ? (T) map.get(key) : null;
        if (t == null) {
            return null;
        }
        return t;
    }
}
