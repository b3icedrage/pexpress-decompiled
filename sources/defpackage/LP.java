package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class LP implements InterfaceC5518nU<PI0<?>, Unit> {

    @NotNull
    public final AbstractC5906pJ0 a;

    public LP(@NotNull AbstractC5906pJ0 container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.a = container;
    }

    @Override // defpackage.InterfaceC5518nU
    public final Object a(C0983Fj1 c0983Fj1, Object obj) {
        return d(c0983Fj1, obj);
    }

    @Override // defpackage.InterfaceC5518nU
    public final Object b(C1687Oj1 c1687Oj1, Object obj) {
        return d(c1687Oj1, obj);
    }

    @Override // defpackage.InterfaceC5518nU
    public final Object c(C0749Cj1 descriptor, Object obj) {
        Unit data = (Unit) obj;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(data, "data");
        int i = (descriptor.x != null ? 1 : 0) + (descriptor.y != null ? 1 : 0);
        boolean z = descriptor.j;
        AbstractC5906pJ0 abstractC5906pJ0 = this.a;
        if (z) {
            if (i == 0) {
                return new C8006zJ0(abstractC5906pJ0, descriptor);
            }
            if (i == 1) {
                return new BJ0(abstractC5906pJ0, descriptor);
            }
            if (i == 2) {
                return new CJ0(abstractC5906pJ0, descriptor);
            }
        } else {
            if (i == 0) {
                return new KJ0(abstractC5906pJ0, descriptor);
            }
            if (i == 1) {
                return new MJ0(abstractC5906pJ0, descriptor);
            }
            if (i == 2) {
                return new NJ0(abstractC5906pJ0, descriptor);
            }
        }
        throw new C3761fL0("Unsupported property: " + descriptor);
    }

    @Override // defpackage.InterfaceC5518nU
    public final PI0<?> d(InterfaceC2076Tj0 descriptor, Unit unit) {
        Unit data = unit;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(data, "data");
        return new C6535sJ0(this.a, descriptor);
    }

    @Override // defpackage.InterfaceC5518nU
    public Object e(AC ac, Object obj) {
        return d(ac, obj);
    }
}
