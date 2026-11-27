package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: jC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4622jC0 implements InterfaceC6494s62, InterfaceC4832kC0 {

    @Nullable
    public AbstractC4649jL0 a;

    @NotNull
    public final LinkedHashSet<AbstractC4649jL0> b;
    public final int c;

    /* JADX INFO: renamed from: jC0$a */
    public static final class a<T> implements Comparator {
        public final /* synthetic */ Function1 a;

        public a(Function1 function1) {
            this.a = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            AbstractC4649jL0 abstractC4649jL0 = (AbstractC4649jL0) t;
            Intrinsics.checkNotNull(abstractC4649jL0);
            Function1 function1 = this.a;
            String string = function1.invoke(abstractC4649jL0).toString();
            AbstractC4649jL0 abstractC4649jL1 = (AbstractC4649jL0) t2;
            Intrinsics.checkNotNull(abstractC4649jL1);
            return BG.a(string, function1.invoke(abstractC4649jL1).toString());
        }
    }

    public C4622jC0() {
        throw null;
    }

    public C4622jC0(@NotNull AbstractCollection typesToIntersect) {
        Intrinsics.checkNotNullParameter(typesToIntersect, "typesToIntersect");
        typesToIntersect.isEmpty();
        LinkedHashSet<AbstractC4649jL0> linkedHashSet = new LinkedHashSet<>(typesToIntersect);
        this.b = linkedHashSet;
        this.c = linkedHashSet.hashCode();
    }

    @Override // defpackage.InterfaceC6494s62
    @NotNull
    public final Collection<AbstractC4649jL0> a() {
        return this.b;
    }

    @Override // defpackage.InterfaceC6494s62
    @NotNull
    public final List<H62> b() {
        return C5653o60.d;
    }

    @Override // defpackage.InterfaceC6494s62
    @Nullable
    public final InterfaceC5044lD c() {
        return null;
    }

    @Override // defpackage.InterfaceC6494s62
    public final boolean e() {
        return false;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4622jC0) {
            return Intrinsics.a(this.b, ((C4622jC0) obj).b);
        }
        return false;
    }

    @NotNull
    public final AbstractC5706oM1 g() {
        C5655o62.e.getClass();
        return C5492nL0.e(C5655o62.g, this, C5653o60.d, false, B62.a.a(this.b, "member scope for intersection type"), new C4364iC0(this, 0));
    }

    @NotNull
    public final String h(@NotNull Function1<? super AbstractC4649jL0, ? extends Object> getProperTypeRelatedToStringify) {
        Intrinsics.checkNotNullParameter(getProperTypeRelatedToStringify, "getProperTypeRelatedToStringify");
        return CollectionsKt.J(CollectionsKt.Z(this.b, new a(getProperTypeRelatedToStringify)), " & ", "{", "}", new C3944gC0(getProperTypeRelatedToStringify, 0), 24);
    }

    public final int hashCode() {
        return this.c;
    }

    @Override // defpackage.InterfaceC6494s62
    @NotNull
    public final RK0 t() {
        RK0 rk0T = this.b.iterator().next().V0().t();
        Intrinsics.checkNotNullExpressionValue(rk0T, "getBuiltIns(...)");
        return rk0T;
    }

    @NotNull
    public final String toString() {
        return h(C4154hC0.e);
    }
}
