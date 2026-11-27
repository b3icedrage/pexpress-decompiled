package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Gk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1063Gk0<Target, Type> extends AbstractC3897g0<Target, Type> {

    @NotNull
    public final C6833tj1 a;

    @NotNull
    public final String b;

    @Nullable
    public final Type c;

    public C1063Gk0(C6833tj1 accessor, C3997gU c3997gU, int i) {
        String name = accessor.a.getName();
        Object obj = (i & 4) != 0 ? (Type) null : c3997gU;
        Intrinsics.checkNotNullParameter(accessor, "accessor");
        Intrinsics.checkNotNullParameter(name, "name");
        this.a = accessor;
        this.b = name;
        this.c = (Type) obj;
    }

    @Override // defpackage.InterfaceC0883Ec0
    @Nullable
    public final Type a() {
        return this.c;
    }

    @Override // defpackage.InterfaceC0883Ec0
    @NotNull
    public final InterfaceC6475s2<Target, Type> b() {
        return this.a;
    }

    @Override // defpackage.InterfaceC0883Ec0
    @Nullable
    public final InterfaceC0805Dc0<Target> c() {
        return null;
    }

    @Override // defpackage.InterfaceC0883Ec0
    @NotNull
    public final String getName() {
        return this.b;
    }
}
