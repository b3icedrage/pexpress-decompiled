package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ZZ extends WZ {

    @NotNull
    public final C7081uv k;

    @NotNull
    public final C6058q21 l;

    @NotNull
    public final C1921Rj1 m;

    @Nullable
    public C3428dk1 n;
    public C2626a00 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZZ(@NotNull C1758Ph0 fqName, @NotNull C2720aS0 storageManager, @NotNull S01 module, @NotNull C3428dk1 proto, @NotNull C7081uv metadataVersion) {
        super(module, fqName);
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "module");
        this.k = metadataVersion;
        C4057gk1 c4057gk1 = proto.h;
        Intrinsics.checkNotNullExpressionValue(c4057gk1, "getStrings(...)");
        C3847fk1 c3847fk1 = proto.i;
        Intrinsics.checkNotNullExpressionValue(c3847fk1, "getQualifiedNames(...)");
        C6058q21 c6058q21 = new C6058q21(c4057gk1, c3847fk1);
        this.l = c6058q21;
        this.m = new C1921Rj1(proto, c6058q21, metadataVersion, new XZ(this, 0));
        this.n = proto;
    }

    @Override // defpackage.WZ
    public final C1921Rj1 U0() {
        return this.m;
    }

    public final void V0(@NotNull C6163qZ components) {
        Intrinsics.checkNotNullParameter(components, "components");
        C3428dk1 c3428dk1 = this.n;
        if (c3428dk1 == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
        }
        this.n = null;
        C3218ck1 c3218ck1 = c3428dk1.j;
        Intrinsics.checkNotNullExpressionValue(c3218ck1, "getPackage(...)");
        this.o = new C2626a00(this, c3218ck1, this.l, this.k, null, components, "scope of " + this, new YZ(this, 0));
    }

    @Override // defpackage.InterfaceC2392Xa1
    @NotNull
    public final QY0 v() {
        C2626a00 c2626a00 = this.o;
        if (c2626a00 != null) {
            return c2626a00;
        }
        Intrinsics.l("_memberScope");
        throw null;
    }
}
