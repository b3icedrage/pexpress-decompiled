package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class G51 {

    @NotNull
    public final C2720aS0 a;

    @NotNull
    public final S01 b;

    @NotNull
    public final UY0<C1758Ph0, InterfaceC2392Xa1> c;

    @NotNull
    public final UY0<a, FC> d;

    public static final class a {

        @NotNull
        public final QC a;

        @NotNull
        public final List<Integer> b;

        public a(@NotNull QC classId, @NotNull List<Integer> typeParametersCount) {
            Intrinsics.checkNotNullParameter(classId, "classId");
            Intrinsics.checkNotNullParameter(typeParametersCount, "typeParametersCount");
            this.a = classId;
            this.b = typeParametersCount;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.a(this.a, aVar.a) && Intrinsics.a(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "ClassRequest(classId=" + this.a + ", typeParametersCount=" + this.b + ')';
        }
    }

    public static final class b extends GC {
        public final boolean k;

        @NotNull
        public final ArrayList l;

        @NotNull
        public final ZC m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull C2720aS0 storageManager, @NotNull WC container, @NotNull C5638o21 name, boolean z, int i) {
            super(storageManager, container, name, VN1.a);
            Intrinsics.checkNotNullParameter(storageManager, "storageManager");
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(name, "name");
            this.k = z;
            IntRange intRangeI = f.i(0, i);
            ArrayList arrayList = new ArrayList(XE.m(intRangeI, 10));
            Iterator<Integer> it = intRangeI.iterator();
            while (((DB0) it).g) {
                int iB = ((CB0) it).b();
                arrayList.add(I62.Y0(this, EnumC3610ed2.INVARIANT, C5638o21.k("T" + iB), iB, storageManager));
            }
            this.l = arrayList;
            this.m = new ZC(this, C3476e.f(this), C5487nJ1.b(C4900kZ.j(this).t().e()), storageManager);
        }

        @Override // defpackage.FC, defpackage.InterfaceC5257mD
        @NotNull
        public final List<H62> A() {
            return this.l;
        }

        @Override // defpackage.GC, defpackage.GY0
        public final boolean D() {
            return false;
        }

        @Override // defpackage.FC
        public final boolean E() {
            return false;
        }

        @Override // defpackage.FC
        @Nullable
        public final Rc2<AbstractC5706oM1> F0() {
            return null;
        }

        @Override // defpackage.O01
        public final QY0 G0(AbstractC6331rL0 kotlinTypeRefiner) {
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
            return QY0.b.b;
        }

        @Override // defpackage.FC
        public final boolean I() {
            return false;
        }

        @Override // defpackage.GY0
        public final boolean M0() {
            return false;
        }

        @Override // defpackage.FC
        @NotNull
        public final Collection<FC> P() {
            return C5653o60.d;
        }

        @Override // defpackage.GY0
        public final boolean Q() {
            return false;
        }

        @Override // defpackage.FC
        public final boolean Q0() {
            return false;
        }

        @Override // defpackage.InterfaceC5257mD
        public final boolean R() {
            return this.k;
        }

        @Override // defpackage.FC
        @Nullable
        public final InterfaceC7984zC X() {
            return null;
        }

        @Override // defpackage.FC
        public final QY0 Y() {
            return QY0.b.b;
        }

        @Override // defpackage.FC
        @Nullable
        public final FC a0() {
            return null;
        }

        @Override // defpackage.FC, defpackage.GY0
        @NotNull
        public final AbstractC5533nZ d() {
            C5323mZ.h PUBLIC = C5323mZ.e;
            Intrinsics.checkNotNullExpressionValue(PUBLIC, "PUBLIC");
            return PUBLIC;
        }

        @Override // defpackage.FC
        @NotNull
        public final SC h() {
            return SC.d;
        }

        @Override // defpackage.InterfaceC0726Cc
        @NotNull
        public final InterfaceC2396Xc k() {
            return InterfaceC2396Xc.a.a;
        }

        @Override // defpackage.FC
        public final boolean m() {
            return false;
        }

        @Override // defpackage.InterfaceC5044lD
        public final InterfaceC6494s62 p() {
            return this.m;
        }

        @Override // defpackage.FC, defpackage.GY0
        @NotNull
        public final C01 q() {
            return C01.e;
        }

        @Override // defpackage.FC
        @NotNull
        public final Collection<InterfaceC7984zC> r() {
            return C6702t60.d;
        }

        @Override // defpackage.FC
        public final boolean s() {
            return false;
        }

        @NotNull
        public final String toString() {
            return "class " + getName() + " (not found)";
        }
    }

    public G51(@NotNull C2720aS0 storageManager, @NotNull S01 module) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "module");
        this.a = storageManager;
        this.b = module;
        this.c = storageManager.e(new C2769ag1(this, 2));
        this.d = storageManager.e(new BO0(this, 1));
    }

    @NotNull
    public final FC a(@NotNull QC classId, @NotNull List<Integer> typeParametersCount) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(typeParametersCount, "typeParametersCount");
        return (FC) ((C2720aS0.k) this.d).invoke(new a(classId, typeParametersCount));
    }
}
