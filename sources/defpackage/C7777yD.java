package defpackage;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: yD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7777yD implements InterfaceC6516sD {

    @NotNull
    public final InterfaceC1442Lg1 a;

    @NotNull
    public final Set<InterfaceC7031ug1<?>> b;

    public C7777yD(@NotNull InterfaceC1442Lg1 preferencesRepository, @NotNull Set<InterfaceC7031ug1<?>> prefsSet) {
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        Intrinsics.checkNotNullParameter(prefsSet, "prefsSet");
        this.a = preferencesRepository;
        this.b = prefsSet;
    }

    @Override // defpackage.InterfaceC6516sD
    @Nullable
    public final Object a(@NotNull C6355rT0.a aVar) {
        Object objC = this.a.c(this.b, aVar);
        return objC == MN.d ? objC : Unit.a;
    }
}
