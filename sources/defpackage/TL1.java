package defpackage;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class TL1<T> implements InterfaceC7750y51<T> {

    @NotNull
    public final C3449dr a;

    @NotNull
    public final Set<InterfaceC0805Dc0<T>> b;

    public /* synthetic */ class a extends C2784ak0 implements Function1<T, Boolean> {
        public final /* synthetic */ TL1<T> m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(TL1<? super T> tl1) {
            super(1, Intrinsics.a.class, "checkIfAllNegative", "formatter$checkIfAllNegative(Lkotlinx/datetime/internal/format/SignedFormatStructure;Ljava/lang/Object;)Z", 0);
            this.m = tl1;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            boolean z = false;
            boolean z2 = false;
            for (InterfaceC0805Dc0<T> interfaceC0805Dc0 : this.m.b) {
                if (Intrinsics.a(interfaceC0805Dc0.a().a.get((Object) obj), Boolean.TRUE)) {
                    z2 = true;
                } else if (!interfaceC0805Dc0.b(obj)) {
                    return Boolean.valueOf(z);
                }
            }
            z = z2;
            return Boolean.valueOf(z);
        }
    }

    public static final class b extends ML0 implements Function2<T, Boolean, Unit> {
        public final /* synthetic */ TL1<T> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(TL1<? super T> tl1) {
            super(2);
            this.d = tl1;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Object obj, Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            for (InterfaceC0805Dc0<T> interfaceC0805Dc0 : this.d.b) {
                interfaceC0805Dc0.a().c(obj, Boolean.valueOf(zBooleanValue != Intrinsics.a(interfaceC0805Dc0.a().a.get((Object) obj), Boolean.TRUE)));
            }
            return Unit.a;
        }
    }

    public TL1(@NotNull C3449dr format) {
        Intrinsics.checkNotNullParameter(format, "format");
        this.a = format;
        CQ0 cq0B = VE.b();
        C3057c.b(cq0B, format);
        CQ0 cq0A = VE.a(cq0B);
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = cq0A.listIterator(0);
        while (true) {
            CQ0.c cVar = (CQ0.c) listIterator;
            if (!cVar.hasNext()) {
                break;
            }
            InterfaceC0805Dc0 interfaceC0805Dc0C = ((InterfaceC7014uc0) cVar.next()).c().c();
            if (interfaceC0805Dc0C != null) {
                arrayList.add(interfaceC0805Dc0C);
            }
        }
        Set<InterfaceC0805Dc0<T>> setH0 = CollectionsKt.h0(arrayList);
        this.b = setH0;
        if (setH0.isEmpty()) {
            throw new IllegalArgumentException("Signed format must contain at least one field with a sign");
        }
    }

    @Override // defpackage.InterfaceC1132Hh0
    @NotNull
    public final InterfaceC1210Ih0<T> a() {
        return new UL1(this.a.a.a(), new a(this));
    }

    @Override // defpackage.InterfaceC1132Hh0
    @NotNull
    public final C7436wc1<T> b() {
        return UE.h(WE.f(new C7436wc1(VE.c(new ML1(new b(this), "sign for " + this.b)), C5653o60.d), this.a.a.b()));
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof TL1) {
            return this.a.equals(((TL1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "SignedFormatStructure(" + this.a + ')';
    }
}
