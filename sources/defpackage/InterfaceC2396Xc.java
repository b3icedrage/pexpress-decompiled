package defpackage;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Xc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC2396Xc extends Iterable<InterfaceC1583Nc>, InterfaceC6745tJ0 {

    /* JADX INFO: renamed from: Xc$a */
    public static final class a {

        @NotNull
        public static final C0193a a = new C0193a();

        /* JADX INFO: renamed from: Xc$a$a, reason: collision with other inner class name */
        public static final class C0193a implements InterfaceC2396Xc {
            @Override // defpackage.InterfaceC2396Xc
            public final boolean P(C1758Ph0 c1758Ph0) {
                return b.b(this, c1758Ph0);
            }

            @Override // defpackage.InterfaceC2396Xc
            public final boolean isEmpty() {
                return true;
            }

            @Override // java.lang.Iterable
            public final Iterator<InterfaceC1583Nc> iterator() {
                C5653o60.d.getClass();
                return C5443n60.d;
            }

            @Override // defpackage.InterfaceC2396Xc
            public final InterfaceC1583Nc p(C1758Ph0 fqName) {
                Intrinsics.checkNotNullParameter(fqName, "fqName");
                return null;
            }

            public final String toString() {
                return "EMPTY";
            }
        }
    }

    /* JADX INFO: renamed from: Xc$b */
    public static final class b {
        @Nullable
        public static InterfaceC1583Nc a(@NotNull InterfaceC2396Xc interfaceC2396Xc, @NotNull C1758Ph0 fqName) {
            InterfaceC1583Nc next;
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            Iterator<InterfaceC1583Nc> it = interfaceC2396Xc.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (Intrinsics.a(next.c(), fqName)) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        public static boolean b(@NotNull InterfaceC2396Xc interfaceC2396Xc, @NotNull C1758Ph0 fqName) {
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            return interfaceC2396Xc.p(fqName) != null;
        }
    }

    boolean P(@NotNull C1758Ph0 c1758Ph0);

    boolean isEmpty();

    @Nullable
    InterfaceC1583Nc p(@NotNull C1758Ph0 c1758Ph0);
}
