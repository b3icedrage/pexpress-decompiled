package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: qa1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC6168qa1 {

    /* JADX INFO: renamed from: qa1$a */
    public static final class a {

        @Nullable
        public final String a;

        @Nullable
        public final String b;

        public a(@Nullable String str, @Nullable String str2) {
            this.a = str;
            this.b = str2;
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
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("OurAnalyticsProfile(id=");
            sb.append(this.a);
            sb.append(", email=");
            return C5807oq.b(sb, this.b, ")");
        }
    }

    void c();

    void f();

    void g(@NotNull C2658a80 c2658a80);

    void h(@NotNull C7713xv0 c7713xv0);

    void i(@NotNull ApplicationC0963Fd applicationC0963Fd, @NotNull EM em, @NotNull C0807Dd c0807Dd);
}
