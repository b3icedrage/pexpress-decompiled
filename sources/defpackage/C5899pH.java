package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: pH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5899pH {

    @NotNull
    public final List<TB0> a;

    @NotNull
    public final List<Pair<LW0<? extends Object, ?>, Class<? extends Object>>> b;

    @NotNull
    public final List<Pair<InterfaceC5122lc0<? extends Object>, Class<? extends Object>>> c;

    @NotNull
    public final List<InterfaceC8038zU> d;

    /* JADX INFO: renamed from: pH$a */
    public static final class a {
        public final ArrayList a;
        public final ArrayList b;
        public final ArrayList c;
        public final ArrayList d;

        public a(@NotNull C5899pH registry) {
            Intrinsics.checkNotNullParameter(registry, "registry");
            this.a = CollectionsKt.f0(registry.a);
            this.b = CollectionsKt.f0(registry.b);
            this.c = CollectionsKt.f0(registry.c);
            this.d = CollectionsKt.f0(registry.d);
        }

        @NotNull
        public final void a(@NotNull InterfaceC5122lc0 fetcher, @NotNull Class type) {
            Intrinsics.checkNotNullParameter(fetcher, "fetcher");
            Intrinsics.checkNotNullParameter(type, "type");
            this.c.add(new Pair(fetcher, type));
        }

        @NotNull
        public final void b(@NotNull LW0 mapper, @NotNull Class type) {
            Intrinsics.checkNotNullParameter(mapper, "mapper");
            Intrinsics.checkNotNullParameter(type, "type");
            this.b.add(new Pair(mapper, type));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5899pH(List<? extends TB0> list, List<? extends Pair<? extends LW0<? extends Object, ?>, ? extends Class<? extends Object>>> list2, List<? extends Pair<? extends InterfaceC5122lc0<? extends Object>, ? extends Class<? extends Object>>> list3, List<? extends InterfaceC8038zU> list4) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
    }
}
