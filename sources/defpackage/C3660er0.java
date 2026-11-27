package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: er0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3660er0 {

    @NotNull
    public static final a a = new a();

    @NotNull
    public static final C2498Yk<C3660er0> b = new C2498Yk<>("RequestLifecycle");

    /* JADX INFO: renamed from: er0$a */
    public static final class a implements InterfaceC4755jq0<Unit, C3660er0> {
        @Override // defpackage.InterfaceC4755jq0
        public final void a(C3660er0 c3660er0, C1782Pp0 scope) {
            C3660er0 plugin = c3660er0;
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            Intrinsics.checkNotNullParameter(scope, "scope");
            scope.i.f(C4539ir0.f, new C3450dr0(scope, null));
        }

        @Override // defpackage.InterfaceC4755jq0
        public final C3660er0 b(Function1<? super Unit, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            return new C3660er0();
        }

        @Override // defpackage.InterfaceC4755jq0
        @NotNull
        public final C2498Yk<C3660er0> getKey() {
            return C3660er0.b;
        }
    }
}
