package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class L {
    @Nullable
    public static final TY0 a(@NotNull C3637ek1 proto, @NotNull InterfaceC5848p21 nameResolver, @NotNull C2656a72 typeTable, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        AbstractC0673Bk0.e<C3637ek1, FI0.c> propertySignature = FI0.d;
        Intrinsics.checkNotNullExpressionValue(propertySignature, "propertySignature");
        FI0.c cVar = (FI0.c) C5998pk1.a(proto, propertySignature);
        if (cVar != null) {
            if (z) {
                C1578Na0 c1578Na0 = GI0.a;
                AbstractC7583xI0.a aVarB = GI0.b(proto, nameResolver, typeTable, z3);
                if (aVarB != null) {
                    return TY0.a.a(aVarB);
                }
            } else if (z2 && (cVar.e & 2) == 2) {
                FI0.b signature = cVar.h;
                Intrinsics.checkNotNullExpressionValue(signature, "getSyntheticMethod(...)");
                Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
                Intrinsics.checkNotNullParameter(signature, "signature");
                String name = nameResolver.getString(signature.g);
                String desc = nameResolver.getString(signature.h);
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(desc, "desc");
                return new TY0(Z0.c(name, desc));
            }
        }
        return null;
    }
}
