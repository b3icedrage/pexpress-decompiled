package defpackage;

import java.util.Collection;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface QY0 extends InterfaceC2602Zs1 {

    @NotNull
    public static final a a = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();
    }

    public static final class b extends RY0 {

        @NotNull
        public static final b b = new b();

        @Override // defpackage.RY0, defpackage.QY0
        @NotNull
        public final Set<C5638o21> a() {
            return C6702t60.d;
        }

        @Override // defpackage.RY0, defpackage.QY0
        @NotNull
        public final Set<C5638o21> c() {
            return C6702t60.d;
        }

        @Override // defpackage.RY0, defpackage.QY0
        @NotNull
        public final Set<C5638o21> g() {
            return C6702t60.d;
        }
    }

    @NotNull
    Set<C5638o21> a();

    @NotNull
    Collection b(@NotNull C5638o21 c5638o21, @NotNull S41 s41);

    @NotNull
    Set<C5638o21> c();

    @NotNull
    Collection<? extends InterfaceC3765fM1> d(@NotNull C5638o21 c5638o21, @NotNull JT0 jt0);

    @Nullable
    Set<C5638o21> g();
}
