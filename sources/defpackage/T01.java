package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class T01 extends AbstractC4885kU implements S01 {

    @NotNull
    public final C2720aS0 g;

    @NotNull
    public final RK0 h;

    @NotNull
    public final C5863p60 i;

    @NotNull
    public final InterfaceC5962pb1 j;

    @Nullable
    public R01 k;

    @Nullable
    public InterfaceC2548Za1 l;
    public final boolean m;

    @NotNull
    public final UY0<C1758Ph0, InterfaceC5752ob1> n;

    @NotNull
    public final KW1 o;

    public T01() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T01(C5638o21 moduleName, C2720aS0 storageManager, RK0 builtIns, int i) {
        super(InterfaceC2396Xc.a.a, moduleName);
        C5863p60 capabilities = PW0.c();
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        this.g = storageManager;
        this.h = builtIns;
        if (!moduleName.e) {
            throw new IllegalArgumentException("Module name must be special: " + moduleName);
        }
        this.i = capabilities;
        InterfaceC5962pb1.a.getClass();
        g0(InterfaceC5962pb1.a.b);
        this.j = InterfaceC5962pb1.b.b;
        this.m = true;
        this.n = storageManager.e(new C4175hJ0(this, 2));
        this.o = XO0.b(new LI0(this, 4));
    }

    @Override // defpackage.S01
    @NotNull
    public final InterfaceC5752ob1 A0(@NotNull C1758Ph0 fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        T0();
        return (InterfaceC5752ob1) ((C2720aS0.k) this.n).invoke(fqName);
    }

    @Override // defpackage.S01
    public final boolean M(@NotNull S01 targetModule) {
        Intrinsics.checkNotNullParameter(targetModule, "targetModule");
        if (equals(targetModule)) {
            return true;
        }
        R01 r01 = this.k;
        Intrinsics.checkNotNull(r01);
        return CollectionsKt.z(r01.b, targetModule) || ((C5653o60) y0()).contains(targetModule) || targetModule.y0().contains(this);
    }

    public final void T0() {
        if (this.m) {
            return;
        }
        Q01<Object> q01 = C6304rC0.a;
        Intrinsics.checkNotNullParameter(this, "<this>");
        g0(C6304rC0.a);
        String message = "Accessing invalid module descriptor " + this;
        Intrinsics.checkNotNullParameter(message, "message");
        throw new C6095qC0(message);
    }

    public final void U0(@NotNull T01... descriptors) {
        Intrinsics.checkNotNullParameter(descriptors, "descriptors");
        List descriptors2 = C1526Mj.F(descriptors);
        Intrinsics.checkNotNullParameter(descriptors2, "descriptors");
        C6702t60 friends = C6702t60.d;
        Intrinsics.checkNotNullParameter(descriptors2, "descriptors");
        Intrinsics.checkNotNullParameter(friends, "friends");
        R01 dependencies = new R01(descriptors2, friends, C5653o60.d, friends);
        Intrinsics.checkNotNullParameter(dependencies, "dependencies");
        this.k = dependencies;
    }

    @Override // defpackage.InterfaceC4675jU
    @Nullable
    public final InterfaceC4675jU e() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC4675jU
    @Nullable
    public final <R, D> R e0(@NotNull InterfaceC5518nU<R, D> visitor, D d) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        StringBuilder builder = (StringBuilder) d;
        Intrinsics.checkNotNullParameter(this, "descriptor");
        Intrinsics.checkNotNullParameter(builder, "builder");
        C2964bZ.this.Q(this, builder, true);
        return (R) Unit.a;
    }

    @Override // defpackage.S01
    @Nullable
    public final <T> T g0(@NotNull Q01<T> capability) {
        Intrinsics.checkNotNullParameter(capability, "capability");
        this.i.getClass();
        return null;
    }

    @Override // defpackage.S01
    @NotNull
    public final Collection<C1758Ph0> o(@NotNull C1758Ph0 fqName, @NotNull Function1<? super C5638o21, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        T0();
        T0();
        return ((IH) this.o.getValue()).o(fqName, nameFilter);
    }

    @Override // defpackage.S01
    @NotNull
    public final RK0 t() {
        return this.h;
    }

    @Override // defpackage.AbstractC4885kU
    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC4885kU.N0(this));
        if (!this.m) {
            sb.append(" !isValid");
        }
        sb.append(" packageFragmentProvider: ");
        InterfaceC2548Za1 interfaceC2548Za1 = this.l;
        sb.append(interfaceC2548Za1 != null ? interfaceC2548Za1.getClass().getSimpleName() : null);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // defpackage.S01
    @NotNull
    public final List<S01> y0() {
        R01 r01 = this.k;
        if (r01 != null) {
            return r01.c;
        }
        StringBuilder sb = new StringBuilder("Dependencies of module ");
        String str = getName().d;
        Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
        sb.append(str);
        sb.append(" were not set");
        throw new AssertionError(sb.toString());
    }
}
