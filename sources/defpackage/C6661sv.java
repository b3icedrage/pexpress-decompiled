package defpackage;

import io.jsonwebtoken.JwtParser;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: sv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6661sv extends C3334dI1 {

    @NotNull
    public static final C6661sv m;

    static {
        C1578Na0 c1578Na0 = new C1578Na0();
        C0705Bv.a(c1578Na0);
        Intrinsics.checkNotNullExpressionValue(c1578Na0, "apply(...)");
        AbstractC0673Bk0.e<C3218ck1, Integer> packageFqName = C0705Bv.a;
        Intrinsics.checkNotNullExpressionValue(packageFqName, "packageFqName");
        AbstractC0673Bk0.e<C2155Uj1, List<C1999Sj1>> constructorAnnotation = C0705Bv.c;
        Intrinsics.checkNotNullExpressionValue(constructorAnnotation, "constructorAnnotation");
        AbstractC0673Bk0.e<C2077Tj1, List<C1999Sj1>> classAnnotation = C0705Bv.b;
        Intrinsics.checkNotNullExpressionValue(classAnnotation, "classAnnotation");
        AbstractC0673Bk0.e<C2575Zj1, List<C1999Sj1>> functionAnnotation = C0705Bv.d;
        Intrinsics.checkNotNullExpressionValue(functionAnnotation, "functionAnnotation");
        AbstractC0673Bk0.e<C3637ek1, List<C1999Sj1>> propertyAnnotation = C0705Bv.e;
        Intrinsics.checkNotNullExpressionValue(propertyAnnotation, "propertyAnnotation");
        AbstractC0673Bk0.e<C3637ek1, List<C1999Sj1>> propertyGetterAnnotation = C0705Bv.f;
        Intrinsics.checkNotNullExpressionValue(propertyGetterAnnotation, "propertyGetterAnnotation");
        AbstractC0673Bk0.e<C3637ek1, List<C1999Sj1>> propertySetterAnnotation = C0705Bv.g;
        Intrinsics.checkNotNullExpressionValue(propertySetterAnnotation, "propertySetterAnnotation");
        AbstractC0673Bk0.e<C2419Xj1, List<C1999Sj1>> enumEntryAnnotation = C0705Bv.i;
        Intrinsics.checkNotNullExpressionValue(enumEntryAnnotation, "enumEntryAnnotation");
        AbstractC0673Bk0.e<C3637ek1, C1999Sj1.b.c> compileTimeValue = C0705Bv.h;
        Intrinsics.checkNotNullExpressionValue(compileTimeValue, "compileTimeValue");
        AbstractC0673Bk0.e<C5155lk1, List<C1999Sj1>> parameterAnnotation = C0705Bv.j;
        Intrinsics.checkNotNullExpressionValue(parameterAnnotation, "parameterAnnotation");
        AbstractC0673Bk0.e<C4267hk1, List<C1999Sj1>> typeAnnotation = C0705Bv.k;
        Intrinsics.checkNotNullExpressionValue(typeAnnotation, "typeAnnotation");
        AbstractC0673Bk0.e<C4735jk1, List<C1999Sj1>> typeParameterAnnotation = C0705Bv.l;
        Intrinsics.checkNotNullExpressionValue(typeParameterAnnotation, "typeParameterAnnotation");
        m = new C6661sv(c1578Na0, packageFqName, constructorAnnotation, classAnnotation, functionAnnotation, propertyAnnotation, propertyGetterAnnotation, propertySetterAnnotation, enumEntryAnnotation, compileTimeValue, parameterAnnotation, typeAnnotation, typeParameterAnnotation);
    }

    @NotNull
    public static String a(@NotNull C1758Ph0 fqName) {
        String strE;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        StringBuilder sb = new StringBuilder();
        String strB = fqName.b();
        Intrinsics.checkNotNullExpressionValue(strB, "asString(...)");
        sb.append(d.l(strB, JwtParser.SEPARATOR_CHAR, '/'));
        sb.append('/');
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        StringBuilder sb2 = new StringBuilder();
        if (fqName.d()) {
            strE = "default-package";
        } else {
            strE = fqName.f().e();
            Intrinsics.checkNotNullExpressionValue(strE, "asString(...)");
        }
        sb2.append(strE);
        sb2.append(".kotlin_builtins");
        sb.append(sb2.toString());
        return sb.toString();
    }
}
