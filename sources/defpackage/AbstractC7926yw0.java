package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: yw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7926yw0 {

    /* JADX INFO: renamed from: yw0$a */
    public static final class a {

        @Nullable
        public final XY0 a;
        public final boolean b;

        @NotNull
        public final DS c;
        public final boolean d;

        public a(@Nullable XY0 xy0, boolean z, @NotNull DS dataSource, boolean z2) {
            Intrinsics.checkNotNullParameter(dataSource, "dataSource");
            this.a = xy0;
            this.b = z;
            this.c = dataSource;
            this.d = z2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.a(this.a, aVar.a) && this.b == aVar.b && Intrinsics.a(this.c, aVar.c) && this.d == aVar.d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v8, types: [int] */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r3v1, types: [int] */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r3v4 */
        public final int hashCode() {
            XY0 xy0 = this.a;
            int iHashCode = (xy0 != null ? xy0.hashCode() : 0) * 31;
            boolean z = this.b;
            ?? r3 = z;
            if (z) {
                r3 = 1;
            }
            int i = (iHashCode + r3) * 31;
            DS ds = this.c;
            int iHashCode2 = (i + (ds != null ? ds.hashCode() : 0)) * 31;
            boolean z2 = this.d;
            return iHashCode2 + (z2 ? 1 : z2);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Metadata(memoryCacheKey=");
            sb.append(this.a);
            sb.append(", isSampled=");
            sb.append(this.b);
            sb.append(", dataSource=");
            sb.append(this.c);
            sb.append(", isPlaceholderMemoryCacheKeyPresent=");
            return C2983be.b(sb, this.d, ")");
        }
    }

    @NotNull
    public abstract C7716xw0 a();
}
