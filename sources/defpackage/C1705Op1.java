package defpackage;

import io.jsonwebtoken.JwtParser;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Op1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1705Op1 implements SK0 {

    @NotNull
    public final ClassLoader a;

    @NotNull
    public final C0783Cv b;

    public C1705Op1(@NotNull ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        this.a = classLoader;
        this.b = new C0783Cv();
    }

    @Override // defpackage.SK0
    @Nullable
    public final SK0.a.b a(@NotNull QC classId, @NotNull C7793yI0 jvmMetadataVersion) {
        C1627Np1 c1627Np1A;
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(jvmMetadataVersion, "jvmMetadataVersion");
        String strB = classId.b.b();
        Intrinsics.checkNotNullExpressionValue(strB, "asString(...)");
        String strL = d.l(strB, JwtParser.SEPARATOR_CHAR, '$');
        C1758Ph0 c1758Ph0 = classId.a;
        if (!c1758Ph0.d()) {
            strL = c1758Ph0 + JwtParser.SEPARATOR_CHAR + strL;
        }
        Class clsI = Nm2.i(this.a, strL);
        if (clsI == null || (c1627Np1A = C1627Np1.a.a(clsI)) == null) {
            return null;
        }
        return new SK0.a.b(c1627Np1A);
    }
}
