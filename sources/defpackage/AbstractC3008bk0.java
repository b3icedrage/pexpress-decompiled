package defpackage;

import io.jsonwebtoken.JwtParser;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: bk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3008bk0 {

    @NotNull
    public final C1758Ph0 a;

    @NotNull
    public final String b;

    /* JADX INFO: renamed from: bk0$a */
    public static final class a extends AbstractC3008bk0 {

        @NotNull
        public static final a c = new a(C4194hP1.l, "Function");
    }

    /* JADX INFO: renamed from: bk0$b */
    public static final class b extends AbstractC3008bk0 {

        @NotNull
        public static final b c = new b(C4194hP1.i, "KFunction");
    }

    /* JADX INFO: renamed from: bk0$c */
    public static final class c extends AbstractC3008bk0 {

        @NotNull
        public static final c c = new c(C4194hP1.i, "KSuspendFunction");
    }

    /* JADX INFO: renamed from: bk0$d */
    public static final class d extends AbstractC3008bk0 {

        @NotNull
        public static final d c = new d(C4194hP1.f, "SuspendFunction");
    }

    public AbstractC3008bk0(@NotNull C1758Ph0 packageFqName, @NotNull String classNamePrefix) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(classNamePrefix, "classNamePrefix");
        this.a = packageFqName;
        this.b = classNamePrefix;
    }

    @NotNull
    public final C5638o21 a(int i) {
        C5638o21 c5638o21K = C5638o21.k(this.b + i);
        Intrinsics.checkNotNullExpressionValue(c5638o21K, "identifier(...)");
        return c5638o21K;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(JwtParser.SEPARATOR_CHAR);
        return C1039Gc0.e(sb, this.b, 'N');
    }
}
