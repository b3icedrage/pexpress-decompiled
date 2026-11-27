package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: sZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6582sZ {

    @NotNull
    public final C6163qZ a;

    @NotNull
    public final InterfaceC5848p21 b;

    @NotNull
    public final InterfaceC4675jU c;

    @NotNull
    public final C2656a72 d;

    @NotNull
    public final C5761od2 e;

    @NotNull
    public final AbstractC5393ms f;

    @Nullable
    public final BI0 g;

    @NotNull
    public final C7334w62 h;

    @NotNull
    public final OY0 i;

    /* JADX WARN: Code duplicated, block: B:8:0x0076  */
    public C6582sZ(@NotNull C6163qZ components, @NotNull InterfaceC5848p21 nameResolver, @NotNull InterfaceC4675jU containingDeclaration, @NotNull C2656a72 typeTable, @NotNull C5761od2 versionRequirementTable, @NotNull AbstractC5393ms metadataVersion, @Nullable BI0 bi0, @Nullable C7334w62 c7334w62, @NotNull List typeParameters) {
        String str;
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable, "versionRequirementTable");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        this.a = components;
        this.b = nameResolver;
        this.c = containingDeclaration;
        this.d = typeTable;
        this.e = versionRequirementTable;
        this.f = metadataVersion;
        this.g = bi0;
        String str2 = "Deserializer for \"" + containingDeclaration.getName() + '\"';
        if (bi0 != null) {
            str = "Class '" + bi0.c().a().b() + '\'';
            str = str == null ? "[container not found]" : str;
        }
        this.h = new C7334w62(this, c7334w62, typeParameters, str2, str);
        this.i = new OY0(this);
    }

    @NotNull
    public final C6582sZ a(@NotNull InterfaceC4675jU descriptor, @NotNull List<C4735jk1> typeParameterProtos, @NotNull InterfaceC5848p21 nameResolver, @NotNull C2656a72 typeTable, @NotNull C5761od2 versionRequirementTable, @NotNull AbstractC5393ms version) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(typeParameterProtos, "typeParameterProtos");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable, "versionRequirementTable");
        Intrinsics.checkNotNullParameter(version, "metadataVersion");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(version, "version");
        int i = version.b;
        return new C6582sZ(this.a, nameResolver, descriptor, typeTable, ((i != 1 || version.c < 4) && i <= 1) ? this.e : versionRequirementTable, version, this.g, this.h, typeParameterProtos);
    }
}
