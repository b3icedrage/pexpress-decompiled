package defpackage;

import io.jsonwebtoken.JwtParser;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class W91 {

    @NotNull
    public static final a a = new a();

    public static final class a {
        public static W91 a(C0935Et1 c0935Et1) {
            Object objA;
            C0857Dt1 c0857Dt1 = c0935Et1.a;
            String str = c0857Dt1.d.a.d;
            boolean zG = c0857Dt1.g();
            C0857Dt1 c0857Dt2 = c0935Et1.a;
            int i = c0857Dt2.h;
            if (!zG) {
                return new b(EK.e(i, "http_"), str, Integer.valueOf(i), null, 8);
            }
            try {
                C1717Ot1.a aVar = C1717Ot1.e;
                objA = b(c0857Dt2.j.h("set-cookie"));
            } catch (Throwable th) {
                C1717Ot1.a aVar2 = C1717Ot1.e;
                objA = C1795Pt1.a(th);
            }
            Throwable thA = C1717Ot1.a(objA);
            if (thA != null) {
                return new b("unreadable_headers", str, Integer.valueOf(i), thA);
            }
            String str2 = (String) objA;
            if (str2 != null) {
                return new c(str2, str);
            }
            return new b("no_domain_cookie", str, Integer.valueOf(i), null, 8);
        }

        public static String b(List list) {
            Object next;
            String strV;
            String strX;
            List listR;
            List listB0;
            String strJ;
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!StringsKt.C((String) next, "domain=", false));
            String str = (String) next;
            if (str == null || (strV = StringsKt.V(str, "domain=", str)) == null || (strX = StringsKt.X(strV, ';')) == null || (listR = StringsKt.R(strX, new char[]{JwtParser.SEPARATOR_CHAR})) == null || (listB0 = CollectionsKt.b0(2, listR)) == null || (strJ = CollectionsKt.J(listB0, ".", null, null, null, 62)) == null || StringsKt.I(strJ)) {
                return null;
            }
            return strJ;
        }
    }

    public static final class c extends W91 {

        @NotNull
        public final String b;

        @Nullable
        public final String c;

        public c(@NotNull String domain, @Nullable String str) {
            Intrinsics.checkNotNullParameter(domain, "domain");
            this.b = domain;
            this.c = str;
        }

        @Override // defpackage.W91
        @Nullable
        public final String a() {
            return this.c;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.a(this.b, cVar.b) && Intrinsics.a(this.c, cVar.c);
        }

        public final int hashCode() {
            int iHashCode = this.b.hashCode() * 31;
            String str = this.c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Resolved(domain=");
            sb.append(this.b);
            sb.append(", finalHost=");
            return C5807oq.b(sb, this.c, ")");
        }
    }

    @Nullable
    public abstract String a();

    public static final class b extends W91 {

        @NotNull
        public final String b;

        @Nullable
        public final String c;

        @Nullable
        public final Integer d;

        @Nullable
        public final Throwable e;

        public b(@NotNull String kind, @Nullable String str, @Nullable Integer num, @Nullable Throwable th) {
            Intrinsics.checkNotNullParameter(kind, "kind");
            this.b = kind;
            this.c = str;
            this.d = num;
            this.e = th;
        }

        @Override // defpackage.W91
        @Nullable
        public final String a() {
            return this.c;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.a(this.b, bVar.b) && Intrinsics.a(this.c, bVar.c) && Intrinsics.a(this.d, bVar.d) && Intrinsics.a(this.e, bVar.e);
        }

        public final int hashCode() {
            int iHashCode = this.b.hashCode() * 31;
            String str = this.c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.d;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Throwable th = this.e;
            return iHashCode3 + (th != null ? th.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "Failed(kind=" + this.b + ", finalHost=" + this.c + ", httpStatus=" + this.d + ", cause=" + this.e + ")";
        }

        public /* synthetic */ b(String str, String str2, Integer num, Exception exc, int i) {
            this(str, str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : exc);
        }
    }
}
