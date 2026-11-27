package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ey0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0949Ey0 implements InterfaceC0715By0 {

    @NotNull
    public final InterfaceC1442Lg1 a;

    public C0949Ey0(@NotNull InterfaceC1442Lg1 preferencesRepository) {
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.a = preferencesRepository;
    }

    @Override // defpackage.InterfaceC0715By0
    @Nullable
    public final Object a(@NotNull String str, @NotNull String str2, @NotNull C5202ly0 c5202ly0) {
        Object objB = this.a.b(new C0793Cy0(str), new C0871Dy0(str2, null), c5202ly0);
        return objB == MN.d ? objB : Unit.a;
    }

    @Override // defpackage.InterfaceC0715By0
    @NotNull
    public final InterfaceC6396rf0<String> b(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.a.a(new C0793Cy0(name));
    }

    @Override // defpackage.InterfaceC0715By0
    @Nullable
    public final Object c(@NotNull String str, @NotNull C4989ky0 c4989ky0) {
        Object objC = this.a.c(C5487nJ1.b(new C0793Cy0(str)), c4989ky0);
        return objC == MN.d ? objC : Unit.a;
    }
}
