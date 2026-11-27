package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class M51 implements MH1 {

    @NotNull
    public static final M51 a = new M51();

    @NotNull
    public static final RS1.d b = RS1.d.a;

    @NotNull
    public static final String c = "kotlin.Nothing";

    @Override // defpackage.MH1
    @NotNull
    public final String a() {
        return c;
    }

    @Override // defpackage.MH1
    public final boolean c() {
        return false;
    }

    @Override // defpackage.MH1
    public final int d(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // defpackage.MH1
    public final int e() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        return this == obj;
    }

    @Override // defpackage.MH1
    @NotNull
    public final String f(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // defpackage.MH1
    @NotNull
    public final List<Annotation> g(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // defpackage.MH1
    @NotNull
    public final VH1 h() {
        return b;
    }

    public final int hashCode() {
        return (b.hashCode() * 31) + c.hashCode();
    }

    @Override // defpackage.MH1
    @NotNull
    public final MH1 i(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // defpackage.MH1
    public final boolean j(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // defpackage.MH1
    @NotNull
    public final List<Annotation> k() {
        return C5653o60.d;
    }

    @Override // defpackage.MH1
    public final boolean m() {
        return false;
    }

    @NotNull
    public final String toString() {
        return "NothingSerialDescriptor";
    }
}
