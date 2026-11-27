package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: h81, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4141h81 implements InterfaceC3721f81 {

    @NotNull
    public final AbstractC7004uZ1 a;

    @NotNull
    public final J22 b;

    @NotNull
    public Function0<? extends KN> c;

    @NotNull
    public final GP1 d;

    /* JADX INFO: renamed from: h81$a */
    public static final class a implements Function0 {
        public static final a d = new a();

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Object invoke() {
            return null;
        }
    }

    public AbstractC4141h81(@NotNull AbstractC7004uZ1 timeSelectionsProvider, @NotNull J22 currentAssetProvider) {
        Intrinsics.checkNotNullParameter(timeSelectionsProvider, "timeSelectionsProvider");
        Intrinsics.checkNotNullParameter(currentAssetProvider, "currentAssetProvider");
        this.a = timeSelectionsProvider;
        this.b = currentAssetProvider;
        this.c = a.d;
        GP1 gp1I = C1589Ne.i(null);
        this.d = gp1I;
        C4466ii.f(gp1I);
    }

    @Override // defpackage.InterfaceC3721f81
    public final void a(@NotNull C7121v6 viewModelScopeProvider) {
        Intrinsics.checkNotNullParameter(viewModelScopeProvider, "viewModelScopeProvider");
        this.c = viewModelScopeProvider;
        KN knJ = C8056za.j((C1486Lv1) viewModelScopeProvider.e);
        if (knJ != null) {
            C5189lv.k(knJ, null, new C3931g81(this, null), 3);
        }
    }
}
