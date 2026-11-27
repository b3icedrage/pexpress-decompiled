package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7583xI0 {

    /* JADX INFO: renamed from: xI0$a */
    public static final class a extends AbstractC7583xI0 {

        @NotNull
        public final String a;

        @NotNull
        public final String b;

        public a(@NotNull String name, @NotNull String desc) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            this.a = name;
            this.b = desc;
        }

        @Override // defpackage.AbstractC7583xI0
        @NotNull
        public final String a() {
            return this.a + ':' + this.b;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.a(this.a, aVar.a) && Intrinsics.a(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }
    }

    /* JADX INFO: renamed from: xI0$b */
    public static final class b extends AbstractC7583xI0 {

        @NotNull
        public final String a;

        @NotNull
        public final String b;

        public b(@NotNull String name, @NotNull String desc) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            this.a = name;
            this.b = desc;
        }

        @Override // defpackage.AbstractC7583xI0
        @NotNull
        public final String a() {
            return this.a + this.b;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.a(this.a, bVar.a) && Intrinsics.a(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }
    }

    @NotNull
    public abstract String a();

    @NotNull
    public final String toString() {
        return a();
    }
}
