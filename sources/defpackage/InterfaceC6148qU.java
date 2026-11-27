package defpackage;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: qU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC6148qU {

    /* JADX INFO: renamed from: qU$a */
    public static final class a implements InterfaceC6148qU {

        @NotNull
        public static final a a = new a();

        @Override // defpackage.InterfaceC6148qU
        @NotNull
        public final Set<C5638o21> a() {
            return C6702t60.d;
        }

        @Override // defpackage.InterfaceC6148qU
        @Nullable
        public final IE0 b(@NotNull C5638o21 name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return null;
        }

        @Override // defpackage.InterfaceC6148qU
        public final Collection c(C5638o21 name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return C5653o60.d;
        }

        @Override // defpackage.InterfaceC6148qU
        @Nullable
        public final InterfaceC6520sE0 d(@NotNull C5638o21 name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return null;
        }

        @Override // defpackage.InterfaceC6148qU
        @NotNull
        public final Set<C5638o21> e() {
            return C6702t60.d;
        }

        @Override // defpackage.InterfaceC6148qU
        @NotNull
        public final Set<C5638o21> f() {
            return C6702t60.d;
        }
    }

    @NotNull
    Set<C5638o21> a();

    @Nullable
    IE0 b(@NotNull C5638o21 c5638o21);

    @NotNull
    Collection<InterfaceC7991zE0> c(@NotNull C5638o21 c5638o21);

    @Nullable
    InterfaceC6520sE0 d(@NotNull C5638o21 c5638o21);

    @NotNull
    Set<C5638o21> e();

    @NotNull
    Set<C5638o21> f();
}
