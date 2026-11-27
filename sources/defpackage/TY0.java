package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class TY0 {

    @NotNull
    public final String a;

    public static final class a {
        @NotNull
        public static TY0 a(@NotNull AbstractC7583xI0 signature) {
            Intrinsics.checkNotNullParameter(signature, "signature");
            if (signature instanceof AbstractC7583xI0.b) {
                AbstractC7583xI0.b bVar = (AbstractC7583xI0.b) signature;
                String name = bVar.a;
                Intrinsics.checkNotNullParameter(name, "name");
                String desc = bVar.b;
                Intrinsics.checkNotNullParameter(desc, "desc");
                return new TY0(Z0.c(name, desc));
            }
            if (!(signature instanceof AbstractC7583xI0.a)) {
                throw new C6489s51();
            }
            AbstractC7583xI0.a aVar = (AbstractC7583xI0.a) signature;
            String name2 = aVar.a;
            Intrinsics.checkNotNullParameter(name2, "name");
            String desc2 = aVar.b;
            Intrinsics.checkNotNullParameter(desc2, "desc");
            return new TY0(name2 + '#' + desc2);
        }
    }

    public TY0(String str) {
        this.a = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TY0) && Intrinsics.a(this.a, ((TY0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C1039Gc0.e(new StringBuilder("MemberSignature(signature="), this.a, ')');
    }
}
