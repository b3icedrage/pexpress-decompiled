package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class R00 {

    @Nullable
    public List<String> a;

    @NotNull
    public Set<String> b;

    public final void a(@NotNull String log) {
        Intrinsics.checkNotNullParameter(log, "log");
        Set<String> set = this.b;
        set.add(log);
        while (set.size() > 10) {
            set.remove(CollectionsKt.E(set));
        }
    }
}
