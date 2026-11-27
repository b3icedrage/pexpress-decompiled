package defpackage;

import io.jsonwebtoken.JwtParser;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: vp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7275vp1 {

    @NotNull
    public final ClassLoader a;

    public C7275vp1(@NotNull ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        this.a = classLoader;
    }

    @Nullable
    public final C7065up1 a(@NotNull C3740fE0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        QC qc = request.a;
        String strB = qc.b.b();
        Intrinsics.checkNotNullExpressionValue(strB, "asString(...)");
        String strL = d.l(strB, JwtParser.SEPARATOR_CHAR, '$');
        C1758Ph0 c1758Ph0 = qc.a;
        if (!c1758Ph0.d()) {
            strL = c1758Ph0.b() + JwtParser.SEPARATOR_CHAR + strL;
        }
        Class clsI = Nm2.i(this.a, strL);
        if (clsI != null) {
            return new C7065up1(clsI);
        }
        return null;
    }
}
