package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: dr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3449dr<T> implements InterfaceC7750y51<T> {

    @NotNull
    public final InterfaceC7014uc0<T> a;

    /* JADX WARN: Multi-variable type inference failed */
    public C3449dr(@NotNull InterfaceC7014uc0<? super T> directive) {
        Intrinsics.checkNotNullParameter(directive, "directive");
        this.a = directive;
    }

    @Override // defpackage.InterfaceC1132Hh0
    @NotNull
    public final InterfaceC1210Ih0<T> a() {
        return this.a.a();
    }

    @Override // defpackage.InterfaceC1132Hh0
    @NotNull
    public final C7436wc1<T> b() {
        return this.a.b();
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof C3449dr) {
            return Intrinsics.a(this.a, ((C3449dr) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "BasicFormatStructure(" + this.a + ')';
    }
}
