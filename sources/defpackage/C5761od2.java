package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: od2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5761od2 {

    @NotNull
    public static final C5761od2 b = new C5761od2(C5653o60.d);

    @NotNull
    public final List<C5368mk1> a;

    /* JADX INFO: renamed from: od2$a */
    public static final class a {
        @NotNull
        public static C5761od2 a(@NotNull C5578nk1 table) {
            Intrinsics.checkNotNullParameter(table, "table");
            if (table.e.size() == 0) {
                return C5761od2.b;
            }
            List<C5368mk1> list = table.e;
            Intrinsics.checkNotNullExpressionValue(list, "getRequirementList(...)");
            return new C5761od2(list);
        }
    }

    public C5761od2(List<C5368mk1> list) {
        this.a = list;
    }
}
