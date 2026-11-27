package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class SH1 {
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @NotNull
    public static final C5986ph1 a(@NotNull String serialName, @NotNull AbstractC5356mh1.i kind) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (StringsKt.I(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        Object obj = C6615sh1.a;
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Iterator it = C6615sh1.a.keySet().iterator();
        while (it.hasNext()) {
            String strF = ((RI0) it.next()).f();
            Intrinsics.checkNotNull(strF);
            String strA = C6615sh1.a(strF);
            if (serialName.equalsIgnoreCase("kotlin." + strA) || serialName.equalsIgnoreCase(strA)) {
                StringBuilder sbB = C6495s7.b("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", serialName, " there already exist ");
                sbB.append(C6615sh1.a(strA));
                sbB.append("Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                throw new IllegalArgumentException(DS1.b(sbB.toString()));
            }
        }
        return new C5986ph1(serialName, kind);
    }

    @NotNull
    public static final OH1 b(@NotNull String serialName, @NotNull MH1[] typeParameters, @NotNull Function1 builderAction) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        if (StringsKt.I(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        YC yc = new YC(serialName);
        builderAction.invoke(yc);
        return new OH1(serialName, RS1.a.a, yc.c.size(), C1526Mj.F(typeParameters), yc);
    }

    @NotNull
    public static final OH1 c(@NotNull String serialName, @NotNull VH1 kind, @NotNull MH1[] typeParameters, @NotNull Function1 builder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (StringsKt.I(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (Intrinsics.a(kind, RS1.a.a)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        YC yc = new YC(serialName);
        builder.invoke(yc);
        return new OH1(serialName, kind, yc.c.size(), C1526Mj.F(typeParameters), yc);
    }
}
