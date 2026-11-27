package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class KC {

    @NotNull
    public static final Set<QC> c;

    @NotNull
    public final C6163qZ a;

    @NotNull
    public final VY0 b;

    public static final class a {

        @NotNull
        public final QC a;

        @Nullable
        public final BC b;

        public a(@NotNull QC classId, @Nullable BC bc) {
            Intrinsics.checkNotNullParameter(classId, "classId");
            this.a = classId;
            this.b = bc;
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj instanceof a) {
                return Intrinsics.a(this.a, ((a) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    static {
        C1758Ph0 topLevelFqName = C4194hP1.a.c.g();
        Intrinsics.checkNotNullExpressionValue(topLevelFqName, "toSafe(...)");
        Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
        C1758Ph0 c1758Ph0E = topLevelFqName.e();
        c = C5487nJ1.b(new QC(c1758Ph0E, SI0.a(c1758Ph0E, "parent(...)", topLevelFqName, "shortName(...)")));
    }

    public KC(@NotNull C6163qZ components) {
        Intrinsics.checkNotNullParameter(components, "components");
        this.a = components;
        this.b = components.a.f(new JC(this, 0));
    }

    @Nullable
    public final FC a(@NotNull QC classId, @Nullable BC bc) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        return (FC) this.b.invoke(new a(classId, bc));
    }
}
