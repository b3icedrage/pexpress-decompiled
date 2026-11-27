package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ov, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5822ov implements InterfaceC1583Nc {

    @NotNull
    public final RK0 a;

    @NotNull
    public final C1758Ph0 b;

    @NotNull
    public final Map<C5638o21, CK<?>> c;

    @NotNull
    public final Object d;

    public C5822ov(@NotNull RK0 builtIns, @NotNull C1758Ph0 fqName, @NotNull Map allValueArguments) {
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(allValueArguments, "allValueArguments");
        this.a = builtIns;
        this.b = fqName;
        this.c = allValueArguments;
        this.d = XO0.a(EnumC4403iP0.d, new C5612nv(this, 0));
    }

    @Override // defpackage.InterfaceC1583Nc
    @NotNull
    public final C1758Ph0 c() {
        return this.b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
    @Override // defpackage.InterfaceC1583Nc
    @NotNull
    public final AbstractC4649jL0 getType() {
        Object value = this.d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (AbstractC4649jL0) value;
    }

    @Override // defpackage.InterfaceC1583Nc
    @NotNull
    public final VN1 i() {
        VN1.a NO_SOURCE = VN1.a;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // defpackage.InterfaceC1583Nc
    @NotNull
    public final Map<C5638o21, CK<?>> j() {
        return this.c;
    }
}
