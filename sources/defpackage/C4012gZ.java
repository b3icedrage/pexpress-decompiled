package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: gZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4012gZ extends G1 {
    public final /* synthetic */ G70 e;
    public final /* synthetic */ LinkedHashSet f;
    public final /* synthetic */ boolean g;

    /* JADX INFO: renamed from: gZ$a */
    public class a implements Function1<InterfaceC1490Lx, Unit> {
        public a() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(@NotNull InterfaceC1490Lx interfaceC1490Lx) {
            InterfaceC1490Lx interfaceC1490Lx2 = interfaceC1490Lx;
            if (interfaceC1490Lx2 == null) {
                throw new IllegalArgumentException("Argument for @NotNull parameter 'descriptor' of kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1.invoke must not be null");
            }
            C4012gZ.this.e.b(interfaceC1490Lx2);
            return Unit.a;
        }
    }

    public C4012gZ(G70 g70, LinkedHashSet linkedHashSet, boolean z) {
        this.e = g70;
        this.f = linkedHashSet;
        this.g = z;
    }

    public static /* synthetic */ void w(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "fromSuper";
        } else if (i == 2) {
            objArr[0] = "fromCurrent";
        } else if (i == 3) {
            objArr[0] = "member";
        } else if (i != 4) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "overridden";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i == 1 || i == 2) {
            objArr[2] = "conflict";
        } else if (i == 3 || i == 4) {
            objArr[2] = "setOverriddenDescriptors";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // defpackage.G1
    public final void a(@NotNull InterfaceC1490Lx interfaceC1490Lx) {
        if (interfaceC1490Lx == null) {
            w(0);
            throw null;
        }
        C1346Ka1.r(interfaceC1490Lx, new a());
        this.f.add(interfaceC1490Lx);
    }

    @Override // defpackage.G1
    public final void e(@NotNull InterfaceC1490Lx interfaceC1490Lx, @NotNull InterfaceC1490Lx interfaceC1490Lx2) {
        if (interfaceC1490Lx2 != null) {
            return;
        }
        w(2);
        throw null;
    }

    @Override // defpackage.G1
    public final void u(@NotNull InterfaceC1490Lx interfaceC1490Lx, @NotNull Collection<? extends InterfaceC1490Lx> collection) {
        if (interfaceC1490Lx == null) {
            w(3);
            throw null;
        }
        if (!this.g || interfaceC1490Lx.h() == InterfaceC1490Lx.a.e) {
            super.u(interfaceC1490Lx, collection);
        }
    }
}
