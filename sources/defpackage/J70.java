package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class J70 implements QY0 {

    @NotNull
    public final String b;

    public J70(@NotNull K70 kind, @NotNull String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        String str = kind.d;
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        String str2 = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        this.b = str2;
    }

    @Override // defpackage.QY0
    @NotNull
    public Set<C5638o21> a() {
        return C6702t60.d;
    }

    @Override // defpackage.QY0
    @NotNull
    public Set<C5638o21> c() {
        return C6702t60.d;
    }

    @Override // defpackage.InterfaceC2602Zs1
    @NotNull
    public Collection<InterfaceC4675jU> e(@NotNull LY kindFilter, @NotNull Function1<? super C5638o21, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return C5653o60.d;
    }

    @Override // defpackage.InterfaceC2602Zs1
    @NotNull
    public InterfaceC5044lD f(@NotNull C5638o21 name, @NotNull JT0 location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        A70[] a70Arr = A70.d;
        String str = String.format("<Error class: %s>", Arrays.copyOf(new Object[]{name}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        C5638o21 c5638o21M = C5638o21.m(str);
        Intrinsics.checkNotNullExpressionValue(c5638o21M, "special(...)");
        return new C7757y70(c5638o21M);
    }

    @Override // defpackage.QY0
    @NotNull
    public Set<C5638o21> g() {
        return C6702t60.d;
    }

    @Override // defpackage.QY0
    @NotNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Set d(@NotNull C5638o21 name, @NotNull S41 location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        C7757y70 containingDeclaration = R70.c;
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        InterfaceC2396Xc.a.C0193a c0193a = InterfaceC2396Xc.a.a;
        A70[] a70Arr = A70.d;
        B70 b70 = new B70(containingDeclaration, null, c0193a, C5638o21.m("<Error function>"), InterfaceC1490Lx.a.d, VN1.a);
        C5653o60 c5653o60 = C5653o60.d;
        b70.Y0(null, null, c5653o60, c5653o60, c5653o60, R70.c(Q70.RETURN_TYPE_FOR_FUNCTION, new String[0]), C01.h, C5323mZ.e);
        return C5487nJ1.b(b70);
    }

    @Override // defpackage.QY0
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set b(@NotNull C5638o21 name, @NotNull S41 location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return R70.f;
    }

    @NotNull
    public String toString() {
        return C1039Gc0.e(new StringBuilder("ErrorScope{"), this.b, '}');
    }
}
