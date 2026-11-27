package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class TB {

    @Nullable
    public final C5638o21 a;

    @Nullable
    public final Regex b;

    @Nullable
    public final Collection<C5638o21> c;

    @NotNull
    public final Function1<InterfaceC2076Tj0, String> d;

    @NotNull
    public final InterfaceC6510sB[] e;

    public TB() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TB(C5638o21 c5638o21, Regex regex, Collection<C5638o21> collection, Function1<? super InterfaceC2076Tj0, String> function1, InterfaceC6510sB... interfaceC6510sBArr) {
        this.a = c5638o21;
        this.b = regex;
        this.c = collection;
        this.d = function1;
        this.e = interfaceC6510sBArr;
    }

    public /* synthetic */ TB(C5638o21 c5638o21, InterfaceC6510sB[] interfaceC6510sBArr) {
        this(c5638o21, interfaceC6510sBArr, QB.e);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TB(@NotNull C5638o21 name, @NotNull InterfaceC6510sB[] checks, @NotNull Function1<? super InterfaceC2076Tj0, String> additionalChecks) {
        this(name, null, null, additionalChecks, (InterfaceC6510sB[]) Arrays.copyOf(checks, checks.length));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(checks, "checks");
        Intrinsics.checkNotNullParameter(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ TB(Set set, InterfaceC6510sB[] interfaceC6510sBArr) {
        this(set, interfaceC6510sBArr, SB.d);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TB(@NotNull Collection<C5638o21> nameList, @NotNull InterfaceC6510sB[] checks, @NotNull Function1<? super InterfaceC2076Tj0, String> additionalChecks) {
        this(null, null, nameList, additionalChecks, (InterfaceC6510sB[]) Arrays.copyOf(checks, checks.length));
        Intrinsics.checkNotNullParameter(nameList, "nameList");
        Intrinsics.checkNotNullParameter(checks, "checks");
        Intrinsics.checkNotNullParameter(additionalChecks, "additionalChecks");
    }
}
