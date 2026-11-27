package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: v62, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7124v62 extends T62 {

    @NotNull
    public static final a b = new a();

    /* JADX INFO: renamed from: v62$a */
    public static final class a {
        public static C6914u62 b(a aVar, Map map) {
            aVar.getClass();
            Intrinsics.checkNotNullParameter(map, "map");
            return new C6914u62(map);
        }

        @NotNull
        public final T62 a(@NotNull InterfaceC6494s62 typeConstructor, @NotNull List<? extends N62> argumentsList) {
            Intrinsics.checkNotNullParameter(typeConstructor, "typeConstructor");
            Intrinsics.checkNotNullParameter(argumentsList, "arguments");
            List<H62> parameters = typeConstructor.b();
            Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
            H62 h62 = (H62) CollectionsKt.N(parameters);
            if (h62 == null || !h62.t0()) {
                Intrinsics.checkNotNullParameter(parameters, "parameters");
                Intrinsics.checkNotNullParameter(argumentsList, "argumentsList");
                return new C1258Ix0((H62[]) parameters.toArray(new H62[0]), (N62[]) argumentsList.toArray(new N62[0]), false);
            }
            List<H62> listB = typeConstructor.b();
            Intrinsics.checkNotNullExpressionValue(listB, "getParameters(...)");
            ArrayList arrayList = new ArrayList(XE.m(listB, 10));
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                arrayList.add(((H62) it.next()).p());
            }
            return b(this, PW0.j(CollectionsKt.j0(arrayList, argumentsList)));
        }
    }

    @Override // defpackage.T62
    @Nullable
    public final N62 e(@NotNull AbstractC4649jL0 key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return h(key.V0());
    }

    @Nullable
    public abstract N62 h(@NotNull InterfaceC6494s62 interfaceC6494s62);
}
