package defpackage;

import io.jsonwebtoken.JwtParser;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class QC {

    @NotNull
    public final C1758Ph0 a;

    @NotNull
    public final C1758Ph0 b;
    public final boolean c;

    public static final class a {
        @NotNull
        public static QC a(@NotNull String string, boolean z) {
            String strM;
            Intrinsics.checkNotNullParameter(string, "string");
            int iF = StringsKt.F('`', 0, 6, string);
            if (iF == -1) {
                iF = string.length();
            }
            int iK = StringsKt.K(iF, 4, string, "/");
            String str = "";
            if (iK == -1) {
                strM = d.m(string, "`", "");
            } else {
                String strSubstring = string.substring(0, iK);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                String strL = d.l(strSubstring, '/', JwtParser.SEPARATOR_CHAR);
                String strSubstring2 = string.substring(iK + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                strM = d.m(strSubstring2, "`", "");
                str = strL;
            }
            return new QC(new C1758Ph0(str), new C1758Ph0(strM), z);
        }

        @NotNull
        public static QC b(@NotNull C1758Ph0 topLevelFqName) {
            Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
            C1758Ph0 c1758Ph0E = topLevelFqName.e();
            return new QC(c1758Ph0E, SI0.a(c1758Ph0E, "parent(...)", topLevelFqName, "shortName(...)"));
        }
    }

    public QC(@NotNull C1758Ph0 packageFqName, @NotNull C1758Ph0 relativeClassName, boolean z) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(relativeClassName, "relativeClassName");
        this.a = packageFqName;
        this.b = relativeClassName;
        this.c = z;
        relativeClassName.d();
    }

    public static final String c(C1758Ph0 c1758Ph0) {
        String strB = c1758Ph0.b();
        Intrinsics.checkNotNullExpressionValue(strB, "asString(...)");
        return StringsKt.D(strB, '/') ? C1742Pc.d('`', "`", strB) : strB;
    }

    @NotNull
    public final C1758Ph0 a() {
        C1758Ph0 c1758Ph0 = this.a;
        boolean zD = c1758Ph0.d();
        C1758Ph0 c1758Ph1 = this.b;
        if (zD) {
            return c1758Ph1;
        }
        return new C1758Ph0(c1758Ph0.b() + JwtParser.SEPARATOR_CHAR + c1758Ph1.b());
    }

    @NotNull
    public final String b() {
        C1758Ph0 c1758Ph0 = this.a;
        boolean zD = c1758Ph0.d();
        C1758Ph0 c1758Ph1 = this.b;
        if (zD) {
            return c(c1758Ph1);
        }
        StringBuilder sb = new StringBuilder();
        String strB = c1758Ph0.b();
        Intrinsics.checkNotNullExpressionValue(strB, "asString(...)");
        sb.append(d.l(strB, JwtParser.SEPARATOR_CHAR, '/'));
        sb.append("/");
        sb.append(c(c1758Ph1));
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public final QC d(@NotNull C5638o21 name) {
        Intrinsics.checkNotNullParameter(name, "name");
        C1758Ph0 c1758Ph0C = this.b.c(name);
        Intrinsics.checkNotNullExpressionValue(c1758Ph0C, "child(...)");
        return new QC(this.a, c1758Ph0C, this.c);
    }

    @Nullable
    public final QC e() {
        C1758Ph0 c1758Ph0E = this.b.e();
        Intrinsics.checkNotNullExpressionValue(c1758Ph0E, "parent(...)");
        if (c1758Ph0E.d()) {
            return null;
        }
        return new QC(this.a, c1758Ph0E, this.c);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QC)) {
            return false;
        }
        QC qc = (QC) obj;
        return Intrinsics.a(this.a, qc.a) && Intrinsics.a(this.b, qc.b) && this.c == qc.c;
    }

    @NotNull
    public final C5638o21 f() {
        C5638o21 c5638o21F = this.b.f();
        Intrinsics.checkNotNullExpressionValue(c5638o21F, "shortName(...)");
        return c5638o21F;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        if (!this.a.d()) {
            return b();
        }
        return "/" + b();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public QC(@NotNull C1758Ph0 packageFqName, @NotNull C5638o21 topLevelName) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(topLevelName, "topLevelName");
        C1758Ph0 c1758Ph0J = C1758Ph0.j(topLevelName);
        Intrinsics.checkNotNullExpressionValue(c1758Ph0J, "topLevel(...)");
        this(packageFqName, c1758Ph0J, false);
    }
}
