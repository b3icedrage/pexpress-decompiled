package defpackage;

import io.jsonwebtoken.JwtParser;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class BI0 implements MZ {

    @NotNull
    public final C6952uI0 b;

    @Nullable
    public final C6952uI0 c;

    @Nullable
    public final InterfaceC2699aL0 d;

    public BI0() {
        throw null;
    }

    public BI0(@NotNull InterfaceC2699aL0 kotlinClass, @NotNull C3218ck1 packageProto, @NotNull C8003zI0 nameResolver, @NotNull LZ abiStability) {
        Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
        Intrinsics.checkNotNullParameter(packageProto, "packageProto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(abiStability, "abiStability");
        C6952uI0 className = new C6952uI0(C6952uI0.e(kotlinClass.h()));
        Intrinsics.checkNotNullExpressionValue(className, "byClassId(...)");
        UK0 uk0A = kotlinClass.a();
        uk0A.getClass();
        C6952uI0 c6952uI0C = null;
        String str = uk0A.a == UK0.a.MULTIFILE_CLASS_PART ? uk0A.f : null;
        if (str != null && str.length() > 0) {
            c6952uI0C = C6952uI0.c(str);
        }
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(packageProto, "packageProto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(abiStability, "abiStability");
        this.b = className;
        this.c = c6952uI0C;
        this.d = kotlinClass;
        AbstractC0673Bk0.e<C3218ck1, Integer> packageModuleName = FI0.m;
        Intrinsics.checkNotNullExpressionValue(packageModuleName, "packageModuleName");
        Integer num = (Integer) C5998pk1.a(packageProto, packageModuleName);
        if (num != null) {
            nameResolver.getString(num.intValue());
        }
    }

    @Override // defpackage.VN1
    @NotNull
    public final void a() {
        WN1.a NO_SOURCE_FILE = WN1.a;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE_FILE, "NO_SOURCE_FILE");
    }

    @NotNull
    public final QC c() {
        C1758Ph0 c1758Ph0;
        C6952uI0 c6952uI0 = this.b;
        String str = c6952uI0.a;
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            c1758Ph0 = C1758Ph0.c;
            if (c1758Ph0 == null) {
                C6952uI0.a(9);
                throw null;
            }
        } else {
            c1758Ph0 = new C1758Ph0(str.substring(0, iLastIndexOf).replace('/', JwtParser.SEPARATOR_CHAR));
        }
        Intrinsics.checkNotNullExpressionValue(c1758Ph0, "getPackageFqName(...)");
        String strD = c6952uI0.d();
        Intrinsics.checkNotNullExpressionValue(strD, "getInternalName(...)");
        C5638o21 c5638o21K = C5638o21.k(StringsKt.W('/', strD, strD));
        Intrinsics.checkNotNullExpressionValue(c5638o21K, "identifier(...)");
        return new QC(c1758Ph0, c5638o21K);
    }

    @NotNull
    public final String toString() {
        return BI0.class.getSimpleName() + ": " + this.b;
    }
}
