package defpackage;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Fp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1001Fp1 extends AbstractC8116zp1 implements FE0 {

    @NotNull
    public final C1758Ph0 a;

    public C1001Fp1(@NotNull C1758Ph0 fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.a = fqName;
    }

    @Override // defpackage.FE0
    @NotNull
    public final C5653o60 B() {
        return C5653o60.d;
    }

    @Override // defpackage.FE0
    @NotNull
    public final C1758Ph0 c() {
        return this.a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof C1001Fp1) {
            return Intrinsics.a(this.a, ((C1001Fp1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.WD0
    public final Collection k() {
        return C5653o60.d;
    }

    @Override // defpackage.WD0
    @Nullable
    public final QD0 p(@NotNull C1758Ph0 fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return null;
    }

    @Override // defpackage.FE0
    @NotNull
    public final C5653o60 r(@NotNull Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return C5653o60.d;
    }

    @NotNull
    public final String toString() {
        return C1001Fp1.class.getName() + ": " + this.a;
    }
}
