package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: gl2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4062gl2 {
    @NotNull
    public static final MH1 a(@NotNull MH1 descriptor, @NotNull WH1 module) {
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        Intrinsics.checkNotNullParameter(module, "module");
        if (!Intrinsics.a(descriptor.h(), VH1.a.a)) {
            return descriptor.m() ? a(descriptor.i(0), module) : descriptor;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        RI0 ri0D = C6621sj.d(descriptor);
        if (ri0D == null) {
            return descriptor;
        }
        module.f(ri0D, C5653o60.d);
        return descriptor;
    }

    @NotNull
    public static final EnumC3852fl2 b(@NotNull AbstractC5267mG0 abstractC5267mG0, @NotNull MH1 desc) {
        Intrinsics.checkNotNullParameter(abstractC5267mG0, "<this>");
        Intrinsics.checkNotNullParameter(desc, "desc");
        VH1 vh1H = desc.h();
        if (vh1H instanceof AbstractC7448wf1) {
            return EnumC3852fl2.POLY_OBJ;
        }
        if (Intrinsics.a(vh1H, RS1.b.a)) {
            return EnumC3852fl2.LIST;
        }
        if (!Intrinsics.a(vh1H, RS1.c.a)) {
            return EnumC3852fl2.OBJ;
        }
        MH1 mh1A = a(desc.i(0), abstractC5267mG0.b);
        VH1 vh1H2 = mh1A.h();
        if ((vh1H2 instanceof AbstractC5356mh1) || Intrinsics.a(vh1H2, VH1.b.a)) {
            return EnumC3852fl2.MAP;
        }
        if (abstractC5267mG0.a.d) {
            return EnumC3852fl2.LIST;
        }
        throw C1874Qu.c(mh1A);
    }
}
